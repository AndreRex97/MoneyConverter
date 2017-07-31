package sg.edu.rp.c346.rpsconverter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static sg.edu.rp.c346.rpsconverter.R.drawable.indonesiaflag;

public class multi_currency extends AppCompatActivity {
    EditText etSGD, etCurrency1, etCurrency2;

    Spinner spnCurrency1, spnCurrency2;
    TextView tvInformation1, tvInformation2, tvCurrency1, tvCurrency2;
    ImageView ivFlag1, ivFlag2;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_currency);
        etSGD = (EditText)findViewById(R.id.sgdValue);
        spnCurrency1 = (Spinner)findViewById(R.id.spinnerCurrency1);
        spnCurrency2 = (Spinner)findViewById(R.id.spinnerCurrency2);
        tvInformation1 = (TextView)findViewById(R.id.currencyInformation1);
        tvInformation2 = (TextView)findViewById(R.id.currencyInformation2);
        tvCurrency1 = (TextView)findViewById(R.id.textViewCurrency1);
        tvCurrency2 = (TextView)findViewById(R.id.textViewCurrency2);
        ivFlag1 = (ImageView)findViewById(R.id.Flag1);
        ivFlag2 = (ImageView)findViewById(R.id.Flag2);
        btnReset = (Button)findViewById(R.id.buttonReset1);

        etSGD.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(etSGD.length() > 0) {
                    ivFlag1.setVisibility(View.VISIBLE);
                    ivFlag2.setVisibility(View.VISIBLE);
                    if(spnCurrency1.getSelectedItemId() == 0) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 9530.87 * value1;
                        Log.i("TEST", "onKey");
                        tvCurrency1.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag1.setImageResource(indonesiaflag);
                        tvInformation1.setText("1 Singapore Dollar equals to 9530.87 Rupiah");
                    } else if (spnCurrency1.getSelectedItemPosition() == 1) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 47.83 * value1;
                        tvCurrency1.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag1.setImageResource(R.drawable.indiaflag);
                        tvInformation1.setText("1 Singapore Dollar equals to 47.83 Rupee");
                    } else if (spnCurrency1.getSelectedItemId() == 2) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 3.07 * value1;
                        tvCurrency1.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag1.setImageResource(R.drawable.malaysiaflag);
                        tvInformation1.setText("1 Singapore Dollar equals to 3.07 Ringgit");
                    } else if (spnCurrency1.getSelectedItemId() == 3) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 15792.79 * value1;
                        tvCurrency1.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag1.setImageResource(R.drawable.vietnamflag);
                        tvInformation1.setText("1 Singapore Dollar equals to 15792.79 Dong");
                    } else if (spnCurrency1.getSelectedItemId() == 4) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 4.83 * value1;
                        tvCurrency1.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag1.setImageResource(R.drawable.chinaflag);
                        tvInformation1.setText("1 Singapore Dollar equals to 15792.79 Yuan");
                    } else if (spnCurrency1.getSelectedItemId() == 5) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 34.70 * value1;
                        tvCurrency1.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag1.setImageResource(R.drawable.phillipineflag);
                        tvInformation1.setText("1 Singapore Dollar equals to 34.70 Peso");
                    }

                    if(spnCurrency2.getSelectedItemId() == 0) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 9530.87 * value1;
                        tvCurrency2.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag2.setImageResource(R.drawable.indonesiaflag);
                        tvInformation2.setText("1 Singapore Dollar equals to 9530.87 Rupiah");
                    } else if (spnCurrency2.getSelectedItemPosition() == 1) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 47.83 * value1;
                        tvCurrency2.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag2.setImageResource(R.drawable.indiaflag);
                        tvInformation2.setText("1 Singapore Dollar equals to 47.83 Rupee");
                    } else if (spnCurrency2.getSelectedItemId() == 2) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 3.07 * value1;
                        tvCurrency2.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag2.setImageResource(R.drawable.malaysiaflag);
                        tvInformation2.setText("1 Singapore Dollar equals to 3.07 Ringgit");
                    } else if (spnCurrency2.getSelectedItemId() == 3) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 15792.79 * value1;
                        tvCurrency2.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag2.setImageResource(R.drawable.vietnamflag);
                        tvInformation2.setText("1 Singapore Dollar equals to 15792.79 Dong");
                    } else if (spnCurrency2.getSelectedItemId() == 4) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 4.83 * value1;
                        tvCurrency2.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag2.setImageResource(R.drawable.chinaflag);
                        tvInformation2.setText("1 Singapore Dollar equals to 15792.79 Yuan");
                    } else if (spnCurrency2.getSelectedItemId() == 5) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 34.70 * value1;
                        tvCurrency2.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag2.setImageResource(R.drawable.phillipineflag);
                        tvInformation2.setText("1 Singapore Dollar equals to 34.70 Peso");
                    }
                } else if (etSGD.length() == 0) {
                    tvCurrency1.setText("" + 0);
                    tvCurrency2.setText("" + 0);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCurrency1.setText("0");
                tvCurrency2.setText("0");
                etSGD.setText("");
                ivFlag1.setVisibility(View.INVISIBLE);
                ivFlag2.setVisibility(View.INVISIBLE);
                tvInformation1.setText("");
                tvInformation2.setText("");
            }
        });
    }
}

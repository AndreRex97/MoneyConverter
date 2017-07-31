package sg.edu.rp.c346.rpsconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

import static sg.edu.rp.c346.rpsconverter.R.drawable.indonesiaflag;

public class MainActivity extends AppCompatActivity {
    EditText etSGD;
    TextView tvCurrency;
    Spinner spnCurrency;
    TextView tvInformation;
    ImageView ivFlag;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSGD = (EditText) findViewById(R.id.sgdValues);
        tvCurrency = (TextView) findViewById(R.id.chosenValue);
        spnCurrency = (Spinner) findViewById(R.id.spinnerCurrency);
        tvInformation = (TextView) findViewById(R.id.currencyInformation);
        ivFlag = (ImageView) findViewById(R.id.Flag);
        btnReset = (Button) findViewById(R.id.buttonReset);

        //Button Reset function
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSGD.setText("");
                tvCurrency.setText("");
                tvInformation.setText("");
                ivFlag.setVisibility(View.INVISIBLE);
            }
        });

        // First Edit Text
        etSGD.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (etSGD.length() != 0) {
                    ivFlag.setVisibility(View.VISIBLE);
                    if (spnCurrency.getSelectedItemId() == 0) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 9530.87 * value1;
                        tvCurrency.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag.setImageResource(indonesiaflag);
                        tvInformation.setText("1 Singapore Dollar equals to 9530.87 Rupiah");
                    } else if (spnCurrency.getSelectedItemPosition() == 1) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 47.83 * value1;
                        tvCurrency.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag.setImageResource(R.drawable.indiaflag);
                        tvInformation.setText("1 Singapore Dollar equals to 47.83 Rupee");
                    } else if (spnCurrency.getSelectedItemId() == 2) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 3.07 * value1;
                        tvCurrency.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag.setImageResource(R.drawable.malaysiaflag);
                        tvInformation.setText("1 Singapore Dollar equals to 3.07 Ringgit");
                    } else if (spnCurrency.getSelectedItemId() == 3) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 15792.79 * value1;
                        tvCurrency.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag.setImageResource(R.drawable.vietnamflag);
                        tvInformation.setText("1 Singapore Dollar equals to 15792.79 Dong");
                    } else if (spnCurrency.getSelectedItemId() == 4) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 4.83 * value1;
                        tvCurrency.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag.setImageResource(R.drawable.chinaflag);
                        tvInformation.setText("1 Singapore Dollar equals to 15792.79 Yuan");
                    } else if (spnCurrency.getSelectedItemId() == 5) {
                        String sgdValue = etSGD.getText().toString();
                        Double value1 = Double.parseDouble(sgdValue);
                        Double result = 34.70 * value1;
                        tvCurrency.setText("" + new DecimalFormat("##.##").format(result));
                        ivFlag.setImageResource(R.drawable.phillipineflag);
                        tvInformation.setText("1 Singapore Dollar equals to 34.70 Peso");
                    }
                } else if (etSGD.length() == 0) {
                    tvCurrency.setText("" + 0);
                    tvInformation.setText("");
                    ivFlag.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.multiple_currency) {
            Intent i = new Intent(MainActivity.this, multi_currency.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}

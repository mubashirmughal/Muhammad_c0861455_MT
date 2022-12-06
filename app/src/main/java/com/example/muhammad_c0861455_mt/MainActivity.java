package com.example.muhammad_c0861455_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    Spinner spinner;
    Button ViewDetailsButton;
    EditText Amount;
    EditText TotalPayment;
    TextView NoOfDays;
    RadioButton LessThan20, Between20and60, Above60;
    private int DriverAge;

    String[] Cars = {"BMW", "AUDI", "CADILLAC", "VOLKS WAGON", "MERCEDES", "PEUGEOT"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        spinner = (Spinner) findViewById(R.id.Spinner);
        ViewDetailsButton = (Button) findViewById(R.id.ViewDetailsButton);
        TotalPayment = (EditText) findViewById(R.id.TotalPayment);
        NoOfDays = (TextView) findViewById(R.id.NoOfDays);
        Amount = (EditText) findViewById(R.id.Amount);
        LessThan20 = (RadioButton) findViewById(R.id.LessThan20);
        Between20and60 = (RadioButton) findViewById(R.id.Between20and60);
        Above60 = (RadioButton) findViewById(R.id.Above60);


        ArrayAdapter ad = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, Cars);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner.setAdapter(ad);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                NoOfDays.setText("How Many Days you want to rent?     Days: " + String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        ViewDetailsButton.setOnClickListener(v -> {

        });




    }
}

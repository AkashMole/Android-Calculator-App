package dev.akashmole.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DoubleZero, Zero;
    Button DivideBtn, MultiplyBtn, MinusBtn, AddBtn, EqualBtn;
    Button ClearBtn;
    TextView HistoryView, CurrentView;

    int value1, value2;

    char ADD = '+';
    char MINUS = '-';
    char MUL = '*';
    char DIV = '/';

    int operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkingFunction();

        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "1" );
            }
        });

        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "2");
            }
        });

        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "3" );
            }
        });

        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "4");
            }
        });

        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "5" );
            }
        });

        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "6");
            }
        });

        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "7" );
            }
        });

        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "8");
            }
        });

        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText( CurrentView.getText() + "9" );
            }
        });

        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentView.getText().length() != 0){
                    CurrentView.setText( CurrentView.getText() + "0" );
                }
            }
        });

        ClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentView.setText(null);
                HistoryView.setText(null);
            }
        });

        AddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt(CurrentView.getText().toString());
                HistoryView.setText(CurrentView.getText() + "+");
                CurrentView.setText(null);
                operator = 1;
            }
        });
        MinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt(CurrentView.getText().toString());
                HistoryView.setText(CurrentView.getText() + "-");
                CurrentView.setText(null);
                operator = 2;
            }
        });
        DivideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt(CurrentView.getText().toString());
                HistoryView.setText(CurrentView.getText() + "/");
                CurrentView.setText(null);
                operator = 3;
            }
        });
        MultiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt(CurrentView.getText().toString());
                HistoryView.setText(CurrentView.getText() + "*");
                CurrentView.setText(null);
                operator = 4;
            }
        });

        EqualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Integer.parseInt(CurrentView.getText().toString());
                HistoryView.setText(HistoryView.getText() + String.valueOf(value2));

                int result;
                float fresult;
                switch(operator){
                    case 1:
                        result = value1 + value2;
                        CurrentView.setText(String.valueOf(result));
                        break;
                    case 2:
                        result = value1 - value2;
                        CurrentView.setText(String.valueOf(result));
                        break;
                    case 3:
                        fresult = Float.parseFloat(String.valueOf(value1)) / Float.parseFloat(String.valueOf(value2));
                        String Result = String.format("%.02f", fresult);
                        CurrentView.setText(String.valueOf(Result));
                        break;
                    case 4:
                        result = value1 * value2;
                        CurrentView.setText(String.valueOf(result));
                        break;
                }
            }
        });

    }

    public void linkingFunction(){
        One = (Button) findViewById(R.id.One);
        Two = (Button) findViewById(R.id.Two);
        Three = (Button) findViewById(R.id.Three);
        Four = (Button) findViewById(R.id.Four);
        Five = (Button) findViewById(R.id.Five);
        Six = (Button) findViewById(R.id.Six);
        Seven = (Button) findViewById(R.id.Seven);
        Eight = (Button) findViewById(R.id.Eight);
        Nine = (Button) findViewById(R.id.Nine);
        Zero = (Button) findViewById(R.id.Zero);
        DivideBtn = (Button) findViewById(R.id.DivideBtn);
        MultiplyBtn = (Button) findViewById(R.id.MultiplyBtn);
        MinusBtn = (Button) findViewById(R.id.MinusBtn);
        AddBtn = (Button) findViewById(R.id.AddBtn);
        EqualBtn = (Button) findViewById(R.id.EqualBtn);
        ClearBtn = (Button) findViewById(R.id.ClearBtn);
        HistoryView = (TextView) findViewById(R.id.textViewHistory);
        CurrentView = (TextView) findViewById(R.id.textViewCurrent);
    }

}
package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plus = (Button)findViewById(R.id.button);
        Button minus = (Button)findViewById(R.id.button2);
        TextView text=(TextView) findViewById(R.id.textArea);
        plus.setText("+");
        minus.setText("-");
        text.setText("0");

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=((TextView)findViewById(R.id.textArea)).getText().toString();
                int val=Integer.parseInt(temp);
                val=val+1;
                String s=Integer.toString(val);
                ((TextView)findViewById(R.id.textArea)).setText(s);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp=((TextView)findViewById(R.id.textArea)).getText().toString();
                int val=Integer.parseInt(temp);
                val=val-1;
                String s=Integer.toString(val);
                ((TextView)findViewById(R.id.textArea)).setText(s);
            }
        });
       
    }
}
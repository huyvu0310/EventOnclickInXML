package com.example.event.eventonclickinxml;

import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void btnTong (View view)
    {
        EditText edita = (EditText)
                findViewById(R.id.edtSoa);
        int a = Integer.parseInt(edita.getText() + "");
       EditText editb = (EditText)
               findViewById(R.id.edtSob);
       int b = Integer.parseInt(editb.getText() + "");
        TextView edtKq = (TextView)
                findViewById(R.id.edtKq);
        edtKq.setText((a+b) + "");


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

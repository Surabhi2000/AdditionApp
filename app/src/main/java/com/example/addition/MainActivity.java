package com.example.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etnum1,etnum2;
    Button btnadd;
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1=findViewById(R.id.etnum1);
        etnum2=findViewById(R.id.etnum2);
        btnadd=findViewById(R.id.btnadd);
        tvAnswer=findViewById(R.id.tvAnswer);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(etnum1.getText().toString());
                int n2=Integer.parseInt(etnum2.getText().toString());
                int add=n1+n2;
                tvAnswer.setText("answer : "+String.valueOf(add));
                etnum1.getText().clear();
                etnum2.getText().clear();
              
            }
        });


    }
}

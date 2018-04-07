package com.example.jains.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button add=(Button)findViewById(R.id.Add);
        //add.setOnClickListener(this);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num_1=(EditText)findViewById(R.id.Num_1);
                EditText num_2=(EditText)findViewById(R.id.Num_2);

                final TextView res=(TextView)findViewById(R.id.res);
                //TextView result=(TextView)findViewById(R.id.Result);

                num_1.setCursorVisible(true);
                num_2.setCursorVisible(true);

                String s1,s2;
                s1=num_1.getText().toString();
                s2=num_2.getText().toString();

                final Float n1,n2;
                n1=Float.parseFloat(s1);
                n2=Float.parseFloat(s2);

                final float result=n1+n2;
                res.setText(" "+result);

            }
        });

        Button sub=(Button)findViewById(R.id.Sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num_1=(EditText)findViewById(R.id.Num_1);
                EditText num_2=(EditText)findViewById(R.id.Num_2);

                final TextView res=(TextView)findViewById(R.id.res);
                //TextView result=(TextView)findViewById(R.id.Result);

                num_1.setCursorVisible(true);
                num_2.setCursorVisible(true);

                String s1,s2;
                s1=num_1.getText().toString();
                s2=num_2.getText().toString();

                final Float n1,n2;
                n1=Float.parseFloat(s1);
                n2=Float.parseFloat(s2);

                final float result=n1-n2;
                res.setText(" "+result);

            }
        });
        Button mul=(Button)findViewById(R.id.Mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num_1=(EditText)findViewById(R.id.Num_1);
                EditText num_2=(EditText)findViewById(R.id.Num_2);

                final TextView res=(TextView)findViewById(R.id.res);
                //TextView result=(TextView)findViewById(R.id.Result);

                num_1.setCursorVisible(true);
                num_2.setCursorVisible(true);

                String s1,s2;
                s1=num_1.getText().toString();
                s2=num_2.getText().toString();

                final Float n1,n2;
                n1=Float.parseFloat(s1);
                n2=Float.parseFloat(s2);

                final float result=n1*n2;
                res.setText(" "+result);

            }
        });
        Button div=(Button)findViewById(R.id.Div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num_1=(EditText)findViewById(R.id.Num_1);
                EditText num_2=(EditText)findViewById(R.id.Num_2);

                final TextView res=(TextView)findViewById(R.id.res);
                //TextView result=(TextView)findViewById(R.id.Result);

                num_1.setCursorVisible(true);
                num_2.setCursorVisible(true);

                String s1,s2;
                s1=num_1.getText().toString();
                s2=num_2.getText().toString();

                final Float n1,n2;
                n1=Float.parseFloat(s1);
                n2=Float.parseFloat(s2);

                final float result=(n1/n2);
                res.setText(" "+result);

            }
        });



    }
    //public void onClick(View v){
//if(v.getId() == R.id.Add){
  //  }
}

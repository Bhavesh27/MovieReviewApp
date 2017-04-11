package com.example.bhavesh.nancy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText E1,E2,E3;
    TextView T;
    String first,second,third;
    //String first = "",second = "",third = "";
    //String s ="";
    //String s1 = "PLEASE FILL ALL THE DETAILS";
    //String s2 = "ALL DETAILS FILLED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button = (Button)findViewById(R.id.button);
        E1 = (EditText)findViewById(R.id.editText);
        E2 = (EditText)findViewById(R.id.editText2);
        E3 = (EditText)findViewById(R.id.editText3);
        T = (TextView) findViewById(R.id.textView);
    }

    public void click(View view)
    {
         first = E1.getText().toString();
         second = E1.getText().toString();
         third = E1.getText().toString();
        if( second.equalsIgnoreCase("") || third.equalsIgnoreCase("") || first.equalsIgnoreCase("") )
        {
            //T.setTextSize(32);
           Toast.makeText(MainActivity.this,"VALIDATION SUCCESSFULL",Toast.LENGTH_LONG).show();
            //Toast.makeText(this,"VALIDATION SUCCESSFULL",Toast.LENGTH_LONG).show();
            /*E1.setText("");
            E2.setText("");
            E3.setText("");*/
        }
        else
        {
            //T.setTextSize(32);
            Toast.makeText(this,"VALIDATION FAIL",Toast.LENGTH_LONG).show();
            /*E1.setText("");
            E2.setText("");
            E3.setText("");*/
        }
    }
}

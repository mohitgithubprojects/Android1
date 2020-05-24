package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText e1,E2;
    TextView r;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.e1);
        E2 = (EditText)findViewById(R.id.e2);
        r = (TextView)findViewById(R.id.resulttv);
        b = (Button)findViewById(R.id.sumbtn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                float n1 = Float.parseFloat(e1.getText().toString());
                float n2 = Float.parseFloat(E2.getText().toString());
                float sum = n1+n2;
                r.setText(sum+"");}
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"Error occured"+e,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

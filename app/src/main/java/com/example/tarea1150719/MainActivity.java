package com.example.tarea1150719;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Math;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    EditText et1,et2,et3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.TV1);
        tv2=(TextView) findViewById(R.id.TV2);
        tv3=(TextView) findViewById(R.id.TV3);
        tv4=(TextView) findViewById(R.id.TV4);
        tv5=(TextView) findViewById(R.id.TV5);
        tv6=(TextView) findViewById(R.id.TV6);
        tv7=(TextView) findViewById(R.id.TV7);
        tv8=(TextView) findViewById(R.id.TV8);
        tv9=(TextView) findViewById(R.id.TV9);
        et1=(EditText) findViewById(R.id.ET1);
        et2=(EditText) findViewById(R.id.ET2);
        et3=(EditText) findViewById(R.id.ET3);
        btn1=(Button)findViewById(R.id.BTN1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a,b,c,x2,x1,raiz,potencia;

                a=Double.parseDouble(et1.getText().toString());
                b=Double.parseDouble(et2.getText().toString());
                c=Double.parseDouble(et3.getText().toString());
                potencia=Math.pow(b,2)-(4*a*c);
                raiz=Math.sqrt(potencia);
                tv5.setText("la raiz es:  "+raiz);
                x1=(-b-raiz/2*a);
                x2=(-b+raiz/2*a);
                tv7.setText("x1 es "+x1);
                tv9.setText("x2 es "+x2);
            }
        });
    }
}

package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 21/2/2560.
 */

public class menuActivity extends Activity implements View.OnClickListener {
    private Button btnsothon;
    private Button btnmarket;
    private Button btnmarupong;
    private Button btnsamoson;
    private Button btnwatchram;
    private Button btnrangsarit;
    private Button btnrattanaram;
    private Button btnupai;
    private Button btnshrine;
    private Button btncpbthai;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        initView();
    }

    private void initView() {
        btnsothon = (Button) findViewById(R.id.btnsothon);
        btnmarket = (Button) findViewById(R.id.btnmarket);
        btnmarupong = (Button) findViewById(R.id.btnmarupong);
        btnsamoson = (Button) findViewById(R.id.btnsamoson);
        btnwatchram = (Button) findViewById(R.id.btnwatchram);
        btnrangsarit = (Button) findViewById(R.id.btnrangsarit);
        btnrattanaram = (Button) findViewById(R.id.btnrattanaram);
        btnupai = (Button) findViewById(R.id.btnupai);
        btnshrine = (Button) findViewById(R.id.btnshrine);
        btncpbthai = (Button) findViewById(R.id.btncpbthai);
        button3 = (Button) findViewById(R.id.button3);

        btnsothon.setOnClickListener(this);
        btnmarket.setOnClickListener(this);
        btnmarupong.setOnClickListener(this);
        btnwatchram.setOnClickListener(this);
        btnrangsarit.setOnClickListener(this);
        btnrattanaram.setOnClickListener(this);
        btnupai.setOnClickListener(this);
        btnshrine.setOnClickListener(this);
        btncpbthai.setOnClickListener(this);
        button3.setOnClickListener(this);
        btnsamoson.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch ( v.getId() )
        {
            case R.id.btnsothon:



                Intent i = new Intent(getApplicationContext(), luanActivity1.class);
                startActivity(i);

                break;
            case R.id.btnmarket :
                Intent j = new Intent(getApplicationContext(), newhomeActivity1.class);
                startActivity(j);

                break;
            case R.id.btnmarupong :

                Intent k = new Intent(getApplicationContext(), fortActivity1.class);
                startActivity(k);
                break;

            case R.id.btnsamoson :
                Intent zz = new Intent(getApplicationContext(), chinesetempleprachasamoson1Activity1.class);
                startActivity(zz);

                break;

            case R.id.btnwatchram :

                Intent w = new Intent(getApplicationContext(), watchramActivity1.class);
                startActivity(w);
                break;
            case R.id.btnrangsarit :

                Intent e = new Intent(getApplicationContext(), royalActivity1.class);
                startActivity(e);
                break;

            case R.id.btnrattanaram :
                Intent r = new Intent(getApplicationContext(), rattanaramActivity1.class);
                startActivity(r);

                break;

            case R.id.btnupai :

                Intent t = new Intent(getApplicationContext(), patikaActivity1.class);
                startActivity(t);
                break;

            case R.id.btnshrine :

                Intent y = new Intent(getApplicationContext(), shrineActivity1.class);
                startActivity(y);
                break;

            case R.id.btncpbthai :

                Intent u = new Intent(getApplicationContext(), cpb1Activity.class);
                startActivity(u);
                break;


            case R.id.button3 :

                onBackPressed();
                break;

        }
    }
}

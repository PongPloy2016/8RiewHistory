package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class patikaActivity2 extends Activity {
    private Button btnpatblack;
    private Button btnpatnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patikaramtempleaupai2);
        initView();
    }

    private void initView() {
        btnpatblack = (Button) findViewById(R.id.btnpatblack);

        btnpatblack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), patikaActivity1.class);
                startActivity(q);
            }
        });
        btnpatnext2 = (Button) findViewById(R.id.btnpatnext2);
        btnpatnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), patikaActivity3.class);
                startActivity(q);
            }
        });
    }
}

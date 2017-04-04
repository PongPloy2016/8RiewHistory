package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class watchramActivity1 extends Activity {
    private Button btnwathome1;
    private Button btnwatnexgt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchramtemple1);
        initView();
    }

    private void initView() {
        btnwathome1 = (Button) findViewById(R.id.btnwathome1);
        btnwathome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);

            }
        });
        btnwatnexgt1 = (Button) findViewById(R.id.btnwatnexgt1);
        btnwatnexgt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), watchramActivity2.class);
                startActivity(q);

            }
        });
    }
}

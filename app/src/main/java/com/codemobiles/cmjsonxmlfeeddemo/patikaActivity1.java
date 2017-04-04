package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class patikaActivity1 extends Activity {
    private Button btnpathome1;
    private Button btnpatnext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patikaramtempleaupai1);
        initView();
    }

    private void initView() {
        btnpathome1 = (Button) findViewById(R.id.btnpathome1);

        btnpathome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);
            }
        });
        btnpatnext1 = (Button) findViewById(R.id.btnpatnext1);
        btnpatnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), patikaActivity2.class);
                startActivity(q);

            }
        });
    }
}

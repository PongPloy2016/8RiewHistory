package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class watchramActivity2 extends Activity {
    private Button btnwatprev;
    private Button btnwatnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watchramtemple2);
        initView();
    }

    private void initView() {
        btnwatprev = (Button) findViewById(R.id.btnwatprev);
        btnwatprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), watchramActivity1.class);
                startActivity(q);

            }
        });
        btnwatnext2 = (Button) findViewById(R.id.btnwatnext2);
        btnwatnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), watchramActivity3.class);
                startActivity(q);

            }
        });
    }
}

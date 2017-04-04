package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class luanActivity2 extends Activity {
    private Button btnluaprve;
    private Button btnluanext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luangporsothon2);
        initView();
    }

    private void initView() {
        btnluaprve = (Button) findViewById(R.id.btnluaprve);
        btnluaprve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), luanActivity1.class);
                startActivity(q);

            }
        });
        btnluanext = (Button) findViewById(R.id.btnluanext);
        btnluanext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), luanActivity3.class);
                startActivity(q);

            }
        });
    }
}

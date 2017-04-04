package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class rattanaramActivity2 extends Activity {
    private Button btntemprve;
    private Button btntemnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.templehealrattanaram2);
        initView();
    }

    private void initView() {
        btntemprve = (Button) findViewById(R.id.btntemprve);
        btntemprve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), rattanaramActivity1.class);
                startActivity(q);
            }
        });
        btntemnext2 = (Button) findViewById(R.id.btntemnext2);
        btntemnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), rattanaramActivity3.class);
                startActivity(q);

            }
        });
    }
}

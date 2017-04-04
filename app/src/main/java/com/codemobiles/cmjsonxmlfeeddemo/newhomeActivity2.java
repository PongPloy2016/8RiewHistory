package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class newhomeActivity2 extends Activity {
    private Button btnnewhome2;
    private Button btnnewnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newhomemarket2);
        initView();
    }

    private void initView() {
        btnnewhome2 = (Button) findViewById(R.id.btnnewhome2);
        btnnewhome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), newhomeActivity1.class);
                startActivity(q);

            }
        });
        btnnewnext2 = (Button) findViewById(R.id.btnnewnext2);
        btnnewnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), newhomeActivity3.class);
                startActivity(q);

            }
        });
    }
}

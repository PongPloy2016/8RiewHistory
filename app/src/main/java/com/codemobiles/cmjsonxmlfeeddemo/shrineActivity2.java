package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class shrineActivity2 extends Activity {
    private Button btnshrpre;
    private Button btnshrnext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shrine2);
        initView();
    }

    private void initView() {
        btnshrpre = (Button) findViewById(R.id.btnshrpre);
        btnshrpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), shrineActivity1.class);
                startActivity(q);

            }
        });
        btnshrnext2 = (Button) findViewById(R.id.btnshrnext2);
        btnshrnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), shrineActivity3.class);
                startActivity(q);

            }
        });
    }
}

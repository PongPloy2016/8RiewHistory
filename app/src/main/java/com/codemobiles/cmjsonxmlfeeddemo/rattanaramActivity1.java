package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 13/2/2560.
 */

public class rattanaramActivity1 extends Activity {
    private Button btntemhome1;
    private Button btntemnext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.templehealrattanaram1);
        initView();
    }

    private void initView() {
        btntemhome1 = (Button) findViewById(R.id.btntemhome1);

        btntemhome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent q = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(q);

            }
        });
        btntemnext1 = (Button) findViewById(R.id.btntemnext1);

        btntemnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), rattanaramActivity2.class);
                startActivity(q);

            }
        });
    }
}

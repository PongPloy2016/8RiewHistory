package com.codemobiles.cmjsonxmlfeeddemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 14/3/2560.
 */

public class cpb1Activity extends Activity {
    private Button btncpb1;
    private Button btncpbnext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpb1);
        initView();
    }

    private void initView() {
        btncpb1 = (Button) findViewById(R.id.btncpb1);

        btncpb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(o);

            }
        });
        btncpbnext1 = (Button) findViewById(R.id.btncpbnext1);

        btncpbnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(getApplicationContext(), cpb2Activity.class);
                startActivity(o);

            }
        });
    }
}

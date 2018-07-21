package com.tom.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.widget.TextView;

import java.nio.BufferUnderflowException;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        Bundle bag = intent.getExtras();

        float bmi = bag.getFloat("BMI_EXTRA" , 0);
        String test =  bag.getString("TESTING" , null);
        TextView result = findViewById(R.id.result);
        result.setText("您的bmi值為: " + bmi + "  " + test );

        Log.d("TESTING" , test);
        Log.d("BMI_EXTRA", String.valueOf(bmi));




//        Intent intent = new Intent(this,ResultActivity.class);
//        intent.putExtra("cool","hi");
//        startActivity(intent);



//        Log.d("TEST_EXTRA",String.valueOf(test));
//        Log.d("BMI_EXTRA",String.valueOf(bmi));

    }
}

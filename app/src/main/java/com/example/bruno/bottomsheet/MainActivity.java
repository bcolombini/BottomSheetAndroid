package com.example.bruno.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetBehavior mBottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View bottomSheet = findViewById(R.id.bottom_sheet);

        Button button1 = (Button) findViewById(R.id.button_1);
        Button button2 = (Button) findViewById(R.id.button_2);
        Button button3 = (Button) findViewById(R.id.button_3);

        LinearLayout LinearButton1 = (LinearLayout) findViewById(R.id.save);
        LinearLayout LinearButton2 = (LinearLayout) findViewById(R.id.share);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        //Buttons ButtomSheet
        LinearButton1.setOnClickListener(this);
        LinearButton2.setOnClickListener(this);

        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
    }

    @Override
    public void onClick(View view) {
        switch( view.getId() ) {
            case R.id.button_1: {
                mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                break;
            }
            case R.id.button_2:{
                mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                break;
            }
            case R.id.save:{
                Log.d("Teste: ","BIRLL!");
                break;
            }
            case R.id.share:{
                Log.d("Teste: ","Ta saindo da jaula!");
                break;
            }
        }
    }
}

package com.example.bruno.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomSheetBehavior mBottomSheetBehavior;
    private BottomSheetDialogFragment bottomSheetDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomSheetDialogFragment = new TutsPlusBottomSheetDialogFragment();

        Button bt1 = (Button) findViewById(R.id.button_1);
        bt1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch( view.getId() ) {
            case R.id.button_1: {
                bottomSheetDialogFragment.show(getSupportFragmentManager(), "bottom sheet");
                break;
            }
        }
    }
}

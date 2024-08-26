package com.RecyclerViewAnimation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button fall_down_button;
    private Button rotate_in;
    private Button scale_in;
    private Button slide_up;

    private RecyclerView main_LST_properties;
    private AnimationAdapter animationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Buttons
        fall_down_button = findViewById(R.id.btn_fall_down);
        rotate_in = findViewById(R.id.btn_rotate_in);
        scale_in = findViewById(R.id.btn_scale_in);
        slide_up = findViewById(R.id.btn_slide_up);

        // Initialize RecyclerView
        main_LST_properties = findViewById(R.id.main_LST_properties);

        Imager.initHelper(this);

        ArrayList<Property> properties = DataManager.generate();
        Adapter_Property adapterProperty = new Adapter_Property(properties);
        main_LST_properties.setLayoutManager(new LinearLayoutManager(this));
        main_LST_properties.setItemAnimator(new DefaultItemAnimator());
        main_LST_properties.setAdapter(adapterProperty);
        animationAdapter = new AnimationAdapter(this, main_LST_properties);


        // Set OnClickListeners
        fall_down_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationAdapter.changeEnterAnimation(AnimationAdapter.EnterType.FALL_DOWN);
            }
        });
        rotate_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationAdapter.changeEnterAnimation(AnimationAdapter.EnterType.ROTATE_IN);
            }
        });
        scale_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationAdapter.changeEnterAnimation(AnimationAdapter.EnterType.SCALE_IN);
            }
        });
        slide_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationAdapter.changeEnterAnimation(AnimationAdapter.EnterType.SLIDE_UP);
            }
        });
    }

//    @Override
//    public void onBindViewHolder() {
//
//    }
}

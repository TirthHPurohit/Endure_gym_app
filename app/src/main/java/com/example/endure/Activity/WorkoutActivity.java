package com.example.endure.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.example.endure.Adapter.LessonsAdapter;
import com.example.endure.Domain.Workout;
import com.example.endure.R;
import com.example.endure.databinding.ActivityMainBinding;
import com.example.endure.databinding.ActivityWorkoutBinding;

public class WorkoutActivity extends AppCompatActivity {

    //Declaring Variables
    private ActivityWorkoutBinding binding;
    private Workout workout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Removing Action Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getObject();
        setVariable();
    }
    private void getObject(){
        workout = (Workout) getIntent().getSerializableExtra("object");
    }

    private void setVariable(){
        int resId =  getResources().getIdentifier(workout.getPicPath(), "drawable", getPackageName());

        Glide.with(this).load(resId).into(binding.pic);

        binding.backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.titleTxt2.setText(workout.getTitle());
        binding.durationTxt.setText(workout.getDurationAll());
        binding.exerciseTxt.setText(workout.getLessons().size()+" Exercise");
        binding.kcalTxt.setText(workout.getKcal()+" Kcal");
        binding.descriptionTxt.setText(workout.getDescription());

        binding.view3.setLayoutManager(new LinearLayoutManager(WorkoutActivity.this, LinearLayoutManager.VERTICAL, false));
        binding.view3.setAdapter(new LessonsAdapter(workout.getLessons()));
    }

}
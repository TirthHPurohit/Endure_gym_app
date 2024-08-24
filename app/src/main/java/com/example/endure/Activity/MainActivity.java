package com.example.endure.Activity;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.endure.Adapter.WorkoutAdapter;
import com.example.endure.Domain.Lessons;
import com.example.endure.Domain.Workout;
import com.example.endure.R;
import com.example.endure.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Variables
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Removing Action Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));
        binding.view1.setAdapter(new WorkoutAdapter(getData()));
    }

    private ArrayList<Workout> getData(){
        ArrayList<Workout> list = new ArrayList<>();

        list.add(new Workout("Running","You Just Woke up, It's brand new day.","pic_1",250,"20 min",getLesson_1()));
        list.add(new Workout("Stretching","You Just Woke up, It's brand new day.","pic_2",250,"20 min",getLesson_2()));
        list.add(new Workout("Yoga","You Just Woke up, It's brand new day.","pic_3",250,"20 min",getLesson_3()));
        return list;
    }

    private ArrayList<Lessons> getLesson_1(){
        ArrayList<Lessons> list = new ArrayList<>();

        list.add(new Lessons("Lesson 1","03:46","HBPMvFkpNgE","pic_1_1"));
        list.add(new Lessons("Lesson 2","03:41","K6I24WgiiPw","pic_1_2"));
        list.add(new Lessons("Lesson 3","01:57","Zc08v4YY0eA","pic_1_3"));
        return list;
    }

    private ArrayList<Lessons> getLesson_2(){
        ArrayList<Lessons> list = new ArrayList<>();

        list.add(new Lessons("Lesson 1","20:23","L3eImBAXT7I","pic_3_1"));
        list.add(new Lessons("Lesson 2","18:27","47Exgz07Flu","pic_3_2"));
        list.add(new Lessons("Lesson 3","32:25","0mLx8tmaQ-4","pic_3_3"));
        list.add(new Lessons("Lesson 4","07:52","w86EalEoFRY","pic_3_4"));
        return list;
    }

    private ArrayList<Lessons> getLesson_3(){
        ArrayList<Lessons> list = new ArrayList<>();

        list.add(new Lessons("Lesson 1","23:00","v7AYKMP6r0E","pic_1_1"));
        list.add(new Lessons("Lesson 2","27:00","Eml2xnoLpYE","pic_1_2"));
        list.add(new Lessons("Lesson 3","25:00","v7SN-d4Xx0","pic_1_3"));
        list.add(new Lessons("Lesson 4","21:00","LqXZ628YNj4","pic_1_3"));
        return list;
    }
}
package com.example.recordingdemo.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.recordingdemo.databinding.ActivityMainBinding;
import com.example.recordingdemo.view.activity.fragment.RecordFragment;
import com.example.recordingdemo.view.activity.fragment.RecordingsFragment;
import com.example.recordingdemo.view.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.tabs.setupWithViewPager(binding.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        binding.viewpager.setAdapter(adapter);
    }
}
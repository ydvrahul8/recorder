package com.example.recordingdemo.view.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.recordingdemo.view.activity.fragment.RecordFragment;
import com.example.recordingdemo.view.activity.fragment.RecordingsFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    Fragment recordFragment;
    Fragment recordingsFragment;

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                    recordFragment = new RecordFragment();
                return recordFragment;
            case 1:
                    recordingsFragment = new RecordingsFragment();
                return recordingsFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Record";
            case 1:
                return "Recordings";
        }
        return null;
    }
}

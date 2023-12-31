package me.app.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import me.app.demo.databinding.ActivityMainBinding;
import me.app.demo.fragments.HomeFragment;
import me.app.demo.fragments.MediaFragment;
import me.app.demo.fragments.SettingFragment;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.btmNtViewNavbar.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                replaceFragment(new HomeFragment());
                return true;
            } else if (item.getItemId() == R.id.qr) {
                replaceFragment(new MediaFragment());
                return true;
            } else if (item.getItemId() == R.id.setting) {
                replaceFragment(new SettingFragment());
                return true;
            }
            return false;
        });


    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}
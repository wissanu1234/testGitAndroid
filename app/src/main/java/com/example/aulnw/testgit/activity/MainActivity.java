package com.example.aulnw.testgit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aulnw.testgit.R;
import com.example.aulnw.testgit.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstances();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit();
        }
    }

    private void initInstances() {

    }
}

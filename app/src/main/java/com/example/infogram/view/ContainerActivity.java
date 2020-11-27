package com.example.infogram.view;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.infogram.R;
import com.example.infogram.view.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_container);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                Fragment selectedFragment = null;

                switch (item.getItemId()){

                    case R.id.search:


                    case R.id.profile:

                    case R.id.home:

                        selectedFragment = new SearchFragment();

                        break;

                }


                assert selectedFragment != null;
                getSupportFragmentManager()

                     .beginTransaction()

                     .replace(R.id.container_frame , selectedFragment)

                        .commit();



                return true;
            }
        });


            }

}





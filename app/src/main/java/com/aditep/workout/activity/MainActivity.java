package com.aditep.workout.activity;

import android.content.res.Configuration;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.aditep.workout.R;
import com.aditep.workout.databinding.ActivityMainBinding;
import com.aditep.workout.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ActionBarDrawerToggle actionBarDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MainFragment.newInstance())
                    .commit();
        }
        initInstances();
    }

    private void initInstances() {
    setSupportActionBar(binding.toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity
                .this, binding.drawerLayout, R.string.open_drawer, R.string.close_drawer);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                    // set item as selected to persist highlight
                    item.setChecked(true);
                    // close drawer when item is tapped
                switch (id) {
                    case R.id.nav_camera:
                        Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_gallery:
                        Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_manage:
                        Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_slideshow:
                        Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_view:
                        Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();
                        break;
                }

                if (id == R.id.nav_camera)
                    Toast.makeText(getApplicationContext(),""+id,Toast.LENGTH_SHORT).show();


                    binding.drawerLayout.closeDrawers();

                    // Add code here to update the UI based on the item selected
                    // For example, swap UI fragments here

                    return true;
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return  true;
        return super.onOptionsItemSelected(item);
    }
}

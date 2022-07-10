package com.lazday.rezkymovies.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.lazday.rezkymovies.adapter.ViewPagerAdapter;
import com.lazday.rezkymovies.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView( binding.getRoot() );

        setTab();
    }

    private void setTab() {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new PopularFragment(), "POPULAR");
        adapter.addFrag(new NowPlayingFragment(), "NOW PLAYING");

        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager( binding.viewPager );
    }
}

package com.example.android.miwok;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class SimpleFragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Numbers", "Colors", "Family Members", "Phrases"};

    public SimpleFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new numbers();
        }else if(position == 1){
            return new colors();
        }else if(position == 2){
            return new family_members();
        }else if(position == 3){
            return new phrases();
        }else{
            return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}

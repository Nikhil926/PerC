package com.example.perc.Adapters;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.perc.Fragments.ChatsFragment;
import com.example.perc.Fragments.StoriesFragment;
import com.example.perc.Fragments.VideoCallFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new ChatsFragment();
            case 1: return new StoriesFragment();
            case 2: return new VideoCallFragment();
            default: return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0){
            title="MESSAGES";
        }
        if(position==1){
            title="STORIES";
        }
        if(position==2){
            title="PHONE";
        }
        return title;
    }
}

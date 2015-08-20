package com.example.paulovilanova.slidingtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int numbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created
    Tab1 tab1;
    Tab2 tab2;
    Tab3 tab3;

    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.titles = mTitles;
        this.numbOfTabs = mNumbOfTabsumb;

    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0){ // if the position is 0 we are returning the First tab

            tab1 = new Tab1();  // Tab1 and Tab2 Required: android.support.v4.app.Fragment, check the imports...
            return tab1;

        }// As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        else if(position == 1){

            tab2 = new Tab2();
            return tab2;

        }else{
            tab3 = new Tab3();
            return tab3;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return numbOfTabs;
    }
}

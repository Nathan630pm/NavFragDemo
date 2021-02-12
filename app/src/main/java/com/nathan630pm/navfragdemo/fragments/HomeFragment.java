package com.nathan630pm.navfragdemo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nathan630pm.navfragdemo.R;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =  inflater.inflate(R.layout.fragment_home, container, false);
        v.findViewById(R.id.textView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                NavDirections navDirections = HomeFragmentDirections.actionHomeFragmentToProfileFragment("User Profile");
                NavDirections navDirections = HomeFragmentDirections.actionHomeFragmentToProfileFragment().setScreenName("User Profile");
                Navigation.findNavController(v).navigate(navDirections);

            }
        });

        return v;
    }
}
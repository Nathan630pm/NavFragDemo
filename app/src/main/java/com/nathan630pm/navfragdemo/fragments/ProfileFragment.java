package com.nathan630pm.navfragdemo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nathan630pm.navfragdemo.R;


public class ProfileFragment extends Fragment {

    private TextView textView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        textView = v.findViewById(R.id.textView1);

        String label = ProfileFragmentArgs.fromBundle(getArguments()).getScreenName();

        textView.setText(label);

        v.findViewById(R.id.textView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_profileFragment_to_settingsFragment);
            }
        });

        return v;
    }
}
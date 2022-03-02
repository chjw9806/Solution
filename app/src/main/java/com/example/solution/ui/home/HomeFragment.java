package com.example.solution.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceControl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.solution.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //getChildFragmentManager().beginTransaction().replace(R.id.simple_list_item_1,new )
        final Button button1 = root.findViewById(R.id.button);
        final Button button2 = root.findViewById(R.id.button2);

//        button1.setOnClickListener((View.OnClickListener) this);
//        button2.setOnClickListener((View.OnClickListener) this);
        //final TextView textView = root.findViewById(R.id.txt_con);
        //final TextView textView = root.findViewById(R.id.txt_vow);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getChildFragmentManager().beginTransaction().replace(R.id.simple_list_item_1,new Fragment1()).commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getChildFragmentManager().beginTransaction().replace(R.id.simple_list_item_1,new Fragment2()).commit();

            }
        });

       /*homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}
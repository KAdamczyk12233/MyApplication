package com.example.myapplication.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    private static void onClick(View view) {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        Button button = getView().findViewById(R.id.button);
        Button button1 = getView().findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userText = getView().findViewById(R.id.userText);
                MainFragmentDirections.MainToSecond action = MainFragmentDirections.mainToSecond();
                action.setMessage(userText.getText().toString());
                Navigation.findNavController(view).navigate(action);
            }
        });

        button1.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.action_global_thirdFragment));





//        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mainToSecond,null));
    }

}

package com.example.sockdack_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MemoryFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_memory, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("오늘의 메모장");
        actionBar.setDisplayHomeAsUpEnabled(false);

        view.findViewById(R.id.memolist_btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(MemoryFragment.this).navigate(R.id.action_memoryFragment_to_memoList);
            }
        });
        view.findViewById(R.id.save_btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getActivity(), "오늘의 메모가 저장되었습니다.", Toast.LENGTH_LONG).show();
            }
        });

    }
}
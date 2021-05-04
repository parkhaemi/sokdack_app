package com.example.sockdack_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoList extends Fragment {

    ListView listView;
    MemoViewAdapter adapter;

    long now = System.currentTimeMillis();

    Date mDate = new Date(now);

    SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy.MM.dd");
    String getTime = simpleDate.format(mDate);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_memo_list, container, false);

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("메모 리스트");
        actionBar.setDisplayHomeAsUpEnabled(false);
        listView = view.findViewById(R.id.memolist);

        adapter = new MemoViewAdapter();
        adapter.addItem(new MemoItem( getTime , "Don't give up!"));

        listView.setAdapter(adapter);
    }

}
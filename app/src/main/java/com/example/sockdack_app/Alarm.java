package com.example.sockdack_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Alarm extends Fragment {

    TextView textView;
    TimerTask timerTask;
    Timer timer = new Timer();
    public EditText read_time;
    public int p_read_time;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alarm, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("타이머");
        actionBar.setDisplayHomeAsUpEnabled(false);

        textView = view.findViewById(R.id.textView2);
        read_time = view.findViewById(R.id.read_time);

        view.findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startTimerTask();
            }
        });
        view.findViewById(R.id.btnReset).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                stopTimerTask();
            }
        });

        view.findViewById(R.id.btnSet).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                p_read_time = Integer.parseInt(read_time.getText().toString());
                textView.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    public void onDestroy() {
        timer.cancel();
        super.onDestroy();
    }



    private void startTimerTask() {
        stopTimerTask();

        timerTask = new TimerTask() {

            int count = p_read_time*60;

            @Override
            public void run() {
                count--;
                textView.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(count/60 + "분" + count%60 + "초");
                    }
                });
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }

    private void stopTimerTask() {
        if (timerTask != null) {
            textView.setText("0분 0초");
            timerTask.cancel();
            timerTask = null;
        }
    }
}
package com.example.sockdack_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/*
 * A simple {@link Fragment} subclass.
 * Use the {@link MyPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyPage extends Fragment {

    /*// TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    /*
    public static MyPage newInstance(String param1, String param2) {
        MyPage fragment = new MyPage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_page, container, false);
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("마이페이지");
        actionBar.setDisplayHomeAsUpEnabled(false);


        view.findViewById(R.id.btnUserInfo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(MyPage.this).navigate(R.id.action_mypage_to_userInfoChange);
            }
        });
        view.findViewById(R.id.my1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(MyPage.this).navigate(R.id.action_mypage_to_myLibrary);
            }
        });
        view.findViewById(R.id.my2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(MyPage.this).navigate(R.id.action_mypage_to_memoryFragment);
            }
        });
        view.findViewById(R.id.my3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(MyPage.this).navigate(R.id.action_mypage_to_alarm);
            }
        });

    }
    /*public void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_nav_main,fragment).addToBackStack(null).commit();
    }
    */
}
package com.example.sockdack_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    //private BottomNavigationView bottomNavigationView;
    /*public FragmentManager fm = getSupportFragmentManager();
    public FragmentTransaction ft = fm.beginTransaction() ;
    public Home home;
    private MyPage mypage;
    private CheckList checklist;
    private Today_Book today_book;
    //private final int today_book = 1;
    private final int recommendation = 2;*/

    //private Object NavController;
    //private Object navController =  NavController;
   // findNavController(R.id.main_nav);

    @Override
    //private 이었음
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this, R.id.fragment_nav_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                //R.id.home, R.id.myPage, R.id.checkList
                navController.getGraph())
                .build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView,navController);


        //navigation view

        /*여기bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.checklist:
                        setFrag(0);
                        break;
                    case R.id.home:
                        setFrag(1);
                        break;
                    case R.id.mypage:
                        setFrag(2);
                        break;
                }
                return true;
            }
        });
        home = new Home();
        mypage = new MyPage();
        checklist = new CheckList();
        여기*/


        /*today_book = new Today_Book();
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ft.replace(R.id.main_frame,today_book);
                ft.commit();
            }
        });
        */



        //setFrag(1); //첫 프래그먼트 화면을 무엇으로 지정해줄 것인지 선택

        /*findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(recommendation);
            }
        });
        */
    }

    //프레그먼트 교체가 일어나는 실행문이다.
    /*여기public void setFrag(int n) {
         //실제적인 프레그먼트 교체에서 사용
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame,checklist);
                ft.commit(); //저장의미
                break;
            case 1:
                ft.replace(R.id.main_frame,home);
                ft.commit(); //저장의미
                break;
            case 2:
                ft.replace(R.id.main_frame,mypage);
                ft.commit(); //저장의미
                break;
        }
    }여기*/

    /*private void FragmentView(int fragment){

        //FragmentTransactiom를 이용해 프래그먼트를 사용합니다.
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                // 첫번 째 프래그먼트 호출
                Today_Book today_book = new Today_Book();
                transaction.replace(R.id.main_frame, today_book);
                transaction.commit();
                break;

            case 2:
                // 두번 째 프래그먼트 호출
                Recommendation recommendation = new Recommendation();
                transaction.replace(R.id.main_frame, recommendation);
                transaction.commit();
                break;
        }
    }
    */






}
package com.example.sockdack_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class UserInfoChange extends Fragment{
    FirebaseDatabase database;
    DatabaseReference databaseReference;
    public EditText editTextEmail;
    public EditText editTextPassword;
    public EditText editTextName;
    private EditText editTextAge;
    private EditText editTextGender;
    private EditText editTextJob;
    private Button buttonAdd;
    public String person_name;


    public UserInfoChange() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_info_change, container, false);

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ActionBar actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("개인정보 수정");
        actionBar.setDisplayHomeAsUpEnabled(false);

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference();

        editTextEmail = view.findViewById(R.id.editText_email);
        editTextPassword = view.findViewById(R.id.editText_passWord);
        editTextName = view.findViewById(R.id.editText_name);

        editTextAge = view.findViewById(R.id.editText_age);
        editTextGender = view.findViewById(R.id.editText_gender);
        editTextJob = view.findViewById(R.id.editText_job);

        /*String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
        String name = editTextName.getText().toString();


        person_name = name;
         */

        String age = editTextAge.getText().toString();
        String gender = editTextGender.getText().toString();
        String job = editTextJob.getText().toString();

        view.findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                /*databaseReference.child(person_name).child("name").setValue(editTextName.getText().toString());
                databaseReference.child(person_name).child("email").setValue(editTextEmail.getText().toString());
                databaseReference.child(person_name).child("pw").setValue(editTextPassword.getText().toString());
                */
                databaseReference.child("user").child("age").setValue(editTextAge.getText().toString());
                databaseReference.child("user").child("gender").setValue(editTextGender.getText().toString());
                databaseReference.child("user").child("job").setValue(editTextJob.getText().toString());
                Toast.makeText(getActivity(), "회원정보를 저장했습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
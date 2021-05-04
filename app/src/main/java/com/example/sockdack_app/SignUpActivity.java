package com.example.sockdack_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity{
    private FirebaseAuth firebaseAuth;
    FirebaseDatabase database;
    DatabaseReference databaseReference;
    public EditText editTextEmail;
    public EditText editTextPassword;
    public EditText editTextName;
    private Button buttonJoin;
    public String email;
    public String password;
    public String name;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firebaseAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference();

        editTextEmail = (EditText) findViewById(R.id.editText_email);
        editTextPassword = (EditText) findViewById(R.id.editText_passWord);
        editTextName = (EditText) findViewById(R.id.editText_name);

        buttonJoin = (Button) findViewById(R.id.btn_join);
        buttonJoin.setOnClickListener(new View.OnClickListener() {

        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();
        String name = editTextName.getText().toString();

            @Override
            public void onClick(View v) {
                if (!editTextEmail.getText().toString().equals("") && !editTextPassword.getText().toString().equals("")) {
                    // 이메일과 비밀번호가 공백이 아닌 경우
                    //createUser(email, password, name);
                    createUser(editTextEmail.getText().toString(),editTextPassword.getText().toString(),editTextName.getText().toString());
                    databaseReference.child(name).child(name).child("name").setValue(editTextEmail.getText().toString());
                    databaseReference.child(name).child(email).child("email").setValue(editTextPassword.getText().toString());
                    databaseReference.child(name).child(password).child("pw").setValue(editTextName.getText().toString());
                } else {
                    // 이메일과 비밀번호가 공백인 경우
                    Toast.makeText(SignUpActivity.this, "계정과 비밀번호를 입력하세요.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void createUser(String email, String password, String name) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // 회원가입 성공시
                            Toast.makeText(SignUpActivity.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            // 계정이 중복된 경우
                            Toast.makeText(SignUpActivity.this, "이미 존재하는 계정입니다.", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }

    /*public void postFirebaseDatabase(boolean add){
        mPostReference = FirebaseDatabase.getInstance().getReference();
        childUpdates = new HashMap<>();

        if(add){
            userInfo = new UserInfo(ID,PW,name);
            userValue = userInfo.toMap();
        }
        childUpdates.put("/User_info/" + ID, userValue);
        mPostReference.updateChildren(childUpdates);
    }
     */


}

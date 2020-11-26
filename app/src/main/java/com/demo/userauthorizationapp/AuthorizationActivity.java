package com.demo.userauthorizationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthorizationActivity extends AppCompatActivity {

    private EditText mEtLogin;
    private EditText mEtPassword;
    private Button mBtnEnter;
    private Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        mEtLogin = findViewById(R.id.edit_login);
        mEtPassword = findViewById(R.id.edit_password);
        mBtnEnter = findViewById(R.id.button_enter);
        mBtnRegister = findViewById(R.id.button_registration);

        mBtnEnter.setOnClickListener(mOnEnterClickListener);
        mBtnRegister.setOnClickListener(mOnRegisterClickListener);
    }

    private View.OnClickListener mOnEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO: обработка нажатия по кнопке
        }
    };

    private View.OnClickListener mOnRegisterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO: обработка нажатия по кнопке
        }
    };
}
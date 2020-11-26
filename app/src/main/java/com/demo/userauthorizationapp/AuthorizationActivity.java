package com.demo.userauthorizationapp;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AuthorizationActivity extends AppCompatActivity {

    public static String EXTRA_EMAIL = "EXTRA_EMAIL";
    public static String EXTRA_PASSWORD = "EXTRA_PASSWORD";

    private EditText mEtLogin;
    private EditText mEtPassword;
    private Button mBtnEnter;
    private Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        mEtLogin = findViewById(R.id.edit_login_input);
        mEtPassword = findViewById(R.id.edit_password_input);
        mBtnEnter = findViewById(R.id.button_enter);
        mBtnRegister = findViewById(R.id.button_registration);

        mBtnEnter.setOnClickListener(mOnEnterClickListener);
        mBtnRegister.setOnClickListener(mOnRegisterClickListener);
    }

    private View.OnClickListener mOnEnterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (isLoginValid() && isPasswordValid()) {
                Intent startProfileIntent = new Intent(AuthorizationActivity.this, ProfileActivity.class);
                startProfileIntent.putExtra(EXTRA_EMAIL, mEtLogin.getText().toString());
                startProfileIntent.putExtra(EXTRA_PASSWORD, mEtPassword.getText().toString());
                startActivity(startProfileIntent);
            } else {
                showErrorMessage(R.string.error_login_input);
            }
        }
    };

    private View.OnClickListener mOnRegisterClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO: обработка нажатия по кнопке
        }
    };

    private boolean isLoginValid() {
        return !TextUtils.isEmpty(mEtLogin.getText()) && Patterns.EMAIL_ADDRESS.matcher(mEtLogin.getText()).matches();
    }

    private boolean isPasswordValid() {
        return !TextUtils.isEmpty(mEtPassword.getText());
    }

    private void showErrorMessage(@StringRes int string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }
}
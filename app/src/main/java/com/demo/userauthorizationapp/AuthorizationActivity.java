package com.demo.userauthorizationapp;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

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
            if (isLoginValid() && isPasswordValid()) {
                // TODO: перейти в профиль пользователя (приложение)
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
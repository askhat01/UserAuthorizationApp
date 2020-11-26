package com.demo.userauthorizationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {

    private AppCompatImageView mUserPhoto;
    private EditText mUserLogin;
    private EditText mUserPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mUserPhoto = findViewById(R.id.image_user_photo);
        mUserLogin = findViewById(R.id.edit_user_login);
        mUserPassword = findViewById(R.id.edit_user_password);

        mUserPhoto.setOnClickListener(mOnPhotoClickListener);

        Bundle bundle = getIntent().getExtras();
        mUserLogin.setText(bundle.getString(AuthorizationActivity.EXTRA_EMAIL));
        mUserPassword.setText(bundle.getString(AuthorizationActivity.EXTRA_PASSWORD));
    }

    private View.OnClickListener mOnPhotoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO: обраотка нажатия на фото профиля
        }
    };
}
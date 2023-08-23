package me.app.demo;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private TextView forgot_password_text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        forgot_password_text = findViewById(R.id.forgot_pass_tv);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick( View widget) {
                Intent intent = new Intent(RegisterActivity.this,ForgetPasswordActivity.class);
            }
        };
    }
}

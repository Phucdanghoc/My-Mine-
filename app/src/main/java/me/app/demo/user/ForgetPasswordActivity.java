package me.app.demo.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.app.demo.R;

public class ForgetPasswordActivity extends AppCompatActivity {
    private EditText email;
    private Button send_OTP;
    private LinearLayout layout_email,layout_otp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        email = findViewById(R.id.email_et);
        send_OTP = findViewById(R.id.send_btn);
        layout_email = findViewById(R.id.layout_input_email);
        layout_otp = findViewById(R.id.layout_otp);


        send_OTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_email.setVisibility(View.GONE);
                layout_email.setEnabled(false);

                layout_otp.setEnabled(true);
                layout_otp.setVisibility(View.VISIBLE);
            }
        });



    }

}

package com.masai.eventlisteners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEtOne;
    private TextView mTvOne;
    private Button mBtnOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtOne = findViewById(R.id.etOne);
        mTvOne = findViewById(R.id.tvOne);
        mBtnOne = findViewById(R.id.btnOne);
        mEtOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 6) {
                    Toast.makeText(MainActivity.this, s,Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvOne.setText("Button Clicked");
            }
        });
    }
}
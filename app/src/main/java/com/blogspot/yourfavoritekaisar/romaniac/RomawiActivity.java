package com.blogspot.yourfavoritekaisar.romaniac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RomawiActivity extends AppCompatActivity {

    @BindView(R.id.augustus)
    Button augustus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romawi);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.augustus)
    public void onViewClicked() {
        Toast.makeText(this,"App masih dalam tahap pengembang \nSilahkan Email ammaralghifary@gmail.com buat Hub",Toast.LENGTH_SHORT).show();


    }
}

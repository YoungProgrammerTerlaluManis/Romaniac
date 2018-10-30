package com.blogspot.yourfavoritekaisar.romaniac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.logo)
    ImageView logo;
    @BindView(R.id.thrower)
    Button thrower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.thrower)
    public void onViewClicked() {
        Intent pindah = new Intent(MainActivity.this, detailCaesarActivity.class);
        startActivity(pindah);
    }
}

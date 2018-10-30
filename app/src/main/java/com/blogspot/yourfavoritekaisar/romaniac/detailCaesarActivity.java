package com.blogspot.yourfavoritekaisar.romaniac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class detailCaesarActivity extends AppCompatActivity {

    @BindView(R.id.spqr)
    Button spqr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_caesar);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.spqr)
    public void onViewClicked() {
        Intent pindah = new Intent(detailCaesarActivity.this, RomawiActivity.class);
        startActivity(pindah);
    }
}

    package com.example.firstprojeck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

    public class AktifitasKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktifitas_kedua);

        TextView tv = findViewById(R.id.tv_text);

        Bundle ambil = getIntent().getExtras();
        if (ambil == null){
            return;
        }

        String nama = ambil.getString("nama_key");
        String alamat = ambil.getString("alamat_key");

        if (nama != null){
            tv.setText(nama);
        }

        if (alamat != null){
            tv.setText(alamat);
        }
    }
}
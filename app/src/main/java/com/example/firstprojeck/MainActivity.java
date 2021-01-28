package com.example.firstprojeck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHW = findViewById(R.id.tv_hw);
        final TextView txtNama = findViewById(R.id.tv_nama);
        final TextView txtAlamat = findViewById(R.id.tv_alamat);

        txtHW.setText("Selamat Datang");
        txtNama.setText("Guboy");
        txtAlamat.setText("Di Rasau");
        Button btnMove = findViewById(R.id.btn_pindah);

        txtNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan "+txtNama.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        
        txtAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Anda menekan tulisan alamat",
                        Toast.LENGTH_SHORT).show();
            }
        });

        txtHW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                Toast.makeText(MainActivity.this, "Anda menekan sebanyak "+jumlah+" kali",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AktifitasKedua.class);
                intent.putExtra("nama_key", txtNama.getText());
                intent.putExtra("alamat_key", txtAlamat.getText());
                startActivity(intent);
                finish();
                onAttachedToWindow();

            }
        });
    }
}
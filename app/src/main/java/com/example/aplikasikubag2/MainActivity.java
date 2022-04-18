package com.example.aplikasikubag2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNama, edtSemester, edtAlas, edtTinggi;
    private Button btnTampilkan;
    private TextView tvNama, tvSemester,tvAlas, tvTinggi, tvKel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama = (EditText)findViewById(R.id.edt_nama);
        edtSemester = (EditText)findViewById(R.id.edt_semester);
        edtAlas = (EditText)findViewById(R.id.edt_alas);
        edtTinggi = (EditText)findViewById(R.id.edt_tinggi);
        btnTampilkan = (Button)findViewById(R.id.btn_tampilkan);
        tvNama = (TextView)findViewById(R.id.tv_hasil);
        tvSemester = (TextView)findViewById(R.id.tv_hasil2);
        tvAlas = (TextView)findViewById(R.id.tv_hasil3);
        tvTinggi = (TextView)findViewById(R.id.tv_hasil4);
        tvKel = (TextView)findViewById(R.id.tv_hasil5);
        btnTampilkan.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_tampilkan){
            String nama = edtNama.getText().toString().trim();
            String semester = edtSemester.getText().toString().trim();
            String alas = edtAlas.getText().toString().trim();
            String tinggi = edtTinggi.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(nama)){
                isEmptyFields = true;
                edtNama.setError("Kolom ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(semester)){
                isEmptyFields = true;
                edtSemester.setError("Kolom ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(alas)){
                isEmptyFields = true;
                edtAlas.setError("Kolom ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(tinggi)){
                isEmptyFields = true;
                edtTinggi.setError("Kolom ini tidak boleh kosong");
            }
            if (!isEmptyFields){
                String n = String.valueOf(nama);
                String s = String.valueOf(semester);
                double a = Double.parseDouble(alas);
                double t = Double.parseDouble(tinggi);
                double kel = a + a + a;
                double luas = a * t / 2;
                tvNama.setText("Nama saya " +n);
                tvSemester.setText("Saya semester " +s);
                tvAlas.setText(String.valueOf("Luas segitiga dengan alas " +a));
                tvTinggi.setText(String.valueOf("dan tinggi " +t +" adalah " +luas));
                tvKel.setText(String.valueOf("dan keliling segitiga tersebut adalah "+kel));


            }

        }
    }
}
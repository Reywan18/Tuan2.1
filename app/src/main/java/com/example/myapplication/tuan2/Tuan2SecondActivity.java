package com.example.myapplication.tuan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Tuan2SecondActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan2_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tv1=findViewById(R.id.Tuan2tv1);
        Intent i1= getIntent();
        String chuoi1=i1.getExtras().getString("SoA");
        String chuoi2=i1.getExtras().getString("SoB");
        float SoA=Float.parseFloat(chuoi1);
        float SoB=Float.parseFloat(chuoi2);
        float tong=SoA+SoB;
        tv1.setText(String.valueOf(tong));
    }
}
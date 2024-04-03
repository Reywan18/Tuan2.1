package com.example.myapplication.tuan2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Tuan2MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan2_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txt1=findViewById(R.id.Tuan2txt1);
        txt2=findViewById(R.id.Tuan2txt2);
        btn1=findViewById(R.id.Tuan2btn1);
        btn1.setOnClickListener(v->{
            Intent i=new Intent(Tuan2MainActivity.this,
                    Tuan2SecondActivity.class);
            i.putExtra("SoA", txt1.getText().toString());
            i.putExtra("SoB", txt2.getText().toString());
            startActivity(i);
        });
    }
}
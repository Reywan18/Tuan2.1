package com.example.myapplication.tuan3;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main2);
        lv=findViewById(R.id.tuan32lv);
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.apple));
        ls.add(new T32Contact("Tran Van B","19",R.drawable.android));
        ls.add(new T32Contact("Vu Van C","16",R.drawable.blogger));
        ls.add(new T32Contact("Nguyen Thi D","22",R.drawable.chrome));
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.facebook));
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.hancock));

        adapter=new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}
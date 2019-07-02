package com.example.mcsahat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Kevin Asri Ramadhani", "JL.Gendang belek ", "64030522039700005"));
        mahasiswaArrayList.add(new Mahasiswa("Yosep Jonatan", "JL. Hidup Merdeka", "64030521069700004"));
        mahasiswaArrayList.add(new Mahasiswa("Riskan Aditya", "JL. Merdeka", "640305190196500005"));
        mahasiswaArrayList.add(new Mahasiswa("Adit", "JL. Cinta Kita", "64030522039700005"));
        mahasiswaArrayList.add(new Mahasiswa("Sahat", "JL. nin aja dulu", "64030522039700005"));
        mahasiswaArrayList.add(new Mahasiswa("Vantri Saladan", "JL. BPK Enak", "64030518129700001"));
    }

}

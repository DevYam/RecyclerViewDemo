package com.ncertguruji.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = this.findViewById(R.id.sampleList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");
        languages.add("java");

        ArrayList<String> aboutLanguages = new ArrayList<>();
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");
        aboutLanguages.add("about java");



        ArrayList<Integer> imgId = new ArrayList<>();
        imgId.add(R.drawable.ic_android_black_24dp);
        imgId.add(R.drawable.ic_android_black_24dp);
        imgId.add(R.drawable.ic_android_black_24dp);
        imgId.add(R.drawable.ic_android_black_24dp);
        imgId.add(R.mipmap.ic_launcher_round);
        imgId.add(R.mipmap.ic_launcher_round);
        imgId.add(R.mipmap.ic_launcher_round);
        imgId.add(R.mipmap.ic_launcher_round);
        imgId.add(R.mipmap.ic_launcher_round);
        imgId.add(R.mipmap.ic_launcher_round);



        recyclerView.setAdapter(new SimpleListAdapter(languages, aboutLanguages, imgId));

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        Toast.makeText(MainActivity.this, languages.get(position), Toast.LENGTH_SHORT).show();
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                        Toast.makeText(MainActivity.this, aboutLanguages.get(position), Toast.LENGTH_SHORT).show();

                    }
                })
        );
    }
}
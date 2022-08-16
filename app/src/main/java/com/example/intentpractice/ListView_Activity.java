package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListView_Activity extends AppCompatActivity {
     ArrayList<String> friendlist = new ArrayList<String>();
    ListView listView;
    ArrayList<Students> studentArrayList;
    EditText editText;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        friendlist.add("Asim");
        friendlist.add("Ans");
        friendlist.add("Zain");
        friendlist.add("Mahad");
        friendlist.add("Jawad");
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendlist);
        listView = findViewById(R.id.Listview);
        listView.setAdapter(arrayAdapter);

//        ArrayList<Students> studentArrayList = new ArrayList<Students>();
//        studentArrayList.add(new Students("Ans", "Alpha", "1", "A", R.drawable.a1));
//        studentArrayList.add(new Students("Saad", "Beta", "2", "B", R.drawable.a2));
//        studentArrayList.add(new Students("Aila", "Alpha", "5", "C", R.drawable.a3));
//        studentArrayList.add(new Students("Aiman", "Beta", "6", "D", R.drawable.a4));
//        myAdapter adapter = new myAdapter(this, studentArrayList);
//        ListView listView = findViewById(R.id.Listview);
//        listView.setAdapter(adapter);
    }

    public void addOnClick(View view) {
        editText = findViewById(R.id.editAddName);
        friendlist.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();
    }
}
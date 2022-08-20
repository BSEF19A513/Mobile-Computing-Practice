package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DBActivity extends AppCompatActivity {

    Button buttonAdd, buttonViewAll;
    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbactivity);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonViewAll = findViewById(R.id.buttonViewAll);
        editName = findViewById(R.id.editTextName);
        editRollNumber = findViewById(R.id.editTextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);
        listView = findViewById(R.id.Listview);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    studentModel = new StudentModel(editName.getText().toString(), (editRollNumber.getText().toString()), switchIsActive.isChecked());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(DBActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(DBActivity.this);
                dbHelper.addStudent(studentModel);
            }
        });

        buttonViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(DBActivity.this);
//                ArrayList<StudentModel> list = dbHelper.getAllStudents();
                ArrayList<StudentModel> studentModelArrayList = new ArrayList<StudentModel>();
//                ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
//                        (DBActivity.this, android.R.layout.simple_list_item_1,list);
//                listViewStudent.setAdapter(arrayAdapter);
                studentModelArrayList.add(new StudentModel("Hassan","bsef19a513",false));
                studentModelArrayList.add(new StudentModel("Asim","bsef19a542",true));
                studentModelArrayList.add(new StudentModel("Mahnoor","bsef19a502",false));
                myAdapter adapter = new myAdapter(DBActivity.this,studentModelArrayList);
                listView.setAdapter(adapter);
            }
        });

    }
}
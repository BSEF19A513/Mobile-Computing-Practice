package com.example.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1OnClick(View view) {
        Uri numberUri = Uri.parse("tel:+923024448659");
        Intent intent = new Intent(Intent.ACTION_DIAL,numberUri);
        startActivity(intent);
    }
    public void button2OnClick(View view) {
        Intent intent = new Intent(MainActivity.this,ListView_Activity.class);
        startActivity(intent);
    }

    public void button3OnClick(View view) {
        String url = "https:www.google.com";
        Uri urlUri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,urlUri);
        startActivity(intent);
    }

    public void button4OnClick(View view) {
        String address[] = {"hassanzahid44311@gmail.com"};
        String CC[] = {"hassanzahid443115@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL,address);
        intent.putExtra(Intent.EXTRA_CC,CC);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Very Important");
            startActivity(intent);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,"This is toast",Toast.LENGTH_LONG);
        toast.show();
    }
}
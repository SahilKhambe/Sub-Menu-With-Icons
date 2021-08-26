package com.example.submenuwithicons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.sub_item_1:
                Toast.makeText(MainActivity.this, "Sub Item 1", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, SubItem1.class);
                startActivity(intent);
                break;

            case R.id.sub_item_2:
                Toast.makeText(MainActivity.this, "Sub Item 2", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(MainActivity.this, SubItem2.class);
                startActivity(intent1);
                break;

            case R.id.sub_item_3:
                Toast.makeText(MainActivity.this, "Sub Item 3", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(MainActivity.this, SubItem3.class);
                startActivity(intent2);
                break;

            case R.id.sub_item_4:
                Toast.makeText(MainActivity.this, "Sub Item 4", Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(MainActivity.this, SubItem4.class);
                startActivity(intent3);
                break;

            case R.id.sub_item_5:
                Toast.makeText(MainActivity.this, "Sub Item 5", Toast.LENGTH_LONG).show();
                Intent intent4 = new Intent(MainActivity.this, SubItem5.class);
                startActivity(intent4);
                break;

            case R.id.sub_item_6:
                Toast.makeText(MainActivity.this, "Sub Item 6", Toast.LENGTH_LONG).show();
                Intent intent5 = new Intent(MainActivity.this, SubItem6.class);
                startActivity(intent5);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
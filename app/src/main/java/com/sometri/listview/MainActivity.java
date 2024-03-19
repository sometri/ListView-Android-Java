package com.sometri.listview;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create student data
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sometri", 100, "A"));
        students.add(new Student("John", 101, "A"));
        students.add(new Student("Alice", 102, "B"));
        students.add(new Student("Bob", 103, "C"));
        students.add(new Student("Oeng", 104, "A"));

        // Set up ListView with custom adapter
        StudentAdapter adapter = new StudentAdapter(this, students);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}

package com.example.task_4;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView customListView;
    private ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Custom ListView setup
        customListView = findViewById(R.id.customListView);
        ArrayList<ListItem> items = new ArrayList<>();
        items.add(new ListItem(R.drawable.img, "foodpanda"));
        items.add(new ListItem(R.drawable.img_1, "Foodi"));
        items.add(new ListItem(R.drawable.img_2, "Pathao"));

        CustomAdapter customAdapter = new CustomAdapter(this, items);
        customListView.setAdapter(customAdapter);

        // Expandable ListView setup
        expandableListView = findViewById(R.id.expandableListView);

        // Parent items
        ArrayList<String> parentList = new ArrayList<>();
        parentList.add("Item 1 - Chinese");
        parentList.add("Item 2 - Bengali");
        parentList.add("Item 3 - Indian");

        // Child items
        HashMap<String, ArrayList<String>> childMap = new HashMap<>();

        ArrayList<String> chinese = new ArrayList<>();
        chinese.add("Hot pot");
        chinese.add("Dim sum");
        chinese.add("Congee");
        childMap.put("Item 1 - Chinese", chinese);

        ArrayList<String> bengali = new ArrayList<>();
        bengali.add("Shukto");
        bengali.add("Misti doi");
        bengali.add("Aloo Posto");
        childMap.put("Item 2 - Bengali", bengali);


        ArrayList<String> indian = new ArrayList<>();
        indian.add("Idli");
        indian.add("Masala dosa");
        indian.add("Dosa");
        childMap.put("Item 3 - Indian", indian);

        // Set up ExpandableListAdapter
        ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(this, parentList, childMap);
        expandableListView.setAdapter(expandableListAdapter);
    }
}
package com.tonyjstudio.pickerlikeios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Picker picker = findViewById(R.id.picker);
        List<String> arrItems = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrItems.add("Item " + i);
        }
        picker.setItems(arrItems);
        picker.setTextSize(20);
        picker.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
}

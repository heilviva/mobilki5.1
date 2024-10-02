package com.example.mobilki51;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;
        private FlowerAdapter flowerAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            recyclerView = findViewById(R.id.recyclerview);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            List<Flower> flowerList = createFlowerList();
            flowerAdapter = new FlowerAdapter(flowerList, this);
            recyclerView.setAdapter(flowerAdapter);
        }

        private List<Flower> createFlowerList() {
            List<Flower> flowers = new ArrayList<>();
            flowers.add(new Flower("Роза", "Красивая красная роза.", R.drawable.rose, 250.00));
            flowers.add(new Flower("Тюльпан", "Яркий желтый тюльпан.", R.drawable.tulip, 200.00));
            flowers.add(new Flower("Лилия", "Ароматная белая лилия.", R.drawable.lily, 300.00));
            flowers.add(new Flower("Гвоздика", "Розовая гвоздика.", R.drawable.carnation, 150.00));
            return flowers;
        }
    }

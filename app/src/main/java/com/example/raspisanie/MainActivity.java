package com.example.raspisanie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.raspisanie.AdapterMyLayout2;
import com.example.raspisanie.mylayout2model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMyLayout2 adapterPerson;
    private List<mylayout2model> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.recyclerviewid);
        recyclerView.setHasFixedSize(true);

        list=new ArrayList<>();

        list.add(new mylayout2model("Понедельник","Нахимовский","","","Системное программирование","Технология разработки и защиты базы данных","Разработка программных модулей","","Разработка мобильных приложений","Разработка программных модулей","Физическая культуры",""));
        list.add(new mylayout2model("Вторник","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА",""));
        list.add(new mylayout2model("Среда","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА","","ПРАКТИКА",""));
        list.add(new mylayout2model("Четверг","Неженская","Инструментальные средства разработки ПО","","Технология разработки ПО","","Иностранный язык","","Технология разработки и защиты БД","","",""));
        list.add(new mylayout2model("Пятница","Нахимовский","","","Системное программирование","","Разработка программных модулей","","Технология разработки ПО","Инструментальные средства разработки ПО","Разработка мобильных приложений",""));

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        adapterPerson=new AdapterMyLayout2(MainActivity.this,this.list);
        recyclerView.setAdapter(adapterPerson);
    }


}

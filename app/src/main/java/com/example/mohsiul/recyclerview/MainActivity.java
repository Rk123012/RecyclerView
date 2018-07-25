package com.example.mohsiul.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @BindView(R.id.recyclerView)  RecyclerView mRecyclerView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ArrayList<Example_Item> exampleList= new ArrayList<>();
        exampleList.add(new Example_Item(R.mipmap.cup,"Cupcake", "Version:1.5 API level:3"));
        exampleList.add(new Example_Item(R.mipmap.donut,"Donut", "Version1.6 API leve:4"));
        exampleList.add(new Example_Item(R.mipmap.eclair,"Eclair", "Version1.6 API leve:4"));
        exampleList.add(new Example_Item(R.mipmap.froyo,"Froyo", "Version1.6 API leve:4"));
        exampleList.add(new Example_Item(R.mipmap.gingerbread,"Gingerbread", "Version1.6 API leve:4"));
        exampleList.add(new Example_Item(R.mipmap.jellybean,"Jelly Bean", "Version1.6 API leve:4"));
        exampleList.add(new Example_Item(R.mipmap.oreo,"Oreo", "Version1.6 API leve:4"));
        exampleList.add(new Example_Item(R.mipmap.honeycomb,"Honey Comb", "Version1.6 API leve:4"));



        //mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);





    }



}

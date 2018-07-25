package com.example.mohsiul.recyclerview;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_LONG;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    private ArrayList<Example_Item>mExampleList;






    public ExampleAdapter(ArrayList<Example_Item>examplelist){
        mExampleList=examplelist;



    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        ExampleViewHolder evh=new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, final int position) {
        final Example_Item currentItem=mExampleList.get(position);
        //final Example_Item itemPosition= Example_Item.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        holder.mrelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You Clicked "+position+" : "+currentItem.getText1(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public  class ExampleViewHolder extends RecyclerView.ViewHolder
    {
        public  ImageView mImageView;
        public TextView mTextView1;
        public  TextView mTextView2;
        public RelativeLayout mrelativeLayout;
        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.imageView);
            mTextView1=itemView.findViewById(R.id.textView1);
            mTextView2=itemView.findViewById(R.id.textView2);
            mrelativeLayout=itemView.findViewById(R.id.layout1);


        }


    }






    @Override
    public int getItemCount() {
        return mExampleList.size();
    }




}

package com.example.thuchanh4;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class AdapterList extends  RecyclerView.Adapter<AdapterList.ViewHoder>{

    ArrayList<list> lists;
    Context context;
    int layout_row;

    public AdapterList(ArrayList<list> lists, Context context,int layout_row) {
        this.lists = lists;
        this.context = context;
        this.layout_row = layout_row;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(layout_row,parent,false);
        return new ViewHoder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        holder.txtTen.setText(lists.get(position).getTen());
        holder.imgHinh.setImageResource(lists.get(position).getAnh());
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder{

        TextView txtTen;
        ImageView imgHinh;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);

            txtTen = (TextView) itemView.findViewById(R.id.tv_ten);
            imgHinh = (ImageView) itemView.findViewById(R.id.img);

        }
    }

}

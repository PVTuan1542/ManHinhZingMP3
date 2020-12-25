package com.example.thuchanh4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thuchanh4.zingchart;

import java.util.ArrayList;


public class AdapterZingchart extends RecyclerView.Adapter<AdapterZingchart.ViewHolder>{
    ArrayList<zingchart> zingcharts;
    Context context;
    int layout_row;


    public AdapterZingchart(ArrayList<zingchart> zingcharts, Context context, int layout_row) {
        this.zingcharts = zingcharts;
        this.context = context;
        this.layout_row = layout_row;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(layout_row,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTen.setText(zingcharts.get(position).getTen());

        holder.imgHinh.setImageResource(zingcharts.get(position).getAnh());

        holder.txtCaSi.setText(zingcharts.get(position).getCasi());

        if(zingcharts.get(position).getTop()<10){
            holder.txtTop.setText("0"+String.valueOf(zingcharts.get(position).getTop()));

            if(zingcharts.get(position).getTop()==1){
                holder.txtTop.setTextColor(Color.BLUE);
            }else if (zingcharts.get(position).getTop()==2){
                holder.txtTop.setTextColor(Color.GREEN);
            }else if(zingcharts.get(position).getTop()==3){
                holder.txtTop.setTextColor(Color.RED);
            }

        }else{
            holder.txtTop.setText(String.valueOf(zingcharts.get(position).getTop()));
        }


    }

    @Override
    public int getItemCount() {
        return zingcharts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtTen,txtCaSi,txtTop ;
        ImageView imgHinh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen = (TextView) itemView.findViewById(R.id.tenBaiHat);
            txtCaSi = (TextView) itemView.findViewById(R.id.tenCaSi);
            txtTop = (TextView) itemView.findViewById(R.id.top);
            imgHinh = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}


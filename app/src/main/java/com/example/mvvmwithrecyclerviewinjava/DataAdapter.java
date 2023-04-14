package com.example.mvvmwithrecyclerviewinjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private final List<DataModel> dataModelList;
    View view;

    public DataAdapter(List<DataModel> dataModelList){
        this.dataModelList = dataModelList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_item,
                parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        try{
            holder.image.setImageResource(dataModelList.get(position).getLogo());
        }catch (Exception e){
            //
        }
        try{
            holder.text_name.setText(dataModelList.get(position).getName());
        }catch (Exception e){
            //
        }
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private MaterialTextView text_name;
        private CircleImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_name = itemView.findViewById(R.id.text_name);
            image = itemView.findViewById(R.id.image);
        }
    }
}

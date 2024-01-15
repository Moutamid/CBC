package com.moutamid.bankingapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.bankingapp.R;
import com.moutamid.bankingapp.activities.DetailActivity;
import com.moutamid.bankingapp.model.TopModel;

import java.util.ArrayList;

public class DashTopAdapter extends RecyclerView.Adapter<DashTopAdapter.TopVH> {

    Context context;
    ArrayList<TopModel> list;

    public DashTopAdapter(Context context, ArrayList<TopModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TopVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopVH(LayoutInflater.from(context).inflate(R.layout.top_cards, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopVH holder, int position) {
        TopModel model = list.get(holder.getAdapterPosition());

        holder.name.setText(model.name);
        String[] money = model.money.split(",");
        holder.beforeDec.setText(money[0]);
        holder.afterDec.setText("," + money[1] + " EUR");

        holder.itemView.setOnClickListener(v -> {
            if (model.money.equals("0,77")){
                context.startActivity(new Intent(context, DetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TopVH extends RecyclerView.ViewHolder{
        TextView beforeDec, afterDec, name;
        public TopVH(@NonNull View itemView) {
            super(itemView);
            beforeDec = itemView.findViewById(R.id.beforeDec);
            afterDec = itemView.findViewById(R.id.afterDec);
            name = itemView.findViewById(R.id.name);
        }
    }

}

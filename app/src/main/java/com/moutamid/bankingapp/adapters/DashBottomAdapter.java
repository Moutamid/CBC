package com.moutamid.bankingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.bankingapp.R;
import com.moutamid.bankingapp.model.BottomModel;
import com.moutamid.bankingapp.model.TopModel;

import java.util.ArrayList;

public class DashBottomAdapter extends RecyclerView.Adapter<DashBottomAdapter.TopVH> {

    Context context;
    ArrayList<BottomModel> list;

    public DashBottomAdapter(Context context, ArrayList<BottomModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TopVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopVH(LayoutInflater.from(context).inflate(R.layout.bottom_rc, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopVH holder, int position) {
        BottomModel model = list.get(holder.getAdapterPosition());
        holder.bottom.setText(model.bottom);
        holder.top.setText(model.top);
        holder.icon.setImageResource(model.icon);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TopVH extends RecyclerView.ViewHolder{
        TextView top, bottom;
        ImageView icon;
        public TopVH(@NonNull View itemView) {
            super(itemView);
            top = itemView.findViewById(R.id.top);
            bottom = itemView.findViewById(R.id.bottom);
            icon = itemView.findViewById(R.id.icon);
        }
    }

}

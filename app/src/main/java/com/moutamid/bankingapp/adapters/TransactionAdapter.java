package com.moutamid.bankingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.moutamid.bankingapp.R;
import com.moutamid.bankingapp.bottomsheet.BottomSheet;
import com.moutamid.bankingapp.model.BottomModel;
import com.moutamid.bankingapp.model.TransactionModel;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TopVH> {

    Context context;
    ArrayList<TransactionModel> list;

    public TransactionAdapter(Context context, ArrayList<TransactionModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public TopVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopVH(LayoutInflater.from(context).inflate(R.layout.transaction_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopVH holder, int position) {
        TransactionModel model = list.get(holder.getAdapterPosition());
        holder.bottom.setText(model.bottom);
        holder.top.setText(model.top);
        holder.money.setText(model.money);
        holder.icon.setImageResource(model.icon);

        holder.itemView.setOnClickListener(v -> {
            if (v.getContext() instanceof AppCompatActivity) {
                BottomSheet bottomSheet = new BottomSheet(model);
                bottomSheet.show(((AppCompatActivity) v.getContext()).getSupportFragmentManager(), bottomSheet.getTag());
            }
        });

        if (!model.money.startsWith("-"))
            holder.money.setTextColor(context.getResources().getColor(R.color.green));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TopVH extends RecyclerView.ViewHolder{
        TextView top, bottom, money;
        ImageView icon;
        public TopVH(@NonNull View itemView) {
            super(itemView);
            top = itemView.findViewById(R.id.top);
            bottom = itemView.findViewById(R.id.bottom);
            icon = itemView.findViewById(R.id.icon);
            money = itemView.findViewById(R.id.money);
        }
    }

}

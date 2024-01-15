package com.moutamid.bankingapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.moutamid.bankingapp.R;
import com.moutamid.bankingapp.adapters.TransactionAdapter;
import com.moutamid.bankingapp.databinding.ActivityDetailBinding;
import com.moutamid.bankingapp.model.BottomModel;
import com.moutamid.bankingapp.model.TopModel;
import com.moutamid.bankingapp.model.TransactionModel;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    ArrayList<TransactionModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.TRANSPARENT);

        binding.back.setOnClickListener(v -> onBackPressed());

        getList();
    }

    private void getList() {
        list = new ArrayList<>();
        list.add(new TransactionModel(R.drawable.sinusoid,"Vakele Nsingui-Guza J & J", "12,36", "-2500 EURO"));
        list.add(new TransactionModel(R.drawable.bank,"Vakele Nsingui-Guza J & J", "327,97", "500 EURO"));
        list.add(new TransactionModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "0,77", "-25,00 EURO"));
        list.add(new TransactionModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "0,99", "-5,60 EURO"));
        list.add(new TransactionModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "0,00", "60,25"));
        binding.rc.setLayoutManager(new LinearLayoutManager(this));
        TransactionAdapter adapter = new TransactionAdapter(this, list);
        binding.rc.setAdapter(adapter);
    }
}
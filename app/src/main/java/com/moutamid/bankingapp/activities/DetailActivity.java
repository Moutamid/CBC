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
        list.add(new TransactionModel(R.drawable.sinusoid,"Vakele Nsingui-Guza J & J", "Samedi 18 novembre à 10.05 heures \nVirement instantané", "-350,00 EUR", "10.05", "Vakele Nsingui-Guza J & J", "RUE DE LA CONCORDE 48 7100 LA LOUVIERE", "BE05 7320  5543 7975 \nBIC: CREGBEBBXXX", "18 novembre 2023", "18 novembre 2023"));
        list.add(new TransactionModel(R.drawable.bank,"Vakele Nsingui-Guza J & J", "Samedi 18 novembre à 10.05 heures \nVirement instantané", "-65,30 EUR", "10.05", "Vakele Nsingui-Guza J & J", "RUE DE LA CONCORDE 48 7100 LA LOUVIERE", "BE05 7320  5543 7975 \nBIC: CREGBEBBXXX", "18 novembre 2023", "18 novembre 2023"));
        list.add(new TransactionModel(R.drawable.money,"Vakele Nsingui JONAS", "Samedi 18 novembre à 10.05 heures \nVirement instantané", "450,00 EUR", "10.05", "Vakele Nsingui JONAS \nVirement instantané", "RUE DE LA CONCORDE 48 7100 LA LOUVIERE", "BE05 7320  5543 7975 \nBIC: CREGBEBBXXX", "18 novembre 2023", "18 novembre 2023"));
        list.add(new TransactionModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "Samedi 18 novembre à 10.05 heures \nVirement instantané", "25,00 EUR", "10.05", "Vakele Nsingui-Guza J & J", "RUE DE LA CONCORDE 48 7100 LA LOUVIERE", "BE05 7320  5543 7975 \nBIC: CREGBEBBXXX", "18 novembre 2023", "18 novembre 2023"));
        list.add(new TransactionModel(R.drawable.atm_card,"Vakele Nsingui-Guza J & J", "Samedi 18 novembre à 10.05 heures \nVirement instantané", "-205,00 EUR", "10.05", "Vakele Nsingui-Guza J & J", "RUE DE LA CONCORDE 48 7100 LA LOUVIERE", "BE05 7320  5543 7975 \nBIC: CREGBEBBXXX", "18 novembre 2023", "18 novembre 2023"));
        binding.rc.setLayoutManager(new LinearLayoutManager(this));
        TransactionAdapter adapter = new TransactionAdapter(this, list);
        binding.rc.setAdapter(adapter);
    }
}
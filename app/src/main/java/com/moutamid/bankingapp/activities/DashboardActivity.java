package com.moutamid.bankingapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.moutamid.bankingapp.Constants;
import com.moutamid.bankingapp.R;
import com.moutamid.bankingapp.adapters.DashBottomAdapter;
import com.moutamid.bankingapp.adapters.DashTopAdapter;
import com.moutamid.bankingapp.databinding.ActivityDashboardBinding;
import com.moutamid.bankingapp.model.BottomModel;
import com.moutamid.bankingapp.model.TopModel;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    ActivityDashboardBinding binding;
    ArrayList<TopModel> top;
    ArrayList<BottomModel> bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Constants.checkApp(this);

        binding.bottomNav.setItemActiveIndicatorEnabled(false);

        setTopRC();
        setBottomRC();

    }

    private void setBottomRC() {
        bottom = new ArrayList<>();
        binding.bottomRC.setLayoutManager(new LinearLayoutManager(this));
        bottom.add(new BottomModel(R.drawable.sinusoid,"Vakele Nsingui-Guza J & J", "12,36"));
        bottom.add(new BottomModel(R.drawable.bank,"Vakele Nsingui-Guza J & J", "327,97"));
        bottom.add(new BottomModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "0,77"));
        bottom.add(new BottomModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "0,99"));
        bottom.add(new BottomModel(R.drawable.mail_inbox_app,"Vakele Nsingui-Guza J & J", "0,00"));
        DashBottomAdapter adapter = new DashBottomAdapter(this, bottom);
        binding.bottomRC.setAdapter(adapter);
    }

    private void setTopRC() {
        top = new ArrayList<>();
        binding.topRC.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        top.add(new TopModel("Vakele Nsingui-Guza J & J", "12,36"));
        top.add(new TopModel("Vakele Nsingui-Guza J & J", "327,97"));
        top.add(new TopModel("Vakele Nsingui-Guza J & J", "0,77"));
        top.add(new TopModel("Vakele Nsingui-Guza J & J", "0,99"));
        top.add(new TopModel("Vakele Nsingui-Guza J & J", "0,00"));
        DashTopAdapter adapter = new DashTopAdapter(this, top);
        binding.topRC.setAdapter(adapter);
    }
}
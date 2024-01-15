package com.moutamid.bankingapp.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.moutamid.bankingapp.databinding.BottomsheetBinding;
import com.moutamid.bankingapp.model.TransactionModel;

public class BottomSheet extends BottomSheetDialogFragment {
    BottomsheetBinding binding;
    TransactionModel model;

    public BottomSheet(TransactionModel model) {
        this.model = model;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = BottomsheetBinding.inflate(getLayoutInflater(),container, false);



        return binding.getRoot();
    }
}

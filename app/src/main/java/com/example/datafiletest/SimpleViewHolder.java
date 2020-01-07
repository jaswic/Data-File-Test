package com.example.datafiletest;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {
    private TextView largeGrayText, smallGrayText, coverage;

    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);
        largeGrayText = itemView.findViewById(R.id.largeGrayText);
        smallGrayText =itemView.findViewById(R.id.smallGrayText);
        coverage = itemView.findViewById(R.id.coloredBox);
    }

    public void bindData(SphereViewModel viewModel){
        if (viewModel.getCoverage().length() > 4){
            coverage.setText(viewModel.getCoverage().substring(0,4));}
        else {
           coverage.setText(viewModel.getCoverage());
        }
        if (viewModel.getCoverage() == "0"){
            coverage.setBackgroundResource(R.color.card_red);
        } else if ((Double.valueOf(viewModel.getCoverage()) < 1.0) && (Double.valueOf(viewModel.getCoverage()) > 0.0)){
            coverage.setBackgroundResource(R.color.card_yellow);
        } else {
            coverage.setBackgroundResource(R.color.card_green);
        }
        smallGrayText.setText(viewModel.getCoverage());
        largeGrayText.setText(viewModel.getSphereName());
    }
}

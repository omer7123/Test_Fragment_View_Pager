package com.ripalay.testfragmentviewpager.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ripalay.testfragmentviewpager.R;

import java.util.ArrayList;

public class PriceCoinAdapter extends RecyclerView.Adapter<PriceCoinAdapter.ViewHolder> {
    private ArrayList<KryptoBlock> list = new ArrayList<>();

    public void setList(ArrayList<KryptoBlock> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView icon;
        private TextView price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_krypto);
            icon = itemView.findViewById(R.id.icon_coin);
            price = itemView.findViewById(R.id.price_tv);

        }

        public void onBind(KryptoBlock kryptoBlock) {
            name.setText(kryptoBlock.getNameKrypto());
            icon.setImageResource(kryptoBlock.getImageView());
            price.setText(kryptoBlock.getPriceKrypto());

        }
    }
}

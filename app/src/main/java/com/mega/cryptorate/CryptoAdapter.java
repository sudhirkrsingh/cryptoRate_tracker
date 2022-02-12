package com.mega.cryptorate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.viewHolder> {

    LayoutInflater inflater;
    List<CryptoModel> cryptos;

    public CryptoAdapter(Context ctx,List<CryptoModel> cryptos){
        this.inflater=LayoutInflater.from(ctx);
        this.cryptos=cryptos;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cryptorate_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        Picasso.get().load(cryptos.get(position).getCryptoImg()).into(holder.cryptoImg);
        holder.cryptoRank.setText(cryptos.get(position).getCryptoRank());
        holder.cryptoName.setText(cryptos.get(position).getCryptoName());
        holder.cryptoPrice.setText((int) cryptos.get(position).getCryptoPrice());
        holder.high_24.setText((int) cryptos.get(position).getHigh_24h());
        holder.low_24.setText((int) cryptos.get(position).getLow_24h());
    }

    @Override
    public int getItemCount() {
        return cryptos.size();
    }

    public static   class viewHolder extends RecyclerView.ViewHolder{

        ImageView cryptoImg;
        TextView cryptoRank,cryptoName,cryptoPrice,high_24,low_24;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            cryptoImg = itemView.findViewById(R.id.crypto_img);
            cryptoRank = itemView.findViewById(R.id.crypto_rank);
            cryptoName=itemView.findViewById(R.id.crypto_name);
            cryptoPrice=itemView.findViewById(R.id.crypto_price);
            high_24=itemView.findViewById(R.id.high_24h);
            low_24=itemView.findViewById(R.id.low_24h);
        }
    }
}

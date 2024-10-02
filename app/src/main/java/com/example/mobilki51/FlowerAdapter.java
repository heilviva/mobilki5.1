package com.example.mobilki51;

import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder> {
    private List<Flower> flowers;
    private Context context;

    public FlowerAdapter(List<Flower> flowers, Context context) {
        this.flowers = flowers;
        this.context = context;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_flower, parent, false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        Flower flower = flowers.get(position);
        holder.bind(flower);
    }

    @Override
    public int getItemCount() {
        return flowers.size();
    }

    class FlowerViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageFlower;
        private TextView textName;
        private TextView textDescription;
        private TextView textPrice;

        public FlowerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageFlower = itemView.findViewById(R.id.image_flower);
            textName = itemView.findViewById(R.id.text_name);
            textDescription = itemView.findViewById(R.id.text_description);
            textPrice = itemView.findViewById(R.id.text_price);
        }

        public void bind(Flower flower) {
            imageFlower.setImageResource(flower.getImageResId());
            textName.setText (flower.getName());
            textDescription.setText(flower.getDescription());
            textPrice.setText("Цена: " + flower.getPrice() + "₽");
        }
    }
}


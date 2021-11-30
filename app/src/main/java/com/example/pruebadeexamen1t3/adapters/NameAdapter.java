package com.example.pruebadeexamen1t3.adapters;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebadeexamen1t3.MapActivity;
import com.example.pruebadeexamen1t3.R;
import com.example.pruebadeexamen1t3.entities.Persona;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder>{

    private List<Persona> data;

    public NameAdapter(List<Persona> data) {
        this.data = data;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name, parent, false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
        TextView tv1 = holder.itemView.findViewById(R.id.tvName);

        TextView tv2 = holder.itemView.findViewById(R.id.tvPhone);
        Persona value = data.get(position);

        tv1.setText(value.getNombre());
        tv2.setText(value.getNumero());

        Button btnClickLlamada = holder.itemView.findViewById(R.id.btnClickLlamada);
        btnClickLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(holder.itemView.getContext(), value, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(holder.itemView.getContext(), MapActivity.class);
                intent.putExtra("value",value);
                holder.itemView.getContext().startActivity(intent);*/
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", value.getNumero(), null));
                v.getContext().startActivity(callIntent);
            }
        });

        Button btnClickMensaje = holder.itemView.findViewById(R.id.btnClickMensaje);
        btnClickMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(holder.itemView.getContext(), value, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(holder.itemView.getContext(), MapActivity.class);
                intent.putExtra("value",value);
                holder.itemView.getContext().startActivity(intent);*/
                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", value.getNumero(), null));
                v.getContext().startActivity(smsIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class NameViewHolder extends RecyclerView.ViewHolder{

        public NameViewHolder(View itemView) {
            super(itemView);
        }
    }
}

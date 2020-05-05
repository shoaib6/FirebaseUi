package com.example.firebaseui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class IDsAdapter extends FirebaseRecyclerAdapter<IDs, IDsAdapter.IDsViewHolder> {

    public IDsAdapter(@NonNull FirebaseRecyclerOptions<IDs> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull IDsViewHolder holder, int position, @NonNull IDs model) {
       holder.Class.setText(model.getClasss());
       holder.Name.setText(model.getName());
       holder.Roll.setText(model.getRoll());
    }

    @NonNull
    @Override
    public IDsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=(LayoutInflater.from(parent.getContext()));
        View view=inflater.inflate(R.layout.row,parent,false);
        return new IDsViewHolder(view);
    }

    public class IDsViewHolder extends RecyclerView.ViewHolder {
        TextView Class,Name,Roll;
        public IDsViewHolder(@NonNull View itemView) {

            super(itemView);
            Class=itemView.findViewById(R.id.Class);
            Name=itemView.findViewById(R.id.Name);
            Roll=itemView.findViewById(R.id.Roll);
        }
    }
}

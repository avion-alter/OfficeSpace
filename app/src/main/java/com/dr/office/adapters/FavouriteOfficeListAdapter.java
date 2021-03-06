package com.dr.office.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.dr.office.R;
import com.dr.office.views.OfficeProfileActivity;

public class FavouriteOfficeListAdapter extends RecyclerView.Adapter<FavouriteOfficeListAdapter.RoleViewHolder> {

    private int positions = 0;
    private Context context;
    View views;

    public FavouriteOfficeListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RoleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        views = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_fav_office_list, parent, false);
        return new RoleViewHolder(views);
    }

    @Override
    public void onBindViewHolder(@NonNull RoleViewHolder holder, int position) {

        holder.constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(context, OfficeProfileActivity.class);
                n.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(n);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class RoleViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout constraint;
        public RoleViewHolder(@NonNull View itemView) {
            super(itemView);
            constraint = itemView.findViewById(R.id.constraint);
        }

    }



}

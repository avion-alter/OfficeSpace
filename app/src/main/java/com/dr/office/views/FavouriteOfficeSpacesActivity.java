package com.dr.office.views;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dr.office.R;
import com.dr.office.adapters.FavouriteOfficeListAdapter;
import com.dr.office.adapters.OfficeListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FavouriteOfficeSpacesActivity extends AppCompatActivity {

    @BindView(R.id.imgBack)
    ImageView imgBack;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_office_spaces);
        ButterKnife.bind(this);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(FavouriteOfficeSpacesActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        FavouriteOfficeListAdapter officeListAdapter = new FavouriteOfficeListAdapter(FavouriteOfficeSpacesActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(officeListAdapter);
    }

    @OnClick(R.id.imgBack)
    public void onViewClicked() {
    }
}
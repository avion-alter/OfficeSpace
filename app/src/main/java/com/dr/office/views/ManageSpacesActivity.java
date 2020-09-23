package com.dr.office.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dr.office.R;
import com.dr.office.adapters.ManageOfficeSpaceListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ManageSpacesActivity extends AppCompatActivity {

    @BindView(R.id.imgBack)
    ImageView imgBack;
    @BindView(R.id.edit_email)
    EditText editEmail;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.imgAdd)
    ImageView imgAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_spaces);
        ButterKnife.bind(this);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(ManageSpacesActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        ManageOfficeSpaceListAdapter officeListAdapter = new ManageOfficeSpaceListAdapter(ManageSpacesActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(officeListAdapter);
    }


    @OnClick({R.id.imgBack, R.id.imgAdd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imgBack:
                break;
            case R.id.imgAdd:
                Intent intent = new Intent(ManageSpacesActivity.this, AddSpaceOneActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
        }
    }
}
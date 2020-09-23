package com.dr.office.views;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dr.office.R;
import com.dr.office.adapters.SliderAdapterExample;
import com.dr.office.models.SliderItem;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OfficeProfileActivity extends AppCompatActivity {

    @BindView(R.id.imageSlider)
    SliderView slider;

    private SliderAdapterExample adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_profile);
        ButterKnife.bind(this);

        adapter = new SliderAdapterExample(this);
        slider.setSliderAdapter(adapter);
        //slider.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        //slider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        slider.setAutoCycleDirection(slider.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        slider.setIndicatorSelectedColor(Color.WHITE);
        slider.setIndicatorUnselectedColor(Color.GRAY);
        slider.setScrollTimeInSec(3);
        slider.setAutoCycle(true);
        slider.startAutoCycle();

        for (int i = 0; i < 3; i++) {
            SliderItem sliderItem = new SliderItem();
            sliderItem.setDescription("Slider Item Added Manually");
            sliderItem.setImageUrl("http://174.141.230.138/~lms/ashore/HRMS/assets/dist/img/avatar5.png");
            adapter.addItem(sliderItem);
        }

    }
}
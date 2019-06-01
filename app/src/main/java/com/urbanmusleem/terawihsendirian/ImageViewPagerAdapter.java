package com.urbanmusleem.terawihsendirian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageViewPagerAdapter extends PagerAdapter {

    private Context context;
    private int[] imagePager;
    LayoutInflater layoutInflater;

    ImageViewPagerAdapter(Context context, int[] imagePager) {
        this.context = context;
        this.imagePager = imagePager;
    }

    @Override
    public int getCount() {
        return imagePager.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_viewpager_adapter, null);
        ImageView imageView = view.findViewById(R.id.container_image);
        imageView.setImageResource(imagePager[position]);
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}

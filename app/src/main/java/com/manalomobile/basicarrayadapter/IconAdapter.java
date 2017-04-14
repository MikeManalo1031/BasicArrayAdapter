package com.manalomobile.basicarrayadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mikem on 4/8/2017.
 */

public class IconAdapter extends ArrayAdapter<String>{

    Context context;
    int[] imgs;
    String myTitles[];
    String myDescription[];

    public IconAdapter(Context context, String[] titles, int[] imgs, String[] description) {
        super(context, R.layout.row, R.id.item_name, titles);
        this.context = context;
        this.imgs = imgs;
        this.myDescription = description;
        this.myTitles = titles;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = null;

        if (convertView == null) {
            //gets the view ready
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            View customView = layoutInflater.inflate(R.layout.row, parent, false);

            String singleIconItem = getItem(position);
            ImageView iconImage = (ImageView) customView.findViewById(R.id.image_icon);
            TextView iconTitle = (TextView) customView.findViewById(R.id.item_name);
            TextView description = (TextView) customView.findViewById(R.id.item_description);

            //set text
            iconImage.setImageResource(imgs[position]);
            iconTitle.setText(myTitles[position]);
            description.setText(myDescription[position]);

            return customView;
        }

        return convertView;
    }



}

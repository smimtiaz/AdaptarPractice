package com.example.imtia.adaptarpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {


    String [] countryNames;
    int [] flags;
    Context context;
    LayoutInflater inflater;

    CustomAdapter(Context context,String[] countryNames,int[]flags){


        this.context=context;
        this.countryNames=countryNames;
        this.flags = flags;


    }



    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        inflater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =  inflater.inflate(R.layout.sample_view,viewGroup,false);

       TextView textview = (TextView) convertView.findViewById(R.id.text1);
        ImageView imageview = (ImageView) convertView.findViewById(R.id.imagevewid);
       TextView textview1 = (TextView) convertView.findViewById(R.id.text2);

       textview.setText(countryNames[position]);
       imageview.setImageResource(flags[position]);
        textview1.setText(countryNames[position]);

        return convertView;
    }
}

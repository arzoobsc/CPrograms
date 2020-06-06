package com.ap.cprograms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<ListItemPOJO> model;

    public MyCustomAdapter(Context mContext, ArrayList<ListItemPOJO> model) {
        mLayoutInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();

        if (view == null){

            /* Initialize view */
            view = mLayoutInflater.inflate(R.layout.listview_row_item, viewGroup, false);
            holder.textViewTitle = (TextView) view.findViewById(R.id.tvTitle);
            view.setTag(holder);
        }else {
            holder = (Holder) view.getTag();
        }

        /* Set text to textview by getting values from POJO class */
        holder.textViewTitle.setText(model.get(position).getTitle());


        return view;
    }

    public class Holder {
        TextView textViewTitle;
    }
}

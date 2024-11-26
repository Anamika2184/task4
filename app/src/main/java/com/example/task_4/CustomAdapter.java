package com.example.task_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListItem> items;

    public CustomAdapter(Context context, ArrayList<ListItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, parent, false);
        }

        ImageView itemIcon = convertView.findViewById(R.id.itemIcon);
        TextView itemTitle = convertView.findViewById(R.id.itemTitle);

        ListItem listItem = items.get(position);

        itemIcon.setImageResource(listItem.getIconResId());
        itemTitle.setText(listItem.getTitle());

        return convertView;
    }
}
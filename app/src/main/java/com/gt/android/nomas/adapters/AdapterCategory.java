package com.gt.android.nomas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gt.android.nomas.R;

import java.util.ArrayList;

/**
 * Created by root on 26/11/15.
 */
public class AdapterCategory extends BaseAdapter {

    private ArrayList<TestCategory> testCategories;
    LayoutInflater inflater;
    Context context;

    public AdapterCategory(ArrayList<TestCategory> cat, Context con) {
        this.testCategories = cat;
        inflater = LayoutInflater.from(con);
        this.context = con;
    }

    @Override
    public int getCount() {
        return testCategories.size();
    }

    @Override
    public Object getItem(int position) {
        return testCategories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.list_adapter, null);
        TestCategory cat = testCategories.get(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivCardView);
        TextView id = (TextView) convertView.findViewById(R.id.tvId);
        TextView titulo = (TextView) convertView.findViewById(R.id.tvTitulo);
        TextView nickName = (TextView) convertView.findViewById(R.id.tvNickName);
        TextView denuncia = (TextView) convertView.findViewById(R.id.tvDenuncia);

        imageView.setBackgroundDrawable(context.getResources().getDrawable(cat.getAvatar()));
        //imageView.setBackgroundDrawable(context.getDrawable(cat.getAvatar()));
        id.setText(cat.getId());
        titulo.setText(cat.getTitulo());
        nickName.setText(cat.getNickName());
        denuncia.setText(cat.getDenuncia());

        return convertView;
    }
}

package com.example.td2;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Animal> mylist;

    public MyAdapter(List<Animal> mylist) {
        this.mylist = mylist;
    }


    @Override
    public int getCount() {
        return mylist.size();
    }

    @Override
    public Animal getItem(int i) {
        return mylist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder")
        View v = View.inflate(viewGroup.getContext(), R.layout.display, null);

        Animal animal = (Animal) getItem(i);
        ((TextView) v.findViewById(R.id.name)).setText(animal.getNom());
        ((TextView) v.findViewById(R.id.race)).setText(animal.getRace());
        ((TextView) v.findViewById(R.id.country)).setText(animal.getPays());
        ((ImageView) v.findViewById(R.id.imageView2)).setImageResource(animal.getImage());

        return v;
    }
}

package com.example.sockdack_app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    ArrayList<ListItem> itemList = new ArrayList<ListItem>();
    Context context;

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //position에 위치한 d를 화면에 출력하기 위한 메서드
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context = parent.getContext();
        ListItem listItem = itemList.get(position);

        //listview_item을 inflate에서 converiew를 참조
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);

        }

        //화면에 보여질 데이터
        ImageView imageIg = convertView.findViewById(R.id.bookcover);
        TextView titleText = convertView.findViewById(R.id.booktitle);
        TextView authorText = convertView.findViewById(R.id.bookauthor);
        TextView genreText = convertView.findViewById(R.id.bookgenre);

        imageIg.setImageDrawable(listItem.getBookcover());
        titleText.setText(listItem.getBooktitle());
        authorText.setText(listItem.getBookauthor());
        genreText.setText(listItem.getBookgenre());

        return convertView;
    }

    public void addItem(ListItem item) {
        itemList.add(item);
    }
}

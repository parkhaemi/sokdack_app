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

public class MemoViewAdapter extends BaseAdapter {
    ArrayList<MemoItem> memoList = new ArrayList<MemoItem>();
    Context context;

    @Override
    public int getCount() {
        return memoList.size();
    }

    @Override
    public Object getItem(int position) {
        return memoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //position에 위치한 d를 화면에 출력하기 위한 메서드
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        context = parent.getContext();
        MemoItem memoItem= memoList.get(position);

        //listview_item을 inflate에서 converiew를 참조
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.memoview_item, parent, false);

        }

        //화면에 보여질 데이터
        TextView memoDateText = convertView.findViewById(R.id.memodate);
        TextView memoText = convertView.findViewById(R.id.memo);

        memoDateText.setText(memoItem.getMemodate());
        memoText.setText(memoItem.getMemo());

        return convertView;
    }

    public void addItem(MemoItem item) {
        memoList.add(item);
    }
}

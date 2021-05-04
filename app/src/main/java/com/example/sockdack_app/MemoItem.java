package com.example.sockdack_app;

import android.graphics.drawable.Drawable;
import android.media.Image;

import java.util.List;

public class MemoItem {
    private String memodate;
    private String memo;

    public String getMemodate(){

        return memodate;
    }

    public void setMemodate(String memodate){
        this.memodate = memodate;
    }

    public String getMemo(){

        return memo;
    }

    public void setMemo(String memo){

        this.memo = memodate;
    }

    MemoItem(String memodate, String memo){
        this.memodate = memodate;
        this.memo = memo;

    }
}

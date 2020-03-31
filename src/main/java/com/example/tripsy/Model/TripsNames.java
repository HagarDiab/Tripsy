package com.example.tripsy.Model;

public class TripsNames {

    private int mIconImage;
    private int mArrowImage;
    private String mTripName;

    /*private int[] mImIconImage = new int[] {
    R.drawable.pic_1,
    R.drawable.pic_2,
    R.drawable.pic_3
    }*/

    public TripsNames(int iconImage, int arrowImage, String tripName){
        mIconImage = iconImage;
        mArrowImage = arrowImage;
        mTripName= tripName;
    }

    public int getmIconImage() {
        return mIconImage;
    }

    public int getmArrowImage() {
        return mArrowImage;
    }

    public String getmTripName(){
        return mTripName;
    }
}

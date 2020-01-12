package com.example.makan;

public class ExampleItem {
    private String mImageUrl,mCreator;
    private String mLikes;


    public ExampleItem(String imageUrl, String creator,String likes){
        mImageUrl = imageUrl;
        mCreator = creator;
        mLikes = likes;
    }
    public String getImageUrl(){
        return mImageUrl;
    }

    public String getCreator(){
        return mCreator;
    }
    public String getLikeCount(){
        return mLikes;
    }
}

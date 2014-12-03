package com.example.ziyang0621.flickrbrowser;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ziyang0621 on 12/3/14.
 */
public class FlickrImageViewHolder extends RecyclerView.ViewHolder {
    protected ImageView mThumbnail;
    protected TextView mTitle;

    public FlickrImageViewHolder(View view) {
        super(view);
        mThumbnail = (ImageView)view.findViewById(R.id.thumbnail);
        mTitle = (TextView)view.findViewById(R.id.title);
    }
}

package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Abdulrhman on 14/07/2017.
 */

public class ThreeToTwoImage extends android.support.v7.widget.AppCompatImageView {
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int hight = MeasureSpec.getSize(widthMeasureSpec)*2/3;
        int hightspec = MeasureSpec.makeMeasureSpec(hight,MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, hightspec);
    }

    public ThreeToTwoImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeToTwoImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ThreeToTwoImage(Context context) {
        super(context);
    }
}

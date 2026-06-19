package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/AvoidRecycledImageView.class */
public class AvoidRecycledImageView extends AppCompatImageView {
    public AvoidRecycledImageView(Context context) {
        super(context);
    }

    public AvoidRecycledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e7) {
            BLog.e("AvoidRecycledImageView", "draw exception -> " + e7.toString());
        }
    }
}

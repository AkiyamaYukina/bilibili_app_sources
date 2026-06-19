package com.bilibili.upper.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/FixedPopupAnchor.class */
public class FixedPopupAnchor extends FrameLayout {
    public FixedPopupAnchor(Context context) {
        super(context);
    }

    public FixedPopupAnchor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z6) {
        return false;
    }
}

package com.bilibili.lib.sharewrapper.selector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/c.class */
public class c extends GridView {
    public c(Context context) {
        super(context);
    }

    public c(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }
}

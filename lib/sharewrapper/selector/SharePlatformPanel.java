package com.bilibili.lib.sharewrapper.selector;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/SharePlatformPanel.class */
public class SharePlatformPanel extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<SharePlatform> f64450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f64451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f64452c;

    public SharePlatformPanel(Context context) {
        this(context, null);
    }

    public SharePlatformPanel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ArrayList arrayList = new ArrayList();
        this.f64450a = arrayList;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pW0.a.a);
        this.f64452c = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.f64451b = new b(this, getContext(), arrayList);
        setNumColumns(-1);
        setStretchMode(2);
        setColumnWidth(getResources().getDimensionPixelSize(2131165514));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setSelector(2131232010);
        setAdapter((ListAdapter) this.f64451b);
    }

    public void setDrawablePadding(float f7) {
        this.f64452c = f7;
    }
}

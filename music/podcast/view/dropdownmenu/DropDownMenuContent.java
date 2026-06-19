package com.bilibili.music.podcast.view.dropdownmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import zg0.C9193a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/dropdownmenu/DropDownMenuContent.class */
public class DropDownMenuContent extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f67190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f67191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView.ItemDecoration f67193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GridLayoutManager.SpanSizeLookup f67194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67195f;

    public DropDownMenuContent(Context context) {
        this(context, null, 0);
    }

    public DropDownMenuContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DropDownMenuContent(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, 0);
        this.f67192c = -1;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9193a.f130305d)) != null) {
            this.f67195f = typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#eaeaea"));
            typedArrayObtainStyledAttributes.recycle();
        }
        LayoutInflater.from(context).inflate(2131494566, (ViewGroup) this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131306595);
        this.f67190a = recyclerView;
        recyclerView.setBackgroundColor(this.f67195f);
        this.f67191b = findViewById(2131306619);
    }

    public RecyclerView.ItemDecoration getItemDecoration() {
        return this.f67193d;
    }

    public View getMask() {
        return this.f67191b;
    }

    public RecyclerView getRecyclerView() {
        return this.f67190a;
    }

    public int getSpanCount() {
        return this.f67192c;
    }

    public GridLayoutManager.SpanSizeLookup getSpanLookup() {
        return this.f67194e;
    }

    public void setContentBgColor(int i7) {
        this.f67195f = i7;
        this.f67190a.setBackgroundColor(i7);
    }

    public void setItemDecoration(RecyclerView.ItemDecoration itemDecoration) {
        this.f67193d = itemDecoration;
    }

    public void setSpanCount(int i7) {
        this.f67192c = i7;
    }

    public void setSpanLookUp(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f67194e = spanSizeLookup;
    }
}

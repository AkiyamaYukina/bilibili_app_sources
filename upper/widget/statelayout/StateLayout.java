package com.bilibili.upper.widget.statelayout;

import IE0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/statelayout/StateLayout.class */
public class StateLayout extends FrameLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FrameLayout.LayoutParams f114587k = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f114588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f114589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f114590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f114594g;
    public final LayoutInflater h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnClickListener f114595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<Integer> f114596j;

    public StateLayout(Context context) {
        this(context, null);
    }

    public StateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f114596j = new ArrayList<>();
        this.h = LayoutInflater.from(getContext());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f10169j, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(1, 2131496675);
        this.f114591d = typedArrayObtainStyledAttributes.getResourceId(2, 2131496676);
        this.f114592e = typedArrayObtainStyledAttributes.getResourceId(3, 2131496678);
        typedArrayObtainStyledAttributes.getResourceId(4, 2131496680);
        this.f114593f = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        int i7;
        this.f114594g = 0;
        if (this.f114590c == null && (i7 = this.f114593f) != -1) {
            View viewInflate = this.h.inflate(i7, (ViewGroup) null);
            this.f114590c = viewInflate;
            addView(viewInflate, 0, f114587k);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            childAt.setVisibility(this.f114596j.contains(Integer.valueOf(childAt.getId())) ? 8 : 0);
        }
    }

    public final void b() {
        int i7 = this.f114591d;
        FrameLayout.LayoutParams layoutParams = f114587k;
        View view = this.f114588a;
        View viewInflate = view;
        if (view == null) {
            viewInflate = this.h.inflate(i7, (ViewGroup) null);
        }
        if (viewInflate == null) {
            throw new NullPointerException("Error view is null.");
        }
        if (layoutParams == null) {
            throw new NullPointerException("Layout params is null.");
        }
        this.f114594g = 3;
        if (this.f114588a == null) {
            this.f114588a = viewInflate;
            View viewFindViewById = viewInflate.findViewById(2131301178);
            View.OnClickListener onClickListener = this.f114595i;
            if (onClickListener != null && viewFindViewById != null) {
                viewFindViewById.setOnClickListener(onClickListener);
            }
            this.f114596j.add(Integer.valueOf(this.f114588a.getId()));
            addView(this.f114588a, 0, layoutParams);
        }
        int id = this.f114588a.getId();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            childAt.setVisibility(childAt.getId() == id ? 0 : 8);
        }
    }

    public final void c() {
        int i7 = this.f114592e;
        FrameLayout.LayoutParams layoutParams = f114587k;
        View view = this.f114589b;
        View viewInflate = view;
        if (view == null) {
            viewInflate = this.h.inflate(i7, (ViewGroup) null);
        }
        if (viewInflate == null) {
            throw new NullPointerException("Loading view is null.");
        }
        if (layoutParams == null) {
            throw new NullPointerException("Layout params is null.");
        }
        this.f114594g = 1;
        if (this.f114589b == null) {
            this.f114589b = viewInflate;
            this.f114596j.add(Integer.valueOf(viewInflate.getId()));
            addView(this.f114589b, 0, layoutParams);
        }
        int id = this.f114589b.getId();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            childAt.setVisibility(childAt.getId() == id ? 0 : 8);
        }
    }

    public View getErrorView() {
        return this.f114588a;
    }

    public View getLoadingView() {
        return this.f114589b;
    }

    public int getViewStatus() {
        return this.f114594g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public void setContentViewResId(int i7) {
        this.f114593f = i7;
    }

    public void setErrorViewResId(int i7) {
        this.f114591d = i7;
    }

    public void setLoadingViewResId(int i7) {
        this.f114592e = i7;
    }

    public void setNoNetworkViewResId(int i7) {
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f114595i = onClickListener;
    }

    public void setmEmptyViewResId(int i7) {
    }
}

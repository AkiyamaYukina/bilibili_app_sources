package com.bilibili.studio.videoeditor.bgm.bgmlist.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/ui/view/AutoAdaptationViewPager.class */
public class AutoAdaptationViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f109044e;

    public AutoAdaptationViewPager(Context context) {
        super(context);
        this.f109042c = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.f109043d = -1;
    }

    public AutoAdaptationViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f109042c = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.f109043d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.bgm.bgmlist.ui.view.AutoAdaptationViewPager.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i7, int i8) {
        int measuredHeight;
        super.onMeasure(i7, i8);
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i9 >= childCount) {
                setMeasuredDimension(getMeasuredWidth(), i11);
                return;
            }
            View childAt = getChildAt(i9);
            int iMax = i11;
            if (childAt != null) {
                childAt.measure(i7, i8);
                int mode = View.MeasureSpec.getMode(i8);
                int size = View.MeasureSpec.getSize(i8);
                if (mode == 1073741824) {
                    measuredHeight = size;
                } else {
                    measuredHeight = childAt.getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = Math.min(measuredHeight, size);
                    }
                }
                iMax = Math.max(i11, measuredHeight);
            }
            i9++;
            i10 = iMax;
        }
    }
}

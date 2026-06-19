package com.bilibili.ogv.infra.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import tv.danmaku.bili.widget.FlowLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/widget/TagFlowLayout.class */
@Deprecated
public class TagFlowLayout extends FlowLayout {
    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public int getLinesViewCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < ((FlowLayout) this).lines.size(); i8++) {
            i7 += ((FlowLayout.b) ((FlowLayout) this).lines.get(i8)).i;
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) != null) {
                getChildAt(i11).setTag(2131308237, getClass().getName());
            }
        }
        for (int i12 = 0; i12 < ((FlowLayout) this).lines.size(); i12++) {
            FlowLayout.b bVar = (FlowLayout.b) ((FlowLayout) this).lines.get(i12);
            for (int i13 = 0; i13 < bVar.i; i13++) {
                View view = bVar.a[i13];
                FlowLayout.a layoutParams = view.getLayoutParams();
                int i14 = layoutParams.j;
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                view.layout(i14 + i15, layoutParams.k + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getMeasuredWidth() + i14 + i15, view.getMeasuredHeight() + layoutParams.k + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                view.setTag(2131308237, null);
            }
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getTag(2131308237) != null) {
                childAt.layout(0, 0, 0, 0);
            }
        }
    }
}

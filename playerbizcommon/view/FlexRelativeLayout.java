package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/FlexRelativeLayout.class */
public final class FlexRelativeLayout extends RelativeLayout {
    @JvmOverloads
    public FlexRelativeLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public FlexRelativeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public FlexRelativeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        float fMeasureText;
        int size = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i9 = i11;
            if (i10 >= childCount - 1) {
                break;
            }
            View childAt = getChildAt(i10);
            int iA = i9;
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredWidth = childAt.getMeasuredWidth();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                iA = UO.a.a(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin, measuredWidth, i9);
            }
            i10++;
            i11 = iA;
        }
        View childAt2 = getChildAt(getChildCount() - 1);
        if (childAt2 instanceof TextView) {
            TextView textView = (TextView) childAt2;
            fMeasureText = textView.getPaint().measureText(textView.getText().toString());
        } else {
            fMeasureText = 0.0f;
        }
        if (((size - paddingLeft) - paddingRight) - i9 < fMeasureText) {
            childAt2.setVisibility(8);
        }
        super.onMeasure(i7, i8);
    }
}

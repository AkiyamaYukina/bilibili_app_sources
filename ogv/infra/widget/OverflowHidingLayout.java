package com.bilibili.ogv.infra.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewGroupKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zj0.C9200a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/widget/OverflowHidingLayout.class */
@StabilityInferred(parameters = 0)
public final class OverflowHidingLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67973a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/widget/OverflowHidingLayout$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f67974a;
    }

    @JvmOverloads
    public OverflowHidingLayout(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public OverflowHidingLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67973a = -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, com.bilibili.ogv.infra.widget.OverflowHidingLayout$a] */
    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f67974a = false;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, com.bilibili.ogv.infra.widget.OverflowHidingLayout$a] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9200a.f130328a);
        marginLayoutParams.f67974a = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof a) && !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new ViewGroup.MarginLayoutParams(layoutParams);
        }
        return new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int paddingLeft = getPaddingLeft();
        int i11 = 0;
        for (Object obj : ViewGroupKt.getChildren(this)) {
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (view.getVisibility() != 8 && i11 <= this.f67973a) {
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int paddingTop = getPaddingTop() + marginLayoutParams.topMargin;
                int i12 = marginLayoutParams.bottomMargin;
                int paddingBottom = getPaddingBottom();
                int i13 = paddingLeft + marginLayoutParams.leftMargin;
                paddingLeft = marginLayoutParams.rightMargin + i13 + measuredWidth;
                view.layout(i13, paddingTop, paddingLeft, paddingBottom + measuredHeight + paddingTop + i12);
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i7) : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int measuredWidth = paddingRight + paddingLeft;
        boolean z6 = false;
        int i9 = 0;
        int iMax = 0;
        for (Object obj : ViewGroupKt.getChildren(this)) {
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = (View) obj;
            if (!z6 && view.getVisibility() != 8) {
                a aVar = (a) view.getLayoutParams();
                measureChildWithMargins(view, i7, measuredWidth, i8, paddingBottom);
                measuredWidth = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + measuredWidth;
                if (measuredWidth > size) {
                    this.f67973a = i9 - 1;
                    z6 = true;
                } else if (measuredWidth == size) {
                    this.f67973a = i9;
                    if (aVar.f67974a) {
                        int measuredWidth2 = view.getMeasuredWidth();
                        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(i8, paddingBottom, ((ViewGroup.MarginLayoutParams) aVar).height));
                        if (view.getMeasuredWidth() > measuredWidth2) {
                            this.f67973a = i9 - 1;
                        }
                    }
                    z6 = true;
                }
                iMax = Math.max(iMax, view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
            }
            i9++;
        }
        if (!z6) {
            this.f67973a = getChildCount();
        }
        setMeasuredDimension(ViewGroup.resolveSize(measuredWidth, i7), ViewGroup.resolveSize(iMax + paddingBottom, i8));
    }
}

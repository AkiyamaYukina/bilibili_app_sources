package com.bilibili.ogv.infra.widget;

import UO.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yj0.C9060a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/widget/OGVCenterFlowLayout.class */
@Deprecated(message = "用途不明。")
@StabilityInferred(parameters = 0)
public final class OGVCenterFlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Integer> f67970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Integer> f67971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67972e;

    @JvmOverloads
    public OGVCenterFlowLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public OGVCenterFlowLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OGVCenterFlowLayout(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f67970c = new ArrayList();
        this.f67971d = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C9060a.f129713a, 0, 0);
        this.f67968a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f67969b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@NotNull AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(@NotNull ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = (getMeasuredWidth() - getPaddingRight()) - paddingLeft;
        int i13 = this.f67972e;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int iIntValue = ((Number) ((ArrayList) this.f67971d).get(i15)).intValue();
            int iIntValue2 = ((measuredWidth - ((Number) ((ArrayList) this.f67970c).get(i15)).intValue()) / 2) + paddingLeft;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i11 = i18;
                if (i16 < iIntValue) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() == 8) {
                        i12 = i11;
                    } else {
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                        int i19 = marginLayoutParams.rightMargin;
                        int i20 = marginLayoutParams.topMargin;
                        int i21 = marginLayoutParams.bottomMargin;
                        i12 = i11;
                        if (iIntValue > 1) {
                            i12 = i11;
                            if (i16 == 0) {
                                i12 = i20 + i21;
                            }
                        }
                        childAt.layout(iIntValue2, paddingTop, iIntValue2 + measuredWidth2, paddingTop + measuredHeight);
                        int i22 = i17;
                        if (i17 < measuredHeight) {
                            i22 = measuredHeight;
                        }
                        iIntValue2 = a.a(measuredWidth2, this.f67968a, i19, iIntValue2);
                        i17 = i22;
                    }
                    i16++;
                    i14++;
                    i18 = i12;
                }
            }
            paddingTop = a.a(i17, this.f67969b, i11, paddingTop);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        ((ArrayList) this.f67971d).clear();
        ((ArrayList) this.f67970c).clear();
        this.f67972e = 0;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int childCount = getChildCount();
        int iCoerceAtLeast = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = size;
        int iCoerceAtLeast2 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChildWithMargins(childAt, i7, 0, i8, 0);
                int i17 = marginLayoutParams.rightMargin;
                int i18 = marginLayoutParams.topMargin;
                int i19 = marginLayoutParams.bottomMargin;
                int measuredWidth = childAt.getMeasuredWidth() + this.f67968a + i17;
                int iA = a.a(childAt.getMeasuredHeight(), this.f67969b, i19, i18);
                i14 += measuredWidth;
                iCoerceAtLeast = RangesKt.coerceAtLeast(iCoerceAtLeast, measuredWidth) + iCoerceAtLeast;
                i10 += measuredWidth;
                if (i10 > (size - paddingLeft) - paddingRight) {
                    ((ArrayList) this.f67970c).add(Integer.valueOf(((i14 - measuredWidth) - this.f67968a) - i17));
                    i11++;
                    iCoerceAtLeast2 += iA;
                    ((ArrayList) this.f67971d).add(Integer.valueOf(i12));
                    i13 += i12;
                    i14 = measuredWidth;
                    i10 = i14;
                    i9 = i16;
                    i12 = 1;
                } else {
                    i12++;
                    iCoerceAtLeast2 = RangesKt.coerceAtLeast(iCoerceAtLeast2, iA);
                }
            }
        }
        int i20 = 0;
        int iA2 = 0;
        for (int i21 = i9; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            i20 = ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).rightMargin;
            iA2 = a.a(childAt2.getMeasuredWidth(), this.f67968a, i20, iA2);
        }
        int i22 = this.f67968a;
        if (i22 != 0) {
            i20 = i22;
        }
        ((ArrayList) this.f67970c).add(Integer.valueOf(iA2 - i20));
        ((ArrayList) this.f67971d).add(Integer.valueOf(childCount - i13));
        this.f67972e = i11 + 1;
        int iCoerceAtLeast3 = RangesKt.coerceAtLeast(iCoerceAtLeast, getSuggestedMinimumWidth());
        int paddingRight2 = getPaddingRight();
        int paddingLeft2 = getPaddingLeft();
        int iCoerceAtLeast4 = RangesKt.coerceAtLeast(iCoerceAtLeast2, getSuggestedMinimumHeight());
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i23 = this.f67969b;
        if (mode != 1073741824) {
            i15 = paddingLeft2 + paddingRight2 + iCoerceAtLeast3;
        }
        setMeasuredDimension(View.resolveSize(i15, i7), View.resolveSize(mode2 == 1073741824 ? size2 : (paddingBottom + (paddingTop + iCoerceAtLeast4)) - i23, i8));
    }

    public final void setChildSpacing(int i7) {
        this.f67968a = i7;
        requestLayout();
    }

    public final void setRowSpacing(int i7) {
        this.f67969b = i7;
        requestLayout();
    }
}

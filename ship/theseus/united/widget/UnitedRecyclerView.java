package com.bilibili.ship.theseus.united.widget;

import G.f;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a;
import kotlin.jvm.JvmOverloads;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/UnitedRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class UnitedRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SparseIntArray f104909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f104912d;

    @JvmOverloads
    public UnitedRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public UnitedRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public UnitedRecyclerView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f104909a = new SparseIntArray(40);
        this.f104912d = StateFlowKt.MutableStateFlow(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedPreScroll(int i7, int i8, @Nullable int[] iArr, @Nullable int[] iArr2, int i9) {
        if (iArr2 != null && this.f104911c && !this.f104910b && iArr2.length >= 2 && iArr2[1] > 0) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return super.dispatchNestedPreScroll(i7, i8, iArr, iArr2, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onChildAttachedToWindow(@NotNull View view) {
        int i7 = 0;
        int i8 = 0;
        int childAdapterPosition = getChildAdapterPosition(getChildAt(0)) - 1;
        if (childAdapterPosition >= 0) {
            int i9 = 0;
            while (true) {
                i8 += this.f104909a.get(i9);
                i7 = i8;
                if (i9 == childAdapterPosition) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        int iIntValue = i7;
        if (childAdapterPosition > 10) {
            iIntValue = i7;
            if (i7 == 0) {
                iIntValue = ((Number) this.f104912d.getValue()).intValue();
                if (iIntValue == 0) {
                    BLog.i("UnitedRecyclerView-onChildAttachedToWindow", "[theseus-united-UnitedRecyclerView-onChildAttachedToWindow] " + f.a(childAdapterPosition, i7, "onChildAttachedToWindow, correct1 offset position: ", ", offset: "));
                    iIntValue = computeVerticalScrollOffset();
                } else {
                    a.b("[theseus-united-UnitedRecyclerView-onChildAttachedToWindow] ", f.a(childAdapterPosition, i7, "onChildAttachedToWindow, correct2 offset position: ", ", offset: "), "UnitedRecyclerView-onChildAttachedToWindow");
                }
            }
        }
        this.f104912d.setValue(Integer.valueOf(iIntValue));
        a.b("[theseus-united-UnitedRecyclerView-onChildAttachedToWindow] ", "onChildAttachedToWindow, position: " + childAdapterPosition + ", offset: " + iIntValue, "UnitedRecyclerView-onChildAttachedToWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onChildDetachedFromWindow(@NotNull View view) {
        int childAdapterPosition = getChildAdapterPosition(view);
        this.f104909a.put(childAdapterPosition, view.getHeight());
        a.b("[theseus-united-UnitedRecyclerView-onChildDetachedFromWindow] ", f.a(childAdapterPosition, view.getHeight(), "onChildDetachedFromWindow, position: ", ", height: "), "UnitedRecyclerView-onChildDetachedFromWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z6) {
        super.setNestedScrollingEnabled(z6);
        this.f104911c = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean startNestedScroll(int i7) {
        boolean zStartNestedScroll = super.startNestedScroll(i7);
        if (zStartNestedScroll) {
            this.f104910b = true;
        }
        return zStartNestedScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        super.stopNestedScroll();
        this.f104910b = false;
    }
}

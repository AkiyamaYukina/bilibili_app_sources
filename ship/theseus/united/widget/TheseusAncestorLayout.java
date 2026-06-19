package com.bilibili.ship.theseus.united.widget;

import Cv0.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/TheseusAncestorLayout.class */
@StabilityInferred(parameters = 0)
public final class TheseusAncestorLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f104902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104903c;

    @JvmOverloads
    public TheseusAncestorLayout(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public TheseusAncestorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f104902b = new g(this, 0);
        this.f104903c = Integer.MAX_VALUE;
    }

    public static boolean a(View view) {
        boolean z6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i7 = 0;
            boolean z7 = false;
            while (true) {
                z6 = z7;
                if (i7 >= childCount) {
                    break;
                }
                z7 = z7 || a(viewGroup.getChildAt(i7));
                i7++;
            }
        } else {
            z6 = false;
        }
        boolean z8 = true;
        if (!z6) {
            z8 = view.isLayoutRequested();
        }
        if (z8) {
            view.forceLayout();
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public final WindowInsets dispatchApplyWindowInsets(@Nullable WindowInsets windowInsets) {
        this.f104901a = true;
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.f104901a) {
            removeCallbacks(this.f104902b);
            post(this.f104902b);
        }
        super.onLayout(z6, i7, i8, i9, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        this.f104903c = View.MeasureSpec.getSize(i8);
        super.onMeasure(i7, i8);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final void onMeasureChild(@Nullable View view, int i7, int i8, int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int i11 = this.f104903c;
        int iMakeMeasureSpec = i9;
        if (size > i11) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, View.MeasureSpec.getMode(i9));
        }
        super.onMeasureChild(view, i7, i8, iMakeMeasureSpec, i10);
    }
}

package com.bilibili.search2.result.all;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchExtraAppBarBehavior.class */
@StabilityInferred(parameters = 0)
public final class SearchExtraAppBarBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f87169a;

    public SearchExtraAppBarBehavior() {
    }

    public SearchExtraAppBarBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean getExpandBlocked() {
        return this.f87169a;
    }

    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout appBarLayout, @NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) {
        if (!this.f87169a || i8 >= 0) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i7, i8, iArr, i9);
        }
    }

    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull AppBarLayout appBarLayout, @NotNull View view, int i7, int i8, int i9, int i10, int i11, @NotNull int[] iArr) {
        if (!this.f87169a || i10 >= 0) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i7, i8, i9, i10, i11, iArr);
        }
    }

    public final void setExpandBlocked(boolean z6) {
        this.f87169a = z6;
    }
}

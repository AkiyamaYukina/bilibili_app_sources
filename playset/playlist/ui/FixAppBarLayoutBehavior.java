package com.bilibili.playset.playlist.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/FixAppBarLayoutBehavior.class */
public class FixAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public FixAppBarLayoutBehavior() {
    }

    public FixAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void stopNestedScrollIfNeeded(int i7, AppBarLayout appBarLayout, View view, int i8) {
        if (i8 == 1) {
            int topAndBottomOffset = getTopAndBottomOffset();
            if ((i7 >= 0 || topAndBottomOffset != 0) && (i7 <= 0 || topAndBottomOffset != (-appBarLayout.getTotalScrollRange()))) {
                return;
            }
            ViewCompat.stopNestedScroll(view, 1);
        }
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i7, i8, iArr, i9);
        stopNestedScrollIfNeeded(i8, appBarLayout, view, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11) {
        super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onNestedScroll(coordinatorLayout, appBarLayout, view, i7, i8, i9, i10, i11);
        stopNestedScrollIfNeeded(i10, appBarLayout, view, i11);
    }
}

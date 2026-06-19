package com.bilibili.playset.playlist.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/PinnedBottomBehavior.class */
public class PinnedBottomBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f85514a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/ui/PinnedBottomBehavior$a.class */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85515a = Integer.MAX_VALUE;
    }

    public PinnedBottomBehavior() {
        this.f85514a = new ArrayList();
    }

    public PinnedBottomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85514a = new ArrayList();
    }

    private boolean notifyPinnedOffset(boolean z6, CoordinatorLayout coordinatorLayout, View view, View view2) {
        int topAndBottomOffset;
        boolean z7;
        AppBarLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            topAndBottomOffset = behavior.getTopAndBottomOffset();
            z7 = true;
        } else {
            topAndBottomOffset = 0;
            z7 = false;
        }
        if (view2 instanceof AppBarLayout) {
            int i7 = -(((AppBarLayout) view2).getTotalScrollRange() + topAndBottomOffset);
            for (a aVar : (ArrayList) this.f85514a) {
                if (!z6) {
                    aVar.f85515a = i7;
                } else if (aVar.f85515a != i7) {
                    aVar.f85515a = i7;
                }
            }
        }
        return z7;
    }

    public void addDependentViewChangedListener(a aVar) {
        if (aVar == null || this.f85514a.contains(aVar)) {
            return;
        }
        this.f85514a.add(aVar);
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
        notifyPinnedOffset(false, coordinatorLayout, view, view2);
        return zOnDependentViewChanged;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i7) {
        boolean zOnLayoutChild = super.onLayoutChild(coordinatorLayout, view, i7);
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i8 = 0; i8 < size && !notifyPinnedOffset(false, coordinatorLayout, view, dependencies.get(i8)); i8++) {
        }
        return zOnLayoutChild;
    }

    public void removeDependentViewChangedListener(a aVar) {
        if (aVar != null) {
            this.f85514a.remove(aVar);
        }
    }
}

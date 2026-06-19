package com.bilibili.ship.theseus.united.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bilibili.ogv.infra.android.view.ViewTraversalKt;
import com.bilibili.ship.theseus.united.page.behavior.CollapsablePinnedBottomScrollingBehavior;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/b.class */
public final class b {
    @Nullable
    public static final CollapsablePinnedBottomScrollingBehavior a(@NotNull TouchAwareConstraintLayout touchAwareConstraintLayout) {
        Iterator it = ViewTraversalKt.a(touchAwareConstraintLayout).iterator();
        while (it.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((View) it.next()).getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                Object behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof CollapsablePinnedBottomScrollingBehavior) {
                    return (CollapsablePinnedBottomScrollingBehavior) behavior;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final PinnedBottomScrollingBehavior b(@NotNull View view) {
        Iterator it = ViewTraversalKt.a(view).iterator();
        while (it.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((View) it.next()).getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                PinnedBottomScrollingBehavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof PinnedBottomScrollingBehavior) {
                    return behavior;
                }
            }
        }
        return null;
    }
}

package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.utils.b;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/PinnedBottomFrameLayout.class */
@StabilityInferred(parameters = 0)
public final class PinnedBottomFrameLayout extends FrameLayout {
    @JvmOverloads
    public PinnedBottomFrameLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PinnedBottomFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PinnedBottomFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorB = b.b(this);
        if (pinnedBottomScrollingBehaviorB != null) {
            pinnedBottomScrollingBehaviorB.addPinnedView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorB = b.b(this);
        if (pinnedBottomScrollingBehaviorB != null) {
            pinnedBottomScrollingBehaviorB.removePinnedView(this);
        }
    }
}

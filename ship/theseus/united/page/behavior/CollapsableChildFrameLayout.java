package com.bilibili.ship.theseus.united.page.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import gv0.InterfaceC7381b;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/behavior/CollapsableChildFrameLayout.class */
@StabilityInferred(parameters = 0)
public final class CollapsableChildFrameLayout extends FrameLayout implements InterfaceC7381b {
    @JvmOverloads
    public CollapsableChildFrameLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public CollapsableChildFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public CollapsableChildFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }
}

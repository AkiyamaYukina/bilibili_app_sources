package com.bilibili.studio.editor.timeline;

import P50.v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.studio.kaleidoscope.sdk.montage.MonLiveWindowImpl;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/UpperLiveWindowExt.class */
public final class UpperLiveWindowExt extends v {
    @JvmOverloads
    public UpperLiveWindowExt(@NotNull Context context) {
        this(context, null, 14);
    }

    @JvmOverloads
    public UpperLiveWindowExt(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public UpperLiveWindowExt(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSurfaceZOrderMediaOverlay(boolean z6) {
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        View childAt2 = viewGroup.getChildAt(0);
        MonLiveWindowImpl monLiveWindowImpl = null;
        if (childAt2 instanceof MonLiveWindowImpl) {
            monLiveWindowImpl = (MonLiveWindowImpl) childAt2;
        }
        if (monLiveWindowImpl != null) {
            monLiveWindowImpl.setZOrderMediaOverlay(z6);
        }
    }
}

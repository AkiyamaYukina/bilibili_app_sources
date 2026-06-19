package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/TouchRelativeLayout.class */
public final class TouchRelativeLayout extends RelativeLayout {
    @JvmOverloads
    public TouchRelativeLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public TouchRelativeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public TouchRelativeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            setAlpha(0.4f);
        } else if ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3)) {
            setAlpha(1.0f);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}

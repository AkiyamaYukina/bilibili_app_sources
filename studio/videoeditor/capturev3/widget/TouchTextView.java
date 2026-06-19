package com.bilibili.studio.videoeditor.capturev3.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/widget/TouchTextView.class */
public final class TouchTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f109411a;

    @JvmOverloads
    public TouchTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public TouchTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public TouchTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f109411a = 1.0f;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f109411a = getAlpha();
            setAlpha(0.4f);
        } else if ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3)) {
            setAlpha(this.f109411a);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}

package com.bilibili.studio.editor.moudle.caption.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/ui/GestureFrameLayout.class */
public final class GestureFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetector f106024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f106025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f106026c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/ui/GestureFrameLayout$a.class */
    public interface a {
        void a(boolean z6);
    }

    public GestureFrameLayout(@NotNull Context context) {
        super(context);
        this.f106024a = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
    }

    public GestureFrameLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f106024a = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
    }

    @Nullable
    public final a getFlingAction() {
        return this.f106025b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        boolean z6 = false;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f106026c = motionEvent.getY();
        } else if (motionEvent.getAction() == 1 && Math.abs(motionEvent.getY() - this.f106026c) > 5.0f) {
            if (motionEvent.getY() < this.f106026c) {
                z6 = true;
            }
            a aVar = this.f106025b;
            if (aVar != null) {
                aVar.a(z6);
            }
        }
        GestureDetector gestureDetector = this.f106024a;
        GestureDetector gestureDetector2 = gestureDetector;
        if (gestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
            gestureDetector2 = null;
        }
        return gestureDetector2.onTouchEvent(motionEvent);
    }

    public final void setFlingAction(@Nullable a aVar) {
        this.f106025b = aVar;
    }
}

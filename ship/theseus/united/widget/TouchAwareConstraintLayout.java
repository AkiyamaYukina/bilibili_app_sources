package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/TouchAwareConstraintLayout.class */
@StabilityInferred(parameters = 0)
public final class TouchAwareConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104904c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function1<? super MotionEvent, Boolean> f104905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function1<? super MotionEvent, Unit> f104906b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/TouchAwareConstraintLayout$a.class */
    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104907a;

        public a(int i7) {
            this.f104907a = i7;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = view.getWidth();
            int height = view.getHeight();
            int i7 = this.f104907a;
            outline.setRoundRect(0, 0, width, height + i7, i7);
        }
    }

    public TouchAwareConstraintLayout(@NotNull Context context) {
        super(context, null, 0, 0);
    }

    public TouchAwareConstraintLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r4
            int r0 = r0.getActionMasked()
            if (r0 != 0) goto L1f
            r0 = r3
            kotlin.jvm.functions.Function1<? super android.view.MotionEvent, kotlin.Unit> r0 = r0.f104906b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1f
            r0 = r7
            r1 = r4
            java.lang.Object r0 = r0.invoke(r1)
        L1f:
            r0 = r3
            kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> r0 = r0.f104905a
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L43
            r0 = r7
            r1 = r4
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L43
            goto L49
        L43:
            r0 = r3
            r1 = r4
            boolean r0 = super.dispatchTouchEvent(r1)
            r5 = r0
        L49:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setRadius(int i7) {
        boolean z6 = ((float) i7) > 0.0f;
        setWillNotDraw(!z6);
        if (!z6) {
            setClipToOutline(false);
        } else {
            setClipToOutline(true);
            setOutlineProvider(new a(i7));
        }
    }

    public final void setTouchDownEventAware(@Nullable Function1<? super MotionEvent, Unit> function1) {
        this.f104906b = function1;
    }

    public final void setTouchEventInterceptor(@Nullable Function1<? super MotionEvent, Boolean> function1) {
        this.f104905a = function1;
    }
}

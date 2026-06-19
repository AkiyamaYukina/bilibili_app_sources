package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintToolbar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/TouchAwareToolbar.class */
@StabilityInferred(parameters = 0)
public final class TouchAwareToolbar extends TintToolbar {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function1<? super MotionEvent, Unit> f104908d;

    public TouchAwareToolbar(@NotNull Context context) {
        super(context);
    }

    public TouchAwareToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Function1<? super MotionEvent, Unit> function1;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (function1 = this.f104908d) != null) {
            function1.invoke(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setTouchDownEventAware(@Nullable Function1<? super MotionEvent, Unit> function1) {
        this.f104908d = function1;
    }
}

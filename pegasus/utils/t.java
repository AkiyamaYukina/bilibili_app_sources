package com.bilibili.pegasus.utils;

import By0.M1;
import By0.O1;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comment3.ui.holder.handle.Q;
import com.bilibili.app.comment3.ui.holder.handle.S;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/t.class */
@StabilityInferred(parameters = 0)
public final class t extends Ip0.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f78888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f78889l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(M1 m1, Q q7, O1 o12, S s7, int i7) {
        super(m1, q7, o12, s7, i7, 1.0f);
        int px = ListExtentionsKt.toPx(12.0f);
        this.f78888k = px;
        this.f78889l = 0;
    }

    @Override // Ip0.b
    public final void a(@NotNull Canvas canvas, @NotNull Paint paint, float f7, float f8, float f9, float f10) {
        canvas.drawLine(f7 + this.f78888k, f8, f9 - this.f78889l, f10, paint);
    }
}

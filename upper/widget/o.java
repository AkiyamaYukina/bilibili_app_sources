package com.bilibili.upper.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.upper.widget.v;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/o.class */
@StabilityInferred(parameters = 0)
public final class o extends View implements InterfaceC6694i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Pair<Integer, Integer> f114561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public v.a f114562b;

    public o(@NotNull Context context) {
        super(context);
        this.f114561a = TuplesKt.to(0, 0);
    }

    @Override // com.bilibili.upper.widget.InterfaceC6694i
    public final void a(@NotNull v.a aVar) {
        this.f114562b = aVar;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        v.a aVar = this.f114562b;
        if (aVar != null) {
            canvas.drawCircle(((Number) this.f114561a.getFirst()).intValue(), ((Number) this.f114561a.getSecond()).intValue(), aVar.f114679f, aVar.f114676c);
            canvas.drawCircle(((Number) this.f114561a.getFirst()).intValue(), ((Number) this.f114561a.getSecond()).intValue(), aVar.f114678e, aVar.f114674a);
            canvas.drawCircle(((Number) this.f114561a.getFirst()).intValue(), ((Number) this.f114561a.getSecond()).intValue(), aVar.f114677d, aVar.f114675b);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f114561a = TuplesKt.to(Integer.valueOf(i7 / 2), Integer.valueOf(i8 / 2));
    }
}

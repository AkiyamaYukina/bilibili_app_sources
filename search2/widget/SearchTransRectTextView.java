package com.bilibili.search2.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qe.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchTransRectTextView.class */
@StabilityInferred(parameters = 0)
public final class SearchTransRectTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Paint f88951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Paint f88952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PorterDuffXfermode f88954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f88955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f88956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f88957g;

    @JvmOverloads
    public SearchTransRectTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public SearchTransRectTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public SearchTransRectTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88951a = i.a(true);
        Paint paintA = i.a(true);
        paintA.setColor(ContextCompat.getColor(context, 2131100754));
        this.f88952b = paintA;
        this.f88953c = true;
        this.f88954d = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        this.f88955e = ListExtentionsKt.toPx(4);
        this.f88956f = ListExtentionsKt.toPx(4);
        this.f88957g = ListExtentionsKt.toPx(4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        canvas.saveLayer(null, null, 31);
        this.f88951a.setColor(ContextCompat.getColor(getContext(), R$color.f64616Wh0));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f88951a);
        this.f88951a.setXfermode(this.f88954d);
        this.f88951a.setColor(0);
        float f7 = this.f88956f;
        float f8 = this.f88957g;
        float width = getWidth();
        float f9 = this.f88956f;
        float height = getHeight();
        float f10 = this.f88957g;
        float f11 = this.f88955e;
        canvas.drawRoundRect(f7, f8, width - f9, height - f10, f11, f11, this.f88951a);
        this.f88951a.setXfermode(null);
        canvas.restore();
        if (this.f88953c) {
            float f12 = this.f88956f;
            float f13 = this.f88957g;
            float width2 = getWidth();
            float f14 = this.f88956f;
            float height2 = getHeight();
            float f15 = this.f88957g;
            float f16 = this.f88955e;
            canvas.drawRoundRect(f12, f13, width2 - f14, height2 - f15, f16, f16, this.f88952b);
        }
        super.onDraw(canvas);
    }

    public final void setMaskEnable(boolean z6) {
        this.f88953c = z6;
        invalidate();
    }
}

package com.bilibili.tgwt.detail.chat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/m.class */
@StabilityInferred(parameters = 0)
public final class m extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f111071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f111072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f111073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Drawable f111074g;

    @NotNull
    public final Drawable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f111075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f111076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f111077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f111078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f111079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f111080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public a f111081o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/m$a.class */
    public interface a {
        void a(@NotNull Context context);

        void b(long j7);
    }

    public m(@NotNull Context context, boolean z6, int i7) {
        this.f111068a = z6;
        this.f111069b = i7;
        int iB = Uj0.c.b(8, context) + i7;
        this.f111070c = iB;
        int iB2 = Uj0.c.b(4, context) + i7;
        this.f111071d = iB2;
        this.f111072e = (int) (((double) iB) * 1.05d);
        this.f111073f = z6 ? iB : iB2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(Uj0.c.a(i7 / 2, context));
        gradientDrawable.setStroke(Uj0.c.b(0.5f, context), ContextCompat.getColor(context, R$color.Wh0_u));
        this.f111074g = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(Uj0.c.a(this.f111073f / 2, context));
        gradientDrawable2.setStroke(Uj0.c.b(2.0f, context), ContextCompat.getColor(context, R$color.Brand_pink));
        this.h = gradientDrawable2;
        this.f111077k = "";
        this.f111078l = "";
    }

    public final void m(@NotNull String str) {
        if (Intrinsics.areEqual(str, this.f111077k)) {
            return;
        }
        this.f111077k = str;
        notifyPropertyChanged(128);
    }

    public final void n(long j7) {
        if (j7 == this.f111076j) {
            return;
        }
        this.f111076j = j7;
        notifyPropertyChanged(369);
    }

    public final void o(float f7) {
        if (f7 == this.f111080n) {
            return;
        }
        this.f111080n = f7;
        notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_SEGMENT_RESULT_BLUR);
    }

    public final void q(boolean z6) {
        if (z6 == this.f111079m) {
            return;
        }
        this.f111079m = z6;
        notifyPropertyChanged(419);
    }

    public final void r(@NotNull String str) {
        if (Intrinsics.areEqual(str, this.f111078l)) {
            return;
        }
        this.f111078l = str;
        notifyPropertyChanged(692);
    }
}

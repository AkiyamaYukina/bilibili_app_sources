package com.bilibili.ship.theseus.ogv.videocard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/b.class */
@StabilityInferred(parameters = 0)
public final class b extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f94705c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f94706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Drawable f94707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f94709g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/b$a.class */
    public static final class a {
        public static void a(b bVar, Context context, boolean z6, int i7) {
            float fC = Uj0.c.c(12, context);
            if (fC != bVar.f94706d) {
                bVar.f94706d = fC;
                bVar.notifyPropertyChanged(656);
            }
            if (z6) {
                if (i7 != 2 && i7 != 6) {
                    bVar.n(Uj0.c.b(56, context));
                    bVar.m(Uj0.c.b(20, context));
                    return;
                }
                bVar.n(Uj0.c.b(60, context));
                bVar.m(Uj0.c.b(24, context));
                float fC2 = Uj0.c.c(10, context);
                if (fC2 == bVar.f94706d) {
                    return;
                }
                bVar.f94706d = fC2;
                bVar.notifyPropertyChanged(656);
                return;
            }
            if (i7 != 2 && i7 != 6) {
                bVar.n(Uj0.c.b(66, context));
                bVar.m(Uj0.c.b(26, context));
                return;
            }
            bVar.n(Uj0.c.b(60, context));
            bVar.m(Uj0.c.b(24, context));
            float fC3 = Uj0.c.c(11, context);
            if (fC3 == bVar.f94706d) {
                return;
            }
            bVar.f94706d = fC3;
            bVar.notifyPropertyChanged(656);
        }

        @NotNull
        public static b b(@NotNull Context context, @Nullable PlayerCardButtonVO playerCardButtonVO, boolean z6, int i7) {
            if (playerCardButtonVO == null) {
                return new b();
            }
            b bVar = new b();
            bVar.f94708f = playerCardButtonVO.b();
            bVar.f94709g = playerCardButtonVO.a();
            a(bVar, context, z6, i7);
            String strC = playerCardButtonVO.c();
            if (!Intrinsics.areEqual(strC, bVar.f94705c)) {
                bVar.f94705c = strC;
                bVar.notifyPropertyChanged(640);
            }
            return bVar;
        }
    }

    public final void m(int i7) {
        if (i7 == this.f94704b) {
            return;
        }
        this.f94704b = i7;
        notifyPropertyChanged(282);
    }

    public final void n(int i7) {
        if (i7 == this.f94703a) {
            return;
        }
        this.f94703a = i7;
        notifyPropertyChanged(743);
    }
}

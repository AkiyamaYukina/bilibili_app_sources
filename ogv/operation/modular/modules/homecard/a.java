package com.bilibili.ogv.operation.modular.modules.homecard;

import Ek0.u;
import Nl0.j;
import Uj0.c;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ogv.infra.legacy.exposure.d;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.util.AppBuildConfig;
import y0.C9014b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.ViewHolder implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70713d = -1895032226;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f70714e = -1895032224;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f70715f = -1895032222;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final u f70716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Ok0.a f70717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70718c;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.modular.modules.homecard.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/a$a.class */
    public static final class C0432a {
        public static int a(int i7, int i8, int i9, int i10, int i11, int i12) {
            if (i7 == 0) {
                return i10;
            }
            int i13 = i7 - 1;
            if (i13 != i9 - 1) {
                i11 = i8 - a(i13, i8, i9, i10, i11, i12);
            }
            return i12 - i11;
        }

        @JvmStatic
        public static int b(int i7, @NotNull Context context, int i8) {
            int iB = c.b(12, context);
            int iB2 = (iB * 2) / 3;
            if (AppBuildConfig.Companion.isHDApp(context)) {
                iB = c.b(22.0f, context);
                iB2 = c.b(12.0f, context);
            }
            return a(i7, (int) ((((((i8 - 1) * iB2) + iB) + iB) * 1.0f) / i8), i8, iB, iB, iB2);
        }

        @JvmStatic
        public static int c(int i7, @NotNull Context context, int i8) {
            int iB = c.b(12, context);
            int iB2 = (iB * 2) / 3;
            if (AppBuildConfig.Companion.isHDApp(context)) {
                iB = c.b(22.0f, context);
                iB2 = c.b(12.0f, context);
            }
            int iA = (int) ((C9014b.a(r0, iB2, iB, iB) * 1.0f) / i8);
            if (i7 != i8 - 1) {
                iB = iA - a(i7, iA, i8, iB, iB, iB2);
            }
            return iB;
        }
    }

    public a(u uVar, Ok0.a aVar) {
        super(uVar.getRoot());
        this.f70716a = uVar;
        this.f70717b = aVar;
    }

    @Override // Nl0.j
    public final void release() {
        Ok0.a aVar = this.f70717b;
        d.h(this.f70716a.getRoot(), aVar.f17873b);
        aVar.f17877f.clear();
    }
}

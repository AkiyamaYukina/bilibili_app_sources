package com.bilibili.upper.module.cover_v2.presenter;

import P50.p;
import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import bx0.C5171d;
import com.bilibili.app.comm.opus.lightpublish.compose.O0;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import cx0.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/MultiCoverCaptionSettingProxy.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverCaptionSettingProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f112822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<? extends PointF> f112823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f112824c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f112825d;

    public MultiCoverCaptionSettingProxy(@NotNull a aVar) {
        this.f112822a = aVar;
    }

    public static PointF b(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty() || list.size() < 4) {
            return null;
        }
        PointF pointF = new PointF();
        float f7 = 2;
        pointF.x = (((PointF) list.get(0)).x + ((PointF) list.get(2)).x) / f7;
        pointF.y = (((PointF) list.get(0)).y + ((PointF) list.get(2)).y) / f7;
        return pointF;
    }

    public final void a(Function0<Unit> function0) {
        if (d() != null && c() != null) {
            function0.invoke();
            return;
        }
        this.f112822a.a(false);
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), (CoroutineStart) null, new MultiCoverCaptionSettingProxy$checkCaptionInfo$1(this, null), 2, (Object) null);
        function0.invoke();
    }

    public final CaptionInfo c() {
        com.bilibili.upper.module.cover_v2.service.c cVarD = this.f112822a.d();
        return cVarD != null ? cVarD.f112858f : null;
    }

    public final p d() {
        com.bilibili.upper.module.cover_v2.service.c cVarD = this.f112822a.d();
        return cVarD != null ? cVarD.f112857e : null;
    }

    public final void e(final int i7, @Nullable final String str, final boolean z6) {
        a(new Function0(this, z6, str, i7) { // from class: com.bilibili.upper.module.cover_v2.presenter.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverCaptionSettingProxy f112835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f112836b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f112837c;

            {
                this.f112835a = this;
                this.f112836b = str;
                this.f112837c = i7;
            }

            public final Object invoke() {
                MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112835a;
                multiCoverCaptionSettingProxy.getClass();
                p pVarD = multiCoverCaptionSettingProxy.d();
                String str2 = this.f112836b;
                if (pVarD != null) {
                    pVarD.setFontByFilePath(str2 == null ? "" : str2);
                }
                CaptionInfo captionInfoC = multiCoverCaptionSettingProxy.c();
                if (captionInfoC != null) {
                    String str3 = str2;
                    if (str2 == null) {
                        str3 = "";
                    }
                    captionInfoC.font = str3;
                }
                CaptionInfo captionInfoC2 = multiCoverCaptionSettingProxy.c();
                int i8 = this.f112837c;
                if (captionInfoC2 != null) {
                    captionInfoC2.idFont = i8;
                }
                a.a.a(cx0.a.g, Integer.valueOf(i8), (Integer) null, (Float) null, (Integer) null, (Integer) null, (String) null, 62);
                multiCoverCaptionSettingProxy.k();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("font_id", String.valueOf(i8));
                p pVarD2 = multiCoverCaptionSettingProxy.d();
                if (pVarD2 != null) {
                    pVarD2.addStatsExtraInfo(linkedHashMap);
                }
                return Unit.INSTANCE;
            }
        });
    }

    public final void f(@Nullable Integer num, boolean z6, int i7) {
        a(new O0(this, z6, num, i7));
    }

    public final void g(final int i7, final int i8, final boolean z6, final boolean z7) {
        a(new Function0(this, z7, z6, i7, i8) { // from class: com.bilibili.upper.module.cover_v2.presenter.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverCaptionSettingProxy f112838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f112839b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f112840c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f112841d;

            {
                this.f112838a = this;
                this.f112839b = z6;
                this.f112840c = i7;
                this.f112841d = i8;
            }

            public final Object invoke() {
                MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112838a;
                multiCoverCaptionSettingProxy.getClass();
                p pVarD = multiCoverCaptionSettingProxy.d();
                boolean z8 = this.f112839b;
                if (pVarD != null) {
                    pVarD.setDrawOutline(z8);
                }
                CaptionInfo captionInfoC = multiCoverCaptionSettingProxy.c();
                if (captionInfoC != null) {
                    captionInfoC.drawOutLine = z8;
                }
                int i9 = this.f112841d;
                if (z8) {
                    p pVarD2 = multiCoverCaptionSettingProxy.d();
                    Q50.a aVar = pVarD2 != null ? (Q50.a) pVarD2.getExtension() : null;
                    int i10 = this.f112840c;
                    R50.h hVarE = OC0.h.e(aVar, i10);
                    p pVarD3 = multiCoverCaptionSettingProxy.d();
                    if (pVarD3 != null) {
                        pVarD3.a(hVarE);
                    }
                    CaptionInfo captionInfoC2 = multiCoverCaptionSettingProxy.c();
                    if (captionInfoC2 != null) {
                        captionInfoC2.outLineColor = OC0.h.f(i10);
                    }
                    CaptionInfo captionInfoC3 = multiCoverCaptionSettingProxy.c();
                    if (captionInfoC3 != null) {
                        captionInfoC3.idOutLineColor = i9;
                    }
                }
                a.a aVar2 = cx0.a.g;
                if (!z8) {
                    i9 = -1;
                }
                a.a.a(aVar2, (Integer) null, (Integer) null, (Float) null, Integer.valueOf(i9), (Integer) null, (String) null, 55);
                multiCoverCaptionSettingProxy.k();
                return Unit.INSTANCE;
            }
        });
    }

    public final void h(final int i7, final boolean z6) {
        a(new Function0(this, z6, i7) { // from class: com.bilibili.upper.module.cover_v2.presenter.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiCoverCaptionSettingProxy f112829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f112830b;

            {
                this.f112829a = this;
                this.f112830b = i7;
            }

            public final Object invoke() {
                MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112829a;
                multiCoverCaptionSettingProxy.getClass();
                p pVarD = multiCoverCaptionSettingProxy.d();
                int i8 = this.f112830b;
                if (pVarD != null) {
                    pVarD.setOutlineWidth(i8);
                }
                CaptionInfo captionInfoC = multiCoverCaptionSettingProxy.c();
                if (captionInfoC != null) {
                    captionInfoC.outLineWidth = i8;
                }
                a.a.a(cx0.a.g, (Integer) null, (Integer) null, (Float) null, (Integer) null, Integer.valueOf(i8), (String) null, 47);
                multiCoverCaptionSettingProxy.k();
                return Unit.INSTANCE;
            }
        });
    }

    public final int i() {
        CaptionInfo captionInfoC = c();
        int iCoerceAtLeast = 0;
        if (captionInfoC != null) {
            iCoerceAtLeast = RangesKt.coerceAtLeast((int) captionInfoC.outLineWidth, 0);
        }
        return iCoerceAtLeast;
    }

    @NotNull
    public final C5171d j() {
        CaptionInfo captionInfoC = c();
        if (captionInfoC == null) {
            return new C5171d(0);
        }
        C5171d c5171d = new C5171d(0);
        c5171d.f57123b = captionInfoC.idTmp;
        c5171d.f57124c = captionInfoC.idFont;
        c5171d.f57125d = captionInfoC.idFontColor;
        c5171d.f57127f = captionInfoC.captionScale;
        EH0.p.f4125a.getClass();
        c5171d.f57122a = EH0.p.f4130f;
        c5171d.f57129i = captionInfoC.flowerId;
        if (captionInfoC.drawOutLine) {
            c5171d.f57128g = MathKt.roundToInt(captionInfoC.outLineWidth);
            c5171d.f57126e = captionInfoC.idOutLineColor;
        } else {
            c5171d.f57128g = 0;
            c5171d.f57126e = -1;
        }
        return c5171d;
    }

    public final void k() {
        p pVarD = d();
        if (pVarD != null) {
            a aVar = this.f112822a;
            aVar.f112826a.e(pVarD);
            aVar.f112826a.f();
        }
    }
}

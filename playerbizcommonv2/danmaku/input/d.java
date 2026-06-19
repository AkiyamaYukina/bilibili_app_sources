package com.bilibili.playerbizcommonv2.danmaku.input;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.a;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/d.class */
@StabilityInferred(parameters = 0)
public final class d<T extends com.bilibili.playerbizcommonv2.danmaku.input.panel.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f80980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.playerbizcommonv2.danmaku.input.panel.a f80981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f80982c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80983d;

    public d(@NotNull a aVar) {
        this.f80980a = aVar;
    }

    public static void a(d dVar, Class cls, Function1 function1, int i7) {
        if ((i7 & 4) != 0) {
            function1 = null;
        }
        dVar.f80982c = "";
        try {
            com.bilibili.playerbizcommonv2.danmaku.input.panel.a aVar = (com.bilibili.playerbizcommonv2.danmaku.input.panel.a) cls.newInstance();
            aVar.l(dVar.f80980a);
            dVar.f80981b = aVar;
            if (function1 != null) {
                function1.invoke(aVar);
            }
        } catch (Exception e7) {
            BLog.e("PanelRecord", "PanelRecord new instance input panel " + cls + " failed,because " + e7.getMessage());
        }
    }
}

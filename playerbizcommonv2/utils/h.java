package com.bilibili.playerbizcommonv2.utils;

import I3.C;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C4628q;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f81934a = LazyKt.lazy(new I3.B(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f81935b = LazyKt.lazy(new C(8));

    public static int a() {
        Calendar calendar = Calendar.getInstance();
        String strA = C4628q.a(calendar.get(1), calendar.get(6), "_");
        Lazy lazy = f81935b;
        int i7 = 0;
        if (Intrinsics.areEqual(((tv.danmaku.bili.widget.preference.a) lazy.getValue()).a.getString("key_follow_guide_date", ""), strA)) {
            i7 = ((tv.danmaku.bili.widget.preference.a) lazy.getValue()).a.getInt("key_all_strategy_show_times", 0);
        } else {
            ((tv.danmaku.bili.widget.preference.a) lazy.getValue()).p("key_follow_guide_date", strA);
            ((tv.danmaku.bili.widget.preference.a) lazy.getValue()).n("key_all_strategy_show_times", 0);
        }
        return i7;
    }
}

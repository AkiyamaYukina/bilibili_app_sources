package com.bilibili.playerbizcommonv2.utils;

import I3.G;
import I3.H;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C4628q;
import com.bilibili.playerbizcommonv2.utils.w;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/v.class */
@StabilityInferred(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f81957a = LazyKt.lazy(new G(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f81958b = LazyKt.lazy(new H(9));

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static int a(w wVar) throws NoWhenBranchMatchedException {
        int i7;
        Calendar calendar = Calendar.getInstance();
        String strA = C4628q.a(calendar.get(1), calendar.get(6), "_");
        if (Intrinsics.areEqual(b().a.getString("key_share_guide_date", ""), strA)) {
            i7 = b().a.getInt(d(wVar), wVar.f81959a);
        } else {
            b().p("key_share_guide_date", strA);
            b().n("key_detail_strategy_action", 0);
            b().n("key_detail_strategy_progress", 0);
            b().n("key_detail_online_number", 0);
            b().n("key_story_strategy_action", 0);
            b().n("key_story_strategy_progress", 0);
            b().n("key_all_strategy_show_times", 0);
            i7 = 0;
        }
        return i7;
    }

    public static tv.danmaku.bili.widget.preference.a b() {
        return (tv.danmaku.bili.widget.preference.a) f81958b.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static boolean c(@NotNull w wVar) throws NoWhenBranchMatchedException {
        int iA = a(wVar);
        int i7 = b().a.getInt("key_all_strategy_show_times", 0);
        boolean z6 = false;
        if (iA < wVar.f81959a) {
            z6 = false;
            if (i7 < ((Number) f81957a.getValue()).intValue()) {
                z6 = true;
            }
        }
        BLog.i("strategy: " + wVar + ", show times: " + iA + ", all show times: " + i7);
        return z6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String d(w wVar) throws NoWhenBranchMatchedException {
        String str;
        if (wVar instanceof w.a) {
            str = "key_detail_strategy_action";
        } else if (wVar instanceof w.c) {
            str = "key_detail_strategy_progress";
        } else if (wVar instanceof w.b) {
            str = "key_detail_online_number";
        } else if (wVar instanceof w.d) {
            str = "key_story_strategy_action";
        } else {
            if (!(wVar instanceof w.e)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "key_story_strategy_progress";
        }
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static String e(@NotNull w wVar) throws NoWhenBranchMatchedException {
        String str;
        if ((wVar instanceof w.a) || (wVar instanceof w.d)) {
            str = "1";
        } else if ((wVar instanceof w.c) || (wVar instanceof w.e)) {
            str = "2";
        } else {
            if (!(wVar instanceof w.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "3";
        }
        return str;
    }

    public static void f(@NotNull w wVar) {
        int iA = a(wVar) + 1;
        b().n(d(wVar), RangesKt.coerceAtMost(RangesKt.coerceAtLeast(iA, 0), wVar.f81959a));
        int i7 = b().a.getInt("key_all_strategy_show_times", 0) + 1;
        b().n("key_all_strategy_show_times", RangesKt.coerceAtMost(RangesKt.coerceAtLeast(i7, 0), ((Number) f81957a.getValue()).intValue()));
        BLog.i("updateShareGuideTimes strategy: " + wVar + ", current times: " + iA + "， all times: " + i7);
    }
}

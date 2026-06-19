package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/w.class */
public final class w implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f69606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f69607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C9061a f69608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BangumiTimelineDay f69609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f69610e;

    public w(List list, List list2, C9061a c9061a, BangumiTimelineDay bangumiTimelineDay, int i7) {
        this.f69606a = list;
        this.f69607b = list2;
        this.f69608c = c9061a;
        this.f69609d = bangumiTimelineDay;
        this.f69610e = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        List<BangumiTimeline> listM;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i7 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
        } else {
            i7 = iIntValue2;
        }
        int i8 = i7;
        if ((iIntValue2 & 48) == 0) {
            i8 = i7 | (composer.changed(iIntValue) ? 32 : 16);
        }
        if (composer.shouldExecute((i8 & 147) != 146, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i8, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            BangumiTimeline bangumiTimeline = (BangumiTimeline) this.f69606a.get(iIntValue);
            composer.startReplaceGroup(-874560467);
            BangumiTimeline bangumiTimeline2 = (BangumiTimeline) CollectionsKt.getOrNull(this.f69607b, iIntValue - 1);
            C9061a c9061a = this.f69608c;
            if (iIntValue == 0) {
                composer.startReplaceGroup(-874477977);
                long jC = bangumiTimeline.c();
                c9061a.getClass();
                p.d(jC > C9061a.c(), C9061a.d(bangumiTimeline.c()) == 0, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-874227156);
                composer.endReplaceGroup();
            }
            c9061a.getClass();
            long jC2 = C9061a.c();
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT+8"), Locale.CHINA);
            calendar.setTimeInMillis(jC2);
            String str = new SimpleDateFormat("HH:mm", Locale.CHINESE).format(calendar.getTime());
            long jC3 = bangumiTimeline.c();
            long jC4 = C9061a.c();
            int iD = C9061a.d(jC3);
            BangumiTimelineDay bangumiTimelineDay = this.f69609d;
            if (iD > 1 || jC4 > jC3 || ((bangumiTimeline2 != null && bangumiTimeline2.c() >= jC4) || !bangumiTimelineDay.n())) {
                composer.startReplaceGroup(-873927572);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-874013101);
                TimelineCurrentTimeItemKt.a(c9061a, str, composer, 0);
                composer.endReplaceGroup();
            }
            p.a(bangumiTimeline, this.f69608c, bangumiTimeline2, bangumiTimelineDay.n(), composer, 0);
            if (iIntValue == this.f69607b.size() - 1) {
                composer.startReplaceGroup(-873778214);
                long jC5 = bangumiTimeline.c();
                long jC6 = C9061a.c();
                if (C9061a.d(jC5) != 0 || jC6 <= jC5) {
                    composer.startReplaceGroup(-873615092);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-873704465);
                    TimelineCurrentTimeItemKt.a(c9061a, str, composer, 0);
                    composer.endReplaceGroup();
                }
                BangumiTimelineDay bangumiTimelineDay2 = (BangumiTimelineDay) CollectionsKt.getOrNull(c9061a.e(), this.f69610e + 1);
                BangumiTimeline bangumiTimeline3 = (bangumiTimelineDay2 == null || (listM = bangumiTimelineDay2.m()) == null) ? null : (BangumiTimeline) CollectionsKt.firstOrNull(listM);
                if (((Boolean) c9061a.f129726n.getValue()).booleanValue() && bangumiTimelineDay.n() && ((Boolean) c9061a.f129720g.invoke(bangumiTimelineDay, bangumiTimeline3)).booleanValue()) {
                    composer.startReplaceGroup(-873391303);
                    p.c(c9061a, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-873311540);
                    composer.endReplaceGroup();
                }
                p.b(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-873238132);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}

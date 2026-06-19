package com.bilibili.ship.theseus.ugc.playlimited;

import E11.h;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f98385a = LazyKt.lazy(new h(5));

    @NotNull
    public static final RestrictionLayerVo a(@NotNull RestrictionLayerVo restrictionLayerVo, boolean z6, @Nullable RestrictionLayerVo.NextPlayableVo nextPlayableVo) {
        ReportVo reportVoA;
        TextVo textVoA;
        List<TextVo> list = restrictionLayerVo.f102672f;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextVo textVo = (TextVo) it.next();
            ReportVo reportVoL = textVo.l();
            if (reportVoL == null) {
                textVoA = textVo;
            } else {
                textVoA = TextVo.a(textVo, null, ReportVo.a(reportVoL, MapsKt.plus(reportVoL.c(), MapsKt.mapOf(new Pair[]{TuplesKt.to("play_style", z6 ? "auto" : "normal"), TuplesKt.to("is_auto", "0")}))), 65407);
            }
            arrayList.add(textVoA);
        }
        ReportVo reportVo = restrictionLayerVo.f102673g;
        if (reportVo != null) {
            reportVoA = ReportVo.a(reportVo, MapsKt.plus(reportVo.c(), TuplesKt.to("play_style", z6 ? "auto" : "normal")));
        } else {
            reportVoA = null;
        }
        RestrictionLayerVo restrictionLayerVoA = RestrictionLayerVo.a(restrictionLayerVo, null, arrayList, reportVoA, null, 0L, 32671);
        RestrictionLayerVo restrictionLayerVoA2 = restrictionLayerVoA;
        if (z6) {
            restrictionLayerVoA2 = restrictionLayerVoA;
            if (nextPlayableVo != null) {
                RestrictionLayerVo.Style style = RestrictionLayerVo.Style.CHARGING_TEXT_WITH_NEXT_PLAYABLE;
                Duration.Companion companion = Duration.Companion;
                restrictionLayerVoA2 = RestrictionLayerVo.a(restrictionLayerVoA, style, null, null, nextPlayableVo, DurationKt.toDuration(((Number) f98385a.getValue()).intValue(), DurationUnit.SECONDS), 8190);
            }
        }
        return restrictionLayerVoA2;
    }
}

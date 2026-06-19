package com.bilibili.ship.theseus.united.bean;

import android.util.Range;
import androidx.collection.ArrayMap;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tb0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final tb0.h f98758a = j.c();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/e$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f98759a;

        static {
            int[] iArr = new int[InlineType.values().length];
            try {
                iArr[InlineType.TYPE_HE_CLIP.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[InlineType.TYPE_PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f98759a = iArr;
        }
    }

    @NotNull
    public static final sb0.c a(@Nullable OgvClipParams ogvClipParams) {
        sb0.c cVar;
        if (ogvClipParams == null) {
            return sb0.c.d;
        }
        int i7 = a.f98759a[ogvClipParams.f98731e.ordinal()];
        Range range = null;
        long j7 = ogvClipParams.f98729c;
        if (i7 == 1) {
            Duration duration = Duration.box-impl(j7);
            long j8 = duration.unbox-impl();
            Duration.Companion companion = Duration.Companion;
            if (Duration.compareTo-LRDsOJo(j8, companion.getZERO-UwyO8pc()) <= 0) {
                duration = null;
            }
            long j9 = ogvClipParams.f98728b;
            long j10 = ogvClipParams.f98727a;
            Duration duration2 = Duration.box-impl(Duration.minus-LRDsOJo(j9, j10));
            if (Duration.compareTo-LRDsOJo(duration2.unbox-impl(), companion.getZERO-UwyO8pc()) <= 0) {
                duration2 = null;
            }
            if (duration2 != null) {
                duration2.unbox-impl();
                range = new Range(Duration.box-impl(j10), Duration.box-impl(j9));
            }
            cVar = new sb0.c(duration, j10, range);
        } else if (i7 != 2) {
            cVar = sb0.c.d;
        } else {
            Duration duration3 = Duration.box-impl(j7);
            long j11 = duration3.unbox-impl();
            Duration.Companion companion2 = Duration.Companion;
            if (Duration.compareTo-LRDsOJo(j11, companion2.getZERO-UwyO8pc()) <= 0) {
                duration3 = null;
            }
            cVar = new sb0.c(duration3, companion2.getZERO-UwyO8pc(), (Range) null, 4);
        }
        return cVar;
    }

    @NotNull
    public static final ArrayMap b(@NotNull d dVar) {
        ArrayMap arrayMap = new ArrayMap();
        Long l7 = dVar.f98752a;
        if (l7 != null) {
            arrayMap.put("season_id", String.valueOf(l7.longValue()));
        }
        Long l8 = dVar.f98754c;
        if (l8 != null) {
            arrayMap.put("ep_id", String.valueOf(l8.longValue()));
        }
        String str = dVar.f98757f;
        if (str != null) {
            arrayMap.put("biz_type", str);
        }
        return arrayMap;
    }
}

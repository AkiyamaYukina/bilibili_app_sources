package com.bilibili.ship.theseus.playlist.util;

import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.VideoDimension;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import video.biz.offline.base.model.entity.OfflineVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/KOfflineDataHelperKt.class */
public final class KOfflineDataHelperKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f96118a = LazyKt.lazy(new FJ.a(7));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/KOfflineDataHelperKt$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f96120b;

        static {
            int[] iArr = new int[OfflineVideoEntity.BizType.values().length];
            try {
                iArr[OfflineVideoEntity.BizType.OGV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f96119a = iArr;
            int[] iArr2 = new int[OfflineVideoEntity.SeasonType.values().length];
            try {
                iArr2[OfflineVideoEntity.SeasonType.BANGUMI.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr2[OfflineVideoEntity.SeasonType.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[OfflineVideoEntity.SeasonType.DOCUMENTARY.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[OfflineVideoEntity.SeasonType.CN_BANGUMI.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[OfflineVideoEntity.SeasonType.TV_SERIES.ordinal()] = 5;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[OfflineVideoEntity.SeasonType.VARIETY.ordinal()] = 6;
            } catch (NoSuchFieldError e13) {
            }
            f96120b = iArr2;
        }
    }

    @Nullable
    public static final Object a(int i7, @NotNull Continuation<? super List<MultiTypeMedia>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new KOfflineDataHelperKt$processKOfflineData$2(i7, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0148 -> B:21:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0255 -> B:31:0x027c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.List r51, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r52) {
        /*
            Method dump skipped, instruction units count: 1468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.util.KOfflineDataHelperKt.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final VideoDimension c(OfflineVideoEntity offlineVideoEntity) {
        return (offlineVideoEntity.t == 1 && ((Boolean) f96118a.getValue()).booleanValue()) ? new VideoDimension((int) offlineVideoEntity.s, (int) offlineVideoEntity.r, 0) : new VideoDimension((int) offlineVideoEntity.r, (int) offlineVideoEntity.s, (int) offlineVideoEntity.t);
    }
}

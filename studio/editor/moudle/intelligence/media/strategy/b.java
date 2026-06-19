package com.bilibili.studio.editor.moudle.intelligence.media.strategy;

import Nj.H;
import Nj.I;
import androidx.compose.material3.E4;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.config.bean.MediaStrategyAnalysisCount;
import com.bilibili.studio.config.bean.MediaStrategyCalculateConfig;
import com.bilibili.studio.config.bean.MediaStrategyConfig;
import com.bilibili.studio.config.bean.MediaStrategyFilterConfig;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.g;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.i;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4.ServerStrategyManagerNew;
import com.bilibili.studio.videoeditor.extension.m;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zw0.C9269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<vz0.b, Object> f107383a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f107384b = LazyKt.lazy(new H(this, 4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f107385c = LazyKt.lazy(new I(this, 3));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f107386d = LazyKt.lazy(new E4(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f107387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f107388f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/b$a.class */
    public static final class a {
        @NotNull
        public static String a(int i7) {
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? MediaStrategyItem.SOURCE_FROM_OTHER : "视频" : "图片" : MediaStrategyItem.SOURCE_FROM_ALL;
        }
    }

    public final void a(int i7, @NotNull MediaStrategyItem mediaStrategyItem) {
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.a aVarD = d(i7);
        if (aVarD != null) {
            aVarD.a(mediaStrategyItem);
        }
        Iterator<T> it = this.f107383a.keySet().iterator();
        while (it.hasNext()) {
            ((vz0.b) it.next()).a(i7, mediaStrategyItem);
        }
    }

    public final com.bilibili.studio.editor.moudle.intelligence.media.strategy.a b(int i7) {
        MediaStrategyConfig mediaStrategyConfig;
        Integer numValueOf;
        com.bilibili.studio.editor.moudle.intelligence.media.strategy.a iVar;
        MediaStrategyCalculateConfig strategyCalculateConfig;
        MediaStrategyCalculateConfig strategyCalculateConfig2;
        MediaStrategyFilterConfig strategyFilterConfig;
        MediaStrategyFilterConfig strategyFilterConfig2;
        MediaStrategyFilterConfig strategyFilterConfig3;
        MediaStrategyFilterConfig strategyFilterConfig4;
        Integer maxResultNum;
        Integer minResultNum;
        if (!com.bilibili.studio.comm.manager.d.a()) {
            return null;
        }
        if (C9269a.f130941b == null) {
            try {
                mediaStrategyConfig = (MediaStrategyConfig) JSON.parseObject(zw0.b.s(), MediaStrategyConfig.class);
            } catch (Exception e7) {
                mediaStrategyConfig = null;
            }
            C9269a.f130941b = mediaStrategyConfig;
        }
        MediaStrategyConfig mediaStrategyConfig2 = C9269a.f130941b;
        if (i7 == 2) {
            numValueOf = null;
            if (mediaStrategyConfig2 != null) {
                MediaStrategyAnalysisCount tabAnalysisCount = mediaStrategyConfig2.getTabAnalysisCount();
                numValueOf = null;
                if (tabAnalysisCount != null) {
                    MediaStrategyAnalysisCount.Config photo = tabAnalysisCount.getPhoto();
                    numValueOf = null;
                    if (photo != null) {
                        numValueOf = Integer.valueOf(photo.getMaxAnalysisCount());
                    }
                }
            }
        } else if (i7 != 3) {
            numValueOf = null;
            if (mediaStrategyConfig2 != null) {
                MediaStrategyAnalysisCount tabAnalysisCount2 = mediaStrategyConfig2.getTabAnalysisCount();
                numValueOf = null;
                if (tabAnalysisCount2 != null) {
                    MediaStrategyAnalysisCount.Config all = tabAnalysisCount2.getAll();
                    numValueOf = null;
                    if (all != null) {
                        numValueOf = Integer.valueOf(all.getMaxAnalysisCount());
                    }
                }
            }
        } else {
            numValueOf = null;
            if (mediaStrategyConfig2 != null) {
                MediaStrategyAnalysisCount tabAnalysisCount3 = mediaStrategyConfig2.getTabAnalysisCount();
                numValueOf = null;
                if (tabAnalysisCount3 != null) {
                    MediaStrategyAnalysisCount.Config video = tabAnalysisCount3.getVideo();
                    numValueOf = null;
                    if (video != null) {
                        numValueOf = Integer.valueOf(video.getMaxAnalysisCount());
                    }
                }
            }
        }
        int iIntValue = Integer.MAX_VALUE;
        if (((Boolean) zw0.b.f130964p.getValue()).booleanValue()) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            int imageDayGroupMaxCount = mediaStrategyConfig2 != null ? mediaStrategyConfig2.getImageDayGroupMaxCount() : 5;
            int imageDayGroupMinCount = mediaStrategyConfig2 != null ? mediaStrategyConfig2.getImageDayGroupMinCount() : 3;
            iVar = new i(new c(i7, imageDayGroupMaxCount, imageDayGroupMinCount), new com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.a(), new com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.d(imageDayGroupMinCount), new g(imageDayGroupMaxCount, imageDayGroupMinCount), new com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.c(iIntValue), new com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.b());
        } else {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            iVar = new ServerStrategyManagerNew(new uz0.b(i7, mediaStrategyConfig2 != null ? mediaStrategyConfig2.getImageDayGroupMaxCount() : 3, mediaStrategyConfig2 != null ? mediaStrategyConfig2.getImageDayGroupMinCount() : 5, (mediaStrategyConfig2 == null || (minResultNum = mediaStrategyConfig2.getMinResultNum()) == null) ? 3 : minResultNum.intValue(), (mediaStrategyConfig2 == null || (maxResultNum = mediaStrategyConfig2.getMaxResultNum()) == null) ? 5 : maxResultNum.intValue(), iIntValue, (mediaStrategyConfig2 == null || (strategyFilterConfig4 = mediaStrategyConfig2.getStrategyFilterConfig()) == null) ? 3 : strategyFilterConfig4.imageMinNum, (mediaStrategyConfig2 == null || (strategyFilterConfig3 = mediaStrategyConfig2.getStrategyFilterConfig()) == null) ? 8L : strategyFilterConfig3.videoMinDuration, (mediaStrategyConfig2 == null || (strategyFilterConfig2 = mediaStrategyConfig2.getStrategyFilterConfig()) == null) ? 5 : strategyFilterConfig2.distinctNum, (mediaStrategyConfig2 == null || (strategyFilterConfig = mediaStrategyConfig2.getStrategyFilterConfig()) == null) ? 20 : strategyFilterConfig.recallNum, (mediaStrategyConfig2 == null || (strategyCalculateConfig2 = mediaStrategyConfig2.getStrategyCalculateConfig()) == null) ? 100 : strategyCalculateConfig2.randomNum, (mediaStrategyConfig2 == null || (strategyCalculateConfig = mediaStrategyConfig2.getStrategyCalculateConfig()) == null) ? 3 : strategyCalculateConfig.maxValidNum, m.b(this.f107387e, 0L), m.b(this.f107388f, 0L)));
        }
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(int r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7, boolean r8) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.intelligence.media.strategy.MultiMediaStrategyManager$getRecommendStrategyList$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.MultiMediaStrategyManager$getRecommendStrategyList$1 r0 = (com.bilibili.studio.editor.moudle.intelligence.media.strategy.MultiMediaStrategyManager$getRecommendStrategyList$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r7 = r0
            goto L38
        L2e:
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.MultiMediaStrategyManager$getRecommendStrategyList$1 r0 = new com.bilibili.studio.editor.moudle.intelligence.media.strategy.MultiMediaStrategyManager$getRecommendStrategyList$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6a
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L5f
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r7 = r0
            goto L96
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6a:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            r1 = r6
            com.bilibili.studio.editor.moudle.intelligence.media.strategy.a r0 = r0.d(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto La4
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r8
            r2 = r7
            java.lang.Object r0 = r0.c(r1, r2)
            r10 = r0
            r0 = r10
            r7 = r0
            r0 = r10
            r1 = r11
            if (r0 != r1) goto L96
            r0 = r11
            return r0
        L96:
            r0 = r7
            java.util.List r0 = (java.util.List) r0
            r10 = r0
            r0 = r10
            r7 = r0
            r0 = r10
            if (r0 != 0) goto La8
        La4:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r7 = r0
        La8:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.b.c(int, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    public final com.bilibili.studio.editor.moudle.intelligence.media.strategy.a d(int i7) {
        return i7 != 2 ? i7 != 3 ? (com.bilibili.studio.editor.moudle.intelligence.media.strategy.a) this.f107384b.getValue() : (com.bilibili.studio.editor.moudle.intelligence.media.strategy.a) this.f107385c.getValue() : (com.bilibili.studio.editor.moudle.intelligence.media.strategy.a) this.f107386d.getValue();
    }
}

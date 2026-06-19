package com.bilibili.player.tangram.playercore;

import X1.C3081k;
import com.bilibili.app.gemini.base.resolver.qn.QualityScene;
import com.bilibili.lib.media.resource.MediaResource;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.videoplayer.coreV2.MediaItem;
import tv.danmaku.videoplayer.coreV2.transformer.MediaItemParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/u.class */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f79458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.g f79459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MediaResource f79460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<C5773a, MediaItemParams.Builder> f79461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f79462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f79463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final MediaItem<?> f79464g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Function2<C, Continuation<? super MediaResource>, Object> f79465i;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.player.tangram.basic.g gVar, @NotNull MediaResource mediaResource, @NotNull Function1<? super C5773a, MediaItemParams.Builder> function1, boolean z6, boolean z7, @Nullable MediaItem<?> mediaItem, boolean z8, @Nullable Function2<? super C, ? super Continuation<? super MediaResource>, ? extends Object> function2) {
        this.f79458a = iPlayerCoreService;
        this.f79459b = gVar;
        this.f79460c = mediaResource;
        this.f79461d = function1;
        this.f79462e = z6;
        this.f79463f = z7;
        this.f79464g = mediaItem;
        this.h = z8;
        this.f79465i = function2;
    }

    public /* synthetic */ u(IPlayerCoreService iPlayerCoreService, com.bilibili.player.tangram.basic.g gVar, MediaResource mediaResource, Function1 function1, boolean z6, boolean z7, boolean z8, Function2 function2, int i7) {
        this(iPlayerCoreService, gVar, mediaResource, (Function1<? super C5773a, MediaItemParams.Builder>) function1, z6, z7, (MediaItem<?>) null, (i7 & 128) != 0 ? false : z8, (Function2<? super C, ? super Continuation<? super MediaResource>, ? extends Object>) ((i7 & 256) != 0 ? null : function2));
    }

    @NotNull
    public final MediaItemParams a(long j7, boolean z6, @Nullable ClosedRange<com.bilibili.player.tangram.basic.a> closedRange, @Nullable QualityScene qualityScene, long j8) {
        StringBuilder sbB = C3081k.b("position: ", Duration.toString-impl(j7), ", accuracy: ", ", recommendRange: ", z6);
        sbB.append(closedRange);
        BLog.i("PCSMedia-buildMediaItemParams-gRj5Bb8", "[tangram-player-core-PCSMedia-buildMediaItemParams-gRj5Bb8] " + sbB.toString());
        MediaItemParams.Builder builder = (MediaItemParams.Builder) this.f79461d.invoke(new C5773a(this.f79460c));
        builder.setForceStartAccurateSeek(z6);
        builder.setRecommendStartQualityRange(closedRange != null ? F.a(closedRange) : null);
        builder.setStartPosition(Duration.getInWholeMilliseconds-impl(RangesKt.coerceAtLeast(Duration.box-impl(Duration.minus-LRDsOJo(j7, b().b)), Duration.box-impl(Duration.Companion.getZERO-UwyO8pc())).unbox-impl()));
        builder.setCacheTime(j8);
        builder.setScreenState(Integer.valueOf(this.h ? 1 : 0));
        if (qualityScene != null) {
            builder.setStartScreenRatio(Integer.valueOf(qualityScene.ordinal()));
        }
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sb0.c b() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.lib.media.resource.MediaResource r0 = r0.f79460c
            com.bilibili.lib.media.resource.ExtraInfo r0 = r0.getExtraInfo()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L17
            r0 = r3
            sb0.c r0 = r0.getProgressManipulation()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1f
        L17:
            sb0.c r0 = sb0.c.d
            r3 = r0
            sb0.c r0 = sb0.c.d
            r3 = r0
        L1f:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.u.b():sb0.c");
    }
}

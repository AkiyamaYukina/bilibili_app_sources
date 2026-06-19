package com.bilibili.ship.theseus.miniplayer.ai;

import I3.J2;
import com.bapis.bilibili.app.view.v1.Relate;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qh0.InterfaceC8430a;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.videoplayer.coreV2.VideoBizType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ai/a.class */
public final class a implements InterfaceC8430a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy<a> f91152d = LazyKt.lazy(new J2(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f91153a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Video.PlayableParams f91154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f91155c;

    public static GeminiCommonPlayableParams b(Relate relate, Video.PlayableParams playableParams) {
        GeminiCommonPlayableParams geminiCommonPlayableParams = new GeminiCommonPlayableParams();
        geminiCommonPlayableParams.setType(3);
        geminiCommonPlayableParams.setAvid(relate.getAid());
        geminiCommonPlayableParams.setTitle(relate.getTitle());
        geminiCommonPlayableParams.setAuthor(relate.getAuthor().getName());
        geminiCommonPlayableParams.setAuthorFace(relate.getAuthor().getFace());
        geminiCommonPlayableParams.setMid(relate.getAuthor().getMid());
        geminiCommonPlayableParams.setCid(relate.getCid());
        geminiCommonPlayableParams.setCover(relate.getPic());
        geminiCommonPlayableParams.setFnVal(PlayUrlFlagsManager.getFnVal());
        geminiCommonPlayableParams.setFnVer(PlayUrlFlagsManager.getFnVer());
        geminiCommonPlayableParams.setBizType(VideoBizType.UGC);
        geminiCommonPlayableParams.setEnableSafeConnection(PlayerSettingHelper.enablePlayUrlHTTPS());
        geminiCommonPlayableParams.setFrom("vupload");
        geminiCommonPlayableParams.setSpmid(playableParams.getSpmid());
        geminiCommonPlayableParams.setFromSpmid("united.player-video-detail.0.0");
        geminiCommonPlayableParams.setFromScene(GeminiCommonResolverParams.Scene.DETAIL);
        geminiCommonPlayableParams.setTrackId(relate.getTrackid());
        geminiCommonPlayableParams.setFromAutoPlay(playableParams.getFromAutoPlay());
        long width = relate.getDimension().getWidth();
        long height = relate.getDimension().getHeight();
        if (width > 0 && height > 0) {
            geminiCommonPlayableParams.setDisplayRotate(height / width);
        }
        return geminiCommonPlayableParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // qh0.InterfaceC8430a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.service.Video.PlayableParams r8, int r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.miniplayer.ai.a.a(tv.danmaku.biliplayerv2.service.Video$PlayableParams, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

package com.bilibili.pegasus.common.inline;

import android.net.Uri;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.bililive.listplayer.videonew.player.InlineLivePlayableParams;
import com.bilibili.bililive.listplayer.videonew.player.InlineUgcPlayableParams;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.moss.utils.RuntimeHelper;
import com.bilibili.ogv.pub.play.OGVPlayableParams;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import com.bilibili.pegasus.data.component.UpArgsData;
import com.bilibili.playerbizcommon.IPlayerPreloadRouteService;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PlayerParamsBuilderKt.class */
public final class PlayerParamsBuilderKt {
    public static final int INLINE_AUTO_PLAY = 2;
    public static final int INLINE_AUTO_PLAY_IN_NOTIFY_AND_BANNER = 99;
    public static final int INLINE_AUTO_PLAY_UNDEFINED = -1;
    public static final int INLINE_CLICK_PLAY = 0;

    @NotNull
    public static final String SPMID_BANNER_INLINE = "tm.recommend.inlinebanner.0";
    public static final int SPMID_DEFAULT = 0;

    @NotNull
    public static final String SPMID_NOTIFY_INLINE = "tm.recommend.inlinerss.0";

    @NotNull
    public static final String SPMID_RECOMMEND = "tm.recommend.0.0";
    public static final int SPMID_TYPE_BANNER = 1;
    public static final int SPMID_TYPE_NOTIFY = 2;
    public static final int VD_NEW_FROM_TM_LIST_PLAYER = 76;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PlayerParamsBuilderKt$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75550a;

        static {
            int[] iArr = new int[SpecialSpmidType.values().length];
            try {
                iArr[SpecialSpmidType.TYPE_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SpecialSpmidType.TYPE_NOTIFY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f75550a = iArr;
        }
    }

    public static final void addBasicPlayerParams(@NotNull BasePegasusPlayerData basePegasusPlayerData, @NotNull Video.PlayableParams playableParams, @NotNull SpecialSpmidType specialSpmidType, int i7) {
        int i8;
        if (basePegasusPlayerData.getCardPlayProperty().getPlayReason() == PlayReason.INLINE_AUTO_PLAY) {
            i8 = i7;
            if (i7 == -1) {
                i8 = 2;
            }
        } else {
            i8 = 0;
        }
        String uri = basePegasusPlayerData.getUri();
        if (uri != null && !StringsKt.isBlank(uri)) {
            String uri2 = basePegasusPlayerData.getUri();
            Uri uri3 = uri2 != null ? Uri.parse(uri2) : null;
            playableParams.setFlashJsonStr(uri3 != null ? uri3.getQueryParameter("player_preload") : null);
            playableParams.setTrackId(uri3 != null ? uri3.getQueryParameter("trackid") : null);
            if (playableParams.getFlashJsonStr() == null || playableParams.getTrackId() == null) {
                StringBuilder sbA = G0.b.a("get uri query parameter error: flashJsonStr:", playableParams.getFlashJsonStr(), " and trackId:", playableParams.getTrackId(), " and uri:");
                sbA.append(uri3);
                BLog.w("PegasusInlinePlayerParamsBuilder", sbA.toString());
            }
        }
        playableParams.setJumpFrom(String.valueOf(76));
        playableParams.setShareJumpFrom(String.valueOf(761));
        playableParams.setSpmid(getSpmid$default(null, 1, null));
        String reportFlowData = basePegasusPlayerData.getReportFlowData();
        if (reportFlowData != null) {
            playableParams.setLegacyExtra(MapsKt.mapOf(TuplesKt.to("report_flow_data", reportFlowData)));
        }
        playableParams.setFromSpmid(getSpmid(specialSpmidType));
        playableParams.setFromAutoPlay(i8);
        IPlayerPreloadRouteService iPlayerPreloadRouteService = (IPlayerPreloadRouteService) BLRouter.INSTANCE.get(IPlayerPreloadRouteService.class, "player_preload");
        if (iPlayerPreloadRouteService != null) {
            playableParams.setFnVal(iPlayerPreloadRouteService.getFnVal());
            playableParams.setFnVer(iPlayerPreloadRouteService.getFnVer());
        }
    }

    public static /* synthetic */ void addBasicPlayerParams$default(BasePegasusPlayerData basePegasusPlayerData, Video.PlayableParams playableParams, SpecialSpmidType specialSpmidType, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            specialSpmidType = SpecialSpmidType.DEFAULT;
        }
        if ((i8 & 4) != 0) {
            i7 = -1;
        }
        addBasicPlayerParams(basePegasusPlayerData, playableParams, specialSpmidType, i7);
    }

    public static final void addLivePlayerParams(@NotNull BasePegasusPlayerData basePegasusPlayerData, @NotNull InlineLivePlayableParams inlineLivePlayableParams, int i7) {
        inlineLivePlayableParams.setShowDanmaku(!basePegasusPlayerData.getDisableDanmaku());
        inlineLivePlayableParams.setTitle(basePegasusPlayerData.getTitle());
        inlineLivePlayableParams.setCover(basePegasusPlayerData.getCover());
        PlayerArgs playerArgs = basePegasusPlayerData.getPlayerArgs();
        if (playerArgs != null) {
            inlineLivePlayableParams.setRoomId(playerArgs.roomId);
        }
        String inlineUri = basePegasusPlayerData.getInlineUri();
        inlineLivePlayableParams.setLink((inlineUri == null || StringsKt.isBlank(inlineUri) || Intrinsics.areEqual(RuntimeHelper.INSTANCE.getCm().ff("live_inline_use_link"), Boolean.FALSE)) ? basePegasusPlayerData.getUri() : basePegasusPlayerData.getInlineUri());
        UpArgsData upArgs = basePegasusPlayerData.getUpArgs();
        if (upArgs != null) {
            inlineLivePlayableParams.setMid(upArgs.getUpId());
        }
        inlineLivePlayableParams.setBusiness("pegasus");
        inlineLivePlayableParams.setLiveScene(i7);
    }

    public static final void addOGVResolverTypeParams(@NotNull OGVPlayableParams oGVPlayableParams) {
        oGVPlayableParams.setResolverType("vod_common");
    }

    public static final void addOgvPlayerParams(@NotNull BasePegasusPlayerData basePegasusPlayerData, @NotNull OGVPlayableParams oGVPlayableParams) {
        oGVPlayableParams.setInline(true);
        oGVPlayableParams.setShowsDanmaku(!basePegasusPlayerData.getDisableDanmaku());
        oGVPlayableParams.setTitle(basePegasusPlayerData.getTitle());
        PlayerArgs playerArgs = basePegasusPlayerData.getPlayerArgs();
        if (playerArgs != null) {
            oGVPlayableParams.setAvid(playerArgs.aid);
            oGVPlayableParams.setCid(playerArgs.cid);
            Duration.Companion companion = Duration.Companion;
            oGVPlayableParams.m7594setTotalDurationLRDsOJo(DurationKt.toDuration(playerArgs.fakeDuration, DurationUnit.SECONDS));
            oGVPlayableParams.setSeasonId(playerArgs.pgcSeasonId);
            oGVPlayableParams.setEpId(playerArgs.epid);
            oGVPlayableParams.setSubType(playerArgs.subtype);
            if (playerArgs.isPreview == 1) {
                oGVPlayableParams.markPreviewVideo();
            }
        }
        UpArgsData upArgs = basePegasusPlayerData.getUpArgs();
        if (upArgs != null) {
            oGVPlayableParams.setMid(upArgs.getUpId());
            oGVPlayableParams.setUpperName(upArgs.getUpName());
            oGVPlayableParams.setUpperAvatar(upArgs.getUpFace());
        }
    }

    public static final void addUgcPlayerParams(@NotNull BasePegasusPlayerData basePegasusPlayerData, @NotNull InlineUgcPlayableParams inlineUgcPlayableParams) {
        inlineUgcPlayableParams.setShowDanmaku(!basePegasusPlayerData.getDisableDanmaku());
        inlineUgcPlayableParams.setTitle(basePegasusPlayerData.getTitle());
        inlineUgcPlayableParams.setCover(basePegasusPlayerData.getCover());
        PlayerArgs playerArgs = basePegasusPlayerData.getPlayerArgs();
        if (playerArgs != null) {
            inlineUgcPlayableParams.setAvid(playerArgs.aid);
            inlineUgcPlayableParams.setCid(playerArgs.cid);
            inlineUgcPlayableParams.setDuration(playerArgs.fakeDuration);
        }
        UpArgsData upArgs = basePegasusPlayerData.getUpArgs();
        if (upArgs != null) {
            inlineUgcPlayableParams.setMid(upArgs.getUpId());
            inlineUgcPlayableParams.setUpName(upArgs.getUpName());
            inlineUgcPlayableParams.setUpFace(upArgs.getUpFace());
            inlineUgcPlayableParams.setSelected(upArgs.getSelected());
        }
    }

    @NotNull
    public static final String getSpmid(@NotNull SpecialSpmidType specialSpmidType) {
        int i7 = a.f75550a[specialSpmidType.ordinal()];
        return i7 != 1 ? i7 != 2 ? SPMID_RECOMMEND : SPMID_NOTIFY_INLINE : SPMID_BANNER_INLINE;
    }

    public static /* synthetic */ String getSpmid$default(SpecialSpmidType specialSpmidType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            specialSpmidType = SpecialSpmidType.DEFAULT;
        }
        return getSpmid(specialSpmidType);
    }
}

package com.bilibili.music.podcast.player.resolve;

import android.content.Context;
import androidx.annotation.Keep;
import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.app.listener.v1.DashItem;
import com.bapis.bilibili.app.listener.v1.FormatDescription;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.PlayInfo;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bapis.bilibili.app.listener.v1.PlayURLReq;
import com.bapis.bilibili.app.listener.v1.PlayURLResp;
import com.bapis.bilibili.app.listener.v1.ResponseUrl;
import com.bapis.bilibili.app.playurl.v1.VolumeInfo;
import com.bilibili.lib.media.resolver.exception.ResolveException;
import com.bilibili.lib.media.resolver.exception.ResolveHttpException;
import com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException;
import com.bilibili.lib.media.resolver2.IMediaResolverV2;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.lib.media.resource.DashMediaIndex;
import com.bilibili.lib.media.resource.DashResource;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.Segment;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.playerbizcommon.utils.PlayUrlFlagsManager;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/resolve/MusicPodcastResolver.class */
@Keep
public final class MusicPodcastResolver implements IMediaResolverV2 {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String TAG = "MusicResolver";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/resolve/MusicPodcastResolver$ResolvePlayableException.class */
    public static final class ResolvePlayableException extends ResolveMediaSourceException {

        @Nullable
        private final String playableMessage;

        public ResolvePlayableException(@Nullable String str, @Nullable String str2, int i7) {
            super(str2, i7);
            this.playableMessage = str;
        }

        @Nullable
        public final String getPlayableMessage() {
            return this.playableMessage;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/resolve/MusicPodcastResolver$a.class */
    public static final class a {
        public static PlayIndex a(FormatDescription formatDescription) {
            PlayIndex playIndex = new PlayIndex();
            playIndex.mFrom = "podcast";
            playIndex.mQuality = formatDescription.getQuality();
            playIndex.mFormat = formatDescription.getFormat();
            String format = formatDescription.getFormat();
            int quality = formatDescription.getQuality();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            playIndex.mTypeTag = String.format("lua.%s.%s.%s", Arrays.copyOf(new Object[]{format, "bili2api", String.valueOf(quality)}, 3));
            playIndex.mDescription = formatDescription.getDescription();
            playIndex.mPithyDescription = formatDescription.getDisplayDesc();
            return playIndex;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException$ResolveInvalidCodeException */
        @NotNull
        public static MediaResource b(@Nullable PlayInfo playInfo, @NotNull MusicPodcastResolverParams musicPodcastResolverParams) throws ResolveMediaSourceException.ResolveInvalidCodeException {
            PlayIndex playIndexA;
            MediaResource mediaResource = new MediaResource();
            if (playInfo == null) {
                return mediaResource;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (playInfo.getInfoCase() == PlayInfo.InfoCase.PLAY_DASH) {
                List audioList = playInfo.getPlayDash().getAudioList();
                int size = audioList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    DashItem dashItem = (DashItem) audioList.get(i7);
                    DashMediaIndex dashMediaIndex = new DashMediaIndex();
                    dashMediaIndex.a = dashItem.getId();
                    dashMediaIndex.d = dashItem.getBackupUrlList();
                    dashMediaIndex.c = dashItem.getBaseUrl();
                    dashMediaIndex.e = dashItem.getBandwidth();
                    dashMediaIndex.f = dashItem.getCodecid();
                    dashMediaIndex.h = dashItem.getMd5();
                    dashMediaIndex.g = dashItem.getSize();
                    arrayList2.add(dashMediaIndex);
                }
                if (arrayList2.isEmpty()) {
                    throw new ResolveMediaSourceException.ResolveInvalidCodeException("MusicResolver:resolve fail, audio list is empty", -8);
                }
            }
            if (playInfo.hasVolume()) {
                VolumeInfo volume = playInfo.getVolume();
                com.bilibili.lib.media.resource.VolumeInfo volumeInfo = new com.bilibili.lib.media.resource.VolumeInfo();
                volumeInfo.a = volume.getMeasuredI();
                volumeInfo.b = volume.getMeasuredLra();
                volumeInfo.c = volume.getMeasuredTp();
                volumeInfo.d = volume.getMeasuredThreshold();
                volumeInfo.e = volume.getTargetOffset();
                volumeInfo.f = volume.getTargetI();
                volumeInfo.g = volume.getTargetTp();
                volumeInfo.h = volume.getMultiSceneArgsMap();
                mediaResource.setVolumeInfo(volumeInfo);
            }
            int i8 = 0;
            int i9 = 0;
            for (FormatDescription formatDescription : playInfo.getFormatsList()) {
                if (playInfo.getQn() == formatDescription.getQuality()) {
                    i9 = i8;
                }
                musicPodcastResolverParams.getClass();
                if (playInfo.getInfoCase() == PlayInfo.InfoCase.PLAY_URL && playInfo.hasPlayUrl() && playInfo.getPlayUrl().getDurlCount() > 0) {
                    PlayIndex playIndexA2 = a(formatDescription);
                    for (ResponseUrl responseUrl : playInfo.getPlayUrl().getDurlList()) {
                        Segment segment = new Segment();
                        segment.mOrder = responseUrl.getOrder();
                        segment.mDuration = responseUrl.getLength();
                        segment.mBytes = responseUrl.getSize();
                        segment.mUrl = responseUrl.getUrl();
                        if (segment.mBackupUrls == null) {
                            segment.mBackupUrls = new ArrayList();
                        }
                        segment.mBackupUrls.addAll(responseUrl.getBackupUrlList());
                        segment.mMd5 = responseUrl.getMd5();
                        playIndexA2.mSegmentList.add(segment);
                    }
                    ArrayList arrayList3 = playIndexA2.mSegmentList;
                    playIndexA = playIndexA2;
                    if (arrayList3 != null) {
                        playIndexA = playIndexA2;
                        if (arrayList3.size() == 1) {
                            playIndexA2.mNormalMrl = ((Segment) playIndexA2.mSegmentList.get(0)).mUrl;
                            playIndexA = playIndexA2;
                        }
                    }
                } else {
                    playIndexA = a(formatDescription);
                }
                mediaResource.mVodIndex.mVodList.add(playIndexA);
                i8++;
            }
            DashResource dashResource = new DashResource();
            if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                dashResource.b = arrayList2;
                dashResource.a = arrayList;
                mediaResource.setDashResource(dashResource);
            }
            mediaResource.setResolvedIndex(i9);
            return mediaResource;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveHttpException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.moss.api.MossException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.bilibili.music.podcast.player.resolve.MusicPodcastResolver$ResolvePlayableException] */
    private final MediaResource getPlayViewRpc(MusicPodcastResolverParams musicPodcastResolverParams) throws ResolveHttpException, ResolveMediaSourceException.ResolveInvalidCodeException, ResolveMediaSourceException, ResolveException {
        try {
            PlayURLResp playURLRespRequestPlayView = requestPlayView(musicPodcastResolverParams);
            if (playURLRespRequestPlayView == null) {
                return null;
            }
            int playable = playURLRespRequestPlayView.getPlayable();
            if (playable == 0) {
                PlayInfo playInfo = (PlayInfo) playURLRespRequestPlayView.getPlayerInfoMap().get(Long.valueOf(musicPodcastResolverParams.f66887d));
                Companion.getClass();
                return a.b(playInfo, musicPodcastResolverParams);
            }
            throw new ResolvePlayableException(playURLRespRequestPlayView.getMessage(), "MusicResolver:resolve fail,playViewReply playable is " + playable + " state", -8);
        } catch (Exception e7) {
            BLog.e(TAG, e7);
            throw new ResolveException(e7.getMessage());
        } catch (MossException e8) {
            BLog.e(TAG, e8);
            String message = e8.getMessage();
            String str = message;
            if (message == null) {
                str = "moss error";
            }
            throw new ResolveHttpException(str, 0, 2, (DefaultConstructorMarker) null);
        } catch (ResolvePlayableException e9) {
            BLog.e(TAG, e9);
            throw e9;
        }
    }

    private final PlayURLResp requestPlayView(MusicPodcastResolverParams musicPodcastResolverParams) throws MossException {
        return new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executePlayURL(PlayURLReq.newBuilder().setItem(PlayItem.newBuilder().setItemType(musicPodcastResolverParams.f66888e).setOid(musicPodcastResolverParams.f66886c).addSubId(musicPodcastResolverParams.f66887d).build()).setPlayerArgs((PlayerArgs) PlayerArgs.newBuilder().setQn(64L).setFnver(PlayUrlFlagsManager.getFnVer()).setFnval(PlayUrlFlagsManager.getFnVal()).setSoftFnval(PlayUrlFlagsManager.getSoftFnVal()).setForceHost(PlayerSettingHelper.getForceHost()).setVoiceBalance(IjkOptionsHelper.getVolumeBalance() ? 1L : 0L).build()).build());
    }

    @NotNull
    public String getResolveType() {
        return "podcast";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException$ResolveInvalidCodeException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [com.bilibili.music.podcast.player.resolve.MusicPodcastResolver$ResolvePlayableException] */
    @Nullable
    public MediaResource resolveMediaResource(@NotNull Context context, @NotNull IResolveParams iResolveParams) throws ResolveHttpException, ResolveMediaSourceException.ResolveInvalidCodeException, ResolveException {
        MusicPodcastResolverParams musicPodcastResolverParams = iResolveParams instanceof MusicPodcastResolverParams ? (MusicPodcastResolverParams) iResolveParams : null;
        if (musicPodcastResolverParams != null) {
            return getPlayViewRpc(musicPodcastResolverParams);
        }
        throw new ResolveMediaSourceException.ResolveInvalidCodeException("MusicResolver:convert resourceParams to MusicResolverParams failed", -11);
    }
}

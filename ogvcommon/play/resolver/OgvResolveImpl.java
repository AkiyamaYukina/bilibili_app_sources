package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.p;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import com.bapis.bilibili.pgc.gateway.player.v2.DashItem;
import com.bapis.bilibili.pgc.gateway.player.v2.DashVideo;
import com.bapis.bilibili.pgc.gateway.player.v2.DolbyItem;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayAbilityConf;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayExtInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewBusinessInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply;
import com.bapis.bilibili.pgc.gateway.player.v2.ResponseUrl;
import com.bapis.bilibili.pgc.gateway.player.v2.SegmentVideo;
import com.bapis.bilibili.pgc.gateway.player.v2.Stream;
import com.bapis.bilibili.pgc.gateway.player.v2.StreamInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.VideoInfo;
import com.bilibili.lib.media.resource.AudioEnhancementResource;
import com.bilibili.lib.media.resource.DashMediaIndex;
import com.bilibili.lib.media.resource.DashResource;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayConfig;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.Segment;
import com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils;
import com.bilibili.ogvcommon.play.resolver.ViewInfoExtraVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.IjkCodecHelper;
import u1.C8707a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvResolveImpl.class */
@StabilityInferred(parameters = 1)
public final class OgvResolveImpl {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvResolveImpl$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f73218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f73219b;

        static {
            int[] iArr = new int[Stream.ContentCase.values().length];
            try {
                iArr[Stream.ContentCase.SEGMENT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Stream.ContentCase.DASH_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f73218a = iArr;
            int[] iArr2 = new int[DolbyItem.Type.values().length];
            try {
                iArr2[DolbyItem.Type.ATMOS.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[DolbyItem.Type.COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            f73219b = iArr2;
        }
    }

    public static DashMediaIndex a(DashItem dashItem) {
        DashMediaIndex dashMediaIndex = new DashMediaIndex();
        dashMediaIndex.a = dashItem.getId();
        dashMediaIndex.d = dashItem.getBackupUrlList();
        dashMediaIndex.c = dashItem.getBaseUrl();
        dashMediaIndex.e = dashItem.getBandwidth();
        dashMediaIndex.f = dashItem.getCodecid();
        dashMediaIndex.h = dashItem.getMd5();
        dashMediaIndex.g = dashItem.getSize();
        return dashMediaIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.bilibili.lib.media.resource.PlayConfig$PlayMenuConfig] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v23, types: [com.bilibili.lib.media.resource.PlayConfig$PlayMenuConfig] */
    /* JADX WARN: Type inference failed for: r24v27 */
    @NotNull
    public static MediaResource b(@NotNull PlayViewReply playViewReply) {
        Object next;
        Object next2;
        ?? playMenuConfig;
        MediaResource mediaResource;
        boolean noRexcode;
        boolean z6;
        PlayIndex.DrmType drmType;
        PlayIndex playIndex;
        MediaResource mediaResource2 = new MediaResource();
        ExtraInfo extraInfo = new ExtraInfo();
        ViewInfoExtraVo viewInfoExtraVoA = ViewInfoExtraVo.a.a(playViewReply.getViewInfo(), playViewReply.getBusiness());
        extraInfo.setAllowCloseSubtitle(playViewReply.getPlayExtConf().getAllowCloseSubtitle());
        c.f73258c.b(extraInfo, c.f73256a[1], viewInfoExtraVoA);
        List clipInfoList = playViewReply.getBusiness().getClipInfoList();
        ArrayList<ClipInfo> arrayList = new ArrayList();
        for (Object obj : clipInfoList) {
            ClipInfo clipInfo = (ClipInfo) obj;
            if (clipInfo.getStart() < clipInfo.getEnd()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ClipInfo clipInfo2 : arrayList) {
            long materialNo = clipInfo2.getMaterialNo();
            Duration.Companion companion = Duration.Companion;
            int start = clipInfo2.getStart();
            DurationUnit durationUnit = DurationUnit.SECONDS;
            arrayList2.add(new ViewInfoClipInfo(materialNo, DurationKt.toDuration(start, durationUnit), DurationKt.toDuration(clipInfo2.getEnd(), durationUnit), clipInfo2.getClipType(), clipInfo2.getToastText()));
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ViewInfoClipInfo) next).f73231d == ClipType.CLIP_TYPE_OP) {
                break;
            }
        }
        ViewInfoClipInfo viewInfoClipInfo = (ViewInfoClipInfo) next;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((ViewInfoClipInfo) next2).f73231d == ClipType.CLIP_TYPE_ED) {
                break;
            }
        }
        ViewInfoClips viewInfoClips = new ViewInfoClips(viewInfoClipInfo, (ViewInfoClipInfo) next2);
        KProperty<?>[] kPropertyArr = c.f73256a;
        c.f73257b.b(extraInfo, kPropertyArr[0], viewInfoClips);
        PlayExtInfo playExtInfo = playViewReply.getPlayExtInfo();
        c.f73259d.b(extraInfo, kPropertyArr[2], playExtInfo.hasPlayDubbingInfo() ? playExtInfo.getPlayDubbingInfo() : null);
        mediaResource2.setExtraInfo(extraInfo);
        PlayConfig playConfig = new PlayConfig();
        PlayAbilityConf playConf = playViewReply.getPlayConf();
        playConfig.a = new PlayConfig.PlayMenuConfig(!playConf.getBackgroundPlayDisable(), PlayConfig.PlayConfigType.BACKGROUNDPLAY);
        playConfig.b = new PlayConfig.PlayMenuConfig(!playConf.getFlipDisable(), PlayConfig.PlayConfigType.FLIPCONF);
        if (playViewReply.hasPlayExtConf() && playViewReply.getPlayExtConf().hasCastTips()) {
            boolean castDisable = playConf.getCastDisable();
            boolean castDisable2 = playConf.getCastDisable();
            PlayConfig.PlayMenuConfig.ExtraContent extraContent = new PlayConfig.PlayMenuConfig.ExtraContent(playViewReply.getPlayExtConf().getCastTips().getMessage(), playViewReply.getPlayExtConf().getCastTips().getCode());
            PlayConfig.PlayConfigType playConfigType = PlayConfig.PlayConfigType.CASTCONF;
            ?? obj2 = new Object();
            ((PlayConfig.PlayMenuConfig) obj2).e = PlayConfig.UnsupportedState.NONE;
            ((PlayConfig.PlayMenuConfig) obj2).f = new ArrayList();
            ((PlayConfig.PlayMenuConfig) obj2).a = !castDisable;
            ((PlayConfig.PlayMenuConfig) obj2).b = !castDisable2;
            ((PlayConfig.PlayMenuConfig) obj2).c = extraContent;
            ((PlayConfig.PlayMenuConfig) obj2).d = playConfigType;
            playMenuConfig = obj2;
        } else {
            playMenuConfig = new PlayConfig.PlayMenuConfig(!playConf.getCastDisable(), PlayConfig.PlayConfigType.CASTCONF);
        }
        playConfig.c = playMenuConfig;
        playConfig.d = new PlayConfig.PlayMenuConfig(!playConf.getFeedbackDisable(), PlayConfig.PlayConfigType.FEEDBACK);
        playConfig.e = new PlayConfig.PlayMenuConfig(!playConf.getSubtitleDisable(), PlayConfig.PlayConfigType.SUBTITLE);
        playConfig.f = new PlayConfig.PlayMenuConfig(!playConf.getPlaybackRateDisable(), PlayConfig.PlayConfigType.PLAYBACKRATE);
        playConfig.g = new PlayConfig.PlayMenuConfig(!playConf.getTimeUpDisable(), PlayConfig.PlayConfigType.TIMEUP);
        playConfig.h = new PlayConfig.PlayMenuConfig(!playConf.getPlaybackModeDisable(), PlayConfig.PlayConfigType.PLAYBACKMODE);
        playConfig.i = new PlayConfig.PlayMenuConfig(!playConf.getScaleModeDisable(), PlayConfig.PlayConfigType.SCALEMODE);
        playConfig.j = new PlayConfig.PlayMenuConfig(!playConf.getLikeDisable(), PlayConfig.PlayConfigType.LIKE);
        playConfig.k = new PlayConfig.PlayMenuConfig(!playConf.getDislikeDisable(), PlayConfig.PlayConfigType.DISLIKE);
        playConfig.l = new PlayConfig.PlayMenuConfig(!playConf.getCoinDisable(), PlayConfig.PlayConfigType.COIN);
        playConfig.m = new PlayConfig.PlayMenuConfig(!playConf.getElecDisable(), PlayConfig.PlayConfigType.CHARGE);
        playConfig.n = new PlayConfig.PlayMenuConfig(!playConf.getShareDisable(), PlayConfig.PlayConfigType.SHARE);
        playConfig.o = new PlayConfig.PlayMenuConfig(!playConf.getScreenShotDisable(), PlayConfig.PlayConfigType.SNAPSHOT);
        playConfig.q = new PlayConfig.PlayMenuConfig(!playConf.getLockScreenDisable(), PlayConfig.PlayConfigType.LOCKSCREEN);
        playConfig.r = new PlayConfig.PlayMenuConfig(!playConf.getRecommendDisable(), PlayConfig.PlayConfigType.RECOMMEND);
        playConfig.s = new PlayConfig.PlayMenuConfig(!playConf.getPlaybackSpeedDisable(), PlayConfig.PlayConfigType.PLAYBACKSPEED);
        playConfig.t = new PlayConfig.PlayMenuConfig(!playConf.getDefinitionDisable(), PlayConfig.PlayConfigType.QUALITY);
        playConfig.u = new PlayConfig.PlayMenuConfig(!playConf.getSelectionsDisable(), PlayConfig.PlayConfigType.PAGES);
        playConfig.v = new PlayConfig.PlayMenuConfig(!playConf.getNextDisable(), PlayConfig.PlayConfigType.NEXT);
        playConfig.w = new PlayConfig.PlayMenuConfig(!playConf.getEditDmDisable(), PlayConfig.PlayConfigType.DANMAKU);
        playConfig.x = playViewReply.getBusiness().getDrmTechTypeValue() > 0 ? new PlayConfig.PlayMenuConfig(false, PlayConfig.PlayConfigType.MINIPLAYER) : new PlayConfig.PlayMenuConfig(true, PlayConfig.PlayConfigType.MINIPLAYER);
        playConfig.z = new PlayConfig.PlayMenuConfig(!playConf.getInnerDmDisable(), PlayConfig.PlayConfigType.INNERDANMAKUSETTINGSWITCH);
        playConfig.D = new PlayConfig.PlayMenuConfig(!playConf.getDolbyDisable(), PlayConfig.PlayConfigType.DOLBY);
        playConfig.B = new PlayConfig.PlayMenuConfig(!playConf.getFreyaEnterDisable(), PlayConfig.PlayConfigType.TOGETHERWATCHENTER);
        playConfig.C = new PlayConfig.PlayMenuConfig(!playConf.getFreyaFullDisable(), PlayConfig.PlayConfigType.TOGETHERWATCHFULLENTER);
        playConfig.F = new PlayConfig.PlayMenuConfig(!playConf.getSkipOpedSwitchDisable(), PlayConfig.PlayConfigType.SKIP_HEAD_TAIL);
        playConfig.G = new PlayConfig.PlayMenuConfig(!playConf.getColorOptimizeDisable(), PlayConfig.PlayConfigType.COLORFILTER);
        playConfig.p = new PlayConfig.PlayMenuConfig(!playConf.getRecordScreenDisable(), PlayConfig.PlayConfigType.SCREENRECORD);
        playConfig.H = new PlayConfig.PlayMenuConfig(!playConf.getDubbingDisable(), PlayConfig.PlayConfigType.DUBBING);
        mediaResource2.setPlayConfig(playConfig);
        if (playViewReply.hasVideoInfo()) {
            VideoInfo videoInfo = playViewReply.getVideoInfo();
            List streamListList = videoInfo.getStreamListList();
            DashResource dashResource = new DashResource();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = streamListList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    noRexcode = false;
                    z6 = false;
                    break;
                }
                Stream stream = (Stream) it3.next();
                StreamInfo streamInfo = stream.getStreamInfo();
                if (stream.getStreamInfo().getQuality() == 126 && Hj0.a.a("ogv.enable_dolby_vision_frame_check", true)) {
                    Double doubleOrNull = StringsKt.toDoubleOrNull(stream.getDashVideo().getFrameRate());
                    if (doubleOrNull != null) {
                        double dDoubleValue = doubleOrNull.doubleValue();
                        int width = stream.getDashVideo().getWidth() != 0 ? stream.getDashVideo().getWidth() : 3840;
                        int height = stream.getDashVideo().getHeight() != 0 ? stream.getDashVideo().getHeight() : 2160;
                        double supportFrameRateForSize = IjkCodecHelper.getSupportFrameRateForSize(BiliPushAVCodecUtils.HEVC_MIME, width, height);
                        if (dDoubleValue > supportFrameRateForSize) {
                            StringBuilder sbB = p.b(dDoubleValue, "Donot support ", " FPS dolbyVision! Max FPS:");
                            sbB.append(supportFrameRateForSize);
                            sbB.append(", width: ");
                            sbB.append(width);
                            com.bilibili.bangumi.logic.page.detail.service.e.a("[ogv-common-OgvResolveImpl-checkStreamSupport] ", C8707a.a(height, ", height: ", sbB), "OgvResolveImpl-checkStreamSupport", (Throwable) null);
                        }
                    } else {
                        continue;
                    }
                }
                if (stream.getContentCase() == Stream.ContentCase.DASH_VIDEO && videoInfo.getQuality() == streamInfo.getQuality()) {
                    noRexcode = stream.getDashVideo().getNoRexcode();
                    z6 = (stream.getStreamInfo() == null || (stream.getStreamInfo().getAttribute() & 3) == 0) ? false : true;
                }
            }
            PlayViewBusinessInfo business = playViewReply.getBusiness();
            if (business.getDrmTechTypeValue() > 0) {
                int drmTechTypeValue = business.getDrmTechTypeValue();
                drmType = drmTechTypeValue != 1 ? drmTechTypeValue != 2 ? PlayIndex.DrmType.No : PlayIndex.DrmType.WideVine : PlayIndex.DrmType.FairPlay;
            } else {
                drmType = PlayIndex.DrmType.No;
            }
            boolean isDrm = playViewReply.getBusiness().getIsDrm();
            List list = streamListList;
            mediaResource = mediaResource2;
            ArrayList arrayList4 = mediaResource.mVodIndex.mVodList;
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Stream stream2 = (Stream) it4.next();
                StreamInfo streamInfo2 = stream2.getStreamInfo();
                Stream.ContentCase contentCase = stream2.getContentCase();
                int i7 = contentCase != null ? a.f73218a[contentCase.ordinal()] : -1;
                if (i7 == 1) {
                    SegmentVideo segmentVideo = stream2.getSegmentVideo();
                    playIndex = new PlayIndex();
                    for (ResponseUrl responseUrl : segmentVideo.getSegmentList()) {
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
                        playIndex.mSegmentList.add(segment);
                    }
                    ArrayList arrayList5 = playIndex.mSegmentList;
                    if (arrayList5 != null && arrayList5.size() == 1) {
                        playIndex.mNormalMrl = ((Segment) playIndex.mSegmentList.get(0)).mUrl;
                    }
                    playIndex.mFrom = "bangumi";
                    playIndex.mQuality = streamInfo2.getQuality();
                    playIndex.mFormat = streamInfo2.getFormat();
                    playIndex.mDescription = streamInfo2.getNewDescription();
                    playIndex.mPithyDescription = streamInfo2.getDisplayDesc();
                    playIndex.mSuperscript = streamInfo2.getSuperscript();
                    playIndex.mNeedVip = streamInfo2.getNeedVip();
                    playIndex.mNeedLogin = streamInfo2.getNeedLogin();
                    playIndex.mIntact = streamInfo2.getIntact();
                    playIndex.mTypeTag = Aj0.a.f317a.getString(2131836491, new Object[]{playIndex.mFormat, "bb2api", String.valueOf(playIndex.mQuality)});
                    playIndex.qualityInvalid = isDrm && !streamInfo2.getSupportDrm();
                    playIndex.mDrmType = drmType;
                } else if (i7 != 2) {
                    playIndex = new PlayIndex();
                    playIndex.mFrom = "bangumi";
                    playIndex.mQuality = streamInfo2.getQuality();
                    playIndex.mFormat = streamInfo2.getFormat();
                    playIndex.mDescription = streamInfo2.getNewDescription();
                    playIndex.mPithyDescription = streamInfo2.getDisplayDesc();
                    playIndex.mSuperscript = streamInfo2.getSuperscript();
                    playIndex.mNeedVip = streamInfo2.getNeedVip();
                    playIndex.mNeedLogin = streamInfo2.getNeedLogin();
                    playIndex.mIntact = streamInfo2.getIntact();
                    playIndex.qualityInvalid = isDrm && !streamInfo2.getSupportDrm();
                    playIndex.mTypeTag = Aj0.a.f317a.getString(2131836491, new Object[]{playIndex.mFormat, "bb2api", String.valueOf(playIndex.mQuality)});
                    playIndex.mDrmType = drmType;
                } else {
                    playIndex = new PlayIndex();
                    playIndex.mFrom = "bangumi";
                    playIndex.mQuality = streamInfo2.getQuality();
                    playIndex.mFormat = streamInfo2.getFormat();
                    playIndex.mDescription = streamInfo2.getNewDescription();
                    playIndex.mPithyDescription = streamInfo2.getDisplayDesc();
                    playIndex.mSuperscript = streamInfo2.getSuperscript();
                    playIndex.mNeedVip = streamInfo2.getNeedVip();
                    playIndex.mNeedLogin = streamInfo2.getNeedLogin();
                    playIndex.mIntact = streamInfo2.getIntact();
                    playIndex.mTypeTag = Aj0.a.f317a.getString(2131836491, new Object[]{playIndex.mFormat, "bb2api", String.valueOf(playIndex.mQuality)});
                    playIndex.qualityInvalid = isDrm && !streamInfo2.getSupportDrm();
                    playIndex.mDrmType = drmType;
                    DashVideo dashVideo = stream2.getDashVideo();
                    boolean z7 = (stream2.getStreamInfo().getAttribute() & 3) != 0;
                    if (noRexcode == dashVideo.getNoRexcode() && z6 == z7) {
                        int quality = stream2.getStreamInfo().getQuality();
                        DashMediaIndex dashMediaIndex = new DashMediaIndex();
                        dashMediaIndex.a = quality;
                        dashMediaIndex.d = dashVideo.getBackupUrlList();
                        dashMediaIndex.c = dashVideo.getBaseUrl();
                        dashMediaIndex.e = dashVideo.getBandwidth();
                        dashMediaIndex.f = dashVideo.getCodecid();
                        dashMediaIndex.h = dashVideo.getMd5();
                        dashMediaIndex.g = dashVideo.getSize();
                        dashMediaIndex.o(dashVideo.getNoRexcode());
                        dashMediaIndex.n = drmType;
                        arrayList3.add(dashMediaIndex);
                    }
                }
                arrayList4.add(playIndex);
            }
            List dashAudioList = videoInfo.getDashAudioList();
            DolbyItem dolby = videoInfo.getDolby();
            ArrayList arrayList6 = new ArrayList();
            Iterator it5 = dashAudioList.iterator();
            while (it5.hasNext()) {
                arrayList6.add(a((DashItem) it5.next()));
            }
            if (dolby != null) {
                AudioEnhancementResource audioEnhancementResource = new AudioEnhancementResource();
                DolbyItem.Type type = dolby.getType();
                int i8 = type == null ? -1 : a.f73219b[type.ordinal()];
                if (i8 == 1) {
                    audioEnhancementResource.a = 2;
                } else if (i8 != 2) {
                    audioEnhancementResource.a = -1;
                } else {
                    audioEnhancementResource.a = 1;
                }
                audioEnhancementResource.b = new ArrayList();
                List audioList = dolby.getAudioList();
                List list2 = audioEnhancementResource.b;
                Iterator it6 = audioList.iterator();
                while (it6.hasNext()) {
                    list2.add(a((DashItem) it6.next()));
                }
                arrayList6.addAll(audioEnhancementResource.b);
                mediaResource.dolbyResource = audioEnhancementResource;
            }
            if (!arrayList6.isEmpty() || !arrayList3.isEmpty()) {
                if (drmType != PlayIndex.DrmType.No && !arrayList6.isEmpty()) {
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        ((DashMediaIndex) it7.next()).n = drmType;
                    }
                }
                dashResource.b = CollectionsKt.toMutableList(arrayList6);
                dashResource.a = arrayList3;
                mediaResource.setDashResource(dashResource);
            }
            Iterator it8 = mediaResource.mVodIndex.mVodList.iterator();
            int i9 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i9 = -1;
                    break;
                }
                if (videoInfo.getQuality() == ((PlayIndex) it8.next()).mQuality) {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                i9 = 0;
            }
            mediaResource.setResolvedIndex(i9);
            mediaResource.setTimelength(playViewReply.getBusiness().getEpWholeDuration());
            mediaResource.setMFormat(videoInfo.getFormat());
            mediaResource.setMVideoCodeId(videoInfo.getVideoCodecid());
        } else {
            BLog.w("ogv_resolver_impl", "response lack video info");
            mediaResource = mediaResource2;
        }
        return mediaResource;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException$ResolveInvalidCodeException */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.lib.media.resource.MediaResource c(tv.danmaku.video.resolver.OGVResolverParams r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.play.resolver.OgvResolveImpl.c(tv.danmaku.video.resolver.OGVResolverParams):com.bilibili.lib.media.resource.MediaResource");
    }

    public static final List<DashMediaIndex> d(List<DashMediaIndex> list, List<DashMediaIndex> list2) {
        List<DashMediaIndex> list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            return null;
        }
        List<DashMediaIndex> list4 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((DashMediaIndex) it.next()).a));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!arrayList.contains(Integer.valueOf(((DashMediaIndex) obj).a))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}

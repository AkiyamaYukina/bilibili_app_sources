package com.bilibili.studio.editor.timeline;

import L50.a;
import P50.n;
import P50.q;
import P50.s;
import R50.A;
import R50.B;
import R50.r;
import R50.u;
import R50.v;
import R50.x;
import R50.y;
import X1.C3081k;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import c6.P;
import c6.Q;
import cC0.C5226a;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuTypeItem;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.material.e;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxSticker;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorTimelineVideoFx;
import com.bilibili.studio.editor.repository.entity.BiliEditorMusicRhythmEntity;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.kaleidoscope.sdk.AudioTrack;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilter;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterClip;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectClip;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.FileInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.ms.picture.PictureRatioInfo;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.nvsstreaming.AudioClipInfo;
import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;
import com.bilibili.studio.videoeditor.nvsstreaming.EditProxyUtils;
import com.bilibili.studio.videoeditor.p;
import com.bilibili.studio.videoeditor.util.V;
import eA0.InterfaceC6919b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/UpperTimeline.class */
@Keep
public final class UpperTimeline implements InterfaceC6919b {

    @NotNull
    public static final a Companion = new Object();
    public static final int INVALID_TIME = -1;

    @NotNull
    public static final String IS_NORMALIZED_COORD = "Is Normalized Coord";

    @NotNull
    public static final String KEY_BACKGROUND_BLUR_RADIUS = "Background Blur Radius";

    @NotNull
    public static final String KEY_BACKGROUND_MODE = "Background Mode";

    @NotNull
    public static final String KEY_BCLIP_ID = "bclip_id";

    @NotNull
    public static final String KEY_FEATHER_WIDTH = "Feather Width";

    @NotNull
    public static final String KEY_INVERSE_REGION = "Inverse Region";

    @NotNull
    public static final String KEY_KEEP_RGB = "Keep RGB";

    @NotNull
    public static final String KEY_REGION_INFO = "Region Info";
    public static final long MIN_CLIP_DURATION = 100000;

    @NotNull
    public static final String MS_MASK_GENERATOR = "Mask Generator";

    @NotNull
    public static final String MS_OPACITY = "Opacity";

    @NotNull
    public static final String MS_ROTATION = "Rotation";

    @NotNull
    public static final String MS_SCALE_X = "Scale X";

    @NotNull
    public static final String MS_SCALE_Y = "Scale Y";

    @NotNull
    public static final String MS_TRANSFORM_2D = "Transform 2D";

    @NotNull
    public static final String MS_TRANS_X = "Trans X";

    @NotNull
    public static final String MS_TRANS_Y = "Trans Y";

    @NotNull
    public static final String TAG = "UpperTimeline";
    public static final float VALUE_BACKGROUND_BLUR_RADIUS_MAX = 64.0f;
    public static final float VALUE_BACKGROUND_BLUR_RADIUS_MIN = 0.0f;

    @NotNull
    public static final String VALUE_BLUR_BACKGROUND_MODE = "Blur";

    @NotNull
    public static final String VALUE_COLOR_BACKGROUND_MODE = "Color Solid";

    @NotNull
    public static final String VIDEO_CLIP_ATTACHMENT_KEY_CLIP = "attachment_key_clip";

    @JvmField
    @Nullable
    public BiliEditorMusicRhythmEntity mBiliEditorMusicRhythmEntity;

    @JvmField
    @Nullable
    public EditNvsTimelineInfoBase mEditTimelineInfoBase;

    @JvmField
    @Nullable
    public Size mOriginSize;

    @JvmField
    @Nullable
    public PictureRatioInfo mPictureRatioInfo;

    @JvmField
    @Nullable
    public List<? extends SelectVideo> mSelectVideoList;

    @JvmField
    @Nullable
    public List<? extends FileInfo> mVideoList;

    @Nullable
    private n timeline;

    @NotNull
    private final String classTag = TAG;

    @NotNull
    private List<UC0.k> mEditVideoTrackList = new ArrayList();

    @NotNull
    private List<UC0.a> mEditAudioTrackList = new ArrayList();

    @NotNull
    private List<UC0.c> mEditCaptionTrackList = new ArrayList();

    @NotNull
    private List<UC0.d> mCompoundCaptionTracks = new ArrayList();

    @NotNull
    private List<UC0.g> mEditStickerTrackList = new ArrayList();

    @NotNull
    private List<UC0.j> mTimelineVideoFxTracks = new ArrayList();

    @JvmField
    public int mTimeLineFillMode = 26770;

    @JvmField
    @NotNull
    public EditorExtraData editorExtraData = new EditorExtraData();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/UpperTimeline$a.class */
    public static final class a {
    }

    public UpperTimeline(@Nullable n nVar) {
        this.timeline = nVar;
    }

    public static /* synthetic */ boolean appendCaption$default(UpperTimeline upperTimeline, List list, EditVideoInfo editVideoInfo, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            editVideoInfo = null;
        }
        return upperTimeline.appendCaption(list, editVideoInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildNativeAudio$lambda$0(UC0.a aVar) {
        return Intrinsics.areEqual(aVar.f24631a, "audio_track_type_native_user") || Intrinsics.areEqual(aVar.f24631a, "audio_track_type_native_other");
    }

    private final boolean buildRecord(EditVideoInfo editVideoInfo) {
        P50.d dVarQ;
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack == null) {
            return false;
        }
        for (RecordInfo recordInfo : p.d(editVideoInfo.getRecordInfoList(), userVideoTrack.getBClipList())) {
            UC0.a aVarAppendAudioTrack = appendAudioTrack("audio_track_type_record");
            if (aVarAppendAudioTrack != null && (dVarQ = aVarAppendAudioTrack.q()) != null) {
                com.bilibili.studio.videoeditor.extension.h.c(dVarQ, "record_info", recordInfo);
            }
            if (aVarAppendAudioTrack != null) {
                aVarAppendAudioTrack.f(recordInfo);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean buildTts$default(UpperTimeline upperTimeline, List list, List list2, List list3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            list3 = null;
        }
        return upperTimeline.buildTts(list, list2, list3);
    }

    private final UC0.a createBiliEditorAudioTrack(String str) {
        P50.d dVarFindAudioTrackByType = findAudioTrackByType(str);
        if (dVarFindAudioTrackByType != null) {
            return new UC0.a(dVarFindAudioTrackByType, str);
        }
        eA0.c.a(this, "audio track is null !!, type = " + str);
        return null;
    }

    private final P50.d findAudioTrackByType(String str) {
        v vVar;
        R50.f fVarE;
        v vVar2 = this.timeline;
        if (vVar2 == null) {
            return null;
        }
        int iAudioTrackCount = vVar2.a.audioTrackCount();
        for (int i7 = 0; i7 < iAudioTrackCount && (vVar = this.timeline) != null && (fVarE = vVar.e(i7)) != null; i7++) {
            if (Intrinsics.areEqual(com.bilibili.studio.videoeditor.extension.h.a(fVarE, "key_audio_track_type"), str)) {
                return fVarE;
            }
        }
        return null;
    }

    private final P50.c getRecordTrackClipAtPoint(long j7) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        return aVar != null ? aVar.m(j7) : null;
    }

    private final UC0.k getUserVideoTrack() {
        if (this.mEditVideoTrackList.isEmpty()) {
            return null;
        }
        for (UC0.k kVar : this.mEditVideoTrackList) {
            if ("video_track_main".equals(kVar.f24631a)) {
                return kVar;
            }
        }
        return null;
    }

    private final int indexOfRecordTrackClip(long j7) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        return aVar != null ? aVar.v(j7) : -1;
    }

    private final boolean removeAudioTrackByIndex(int i7) {
        v vVar = this.timeline;
        boolean zRemoveAudioTrack = false;
        if (vVar != null) {
            int iAudioTrackCount = vVar.a.audioTrackCount();
            zRemoveAudioTrack = false;
            if (i7 >= 0) {
                zRemoveAudioTrack = false;
                if (i7 < iAudioTrackCount) {
                    v vVar2 = this.timeline;
                    zRemoveAudioTrack = false;
                    if (vVar2 != null) {
                        zRemoveAudioTrack = vVar2.a.removeAudioTrack(i7);
                    }
                }
            }
        }
        return zRemoveAudioTrack;
    }

    private final void setAudioClipVolume(EditVideoClip editVideoClip, UC0.a aVar) {
        List<BClip> bClipList;
        List<BClip> bClipList2 = editVideoClip.getBClipList();
        if (bClipList2 == null || bClipList2.isEmpty()) {
            float videoTrackVolume = editVideoClip.getVideoTrackVolume();
            aVar.B(videoTrackVolume, videoTrackVolume);
            return;
        }
        float videoTrackVolume2 = editVideoClip.getVideoTrackVolume();
        aVar.B(videoTrackVolume2, videoTrackVolume2);
        List<BClip> bClipList3 = editVideoClip.getBClipList();
        boolean z6 = true;
        boolean z7 = true;
        if (bClipList3 != null) {
            Iterator<T> it = bClipList3.iterator();
            while (true) {
                z6 = z7;
                if (!it.hasNext()) {
                    break;
                } else if (((BClip) it.next()).getClipVolume() != 0.0f) {
                    z7 = false;
                }
            }
        }
        int i7 = 0;
        for (Object obj : aVar.n()) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            P50.c cVar = (P50.c) obj;
            if (i7 < editVideoClip.getBClipList().size() && (bClipList = editVideoClip.getBClipList()) != null) {
                for (BClip bClip : bClipList) {
                    if (bClip.isVideo()) {
                        if (z6) {
                            bClip.setClipVolume(0.0f);
                        }
                        if (bClip.getInPoint() == cVar.getInPoint()) {
                            cVar.setVolumeGain(bClip.getClipVolume(), bClip.getClipVolume());
                        }
                    }
                }
            }
            i7++;
        }
    }

    public final boolean addEditTtsAudioTrack(@Nullable EditTtsInfo editTtsInfo) {
        long videoDuration = getVideoDuration();
        UC0.a aVarAppendAudioTrack = appendAudioTrack("audio_track_type_tts");
        if (aVarAppendAudioTrack == null) {
            return false;
        }
        boolean zK = aVarAppendAudioTrack.k(videoDuration, editTtsInfo);
        if (!zK) {
            this.mEditAudioTrackList.remove(aVarAppendAudioTrack);
        }
        return zK;
    }

    public final void addStatsExtraInfo(@NotNull Map<String, String> map) {
        v vVar = this.timeline;
        if (vVar != null) {
            vVar.a.addStatsExtraInfo(map);
        }
    }

    @Nullable
    public final UC0.a appendAudioTrack(@Nullable String str) {
        R50.f xVar;
        AudioTrack audioTrackAppendAudioTrack;
        v vVar = this.timeline;
        if (vVar == null || (audioTrackAppendAudioTrack = vVar.a.appendAudioTrack()) == null) {
            xVar = null;
        } else {
            xVar = new x(audioTrackAppendAudioTrack);
            xVar.b = audioTrackAppendAudioTrack;
        }
        if (xVar != null) {
            xVar.r();
        }
        v vVar2 = this.timeline;
        eA0.c.b(this, "appendAudioTrack=" + str + "timeline=" + (vVar2 != null ? vVar2.a : null) + " audioTrack=" + (xVar != null ? xVar.b : null));
        if (xVar == null) {
            return null;
        }
        UC0.a aVar = new UC0.a(xVar, str);
        this.mEditAudioTrackList.add(aVar);
        return aVar;
    }

    public final boolean appendCaption(@Nullable List<? extends CaptionInfo> list, @Nullable EditVideoInfo editVideoInfo) {
        boolean zEquals;
        if (this.timeline == null) {
            return false;
        }
        createCaptionTrack();
        UC0.c captionTrack = getCaptionTrack();
        if (captionTrack != null) {
            captionTrack.g();
        }
        if (V.e(list)) {
            eA0.c.a(this, "setCaption2TimeLine failed data null or empty");
            return false;
        }
        boolean z6 = (editVideoInfo != null ? editVideoInfo.getAiStyleId() : 0L) > 0;
        boolean appliedAiStoryData = editVideoInfo != null ? editVideoInfo.getAppliedAiStoryData() : false;
        boolean zIsFromDraft = editVideoInfo != null ? editVideoInfo.isFromDraft() : false;
        if (!DeviceDecision.INSTANCE.getBoolean("upper.caption_smart_video_anim_renderer_enable", true) || !z6 || appliedAiStoryData) {
            if (list == null) {
                return true;
            }
            for (CaptionInfo captionInfo : list) {
                UC0.c captionTrack2 = getCaptionTrack();
                captionInfo.timelineCaption = captionTrack2 != null ? captionTrack2.c(captionInfo, this.timeline, zIsFromDraft) : null;
            }
            return true;
        }
        editVideoInfo.setAppliedAiStoryData(true);
        if (list == null) {
            return true;
        }
        for (CaptionInfo captionInfo2 : list) {
            CaptionAssetBean captionAssetBean = captionInfo2.captionAssetBean;
            String str = OC0.h.f17810a;
            if (captionAssetBean == null) {
                zEquals = false;
            } else {
                List<String> list2 = com.bilibili.studio.editor.moudle.material.e.f107890d;
                zEquals = e.a.d().equals(captionAssetBean.captionContextPackagePath);
            }
            if (zEquals) {
                UC0.c captionTrack3 = getCaptionTrack();
                CaptionInfo captionInfoB = captionTrack3 != null ? captionTrack3.b(captionInfo2.text, captionInfo2.inPoint, captionInfo2.capTimeDuration, editVideoInfo.getUserTrackBClipList(), Long.valueOf(captionInfo2.id), zIsFromDraft) : null;
                UC0.c captionTrack4 = getCaptionTrack();
                if (captionTrack4 != null) {
                    P50.p pVar = captionInfoB != null ? captionInfoB.timelineCaption : null;
                    long j7 = captionInfo2.id;
                    boolean zIsFromDraft2 = editVideoInfo.isFromDraft();
                    if (pVar != null) {
                        List boundingRectangleVertices = pVar.getBoundingRectangleVertices();
                        captionInfo2.timelineCaption = pVar;
                        captionTrack4.h(captionInfo2, zIsFromDraft2);
                        System.currentTimeMillis();
                        captionInfo2.id = j7;
                        captionInfo2.materialId = "";
                        captionTrack4.a(captionInfo2);
                        if (!zIsFromDraft2) {
                            PointF pointFF = UC0.c.f(boundingRectangleVertices);
                            PointF pointFF2 = UC0.c.f(pVar.getBoundingRectangleVertices());
                            if (pointFF != null && pointFF2 != null && !Intrinsics.areEqual(pointFF, pointFF2)) {
                                pVar.translateCaption(new PointF(pointFF.x - pointFF2.x, pointFF.y - pointFF2.y));
                            }
                            if (pVar.getCaptionTranslation() != null) {
                                captionInfo2.pos = new BPointF(pVar.getCaptionTranslation().x, pVar.getCaptionTranslation().y);
                            }
                        }
                        com.bilibili.studio.videoeditor.extension.h.c(pVar, "caption_info", captionInfo2.mo9886clone());
                    }
                }
                captionInfo2.timelineCaption = captionInfoB != null ? captionInfoB.timelineCaption : null;
            } else {
                UC0.c captionTrack5 = getCaptionTrack();
                captionInfo2.timelineCaption = captionTrack5 != null ? captionTrack5.c(captionInfo2, this.timeline, zIsFromDraft) : null;
            }
        }
        return true;
    }

    @Nullable
    public final EditorDanmakuInfo appendCompoundCaption(long j7, long j8, @NotNull String str, @Nullable List<? extends BClip> list) {
        u iVar;
        UC0.d compoundCaption = getCompoundCaption();
        UC0.i iVar2 = compoundCaption;
        if (compoundCaption == null) {
            iVar2 = new UC0.i(this.timeline, "compound_caption_track");
            this.mCompoundCaptionTracks.add((UC0.d) iVar2);
        }
        v vVar = iVar2.f24623b;
        EditorDanmakuInfo editorDanmakuInfo = null;
        if (vVar != null) {
            TimelineCompoundCaption timelineCompoundCaptionAddCompoundCaption = vVar.a.addCompoundCaption(j7, j8, str);
            if (timelineCompoundCaptionAddCompoundCaption != null) {
                iVar = new R50.i(timelineCompoundCaptionAddCompoundCaption);
                iVar.c = timelineCompoundCaptionAddCompoundCaption;
            } else {
                iVar = null;
            }
            if (iVar == null) {
                editorDanmakuInfo = null;
            } else {
                EditorDanmakuInfo editorDanmakuInfoB = UC0.d.b(list, iVar);
                editorDanmakuInfo = null;
                if (editorDanmakuInfoB != null) {
                    iVar2.a(editorDanmakuInfoB);
                    editorDanmakuInfo = editorDanmakuInfoB;
                }
            }
        }
        return editorDanmakuInfo;
    }

    public final boolean appendRecord(@Nullable List<? extends RecordInfo> list) {
        boolean z6;
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        if (aVar != null) {
            aVar.g(list);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6;
    }

    public final boolean appendRecordAudioFx(long j7, @Nullable String str) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        return aVar != null ? aVar.e(j7, str) : false;
    }

    public final boolean appendRecordClip(@Nullable RecordInfo recordInfo, @Nullable RecordInfo recordInfo2) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        return aVar != null ? aVar.d(recordInfo, recordInfo2) : false;
    }

    public final boolean appendRecordTrack(@Nullable RecordInfo recordInfo, @Nullable RecordInfo recordInfo2) {
        P50.d dVarQ;
        UC0.a aVarAppendAudioTrack = appendAudioTrack("audio_track_type_record");
        if (aVarAppendAudioTrack != null && (dVarQ = aVarAppendAudioTrack.q()) != null) {
            com.bilibili.studio.videoeditor.extension.h.c(dVarQ, "record_info", recordInfo);
        }
        return aVarAppendAudioTrack != null ? aVarAppendAudioTrack.d(recordInfo, recordInfo2) : false;
    }

    @Nullable
    public final UC0.k appendVideoTrack(@NotNull String str) {
        P50.u uVarAppendVideoTrack = EditProxyUtils.appendVideoTrack(this.timeline);
        boolean z6 = false;
        boolean z7 = uVarAppendVideoTrack == null;
        if (this.timeline == null) {
            z6 = true;
        }
        StringBuilder sbB = C3081k.b("appendVideoTrack trackType=", str, " iVideoTrack isNull=", " timeline isNull=", z7);
        sbB.append(z6);
        eA0.c.b(this, sbB.toString());
        if (uVarAppendVideoTrack == null) {
            return null;
        }
        UC0.k kVar = new UC0.k(uVarAppendVideoTrack, str);
        this.mEditVideoTrackList.add(kVar);
        return kVar;
    }

    public final void appendVideoTrack(long j7, @NotNull List<? extends EditVideoClip> list) {
        for (EditVideoClip editVideoClip : list) {
            UC0.k kVarAppendVideoTrack = appendVideoTrack(editVideoClip.isUserRoleTrack() ? "video_track_main" : "video_track_other");
            if (kVarAppendVideoTrack == null) {
                return;
            }
            List<BClip> bClipListExcludeRoleTheme = editVideoClip.getBClipListExcludeRoleTheme();
            if (!V.e(bClipListExcludeRoleTheme)) {
                eA0.c.b(this, "buildTimelineNew appendBClip=" + kVarAppendVideoTrack.y("video_track_main".equals(kVarAppendVideoTrack.f24631a), bClipListExcludeRoleTheme, j7, true) + ",trackRole=" + editVideoClip.getTrackRole());
            }
        }
    }

    public final boolean buildAudioTracks(@NotNull EditVideoInfo editVideoInfo) {
        eA0.c.b(this, "buildAudioTracks removeAllAudioTrack result=" + removeAllAudioTracks());
        boolean zBuildBGMNew = buildBGMNew(editVideoInfo, "UpperTimeLine.buildAudioTracks");
        boolean zBuildRecord = buildRecord(editVideoInfo);
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        boolean zBuildTts = buildTts(editVideoInfo.getTtsInfoList(), editVideoInfo.getCaptionInfoList(), userTrackBClipList);
        boolean zBuildNativeAudio = buildNativeAudio(editVideoInfo);
        UC0.k userVideoTrack = getUserVideoTrack();
        boolean zBuildStickerBgm = userVideoTrack != null ? buildStickerBgm(p.e(editVideoInfo.getBiliEditorStickerInfoList(), userTrackBClipList, userVideoTrack.m())) : false;
        StringBuilder sbA = Q.a("buildAudioTracks buildBGMResult=", ",buildRecordResult=", ",buildNativeAudioResult=", zBuildBGMNew, zBuildRecord);
        sbA.append(zBuildNativeAudio);
        eA0.c.a(this, sbA.toString());
        boolean z6 = false;
        if (zBuildBGMNew) {
            z6 = false;
            if (zBuildRecord) {
                z6 = false;
                if (zBuildNativeAudio) {
                    z6 = false;
                    if (zBuildTts) {
                        z6 = false;
                        if (zBuildStickerBgm) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        return z6;
    }

    public final boolean buildBGM(@NotNull EditVideoInfo editVideoInfo) {
        eA0.c.a(this, "buildBGM ");
        UC0.k userVideoTrack = getUserVideoTrack();
        boolean zJ = false;
        if (userVideoTrack == null || userVideoTrack.q() == null) {
            eA0.c.a(this, "buildBGM userVideoTrack=" + (userVideoTrack == null));
            return false;
        }
        EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
        UC0.a bgmAudioTrack = getBgmAudioTrack();
        if (bgmAudioTrack != null) {
            zJ = bgmAudioTrack.j(userVideoTrack.q(), editorMusicInfo);
        }
        return zJ;
    }

    public final boolean buildBGMNew(@NotNull EditVideoInfo editVideoInfo, @NotNull String str) {
        boolean zI;
        EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
        if (editorMusicInfo == null) {
            return false;
        }
        BMusic bMusic = editorMusicInfo.themeMusic;
        if (bMusic != null) {
            UC0.a newBgmAudioTrack = getNewBgmAudioTrack(bMusic);
            zI = false;
            if (newBgmAudioTrack != null) {
                zI = newBgmAudioTrack.i(editorMusicInfo.themeMusic, getVideoDuration(), G.p.a(str, "->buildBGMNew1"));
            }
        } else {
            zI = false;
            if (editorMusicInfo.bMusicList != null) {
                zI = false;
                if (!r0.isEmpty()) {
                    ArrayList<BMusic> arrayList = editorMusicInfo.bMusicList;
                    if (arrayList != null) {
                        for (BMusic bMusic2 : arrayList) {
                            UC0.a newBgmAudioTrack2 = getNewBgmAudioTrack(bMusic2);
                            if (newBgmAudioTrack2 != null) {
                                newBgmAudioTrack2.i(bMusic2, getVideoDuration(), G.p.a(str, "->buildBGMNew2"));
                            }
                        }
                    }
                    zI = true;
                }
            }
        }
        return zI;
    }

    public final void buildBgmAudio(@NotNull EditorMusicInfo editorMusicInfo) {
        String str;
        UC0.a aVar;
        UC0.a bgmAudioTrack = getBgmAudioTrack();
        if (bgmAudioTrack != null) {
            bgmAudioTrack.y();
            long videoDuration = getVideoDuration();
            String str2 = "EditAudioTrack";
            if (editorMusicInfo == null || V.e(editorMusicInfo.bMusicList)) {
                BLog.e("EditAudioTrack", "buildFxByMusicInfo editorMusicInfo = " + editorMusicInfo);
                return;
            }
            UC0.a aVar2 = bgmAudioTrack;
            for (BMusic bMusic : editorMusicInfo.bMusicList) {
                aVar2.a(bMusic);
                String str3 = bMusic.trackFlag;
                String str4 = bMusic.localPath;
                r rVarU = a.a.a.a != null ? r.u() : null;
                R50.a aVarS = rVarU != null ? rVarU.s(str4) : null;
                if (aVarS == null) {
                    return;
                }
                long audioStreamDuration = aVarS.a.getAudioStreamDuration(0);
                long j7 = bMusic.trimIn;
                long j8 = j7;
                if (j7 < 0) {
                    j8 = 0;
                }
                long j9 = audioStreamDuration - TransitionInfo.DEFAULT_DURATION;
                if (j8 > j9) {
                    j8 = j9;
                }
                long j10 = bMusic.trimOut;
                if (j10 <= audioStreamDuration) {
                    audioStreamDuration = j10;
                }
                long j11 = bMusic.inPoint;
                if (j11 < 0) {
                    j11 = 0;
                }
                long j12 = bMusic.outPoint;
                long j13 = j12;
                if (j12 > videoDuration) {
                    j13 = videoDuration;
                }
                if (j13 <= j11 || audioStreamDuration <= j8) {
                    StringBuilder sbA = z.a(j11, "buildFxByMusicInfo inPoint = ", ", trimIn = ");
                    sbA.append(j8);
                    J1.z.a(audioStreamDuration, ", trimOut = ", ", videoDuration = ", sbA);
                    Os.f.b(sbA, videoDuration, str2);
                    return;
                }
                long j14 = audioStreamDuration - j8;
                long j15 = j13 - j11;
                long j16 = j15;
                if (j14 < j15) {
                    long j17 = j8;
                    long j18 = audioStreamDuration;
                    while (true) {
                        if (j16 <= 0) {
                            UC0.a aVar3 = aVar2;
                            str = str2;
                            aVar = aVar3;
                            break;
                        }
                        if (j16 < j14) {
                            j18 = j17 + j16;
                        }
                        String str5 = bMusic.localPath;
                        UC0.a aVar4 = aVar2;
                        R50.d dVarC = aVar2.c(j11, j17, j18, str5);
                        if (dVarC == null) {
                            StringBuilder sbA2 = z.a(j11, "buildFxByMusicInfo cyclic addClip failed inPoint = ", ", trimIn = ");
                            sbA2.append(j17);
                            J1.z.a(j18, ", trimOut = ", ", videoDuration = ", sbA2);
                            str = str2;
                            Os.f.b(sbA2, videoDuration, str);
                            aVar = aVar4;
                            break;
                        }
                        com.bilibili.studio.videoeditor.extension.h.c(dVarC, "track_flag", str3);
                        j16 -= j14;
                        float f7 = bMusic.ratioMusic;
                        dVarC.setVolumeGain(f7, f7);
                        if (bMusic.fadeIn) {
                            dVarC.t(bMusic.fadeInValue);
                        }
                        if (bMusic.fadeOut) {
                            dVarC.u(bMusic.fadeOutValue);
                        }
                        j11 += j14;
                        aVar2 = aVar4;
                    }
                } else {
                    UC0.a aVar5 = aVar2;
                    String str6 = str2;
                    R50.d dVarC2 = aVar5.c(j11, j8, j8 + j16, bMusic.localPath);
                    if (dVarC2 == null) {
                        StringBuilder sbA3 = z.a(j11, "buildFxByMusicInfo single addClip failed inPoint = ", ", trimIn = ");
                        sbA3.append(j8);
                        J1.z.a(audioStreamDuration, ", trimOut = ", ", videoDuration = ", sbA3);
                        Os.f.b(sbA3, videoDuration, str6);
                        aVar = aVar5;
                        str = str6;
                    } else {
                        long j19 = videoDuration;
                        com.bilibili.studio.videoeditor.extension.h.c(dVarC2, "track_flag", str3);
                        float f8 = bMusic.ratioMusic;
                        dVarC2.setVolumeGain(f8, f8);
                        if (bMusic.fadeIn) {
                            dVarC2.t(bMusic.fadeInValue);
                        }
                        videoDuration = j19;
                        str = str6;
                        aVar = aVar5;
                        if (bMusic.fadeOut) {
                            dVarC2.u(bMusic.fadeOutValue);
                            videoDuration = j19;
                            str = str6;
                            aVar = aVar5;
                        }
                    }
                }
                String str7 = str;
                aVar2 = aVar;
                str2 = str7;
            }
        }
    }

    public final boolean buildBgmAudioV2(@NotNull BMusic bMusic, @Nullable UC0.a aVar, @NotNull String str) {
        if (aVar != null) {
            return aVar.i(bMusic, getVideoDuration(), G.p.a(str, "->buildBgmAudioV2"));
        }
        return false;
    }

    public final boolean buildCaptionNew(@NotNull EditVideoInfo editVideoInfo) {
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack == null) {
            return false;
        }
        return appendCaption(p.b(editVideoInfo.getCaptionInfoList(), userVideoTrack.getBClipList()), editVideoInfo);
    }

    public final boolean buildDanmaku(@NotNull EditVideoInfo editVideoInfo) {
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack == null) {
            return false;
        }
        List<EditorDanmakuInfo> listC = p.c(editVideoInfo.getDanmakuInfoList(), userVideoTrack.getBClipList());
        for (EditorDanmakuInfo editorDanmakuInfo : listC) {
            DanmakuTypeItem danmakuTypeItem = editorDanmakuInfo.typeItem;
            String str = null;
            String str2 = danmakuTypeItem != null ? danmakuTypeItem.assetPath : null;
            if (danmakuTypeItem != null) {
                str = danmakuTypeItem.assetLic;
            }
            editorDanmakuInfo.style = WC0.a.c(0L, str2, str, "");
        }
        editVideoInfo.setDanmakuInfoList(listC);
        return setCompoundCaption2TimeLine(listC);
    }

    public final boolean buildFilterNew(@NotNull UC0.k kVar, @NotNull EditVideoClip editVideoClip) {
        if (kVar.q() == null) {
            eA0.c.a(this, "buildFilterNew videoTrack is null");
            return false;
        }
        EditFxFilterInfo editFxFilterInfo = editVideoClip.getEditFxFilterInfo();
        if (editFxFilterInfo == null) {
            return true;
        }
        List<EditFxFilterClip> filterClips = editFxFilterInfo.getFilterClips();
        ArrayList<EditFxFilter> arrayList = new ArrayList();
        Iterator<T> it = filterClips.iterator();
        while (it.hasNext()) {
            EditFxFilter editFilter = ((EditFxFilterClip) it.next()).getEditFilter();
            if (editFilter != null) {
                arrayList.add(editFilter);
            }
        }
        for (EditFxFilter editFxFilter : arrayList) {
            int i7 = editFxFilter.type;
            if (i7 == 1) {
                editFxFilter.packageId = "Lut";
            } else if (i7 == 0) {
                editFxFilter.packageId = WC0.a.e(editFxFilter.path, editFxFilter.lic);
            }
        }
        boolean zF = kVar.f(editVideoClip, editFxFilterInfo);
        if (zF) {
            editFxFilterInfo.refresh(kVar.t());
        }
        return zF;
    }

    public final boolean buildMusicRhythmFx(@NotNull EditVideoInfo editVideoInfo) {
        if (this.mEditVideoTrackList.isEmpty()) {
            eA0.c.a(this, "buildMusicRhythmFx mEditVideoTrackList isNullOrEmpty");
            return false;
        }
        P50.u uVarQ = this.mEditVideoTrackList.get(0).q();
        if (uVarQ == null) {
            return false;
        }
        return UC0.k.z(editVideoInfo.getBiliEditorMusicRhythmEntity(), this.timeline, uVarQ);
    }

    public final boolean buildNativeAudio(@NotNull EditVideoInfo editVideoInfo) {
        if (this.mEditVideoTrackList.isEmpty()) {
            return false;
        }
        List<EditVideoClip> editVideoTracks = editVideoInfo.getEditVideoTracks();
        if (editVideoTracks == null || this.mEditVideoTrackList.size() != editVideoTracks.size()) {
            eA0.c.a(this, "buildNativeAudioNew editVideoTracks=" + (editVideoTracks == null));
            return false;
        }
        final int i7 = 1;
        CollectionsKt.removeAll(this.mEditAudioTrackList, new Function1(i7) { // from class: AV.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f269a;

            {
                this.f269a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f269a) {
                    case 0:
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        mutableBundleLike.put("bili_only", "0");
                        mutableBundleLike.put("jumpFrom", String.valueOf(1281));
                        return null;
                    default:
                        return Boolean.valueOf(UpperTimeline.buildNativeAudio$lambda$0((UC0.a) obj));
                }
            }
        });
        int size = this.mEditVideoTrackList.size();
        boolean z6 = true;
        for (int i8 = 0; i8 < size; i8++) {
            UC0.k kVar = this.mEditVideoTrackList.get(i8);
            EditVideoClip editVideoClip = editVideoTracks.get(i8);
            UC0.a aVarAppendAudioTrack = appendAudioTrack("video_track_main".equals(kVar.f24631a) ? "audio_track_type_native_user" : "audio_track_type_native_other");
            if (aVarAppendAudioTrack != null) {
                aVarAppendAudioTrack.f24617d = "video_track_main".equals(kVar.f24631a);
                z6 = z6 && aVarAppendAudioTrack.w(editVideoClip.getBClipList());
                kVar.G();
                if ("video_track_main".equals(kVar.f24631a)) {
                    setAudioClipVolume(editVideoClip, aVarAppendAudioTrack);
                } else {
                    float videoTrackVolume = editVideoClip.getVideoTrackVolume();
                    aVarAppendAudioTrack.B(videoTrackVolume, videoTrackVolume);
                }
            }
        }
        return z6;
    }

    public final boolean buildSceneFxInfoNew(@NotNull UC0.k kVar, @NotNull EditVideoClip editVideoClip) {
        if (kVar.q() == null) {
            return false;
        }
        List<BClip> bClipList = editVideoClip.getBClipList();
        if (!V.e(bClipList)) {
            List<SceneFxInfo> sceneFxInfoList = editVideoClip.getSceneFxInfoList();
            long duration = 0;
            for (int i7 = 0; i7 < bClipList.size(); i7++) {
                BClip bClip = bClipList.get(i7);
                if (bClip.clipMediaType == 0 && V.d(sceneFxInfoList)) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= sceneFxInfoList.size()) {
                            break;
                        }
                        if (bClip.id.equals(sceneFxInfoList.get(i8).bClipId)) {
                            SceneFxInfo sceneFxInfo = sceneFxInfoList.get(i8);
                            sceneFxInfo.start = duration;
                            sceneFxInfo.duration = bClip.getDuration(true);
                            sceneFxInfoList.set(i8, sceneFxInfo);
                            break;
                        }
                        i8++;
                    }
                }
                duration += bClip.getDuration(true);
            }
            editVideoClip.setSceneFxInfoList(sceneFxInfoList);
        }
        List<SceneFxInfo> sceneFxInfoList2 = editVideoClip.getSceneFxInfoList();
        if (sceneFxInfoList2 != null) {
            return UC0.k.A(BiliContext.application(), kVar.q(), sceneFxInfoList2);
        }
        eA0.c.a(this, "buildSceneFxInfoNew failed no SceneFxInfo");
        return false;
    }

    public final boolean buildSticker(@NotNull EditVideoInfo editVideoInfo) {
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        boolean z6 = false;
        if (userVideoTrack == null) {
            return false;
        }
        List<BClip> bClipList = userVideoTrack.getBClipList();
        UC0.k userVideoTrack2 = getUserVideoTrack();
        if (userVideoTrack2 == null) {
            return false;
        }
        ArrayList<BiliEditorStickerInfo> arrayListE = p.e(editVideoInfo.getBiliEditorStickerInfoList(), bClipList, userVideoTrack2.m());
        UC0.g stickTrack = getStickTrack();
        if (stickTrack != null) {
            stickTrack.j();
        }
        createStickerTrack();
        ArrayList<EditFxSticker> arrayList = new ArrayList();
        Iterator<BiliEditorStickerInfo> it = arrayListE.iterator();
        while (it.hasNext()) {
            EditFxSticker editFxSticker = it.next().getEditFxSticker();
            if (editFxSticker != null) {
                arrayList.add(editFxSticker);
            }
        }
        for (EditFxSticker editFxSticker2 : arrayList) {
            editFxSticker2.setFxId(StringsKt.w(editFxSticker2.getFilePath(), ".videofx") ? WC0.a.e(editFxSticker2.getFilePath(), editFxSticker2.getLicenseFilePath()) : WC0.a.d(editFxSticker2.getFilePath(), editFxSticker2.getLicenseFilePath()));
        }
        UC0.g stickTrack2 = getStickTrack();
        if (stickTrack2 != null) {
            Iterator<BiliEditorStickerInfo> it2 = arrayListE.iterator();
            while (it2.hasNext()) {
                stickTrack2.l(it2.next());
            }
            z6 = true;
        }
        return z6;
    }

    public final boolean buildStickerBgm(@Nullable List<BiliEditorStickerInfo> list) {
        UC0.g stickTrack = getStickTrack();
        if (stickTrack == null) {
            return false;
        }
        if (!(stickTrack instanceof UC0.b)) {
            return true;
        }
        UC0.b bVar = (UC0.b) stickTrack;
        bVar.o();
        if (list == null) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bVar.m((BiliEditorStickerInfo) it.next());
        }
        return true;
    }

    public final boolean buildTimelineVideoFxNew(@NotNull EditVideoInfo editVideoInfo) {
        if (this.timeline == null) {
            return false;
        }
        if (editVideoInfo.getBiliEditorTimelineFxList() == null) {
            return true;
        }
        UC0.j jVar = (UC0.j) CollectionsKt.getOrNull(this.mTimelineVideoFxTracks, 0);
        if (jVar != null) {
            jVar.c();
        }
        createVideoFxTrack();
        for (BiliEditorTimelineVideoFx biliEditorTimelineVideoFx : editVideoInfo.getBiliEditorTimelineFxList()) {
            biliEditorTimelineVideoFx.packageId = WC0.a.e(biliEditorTimelineVideoFx.packagePath, biliEditorTimelineVideoFx.licPath);
        }
        UC0.j jVar2 = (UC0.j) CollectionsKt.getOrNull(this.mTimelineVideoFxTracks, 0);
        if (jVar2 == null) {
            return true;
        }
        jVar2.b(editVideoInfo.getBiliEditorTimelineFxList());
        return true;
    }

    public final boolean buildTransform2DFxInfoNew(@NotNull UC0.k kVar, @NotNull EditVideoClip editVideoClip) {
        if (kVar.q() == null) {
            return false;
        }
        List<Transform2DFxInfo> transform2DFxInfoList = editVideoClip.getTransform2DFxInfoList();
        if (transform2DFxInfoList == null) {
            eA0.c.a(this, "buildTransform2DFxInfoNew fail transform2DFxInfoList is null");
            return false;
        }
        kVar.B(transform2DFxInfoList);
        return true;
    }

    public final boolean buildTransitionNew(@NotNull UC0.k kVar, @NotNull EditVideoClip editVideoClip) {
        boolean zE;
        if (kVar.q() == null || editVideoClip.getBClipList() == null) {
            zE = false;
        } else {
            for (TransitionInfo transitionInfo : CollectionsKt.filterNotNull(editVideoClip.getTransitionInfoList())) {
                transitionInfo.transitionUUID = WC0.a.f(transitionInfo.transitionFile, transitionInfo.transitionFileLic);
            }
            zE = kVar.E(editVideoClip.getTransitionInfoList(), editVideoClip.getBClipList());
        }
        return zE;
    }

    public final boolean buildTts(@NotNull List<? extends EditTtsInfo> list, @NotNull List<? extends CaptionInfo> list2, @Nullable List<? extends BClip> list3) {
        UC0.k userVideoTrack = getUserVideoTrack();
        if ((userVideoTrack != null ? userVideoTrack.q() : null) == null) {
            eA0.c.b(this, "buildTtsTracks fail editVideoTrack == null");
            return false;
        }
        if (list3 != null) {
            list2 = p.b(list2, list3);
        }
        long duration = userVideoTrack.q().a.getDuration();
        List listF = p.f(duration, list, list2);
        removeAllTtsAudioTrack();
        boolean zK = true;
        if (listF != null) {
            ArrayList<EditTtsInfo> arrayList = (ArrayList) listF;
            if (!arrayList.isEmpty()) {
                for (EditTtsInfo editTtsInfo : arrayList) {
                    UC0.a aVarAppendAudioTrack = appendAudioTrack("audio_track_type_tts");
                    if (aVarAppendAudioTrack != null) {
                        zK &= aVarAppendAudioTrack.k(duration, editTtsInfo);
                    }
                }
                return zK;
            }
        }
        eA0.c.b(this, "buildTtsTracks fail ttsInfoList == null");
        return true;
    }

    public final boolean buildVideoTrack(@NotNull UC0.k kVar, @NotNull EditVideoClip editVideoClip) {
        if (kVar.q() == null) {
            eA0.c.a(this, "buildVideoTrack fail videoTrack is null");
            return false;
        }
        boolean zBuildTransform2DFxInfoNew = buildTransform2DFxInfoNew(kVar, editVideoClip);
        boolean zBuildTransitionNew = buildTransitionNew(kVar, editVideoClip);
        boolean zBuildSceneFxInfoNew = buildSceneFxInfoNew(kVar, editVideoClip);
        boolean zBuildFilterNew = buildFilterNew(kVar, editVideoClip);
        boolean zBuildVisualEffectsNew = buildVisualEffectsNew(kVar, editVideoClip);
        StringBuilder sbA = Q.a("buildVideoTrack result  transform=", ",transition=", ",scene=", zBuildTransform2DFxInfoNew, zBuildTransitionNew);
        P.a(",filter=", ",visualEffect=", sbA, zBuildSceneFxInfoNew, zBuildFilterNew);
        sbA.append(zBuildVisualEffectsNew);
        eA0.c.a(this, sbA.toString());
        boolean z6 = false;
        if (zBuildTransform2DFxInfoNew) {
            z6 = false;
            if (zBuildTransitionNew) {
                z6 = false;
                if (zBuildSceneFxInfoNew) {
                    z6 = false;
                    if (zBuildFilterNew) {
                        z6 = false;
                        if (zBuildVisualEffectsNew) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        return z6;
    }

    public final boolean buildVisualEffectsNew(@Nullable UC0.k kVar, @Nullable EditVideoClip editVideoClip) {
        boolean zA = false;
        boolean z6 = true;
        if (kVar == null || kVar.q() == null || editVideoClip == null) {
            boolean z7 = kVar == null;
            if (editVideoClip != null) {
                z6 = false;
            }
            eA0.c.a(this, "buildVisualEffectsNew editVideoTrack=" + z7 + " editVideoClip=" + z6);
            return false;
        }
        EditVisualEffectsInfo editVisualEffectsInfo = editVideoClip.getEditVisualEffectsInfo();
        if (editVisualEffectsInfo == null) {
            return true;
        }
        P50.u uVarQ = kVar.q();
        EditVisualEffectsInfo editVisualEffectsInfo2 = editVideoClip.getEditVisualEffectsInfo();
        if (editVisualEffectsInfo2 == null || uVarQ == null) {
            BLog.e("EditVisualEffectTrackDelegate", "buildVisualEffects failed check input params failed");
        } else {
            List listD = C5226a.d(uVarQ);
            Iterator it = ((ArrayList) listD).iterator();
            while (it.hasNext()) {
                ((EditVisualEffectClip) it.next()).reset();
            }
            C5226a.a(uVarQ, editVideoClip, listD);
            zA = C5226a.a(uVarQ, editVideoClip, editVisualEffectsInfo2.clips);
        }
        if (!zA) {
            return true;
        }
        editVisualEffectsInfo.clips = kVar.s();
        return true;
    }

    public final boolean changeVideoSize(int i7, int i8) {
        v vVar = this.timeline;
        return vVar != null ? vVar.a.changeVideoSize(i7, i8) : false;
    }

    public final void clearData() {
        for (UC0.k kVar : this.mEditVideoTrackList) {
            B bQ = kVar.q();
            if (bQ != null) {
                bQ.r();
            }
            kVar.u();
        }
        Iterator<T> it = this.mEditAudioTrackList.iterator();
        while (it.hasNext()) {
            ((UC0.a) it.next()).y();
        }
        Iterator<T> it2 = this.mCompoundCaptionTracks.iterator();
        while (it2.hasNext()) {
            ((UC0.d) it2.next()).c();
        }
        Iterator<T> it3 = this.mEditCaptionTrackList.iterator();
        while (it3.hasNext()) {
            ((UC0.c) it3.next()).g();
        }
        Iterator<T> it4 = this.mEditStickerTrackList.iterator();
        while (it4.hasNext()) {
            ((UC0.g) it4.next()).j();
        }
        Iterator<T> it5 = this.mTimelineVideoFxTracks.iterator();
        while (it5.hasNext()) {
            ((UC0.j) it5.next()).c();
        }
    }

    public final void createCaptionTrack() {
        this.mEditCaptionTrackList.clear();
        UC0.c cVar = new UC0.c(this.timeline);
        cVar.f24631a = "compound_caption_track";
        this.mEditCaptionTrackList.add(cVar);
    }

    public final void createCompoundCaptionTrack() {
        this.mCompoundCaptionTracks.clear();
        this.mCompoundCaptionTracks.add((UC0.d) new UC0.i(this.timeline, "compound_caption_track"));
    }

    public final void createStickerTrack() {
        this.mEditStickerTrackList.clear();
        this.mEditStickerTrackList.add((UC0.g) new UC0.i(this.timeline, "sticker_track"));
    }

    public final void createVideoFxTrack() {
        this.mTimelineVideoFxTracks.clear();
        this.mTimelineVideoFxTracks.add((UC0.j) new UC0.i(this.timeline, "timeline_video_fx_track_main"));
    }

    public final void destroy() {
        clearData();
    }

    public final void disableNativeTrackVolume() {
        Iterator<T> it = this.mEditAudioTrackList.iterator();
        while (it.hasNext()) {
            ((UC0.a) it.next()).l();
        }
    }

    public final void enableNativeTrackVolume() {
        for (UC0.a aVar : this.mEditAudioTrackList) {
            for (int i7 = 0; i7 < ((ArrayList) aVar.f24628b).size(); i7++) {
                AudioClipInfo audioClipInfo = (AudioClipInfo) ((ArrayList) aVar.f24628b).get(i7);
                aVar.D(audioClipInfo.getLeftVolume(), audioClipInfo.getRightVolume(), i7);
            }
        }
    }

    public final void enableRenderOrderByZValue(boolean z6) {
        v vVar = this.timeline;
        if (vVar != null) {
            vVar.a.enableRenderOrderByZValue(z6);
        }
    }

    @NotNull
    public final List<UC0.a> getAllAudioTrack() {
        Object objA;
        ArrayList arrayList = new ArrayList();
        for (UC0.a aVar : this.mEditAudioTrackList) {
            if (Intrinsics.areEqual(aVar.f24631a, "audio_track_type_bgm") && (objA = com.bilibili.studio.videoeditor.extension.h.a(aVar.q(), "music_info")) != null && (objA instanceof BMusic)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<P50.p> getAllCaption() {
        ArrayList arrayList = new ArrayList();
        v vVar = this.timeline;
        if (vVar != null) {
            P50.p pVarG = vVar.g();
            P50.p pVarI = pVarG;
            if (pVarG != null) {
                while (pVarI != null) {
                    arrayList.add(pVarI);
                    Object objA = com.bilibili.studio.videoeditor.extension.h.a(pVarI, "caption_info");
                    CaptionInfo captionInfo = objA instanceof CaptionInfo ? (CaptionInfo) objA : null;
                    if (captionInfo != null) {
                        captionInfo.timelineCaption = pVarI;
                    }
                    v vVar2 = this.timeline;
                    pVarI = vVar2 != null ? vVar2.i(pVarI) : null;
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<CaptionInfo> getAllCaptionList() {
        ArrayList<CaptionInfo> arrayList = new ArrayList<>();
        v vVar = this.timeline;
        if (vVar != null) {
            P50.p pVarG = vVar.g();
            P50.p pVarI = pVarG;
            if (pVarG != null) {
                while (pVarI != null) {
                    Object objA = com.bilibili.studio.videoeditor.extension.h.a(pVarI, "caption_info");
                    CaptionInfo captionInfo = objA instanceof CaptionInfo ? (CaptionInfo) objA : null;
                    if (captionInfo != null) {
                        arrayList.add(captionInfo);
                    }
                    if (captionInfo != null) {
                        captionInfo.timelineCaption = pVarI;
                    }
                    v vVar2 = this.timeline;
                    pVarI = vVar2 != null ? vVar2.i(pVarI) : null;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public final UC0.a getAudioTrackByMusic(@NotNull BMusic bMusic) {
        BMusic bMusic2;
        UC0.a aVar;
        Iterator<T> it = getAllAudioTrack().iterator();
        do {
            bMusic2 = null;
            if (!it.hasNext()) {
                return null;
            }
            aVar = (UC0.a) it.next();
            Object objA = com.bilibili.studio.videoeditor.extension.h.a(aVar.q(), "music_info");
            if (objA instanceof BMusic) {
                bMusic2 = (BMusic) objA;
            }
        } while (!bMusic.equalsIgnoreTime(bMusic2));
        return aVar;
    }

    @Nullable
    public final UC0.a getAudioTrackByRecord(@NotNull RecordInfo recordInfo) {
        RecordInfo recordInfo2;
        UC0.a aVar;
        Iterator<T> it = getRecordTrackList().iterator();
        do {
            recordInfo2 = null;
            if (!it.hasNext()) {
                return null;
            }
            aVar = (UC0.a) it.next();
            Object objA = com.bilibili.studio.videoeditor.extension.h.a(aVar.q(), "record_info");
            if (objA instanceof RecordInfo) {
                recordInfo2 = (RecordInfo) objA;
            }
        } while (!Intrinsics.areEqual(recordInfo2, recordInfo));
        return aVar;
    }

    @NotNull
    public final List<UC0.a> getAudioTrackList() {
        return this.mEditAudioTrackList;
    }

    @Nullable
    public final UC0.a getBgmAudioTrack() {
        for (UC0.a aVar : this.mEditAudioTrackList) {
            if (Intrinsics.areEqual(aVar.f24631a, "audio_track_type_bgm")) {
                return aVar;
            }
        }
        UC0.a aVarCreateBiliEditorAudioTrack = createBiliEditorAudioTrack("audio_track_type_bgm");
        if (aVarCreateBiliEditorAudioTrack == null) {
            return null;
        }
        this.mEditAudioTrackList.add(aVarCreateBiliEditorAudioTrack);
        return aVarCreateBiliEditorAudioTrack;
    }

    @Nullable
    public final UC0.c getCaptionTrack() {
        return (UC0.c) CollectionsKt.getOrNull(this.mEditCaptionTrackList, 0);
    }

    @Nullable
    public final List<P50.p> getCaptionsByTimelinePosition(long j7) {
        v vVar = this.timeline;
        List<P50.p> listF = vVar != null ? vVar.f(j7) : null;
        if (listF != null) {
            for (P50.p pVar : listF) {
                Object objA = com.bilibili.studio.videoeditor.extension.h.a(pVar, "caption_info");
                if (objA != null) {
                    ((CaptionInfo) objA).timelineCaption = pVar;
                }
            }
        }
        return listF;
    }

    @Override // eA0.InterfaceC6919b
    @NotNull
    public String getClassTag() {
        return this.classTag;
    }

    @Nullable
    public final UC0.d getCompoundCaption() {
        return (UC0.d) CollectionsKt.getOrNull(this.mCompoundCaptionTracks, 0);
    }

    @Nullable
    public final List<q> getCompoundCaptionsByTimelinePosition(long j7) {
        v vVar = this.timeline;
        ArrayList<q> arrayList = null;
        if (vVar != null) {
            List<TimelineCompoundCaption> compoundCaptionsByTimelinePosition = vVar.a.getCompoundCaptionsByTimelinePosition(j7);
            if (compoundCaptionsByTimelinePosition != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<TimelineCompoundCaption> it = compoundCaptionsByTimelinePosition.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    TimelineCompoundCaption next = it.next();
                    R50.i iVar = new R50.i(next);
                    ((u) iVar).c = next;
                    arrayList2.add(iVar);
                }
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (q qVar : arrayList) {
                Object objA = com.bilibili.studio.videoeditor.extension.h.a(qVar, "caption_info");
                if (objA != null) {
                    ((EditorDanmakuInfo) objA).timelineCompoundCaption = qVar;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public final P50.c getCurrentRecordTrackClip(long j7) {
        return getRecordTrackClipAtPoint(j7);
    }

    @Nullable
    public final s getCurrentVideoClip(long j7) {
        UC0.k userVideoTrack = getUserVideoTrack();
        if (userVideoTrack == null) {
            return null;
        }
        return userVideoTrack.o(j7);
    }

    @Nullable
    public final UC0.a getEditNativeAudioTrack() {
        if (this.mEditAudioTrackList.isEmpty()) {
            return null;
        }
        for (UC0.a aVar : this.mEditAudioTrackList) {
            if (aVar.f24617d) {
                return aVar;
            }
        }
        return null;
    }

    @Nullable
    public final UC0.k getEditVideoTrack() {
        return getUserVideoTrack();
    }

    @Nullable
    public final UC0.a getNewBgmAudioTrack(@NotNull BMusic bMusic) {
        UC0.a aVarAppendAudioTrack = appendAudioTrack("audio_track_type_bgm");
        if (aVarAppendAudioTrack == null) {
            return null;
        }
        com.bilibili.studio.videoeditor.extension.h.c(aVarAppendAudioTrack.q(), "music_info", bMusic);
        return aVarAppendAudioTrack;
    }

    @NotNull
    public final int[] getOriginImageWH() {
        v vVar = this.timeline;
        A aK = vVar != null ? vVar.k() : null;
        int iA = 0;
        int iB = aK != null ? aK.b() : 0;
        if (aK != null) {
            iA = aK.a();
        }
        return new int[]{iB, iA};
    }

    @Nullable
    public final P50.c getRecordTrackClipAtPath(@Nullable String str) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        return aVar != null ? aVar.r(str) : null;
    }

    @NotNull
    public final List<UC0.a> getRecordTrackList() {
        List<UC0.a> list = this.mEditAudioTrackList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((UC0.a) obj).f24631a, "audio_track_type_record")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final UC0.g getStickTrack() {
        return (UC0.g) CollectionsKt.getOrNull(this.mEditStickerTrackList, 0);
    }

    @Nullable
    public final n getTimeline() {
        return this.timeline;
    }

    public final long getTimelineDuration() {
        v vVar = this.timeline;
        return vVar != null ? vVar.a.getDuration() : 0L;
    }

    @Nullable
    public final UC0.j getTimelineVideoFxTrack() {
        return (UC0.j) CollectionsKt.getOrNull(this.mTimelineVideoFxTracks, 0);
    }

    public final long getVideoDuration() {
        UC0.k userVideoTrack = getUserVideoTrack();
        if (userVideoTrack == null) {
            return 0L;
        }
        return userVideoTrack.m();
    }

    @Nullable
    public final P50.u getVideoTrack() {
        UC0.k userVideoTrack = getUserVideoTrack();
        if (userVideoTrack == null) {
            return null;
        }
        return userVideoTrack.q();
    }

    @NotNull
    public final List<UC0.k> getVideoTrackList() {
        return this.mEditVideoTrackList;
    }

    public final int indexOfRecordTrackAtCurrentPoint(long j7) {
        return indexOfRecordTrackClip(j7);
    }

    public final boolean removeAllAudioTracks() {
        this.mEditAudioTrackList.clear();
        v vVar = this.timeline;
        if (vVar == null) {
            return false;
        }
        for (int iAudioTrackCount = vVar.a.audioTrackCount() - 1; -1 < iAudioTrackCount; iAudioTrackCount--) {
            v vVar2 = this.timeline;
            if (vVar2 != null) {
                vVar2.m(iAudioTrackCount);
            }
        }
        return true;
    }

    public final void removeAllTtsAudioTrack() {
        Iterator<UC0.a> it = this.mEditAudioTrackList.iterator();
        while (it.hasNext()) {
            UC0.a next = it.next();
            if (Intrinsics.areEqual(next.f24631a, "audio_track_type_tts")) {
                int index = next.q().b.getIndex();
                eA0.c.b(this, "移除指定的ttsTrack,index=" + index + ",result=" + removeAudioTrackByIndex(index));
                it.remove();
            }
        }
    }

    public final boolean removeAllVideoTracks() {
        B bL;
        v vVar = this.timeline;
        if (vVar == null) {
            return false;
        }
        for (int iVideoTrackCount = vVar.a.videoTrackCount() - 1; -1 < iVideoTrackCount; iVideoTrackCount--) {
            v vVar2 = this.timeline;
            if (vVar2 != null && (bL = vVar2.l(iVideoTrackCount)) != null) {
                int clipCount = bL.b.getClipCount();
                if (clipCount >= 0) {
                    int i7 = 0;
                    while (true) {
                        y yVarS = bL.s(i7);
                        if (yVarS != null) {
                            com.bilibili.studio.videoeditor.extension.h.b(yVarS);
                        }
                        if (i7 == clipCount) {
                            break;
                        }
                        i7++;
                    }
                }
                bL.r();
                com.bilibili.studio.videoeditor.extension.h.b(bL);
            }
            v vVar3 = this.timeline;
            if (vVar3 != null) {
                vVar3.a.removeVideoTrack(iVideoTrackCount);
            }
        }
        return true;
    }

    public final void removeAudioClip(@NotNull BMusic bMusic) {
        UC0.a bgmAudioTrack = getBgmAudioTrack();
        if (bgmAudioTrack == null) {
            return;
        }
        eA0.c.b(this, "removeAudioClip removeFlag=" + bMusic.trackFlag + ",trackCount=" + bgmAudioTrack.p());
        for (int iP = bgmAudioTrack.p() - 1; -1 < iP; iP--) {
            R50.d dVarO = bgmAudioTrack.o(iP);
            Object objA = dVarO != null ? com.bilibili.studio.videoeditor.extension.h.a(dVarO, "track_flag") : null;
            if (!TextUtils.isEmpty(bMusic.trackFlag) && bMusic.trackFlag.equals(objA)) {
                bgmAudioTrack.z(iP);
            }
        }
    }

    public final void removeAudioTrack(@Nullable UC0.a aVar) {
        if (aVar == null) {
            return;
        }
        this.mEditAudioTrackList.remove(aVar);
        removeAudioTrackByIndex(aVar.q().b.getIndex());
    }

    public final boolean removeEditTtsAudioTrackByIndex(int i7) {
        if (i7 < 0) {
            eA0.c.b(this, "removeEditTtsAudioTrackByIndex fail index=" + i7);
            return false;
        }
        List<UC0.a> list = this.mEditAudioTrackList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((UC0.a) obj).f24631a, "audio_track_type_tts")) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > i7) {
            UC0.a aVar = (UC0.a) arrayList.get(i7);
            this.mEditAudioTrackList.remove(aVar);
            removeAudioTrackByIndex(aVar.q().b.getIndex());
            return true;
        }
        eA0.c.b(this, "removeEditTtsAudioTrackByIndex fail index=" + i7 + ",listSize=" + arrayList.size());
        return false;
    }

    public final void removeMusicTrack(@NotNull BMusic bMusic) {
        int i7 = -1;
        int i8 = 0;
        for (Object obj : this.mEditAudioTrackList) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UC0.a aVar = (UC0.a) obj;
            int i9 = i7;
            if (Intrinsics.areEqual(aVar.f24631a, "audio_track_type_bgm")) {
                P50.d dVarQ = aVar.q();
                Object objA = dVarQ != null ? com.bilibili.studio.videoeditor.extension.h.a(dVarQ, "music_info") : null;
                BMusic bMusic2 = objA instanceof BMusic ? (BMusic) objA : null;
                if (bMusic.isLocalMusic && bMusic2 != null && bMusic2.isLocalMusic) {
                    i9 = i7;
                    if (Intrinsics.areEqual(bMusic.flag, bMusic2.flag)) {
                        aVar.y();
                        v vVar = this.timeline;
                        if (vVar != null) {
                            vVar.m(aVar.q().b.getIndex());
                        }
                        i9 = i8;
                    }
                } else {
                    i9 = i7;
                    if (bMusic2 != null) {
                        i9 = i7;
                        if (bMusic.bgmSid == bMusic2.bgmSid) {
                            i9 = i7;
                            if (bMusic.createTime == bMusic2.createTime) {
                                aVar.y();
                                v vVar2 = this.timeline;
                                if (vVar2 != null) {
                                    vVar2.m(aVar.q().b.getIndex());
                                }
                                i9 = i8;
                            }
                        }
                    }
                }
            }
            i8++;
            i7 = i9;
        }
        if (i7 >= 0) {
            this.mEditAudioTrackList.remove(i7);
        }
    }

    public final void removeRecordClipAtIndex(int i7) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        if (aVar != null) {
            aVar.z(i7);
        }
    }

    public final void removeRecordTrack(@Nullable RecordInfo recordInfo) {
        if (recordInfo == null) {
            return;
        }
        int i7 = -1;
        int i8 = 0;
        for (Object obj : this.mEditAudioTrackList) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UC0.a aVar = (UC0.a) obj;
            int i9 = i7;
            if (Intrinsics.areEqual(aVar.f24631a, "audio_track_type_record")) {
                P50.d dVarQ = aVar.q();
                Object objA = dVarQ != null ? com.bilibili.studio.videoeditor.extension.h.a(dVarQ, "record_info") : null;
                RecordInfo recordInfo2 = objA instanceof RecordInfo ? (RecordInfo) objA : null;
                i9 = i7;
                if (recordInfo2 != null) {
                    i9 = i7;
                    if (recordInfo2.getId() == recordInfo.getId()) {
                        v vVar = this.timeline;
                        if (vVar != null) {
                            vVar.m(aVar.q().b.getIndex());
                        }
                        i9 = i8;
                    }
                }
            }
            i8++;
            i7 = i9;
        }
        if (i7 >= 0) {
            this.mEditAudioTrackList.remove(i7);
        }
    }

    @Nullable
    public final List<RecordInfo> resolveRecordInfo() {
        List<RecordInfo> listA = null;
        if (this.timeline == null) {
            return null;
        }
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        if (aVar != null) {
            listA = aVar.A(this.timeline.a.getDuration());
        }
        return listA;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setCompoundCaption2TimeLine(@org.jetbrains.annotations.Nullable java.util.List<? extends com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo> r9) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.timeline.UpperTimeline.setCompoundCaption2TimeLine(java.util.List):boolean");
    }

    public final void setNativeVolume(float f7) {
        UC0.a editNativeAudioTrack = getEditNativeAudioTrack();
        if (editNativeAudioTrack != null) {
            editNativeAudioTrack.B(f7, f7);
        }
    }

    public final void setRecordVolume(long j7, float f7) {
        UC0.a aVar = (UC0.a) CollectionsKt.firstOrNull(getRecordTrackList());
        if (aVar != null) {
            aVar.C(f7, j7);
        }
    }

    public final void setTimeline(@Nullable n nVar) {
        this.timeline = nVar;
    }

    public final void updateData(@Nullable EditVideoInfo editVideoInfo) {
        this.mEditTimelineInfoBase = editVideoInfo != null ? editVideoInfo.getEditNvsTimelineInfoBase() : null;
        this.mPictureRatioInfo = editVideoInfo != null ? editVideoInfo.getPictureRatioInfo() : null;
        this.mTimeLineFillMode = editVideoInfo != null ? editVideoInfo.getTimeLineFillMode() : this.mTimeLineFillMode;
        this.mBiliEditorMusicRhythmEntity = editVideoInfo != null ? editVideoInfo.getBiliEditorMusicRhythmEntity() : null;
        this.mSelectVideoList = editVideoInfo != null ? editVideoInfo.getSelectVideoList() : null;
        this.mOriginSize = editVideoInfo != null ? editVideoInfo.getOriginSize() : null;
        List<FileInfo> videoList = null;
        if (editVideoInfo != null) {
            videoList = editVideoInfo.getVideoList();
        }
        this.mVideoList = videoList;
        EditorExtraData editorExtraData = new EditorExtraData();
        if (editVideoInfo != null) {
            editorExtraData.autoPlay = editVideoInfo.autoPlay;
            editorExtraData.mIntelligenceInfo = editVideoInfo.getIntelligenceInfo();
            editorExtraData.mIntelligenceState = editVideoInfo.getIntelligenceState();
            editorExtraData.mRecMusicSids = editVideoInfo.getRecMusicSids();
            editorExtraData.mImageLabels = editVideoInfo.getImageLabels();
            editorExtraData.mCaptionInfoListTemp = editVideoInfo.getCaptionInfoListTemp();
            editorExtraData.mLastCaptionInfoList = editVideoInfo.getLastCaptionInfoList();
            editorExtraData.mDerivedCaptionInfo = editVideoInfo.getDerivedCaptionInfo();
            editorExtraData.setMAsrDerivedCaptionInfo(editVideoInfo.getAsrDerivedCaptionInfo());
            editorExtraData.mDerivedDanmakuInfo = editVideoInfo.getDerivedDanmakuInfo();
            editorExtraData.mCaptureBMusic = editVideoInfo.getCaptureBMusic();
            editorExtraData.mMissionInfo = editVideoInfo.getMissionInfo();
            editorExtraData.mCaptureUsageInfo = editVideoInfo.getCaptureUsageInfo();
            editorExtraData.mSchemaInfo = editVideoInfo.getSchemaInfo();
            editorExtraData.mFrameZipInfoList = editVideoInfo.getFrameZipInfoList();
            editorExtraData.mPartitionPrediction = editVideoInfo.getPartitionPrediction();
            editorExtraData.mEditSmartTitle = editVideoInfo.getEditVideoSmartTitle();
            editorExtraData.mEditTemplateInfo = editVideoInfo.getEditTemplateInfo();
            editorExtraData.mMuxFilePath = editVideoInfo.getMuxFilePath();
            editorExtraData.mIsMultiP = editVideoInfo.getIsMultiP();
            editorExtraData.mIsEdited = editVideoInfo.getIsEdited();
            editorExtraData.mForbidEditReport = editVideoInfo.isForbidEditReport();
            editorExtraData.mJumpParam = editVideoInfo.getJumpParam();
            editorExtraData.mDraftCoverPath = editVideoInfo.getDraftCoverPath();
            editorExtraData.mContributeType = editVideoInfo.getContributeType();
            editorExtraData.mEditorMode = editVideoInfo.getEditorMode();
            editorExtraData.mMusicBeatGalleryBean = editVideoInfo.getMusicBeatGalleryBean();
            editorExtraData.mMeicamTemplateBean = editVideoInfo.getMeicamTemplateBean();
            editorExtraData.mImageTextTemplate = editVideoInfo.getImageTextTemplate();
            editorExtraData.mUseBmmSdkGray = editVideoInfo.getUseBmmSdkGray();
            editorExtraData.mBizFrom = editVideoInfo.getBizFrom();
            editorExtraData.mPublishData = editVideoInfo.getPublishData();
            editorExtraData.mReportData = editVideoInfo.getReportData();
            editorExtraData.mExtractedFrameCount = editVideoInfo.getExtractedFrameCount();
            editorExtraData.mUploadedFrameCount = editVideoInfo.getUploadedFrameCount();
            editorExtraData.mRecommendCount = editVideoInfo.getRecommendCount();
            editorExtraData.mEditorEnterInfo = editVideoInfo.getEditorEnterInfo();
            editorExtraData.mUsedFunction = editVideoInfo.getUsedFunction();
            editorExtraData.mOperationCover = editVideoInfo.getOperationCover();
            editorExtraData.mFromDraft = editVideoInfo.isFromDraft();
            editorExtraData.mAITool = editVideoInfo.getAITool();
            editorExtraData.mAiStyleId = editVideoInfo.getAiStyleId();
            editorExtraData.mAiStyleName = editVideoInfo.getAiStyleName();
            editorExtraData.mAiPrompt = editVideoInfo.getAiPrompt();
            editorExtraData.mAiKeyword = editVideoInfo.getAiKeyword();
            editorExtraData.mAiContent = editVideoInfo.getAiContent();
            editorExtraData.engineType = editVideoInfo.getEngineType();
            editorExtraData.mAiVideoOpening = editVideoInfo.getVideoOpening();
            editorExtraData.mAiVideoEnding = editVideoInfo.getVideoEnding();
        }
        this.editorExtraData = editorExtraData;
    }

    public final boolean updateEditTtsAudioTrack(int i7, @Nullable EditTtsInfo editTtsInfo) {
        List<UC0.a> list = this.mEditAudioTrackList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((UC0.a) obj).f24631a, "audio_track_type_tts")) {
                arrayList.add(obj);
            }
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            return ((UC0.a) arrayList.get(i7)).k(getVideoDuration(), editTtsInfo);
        }
        eA0.c.b(this, "updateEditTtsAudioTrack error index=" + i7 + ",size=" + arrayList.size());
        return false;
    }
}

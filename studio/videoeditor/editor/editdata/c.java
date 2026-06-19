package com.bilibili.studio.videoeditor.editor.editdata;

import AC0.i;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.H;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bean.EditUseInfo;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.capturev3.data.BGMInfo;
import com.bilibili.studio.videoeditor.capturev3.data.VideoClipRecordInfo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilter;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterClip;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.extension.f;
import com.bilibili.studio.videoeditor.help.mux.MuxInfo;
import com.bilibili.studio.videoeditor.help.mux.MuxVideoTrack;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.J;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptUpActivityV5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Pair;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/c.class */
public final class c {
    public static void a(ManuscriptUpActivityV5 manuscriptUpActivityV5, EditVideoInfo editVideoInfo, MuxInfo muxInfo, long j7, @Nullable String str) {
        boolean z6;
        boolean z7;
        boolean z8;
        Context applicationContext = manuscriptUpActivityV5.getApplicationContext();
        J j8 = new J();
        j8.d(applicationContext);
        if (muxInfo != null) {
            List<MuxVideoTrack> list = muxInfo.muxVideoTracks;
            z6 = false;
            if (!V.e(list)) {
                Iterator<MuxVideoTrack> it = list.iterator();
                loop0: while (true) {
                    while (true) {
                        boolean z9 = z8;
                        z6 = z9;
                        if (!it.hasNext()) {
                            break loop0;
                        } else {
                            z8 = z9 || d(j8, it.next().bClipList, j7, str);
                        }
                    }
                }
            }
        } else {
            z6 = false;
            if (editVideoInfo != null) {
                List<EditVideoClip> editVideoTracks = editVideoInfo.getEditVideoTracks();
                z6 = false;
                if (!V.e(editVideoTracks)) {
                    Iterator<EditVideoClip> it2 = editVideoTracks.iterator();
                    loop2: while (true) {
                        while (true) {
                            boolean z10 = z7;
                            z6 = z10;
                            if (!it2.hasNext()) {
                                break loop2;
                            } else {
                                z7 = z10 || d(j8, it2.next().getBClipList(), j7, str);
                            }
                        }
                    }
                }
            }
        }
        if (z6) {
            j8.f(applicationContext);
        }
    }

    public static EditorMusicInfo b(BMusic bMusic) {
        if (bMusic == null) {
            return null;
        }
        EditorMusicInfo editorMusicInfo = new EditorMusicInfo();
        ArrayList<BMusic> arrayList = new ArrayList<>();
        editorMusicInfo.bMusicList = arrayList;
        bMusic.inPoint = 0L;
        bMusic.outPoint = Long.MAX_VALUE;
        bMusic.trimIn = 0L;
        bMusic.trimOut = bMusic.totalTime;
        bMusic.fadeOut = true;
        bMusic.fadeOutValue = 4000000L;
        arrayList.add(bMusic);
        return editorMusicInfo;
    }

    public static EditUseInfo c(EditVideoInfo editVideoInfo) {
        if (editVideoInfo == null) {
            return null;
        }
        EditUseInfo editUseInfo = new EditUseInfo();
        List<EditVideoClip> editVideoTracks = editVideoInfo.getEditVideoTracks();
        if (editVideoTracks != null) {
            for (EditVideoClip editVideoClip : editVideoTracks) {
                List<BClip> bClipList = editVideoClip.getBClipList();
                if (!V.e(bClipList)) {
                    Iterator<BClip> it = bClipList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (it.next().playRate != 1.0f) {
                            editUseInfo.useSpeed = true;
                            break;
                        }
                    }
                }
                List<TransitionInfo> transitionInfoList = editVideoClip.getTransitionInfoList();
                if (!V.e(transitionInfoList)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<TransitionInfo> it2 = transitionInfoList.iterator();
                    while (it2.hasNext()) {
                        int i7 = it2.next().selectId;
                        if (i7 != -1) {
                            arrayList.add(Integer.valueOf(i7));
                        }
                    }
                    editUseInfo.transIds = arrayList;
                }
                EditFxFilterInfo editFxFilterInfo = editVideoClip.getEditFxFilterInfo();
                if (editFxFilterInfo != null) {
                    List<EditFxFilterClip> filterClips = editFxFilterInfo.getFilterClips();
                    if (!V.e(filterClips)) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<EditFxFilterClip> it3 = filterClips.iterator();
                        while (it3.hasNext()) {
                            EditFxFilter editFilter = it3.next().getEditFilter();
                            if (editFilter != null) {
                                arrayList2.add(Integer.valueOf(editFilter.id));
                            }
                        }
                        editUseInfo.filterIds = arrayList2;
                    }
                }
            }
        }
        if (editVideoInfo.getRecordInfoList() != null && editVideoInfo.getRecordInfoList().size() > 0) {
            editUseInfo.useRecord = true;
        }
        EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
        if (editorMusicInfo != null && V.d(editorMusicInfo.bMusicList)) {
            ArrayList arrayList3 = new ArrayList();
            for (BMusic bMusic : editorMusicInfo.bMusicList) {
                long j7 = bMusic.bgmSid;
                long j8 = j7;
                if (j7 == 0) {
                    Bgm bgm = bMusic.bgm;
                    j8 = j7;
                    if (bgm != null) {
                        j8 = bgm.sid;
                    }
                }
                arrayList3.add(Long.valueOf(j8));
            }
            editUseInfo.musicIds = arrayList3;
        }
        if (editVideoInfo.getCaptionInfoList().size() > 0) {
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (CaptionInfo captionInfo : editVideoInfo.getCaptionInfoList()) {
                arrayList4.add(Integer.valueOf(captionInfo.idTmp));
                arrayList5.add(Integer.valueOf(captionInfo.idFont));
            }
            editUseInfo.captionTempIds = arrayList4;
            editUseInfo.captionFontIds = arrayList5;
        }
        ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
        if (!V.e(biliEditorStickerInfoList)) {
            ArrayList arrayList6 = new ArrayList();
            for (BiliEditorStickerInfo biliEditorStickerInfo : biliEditorStickerInfoList) {
                int stickerType = biliEditorStickerInfo.getStickerType();
                if ((stickerType == 1 || stickerType == 5) && biliEditorStickerInfo.getEditFxSticker() != null) {
                    arrayList6.add(Integer.valueOf(biliEditorStickerInfo.getEditFxSticker().getId()));
                } else if (stickerType == 2 && biliEditorStickerInfo.getEditCustomizeSticker() != null) {
                    arrayList6.add(Integer.valueOf(CaptureSchema.OLD_INVALID_ID_STRING));
                }
            }
            editUseInfo.stickerIds = arrayList6;
        }
        if (H.a() != null) {
            if (2 == H.a().f108867b) {
                editUseInfo.fromCamera = true;
            } else if (5 == H.a().f108867b) {
                editUseInfo.fromAIStory = true;
            }
        }
        editUseInfo.picCount = 0;
        editUseInfo.videoCount = 0;
        EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
        if (userVideoTrack != null) {
            List<BClip> bClipList2 = userVideoTrack.getBClipList();
            if (!V.e(bClipList2)) {
                for (int i8 = 0; i8 < bClipList2.size(); i8++) {
                    BClip bClip = bClipList2.get(i8);
                    if (bClip != null && !bClip.isFakeClip()) {
                        int i9 = bClip.clipMediaType;
                        if (i9 == 1) {
                            editUseInfo.videoCount++;
                        } else if (i9 == 0) {
                            editUseInfo.picCount++;
                        }
                        if (bClip.playRate != 1.0f) {
                            editUseInfo.useSpeed = true;
                        }
                    }
                }
            }
        }
        Pair<Integer, Integer> pairJ = f.j(editVideoInfo);
        if (((Integer) pairJ.getFirst()).intValue() != 0) {
            editUseInfo.oneClickVideo = ((Integer) pairJ.getFirst()).intValue();
        }
        if (((Integer) pairJ.getSecond()).intValue() != 0) {
            editUseInfo.smartToVideo = ((Integer) pairJ.getSecond()).intValue();
        }
        return editUseInfo;
    }

    public static boolean d(J j7, List<BClip> list, long j8, @Nullable String str) {
        boolean z6 = false;
        boolean z7 = false;
        if (!V.e(list)) {
            Iterator<BClip> it = list.iterator();
            while (true) {
                z6 = z7;
                if (!it.hasNext()) {
                    break;
                }
                BClip next = it.next();
                if (str != null && str.equals(next.videoPath) && (next.getBizFrom() == 2 || next.getBizFrom() == 6)) {
                    j7.a(j8, str);
                    z7 = true;
                }
            }
        }
        return z6;
    }

    public static void e(EditVideoInfo editVideoInfo, EditUseInfo editUseInfo) {
        if (editVideoInfo != null) {
            EditVideoClip userVideoTrack = editVideoInfo.getUserVideoTrack();
            if (userVideoTrack == null) {
                EditVideoInfoUtils.throwDebugException("EditVideoHelperV3-measureMediaTypeCount userVideoTrack == null");
                return;
            }
            List<BClip> bClipList = userVideoTrack.getBClipList();
            editUseInfo.picCount = 0;
            editUseInfo.videoCount = 0;
            if (V.e(bClipList)) {
                return;
            }
            for (int i7 = 0; i7 < bClipList.size(); i7++) {
                BClip bClip = bClipList.get(i7);
                if (bClip != null && !bClip.isFakeClip()) {
                    int i8 = bClip.clipMediaType;
                    if (i8 == 1) {
                        editUseInfo.videoCount++;
                    } else if (i8 == 0) {
                        editUseInfo.picCount++;
                    }
                }
            }
        }
    }

    public static EditVideoInfo f(LB0.a aVar) {
        EditorMusicInfo editorMusicInfo;
        EditVideoInfo editVideoInfo = new EditVideoInfo();
        editVideoInfo.setUseBmmSdkGray(aVar.f14502l);
        editVideoInfo.setSchemaInfo(aVar.f14500j);
        editVideoInfo.setJumpParam(aVar.f14499i);
        editVideoInfo.setCaller(aVar.f116374b);
        editVideoInfo.setMissionInfo(aVar.f116376d);
        editVideoInfo.setCaptureUsageInfo(aVar.h);
        editVideoInfo.setEditorMode(aVar.f14501k);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z6 = false;
        for (VideoClipRecordInfo.VideoClip videoClip : aVar.f14497f.getVideoClips()) {
            SelectVideo selectVideo = new SelectVideo(videoClip.getPath());
            selectVideo.playRate = videoClip.getSpeed();
            selectVideo.bizFrom = videoClip.getVideoFrom();
            selectVideo.voiceFx = videoClip.getVoiceFx();
            selectVideo.duration = videoClip.getDuration();
            selectVideo.mimeType = "video";
            if (selectVideo.playRate != 1.0f || !TextUtils.isEmpty(selectVideo.voiceFx)) {
                z6 = true;
            }
            arrayList.add(selectVideo);
            arrayList2.add(new FileInfo(videoClip.getPath()));
        }
        editVideoInfo.setSelectVideoList(arrayList);
        editVideoInfo.setVideoList(arrayList2);
        BGMInfo bGMInfo = aVar.f116377e;
        if (bGMInfo != null) {
            z6 = true;
        }
        if (bGMInfo == null) {
            editorMusicInfo = null;
        } else {
            editorMusicInfo = new EditorMusicInfo();
            editorMusicInfo.bMusicList = new ArrayList<>();
            int i7 = bGMInfo.getFrom() == 0 ? 1 : 0;
            long jA = HC0.a.a(bGMInfo.getPath()) * 1000;
            boolean z7 = bGMInfo.getType() == 0;
            ArrayList<BMusic> arrayList3 = editorMusicInfo.bMusicList;
            BMusic bMusic = new BMusic();
            bMusic.bgmSid = bGMInfo.getBgmId();
            bMusic.localPath = bGMInfo.getPath();
            bMusic.musicName = bGMInfo.getName();
            bMusic.ratioMusic = 1.0f;
            bMusic.trimIn = bGMInfo.getStarTime() * 1000;
            bMusic.trimOut = jA;
            bMusic.totalTime = jA;
            bMusic.inPoint = 0L;
            bMusic.outPoint = Long.MAX_VALUE;
            bMusic.fadeOut = true;
            bMusic.sourceType = i7;
            bMusic.isLocalMusic = z7;
            bMusic.bgm = bGMInfo.getBgm();
            bMusic.isSelectedByUser = bGMInfo.isSelectedByUser();
            arrayList3.add(bMusic);
        }
        editVideoInfo.setEditorMusicInfo(editorMusicInfo);
        if (!V.e(aVar.f14497f.getVideoClips())) {
            editVideoInfo.setUserTrackNativeVolume(1.0f);
        }
        editVideoInfo.setIsEdited(z6);
        return editVideoInfo;
    }

    @Nullable
    public static MuxInfo g(Context context, EditVideoInfo editVideoInfo, boolean z6) {
        MuxInfo muxInfo = new MuxInfo();
        muxInfo.muxVideoTracks = new ArrayList();
        List<EditVideoClip> editVideoTracks = editVideoInfo.getEditVideoTracks();
        if (V.e(editVideoTracks)) {
            EditVideoInfoUtils.throwDebugException("EditVideoInfoHelpV3-toMuxInfoV2 editVideoTracks is empty");
            return null;
        }
        for (EditVideoClip editVideoClip : editVideoTracks) {
            MuxVideoTrack muxVideoTrack = new MuxVideoTrack();
            List<BClip> bClipListClone = editVideoClip.getBClipListClone();
            muxVideoTrack.bClipList = bClipListClone;
            if (V.e(bClipListClone)) {
                EditVideoInfoUtils.throwDebugException("EditVideoInfoHelpV3-toMuxInfo");
            }
            Iterator<BClip> it = muxVideoTrack.bClipList.iterator();
            while (it.hasNext()) {
                it.next().bVideo = null;
            }
            muxVideoTrack.transitionInfoList = editVideoClip.getTransitionInfoListClone();
            muxVideoTrack.videoTrackVolume = editVideoClip.getVideoTrackVolume();
            muxVideoTrack.transform2DFxInfoList = ((UpperFawkesDeviceDecision.ExportSpeedOptimizationConfig) UpperFawkesDeviceDecision.h.getValue()).getEnableRmTrans2D() ? editVideoClip.getValidTransform2DFxInfoListClone() : editVideoClip.getTransform2DFxInfoListClone();
            muxVideoTrack.sceneFxInfoList = editVideoClip.getSceneInfoListClone();
            muxVideoTrack.editFxFilterInfo = editVideoClip.getEditFxFilterInfoClone();
            muxVideoTrack.editVisualEffectsInfo = editVideoClip.getEditVisualEffectsInfoClone();
            muxVideoTrack.isUserTrack = editVideoClip.isUserRoleTrack();
            muxInfo.muxVideoTracks.add(muxVideoTrack);
        }
        muxInfo.editorMusicInfo = editVideoInfo.getEditorMusicInfoClone();
        muxInfo.captionInfoList = editVideoInfo.getCaptionInfoListClone();
        muxInfo.danmakuInfoList = editVideoInfo.getDanmakuInfoListClone();
        muxInfo.recordInfoList = editVideoInfo.getRecordInfoListClone();
        muxInfo.biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoListClone();
        muxInfo.ttsInfoList = editVideoInfo.getTtsInfoListClone();
        muxInfo.from = editVideoInfo.getCaller();
        muxInfo.allDuration = editVideoInfo.getVideoDuration();
        muxInfo.videoFps = editVideoInfo.getEditNvsTimelineInfoBase().getFps();
        muxInfo.videoBitrate = editVideoInfo.getEditNvsTimelineInfoBase().getVideoBitrate();
        muxInfo.videoWidth = editVideoInfo.getEditNvsTimelineInfoBase().getVideoSize().getWidth();
        muxInfo.videoHeight = editVideoInfo.getEditNvsTimelineInfoBase().getVideoSize().getHeight();
        muxInfo.resolutionType = editVideoInfo.getEditNvsTimelineInfoBase().getResolutionType();
        if (z6 || TextUtils.isEmpty(editVideoInfo.getMuxFilePath())) {
            String str = i.g(context.getApplicationContext()) + "/" + System.currentTimeMillis() + ".mp4";
            muxInfo.dstMediaPath = str;
            editVideoInfo.setMuxFilePath(str);
        } else {
            muxInfo.dstMediaPath = editVideoInfo.getMuxFilePath();
        }
        muxInfo.editUseInfo = c(editVideoInfo);
        muxInfo.captureUsageInfo = editVideoInfo.getCaptureUsageInfo();
        muxInfo.biliEditorMusicRhythmEntity = editVideoInfo.getBiliEditorMusicRhythmEntity();
        muxInfo.biliEditorTimelineFxList = editVideoInfo.getBiliEditorTimelineFxListClone();
        muxInfo.isFastVideo = editVideoInfo.getIntelligenceInfo() != null;
        muxInfo.isHdrExport = editVideoInfo.isExportHdr();
        muxInfo.eventExtraInfo = editVideoInfo.eventExtraInfo;
        muxInfo.publishNavId = editVideoInfo.getPublishNavId();
        muxInfo.skipVideoTranscode = editVideoInfo.expectSkipVideoTranscode();
        return muxInfo;
    }

    public static String h(String str) {
        String string;
        if (str != null) {
            try {
                if (str.length() == 0) {
                    string = str;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(str.getBytes("ISO-8859-1")));
                    byte[] bArr = new byte[256];
                    while (true) {
                        int i7 = gZIPInputStream.read(bArr);
                        if (i7 < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i7);
                    }
                    gZIPInputStream.close();
                    string = byteArrayOutputStream.toString();
                }
            } catch (IOException e7) {
                BLog.e("EditVideoInfoHelp", "uncompressEditInfoStr failed");
                string = "";
            }
        } else {
            string = str;
        }
        return !TextUtils.isEmpty(string) ? string : str;
    }
}

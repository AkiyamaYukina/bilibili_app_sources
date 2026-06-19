package com.bilibili.studio.videoeditor.editor.editdata;

import L50.a;
import R50.o;
import R50.r;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BVideo;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.util.ResolutionType;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoInfoUtils.class */
@Keep
public class EditVideoInfoUtils {
    private static final float ENCODE_HIGH_QUALITY_BITRATE = 6.5f;
    public static final String FAKE_FILE_NAME = "template/img_editor_clip_fake.png";
    private static final long MEASURE_IMAGE_VIDEO_BITRATE = 7864320;
    public static final String TAG = "EditVideoInfoUtils";
    public static final int VIDEO_4K = 4096;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long calAndUpdateProjectBitrate(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r4) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils.calAndUpdateProjectBitrate(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):long");
    }

    private static long calAndUpdateProjectBitrate2(EditVideoInfo editVideoInfo) {
        Size videoSize;
        if (editVideoInfo == null || editVideoInfo.getEditNvsTimelineInfoBase() == null || (videoSize = editVideoInfo.getEditNvsTimelineInfoBase().getVideoSize()) == null) {
            return 0L;
        }
        return videoSize.getWidth() >= ResolutionType.RES_2160.getSize() ? 45000000L : videoSize.getWidth() >= ResolutionType.RES_1080.getSize() ? 15000000L : (videoSize.getWidth() < ResolutionType.RES_720.getSize() && videoSize.getWidth() >= ResolutionType.RES_480.getSize()) ? 4000000L : 10000000L;
    }

    private static void clearRubbishForTransform2DFxInfo(EditVideoClip editVideoClip) {
        if (editVideoClip == null) {
            BLog.e(TAG, "clearRubbishForTransform2DFxInfo error editVideoClip == null");
            return;
        }
        List<Transform2DFxInfo> transform2DFxInfoList = editVideoClip.getTransform2DFxInfoList();
        if (transform2DFxInfoList == null || transform2DFxInfoList.isEmpty()) {
            BLog.e(TAG, "clearRubbishForTransform2DFxInfo end transformList == null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = "";
        for (Transform2DFxInfo transform2DFxInfo : transform2DFxInfoList) {
            if (str.equals(transform2DFxInfo.bClipId)) {
                BLog.e(TAG, "clearRubbishForTransform2DFxInfo rmList add " + transform2DFxInfo.bClipId);
                arrayList.add(transform2DFxInfo);
            } else {
                str = transform2DFxInfo.bClipId;
            }
        }
        BLog.e(TAG, "clearRubbishForTransform2DFxInfo end rmList.size=" + arrayList.size());
        transform2DFxInfoList.removeAll(arrayList);
    }

    public static List<BClip> convertBClipListCopy(List<SelectVideo> list, a aVar) {
        ArrayList<BVideo> arrayList = new ArrayList();
        List<String> list2 = aVar.f109464a;
        if (V.e(list)) {
            int size = list == null ? -1 : list.size();
            BLog.e(TAG, "convertBClipList selectVideoList is empty, selectVideoList=" + size);
            ((ArrayList) list2).add("convertBClipList:selectVideoList is empty, size=" + size);
            aVar.f109465b = EditConvertError.ERROR_LIST_EMPTY;
            return new ArrayList();
        }
        for (SelectVideo selectVideo : list) {
            String str = selectVideo.videoPath;
            r rVarU = a.a.a.a != null ? r.u() : null;
            R50.a aVarS = rVarU != null ? rVarU.s(str) : null;
            if (aVarS == null) {
                BLog.e(TAG, "convertBClipList nvsAVFileInfo is null, videoPath=" + str);
                ((ArrayList) list2).add("convertBClipList:getAVFileInfo is null, videoPath=" + str);
                aVar.f109465b = EditConvertError.ERROR_AV_FILE_NULL;
                return new ArrayList();
            }
            BVideo bVideo = new BVideo(str);
            AVFileInfo aVFileInfo = aVarS.a;
            long duration = aVFileInfo.getDuration();
            if (aVFileInfo.getAVFileType() == 2) {
                bVideo.duration = 300000000L;
                bVideo.mediaFileType = 0;
                bVideo.imageDuration = selectVideo.imageDuration;
            } else {
                if (aVFileInfo.getDuration() <= 0) {
                    BLog.e(TAG, "convertBClipList getDuration is 0, videoPath=" + str);
                    ((ArrayList) list2).add("convertBClipList:getDuration is 0, duration=" + aVFileInfo.getDuration() + ",videoPath=" + str);
                    aVar.f109465b = EditConvertError.ERROR_DURATION_0;
                    return new ArrayList();
                }
                o oVarA = aVarS.a();
                if (oVarA.getWidth() > 4096 || oVarA.getHeight() > 4096) {
                    StringBuilder sbA = l0.a("convertBClipList, videoPath=", str, " dimensionW=");
                    sbA.append(oVarA.getWidth());
                    sbA.append(" dimensionH=");
                    sbA.append(oVarA.getHeight());
                    BLog.e(TAG, sbA.toString());
                    ((ArrayList) list2).add("convertBClipList:video is 4K, dimensionW=" + oVarA.getWidth() + ",dimensionH=" + oVarA.getHeight() + ",videoPath=" + str);
                    aVar.f109465b = EditConvertError.ERROR_4K;
                    return new ArrayList();
                }
                if (selectVideo.getRoleInTheme() == 1011) {
                    bVideo.duration = selectVideo.duration;
                } else {
                    bVideo.duration = duration;
                }
            }
            bVideo.playRate = selectVideo.playRate;
            bVideo.bizFrom = selectVideo.bizFrom;
            bVideo.voiceFx = selectVideo.voiceFx;
            arrayList.add(bVideo);
        }
        ArrayList arrayList2 = new ArrayList();
        long outPoint = 0;
        for (BVideo bVideo2 : arrayList) {
            BClip bClip = new BClip();
            bClip.videoPath = bVideo2.videoPath;
            bClip.playRate = bVideo2.playRate;
            bClip.setBizFrom(bVideo2.bizFrom);
            bClip.setTrimIn(0L);
            int i7 = bVideo2.mediaFileType;
            bClip.clipMediaType = i7;
            if (i7 == 0) {
                long j7 = bVideo2.imageDuration;
                if (j7 > 0) {
                    bClip.setTrimOut(j7);
                } else {
                    bClip.setTrimOut(3000000L);
                }
            } else {
                bClip.setTrimOut(bVideo2.duration);
            }
            bClip.bVideo = bVideo2;
            bClip.setInPoint(outPoint);
            bClip.setOutPoint(bClip.getDuration(true) + outPoint);
            bClip.voiceFx = bVideo2.voiceFx;
            outPoint = bClip.getOutPoint();
            arrayList2.add(bClip);
        }
        return arrayList2;
    }

    @Nullable
    public static EditVideoClip createMainVideoTrack(int i7) {
        if (i7 == 10 || i7 == 11) {
            return new EditVideoClip(0, i7);
        }
        throwDebugException("EditVideoInfoUtils-createMainVideoTrack trackRole is error value");
        return null;
    }

    public static EditVideoClip createPipVideoTrack(int i7) {
        if (i7 == 11 || i7 == 10) {
            return new EditVideoClip(1, i7);
        }
        throwDebugException("EditVideoInfoUtils-createPipVideoTrack trackRole is error value");
        return null;
    }

    public static String getFakeFilePath() {
        return "assets:/template/img_editor_clip_fake.png";
    }

    public static void rmRubbishForTransform2DFxInfo(List<EditVideoClip> list) {
        if (list == null) {
            BLog.e(TAG, "rmRubbishForTransform2DFxInfo error videoTrackList == null");
        } else {
            if (list.isEmpty()) {
                BLog.e(TAG, "rmRubbishForTransform2DFxInfo error videoTrackList.isEmpty()");
                return;
            }
            Iterator<EditVideoClip> it = list.iterator();
            while (it.hasNext()) {
                clearRubbishForTransform2DFxInfo(it.next());
            }
        }
    }

    public static void throwDebugException(String str) {
    }
}

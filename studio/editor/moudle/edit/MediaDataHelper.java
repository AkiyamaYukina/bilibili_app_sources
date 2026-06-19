package com.bilibili.studio.editor.moudle.edit;

import L50.a;
import R50.a;
import R50.r;
import UC0.k;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.compose.runtime.snapshots.z;
import androidx.core.content.c;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.kaleidoscope.sdk.AVFileInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BVideo;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import vg.G;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/edit/MediaDataHelper.class */
@Keep
public final class MediaDataHelper implements IMediaDataHelper {

    @NotNull
    public static final MediaDataHelper INSTANCE = new MediaDataHelper();

    @NotNull
    private static final String TAG = "MediaDataHelper";

    private MediaDataHelper() {
    }

    public final void adaptionInterceptData(@NotNull EditVideoInfo editVideoInfo, @NotNull BClip bClip, long j7) {
        long trimIn = bClip.getTrimIn();
        long inPoint = bClip.getInPoint();
        long outPoint = bClip.getOutPoint();
        for (CaptionInfo captionInfo : editVideoInfo.getCaptionInfoList()) {
            long j8 = captionInfo.inPoint;
            long j9 = captionInfo.capTimeInVideo;
            StringBuilder sbA = z.a(j8, "adaptionInterceptData captionInfo=", ",");
            sbA.append(j9);
            J1.z.a(inPoint, ",inPoint=", ",outPoint=", sbA);
            sbA.append(outPoint);
            J1.z.a(j7, ",originTrimIn=", ",trimIn=", sbA);
            G.a(sbA, trimIn, TAG);
            long j10 = captionInfo.inPoint;
            if (inPoint <= j10 && j10 < outPoint) {
                captionInfo.capTimeInVideo = (captionInfo.capTimeInVideo - j7) + trimIn;
            }
        }
        ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
        if (biliEditorStickerInfoList != null) {
            for (BiliEditorStickerInfo biliEditorStickerInfo : biliEditorStickerInfoList) {
                long j11 = biliEditorStickerInfo.inPoint;
                long trimInClip = biliEditorStickerInfo.getTrimInClip();
                StringBuilder sbA2 = z.a(j11, "adaptionInterceptData stickerInfo=", ",");
                sbA2.append(trimInClip);
                J1.z.a(inPoint, ",inPoint=", ",outPoint=", sbA2);
                sbA2.append(outPoint);
                J1.z.a(j7, ",originTrimIn=", ",trimIn=", sbA2);
                G.a(sbA2, trimIn, TAG);
                long j12 = biliEditorStickerInfo.inPoint;
                if (inPoint <= j12 && j12 < outPoint) {
                    biliEditorStickerInfo.setTrimInClip((biliEditorStickerInfo.getTrimInClip() - j7) + trimIn);
                }
            }
        }
    }

    @Override // com.bilibili.studio.editor.moudle.edit.IMediaDataHelper
    public void adjustTransitionAfterClipChanged(@NotNull k kVar, @Nullable EditVideoClip editVideoClip, long j7) {
        List<TransitionInfo> transitionInfoList;
        List<BClip> bClipList;
        Object next;
        BClip bClip;
        BClip bClip2;
        if (editVideoClip == null || (transitionInfoList = editVideoClip.getTransitionInfoList()) == null || (bClipList = editVideoClip.getBClipList()) == null) {
            return;
        }
        int size = transitionInfoList.size() - 1;
        boolean z6 = false;
        if (size >= 0) {
            z6 = false;
            while (true) {
                int i7 = size - 1;
                TransitionInfo transitionInfo = transitionInfoList.get(size);
                int size2 = bClipList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size2) {
                        bClip = null;
                        bClip2 = null;
                        break;
                    }
                    bClip2 = bClipList.get(i8);
                    if (Intrinsics.areEqual(bClip2.id, transitionInfo.preBClipId)) {
                        bClip = (BClip) CollectionsKt.getOrNull(bClipList, i8 + 1);
                        if (bClip == null || !Intrinsics.areEqual(bClip.id, transitionInfo.nextBClipId)) {
                            bClip = null;
                        }
                    } else {
                        i8++;
                    }
                }
                if (bClip2 == null || bClip == null || bClip2.getDuration(true) < j7 || bClip.getDuration(true) < j7) {
                    transitionInfoList.remove(size);
                    z6 = true;
                }
                if (i7 < 0) {
                    break;
                } else {
                    size = i7;
                }
            }
        }
        if (z6) {
            int size3 = bClipList.size();
            for (int i9 = 0; i9 < size3 - 1; i9++) {
                Iterator<T> it = transitionInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    TransitionInfo transitionInfo2 = (TransitionInfo) next;
                    if (Intrinsics.areEqual(transitionInfo2.preBClipId, bClipList.get(i9).id) && Intrinsics.areEqual(transitionInfo2.nextBClipId, bClipList.get(i9 + 1).id)) {
                        break;
                    }
                }
                if (((TransitionInfo) next) == null) {
                    kVar.D(i9, 0, 0, 0L, "");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016f  */
    @Override // com.bilibili.studio.editor.moudle.edit.IMediaDataHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void videoAdjustAfterDurationChanged(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r8, @org.jetbrains.annotations.Nullable java.util.List<? extends com.bilibili.studio.videoeditor.bean.BClip> r9, long r10, @org.jetbrains.annotations.Nullable java.util.List<UC0.k> r12) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.edit.MediaDataHelper.videoAdjustAfterDurationChanged(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, java.util.List, long, java.util.List):void");
    }

    @Override // com.bilibili.studio.editor.moudle.edit.IMediaDataHelper
    public boolean videoCutClip(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoClip editVideoClip, @Nullable BClip bClip, long j7) {
        long j8;
        if (editVideoInfo == null || editVideoClip == null || bClip == null || j7 < 0 || editVideoClip.getBClipList() == null || !editVideoClip.splitBClip(j7)) {
            return false;
        }
        BClip bClipAtIndex = editVideoClip.getBClipAtIndex(editVideoClip.getBClipList().indexOf(bClip) + 1);
        if (bClipAtIndex == null) {
            return true;
        }
        List<Transform2DFxInfo> transform2DFxInfoList = editVideoClip.getTransform2DFxInfoList();
        if (transform2DFxInfoList != null && transform2DFxInfoList.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (Transform2DFxInfo transform2DFxInfo : transform2DFxInfoList) {
                arrayList.add(transform2DFxInfo);
                if (transform2DFxInfo.bClipId.equals(bClip.id)) {
                    Transform2DFxInfo transform2DFxInfoClone = transform2DFxInfo.m10481clone();
                    transform2DFxInfoClone.bClipId = bClipAtIndex.id;
                    arrayList.add(transform2DFxInfoClone);
                }
            }
            transform2DFxInfoList.clear();
            transform2DFxInfoList.addAll(arrayList);
        }
        List<TransitionInfo> transitionInfoList = editVideoClip.getTransitionInfoList();
        if (transitionInfoList != null && transitionInfoList.size() > 0 && transitionInfoList.size() != 0) {
            for (TransitionInfo transitionInfo : transitionInfoList) {
                if (transitionInfo.preBClipId.equals(bClip.id)) {
                    transitionInfo.preBClipId = bClipAtIndex.id;
                }
            }
        }
        List<SceneFxInfo> sceneFxInfoList = editVideoClip.getSceneFxInfoList();
        if (sceneFxInfoList != null) {
            editVideoClip.getBClipList();
            if (sceneFxInfoList.size() != 0) {
                Iterator<SceneFxInfo> it = sceneFxInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SceneFxInfo next = it.next();
                    if (next.bClipId.equals(bClip.id)) {
                        next.duration = bClip.getDuration(true);
                        break;
                    }
                }
            }
        }
        Iterator<BClip> it2 = editVideoClip.getBClipList().iterator();
        long duration = 0;
        while (true) {
            j8 = duration;
            if (!it2.hasNext()) {
                j8 = -1;
                break;
            }
            BClip next2 = it2.next();
            if (next2.id.equals(bClipAtIndex.id)) {
                break;
            }
            duration = j8 + next2.getDuration(true);
        }
        EditFxFilterInfo editFxFilterInfo = editVideoClip.getEditFxFilterInfo();
        if (editFxFilterInfo != null) {
            editFxFilterInfo.split(bClipAtIndex, j8);
        }
        EditVisualEffectsInfo editVisualEffectsInfo = editVideoClip.getEditVisualEffectsInfo();
        if (editVisualEffectsInfo != null) {
            editVisualEffectsInfo.split(bClipAtIndex, j8);
        }
        List<CaptionInfo> captionInfoList = editVideoInfo.getCaptionInfoList();
        if (captionInfoList.size() != 0) {
            for (CaptionInfo captionInfo : captionInfoList) {
                if (captionInfo.bClipID.equals(bClip.id) && (captionInfo.capTimeInVideo < bClip.getTrimIn() || captionInfo.capTimeInVideo > bClip.getTrimOut())) {
                    captionInfo.bClipID = bClipAtIndex.id;
                }
            }
        }
        List<RecordInfo> recordInfoList = editVideoInfo.getRecordInfoList();
        if (recordInfoList != null && recordInfoList.size() != 0) {
            for (RecordInfo recordInfo : recordInfoList) {
                if (bClip.id.equals(recordInfo.bClipID) && (recordInfo.capTimeInVideo < bClip.getTrimIn() || recordInfo.capTimeInVideo > bClip.getTrimOut())) {
                    recordInfo.bClipID = bClipAtIndex.id;
                }
            }
        }
        ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
        if (biliEditorStickerInfoList == null || biliEditorStickerInfoList.size() <= 0) {
            return true;
        }
        for (BiliEditorStickerInfo biliEditorStickerInfo : biliEditorStickerInfoList) {
            if (biliEditorStickerInfo.getClipId().equals(bClip.id) && biliEditorStickerInfo.inPoint >= bClipAtIndex.getInPoint() && bClipAtIndex.getInPoint() <= bClipAtIndex.getOutPoint()) {
                biliEditorStickerInfo.setClipId(bClipAtIndex.id);
                biliEditorStickerInfo.setTrimInClip(bClipAtIndex.getTrimIn() + ((long) ((biliEditorStickerInfo.inPoint - bClipAtIndex.getInPoint()) * bClipAtIndex.playRate)));
            }
        }
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.edit.IMediaDataHelper
    public boolean videoDeleteClip(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoClip editVideoClip, int i7) {
        List<BClip> bClipList;
        if (editVideoInfo == null || editVideoClip == null || i7 < 0 || (bClipList = editVideoClip.getBClipList()) == null || i7 > bClipList.size()) {
            return false;
        }
        bClipList.remove(i7);
        editVideoClip.onBClipUpdated();
        return true;
    }

    @Override // com.bilibili.studio.editor.moudle.edit.IMediaDataHelper
    public boolean videoReplaceClip(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoClip editVideoClip, int i7, @Nullable String str, long j7) {
        BClip bClipAtIndex;
        if (editVideoInfo == null || editVideoClip == null || i7 < 0 || TextUtils.isEmpty(str) || (bClipAtIndex = editVideoClip.getBClipAtIndex(i7)) == null) {
            return false;
        }
        long trimIn = bClipAtIndex.getTrimIn();
        BLog.d(TAG, c.b(trimIn, "videoReplaceClip bClip=", bClipAtIndex.id, ",originTrimIn="));
        List<SelectVideo> selectVideoList = editVideoInfo.getSelectVideoList();
        if (!V.e(selectVideoList) && i7 < selectVideoList.size()) {
            selectVideoList.get(i7).videoPath = str;
        }
        bClipAtIndex.videoPath = str;
        bClipAtIndex.bVideo.videoPath = str;
        bClipAtIndex.setTrimIn(0L);
        bClipAtIndex.setTrimOut(j7);
        a aVarS = null;
        r rVarU = a.a.a.a != null ? r.u() : null;
        if (rVarU != null) {
            aVarS = rVarU.s(str);
        }
        if (aVarS != null) {
            AVFileInfo aVFileInfo = aVarS.a;
            if (aVFileInfo.getAVFileType() == 2) {
                BVideo bVideo = bClipAtIndex.bVideo;
                bVideo.mediaFileType = 0;
                bVideo.duration = 300000000L;
            } else {
                BVideo bVideo2 = bClipAtIndex.bVideo;
                bVideo2.mediaFileType = 1;
                bVideo2.duration = aVFileInfo.getDuration();
            }
        }
        bClipAtIndex.clipMediaType = bClipAtIndex.bVideo.mediaFileType;
        adaptionInterceptData(editVideoInfo, bClipAtIndex, trimIn);
        return true;
    }
}

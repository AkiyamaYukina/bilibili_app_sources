package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import android.text.TextUtils;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BClipDraft;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo;
import com.bilibili.studio.videoeditor.ms.picture.Transform2DFxInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/e.class */
public final class e extends gC0.b<EditVideoInfo> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoCore] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // gC0.b
    public final void b(Object obj, gC0.a aVar) {
        ?? arrayList;
        ?? r02 = (EditVideoInfo) obj;
        EditVideoClip editVideoClip = r02.getEditVideoClip();
        BLog.e("ADataHandler-741", "updateVideoTracks editVideoClip=" + editVideoClip);
        if (editVideoClip != null && !V.e(editVideoClip.getBClipDraftList())) {
            ?? M10449clone = editVideoClip.m10449clone();
            M10449clone.setVideoTrackVolume(r02.getNativeVolume());
            M10449clone.setBClipDraftList(null);
            List<BClip> listConvertBClipListCopy = EditVideoInfoUtils.convertBClipListCopy(r02.getSelectVideoList(), new com.bilibili.studio.videoeditor.editor.editdata.a(new ArrayList()));
            if (V.e(listConvertBClipListCopy)) {
                arrayList = 0;
            } else {
                List<BClipDraft> bClipDraftList = editVideoClip.getBClipDraftList();
                if (!V.e(bClipDraftList)) {
                    arrayList = new ArrayList();
                    for (BClipDraft bClipDraft : bClipDraftList) {
                        Iterator<BClip> it = listConvertBClipListCopy.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                BClip next = it.next();
                                if (!TextUtils.isEmpty(next.videoPath) && Intrinsics.areEqual(next.videoPath, bClipDraft.getFilePath())) {
                                    BClip bClipM10399clone = next.m10399clone();
                                    bClipM10399clone.id = bClipDraft.getId();
                                    bClipM10399clone.materialId = bClipDraft.getMaterialId();
                                    bClipM10399clone.playRate = bClipDraft.getPlayRate();
                                    bClipM10399clone.setTrimIn(bClipDraft.getTrimIn());
                                    bClipM10399clone.setTrimOut(bClipDraft.getTrimOut());
                                    bClipM10399clone.setInPoint(bClipDraft.getInPoint());
                                    bClipM10399clone.setOutPoint(bClipDraft.getOutPoint());
                                    bClipM10399clone.setRotation(bClipDraft.getRotation());
                                    bClipM10399clone.setBackgroundMode(bClipDraft.getBackgroundMode());
                                    bClipM10399clone.updateAnimInfo(bClipDraft);
                                    bClipM10399clone.setReginInfo(bClipDraft.getRegionInfo());
                                    bClipM10399clone.setNativeAudio(bClipDraft.getNativeAudio());
                                    bClipM10399clone.setBizFrom(bClipDraft.getBizFrom());
                                    bClipM10399clone.voiceFx = bClipDraft.getVoiceFx();
                                    bClipM10399clone.clipMediaType = bClipDraft.getMediaType();
                                    bClipM10399clone.setClipMaterialType(bClipDraft.getClipType());
                                    arrayList.add(bClipM10399clone);
                                    break;
                                }
                            }
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    long outPoint = 0;
                    while (true) {
                        long j7 = outPoint;
                        if (!it2.hasNext()) {
                            break;
                        }
                        BClip bClip = (BClip) it2.next();
                        bClip.setInPoint(j7);
                        bClip.setOutPoint(bClip.getDuration(true) + j7);
                        outPoint = bClip.getOutPoint();
                    }
                } else {
                    arrayList = listConvertBClipListCopy;
                    if (r02.getEditorMode() != 68) {
                        Iterator it3 = listConvertBClipListCopy.iterator();
                        while (true) {
                            arrayList = listConvertBClipListCopy;
                            if (!it3.hasNext()) {
                                break;
                            }
                            BClip bClip2 = (BClip) it3.next();
                            for (SelectVideo selectVideo : r02.getSelectVideoList()) {
                                if (Intrinsics.areEqual(bClip2.videoPath, selectVideo.videoPath)) {
                                    bClip2.playRate = selectVideo.playRate;
                                    bClip2.setBizFrom(selectVideo.bizFrom);
                                }
                            }
                        }
                    }
                }
            }
            if (V.e(arrayList)) {
                EditVideoInfoUtils.throwDebugException("DataHandler741-updateVideoTracks");
            }
            M10449clone.setBClipListAndUpdate(arrayList);
            BLog.e("ADataHandler-741", "updateVideoTracks setMainVideoTrack=" + r02.setMainVideoTrack(M10449clone));
            r02.setEditVideoClip(null);
            if (r02.getMainVideoTrack() == null) {
                EditVideoInfoUtils.throwDebugException("DataHandler745.handleData mainVideoTrack == null");
            }
            List<TransitionInfo> transitionInfoList = r02.getTransitionInfoList();
            EditVideoClip mainVideoTrack = r02.getMainVideoTrack();
            BLog.e("ADataHandler-741", "updateTransitionList transitionInfoList=" + (transitionInfoList != null ? Integer.valueOf(transitionInfoList.size()) : null) + ",mainVideoTrack=" + mainVideoTrack);
            if (transitionInfoList != null && mainVideoTrack != null) {
                mainVideoTrack.setTransitionInfoList(transitionInfoList);
            }
            r02.setTransitionInfoList(null);
            List<Transform2DFxInfo> transform2DFxInfoList = r02.getTransform2DFxInfoList();
            EditVideoClip mainVideoTrack2 = r02.getMainVideoTrack();
            BLog.e("ADataHandler-741", "updateTransitionList transform2DFxInfoList=" + (transform2DFxInfoList != null ? Integer.valueOf(transform2DFxInfoList.size()) : null) + ",mainVideoTrack=" + mainVideoTrack2);
            if (transform2DFxInfoList != null && mainVideoTrack2 != null) {
                mainVideoTrack2.setTransform2DFxInfoList(r02.getTransform2DFxInfoListClone());
            }
            r02.setTransform2DFxInfoList(null);
            List<SceneFxInfo> sceneFxInfoList = r02.getSceneFxInfoList();
            EditVideoClip mainVideoTrack3 = r02.getMainVideoTrack();
            BLog.e("ADataHandler-741", "updateSceneFxInfoList sceneFxInfoList=" + (sceneFxInfoList != null ? Integer.valueOf(sceneFxInfoList.size()) : null) + ",mainVideoTrack=" + mainVideoTrack3);
            if (sceneFxInfoList != null && mainVideoTrack3 != null) {
                mainVideoTrack3.setSceneFxInfoList(r02.getSceneInfoListClone());
            }
            r02.setSceneFxInfoList(null);
            EditFxFilterInfo editFxFilterInfo = r02.getEditFxFilterInfo();
            EditVideoClip mainVideoTrack4 = r02.getMainVideoTrack();
            BLog.e("ADataHandler-741", "updateEditFxFilterInfo editFxFilterInfo=" + editFxFilterInfo + ",mainVideoTrack=" + mainVideoTrack4);
            if (editFxFilterInfo != null && mainVideoTrack4 != null) {
                mainVideoTrack4.setEditFxFilterInfo(editFxFilterInfo.m10437clone());
            }
            r02.setEditFxFilterInfo(null);
            EditVisualEffectsInfo editVisualEffectsInfo = r02.getEditVisualEffectsInfo();
            EditVideoClip mainVideoTrack5 = r02.getMainVideoTrack();
            BLog.e("ADataHandler-741", "updateVisualEffectInfo visualEffect=" + editVisualEffectsInfo + ",mainVideoTrack=" + mainVideoTrack5);
            if (editVisualEffectsInfo != null && mainVideoTrack5 != null) {
                mainVideoTrack5.setEditVisualEffectsInfo(editVisualEffectsInfo);
            }
            r02.setEditVisualEffectsInfo(null);
        }
        r02.setProjectVersion(7410000L);
        aVar.invoke(Boolean.TRUE);
    }

    @Override // gC0.b
    public final boolean c(EditVideoInfo editVideoInfo, String str) {
        return editVideoInfo.getProjectVersion() < 7410000;
    }
}

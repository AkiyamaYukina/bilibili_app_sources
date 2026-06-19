package com.bilibili.studio.editor.moudle.intelligence.logic;

import A91.A;
import com.bilibili.campus.manage.compose.G;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorTimelineVideoFx;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f107350a = LazyKt.lazy(new A(7));

    public static void a(EditVideoInfo editVideoInfo) {
        EditVideoClip editVideoClipCreateMainVideoTrack;
        Bz0.a.c(null, editVideoInfo);
        editVideoInfo.getTtsInfoList().clear();
        EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
        if (editorMusicInfo != null) {
            editorMusicInfo.themeMusic = null;
            ArrayList<BMusic> arrayList = editorMusicInfo.bMusicList;
            final G g7 = new G(1);
            arrayList.removeIf(new Predicate(g7) { // from class: com.bilibili.studio.editor.moudle.intelligence.logic.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final G f107349a;

                {
                    this.f107349a = g7;
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) this.f107349a.invoke(obj)).booleanValue();
                }
            });
        }
        ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
        if (biliEditorStickerInfoList != null) {
            biliEditorStickerInfoList.clear();
        }
        List<RecordInfo> recordInfoList = editVideoInfo.getRecordInfoList();
        if (recordInfoList != null) {
            recordInfoList.clear();
        }
        List<EditorDanmakuInfo> danmakuInfoList = editVideoInfo.getDanmakuInfoList();
        if (danmakuInfoList != null) {
            danmakuInfoList.clear();
        }
        List<BiliEditorTimelineVideoFx> biliEditorTimelineFxList = editVideoInfo.getBiliEditorTimelineFxList();
        if (biliEditorTimelineFxList != null) {
            biliEditorTimelineFxList.clear();
        }
        editVideoInfo.setTimeLineFillMode(26770);
        List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList == null || (editVideoClipCreateMainVideoTrack = EditVideoInfoUtils.createMainVideoTrack(10)) == null) {
            return;
        }
        List<EditVideoClip> editVideoTracks = editVideoInfo.getEditVideoTracks();
        if (editVideoTracks != null) {
            editVideoTracks.clear();
        }
        long j7 = 0;
        for (BClip bClip : userTrackBClipList) {
            if (!bClip.isFakeClip() && !bClip.isTemplateClip()) {
                bClip.playRate = 1.0f;
                bClip.setInPoint(j7);
                bClip.setOutPoint((bClip.getTrimOut() + j7) - bClip.getTrimIn());
                long outPoint = bClip.getOutPoint();
                bClip.setRotation(0);
                bClip.setBackgroundMode(false);
                bClip.resetAnimation();
                bClip.setReginInfo(null);
                bClip.setNativeAudio(null);
                List<BClip> bClipList = editVideoClipCreateMainVideoTrack.getBClipList();
                j7 = outPoint;
                if (bClipList != null) {
                    bClipList.add(bClip.m10399clone());
                    j7 = outPoint;
                }
            }
        }
        editVideoClipCreateMainVideoTrack.onBClipUpdated();
        editVideoInfo.addMainVideoTrack(editVideoClipCreateMainVideoTrack);
    }
}

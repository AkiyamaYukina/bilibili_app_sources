package com.bilibili.studio.editor.moudle.aistory.step;

import L50.a;
import R50.r;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.util.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/l.class */
public final class l extends d {
    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void d(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        Size originSize = editVideoInfo.getOriginSize();
        Size sizeD = originSize;
        if (originSize == null) {
            sizeD = P.d(editVideoInfo.getVideoList());
        }
        List<CaptionInfo> captionInfoList = aIStoryBean.getCaptionInfoList();
        if (captionInfoList != null) {
            for (CaptionInfo captionInfo : captionInfoList) {
                d.c(captionInfo, editVideoInfo.getUserTrackBClipList());
                captionInfo.pos = new BPointF(((float) (((double) sizeD.getWidth()) / 2.0d)) * captionInfo.translationX, ((float) (((double) sizeD.getHeight()) / 2.0d)) * captionInfo.translationY);
            }
        }
        List<CaptionInfo> captionInfoList2 = aIStoryBean.getCaptionInfoList();
        List<CaptionInfo> listEmptyList = captionInfoList2;
        if (captionInfoList2 == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        editVideoInfo.setCaptionInfoList(listEmptyList);
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void i(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        editVideoInfo.prepare();
        Size videoSize = editVideoInfo.getVideoSize();
        Size videoSize2 = editVideoInfo.getVideoSize();
        Integer numValueOf = videoSize2 != null ? Integer.valueOf(videoSize2.getWidth()) : null;
        Size videoSize3 = editVideoInfo.getVideoSize();
        Integer numValueOf2 = videoSize3 != null ? Integer.valueOf(videoSize3.getHeight()) : null;
        ArrayList<BiliEditorStickerInfo> stickerInfoList = aIStoryBean.getStickerInfoList();
        if (stickerInfoList != null) {
            for (BiliEditorStickerInfo biliEditorStickerInfo : stickerInfoList) {
                long j7 = biliEditorStickerInfo.inPoint;
                List<BClip> userTrackBClipList = editVideoInfo.getUserTrackBClipList();
                if (userTrackBClipList != null) {
                    for (BClip bClip : userTrackBClipList) {
                        if (j7 >= bClip.getInPoint() && j7 < bClip.getOutPoint()) {
                            break;
                        }
                    }
                    bClip = null;
                } else {
                    bClip = null;
                }
                if (bClip != null) {
                    biliEditorStickerInfo.setClipId(bClip.id);
                    biliEditorStickerInfo.setClipPath(bClip.videoPath);
                    biliEditorStickerInfo.setTrimInClip(bClip.getTrimIn() + ((long) ((j7 - bClip.getInPoint()) * bClip.playRate)));
                }
                if (videoSize != null && numValueOf != null && numValueOf2 != null) {
                    biliEditorStickerInfo.updateTranslationPointF((float) (((double) (numValueOf.intValue() * biliEditorStickerInfo.getTranslationPointF().f109462x)) / 2.0d), (float) (((double) (numValueOf2.intValue() * biliEditorStickerInfo.getTranslationPointF().f109463y)) / 2.0d));
                    biliEditorStickerInfo.setRhythmConfig(true);
                    biliEditorStickerInfo.setRange(d.m(videoSize));
                }
            }
        }
        editVideoInfo.setBiliEditorStickerInfoList(aIStoryBean.getStickerInfoList());
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final boolean p(@NotNull AIStoryBean aIStoryBean, @NotNull com.bilibili.studio.editor.moudle.aistory.a aVar) {
        if ((a.a.a.a != null ? r.u() : null) != null) {
            return true;
        }
        Result.Companion companion = Result.Companion;
        aVar.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("StreamingContext is null")))));
        return false;
    }
}

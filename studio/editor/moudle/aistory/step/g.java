package com.bilibili.studio.editor.moudle.aistory.step;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditStickerItem;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/g.class */
public final class g extends f {
    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void e(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        List<EditStickerItem> editFxStickerList = aIStoryBean.getEditFxStickerList();
        List<EditStickerItem> list = editFxStickerList;
        if (list == null || list.isEmpty()) {
            return;
        }
        editVideoInfo.prepare();
        Size videoSize = editVideoInfo.getVideoSize();
        Size videoSize2 = editVideoInfo.getVideoSize();
        Integer numValueOf = videoSize2 != null ? Integer.valueOf(videoSize2.getWidth()) : null;
        Size videoSize3 = editVideoInfo.getVideoSize();
        Integer numValueOf2 = videoSize3 != null ? Integer.valueOf(videoSize3.getHeight()) : null;
        for (EditStickerItem editStickerItem : editFxStickerList) {
            ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
            BiliEditorStickerInfo biliEditorStickerInfo = new BiliEditorStickerInfo();
            biliEditorStickerInfo.setStickerType(editStickerItem.getStickerType());
            biliEditorStickerInfo.setEditCustomizeSticker(editStickerItem.getEditCustomizeSticker());
            biliEditorStickerInfo.setEditFxSticker(editStickerItem.getEditFxSticker());
            biliEditorStickerInfo.inPoint = 0L;
            PreviewItem previewItem = editStickerItem.getPreviewItem();
            biliEditorStickerInfo.setCover(previewItem != null ? previewItem.getUrl() : null);
            biliEditorStickerInfo.outPoint = editVideoInfo.getVideoDuration();
            BClip bClipK = d.k(editVideoInfo, biliEditorStickerInfo.inPoint);
            if (bClipK != null) {
                biliEditorStickerInfo.setClipId(bClipK.id);
                biliEditorStickerInfo.setClipPath(bClipK.videoPath);
                biliEditorStickerInfo.setTrimInClip(bClipK.getTrimIn() + ((long) ((biliEditorStickerInfo.inPoint - bClipK.getInPoint()) * bClipK.playRate)));
            }
            if (biliEditorStickerInfo.getStickerType() == 1 || biliEditorStickerInfo.getStickerType() == 5) {
                biliEditorStickerInfo.setSelectedByUser(true);
            }
            biliEditorStickerInfo.setZValue(editStickerItem.getZValue());
            if (biliEditorStickerInfo.getZValue() != 0.0f) {
                editVideoInfo.getEditNvsTimelineInfoBase().setEnableRenderOrderByZValue(true);
            }
            biliEditorStickerInfo.setScaleFactor(editStickerItem.getScaleFactor().floatValue());
            if (videoSize != null && numValueOf != null && numValueOf2 != null) {
                biliEditorStickerInfo.updateTranslationPointF((float) (((double) (editStickerItem.getNormalizeTranslationX().floatValue() * numValueOf.intValue())) / 2.0d), (float) (((double) (editStickerItem.getNormalizeTranslationY().floatValue() * numValueOf2.intValue())) / 2.0d));
                biliEditorStickerInfo.setRhythmConfig(true);
                biliEditorStickerInfo.setRange(d.m(videoSize));
            }
            biliEditorStickerInfoList.add(biliEditorStickerInfo);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void h(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        super.h(editVideoInfo, aIStoryBean);
        editVideoInfo.setAiStyleId(aIStoryBean.getPlayId());
        editVideoInfo.setAiStyleName(aIStoryBean.getStyleName());
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    public final void i(@NotNull EditVideoInfo editVideoInfo, @NotNull AIStoryBean aIStoryBean) {
        if (editVideoInfo.getBiliEditorStickerInfoList() == null) {
            editVideoInfo.setBiliEditorStickerInfoList(new ArrayList<>());
        }
        Map<String, EditStickerItem> localSticker = aIStoryBean.getLocalSticker();
        if (localSticker == null || localSticker.isEmpty()) {
            return;
        }
        editVideoInfo.prepare();
        Size videoSize = editVideoInfo.getVideoSize();
        Size videoSize2 = editVideoInfo.getVideoSize();
        Integer numValueOf = videoSize2 != null ? Integer.valueOf(videoSize2.getWidth()) : null;
        Size videoSize3 = editVideoInfo.getVideoSize();
        Integer numValueOf2 = videoSize3 != null ? Integer.valueOf(videoSize3.getHeight()) : null;
        for (CaptionInfo captionInfo : editVideoInfo.getCaptionInfoList()) {
            String str = captionInfo.text;
            Integer num = numValueOf2;
            if (str != null) {
                if (str.length() == 0) {
                    num = numValueOf2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, EditStickerItem> entry : localSticker.entrySet()) {
                        String key = entry.getKey();
                        EditStickerItem value = entry.getValue();
                        if (StringsKt.n(str, key)) {
                            arrayList.add(value);
                        }
                    }
                    List listSubList = arrayList;
                    if (arrayList.size() >= 5) {
                        listSubList = arrayList.subList(0, 5);
                    }
                    num = numValueOf2;
                    if (listSubList != null) {
                        Iterator it = listSubList.iterator();
                        while (true) {
                            num = numValueOf2;
                            if (it.hasNext()) {
                                EditStickerItem editStickerItem = (EditStickerItem) it.next();
                                ArrayList<BiliEditorStickerInfo> biliEditorStickerInfoList = editVideoInfo.getBiliEditorStickerInfoList();
                                BiliEditorStickerInfo biliEditorStickerInfo = new BiliEditorStickerInfo();
                                biliEditorStickerInfo.setStickerType(editStickerItem.getStickerType());
                                biliEditorStickerInfo.setEditCustomizeSticker(editStickerItem.getEditCustomizeSticker());
                                biliEditorStickerInfo.setEditFxSticker(editStickerItem.getEditFxSticker());
                                PreviewItem previewItem = editStickerItem.getPreviewItem();
                                biliEditorStickerInfo.setCover(previewItem != null ? previewItem.getUrl() : null);
                                long j7 = captionInfo.inPoint;
                                biliEditorStickerInfo.inPoint = j7;
                                biliEditorStickerInfo.outPoint = captionInfo.outPoint;
                                BClip bClipK = d.k(editVideoInfo, j7);
                                if (bClipK != null) {
                                    biliEditorStickerInfo.setClipId(bClipK.id);
                                    biliEditorStickerInfo.setClipPath(bClipK.videoPath);
                                    biliEditorStickerInfo.setTrimInClip(bClipK.getTrimIn() + ((long) ((biliEditorStickerInfo.inPoint - bClipK.getInPoint()) * bClipK.playRate)));
                                }
                                if (biliEditorStickerInfo.getStickerType() == 1 || biliEditorStickerInfo.getStickerType() == 5) {
                                    biliEditorStickerInfo.setSelectedByUser(true);
                                }
                                biliEditorStickerInfo.setZValue(editStickerItem.getZValue());
                                if (biliEditorStickerInfo.getZValue() != 0.0f) {
                                    editVideoInfo.getEditNvsTimelineInfoBase().setEnableRenderOrderByZValue(true);
                                }
                                biliEditorStickerInfo.setScaleFactor(editStickerItem.getScaleFactor().floatValue());
                                if (videoSize != null && numValueOf != null && numValueOf2 != null) {
                                    biliEditorStickerInfo.updateTranslationPointF((float) (((double) (editStickerItem.getNormalizeTranslationX().floatValue() * numValueOf.intValue())) / 2.0d), (float) (((double) (editStickerItem.getNormalizeTranslationY().floatValue() * numValueOf2.intValue())) / 2.0d));
                                    biliEditorStickerInfo.setRhythmConfig(true);
                                    biliEditorStickerInfo.setRange(d.m(videoSize));
                                }
                                biliEditorStickerInfoList.add(biliEditorStickerInfo);
                            }
                        }
                    }
                }
            }
            numValueOf2 = num;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    @Override // com.bilibili.studio.editor.moudle.aistory.step.d
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Float l(@org.jetbrains.annotations.NotNull com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r4, @org.jetbrains.annotations.NotNull com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean r5) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.step.g.l(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean):java.lang.Float");
    }
}

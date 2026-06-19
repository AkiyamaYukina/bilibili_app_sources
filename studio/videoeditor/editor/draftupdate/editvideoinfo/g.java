package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.editor.moudle.music.common.EditorMusicInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditFxStickerClip;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editbase.filter.model.EditFxFilterInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/g.class */
public final class g extends gC0.b<EditVideoInfo> {
    @Override // gC0.b
    public final void b(Object obj, gC0.a aVar) {
        EditVideoInfo editVideoInfo = (EditVideoInfo) obj;
        FilterInfo filterInfo = editVideoInfo.getFilterInfo();
        BLog.e("ADataHandler-Old", "updateFilterInfo old=" + filterInfo);
        if (filterInfo != null) {
            EditFxFilterInfo editFxFilterInfo = editVideoInfo.getEditFxFilterInfo();
            EditFxFilterInfo editFxFilterInfo2 = editFxFilterInfo;
            if (editFxFilterInfo == null) {
                editFxFilterInfo2 = new EditFxFilterInfo();
            }
            editFxFilterInfo2.checkUpgrade(filterInfo);
            editVideoInfo.setEditFxFilterInfo(editFxFilterInfo2);
            editVideoInfo.setFilterInfo(null);
        }
        BMusic bMusic = editVideoInfo.getBMusic();
        BLog.e("ADataHandler-Old", "updateBMusic old=" + bMusic);
        if (bMusic != null) {
            EditorMusicInfo editorMusicInfo = editVideoInfo.getEditorMusicInfo();
            if ((editorMusicInfo != null ? editorMusicInfo.bMusicList : null) == null || editorMusicInfo.bMusicList.size() == 0) {
                editVideoInfo.setEditorMusicInfo(com.bilibili.studio.videoeditor.editor.editdata.c.b(bMusic));
                editVideoInfo.setBMusic(null);
            } else {
                EditVideoInfoUtils.throwDebugException("DataHandlerOld.updateMusic 音乐数据异常");
            }
        }
        List<EditFxStickerClip> editFxStickerClipList = editVideoInfo.getEditFxStickerClipList();
        BLog.e("ADataHandler-Old", "updateEditFxStickerClipList old=" + (editFxStickerClipList != null ? Integer.valueOf(editFxStickerClipList.size()) : null));
        if (editFxStickerClipList != null) {
            if (editFxStickerClipList.size() > 0) {
                ArrayList<BiliEditorStickerInfo> arrayList = new ArrayList<>();
                for (EditFxStickerClip editFxStickerClip : editFxStickerClipList) {
                    BiliEditorStickerInfo biliEditorStickerInfo = new BiliEditorStickerInfo();
                    biliEditorStickerInfo.setClipId(editFxStickerClip.mAppendBClipId);
                    biliEditorStickerInfo.setClipPath(editFxStickerClip.mAppendBClipVideoPath);
                    biliEditorStickerInfo.setCreateTime(editFxStickerClip.mClipId);
                    biliEditorStickerInfo.setStickerUUID(UUID.randomUUID().toString());
                    biliEditorStickerInfo.inPoint = editFxStickerClip.mSpeedTimeTrimIn;
                    biliEditorStickerInfo.outPoint = editFxStickerClip.mSpeedTimeTrimOut;
                    biliEditorStickerInfo.setTrimInClip(editFxStickerClip.mStandTimeStart + editFxStickerClip.mClipSpeedTimeTrimIn);
                    biliEditorStickerInfo.setScaleFactor(editFxStickerClip.mScaleFactor);
                    biliEditorStickerInfo.setRotationZ(editFxStickerClip.mRotationZ);
                    biliEditorStickerInfo.setTranslationPointF(editFxStickerClip.mTranslationPointF);
                    biliEditorStickerInfo.setStickerType(editFxStickerClip.mStickerType);
                    biliEditorStickerInfo.setEditFxSticker(editFxStickerClip.mEditFxSticker);
                    biliEditorStickerInfo.setEditCustomizeSticker(editFxStickerClip.mEditCustomizeSticker);
                    arrayList.add(biliEditorStickerInfo);
                }
                editVideoInfo.setBiliEditorStickerInfoList(arrayList);
            }
            editVideoInfo.setEditFxStickerClipList(null);
        }
        editVideoInfo.setProjectVersion(1L);
        aVar.invoke(Boolean.TRUE);
    }

    @Override // gC0.b
    public final boolean c(EditVideoInfo editVideoInfo, String str) {
        return editVideoInfo.getProjectVersion() < 1;
    }
}

package com.bilibili.studio.editor.moudle.intelligence.data;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.editor.editdata.EditorEnterInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/IntelligenceInitData.class */
@Keep
public class IntelligenceInitData {
    public static final int PAGE_ALBUM = 2;
    public static final int PAGE_TEMPLATE = 1;
    public int imageCount;
    public int videoCount;
    public long videoDuration;
    public long templateId = 0;
    public int intelligenceFrom = 2;
    public boolean templateIsConfig = false;
    public boolean templateIsServer = false;
    public int pageFrom = 2;
    public boolean isNewEditor = false;

    public static IntelligenceInitData fillData(EditorEnterInfo editorEnterInfo, int i7) {
        IntelligenceInitData intelligenceInitData = new IntelligenceInitData();
        intelligenceInitData.imageCount = editorEnterInfo.getImageCount();
        intelligenceInitData.videoCount = editorEnterInfo.getVideoCount();
        intelligenceInitData.templateId = editorEnterInfo.getTemplateId();
        intelligenceInitData.videoDuration = editorEnterInfo.getVideoDuration();
        intelligenceInitData.templateIsConfig = editorEnterInfo.getTemplateIsConfig();
        intelligenceInitData.templateIsServer = editorEnterInfo.getTemplateIsServer();
        intelligenceInitData.pageFrom = i7;
        intelligenceInitData.intelligenceFrom = editorEnterInfo.getIntelligenceFrom();
        if (i7 == 1) {
            intelligenceInitData.intelligenceFrom = 6;
        }
        return intelligenceInitData;
    }
}

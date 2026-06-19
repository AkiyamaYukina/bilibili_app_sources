package com.bilibili.studio.editor.moudle.danmaku.v1;

import P50.q;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/EditorDanmakuInfo.class */
@Keep
public class EditorDanmakuInfo extends CaptionInfo {
    public int isCreate;
    public long reserveId;
    public long reserveTime;
    public int reverseType;
    public String subtitle;

    @JSONField(serialize = false)
    public transient q timelineCompoundCaption;
    public int titleLimit;
    public String trackName;
    public DanmakuTypeItem typeItem;

    public static EditorDanmakuInfo duplicateDanmaku(EditorDanmakuInfo editorDanmakuInfo) {
        EditorDanmakuInfo editorDanmakuInfo2 = new EditorDanmakuInfo();
        editorDanmakuInfo2.isCreate = editorDanmakuInfo.isCreate;
        editorDanmakuInfo2.subtitle = editorDanmakuInfo.subtitle;
        editorDanmakuInfo2.trackName = editorDanmakuInfo.trackName;
        editorDanmakuInfo2.reserveId = editorDanmakuInfo.reserveId;
        editorDanmakuInfo2.reserveTime = editorDanmakuInfo.reserveTime;
        editorDanmakuInfo2.reverseType = editorDanmakuInfo.reverseType;
        editorDanmakuInfo2.titleLimit = editorDanmakuInfo.titleLimit;
        editorDanmakuInfo2.typeItem = editorDanmakuInfo.typeItem;
        editorDanmakuInfo2.update(editorDanmakuInfo);
        return editorDanmakuInfo2;
    }

    @Override // com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo, com.bilibili.studio.videoeditor.editor.editdata.EditFxClip
    /* JADX INFO: renamed from: clone */
    public EditorDanmakuInfo mo9886clone() {
        try {
            EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) super.mo9886clone();
            BPointF bPointF = this.pos;
            if (bPointF != null) {
                editorDanmakuInfo.pos = bPointF.m9881clone();
            }
            CaptionInfo.Range range = this.range;
            if (range != null) {
                editorDanmakuInfo.range = range.m9889clone();
            }
            CaptionInfo.Color color = this.color;
            if (color != null) {
                editorDanmakuInfo.color = color.m9888clone();
            }
            editorDanmakuInfo.timelineCaption = this.timelineCaption;
            return editorDanmakuInfo;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public boolean equalsIgnoreTypeItem(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorDanmakuInfo)) {
            return false;
        }
        EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) obj;
        if (this.isCreate != editorDanmakuInfo.isCreate || this.reserveTime != editorDanmakuInfo.reserveTime || this.reserveId != editorDanmakuInfo.reserveId || this.reverseType != editorDanmakuInfo.reverseType || this.titleLimit != editorDanmakuInfo.titleLimit || !Objects.equals(this.subtitle, editorDanmakuInfo.subtitle) || !Objects.equals(this.trackName, editorDanmakuInfo.trackName) || !super.equalsIgnoreId(obj)) {
            z6 = false;
        }
        return z6;
    }

    public boolean isNewCreate() {
        return this.isCreate == 0;
    }
}

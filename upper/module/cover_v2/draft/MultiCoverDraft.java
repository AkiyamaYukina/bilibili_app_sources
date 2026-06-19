package com.bilibili.upper.module.cover_v2.draft;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.upper.module.contribute.up.ui.e;
import com.bilibili.upper.module.cover_v2.model.MultiCoverConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/draft/MultiCoverDraft.class */
@Keep
public class MultiCoverDraft {

    @JSONField(name = "cover_path")
    private String coverPath;

    @JSONField(name = "isTemp")
    private boolean isTemp = false;

    @JSONField(name = "config")
    private MultiCoverConfig config = null;

    @JSONField(name = "coverTransX")
    private double coverTransX = 0.0d;

    @JSONField(name = "coverTransY")
    private double coverTransY = 0.0d;

    @JSONField(name = "coverScaleX")
    private double coverScaleX = 0.0d;

    @JSONField(name = "coverScaleY")
    private double coverScaleY = 0.0d;

    @JSONField(name = "captionList")
    private List<CaptionInfo> captionList = new ArrayList();

    @JSONField(name = "stickerList")
    private List<BiliEditorStickerInfo> stickerList = new ArrayList();

    @JSONField(name = "templateId")
    private int templateId = -10086;

    @JSONField(name = "draft_version")
    private int draftVersion = e.a ? 1 : 0;

    @JSONField(name = "has_edit")
    private boolean hasEdit = false;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MultiCoverDraft m10652clone() {
        return (MultiCoverDraft) JSON.parseObject(JSON.toJSONString(this), MultiCoverDraft.class);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MultiCoverDraft)) {
            return false;
        }
        MultiCoverDraft multiCoverDraftM10652clone = m10652clone();
        MultiCoverDraft multiCoverDraftM10652clone2 = ((MultiCoverDraft) obj).m10652clone();
        MultiCoverConfig multiCoverConfig = multiCoverDraftM10652clone.config;
        if (multiCoverConfig == null || !multiCoverConfig.equals(multiCoverDraftM10652clone2.config)) {
            return false;
        }
        multiCoverDraftM10652clone.config = null;
        multiCoverDraftM10652clone2.config = null;
        return JSON.toJSONString(multiCoverDraftM10652clone).equals(JSON.toJSONString(multiCoverDraftM10652clone2));
    }

    public List<CaptionInfo> getCaptionList() {
        return this.captionList;
    }

    public MultiCoverConfig getConfig() {
        return this.config;
    }

    public String getCoverPath() {
        return this.coverPath;
    }

    public double getCoverScaleX() {
        return this.coverScaleX;
    }

    public double getCoverScaleY() {
        return this.coverScaleY;
    }

    public double getCoverTransX() {
        return this.coverTransX;
    }

    public double getCoverTransY() {
        return this.coverTransY;
    }

    public int getDraftVersion() {
        return this.draftVersion;
    }

    public boolean getHasEdit() {
        return this.hasEdit;
    }

    public List<BiliEditorStickerInfo> getStickerList() {
        return this.stickerList;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        return Objects.hash(this.config, Double.valueOf(this.coverTransX), Double.valueOf(this.coverTransY), Double.valueOf(this.coverScaleX), Double.valueOf(this.coverScaleY), this.captionList, this.stickerList, Integer.valueOf(this.templateId), Integer.valueOf(this.draftVersion), Boolean.valueOf(this.hasEdit));
    }

    public boolean isTemp() {
        return this.isTemp;
    }

    public void setCaptionList(List<CaptionInfo> list) {
        this.captionList = list;
    }

    public void setConfig(MultiCoverConfig multiCoverConfig) {
        this.config = multiCoverConfig;
    }

    public void setCoverPath(String str) {
        this.coverPath = str;
    }

    public void setCoverScaleX(double d7) {
        this.coverScaleX = d7;
    }

    public void setCoverScaleY(double d7) {
        this.coverScaleY = d7;
    }

    public void setCoverTransX(double d7) {
        this.coverTransX = d7;
    }

    public void setCoverTransY(double d7) {
        this.coverTransY = d7;
    }

    public void setDraftVersion(int i7) {
        this.draftVersion = i7;
    }

    public void setHasEdit(boolean z6) {
        this.hasEdit = z6;
    }

    public void setStickerList(List<BiliEditorStickerInfo> list) {
        this.stickerList = list;
    }

    public void setTemp(boolean z6) {
        this.isTemp = z6;
    }

    public void setTemplateId(int i7) {
        this.templateId = i7;
    }
}

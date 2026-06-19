package com.bilibili.upper.module.draft.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/bean/DraftItemBean.class */
@Keep
public class DraftItemBean {

    @Nullable
    public String bCutDraftId;
    public long bgmSid;
    public long createTime;
    public String current;
    public String draftCoverPath;
    public long draftId;
    public String duration;
    public String pic;
    public String pic43;

    @Nullable
    public String sortTitle;
    public String time;
    public String title;
    public long updateTime;

    public String getDraftFrom() {
        return isBCutDraft().booleanValue() ? "必剪编辑器" : "current_upload".equals(this.current) ? "发布页" : ("current_edit".equals(this.current) || "current_video".equals(this.current)) ? "主编辑器" : "";
    }

    public Boolean isBCutDraft() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.bCutDraftId));
    }
}

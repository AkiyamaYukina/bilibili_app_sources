package com.bilibili.studio.videoeditor.template.bean;

import androidx.annotation.Keep;
import g.C7207a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliDraftInfo.class */
@Keep
public class BiliDraftInfo {
    public String cover;
    public long createTime;
    public long duration;
    public String id;
    public long size;
    public String title;
    public long updateTime;

    public BiliDraftInfo() {
        this("", "", 0L, 0L, "", 0L, 0L);
    }

    public BiliDraftInfo(String str, String str2, long j7, long j8, String str3, long j9, long j10) {
        this.id = str;
        this.title = str2;
        this.createTime = j7;
        this.updateTime = j8;
        this.cover = str3;
        this.duration = j9;
        this.size = j10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliDraftInfo{id='");
        sb.append(this.id);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', createTime=");
        sb.append(this.createTime);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", cover='");
        sb.append(this.cover);
        sb.append("', duration=");
        sb.append(this.duration);
        sb.append(", size=");
        return C7207a.a(sb, this.size, '}');
    }
}

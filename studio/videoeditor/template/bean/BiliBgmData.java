package com.bilibili.studio.videoeditor.template.bean;

import androidx.annotation.Keep;
import com.bilibili.app.authorspace.local.service.j;
import g.C7207a;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliBgmData.class */
@Keep
public class BiliBgmData implements Serializable {
    public String bgmId;
    public String bgmName;
    public String bgmPath;
    public long startTime;
    public boolean success;

    public BiliBgmData() {
        this(false, 0L, "", "", 0L);
    }

    public BiliBgmData(boolean z6, long j7, String str, String str2, long j8) {
        this.success = z6;
        this.bgmId = j.a(j7, "");
        this.bgmPath = str;
        this.bgmName = str2;
        this.startTime = j8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliBgmData{success=");
        sb.append(this.success);
        sb.append(", bgmId='");
        sb.append(this.bgmId);
        sb.append("', bgmPath='");
        sb.append(this.bgmPath);
        sb.append("', bgmName='");
        sb.append(this.bgmName);
        sb.append("', startTime=");
        return C7207a.a(sb, this.startTime, '}');
    }
}

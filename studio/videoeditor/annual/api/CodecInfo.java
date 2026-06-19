package com.bilibili.studio.videoeditor.annual.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/api/CodecInfo.class */
@Keep
public class CodecInfo {
    public static final String DEFAULT_PROFILE = "ugcnx/android";
    public static final String NX_PROFILE = "ugcnx/android";
    public long bitRate;
    public boolean fixGop;
    public int frameRate;
    public int gop;

    @JSONField(name = "is_uat")
    public boolean isUat;

    @JSONField(name = "need_sign")
    public boolean needSign;
    public String profile;

    @JSONField(name = "resolutionRate")
    public int resolution;

    public boolean isConfigValid() {
        return !TextUtils.isEmpty(this.profile) && this.bitRate > 0 && this.frameRate > 0 && this.gop > 0 && this.resolution > 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CodecInfo{profile='");
        sb.append(this.profile);
        sb.append("', bitRate=");
        sb.append(this.bitRate);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", gop=");
        sb.append(this.gop);
        sb.append(", resolution=");
        return C3269h.a(sb, this.resolution, '}');
    }
}

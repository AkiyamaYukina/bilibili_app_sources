package com.bilibili.lib.videoupload;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.videoupload.utils.VideoProbeHelper;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/UploadTaskMetaData.class */
@Keep
public class UploadTaskMetaData implements Serializable {

    @Nullable
    public String cid;
    public long costDuration;

    @Nullable
    public String error;

    @Nullable
    public String filename;

    @SerializedName("ijkffmpeg_version")
    @Nullable
    @JSONField(name = "ijkffmpeg_version")
    public String ijkffmpegVersion;

    @Nullable
    @JSONField(name = "meta")
    public VideoProbeHelper.Meta meta;

    @Nullable
    public String path;

    @SerializedName("defender_code")
    @JSONField(name = "defender_code")
    public int defenderCode = -1;

    @SerializedName("probe_code")
    @JSONField(name = "probe_code")
    public int probeCode = 9999;

    @SerializedName("meta_status")
    @JSONField(name = "meta_status")
    public int metaStatus = 1;

    @SerializedName("bvc_version")
    @JSONField(name = "bvc_version")
    public String bvcVersion = "";

    @SerializedName("app_version")
    @JSONField(name = "app_version")
    public String appVersion = "";
    public long fileSize = 0;

    public String getMetaDataJson() {
        try {
            return this.meta != null ? new Gson().toJson(this.meta) : "";
        } catch (Exception e7) {
            e7.printStackTrace();
            return "";
        }
    }
}

package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.Map;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoSmartTitle.class */
@Keep
public class EditVideoSmartTitle implements Serializable {
    public int curUploadRound;

    @Nullable
    public String firstFrameZipUrl;

    @Nullable
    public Map<String, String> recFrameAndTag;
    public int recResultCode;

    @Nullable
    public String recResultMsg;

    @Nullable
    public String smartTitleLabel;
    public int totalUploadRound;

    @Nullable
    public String zipUrls;

    public String toString() {
        StringBuilder sb = new StringBuilder("EditVideoSmartTitle{zipUrls='");
        sb.append(this.zipUrls);
        sb.append("', curUploadRound=");
        sb.append(this.curUploadRound);
        sb.append(", totalUploadRound=");
        sb.append(this.totalUploadRound);
        sb.append(", smartTitleLabel='");
        return C8770a.a(sb, this.smartTitleLabel, "'}");
    }
}

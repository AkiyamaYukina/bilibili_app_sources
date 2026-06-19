package com.bilibili.studio.comm.report.editor.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/report/editor/bean/EditorClipBean.class */
@Keep
public class EditorClipBean {
    public String filePath;
    public boolean isVideo;

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EditorClipBean{isVideo=");
        sb.append(this.isVideo);
        sb.append(", filePath='");
        return C8770a.a(sb, this.filePath, "'}");
    }
}

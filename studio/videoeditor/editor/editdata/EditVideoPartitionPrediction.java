package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoPartitionPrediction.class */
@Keep
public class EditVideoPartitionPrediction implements Serializable {
    public int frameExtractCount;
    public int frameUploadCount;
    public String partitionTaskId;
    public String zipUrl;

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EditVideoPartitionPrediction{partitionTaskId='");
        sb.append(this.partitionTaskId);
        sb.append("', frameExtractCount='");
        sb.append(this.frameExtractCount);
        sb.append("', frameUploadCount='");
        sb.append(this.frameUploadCount);
        sb.append("', zipUrl='");
        return C8770a.a(sb, this.zipUrl, "'}");
    }
}

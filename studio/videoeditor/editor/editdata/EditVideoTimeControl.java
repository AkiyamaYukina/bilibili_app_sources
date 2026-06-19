package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/EditVideoTimeControl.class */
@Keep
public class EditVideoTimeControl {
    private static final long DEFAULT_UPLOAD_VIDEO_DURATION_MIN = 3000000;
    private long mUploadVideoDurationMin = DEFAULT_UPLOAD_VIDEO_DURATION_MIN;

    public long getUploadVideoDurationMin() {
        return this.mUploadVideoDurationMin;
    }

    public void setUploadVideoDurationMin(long j7) {
        this.mUploadVideoDurationMin = j7;
    }
}

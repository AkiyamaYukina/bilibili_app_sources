package com.bilibili.studio.editor.moudle.intelligence.frame.data;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/FrameUploadData.class */
@Keep
public class FrameUploadData {
    public long fileSize;
    public int frameCount;
    public boolean isLastZip;
    public int totalUploadRound;

    @Nullable
    public String zipUrl;

    public FrameUploadData(@Nullable String str, long j7, int i7, boolean z6, int i8) {
        this.zipUrl = str;
        this.fileSize = j7;
        this.frameCount = i7;
        this.isLastZip = z6;
        this.totalUploadRound = i8;
    }
}

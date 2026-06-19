package com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import java.io.File;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/strategy/upload/bean/FrameUploadBean.class */
@Keep
public class FrameUploadBean {

    @Nullable
    public File copyFile;
    public File frameFile;
    public long frameTime;
    public long materialDuration;
    public String materialType;
    public long projectFrameTime;
    public String srcFilePath;
    public long trimIn;
    public long trimOut;

    public static FrameUploadBean createFrameBean(FileTimePart fileTimePart, long j7, File file, long j8) {
        FrameUploadBean frameUploadBean = new FrameUploadBean();
        frameUploadBean.frameFile = file;
        frameUploadBean.srcFilePath = fileTimePart.filePath;
        frameUploadBean.materialType = fileTimePart.isImage() ? "image" : "video";
        frameUploadBean.projectFrameTime = j7;
        long j9 = fileTimePart.trimIn;
        frameUploadBean.trimIn = j9;
        frameUploadBean.trimOut = j9 + fileTimePart.duration;
        frameUploadBean.materialDuration = fileTimePart.realDuration;
        frameUploadBean.frameTime = j8;
        return frameUploadBean;
    }
}

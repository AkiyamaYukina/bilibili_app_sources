package com.bilibili.montage.avutil;

import com.bilibili.montage.avinfo.MontageAVFileInfo;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageSize;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avutil/MontageParseFile.class */
public class MontageParseFile {
    private static final String TAG = "MontageParseFile";

    private native MontageAVFileInfo nativeGetFileInfo(String str);

    public MontageAVFileInfo getAVFileInfo(String str) {
        if (str != null) {
            return nativeGetFileInfo(str);
        }
        LogSinker.e(TAG, "Mon.Java. getAVFileInfo, avFilePath is null");
        return null;
    }

    public MontageRational getVideoFrameRate(String str) {
        MontageAVFileInfo aVFileInfo = getAVFileInfo(str);
        return aVFileInfo.getVideoStreamCount() > 0 ? aVFileInfo.getVideoStreamFrameRate(0) : new MontageRational();
    }

    public MontageSize getVideoSize(String str) {
        MontageAVFileInfo aVFileInfo = getAVFileInfo(str);
        return aVFileInfo.getVideoStreamCount() > 0 ? aVFileInfo.getVideoStreamDimension(0) : new MontageSize();
    }

    public int getVideoStreamRotation(String str) {
        MontageAVFileInfo aVFileInfo = getAVFileInfo(str);
        if (aVFileInfo.getVideoStreamCount() > 0) {
            return aVFileInfo.getVideoStreamRotation(0);
        }
        return 0;
    }
}

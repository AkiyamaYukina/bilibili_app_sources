package com.bilibili.studio.videoeditor.editor.editdata;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/FileInfo.class */
@Keep
public class FileInfo {
    private int mBizFrom;
    private String mFilePath;

    public FileInfo() {
        this.mFilePath = "";
    }

    public FileInfo(String str) {
        this.mFilePath = str == null ? "" : str;
    }

    public FileInfo(@Nullable String str, int i7) {
        if (!TextUtils.isEmpty(str)) {
            this.mFilePath = str;
        }
        this.mBizFrom = i7;
    }

    public int getBizFrom() {
        return this.mBizFrom;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public void setBizFrom(int i7) {
        this.mBizFrom = i7;
    }

    public void setFilePath(String str) {
        this.mFilePath = str;
    }
}

package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/RecordVR.class */
@Keep
public class RecordVR {
    private List<String> recordLPathist;
    private String videoPath;

    public RecordVR() {
    }

    public RecordVR(String str, List<String> list) {
        this.videoPath = str;
        this.recordLPathist = list;
    }

    public List<String> getRecordLPathist() {
        return this.recordLPathist;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public void setRecordLPathist(List<String> list) {
        this.recordLPathist = list;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }
}

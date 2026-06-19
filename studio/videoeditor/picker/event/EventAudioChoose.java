package com.bilibili.studio.videoeditor.picker.event;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/event/EventAudioChoose.class */
@Keep
public class EventAudioChoose implements Serializable {
    public String name;
    public String path;
    public long seekTime;

    public EventAudioChoose() {
    }

    public EventAudioChoose(String str, String str2, long j7) {
        this.path = str;
        this.name = str2;
        this.seekTime = j7;
    }
}

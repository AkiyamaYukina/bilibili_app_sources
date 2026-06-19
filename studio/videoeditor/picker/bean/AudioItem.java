package com.bilibili.studio.videoeditor.picker.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/bean/AudioItem.class */
@Keep
public class AudioItem implements Serializable, Cloneable {
    public long addTime;
    public int albumId;
    public String albumPath;
    public String artist;
    public long duration;
    public String mimeType;
    public String name;
    public String path;
    public long size;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AudioItem m10490clone() {
        try {
            return (AudioItem) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioItem)) {
            return super.equals(obj);
        }
        AudioItem audioItem = (AudioItem) obj;
        return this.path.equalsIgnoreCase(audioItem.path) && this.addTime == audioItem.addTime;
    }
}

package com.bilibili.studio.videoeditor.picker.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/bean/ImageItem.class */
@Keep
public class ImageItem implements Serializable {
    public long addTime;
    public long duration;
    public int height;
    public String mimeType;
    public String name;
    public String path;
    public long size;
    public int width;

    public boolean equals(Object obj) {
        if (!(obj instanceof ImageItem)) {
            return super.equals(obj);
        }
        ImageItem imageItem = (ImageItem) obj;
        return this.path.equalsIgnoreCase(imageItem.path) && this.addTime == imageItem.addTime;
    }
}

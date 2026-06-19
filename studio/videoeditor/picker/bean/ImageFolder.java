package com.bilibili.studio.videoeditor.picker.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/bean/ImageFolder.class */
@Keep
public class ImageFolder implements Serializable {
    public int childrenSize;
    public String coverPath;
    public ArrayList<ImageItem> images;
    public String name;
    public String path;

    public boolean equals(Object obj) {
        return this.path.equalsIgnoreCase(((ImageFolder) obj).path);
    }

    public String toString() {
        return this.path;
    }
}

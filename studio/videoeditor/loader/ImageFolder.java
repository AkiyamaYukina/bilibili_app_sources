package com.bilibili.studio.videoeditor.loader;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/loader/ImageFolder.class */
@Keep
public class ImageFolder implements Serializable {
    public int allImageCount = 0;
    public int allVideoCount = 0;
    public ImageItem cover;
    public ArrayList<ImageItem> images;
    public boolean isAllDic;
    public String name;
    public String path;

    public boolean equals(Object obj) {
        return this.path.equalsIgnoreCase(((ImageFolder) obj).path);
    }

    public String toString() {
        return this.path;
    }
}

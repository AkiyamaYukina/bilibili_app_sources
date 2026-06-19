package com.bilibili.studio.editor.moudle.sticker.v1;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/MediaFile.class */
@Keep
public class MediaFile {
    public long dateAdded;
    public int height;
    public String id;
    public long size;
    public int width;
    public String displayName = "";
    public String filePath = "";
    public String mimeType = "";
    public String uri = "";

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaFile)) {
            return super.equals(obj);
        }
        MediaFile mediaFile = (MediaFile) obj;
        return this.filePath.equals(mediaFile.filePath) && this.dateAdded == mediaFile.dateAdded;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public String toString() {
        return this.filePath;
    }
}

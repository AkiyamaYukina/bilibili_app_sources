package com.bilibili.studio.editor.moudle.sticker.v1;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/MediaDirectory.class */
@Keep
public class MediaDirectory extends MediaFile {
    public static final int TYPE_ALL_DIR = 1;
    public static final int TYPE_DEFAULT = 0;
    public MediaFile cover;
    public List<MediaFile> mediaFileList;
    public int type = 0;

    @Override // com.bilibili.studio.editor.moudle.sticker.v1.MediaFile
    public boolean equals(Object obj) {
        return this == obj;
    }
}

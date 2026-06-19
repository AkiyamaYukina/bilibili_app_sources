package com.bilibili.studio.editor.moudle.material.data;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/data/MediaMaterialItem.class */
@Keep
public class MediaMaterialItem {

    @Nullable
    public List<String> boundClipList;

    @Nullable
    public List<BoundCaption> captionList;
    public MediaMaterialBean materialBean;
    public String materialId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/data/MediaMaterialItem$BoundCaption.class */
    @Keep
    public static class BoundCaption {
        public String boundId;
        public String content;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/data/MediaMaterialItem$MediaMaterialBean.class */
    @Keep
    public static class MediaMaterialBean {
        public long duration;
        public String fileName;
        public String filePath;
        public int height;
        public String mimeType;
        public int width;

        public boolean isImage() {
            return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("image");
        }

        public boolean isVideo() {
            return !TextUtils.isEmpty(this.mimeType) && this.mimeType.startsWith("video");
        }
    }
}

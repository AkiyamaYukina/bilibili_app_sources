package com.bilibili.studio.template.data;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/template/data/EditorMediaItem.class */
@Keep
public class EditorMediaItem implements Serializable {

    @Nullable
    public String authorAvatar = "";

    @Nullable
    public String authorName = "";
    public String cover;
    public int dataSource;
    public String discription;
    public long duration;
    public long footageDuration;
    public String footageId;
    public String mimeType;
    public String path;
    public double speed;
    public long trimEnd;
    public long trimIn;
    public long trimOut;
    public long trimStart;

    public EditorMediaItem() {
    }

    public EditorMediaItem(String str) {
        this.path = str;
    }
}

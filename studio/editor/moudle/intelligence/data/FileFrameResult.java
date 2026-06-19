package com.bilibili.studio.editor.moudle.intelligence.data;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/FileFrameResult.class */
@Keep
public class FileFrameResult {
    public String filePath;

    @Nullable
    public List<File> frameList;
    public int rotation;

    @Nullable
    public Map<String, String> tagResult;

    public void addFrameAndTag(String str, String str2) {
        if (this.tagResult == null) {
            this.tagResult = new HashMap();
        }
        this.tagResult.put(str, str2);
    }
}

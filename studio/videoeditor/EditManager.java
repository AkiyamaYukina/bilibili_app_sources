package com.bilibili.studio.videoeditor;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EditManager.class */
@Keep
public class EditManager {
    public static final String KEY_FROM_CLIP_VIDEO = "small_video";
    private static EditManager editManager;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EditManager$EnterInfo.class */
    @Keep
    public static class EnterInfo implements Serializable {
        public List<FileInfo> files;
        public String from;
        public ModelShow modelShow;
        public TimeLimit timeLimit;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EditManager$FileInfo.class */
    @Keep
    public static class FileInfo implements Serializable {
        public int bizFrom;
        public String filePath;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EditManager$ModelShow.class */
    @Keep
    public static class ModelShow implements Serializable {
        public boolean caption;
        public boolean filter;
        public boolean record;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/EditManager$TimeLimit.class */
    @Keep
    public static class TimeLimit implements Serializable {
        public long clipMax;
        public long min;
    }

    public static EditManager getInstance() {
        EditManager editManager2;
        synchronized (EditManager.class) {
            try {
                if (editManager == null) {
                    editManager = new EditManager();
                }
                editManager2 = editManager;
            } catch (Throwable th) {
                throw th;
            }
        }
        return editManager2;
    }
}

package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/MultiPArchive.class */
@Keep
public class MultiPArchive implements Serializable {
    public int archiveStatusIndex;
    public boolean dragging;
    public String editTitle;
    public String filePath = "";
    public long id;

    @Nullable
    public String infoJson;
    public String interceptStrategyJson;
    public int progress;
    public String requestAddJson;
    public String title;
    public int type;
    public long uploadTaskId;
    public String uploadTaskMetaDataJson;
}

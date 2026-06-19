package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/EditUseInfo.class */
@Keep
public class EditUseInfo implements Serializable {
    public List<Integer> captionFontIds;
    public List<Integer> captionTempIds;
    public List<Integer> filterIds;
    public boolean fromAIStory;
    public boolean fromCamera;
    public List<Long> musicIds;
    public int oneClickVideo;
    public int picCount;
    public int smartToVideo;
    public List<Integer> stickerIds;
    public List<Integer> themeIds;
    public List<Integer> transIds;
    public boolean useRecord;
    public boolean useSpeed;
    public int videoCount;
}

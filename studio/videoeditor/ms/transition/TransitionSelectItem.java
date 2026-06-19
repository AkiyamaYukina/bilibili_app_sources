package com.bilibili.studio.videoeditor.ms.transition;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/transition/TransitionSelectItem.class */
@Keep
public class TransitionSelectItem {
    public static final int NONE_ID = -1;
    public String coverUrl;
    public String downloadUrl;
    public int id;
    public boolean isSelected;
    public String name;
    public int overlap;
    public int rank;
    public int resState;
    public int tabIndex = -1;
    public String transitionFile;
    public String transitionFileLic;
    public String uuid;

    public boolean isNoneItem() {
        return this.id == -1;
    }
}

package com.bilibili.studio.videoeditor.widgets.track.cover;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/widgets/track/cover/ViewTransitionItem.class */
@Keep
public class ViewTransitionItem implements Serializable {
    public String imgUrl;
    public boolean isSelected;
    public String nextBClipId;
    public int overlap;
    public int posInRv;
    public String preBClipId;
    public String transitionUUID;
    public int selectId = -1;
    public int roleInTheme = 0;
    public boolean isFakeClip = false;

    public ViewTransitionItem(String str, String str2) {
        this.preBClipId = str;
        this.nextBClipId = str2;
    }
}

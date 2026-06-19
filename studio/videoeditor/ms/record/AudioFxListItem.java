package com.bilibili.studio.videoeditor.ms.record;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/record/AudioFxListItem.class */
@Keep
public class AudioFxListItem implements Serializable {
    public String fxID;
    public int index;
    public String nameCH;
    public boolean selected = false;
    public boolean enable = true;
}

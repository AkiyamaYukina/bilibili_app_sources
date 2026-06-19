package com.bilibili.studio.videoeditor.bgm;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.picker.bean.AudioItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmLocalEntry.class */
@Keep
public class BgmLocalEntry {
    AudioItem audioItem;
    boolean checked;
    boolean isPlaying = false;

    public BgmLocalEntry(AudioItem audioItem) {
        this.audioItem = audioItem;
    }
}

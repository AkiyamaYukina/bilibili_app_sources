package com.bilibili.studio.editor.moudle.music.common;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.bean.BMusic;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/common/EditorMusicInfo.class */
@Keep
public class EditorMusicInfo implements Serializable {
    public ArrayList<BMusic> bMusicList = new ArrayList<>();
    public BMusic selectMusic;
    public BMusic themeMusic;

    public String toString() {
        return "EditorMusicInfo{bMusicList=" + this.bMusicList + '}';
    }
}

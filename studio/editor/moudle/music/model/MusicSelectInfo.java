package com.bilibili.studio.editor.moudle.music.model;

import O4.a;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/model/MusicSelectInfo.class */
@Keep
public class MusicSelectInfo {
    public boolean localMusic = false;
    public int localPosition;
    public int onlinePosition;
    public int tabPosition;

    public String toString() {
        StringBuilder sb = new StringBuilder("MusicSelectInfo{onlinePosition=");
        sb.append(this.onlinePosition);
        sb.append(", localPosition=");
        sb.append(this.localPosition);
        sb.append(", tabPosition=");
        sb.append(this.tabPosition);
        sb.append(", localMusic=");
        return a.b(sb, this.localMusic, '}');
    }
}

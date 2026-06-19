package com.bilibili.studio.editor.moudle.intelligence.frame.data;

import androidx.annotation.Keep;
import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/data/CalFrameTime.class */
@Keep
public class CalFrameTime {
    public int round;
    public long time;

    public CalFrameTime(long j7, int i7) {
        this.time = j7;
        this.round = i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CalFrameTime{time=");
        sb.append(this.time);
        sb.append(", round=");
        return C3269h.a(sb, this.round, '}');
    }
}

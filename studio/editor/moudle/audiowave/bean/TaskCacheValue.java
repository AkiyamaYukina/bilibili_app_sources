package com.bilibili.studio.editor.moudle.audiowave.bean;

import Vw0.b;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/audiowave/bean/TaskCacheValue.class */
@Keep
public class TaskCacheValue {
    public final ArrayList<b> callbackList;
    public String filePath;
    public long samplesPerGroup;

    public TaskCacheValue(String str, long j7, b bVar) {
        ArrayList<b> arrayList = new ArrayList<>();
        this.callbackList = arrayList;
        this.filePath = str;
        this.samplesPerGroup = j7;
        arrayList.add(bVar);
    }

    public void addCallback(b bVar) {
        this.callbackList.add(bVar);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskCacheValue taskCacheValue = (TaskCacheValue) obj;
        if (this.samplesPerGroup != taskCacheValue.samplesPerGroup || !Objects.equals(this.filePath, taskCacheValue.filePath)) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        return Objects.hash(this.filePath);
    }
}

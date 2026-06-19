package com.bilibili.studio.editor.moudle.caption.tts.bean;

import O4.c;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/tts/bean/TtsTask.class */
@Keep
public final class TtsTask {
    private final long taskId;
    private final int taskType;

    public TtsTask(long j7, int i7) {
        this.taskId = j7;
        this.taskType = i7;
    }

    public static /* synthetic */ TtsTask copy$default(TtsTask ttsTask, long j7, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = ttsTask.taskId;
        }
        if ((i8 & 2) != 0) {
            i7 = ttsTask.taskType;
        }
        return ttsTask.copy(j7, i7);
    }

    public final long component1() {
        return this.taskId;
    }

    public final int component2() {
        return this.taskType;
    }

    @NotNull
    public final TtsTask copy(long j7, int i7) {
        return new TtsTask(j7, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsTask)) {
            return false;
        }
        TtsTask ttsTask = (TtsTask) obj;
        return this.taskId == ttsTask.taskId && this.taskType == ttsTask.taskType;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public int hashCode() {
        return Integer.hashCode(this.taskType) + (Long.hashCode(this.taskId) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbB = c.b(this.taskType, this.taskId, "TtsTask(taskId=", ", taskType=");
        sbB.append(")");
        return sbB.toString();
    }
}

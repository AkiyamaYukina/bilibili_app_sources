package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.k;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRRenderResult.class */
@Keep
public final class GRRenderResult {
    private long taskId;

    @JSONCreator
    public GRRenderResult(@JSONField(name = "taskId") long j7) {
        this.taskId = j7;
    }

    public static /* synthetic */ GRRenderResult copy$default(GRRenderResult gRRenderResult, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = gRRenderResult.taskId;
        }
        return gRRenderResult.copy(j7);
    }

    public final long component1() {
        return this.taskId;
    }

    @NotNull
    public final GRRenderResult copy(@JSONField(name = "taskId") long j7) {
        return new GRRenderResult(j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GRRenderResult) && this.taskId == ((GRRenderResult) obj).taskId;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return Long.hashCode(this.taskId);
    }

    public final void setTaskId(long j7) {
        this.taskId = j7;
    }

    @NotNull
    public String toString() {
        return k.a(this.taskId, "GRRenderResult(taskId=", ")");
    }
}

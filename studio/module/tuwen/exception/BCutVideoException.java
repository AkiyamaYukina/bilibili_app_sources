package com.bilibili.studio.module.tuwen.exception;

import androidx.annotation.Keep;
import com.bilibili.studio.module.tuwen.model.BCutVideoTaskInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/exception/BCutVideoException.class */
@Keep
public final class BCutVideoException extends Exception {
    private int code;

    @NotNull
    private String msg;

    @NotNull
    private ArrayList<BCutVideoTaskInfo> taskInfoList;

    public BCutVideoException(@NotNull Throwable th) {
        super(th);
        this.taskInfoList = new ArrayList<>();
        this.msg = "";
        String message = th.getMessage();
        this.msg = message == null ? "" : message;
    }

    public BCutVideoException(@NotNull ArrayList<BCutVideoTaskInfo> arrayList, int i7, @NotNull String str) {
        new ArrayList();
        this.taskInfoList = arrayList;
        this.code = i7;
        this.msg = str;
    }

    public /* synthetic */ BCutVideoException(ArrayList arrayList, int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? new ArrayList() : arrayList, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? "" : str);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final ArrayList<BCutVideoTaskInfo> getTaskInfoList() {
        return this.taskInfoList;
    }

    public final void setCode(int i7) {
        this.code = i7;
    }

    public final void setMsg(@NotNull String str) {
        this.msg = str;
    }

    public final void setTaskInfoList(@NotNull ArrayList<BCutVideoTaskInfo> arrayList) {
        this.taskInfoList = arrayList;
    }
}

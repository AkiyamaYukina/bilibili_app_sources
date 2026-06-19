package com.bilibili.studio.videoeditor.template.exception;

import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.template.bean.BiliVideoTaskInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/exception/BiliVideoException.class */
@Keep
public final class BiliVideoException extends Exception {
    private final int code;

    @NotNull
    private final String msg;

    @NotNull
    private final ArrayList<BiliVideoTaskInfo> taskInfoList;

    public BiliVideoException(@NotNull ArrayList<BiliVideoTaskInfo> arrayList, int i7, @NotNull String str) {
        super(str);
        this.taskInfoList = arrayList;
        this.code = i7;
        this.msg = str;
    }

    public /* synthetic */ BiliVideoException(ArrayList arrayList, int i7, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i8 & 2) != 0 ? 0 : i7, str);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final ArrayList<BiliVideoTaskInfo> getTaskInfoList() {
        return this.taskInfoList;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        ArrayList<BiliVideoTaskInfo> arrayList = this.taskInfoList;
        int i7 = this.code;
        String str = this.msg;
        StringBuilder sb = new StringBuilder("BiliVideoException(taskInfoList=");
        sb.append(arrayList);
        sb.append(", code=");
        sb.append(i7);
        sb.append(", msg='");
        return C8770a.a(sb, str, "')");
    }
}

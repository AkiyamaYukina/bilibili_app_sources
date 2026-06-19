package com.bilibili.studio.comm.material.task;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/task/MaterialTaskStatus.class */
public final class MaterialTaskStatus {
    private static final EnumEntries $ENTRIES;
    private static final MaterialTaskStatus[] $VALUES;
    private final int value;
    public static final MaterialTaskStatus STATUS_INIT = new MaterialTaskStatus("STATUS_INIT", 0, 0);
    public static final MaterialTaskStatus STATUS_UPLOAD = new MaterialTaskStatus("STATUS_UPLOAD", 1, 1);
    public static final MaterialTaskStatus STATUS_REPORT = new MaterialTaskStatus("STATUS_REPORT", 2, 2);
    public static final MaterialTaskStatus STATUS_FINISH = new MaterialTaskStatus("STATUS_FINISH", 3, 3);
    public static final MaterialTaskStatus STATUS_FAIL = new MaterialTaskStatus("STATUS_FAIL", 4, 4);

    private static final /* synthetic */ MaterialTaskStatus[] $values() {
        return new MaterialTaskStatus[]{STATUS_INIT, STATUS_UPLOAD, STATUS_REPORT, STATUS_FINISH, STATUS_FAIL};
    }

    static {
        MaterialTaskStatus[] materialTaskStatusArr$values = $values();
        $VALUES = materialTaskStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(materialTaskStatusArr$values);
    }

    private MaterialTaskStatus(String str, int i7, int i8) {
        this.value = i8;
    }

    @NotNull
    public static EnumEntries<MaterialTaskStatus> getEntries() {
        return $ENTRIES;
    }

    public static MaterialTaskStatus valueOf(String str) {
        return (MaterialTaskStatus) Enum.valueOf(MaterialTaskStatus.class, str);
    }

    public static MaterialTaskStatus[] values() {
        return (MaterialTaskStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getStatusStr() {
        int i7 = this.value;
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "未知的" : "采集失败" : "采集完成" : "信息上报" : "素材上传" : "初始化";
    }

    public final int getValue() {
        return this.value;
    }
}

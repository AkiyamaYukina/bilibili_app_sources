package com.bilibili.studio.editor.moudle.music.manager.musicrec;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/musicrec/MaterialLabelError.class */
public final class MaterialLabelError {
    private static final EnumEntries $ENTRIES;
    private static final MaterialLabelError[] $VALUES;
    private final int errorCode;

    @NotNull
    private final String errorMsg;
    public static final MaterialLabelError SUCCESS_READY = new MaterialLabelError("SUCCESS_READY", 0, 0, "");
    public static final MaterialLabelError ERROR_MOD_DOWNLOAD = new MaterialLabelError("ERROR_MOD_DOWNLOAD", 1, 1, "mod下载失败");
    public static final MaterialLabelError ERROR_MOD_DIR = new MaterialLabelError("ERROR_MOD_DIR", 2, 2, "mod路径获取失败");
    public static final MaterialLabelError ERROR_SDK_INIT = new MaterialLabelError("ERROR_SDK_INIT", 3, 3, "SDK初始化失败");
    public static final MaterialLabelError ERROR_SDK_REC = new MaterialLabelError("ERROR_SDK_REC", 4, 4, "画面识别失败");
    public static final MaterialLabelError ERROR_FRAME_EMPTY = new MaterialLabelError("ERROR_FRAME_EMPTY", 5, 5, "取帧失败");

    private static final /* synthetic */ MaterialLabelError[] $values() {
        return new MaterialLabelError[]{SUCCESS_READY, ERROR_MOD_DOWNLOAD, ERROR_MOD_DIR, ERROR_SDK_INIT, ERROR_SDK_REC, ERROR_FRAME_EMPTY};
    }

    static {
        MaterialLabelError[] materialLabelErrorArr$values = $values();
        $VALUES = materialLabelErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(materialLabelErrorArr$values);
    }

    private MaterialLabelError(String str, int i7, int i8, String str2) {
        this.errorCode = i8;
        this.errorMsg = str2;
    }

    @NotNull
    public static EnumEntries<MaterialLabelError> getEntries() {
        return $ENTRIES;
    }

    public static MaterialLabelError valueOf(String str) {
        return (MaterialLabelError) Enum.valueOf(MaterialLabelError.class, str);
    }

    public static MaterialLabelError[] values() {
        return (MaterialLabelError[]) $VALUES.clone();
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }
}

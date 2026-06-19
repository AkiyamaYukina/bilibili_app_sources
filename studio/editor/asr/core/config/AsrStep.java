package com.bilibili.studio.editor.asr.core.config;

import com.bilibili.lib.tf.TfCode;
import com.tencent.map.geolocation.TencentLocationRequest;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/config/AsrStep.class */
public final class AsrStep {
    private static final EnumEntries $ENTRIES;
    private static final AsrStep[] $VALUES;

    @NotNull
    private String msg;
    private int stepMask;
    public static final AsrStep INIT_TASK = new AsrStep("INIT_TASK", 0, 1000, "init asr");
    public static final AsrStep UPLOAD_APPLY_RESOURCE = new AsrStep("UPLOAD_APPLY_RESOURCE", 1, 2000, "upload apply resource");
    public static final AsrStep UPLOAD_CHUNK = new AsrStep("UPLOAD_CHUNK", 2, 3000, "upload chunk");
    public static final AsrStep UPLOAD_COMPLETE = new AsrStep("UPLOAD_COMPLETE", 3, 4000, "upload complete");
    public static final AsrStep START_REMOTE_TASK = new AsrStep("START_REMOTE_TASK", 4, 5000, "create task");
    public static final AsrStep QUERY_FAST_REMOTE_TASK = new AsrStep("QUERY_FAST_REMOTE_TASK", 5, TfCode.UNICOM_CDN_URL_EMPTY_VALUE, "query fast result");
    public static final AsrStep QUERY_REMOTE_TASK = new AsrStep("QUERY_REMOTE_TASK", 6, 6000, "query result");
    public static final AsrStep DELETE_REMOTE_TASK = new AsrStep("DELETE_REMOTE_TASK", 7, 7000, "delete task");
    public static final AsrStep FINISH_TASK = new AsrStep("FINISH_TASK", 8, TencentLocationRequest.ONLY_GPS_TIME_OUT, "finish");

    private static final /* synthetic */ AsrStep[] $values() {
        return new AsrStep[]{INIT_TASK, UPLOAD_APPLY_RESOURCE, UPLOAD_CHUNK, UPLOAD_COMPLETE, START_REMOTE_TASK, QUERY_FAST_REMOTE_TASK, QUERY_REMOTE_TASK, DELETE_REMOTE_TASK, FINISH_TASK};
    }

    static {
        AsrStep[] asrStepArr$values = $values();
        $VALUES = asrStepArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(asrStepArr$values);
    }

    private AsrStep(String str, int i7, int i8, String str2) {
        this.stepMask = i8;
        this.msg = str2;
    }

    @NotNull
    public static EnumEntries<AsrStep> getEntries() {
        return $ENTRIES;
    }

    public static AsrStep valueOf(String str) {
        return (AsrStep) Enum.valueOf(AsrStep.class, str);
    }

    public static AsrStep[] values() {
        return (AsrStep[]) $VALUES.clone();
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final int getStepMask() {
        return this.stepMask;
    }

    public final void setMsg(@NotNull String str) {
        this.msg = str;
    }

    public final void setStepMask(int i7) {
        this.stepMask = i7;
    }
}

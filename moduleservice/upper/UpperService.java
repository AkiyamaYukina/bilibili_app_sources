package com.bilibili.moduleservice.upper;

import android.content.Context;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/upper/UpperService.class */
public interface UpperService {
    void checkAndUploadDrafts();

    void clearUpper(@NotNull Context context);

    @NotNull
    String collectForEditorHomeAct();

    void deleteDraft(@NotNull Context context, long j7);

    boolean hasDraft(@NotNull Context context);

    @NotNull
    String queryArchiveTaskStatus();

    @Nullable
    String queryDraft(@NotNull Context context, long j7);

    default void reportUploadLocalData() {
    }

    boolean saveDraft(@NotNull Context context, @NotNull Bundle bundle);
}

package com.bilibili.moduleservice.share;

import android.os.Bundle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/share/DynamicCallbackService.class */
public interface DynamicCallbackService {
    void onCallback(@Nullable String str, @Nullable Bundle bundle);

    void registerCallback(@Nullable String str, @Nullable ShareDynamicCallback shareDynamicCallback);

    void unregisterCallback(@Nullable String str);
}

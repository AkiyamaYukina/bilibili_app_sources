package com.bilibili.studio.module.ugc.consumerV2;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/ugc/consumerV2/ContextUtilsKt.class */
public final class ContextUtilsKt {
    @Nullable
    public static final Lifecycle getLifecycle(@Nullable Context context) {
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).getLifecycle();
    }
}

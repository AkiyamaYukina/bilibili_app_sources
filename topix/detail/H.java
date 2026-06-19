package com.bilibili.topix.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.topix.d;
import com.bilibili.app.comm.list.common.topix.e;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/H.class */
@StabilityInferred(parameters = 1)
public final class H implements e {
    @NotNull
    public final KClass<? extends d> getClazz() {
        return Reflection.getOrCreateKotlinClass(TopixDetailViewModel.class);
    }
}

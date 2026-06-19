package com.bilibili.ogv.infra.violet;

import com.bilibili.bus.IData;
import com.bilibili.bus.Violet;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/violet/c.class */
public final class c {
    @NotNull
    public static final <T extends IData> Flow<T> a(@NotNull Class<T> cls) {
        return FlowKt.callbackFlow(new VioletExtKt$asFlow$1(Violet.INSTANCE.ofChannel(cls), null));
    }

    @NotNull
    public static final <T extends IData> Flow<T> b(@NotNull KClass<T> kClass) {
        return FlowKt.callbackFlow(new VioletExtKt$asFlow$1(Violet.INSTANCE.ofChannel(JvmClassMappingKt.getJavaClass(kClass)), null));
    }
}

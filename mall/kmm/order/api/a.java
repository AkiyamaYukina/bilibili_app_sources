package com.bilibili.mall.kmm.order.api;

import com.bilibili.bililive.room.biz.shopping.viewmodel.H;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/api/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SerializersModule f65632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Json f65633b;

    public a() {
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(Object.class), com.bilibili.mall.kmm.common.a.f65587a);
        this.f65632a = serializersModuleBuilder.build();
        this.f65633b = JsonKt.Json$default((Json) null, new H(this, 2), 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull java.util.Map r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.order.api.a.a(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

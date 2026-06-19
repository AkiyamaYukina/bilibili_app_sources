package com.bilibili.ogv.pub.reserve;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheStorage.class */
public final class VipReserveCacheStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final VipReserveCacheStorage f71656a = new Object();

    @Nullable
    public static Object a(@NotNull ContinuationImpl continuationImpl) {
        return BuildersKt.withContext(Dispatchers.getIO(), new VipReserveCacheStorage$queryAllAsync$2(null), continuationImpl);
    }

    @NotNull
    public static Flow c() {
        return FlowKt.catch(VipReserveDatabase.f71657a.e().i(), new VipReserveCacheStorage$watchAll$1(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.Nullable java.lang.Boolean r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.pub.reserve.VipReserveCacheStorage.b(java.lang.Boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

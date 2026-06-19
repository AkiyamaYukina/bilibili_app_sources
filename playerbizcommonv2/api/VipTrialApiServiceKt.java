package com.bilibili.playerbizcommonv2.api;

import M3.C2612q1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/VipTrialApiServiceKt.class */
public final class VipTrialApiServiceKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f80817a = LazyKt.lazy(new C2612q1(6));

    public static final void a(@NotNull vk.e eVar, @Nullable Long l7) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new VipTrialApiServiceKt$requestDecrementTrialTimes$1(eVar, l7, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(@org.jetbrains.annotations.NotNull vk.e r6, @org.jetbrains.annotations.Nullable java.lang.Long r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.api.VipTrialApiServiceKt.b(vk.e, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

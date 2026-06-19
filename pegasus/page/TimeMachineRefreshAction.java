package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachineRefreshAction.class */
@StabilityInferred(parameters = 0)
public final class TimeMachineRefreshAction implements com.bilibili.pegasus.n<C8028c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lp0.c f78353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.request.i f78354b;

    public TimeMachineRefreshAction(@NotNull lp0.c cVar, @NotNull com.bilibili.pegasus.request.i iVar) {
        this.f78353a = cVar;
        this.f78354b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0103 A[Catch: Exception -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0057, B:34:0x00d4, B:36:0x00e5, B:38:0x00f4, B:39:0x0103, B:29:0x00b3), top: B:43:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.Store<mp0.C8028c> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.pegasus.Action> r13) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.TimeMachineRefreshAction.a(com.bilibili.pegasus.Store, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeMachineRefreshAction)) {
            return false;
        }
        TimeMachineRefreshAction timeMachineRefreshAction = (TimeMachineRefreshAction) obj;
        return Intrinsics.areEqual(this.f78353a, timeMachineRefreshAction.f78353a) && Intrinsics.areEqual(this.f78354b, timeMachineRefreshAction.f78354b);
    }

    public final int hashCode() {
        return this.f78354b.hashCode() + (this.f78353a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeMachineRefreshAction(requestParam=" + this.f78353a + ", parser=" + this.f78354b + ")";
    }
}

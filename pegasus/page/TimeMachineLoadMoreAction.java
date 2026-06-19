package com.bilibili.pegasus.page;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachineLoadMoreAction.class */
@StabilityInferred(parameters = 0)
public final class TimeMachineLoadMoreAction implements com.bilibili.pegasus.n<C8028c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lp0.c f78318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.request.i f78319b;

    public TimeMachineLoadMoreAction(@NotNull lp0.c cVar, @NotNull com.bilibili.pegasus.request.i iVar) {
        this.f78318a = cVar;
        this.f78319b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[Catch: Exception -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0057, B:38:0x0100, B:40:0x0111, B:42:0x0120, B:43:0x012c, B:33:0x00df), top: B:47:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.Store<mp0.C8028c> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.pegasus.Action> r13) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.TimeMachineLoadMoreAction.a(com.bilibili.pegasus.Store, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeMachineLoadMoreAction)) {
            return false;
        }
        TimeMachineLoadMoreAction timeMachineLoadMoreAction = (TimeMachineLoadMoreAction) obj;
        return Intrinsics.areEqual(this.f78318a, timeMachineLoadMoreAction.f78318a) && Intrinsics.areEqual(this.f78319b, timeMachineLoadMoreAction.f78319b);
    }

    public final int hashCode() {
        return this.f78319b.hashCode() + (this.f78318a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TimeMachineLoadMoreAction(requestParam=" + this.f78318a + ", parser=" + this.f78319b + ")";
    }
}

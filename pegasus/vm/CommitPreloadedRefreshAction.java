package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/CommitPreloadedRefreshAction.class */
@StabilityInferred(parameters = 0)
public final class CommitPreloadedRefreshAction implements com.bilibili.pegasus.n<C8028c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lp0.c f78998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.request.i f78999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Deferred<Action> f79000c;

    public CommitPreloadedRefreshAction(@NotNull lp0.c cVar, @NotNull com.bilibili.pegasus.request.i iVar, @NotNull Deferred<? extends Action> deferred) {
        this.f78998a = cVar;
        this.f78999b = iVar;
        this.f79000c = deferred;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.Store<mp0.C8028c> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.pegasus.Action> r11) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.CommitPreloadedRefreshAction.a(com.bilibili.pegasus.Store, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitPreloadedRefreshAction)) {
            return false;
        }
        CommitPreloadedRefreshAction commitPreloadedRefreshAction = (CommitPreloadedRefreshAction) obj;
        return Intrinsics.areEqual(this.f78998a, commitPreloadedRefreshAction.f78998a) && Intrinsics.areEqual(this.f78999b, commitPreloadedRefreshAction.f78999b) && Intrinsics.areEqual(this.f79000c, commitPreloadedRefreshAction.f79000c);
    }

    public final int hashCode() {
        int iHashCode = this.f78998a.hashCode();
        return this.f79000c.hashCode() + ((this.f78999b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommitPreloadedRefreshAction(requestParam=" + this.f78998a + ", parser=" + this.f78999b + ", preloadedAction=" + this.f79000c + ")";
    }
}

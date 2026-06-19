package com.bilibili.pegasus.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import mp0.C8028c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/LoadMoreAction.class */
@StabilityInferred(parameters = 0)
public final class LoadMoreAction implements com.bilibili.pegasus.n<C8028c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final lp0.c f79007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.request.i f79008b;

    public LoadMoreAction(@NotNull lp0.c cVar, @NotNull com.bilibili.pegasus.request.i iVar) {
        this.f79007a = cVar;
        this.f79008b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x012b A[Catch: Exception -> 0x0062, TRY_ENTER, TryCatch #0 {Exception -> 0x0062, blocks: (B:14:0x0057, B:38:0x00fc, B:40:0x0110, B:42:0x011f, B:43:0x012b, B:33:0x00df), top: B:48:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.Store<mp0.C8028c> r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.pegasus.Action> r13) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.vm.LoadMoreAction.a(com.bilibili.pegasus.Store, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreAction)) {
            return false;
        }
        LoadMoreAction loadMoreAction = (LoadMoreAction) obj;
        return Intrinsics.areEqual(this.f79007a, loadMoreAction.f79007a) && Intrinsics.areEqual(this.f79008b, loadMoreAction.f79008b);
    }

    public final int hashCode() {
        return this.f79008b.hashCode() + (this.f79007a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LoadMoreAction(requestParam=" + this.f79007a + ", parser=" + this.f79008b + ")";
    }
}

package com.bilibili.pegasus.data.request;

import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/request/LoadMoreCompleteAction.class */
public final class LoadMoreCompleteAction implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusResponseWrapper f77424a;

    public LoadMoreCompleteAction(@NotNull PegasusResponseWrapper pegasusResponseWrapper) {
        this.f77424a = pegasusResponseWrapper;
    }

    public static /* synthetic */ LoadMoreCompleteAction copy$default(LoadMoreCompleteAction loadMoreCompleteAction, PegasusResponseWrapper pegasusResponseWrapper, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pegasusResponseWrapper = loadMoreCompleteAction.f77424a;
        }
        return loadMoreCompleteAction.copy(pegasusResponseWrapper);
    }

    @NotNull
    public final PegasusResponseWrapper component1() {
        return this.f77424a;
    }

    @NotNull
    public final LoadMoreCompleteAction copy(@NotNull PegasusResponseWrapper pegasusResponseWrapper) {
        return new LoadMoreCompleteAction(pegasusResponseWrapper);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadMoreCompleteAction) && Intrinsics.areEqual(this.f77424a, ((LoadMoreCompleteAction) obj).f77424a);
    }

    @NotNull
    public final PegasusResponseWrapper getResponse() {
        return this.f77424a;
    }

    public int hashCode() {
        return this.f77424a.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoadMoreCompleteAction(response=" + this.f77424a + ")";
    }
}

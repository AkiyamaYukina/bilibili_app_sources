package com.bilibili.pegasus.data.request;

import com.bilibili.pegasus.Action;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/request/RefreshCompleteAction.class */
public final class RefreshCompleteAction implements Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PegasusResponseWrapper f77429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77430b;

    public RefreshCompleteAction(@NotNull PegasusResponseWrapper pegasusResponseWrapper, boolean z6) {
        this.f77429a = pegasusResponseWrapper;
        this.f77430b = z6;
    }

    public /* synthetic */ RefreshCompleteAction(PegasusResponseWrapper pegasusResponseWrapper, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(pegasusResponseWrapper, (i7 & 2) != 0 ? false : z6);
    }

    public static /* synthetic */ RefreshCompleteAction copy$default(RefreshCompleteAction refreshCompleteAction, PegasusResponseWrapper pegasusResponseWrapper, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pegasusResponseWrapper = refreshCompleteAction.f77429a;
        }
        if ((i7 & 2) != 0) {
            z6 = refreshCompleteAction.f77430b;
        }
        return refreshCompleteAction.copy(pegasusResponseWrapper, z6);
    }

    @NotNull
    public final PegasusResponseWrapper component1() {
        return this.f77429a;
    }

    public final boolean component2() {
        return this.f77430b;
    }

    @NotNull
    public final RefreshCompleteAction copy(@NotNull PegasusResponseWrapper pegasusResponseWrapper, boolean z6) {
        return new RefreshCompleteAction(pegasusResponseWrapper, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshCompleteAction)) {
            return false;
        }
        RefreshCompleteAction refreshCompleteAction = (RefreshCompleteAction) obj;
        return Intrinsics.areEqual(this.f77429a, refreshCompleteAction.f77429a) && this.f77430b == refreshCompleteAction.f77430b;
    }

    public final boolean getOpt() {
        return this.f77430b;
    }

    @NotNull
    public final PegasusResponseWrapper getResponse() {
        return this.f77429a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f77430b) + (this.f77429a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "RefreshCompleteAction(response=" + this.f77429a + ", opt=" + this.f77430b + ")";
    }
}

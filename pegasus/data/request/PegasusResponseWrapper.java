package com.bilibili.pegasus.data.request;

import com.bilibili.pegasus.data.base.PegasusResponse;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import dp0.C6828a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lp0.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/request/PegasusResponseWrapper.class */
public final class PegasusResponseWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PegasusResponse f77425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f77426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f77427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f77428d;

    public PegasusResponseWrapper(@Nullable PegasusResponse pegasusResponse, @Nullable Throwable th, @NotNull c cVar, boolean z6) {
        this.f77425a = pegasusResponse;
        this.f77426b = th;
        this.f77427c = cVar;
        this.f77428d = z6;
    }

    public /* synthetic */ PegasusResponseWrapper(PegasusResponse pegasusResponse, Throwable th, c cVar, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : pegasusResponse, (i7 & 2) != 0 ? null : th, cVar, (i7 & 8) != 0 ? false : z6);
    }

    public static /* synthetic */ PegasusResponseWrapper copy$default(PegasusResponseWrapper pegasusResponseWrapper, PegasusResponse pegasusResponse, Throwable th, c cVar, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pegasusResponse = pegasusResponseWrapper.f77425a;
        }
        if ((i7 & 2) != 0) {
            th = pegasusResponseWrapper.f77426b;
        }
        if ((i7 & 4) != 0) {
            cVar = pegasusResponseWrapper.f77427c;
        }
        if ((i7 & 8) != 0) {
            z6 = pegasusResponseWrapper.f77428d;
        }
        return pegasusResponseWrapper.copy(pegasusResponse, th, cVar, z6);
    }

    @Nullable
    public final PegasusResponse component1() {
        return this.f77425a;
    }

    @Nullable
    public final Throwable component2() {
        return this.f77426b;
    }

    @NotNull
    public final c component3() {
        return this.f77427c;
    }

    public final boolean component4() {
        return this.f77428d;
    }

    @NotNull
    public final PegasusResponseWrapper copy(@Nullable PegasusResponse pegasusResponse, @Nullable Throwable th, @NotNull c cVar, boolean z6) {
        return new PegasusResponseWrapper(pegasusResponse, th, cVar, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PegasusResponseWrapper)) {
            return false;
        }
        PegasusResponseWrapper pegasusResponseWrapper = (PegasusResponseWrapper) obj;
        return Intrinsics.areEqual(this.f77425a, pegasusResponseWrapper.f77425a) && Intrinsics.areEqual(this.f77426b, pegasusResponseWrapper.f77426b) && Intrinsics.areEqual(this.f77427c, pegasusResponseWrapper.f77427c) && this.f77428d == pegasusResponseWrapper.f77428d;
    }

    @Nullable
    public final C6828a getConfig() {
        PegasusResponse pegasusResponse = this.f77425a;
        return pegasusResponse != null ? pegasusResponse.getConfig() : null;
    }

    @Nullable
    public final Throwable getError() {
        return this.f77426b;
    }

    @Nullable
    public final InterestChoose getInterestChoose() {
        PegasusResponse pegasusResponse = this.f77425a;
        return pegasusResponse != null ? pegasusResponse.getInterestChoose() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.pegasus.PegasusHolderData> getItems() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.pegasus.data.base.PegasusResponse r0 = r0.f77425a
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L14
            r0 = r3
            java.util.List r0 = r0.getItems()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L18
        L14:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r3 = r0
        L18:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.data.request.PegasusResponseWrapper.getItems():java.util.List");
    }

    @NotNull
    public final c getRequestPram() {
        return this.f77427c;
    }

    @Nullable
    public final PegasusResponse getResponse() {
        return this.f77425a;
    }

    public final boolean getSuccess() {
        PegasusResponse pegasusResponse = this.f77425a;
        return (pegasusResponse != null ? pegasusResponse.getItems() : null) != null && this.f77426b == null;
    }

    public int hashCode() {
        int iHashCode = 0;
        PegasusResponse pegasusResponse = this.f77425a;
        int iHashCode2 = pegasusResponse == null ? 0 : pegasusResponse.hashCode();
        Throwable th = this.f77426b;
        if (th != null) {
            iHashCode = th.hashCode();
        }
        return Boolean.hashCode(this.f77428d) + ((this.f77427c.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31)) * 31);
    }

    public final boolean isFromCache() {
        return this.f77428d;
    }

    @NotNull
    public String toString() {
        return "PegasusResponseWrapper(response=" + this.f77425a + ", error=" + this.f77426b + ", requestPram=" + this.f77427c + ", isFromCache=" + this.f77428d + ")";
    }
}

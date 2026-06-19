package com.bilibili.pegasus.data.base;

import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.google.gson.annotations.SerializedName;
import dp0.C6828a;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/PegasusResponse.class */
public final class PegasusResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("items")
    @NotNull
    private final List<PegasusHolderData> f77280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("config")
    @Nullable
    private final C6828a f77281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("interest_choose")
    @Nullable
    private final InterestChoose f77282c;

    public PegasusResponse() {
        this(null, null, null, 7, null);
    }

    public PegasusResponse(@NotNull List<? extends PegasusHolderData> list, @Nullable C6828a c6828a, @Nullable InterestChoose interestChoose) {
        this.f77280a = list;
        this.f77281b = c6828a;
        this.f77282c = interestChoose;
    }

    public /* synthetic */ PegasusResponse(List list, C6828a c6828a, InterestChoose interestChoose, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? CollectionsKt.emptyList() : list, (i7 & 2) != 0 ? null : c6828a, (i7 & 4) != 0 ? null : interestChoose);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PegasusResponse copy$default(PegasusResponse pegasusResponse, List list, C6828a c6828a, InterestChoose interestChoose, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = pegasusResponse.f77280a;
        }
        if ((i7 & 2) != 0) {
            c6828a = pegasusResponse.f77281b;
        }
        if ((i7 & 4) != 0) {
            interestChoose = pegasusResponse.f77282c;
        }
        return pegasusResponse.copy(list, c6828a, interestChoose);
    }

    @NotNull
    public final List<PegasusHolderData> component1() {
        return this.f77280a;
    }

    @Nullable
    public final C6828a component2() {
        return this.f77281b;
    }

    @Nullable
    public final InterestChoose component3() {
        return this.f77282c;
    }

    @NotNull
    public final PegasusResponse copy(@NotNull List<? extends PegasusHolderData> list, @Nullable C6828a c6828a, @Nullable InterestChoose interestChoose) {
        return new PegasusResponse(list, c6828a, interestChoose);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PegasusResponse)) {
            return false;
        }
        PegasusResponse pegasusResponse = (PegasusResponse) obj;
        return Intrinsics.areEqual(this.f77280a, pegasusResponse.f77280a) && Intrinsics.areEqual(this.f77281b, pegasusResponse.f77281b) && Intrinsics.areEqual(this.f77282c, pegasusResponse.f77282c);
    }

    @Nullable
    public final C6828a getConfig() {
        return this.f77281b;
    }

    @Nullable
    public final InterestChoose getInterestChoose() {
        return this.f77282c;
    }

    @NotNull
    public final List<PegasusHolderData> getItems() {
        return this.f77280a;
    }

    public int hashCode() {
        int iHashCode = this.f77280a.hashCode();
        C6828a c6828a = this.f77281b;
        int iHashCode2 = 0;
        int iHashCode3 = c6828a == null ? 0 : c6828a.hashCode();
        InterestChoose interestChoose = this.f77282c;
        if (interestChoose != null) {
            iHashCode2 = interestChoose.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "PegasusResponse(items=" + this.f77280a + ", config=" + this.f77281b + ", interestChoose=" + this.f77282c + ")";
    }
}

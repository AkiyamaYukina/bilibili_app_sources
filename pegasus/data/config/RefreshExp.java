package com.bilibili.pegasus.data.config;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import c6.N;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/RefreshExp.class */
@Keep
public final class RefreshExp {

    @NotNull
    public static final a Companion = new Object();
    public static final int FOLD_EXPOSED_CARDS = 5;
    public static final int FOLD_FIRST_FLUSH = 6;

    @SerializedName("excluded_pv_list")
    @NotNull
    private final List<String> excludedPvList;

    @SerializedName("fold_recover_flushes")
    @Nullable
    private final List<Integer> foldRecoverFlushes;

    @SerializedName("refresh_min_interval")
    private final int refreshMinInterval;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/config/RefreshExp$a.class */
    public static final class a {
    }

    public RefreshExp() {
        this(null, 0, null, 7, null);
    }

    public RefreshExp(@Nullable List<Integer> list, int i7, @NotNull List<String> list2) {
        this.foldRecoverFlushes = list;
        this.refreshMinInterval = i7;
        this.excludedPvList = list2;
    }

    public /* synthetic */ RefreshExp(List list, int i7, List list2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : list, (i8 & 2) != 0 ? 0 : i7, (i8 & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RefreshExp copy$default(RefreshExp refreshExp, List list, int i7, List list2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = refreshExp.foldRecoverFlushes;
        }
        if ((i8 & 2) != 0) {
            i7 = refreshExp.refreshMinInterval;
        }
        if ((i8 & 4) != 0) {
            list2 = refreshExp.excludedPvList;
        }
        return refreshExp.copy(list, i7, list2);
    }

    @Nullable
    public final List<Integer> component1() {
        return this.foldRecoverFlushes;
    }

    public final int component2() {
        return this.refreshMinInterval;
    }

    @NotNull
    public final List<String> component3() {
        return this.excludedPvList;
    }

    @NotNull
    public final RefreshExp copy(@Nullable List<Integer> list, int i7, @NotNull List<String> list2) {
        return new RefreshExp(list, i7, list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshExp)) {
            return false;
        }
        RefreshExp refreshExp = (RefreshExp) obj;
        return Intrinsics.areEqual(this.foldRecoverFlushes, refreshExp.foldRecoverFlushes) && this.refreshMinInterval == refreshExp.refreshMinInterval && Intrinsics.areEqual(this.excludedPvList, refreshExp.excludedPvList);
    }

    @NotNull
    public final List<String> getExcludedPvList() {
        return this.excludedPvList;
    }

    @Nullable
    public final List<Integer> getFoldRecoverFlushes() {
        return this.foldRecoverFlushes;
    }

    public final int getRefreshMinInterval() {
        return this.refreshMinInterval;
    }

    public int hashCode() {
        List<Integer> list = this.foldRecoverFlushes;
        return this.excludedPvList.hashCode() + I.a(this.refreshMinInterval, (list == null ? 0 : list.hashCode()) * 31, 31);
    }

    @NotNull
    public String toString() {
        List<Integer> list = this.foldRecoverFlushes;
        int i7 = this.refreshMinInterval;
        List<String> list2 = this.excludedPvList;
        StringBuilder sb = new StringBuilder("RefreshExp(foldRecoverFlushes=");
        sb.append(list);
        sb.append(", refreshMinInterval=");
        sb.append(i7);
        sb.append(", excludedPvList=");
        return N.a(sb, ")", list2);
    }
}

package com.bilibili.ogv.opbase;

import X1.C3081k;
import androidx.appcompat.app.i;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendFeed.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RecommendFeed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f69886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f69887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("fall_wid")
    @NotNull
    private final List<Long> f69888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f69889d;

    public RecommendFeed(long j7, @Nullable String str, @NotNull List list, boolean z6) {
        this.f69886a = str;
        this.f69887b = j7;
        this.f69888c = list;
        this.f69889d = z6;
    }

    @NotNull
    public final List<Long> a() {
        return this.f69888c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendFeed)) {
            return false;
        }
        RecommendFeed recommendFeed = (RecommendFeed) obj;
        return Intrinsics.areEqual(this.f69886a, recommendFeed.f69886a) && this.f69887b == recommendFeed.f69887b && Intrinsics.areEqual(this.f69888c, recommendFeed.f69888c) && this.f69889d == recommendFeed.f69889d;
    }

    public final int hashCode() {
        String str = this.f69886a;
        return Boolean.hashCode(this.f69889d) + e0.a(C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f69887b), 31, this.f69888c);
    }

    @NotNull
    public final String toString() {
        List<Long> list = this.f69888c;
        StringBuilder sb = new StringBuilder("RecommendFeed(type=");
        sb.append(this.f69886a);
        sb.append(", cursor=");
        C3081k.c(sb, this.f69887b, ", wid=", list);
        sb.append(", hasNext=");
        return i.a(sb, this.f69889d, ")");
    }
}

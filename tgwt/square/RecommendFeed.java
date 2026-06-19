package com.bilibili.tgwt.square;

import X1.C3081k;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RecommendFeed.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RecommendFeed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f112078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("fall_wid")
    @NotNull
    private final List<Long> f112079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112080c;

    public RecommendFeed(long j7, boolean z6, @NotNull List list) {
        this.f112078a = j7;
        this.f112079b = list;
        this.f112080c = z6;
    }

    @NotNull
    public final List<Long> a() {
        return this.f112079b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendFeed)) {
            return false;
        }
        RecommendFeed recommendFeed = (RecommendFeed) obj;
        return this.f112078a == recommendFeed.f112078a && Intrinsics.areEqual(this.f112079b, recommendFeed.f112079b) && this.f112080c == recommendFeed.f112080c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112080c) + e0.a(Long.hashCode(this.f112078a) * 31, 31, this.f112079b);
    }

    @NotNull
    public final String toString() {
        List<Long> list = this.f112079b;
        StringBuilder sb = new StringBuilder("RecommendFeed(cursor=");
        C3081k.c(sb, this.f112078a, ", wid=", list);
        sb.append(", hasNext=");
        return androidx.appcompat.app.i.a(sb, this.f112080c, ")");
    }
}

package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/HomeRecommendPage.class */
@StabilityInferred(parameters = 0)
@Bson
public final class HomeRecommendPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<RecommendModule> f112031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RecommendFeed f112032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("header")
    @Nullable
    private final PageHeader f112033c;

    public HomeRecommendPage(@NotNull List<RecommendModule> list, @Nullable RecommendFeed recommendFeed, @Nullable PageHeader pageHeader) {
        this.f112031a = list;
        this.f112032b = recommendFeed;
        this.f112033c = pageHeader;
    }

    @Nullable
    public final PageHeader a() {
        return this.f112033c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeRecommendPage)) {
            return false;
        }
        HomeRecommendPage homeRecommendPage = (HomeRecommendPage) obj;
        return Intrinsics.areEqual(this.f112031a, homeRecommendPage.f112031a) && Intrinsics.areEqual(this.f112032b, homeRecommendPage.f112032b) && Intrinsics.areEqual(this.f112033c, homeRecommendPage.f112033c);
    }

    public final int hashCode() {
        int iHashCode = this.f112031a.hashCode();
        int iHashCode2 = 0;
        RecommendFeed recommendFeed = this.f112032b;
        int iHashCode3 = recommendFeed == null ? 0 : recommendFeed.hashCode();
        PageHeader pageHeader = this.f112033c;
        if (pageHeader != null) {
            iHashCode2 = pageHeader.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        return "HomeRecommendPage(modules=" + this.f112031a + ", feed=" + this.f112032b + ", pageHeader=" + this.f112033c + ")";
    }
}

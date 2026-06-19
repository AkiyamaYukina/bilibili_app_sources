package com.bilibili.ogv.opbase;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import h6.C7416u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/HomeRecommendPage.class */
@StabilityInferred(parameters = 0)
@Bson
public final class HomeRecommendPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public List<RecommendModule> f69834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("style")
    @Nullable
    private final BannerStyle f69835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final RecommendFeed f69836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("animate")
    @Nullable
    private final InComing f69837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f69838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f69839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f69840g;

    @Nullable
    public final Map<String, String> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("jump_module_id")
    @NotNull
    private final String f69841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("header")
    @Nullable
    private final PageHeader f69842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final UGCGuideTip f69843k;

    public HomeRecommendPage(@NotNull List<RecommendModule> list, @Nullable BannerStyle bannerStyle, @Nullable RecommendFeed recommendFeed, @Nullable InComing inComing, @NotNull String str, boolean z6, @NotNull String str2, @Nullable Map<String, String> map, @NotNull String str3, @Nullable PageHeader pageHeader, @Nullable UGCGuideTip uGCGuideTip) {
        this.f69834a = list;
        this.f69835b = bannerStyle;
        this.f69836c = recommendFeed;
        this.f69837d = inComing;
        this.f69838e = str;
        this.f69839f = z6;
        this.f69840g = str2;
        this.h = map;
        this.f69841i = str3;
        this.f69842j = pageHeader;
        this.f69843k = uGCGuideTip;
    }

    @Nullable
    public final BannerStyle a() {
        return this.f69835b;
    }

    @Nullable
    public final InComing b() {
        return this.f69837d;
    }

    @NotNull
    public final String c() {
        return this.f69841i;
    }

    @Nullable
    public final PageHeader d() {
        return this.f69842j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeRecommendPage)) {
            return false;
        }
        HomeRecommendPage homeRecommendPage = (HomeRecommendPage) obj;
        return Intrinsics.areEqual(this.f69834a, homeRecommendPage.f69834a) && Intrinsics.areEqual(this.f69835b, homeRecommendPage.f69835b) && Intrinsics.areEqual(this.f69836c, homeRecommendPage.f69836c) && Intrinsics.areEqual(this.f69837d, homeRecommendPage.f69837d) && Intrinsics.areEqual(this.f69838e, homeRecommendPage.f69838e) && this.f69839f == homeRecommendPage.f69839f && Intrinsics.areEqual(this.f69840g, homeRecommendPage.f69840g) && Intrinsics.areEqual(this.h, homeRecommendPage.h) && Intrinsics.areEqual(this.f69841i, homeRecommendPage.f69841i) && Intrinsics.areEqual(this.f69842j, homeRecommendPage.f69842j) && Intrinsics.areEqual(this.f69843k, homeRecommendPage.f69843k);
    }

    public final int hashCode() {
        int iHashCode = this.f69834a.hashCode();
        BannerStyle bannerStyle = this.f69835b;
        int iHashCode2 = bannerStyle == null ? 0 : bannerStyle.hashCode();
        RecommendFeed recommendFeed = this.f69836c;
        int iHashCode3 = recommendFeed == null ? 0 : recommendFeed.hashCode();
        InComing inComing = this.f69837d;
        int iA = E.a(z.a(E.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (inComing == null ? 0 : inComing.hashCode())) * 31, 31, this.f69838e), 31, this.f69839f), 31, this.f69840g);
        Map<String, String> map = this.h;
        int iA2 = E.a((iA + (map == null ? 0 : map.hashCode())) * 31, 31, this.f69841i);
        PageHeader pageHeader = this.f69842j;
        int iHashCode4 = pageHeader == null ? 0 : pageHeader.hashCode();
        UGCGuideTip uGCGuideTip = this.f69843k;
        return ((iA2 + iHashCode4) * 31) + (uGCGuideTip == null ? 0 : uGCGuideTip.hashCode());
    }

    @NotNull
    public final String toString() {
        List<RecommendModule> list = this.f69834a;
        BannerStyle bannerStyle = this.f69835b;
        InComing inComing = this.f69837d;
        Map<String, String> map = this.h;
        String str = this.f69841i;
        PageHeader pageHeader = this.f69842j;
        StringBuilder sb = new StringBuilder("HomeRecommendPage(modules=");
        sb.append(list);
        sb.append(", bannerStyle=");
        sb.append(bannerStyle);
        sb.append(", feed=");
        sb.append(this.f69836c);
        sb.append(", incoming=");
        sb.append(inComing);
        sb.append(", title=");
        sb.append(this.f69838e);
        sb.append(", hasNext=");
        sb.append(this.f69839f);
        sb.append(", nextCursor=");
        C7416u.a(sb, this.f69840g, ", report=", map, ", jumpModuleId=");
        sb.append(str);
        sb.append(", pageHeader=");
        sb.append(pageHeader);
        sb.append(", tip=");
        sb.append(this.f69843k);
        sb.append(")");
        return sb.toString();
    }
}

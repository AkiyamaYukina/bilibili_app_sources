package com.bilibili.ogv.community.bean;

import Di0.C1602f;
import androidx.compose.animation.z;
import com.bilibili.bson.common.Bson;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/bean/UserCommunityBean.class */
@Bson
public final class UserCommunityBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("coin_number")
    private final int f67520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(IVideoLikeRouteService.ACTION_LIKE)
    private final boolean f67521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("is_original")
    private final boolean f67522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("favorite")
    private final boolean f67523d;

    public UserCommunityBean(boolean z6, int i7, boolean z7, boolean z8) {
        this.f67520a = i7;
        this.f67521b = z6;
        this.f67522c = z7;
        this.f67523d = z8;
    }

    public final int a() {
        return this.f67520a;
    }

    public final boolean b() {
        return this.f67523d;
    }

    public final boolean c() {
        return this.f67521b;
    }

    public final boolean d() {
        return this.f67522c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCommunityBean)) {
            return false;
        }
        UserCommunityBean userCommunityBean = (UserCommunityBean) obj;
        return this.f67520a == userCommunityBean.f67520a && this.f67521b == userCommunityBean.f67521b && this.f67522c == userCommunityBean.f67522c && this.f67523d == userCommunityBean.f67523d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67523d) + z.a(z.a(Integer.hashCode(this.f67520a) * 31, 31, this.f67521b), 31, this.f67522c);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f67520a;
        boolean z6 = this.f67521b;
        return C1602f.a(", favorite=", ")", c.a(i7, "UserCommunityBean(contributionCount=", ", praised=", ", isOriginal=", z6), this.f67522c, this.f67523d);
    }
}

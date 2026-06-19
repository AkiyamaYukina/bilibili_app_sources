package com.bilibili.ogv.community.bean;

import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/bean/BangumiFollowStatus.class */
@Bson
public final class BangumiFollowStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("refresh")
    public boolean f67505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("relation")
    public boolean f67506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("reverse_live_res")
    public boolean f67507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("fmid")
    public long f67508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient boolean f67509g;
    public transient long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f67510i;

    public final boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || BangumiFollowStatus.class != obj.getClass()) {
            return false;
        }
        BangumiFollowStatus bangumiFollowStatus = (BangumiFollowStatus) obj;
        if (this.f67503a != bangumiFollowStatus.f67503a || this.f67505c != bangumiFollowStatus.f67505c || this.f67509g != bangumiFollowStatus.f67509g || this.h != bangumiFollowStatus.h || this.f67510i != bangumiFollowStatus.f67510i || !Objects.equals(this.f67504b, bangumiFollowStatus.f67504b)) {
            z6 = false;
        }
        return z6;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f67503a), this.f67504b, Boolean.valueOf(this.f67505c), Boolean.valueOf(this.f67509g), Long.valueOf(this.h), Integer.valueOf(this.f67510i));
    }
}

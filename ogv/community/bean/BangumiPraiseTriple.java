package com.bilibili.ogv.community.bean;

import com.bilibili.bson.common.Bson;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/bean/BangumiPraiseTriple.class */
@Bson
public class BangumiPraiseTriple {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(IVideoLikeRouteService.ACTION_LIKE)
    public boolean f67512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("coin")
    public boolean f67513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("follow")
    public boolean f67514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("coin_number")
    public int f67515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("favorite")
    public boolean f67516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("relation")
    public boolean f67517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("fmid")
    public long f67518g;
}

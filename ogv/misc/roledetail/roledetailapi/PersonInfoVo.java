package com.bilibili.ogv.misc.roledetail.roledetailapi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonInfoVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PersonInfoVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f69264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_img")
    @Nullable
    private String f69265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f69266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f69267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f69268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("origin_name")
    @Nullable
    private String f69269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public List<Order> f69270g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonInfoVo$Order.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Order {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f69271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69272b;
    }

    @Nullable
    public final String a() {
        return this.f69265b;
    }

    @Nullable
    public final String b() {
        return this.f69269f;
    }

    public final void c(@Nullable String str) {
        this.f69265b = str;
    }

    public final void d(@Nullable String str) {
        this.f69269f = str;
    }
}

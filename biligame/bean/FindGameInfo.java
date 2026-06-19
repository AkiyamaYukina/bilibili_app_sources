package com.bilibili.biligame.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/FindGameInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FindGameInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("is_fall_back_query")
    private int f62224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("page_number")
    private int f62225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("page_size")
    private int f62226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("total_count")
    private int f62227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<FindGameItemInfo> f62228e;

    public final int a() {
        return this.f62225b;
    }

    public final int b() {
        return this.f62226c;
    }

    public final int c() {
        return this.f62227d;
    }

    public final int d() {
        return this.f62224a;
    }

    public final void e(int i7) {
        this.f62224a = i7;
    }

    public final void f(int i7) {
        this.f62225b = i7;
    }

    public final void g(int i7) {
        this.f62226c = i7;
    }

    public final void h(int i7) {
        this.f62227d = i7;
    }
}

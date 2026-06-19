package com.bilibili.tgwt.square;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RecommendModule.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RecommendModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f112082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final String f112083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f112084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ModuleAttr f112085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<ModuleHeader> f112086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("items")
    @NotNull
    private final List<CommonCard> f112087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f112088g;

    @Nullable
    public final Map<String, String> h;

    public RecommendModule() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    public RecommendModule(String str, String str2, String str3, ModuleAttr moduleAttr, List list, List list2, String str4, Map map, int i7) {
        str = (i7 & 1) != 0 ? null : str;
        str2 = (i7 & 2) != 0 ? null : str2;
        str3 = (i7 & 4) != 0 ? null : str3;
        moduleAttr = (i7 & 8) != 0 ? new ModuleAttr(false, 1) : moduleAttr;
        list = (i7 & 16) != 0 ? CollectionsKt.emptyList() : list;
        list2 = (i7 & 32) != 0 ? CollectionsKt.emptyList() : list2;
        str4 = (i7 & 64) != 0 ? null : str4;
        map = (i7 & 128) != 0 ? null : map;
        this.f112082a = str;
        this.f112083b = str2;
        this.f112084c = str3;
        this.f112085d = moduleAttr;
        this.f112086e = list;
        this.f112087f = list2;
        this.f112088g = str4;
        this.h = map;
    }

    @NotNull
    public final List<CommonCard> a() {
        return this.f112087f;
    }

    @Nullable
    public final String b() {
        return this.f112083b;
    }
}

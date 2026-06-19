package com.bilibili.studio.material;

import I.E;
import com.bilibili.studio.material.internal.EngineType;
import com.bilibili.studio.material.internal.ProcessorItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/Request.class */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f108496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f108497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MaterialType f108498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f108499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f108500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f108501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f108502g;

    @NotNull
    public Map<String, Object> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public List<String> f108503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public Set<String> f108504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public List<? extends IStrategy<ProcessorItem>> f108505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public EngineType f108506l;

    public Request(@NotNull String str, @NotNull String str2, @NotNull MaterialType materialType) {
        this.f108496a = str;
        this.f108497b = str2;
        this.f108498c = materialType;
        this.f108499d = String.valueOf(System.currentTimeMillis());
        this.f108500e = "";
        this.f108501f = "";
        this.f108502g = "";
        this.h = new LinkedHashMap();
        this.f108503i = new ArrayList();
        this.f108504j = SetsKt.emptySet();
        this.f108505k = CollectionsKt.emptyList();
        this.f108506l = EngineType.Montage;
    }

    public /* synthetic */ Request(String str, String str2, MaterialType materialType, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, materialType);
    }

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, MaterialType materialType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = request.f108496a;
        }
        if ((i7 & 2) != 0) {
            str2 = request.f108497b;
        }
        if ((i7 & 4) != 0) {
            materialType = request.f108498c;
        }
        return request.copy(str, str2, materialType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request copyRequest$default(Request request, String str, String str2, MaterialType materialType, String str3, String str4, String str5, String str6, List list, Set set, EngineType engineType, List list2, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = request.f108496a;
        }
        if ((i7 & 2) != 0) {
            str2 = request.f108497b;
        }
        if ((i7 & 4) != 0) {
            materialType = request.f108498c;
        }
        if ((i7 & 8) != 0) {
            str3 = request.f108499d;
        }
        if ((i7 & 16) != 0) {
            str4 = request.f108500e;
        }
        if ((i7 & 32) != 0) {
            str5 = request.getFileName();
        }
        if ((i7 & 64) != 0) {
            str6 = request.f108502g;
        }
        if ((i7 & 128) != 0) {
            list = request.f108503i;
        }
        if ((i7 & 256) != 0) {
            set = request.f108504j;
        }
        if ((i7 & 512) != 0) {
            engineType = request.f108506l;
        }
        if ((i7 & 1024) != 0) {
            list2 = request.f108505k;
        }
        if ((i7 & 2048) != 0) {
            map = request.h;
        }
        return request.copyRequest(str, str2, materialType, str3, str4, str5, str6, list, set, engineType, list2, map);
    }

    @NotNull
    public final String component1() {
        return this.f108496a;
    }

    @NotNull
    public final String component2() {
        return this.f108497b;
    }

    @NotNull
    public final MaterialType component3() {
        return this.f108498c;
    }

    @NotNull
    public final Request copy(@NotNull String str, @NotNull String str2, @NotNull MaterialType materialType) {
        return new Request(str, str2, materialType);
    }

    @NotNull
    public final Request copyRequest(@NotNull String str, @NotNull String str2, @NotNull MaterialType materialType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull Set<String> set, @NotNull EngineType engineType, @NotNull List<? extends IStrategy<ProcessorItem>> list2, @NotNull Map<String, Object> map) {
        Request request = new Request(str, str2, materialType);
        request.f108499d = str3;
        request.f108500e = str4;
        request.f108501f = str5;
        request.f108502g = str6;
        request.f108503i.addAll(list);
        request.f108504j = set;
        request.f108506l = engineType;
        request.f108505k = list2;
        request.h = map;
        return request;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return Intrinsics.areEqual(this.f108496a, request.f108496a) && Intrinsics.areEqual(this.f108497b, request.f108497b) && Intrinsics.areEqual(this.f108498c, request.f108498c);
    }

    @NotNull
    public final String getBizFrom() {
        return this.f108502g;
    }

    @NotNull
    public final List<String> getDirFilterBlackList$resourcecenter_release() {
        return this.f108503i;
    }

    @NotNull
    public final EngineType getEngineType() {
        return this.f108506l;
    }

    @NotNull
    public final Map<String, Object> getExtra() {
        return this.h;
    }

    @NotNull
    public final List<IStrategy<ProcessorItem>> getExtraStrategy$resourcecenter_release() {
        return this.f108505k;
    }

    @NotNull
    public final String getFileName() {
        return this.f108501f.length() == 0 ? UtilsKt.getFileNameFromUrl(this.f108497b) : this.f108501f;
    }

    @NotNull
    public final String getFilePath() {
        return this.f108500e;
    }

    @NotNull
    public final String getMaterialId() {
        return this.f108496a;
    }

    @NotNull
    public final MaterialType getMaterialType() {
        return this.f108498c;
    }

    @NotNull
    public final String getMaterialUrl() {
        return this.f108497b;
    }

    @NotNull
    public final Set<String> getMontageSupportMaterialTypes$resourcecenter_release() {
        return this.f108504j;
    }

    @NotNull
    public final String getTaskId() {
        return this.f108499d;
    }

    public int hashCode() {
        return this.f108498c.hashCode() + E.a(this.f108496a.hashCode() * 31, 31, this.f108497b);
    }

    public final void setBizFrom(@NotNull String str) {
        this.f108502g = str;
    }

    public final void setDirFilterBlackList$resourcecenter_release(@NotNull List<String> list) {
        this.f108503i = list;
    }

    public final void setEngineType(@NotNull EngineType engineType) {
        this.f108506l = engineType;
    }

    public final void setExtra(@NotNull Map<String, Object> map) {
        this.h = map;
    }

    public final void setExtraStrategy$resourcecenter_release(@NotNull List<? extends IStrategy<ProcessorItem>> list) {
        this.f108505k = list;
    }

    public final void setFileName(@NotNull String str) {
        this.f108501f = str;
    }

    public final void setFilePath(@NotNull String str) {
        this.f108500e = str;
    }

    public final void setMaterialId(@NotNull String str) {
        this.f108496a = str;
    }

    public final void setMaterialUrl(@NotNull String str) {
        this.f108497b = str;
    }

    public final void setMontageSupportMaterialTypes$resourcecenter_release(@NotNull Set<String> set) {
        this.f108504j = set;
    }

    public final void setTaskId(@NotNull String str) {
        this.f108499d = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = G0.b.a("Request(materialId=", this.f108496a, ", materialUrl=", this.f108497b, ", materialType=");
        sbA.append(this.f108498c);
        sbA.append(")");
        return sbA.toString();
    }
}

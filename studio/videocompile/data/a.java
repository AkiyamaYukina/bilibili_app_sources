package com.bilibili.studio.videocompile.data;

import com.bilibili.studio.videocompile.data.d;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/a.class */
public final class a extends BVideoCompileStrategyData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d.b f108700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d.e f108701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d.C1203d f108702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f108704e;

    public a(@NotNull d.b bVar, @NotNull d.e eVar, @NotNull d.C1203d c1203d) {
        super(bVar, eVar);
        this.f108700a = bVar;
        this.f108701b = eVar;
        this.f108702c = c1203d;
        this.f108703d = c1203d.f108744a;
        this.f108704e = c1203d.f108745b;
    }

    @Override // com.bilibili.studio.videocompile.data.BVideoCompileStrategyData, com.bilibili.studio.videocompile.data.BVideoCompileBaseData
    @NotNull
    public final HashMap<String, String> createMapData() {
        HashMap<String, String> mapCreateMapData = super.createMapData();
        mapCreateMapData.put("retryCount", String.valueOf(this.f108703d));
        mapCreateMapData.put("retryInfo", this.f108704e);
        return mapCreateMapData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f108700a, aVar.f108700a) && Intrinsics.areEqual(this.f108701b, aVar.f108701b) && Intrinsics.areEqual(this.f108702c, aVar.f108702c);
    }

    public final int hashCode() {
        int iHashCode = this.f108700a.hashCode();
        return this.f108702c.hashCode() + ((this.f108701b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BVideoCompileStartData(commonParams=" + this.f108700a + ", strategyParams=" + this.f108701b + ", startParams=" + this.f108702c + ")";
    }
}

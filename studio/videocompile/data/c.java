package com.bilibili.studio.videocompile.data;

import com.bilibili.studio.videocompile.data.d;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/c.class */
public final class c extends BVideoCompileStrategyData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d.b f108710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d.e f108711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d.f f108712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f108714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f108715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f108716g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f108717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f108718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f108719k;

    public c(@NotNull d.b bVar, @NotNull d.e eVar, @NotNull d.f fVar) {
        super(bVar, eVar);
        this.f108710a = bVar;
        this.f108711b = eVar;
        this.f108712c = fVar;
        this.f108713d = fVar.f108755a;
        this.f108714e = fVar.f108756b;
        this.f108715f = fVar.f108757c;
        this.f108716g = fVar.f108758d;
        this.h = fVar.f108759e;
        this.f108717i = fVar.f108760f;
        this.f108718j = fVar.f108761g;
        this.f108719k = fVar.h;
    }

    @Override // com.bilibili.studio.videocompile.data.BVideoCompileStrategyData, com.bilibili.studio.videocompile.data.BVideoCompileBaseData
    @NotNull
    public final HashMap<String, String> createMapData() {
        HashMap<String, String> mapCreateMapData = super.createMapData();
        mapCreateMapData.put("errorCode", String.valueOf(this.f108713d));
        mapCreateMapData.put("errorMessage", this.f108714e);
        mapCreateMapData.put("takenTime", String.valueOf(this.f108715f));
        mapCreateMapData.put("fileSize", String.valueOf(this.f108716g));
        mapCreateMapData.put("timelineDuration", String.valueOf(this.h));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        mapCreateMapData.put("compile_speed", String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f108717i)}, 1)));
        mapCreateMapData.put("estimatedFileSize", String.valueOf(this.f108718j));
        mapCreateMapData.put("isSkipTranscode", this.f108719k ? "1" : "0");
        return mapCreateMapData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f108710a, cVar.f108710a) && Intrinsics.areEqual(this.f108711b, cVar.f108711b) && Intrinsics.areEqual(this.f108712c, cVar.f108712c);
    }

    public final int hashCode() {
        int iHashCode = this.f108710a.hashCode();
        return this.f108712c.hashCode() + ((this.f108711b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "BVideoCompileSuccessData(commonParams=" + this.f108710a + ", strategyParams=" + this.f108711b + ", successParams=" + this.f108712c + ")";
    }
}

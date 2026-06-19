package com.bilibili.studio.material;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.room.B;
import com.bilibili.studio.material.MaterialType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/Result.class */
public final class Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f108507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f108508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f108509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f108510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f108511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f108512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public FailReason f108513g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public MaterialType f108514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f108515j;

    public Result() {
        this(false, null, null, 0.0d, null, null, null, false, null, null, 1023, null);
    }

    public Result(boolean z6, @NotNull String str, @NotNull String str2, double d7, @NotNull String str3, @NotNull String str4, @Nullable FailReason failReason, boolean z7, @NotNull MaterialType materialType, @NotNull Map<String, Object> map) {
        this.f108507a = z6;
        this.f108508b = str;
        this.f108509c = str2;
        this.f108510d = d7;
        this.f108511e = str3;
        this.f108512f = str4;
        this.f108513g = failReason;
        this.h = z7;
        this.f108514i = materialType;
        this.f108515j = map;
    }

    public /* synthetic */ Result(boolean z6, String str, String str2, double d7, String str3, String str4, FailReason failReason, boolean z7, MaterialType materialType, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? 0.0d : d7, (i7 & 16) != 0 ? "" : str3, (i7 & 32) != 0 ? "" : str4, (i7 & 64) != 0 ? null : failReason, (i7 & 128) != 0 ? false : z7, (i7 & 256) != 0 ? MaterialType.UnUsed.INSTANCE : materialType, (i7 & 512) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Result copy$default(Result result, boolean z6, String str, String str2, double d7, String str3, String str4, FailReason failReason, boolean z7, MaterialType materialType, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = result.f108507a;
        }
        if ((i7 & 2) != 0) {
            str = result.f108508b;
        }
        if ((i7 & 4) != 0) {
            str2 = result.f108509c;
        }
        if ((i7 & 8) != 0) {
            d7 = result.f108510d;
        }
        if ((i7 & 16) != 0) {
            str3 = result.f108511e;
        }
        if ((i7 & 32) != 0) {
            str4 = result.f108512f;
        }
        if ((i7 & 64) != 0) {
            failReason = result.f108513g;
        }
        if ((i7 & 128) != 0) {
            z7 = result.h;
        }
        if ((i7 & 256) != 0) {
            materialType = result.f108514i;
        }
        if ((i7 & 512) != 0) {
            map = result.f108515j;
        }
        return result.copy(z6, str, str2, d7, str3, str4, failReason, z7, materialType, map);
    }

    public final boolean component1() {
        return this.f108507a;
    }

    @NotNull
    public final Map<String, Object> component10() {
        return this.f108515j;
    }

    @NotNull
    public final String component2() {
        return this.f108508b;
    }

    @NotNull
    public final String component3() {
        return this.f108509c;
    }

    public final double component4() {
        return this.f108510d;
    }

    @NotNull
    public final String component5() {
        return this.f108511e;
    }

    @NotNull
    public final String component6() {
        return this.f108512f;
    }

    @Nullable
    public final FailReason component7() {
        return this.f108513g;
    }

    public final boolean component8() {
        return this.h;
    }

    @NotNull
    public final MaterialType component9() {
        return this.f108514i;
    }

    @NotNull
    public final Result copy(boolean z6, @NotNull String str, @NotNull String str2, double d7, @NotNull String str3, @NotNull String str4, @Nullable FailReason failReason, boolean z7, @NotNull MaterialType materialType, @NotNull Map<String, Object> map) {
        return new Result(z6, str, str2, d7, str3, str4, failReason, z7, materialType, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.f108507a == result.f108507a && Intrinsics.areEqual(this.f108508b, result.f108508b) && Intrinsics.areEqual(this.f108509c, result.f108509c) && Double.compare(this.f108510d, result.f108510d) == 0 && Intrinsics.areEqual(this.f108511e, result.f108511e) && Intrinsics.areEqual(this.f108512f, result.f108512f) && Intrinsics.areEqual(this.f108513g, result.f108513g) && this.h == result.h && Intrinsics.areEqual(this.f108514i, result.f108514i) && Intrinsics.areEqual(this.f108515j, result.f108515j);
    }

    @NotNull
    public final Map<String, Object> getExtra() {
        return this.f108515j;
    }

    @Nullable
    public final FailReason getFailReason() {
        return this.f108513g;
    }

    @NotNull
    public final String getFileName() {
        return this.f108509c;
    }

    @NotNull
    public final String getFilePath() {
        return this.f108508b;
    }

    public final double getFileSize() {
        return this.f108510d;
    }

    @NotNull
    public final String getId() {
        return this.f108511e;
    }

    @NotNull
    public final MaterialType getMaterialType() {
        return this.f108514i;
    }

    @NotNull
    public final String getUrl() {
        return this.f108512f;
    }

    public int hashCode() {
        int iA = E.a(E.a(A.a(this.f108510d, E.a(E.a(Boolean.hashCode(this.f108507a) * 31, 31, this.f108508b), 31, this.f108509c), 31), 31, this.f108511e), 31, this.f108512f);
        FailReason failReason = this.f108513g;
        return this.f108515j.hashCode() + ((this.f108514i.hashCode() + z.a((iA + (failReason == null ? 0 : failReason.hashCode())) * 31, 31, this.h)) * 31);
    }

    public final boolean isHit() {
        return this.h;
    }

    public final boolean isSuccess() {
        return this.f108507a;
    }

    public final void setFailReason(@Nullable FailReason failReason) {
        this.f108513g = failReason;
    }

    public final void setFileSize(double d7) {
        this.f108510d = d7;
    }

    public final void setHit(boolean z6) {
        this.h = z6;
    }

    public final void setId(@NotNull String str) {
        this.f108511e = str;
    }

    public final void setMaterialType(@NotNull MaterialType materialType) {
        this.f108514i = materialType;
    }

    public final void setUrl(@NotNull String str) {
        this.f108512f = str;
    }

    @NotNull
    public String toString() {
        double d7 = this.f108510d;
        String str = this.f108511e;
        String str2 = this.f108512f;
        FailReason failReason = this.f108513g;
        boolean z6 = this.h;
        MaterialType materialType = this.f108514i;
        Map<String, Object> map = this.f108515j;
        StringBuilder sb = new StringBuilder("Result(isSuccess=");
        sb.append(this.f108507a);
        sb.append(", filePath=");
        sb.append(this.f108508b);
        sb.append(", fileName=");
        sb.append(this.f108509c);
        sb.append(", fileSize=");
        sb.append(d7);
        B.a(", id=", str, ", url=", str2, sb);
        sb.append(", failReason=");
        sb.append(failReason);
        sb.append(", isHit=");
        sb.append(z6);
        sb.append(", materialType=");
        sb.append(materialType);
        sb.append(", extra=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}

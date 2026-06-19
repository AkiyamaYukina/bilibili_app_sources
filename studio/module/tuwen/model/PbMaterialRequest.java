package com.bilibili.studio.module.tuwen.model;

import com.bilibili.studio.module.tuwen.common.PbMaterialType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/PbMaterialRequest.class */
public final class PbMaterialRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f108626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f108627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f108628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PbMaterialType f108629d;

    public PbMaterialRequest(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull PbMaterialType pbMaterialType) {
        this.f108626a = str;
        this.f108627b = str2;
        this.f108628c = str3;
        this.f108629d = pbMaterialType;
    }

    public /* synthetic */ PbMaterialRequest(String str, String str2, String str3, PbMaterialType pbMaterialType, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, pbMaterialType);
    }

    public static /* synthetic */ PbMaterialRequest copy$default(PbMaterialRequest pbMaterialRequest, String str, String str2, String str3, PbMaterialType pbMaterialType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pbMaterialRequest.f108626a;
        }
        if ((i7 & 2) != 0) {
            str2 = pbMaterialRequest.f108627b;
        }
        if ((i7 & 4) != 0) {
            str3 = pbMaterialRequest.f108628c;
        }
        if ((i7 & 8) != 0) {
            pbMaterialType = pbMaterialRequest.f108629d;
        }
        return pbMaterialRequest.copy(str, str2, str3, pbMaterialType);
    }

    @NotNull
    public final String component1() {
        return this.f108626a;
    }

    @Nullable
    public final String component2() {
        return this.f108627b;
    }

    @Nullable
    public final String component3() {
        return this.f108628c;
    }

    @NotNull
    public final PbMaterialType component4() {
        return this.f108629d;
    }

    @NotNull
    public final PbMaterialRequest copy(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull PbMaterialType pbMaterialType) {
        return new PbMaterialRequest(str, str2, str3, pbMaterialType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbMaterialRequest)) {
            return false;
        }
        PbMaterialRequest pbMaterialRequest = (PbMaterialRequest) obj;
        return Intrinsics.areEqual(this.f108626a, pbMaterialRequest.f108626a) && Intrinsics.areEqual(this.f108627b, pbMaterialRequest.f108627b) && Intrinsics.areEqual(this.f108628c, pbMaterialRequest.f108628c) && this.f108629d == pbMaterialRequest.f108629d;
    }

    @Nullable
    public final String getFileName() {
        return this.f108627b;
    }

    @Nullable
    public final String getFilePath() {
        return this.f108628c;
    }

    @NotNull
    public final String getIdPath() {
        return this.f108626a;
    }

    @NotNull
    public final PbMaterialType getType() {
        return this.f108629d;
    }

    public int hashCode() {
        int iHashCode = this.f108626a.hashCode();
        int iHashCode2 = 0;
        String str = this.f108627b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f108628c;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return this.f108629d.hashCode() + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    @NotNull
    public String toString() {
        return "PbMaterialRequest(idPath=" + this.f108626a + ", fileName=" + this.f108627b + ", filePath=" + this.f108628c + ", type=" + this.f108629d + ")";
    }
}

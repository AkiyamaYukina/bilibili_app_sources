package com.bilibili.studio.module.tuwen.model;

import G0.b;
import androidx.fragment.app.A;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutModResources.class */
public final class BCutModResources implements Serializable {

    @Nullable
    private String blMobilePath;

    @Nullable
    private String faceVideoModelPath;

    @Nullable
    private String headSegModelPath;

    @Nullable
    private String segmentVideoModelPath;

    public BCutModResources(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.blMobilePath = str;
        this.faceVideoModelPath = str2;
        this.headSegModelPath = str3;
        this.segmentVideoModelPath = str4;
    }

    public static /* synthetic */ BCutModResources copy$default(BCutModResources bCutModResources, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bCutModResources.blMobilePath;
        }
        if ((i7 & 2) != 0) {
            str2 = bCutModResources.faceVideoModelPath;
        }
        if ((i7 & 4) != 0) {
            str3 = bCutModResources.headSegModelPath;
        }
        if ((i7 & 8) != 0) {
            str4 = bCutModResources.segmentVideoModelPath;
        }
        return bCutModResources.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.blMobilePath;
    }

    @Nullable
    public final String component2() {
        return this.faceVideoModelPath;
    }

    @Nullable
    public final String component3() {
        return this.headSegModelPath;
    }

    @Nullable
    public final String component4() {
        return this.segmentVideoModelPath;
    }

    @NotNull
    public final BCutModResources copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new BCutModResources(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCutModResources)) {
            return false;
        }
        BCutModResources bCutModResources = (BCutModResources) obj;
        return Intrinsics.areEqual(this.blMobilePath, bCutModResources.blMobilePath) && Intrinsics.areEqual(this.faceVideoModelPath, bCutModResources.faceVideoModelPath) && Intrinsics.areEqual(this.headSegModelPath, bCutModResources.headSegModelPath) && Intrinsics.areEqual(this.segmentVideoModelPath, bCutModResources.segmentVideoModelPath);
    }

    @Nullable
    public final String getBlMobilePath() {
        return this.blMobilePath;
    }

    @Nullable
    public final String getFaceVideoModelPath() {
        return this.faceVideoModelPath;
    }

    @Nullable
    public final String getHeadSegModelPath() {
        return this.headSegModelPath;
    }

    @Nullable
    public final String getSegmentVideoModelPath() {
        return this.segmentVideoModelPath;
    }

    public int hashCode() {
        String str = this.blMobilePath;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.faceVideoModelPath;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.headSegModelPath;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.segmentVideoModelPath;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setBlMobilePath(@Nullable String str) {
        this.blMobilePath = str;
    }

    public final void setFaceVideoModelPath(@Nullable String str) {
        this.faceVideoModelPath = str;
    }

    public final void setHeadSegModelPath(@Nullable String str) {
        this.headSegModelPath = str;
    }

    public final void setSegmentVideoModelPath(@Nullable String str) {
        this.segmentVideoModelPath = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.headSegModelPath, ", segmentVideoModelPath=", this.segmentVideoModelPath, ")", b.a("BCutModResources(blMobilePath=", this.blMobilePath, ", faceVideoModelPath=", this.faceVideoModelPath, ", headSegModelPath="));
    }
}

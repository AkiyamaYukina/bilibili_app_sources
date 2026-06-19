package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/StudyEndingPageInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class StudyEndingPageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("extra_result")
    @Nullable
    private final Integer f90205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("study_record")
    @Nullable
    private final StudyRecord f90206b;

    public StudyEndingPageInfo(@Nullable Integer num, @Nullable StudyRecord studyRecord) {
        this.f90205a = num;
        this.f90206b = studyRecord;
    }

    @Nullable
    public final Integer a() {
        return this.f90205a;
    }

    @Nullable
    public final StudyRecord b() {
        return this.f90206b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudyEndingPageInfo)) {
            return false;
        }
        StudyEndingPageInfo studyEndingPageInfo = (StudyEndingPageInfo) obj;
        return Intrinsics.areEqual(this.f90205a, studyEndingPageInfo.f90205a) && Intrinsics.areEqual(this.f90206b, studyEndingPageInfo.f90206b);
    }

    public final int hashCode() {
        Integer num = this.f90205a;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        StudyRecord studyRecord = this.f90206b;
        if (studyRecord != null) {
            iHashCode = studyRecord.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "StudyEndingPageInfo(kcal=" + this.f90205a + ", studyRecord=" + this.f90206b + ")";
    }
}

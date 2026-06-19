package com.bilibili.ship.theseus.cheese.biz.additional;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.StudyRecord;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/CheeseAdditionalInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class CheeseAdditionalInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activity_progress")
    @Nullable
    private final CheeseActivityProgress f88991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("study_record")
    @Nullable
    private final StudyRecord f88992b;

    public CheeseAdditionalInfo(CheeseActivityProgress cheeseActivityProgress, StudyRecord studyRecord, int i7) {
        this.f88991a = (i7 & 1) != 0 ? null : cheeseActivityProgress;
        this.f88992b = studyRecord;
    }

    @Nullable
    public final CheeseActivityProgress a() {
        return this.f88991a;
    }

    @Nullable
    public final StudyRecord b() {
        return this.f88992b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheeseAdditionalInfo)) {
            return false;
        }
        CheeseAdditionalInfo cheeseAdditionalInfo = (CheeseAdditionalInfo) obj;
        return Intrinsics.areEqual(this.f88991a, cheeseAdditionalInfo.f88991a) && Intrinsics.areEqual(this.f88992b, cheeseAdditionalInfo.f88992b);
    }

    public final int hashCode() {
        CheeseActivityProgress cheeseActivityProgress = this.f88991a;
        int iHashCode = 0;
        int iHashCode2 = cheeseActivityProgress == null ? 0 : cheeseActivityProgress.hashCode();
        StudyRecord studyRecord = this.f88992b;
        if (studyRecord != null) {
            iHashCode = studyRecord.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "CheeseAdditionalInfo(activityProgress=" + this.f88991a + ", studyRecord=" + this.f88992b + ")";
    }
}

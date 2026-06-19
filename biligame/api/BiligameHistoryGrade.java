package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHistoryGrade.class */
@StabilityInferred(parameters = 0)
@Keep
public class BiligameHistoryGrade {
    public static final int $stable = 8;
    private float grade;
    private int phase;

    @JSONField(name = "test_type")
    private int testType;

    @NotNull
    private String date = "";

    @JSONField(name = "recruit_start_date")
    @NotNull
    private String recruitStartDate = "";

    @JSONField(name = "recruit_end_date")
    @NotNull
    private String recruitEndDate = "";

    public boolean equals(@Nullable Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiligameHistoryGrade)) {
            return false;
        }
        BiligameHistoryGrade biligameHistoryGrade = (BiligameHistoryGrade) obj;
        if (this.phase != biligameHistoryGrade.phase || !Intrinsics.areEqual(this.date, biligameHistoryGrade.date)) {
            z6 = false;
        }
        return z6;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final float getGrade() {
        return this.grade;
    }

    public final int getPhase() {
        return this.phase;
    }

    @NotNull
    public final String getRecruitEndDate() {
        return this.recruitEndDate;
    }

    @NotNull
    public final String getRecruitStartDate() {
        return this.recruitStartDate;
    }

    public final int getTestType() {
        return this.testType;
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setGrade(float f7) {
        this.grade = f7;
    }

    public final void setPhase(int i7) {
        this.phase = i7;
    }

    public final void setRecruitEndDate(@NotNull String str) {
        this.recruitEndDate = str;
    }

    public final void setRecruitStartDate(@NotNull String str) {
        this.recruitStartDate = str;
    }

    public final void setTestType(int i7) {
        this.testType = i7;
    }
}

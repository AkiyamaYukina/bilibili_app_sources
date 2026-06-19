package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GradeType.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GradeType {
    public static final int $stable = 8;

    @JSONField(name = "grade_status")
    private int gradeStatus;

    @JSONField(name = "grade_status_name")
    @Nullable
    private String gradeStatusName;

    public final int getGradeStatus() {
        return this.gradeStatus;
    }

    @Nullable
    public final String getGradeStatusName() {
        return this.gradeStatusName;
    }

    public final void setGradeStatus(int i7) {
        this.gradeStatus = i7;
    }

    public final void setGradeStatusName(@Nullable String str) {
        this.gradeStatusName = str;
    }
}

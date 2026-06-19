package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/BiliGameTestInfo.class */
@Keep
public final class BiliGameTestInfo {

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = "has_qualification")
    private boolean hasQualification;

    @JSONField(name = "recruit_apply_result")
    private int recruitApplyResult;

    @JSONField(name = "recruit_apply_status")
    private boolean recruitApplyStatus;

    @JSONField(name = "recruit_id")
    @NotNull
    private final String recruitId = "";

    @JSONField(name = "recruit_questionnaire_link")
    @Nullable
    private String recruitQuestionnaireLink;

    @JSONField(name = "recruit_status")
    private int recruitStatus;

    @JSONField(name = "test_end_time")
    private long testEndTime;

    @JSONField(name = "test_package_url")
    @Nullable
    private String testPackageUrl;

    @JSONField(name = "test_start_time")
    private long testStartTime;

    @JSONField(name = "test_type")
    private int testType;

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    public final boolean getHasQualification() {
        return this.hasQualification;
    }

    public final int getRecruitApplyResult() {
        return this.recruitApplyResult;
    }

    public final boolean getRecruitApplyStatus() {
        return this.recruitApplyStatus;
    }

    @NotNull
    public final String getRecruitId() {
        return this.recruitId;
    }

    @Nullable
    public final String getRecruitQuestionnaireLink() {
        return this.recruitQuestionnaireLink;
    }

    public final int getRecruitStatus() {
        return this.recruitStatus;
    }

    public final long getTestEndTime() {
        return this.testEndTime;
    }

    @Nullable
    public final String getTestPackageUrl() {
        return this.testPackageUrl;
    }

    public final long getTestStartTime() {
        return this.testStartTime;
    }

    public final int getTestType() {
        return this.testType;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setHasQualification(boolean z6) {
        this.hasQualification = z6;
    }

    public final void setRecruitApplyResult(int i7) {
        this.recruitApplyResult = i7;
    }

    public final void setRecruitApplyStatus(boolean z6) {
        this.recruitApplyStatus = z6;
    }

    public final void setRecruitQuestionnaireLink(@Nullable String str) {
        this.recruitQuestionnaireLink = str;
    }

    public final void setRecruitStatus(int i7) {
        this.recruitStatus = i7;
    }

    public final void setTestEndTime(long j7) {
        this.testEndTime = j7;
    }

    public final void setTestPackageUrl(@Nullable String str) {
        this.testPackageUrl = str;
    }

    public final void setTestStartTime(long j7) {
        this.testStartTime = j7;
    }

    public final void setTestType(int i7) {
        this.testType = i7;
    }
}

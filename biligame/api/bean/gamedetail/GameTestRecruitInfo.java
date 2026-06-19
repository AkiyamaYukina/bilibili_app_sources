package com.bilibili.biligame.api.bean.gamedetail;

import X1.C3081k;
import a5.C3188c;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import androidx.room.B;
import c6.P;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameTestRecruitInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameTestRecruitInfo implements Serializable {
    public static final int $stable = 8;
    private boolean booked;
    private boolean currentMainGame;
    private int gameBaseId;

    @Nullable
    private String gameName;
    private boolean hasQuestionnaireChecked;
    private boolean hasQuestionnaireFilled;

    @JSONField(name = "recruit_book")
    private int needBook;

    @JSONField(name = "is_need_secret_agreement")
    private int needSecretAgreement;

    @JSONField(name = "is_new_questionnaire")
    private boolean newQuestionnaire;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    private boolean f34private;

    @JSONField(name = "recruit_apply_status")
    private boolean recruitCanApply;

    @JSONField(name = "recruit_end_time")
    @Nullable
    private String recruitEndTime;

    @JSONField(name = "recruit_end_time_str")
    @Nullable
    private String recruitEndTimeStr;

    @JSONField(name = "recruit_id")
    @Nullable
    private String recruitId;

    @JSONField(name = "recruit_count")
    @Nullable
    private String recruitNumber;

    @JSONField(name = "recruit_questionnaire_finish_status")
    private boolean recruitQuestionnaireFinishStatus;

    @JSONField(name = "recruit_questionnaire_id")
    @Nullable
    private String recruitQuestionnaireId;

    @JSONField(name = "recruit_questionnaire_link")
    @Nullable
    private String recruitQuestionnaireUrl;

    @JSONField(name = "recruit_support")
    @Nullable
    private String recruitSupport;

    @JSONField(name = "recruit_test_type")
    @Nullable
    private String recruitTestType;

    @JSONField(name = "secret_agreement")
    @Nullable
    private String secretAgreement;

    @JSONField(name = "secret_agreement_finish_status")
    private boolean secretAgreementFinished;

    @JSONField(name = "secret_agreement_v2")
    @Nullable
    private SecretAgreement secretAgreementV2;

    @JSONField(name = "recruit_permission")
    private boolean recruitPermission = true;

    @JSONField(name = "recruit_apply_result")
    private int recruitApplyResult = -1;

    @NotNull
    private QuestionnaireCheckStatus questionnaireCheckStatus = new QuestionnaireCheckStatus(false, false);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameTestRecruitInfo$QuestionnaireCheckStatus.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class QuestionnaireCheckStatus implements Serializable {
        public static final int $stable = 8;
        private boolean hasQuestionnaireChecked;
        private boolean hasQuestionnaireFilled;

        public QuestionnaireCheckStatus(boolean z6, boolean z7) {
            this.hasQuestionnaireChecked = z6;
            this.hasQuestionnaireFilled = z7;
        }

        public final boolean getHasQuestionnaireChecked() {
            return this.hasQuestionnaireChecked;
        }

        public final boolean getHasQuestionnaireFilled() {
            return this.hasQuestionnaireFilled;
        }

        public final void setHasQuestionnaireChecked(boolean z6) {
            this.hasQuestionnaireChecked = z6;
        }

        public final void setHasQuestionnaireFilled(boolean z6) {
            this.hasQuestionnaireFilled = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameTestRecruitInfo$SecretAgreement.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class SecretAgreement implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "accept_agreement")
        private boolean acceptAgreement;

        @JSONField(name = "detail")
        @NotNull
        private String secretAgreementContent = "";

        public final boolean getAcceptAgreement() {
            return this.acceptAgreement;
        }

        @NotNull
        public final String getSecretAgreementContent() {
            return this.secretAgreementContent;
        }

        public final void setAcceptAgreement(boolean z6) {
            this.acceptAgreement = z6;
        }

        public final void setSecretAgreementContent(@NotNull String str) {
            this.secretAgreementContent = str;
        }
    }

    public final boolean getBooked() {
        return this.booked;
    }

    public final boolean getCurrentMainGame() {
        return this.currentMainGame;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    public final boolean getHasQuestionnaireChecked() {
        return this.hasQuestionnaireChecked;
    }

    public final boolean getHasQuestionnaireFilled() {
        return this.hasQuestionnaireFilled;
    }

    public final boolean getNeedApply() {
        boolean z6 = true;
        if (this.needBook != 1) {
            z6 = false;
        }
        return z6;
    }

    public final int getNeedBook() {
        return this.needBook;
    }

    public final int getNeedSecretAgreement() {
        return this.needSecretAgreement;
    }

    public final boolean getNewQuestionnaire() {
        return this.newQuestionnaire;
    }

    public final boolean getPrivate() {
        return this.f34private;
    }

    @NotNull
    public final QuestionnaireCheckStatus getQuestionnaireCheckStatus() {
        return this.questionnaireCheckStatus;
    }

    public final int getRecruitApplyResult() {
        return this.recruitApplyResult;
    }

    public final boolean getRecruitCanApply() {
        return this.recruitCanApply;
    }

    @Nullable
    public final String getRecruitEndTime() {
        return this.recruitEndTime;
    }

    @Nullable
    public final String getRecruitEndTimeStr() {
        return this.recruitEndTimeStr;
    }

    @Nullable
    public final String getRecruitId() {
        return this.recruitId;
    }

    @Nullable
    public final String getRecruitNumber() {
        return this.recruitNumber;
    }

    public final boolean getRecruitPermission() {
        return this.recruitPermission;
    }

    public final boolean getRecruitQuestionnaireFinishStatus() {
        return this.recruitQuestionnaireFinishStatus;
    }

    @Nullable
    public final String getRecruitQuestionnaireId() {
        return this.recruitQuestionnaireId;
    }

    @Nullable
    public final String getRecruitQuestionnaireUrl() {
        return this.recruitQuestionnaireUrl;
    }

    @Nullable
    public final String getRecruitSupport() {
        return this.recruitSupport;
    }

    @Nullable
    public final String getRecruitTestType() {
        return this.recruitTestType;
    }

    @Nullable
    public final String getSecretAgreement() {
        return this.secretAgreement;
    }

    public final boolean getSecretAgreementFinished() {
        return this.secretAgreementFinished;
    }

    @Nullable
    public final SecretAgreement getSecretAgreementV2() {
        return this.secretAgreementV2;
    }

    public final void setBooked(boolean z6) {
        this.booked = z6;
    }

    public final void setCurrentMainGame(boolean z6) {
        this.currentMainGame = z6;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setHasQuestionnaireChecked(boolean z6) {
        this.hasQuestionnaireChecked = z6;
    }

    public final void setHasQuestionnaireFilled(boolean z6) {
        this.hasQuestionnaireFilled = z6;
    }

    public final void setNeedBook(int i7) {
        this.needBook = i7;
    }

    public final void setNeedSecretAgreement(int i7) {
        this.needSecretAgreement = i7;
    }

    public final void setNewQuestionnaire(boolean z6) {
        this.newQuestionnaire = z6;
    }

    public final void setPrivate(boolean z6) {
        this.f34private = z6;
    }

    public final void setQuestionnaireCheckStatus(@NotNull QuestionnaireCheckStatus questionnaireCheckStatus) {
        this.questionnaireCheckStatus = questionnaireCheckStatus;
    }

    public final void setRecruitApplyResult(int i7) {
        this.recruitApplyResult = i7;
    }

    public final void setRecruitCanApply(boolean z6) {
        this.recruitCanApply = z6;
    }

    public final void setRecruitEndTime(@Nullable String str) {
        this.recruitEndTime = str;
    }

    public final void setRecruitEndTimeStr(@Nullable String str) {
        this.recruitEndTimeStr = str;
    }

    public final void setRecruitId(@Nullable String str) {
        this.recruitId = str;
    }

    public final void setRecruitNumber(@Nullable String str) {
        this.recruitNumber = str;
    }

    public final void setRecruitPermission(boolean z6) {
        this.recruitPermission = z6;
    }

    public final void setRecruitQuestionnaireFinishStatus(boolean z6) {
        this.recruitQuestionnaireFinishStatus = z6;
    }

    public final void setRecruitQuestionnaireId(@Nullable String str) {
        this.recruitQuestionnaireId = str;
    }

    public final void setRecruitQuestionnaireUrl(@Nullable String str) {
        this.recruitQuestionnaireUrl = str;
    }

    public final void setRecruitSupport(@Nullable String str) {
        this.recruitSupport = str;
    }

    public final void setRecruitTestType(@Nullable String str) {
        this.recruitTestType = str;
    }

    public final void setSecretAgreement(@Nullable String str) {
        this.secretAgreement = str;
    }

    public final void setSecretAgreementFinished(boolean z6) {
        this.secretAgreementFinished = z6;
    }

    public final void setSecretAgreementV2(@Nullable SecretAgreement secretAgreement) {
        this.secretAgreementV2 = secretAgreement;
    }

    @NotNull
    public String toString() {
        String str = this.recruitId;
        boolean z6 = this.recruitCanApply;
        int i7 = this.needBook;
        String str2 = this.recruitNumber;
        String str3 = this.recruitTestType;
        String str4 = this.recruitSupport;
        int i8 = this.needSecretAgreement;
        String str5 = this.secretAgreement;
        String str6 = this.recruitQuestionnaireUrl;
        String str7 = this.recruitQuestionnaireId;
        boolean z7 = this.recruitPermission;
        int i9 = this.recruitApplyResult;
        String str8 = this.recruitEndTime;
        String str9 = this.recruitEndTimeStr;
        boolean z8 = this.secretAgreementFinished;
        boolean z9 = this.booked;
        int i10 = this.gameBaseId;
        boolean z10 = this.recruitQuestionnaireFinishStatus;
        boolean z11 = this.newQuestionnaire;
        SecretAgreement secretAgreement = this.secretAgreementV2;
        boolean z12 = this.hasQuestionnaireFilled;
        boolean z13 = this.hasQuestionnaireChecked;
        String str10 = this.gameName;
        boolean z14 = this.f34private;
        boolean z15 = this.currentMainGame;
        QuestionnaireCheckStatus questionnaireCheckStatus = this.questionnaireCheckStatus;
        StringBuilder sbB = C3081k.b("GameTestRecruitInfo(recruitId=", str, ", recruitCanApply=", ", needBook=", z6);
        M.a(i7, ", recruitNumber=", str2, ", recruitTestType=", sbB);
        B.a(str3, ", recruitSupport=", str4, ", needSecretAgreement=", sbB);
        M.a(i8, ", secretAgreement=", str5, ", recruitQuestionnaireUrl=", sbB);
        B.a(str6, ", recruitQuestionnaireId=", str7, ", recruitPermission=", sbB);
        C3353d.b(", recruitApplyResult=", ", recruitEndTime=", i9, z7, sbB);
        B.a(str8, ", recruitEndTimeStr=", str9, ", secretAgreementFinished=", sbB);
        P.a(", booked=", ", gameBaseId=", sbB, z8, z9);
        d.a(", recruitQuestionnaireFinishStatus=", ", newQuestionnaire=", i10, z10, sbB);
        sbB.append(z11);
        sbB.append(", secretAgreementV2=");
        sbB.append(secretAgreement);
        sbB.append(", hasQuestionnaireFilled=");
        P.a(", hasQuestionnaireChecked=", ", gameName=", sbB, z12, z13);
        C3188c.a(str10, ", private=", ", currentMainGame=", sbB, z14);
        sbB.append(z15);
        sbB.append(", questionnaireCheckStatus=");
        sbB.append(questionnaireCheckStatus);
        sbB.append(")");
        return sbB.toString();
    }
}

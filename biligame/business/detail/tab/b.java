package com.bilibili.biligame.business.detail.tab;

import com.bilibili.biligame.api.bean.gamedetail.GameTestRecruitInfo;
import com.bilibili.biligame.business.detail.tab.DetailFragmentV2;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.ui.gamedetail.dialog.ConfidentialityAgreementDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/tab/b.class */
public final class b implements ConfidentialityAgreementDialog.ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameTestRecruitInfo f62585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DetailFragmentV2.i f62586b;

    public b(DetailFragmentV2.i iVar, GameTestRecruitInfo gameTestRecruitInfo) {
        this.f62586b = iVar;
        this.f62585a = gameTestRecruitInfo;
    }

    public final void accept() {
        DetailFragmentV2 detailFragmentV2 = this.f62586b.f62542a;
        DetailFragmentV2.z zVar = detailFragmentV2.f62513g;
        GameTestRecruitInfo gameTestRecruitInfo = this.f62585a;
        if (zVar != null) {
            gameTestRecruitInfo.getRecruitQuestionnaireUrl();
            zVar.a();
        } else {
            GameDetailCallback gameDetailCallback = detailFragmentV2.h;
            if (gameDetailCallback != null) {
                gameDetailCallback.onFillQuestionnaire(gameTestRecruitInfo.getRecruitQuestionnaireUrl());
            }
        }
    }

    public final void reject() {
    }
}

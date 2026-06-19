package com.bilibili.upper.module.manuscript.repository;

import com.alibaba.fastjson.JSON;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.upper.api.bean.manuscript.ArcAudit;
import com.bilibili.upper.module.manuscript.bean.ManuscriptReviewEntity;
import com.bilibili.upper.module.manuscript.bean.ProblemDetailBean;
import eJ0.C6925c;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/repository/b.class */
public final class b extends BiliApiDataCallback<ManuscriptReviewEntity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f113672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f113673c;

    public b(CancellableContinuationImpl cancellableContinuationImpl, e eVar) {
        this.f113672b = cancellableContinuationImpl;
        this.f113673c = eVar;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(ManuscriptReviewEntity manuscriptReviewEntity) {
        ProblemDetailBean problemDetailBean;
        ManuscriptReviewEntity manuscriptReviewEntity2 = manuscriptReviewEntity;
        if (manuscriptReviewEntity2 != null) {
            this.f113673c.getClass();
            ArrayList<ManuscriptReviewEntity.ProblemDetailEntity> arrayList = manuscriptReviewEntity2.problem_detail;
            if (arrayList == null || arrayList.isEmpty()) {
                problemDetailBean = null;
            } else {
                ArrayList<ManuscriptReviewEntity.ProblemDetailEntity> arrayList2 = manuscriptReviewEntity2.problem_detail;
                long j7 = manuscriptReviewEntity2.aid;
                problemDetailBean = new ProblemDetailBean();
                ArrayList arrayList3 = new ArrayList();
                for (ManuscriptReviewEntity.ProblemDetailEntity problemDetailEntity : arrayList2) {
                    ArcAudit.VideoAudit videoAudit = new ArcAudit.VideoAudit();
                    videoAudit.aid = j7;
                    videoAudit.index = problemDetailEntity.index;
                    videoAudit.rejectReasonId = problemDetailEntity.reject_reason_id;
                    videoAudit.rejectReason = problemDetailEntity.reject_reason;
                    videoAudit.rejectURL = problemDetailEntity.reject_reason_url;
                    videoAudit.modifyAdvise = problemDetailEntity.modify_advise;
                    videoAudit.problemDescription = problemDetailEntity.problem_description;
                    videoAudit.problemDescriptionTitle = problemDetailEntity.problem_description_title;
                    videoAudit.violationPics = problemDetailEntity.picture_data;
                    videoAudit.rejectVideoExplain = problemDetailEntity.reject_video_explain;
                    videoAudit.violationPosition = problemDetailEntity.violation_position;
                    videoAudit.violationTime = problemDetailEntity.violation_time;
                    arrayList3.add(videoAudit);
                }
                problemDetailBean.auditList = JSON.toJSONString(arrayList3);
                problemDetailBean.state = manuscriptReviewEntity2.state;
                problemDetailBean.statePanel = manuscriptReviewEntity2.state_panel;
                problemDetailBean.aid = j7;
                problemDetailBean.appealUrl = manuscriptReviewEntity2.app_appeal_url;
                problemDetailBean.appealState = manuscriptReviewEntity2.app_appeal_state;
                problemDetailBean.isOwner = 1;
                problemDetailBean.limitedOpen = manuscriptReviewEntity2.limited_open;
            }
            manuscriptReviewEntity2.problemDetailBean = problemDetailBean;
        }
        C6925c.a(this.f113672b, Result.box-impl(Result.constructor-impl(manuscriptReviewEntity2)));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        C6925c.a(this.f113672b, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th))));
    }
}

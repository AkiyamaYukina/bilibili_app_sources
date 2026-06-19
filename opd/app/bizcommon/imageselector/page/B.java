package com.bilibili.opd.app.bizcommon.imageselector.page;

import GA0.a;
import com.bilibili.opd.app.bizcommon.imageselector.component.Callback1Params;
import com.bilibili.upper.api.bean.uppercenter.AppealReason;
import com.bilibili.upper.module.manuscript.activity.LimitProblemShowActivity;
import com.bilibili.upper.module.manuscript.model.ArchiveAppealViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/B.class */
public final /* synthetic */ class B implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73747b;

    public /* synthetic */ B(Object obj, int i7) {
        this.f73746a = i7;
        this.f73747b = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = this.f73747b;
        switch (this.f73746a) {
            case 0:
                Callback1Params callback1Params = (Callback1Params) obj;
                if (callback1Params != null) {
                    ((MallMediaRootFragment) obj2).showBottom(callback1Params.getHidden());
                }
                return Unit.INSTANCE;
            default:
                AppealReason appealReason = (AppealReason) obj;
                int i7 = LimitProblemShowActivity.f113421H;
                LimitProblemShowActivity limitProblemShowActivity = (LimitProblemShowActivity) obj2;
                if (limitProblemShowActivity.Q6().f113702b.getValue() != null && appealReason != null) {
                    if (appealReason.permit == 1 && limitProblemShowActivity.Q6().f113702b.getValue().appealURL.length() > 0) {
                        ((ArchiveAppealViewModel) limitProblemShowActivity.f113424F.getValue()).K0(limitProblemShowActivity.Q6().h);
                        a.C0040a.b(GA0.a.f6978a, limitProblemShowActivity, limitProblemShowActivity.Q6().f113702b.getValue().appealURL);
                    } else if (appealReason.content.length() > 0) {
                        eJ0.H.b(limitProblemShowActivity, appealReason.content);
                    }
                }
                Unit unit = Unit.INSTANCE;
                return unit;
        }
    }
}

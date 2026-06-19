package com.bilibili.pegasus.page;

import com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisDismissAction;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/J.class */
public final /* synthetic */ class J implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeMachinePegasusFragment f78303a;

    public /* synthetic */ J(TimeMachinePegasusFragment timeMachinePegasusFragment) {
        this.f78303a = timeMachinePegasusFragment;
    }

    public final Object invoke(Object obj) {
        return TimeMachinePegasusFragment$showGraduationSeasonAnalysisDialog$1.invokeSuspend$lambda$2(this.f78303a, (GraduationSeasonAnalysisDismissAction) obj);
    }
}

package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import android.content.Context;
import android.net.Uri;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordService$createComponent$1$1.class */
public final class CheeseStudyRecordService$createComponent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<StudyRecord> $studyRecordFlow;
    int label;
    final CheeseStudyRecordService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyRecordService$createComponent$1$1(MutableStateFlow<StudyRecord> mutableStateFlow, CheeseStudyRecordService cheeseStudyRecordService, Continuation<? super CheeseStudyRecordService$createComponent$1$1> continuation) {
        super(2, continuation);
        this.$studyRecordFlow = mutableStateFlow;
        this.this$0 = cheeseStudyRecordService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyRecordService$createComponent$1$1(this.$studyRecordFlow, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (AppBuildConfig.Companion.isHDApp()) {
                BLRouter.routeTo$default(new RouteRequest.Builder(Uri.parse(((StudyRecord) this.$studyRecordFlow.getValue()).f90208a)).build(), (Context) null, 2, (Object) null);
            } else {
                CheeseStudyRecordService cheeseStudyRecordService = this.this$0;
                String str = ((StudyRecord) this.$studyRecordFlow.getValue()).f90208a;
                this.label = 1;
                cheeseStudyRecordService.getClass();
                x xVar = new x(new TheseusWebUIComponent(str, new com.bilibili.ogv.infra.jsb.d(), new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, 0, false, 0, 0, false, false, null, 1048510), null, null, null, null, 120));
                ArrayList arrayList = new ArrayList();
                SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
                selectKt$selectCancellingUnselected$scope$1.b(new CheeseStudyRecordService$keepStudyRecordLayerShowing$2$1(cheeseStudyRecordService, xVar, null));
                selectKt$selectCancellingUnselected$scope$1.b(new CheeseStudyRecordService$keepStudyRecordLayerShowing$2$2(cheeseStudyRecordService, xVar, null));
                Unit unit = Unit.INSTANCE;
                Object objFirst = FlowKt.first(FlowKt.merge(arrayList), this);
                if (objFirst != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objFirst = Unit.INSTANCE;
                }
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PageReportService.g(this.this$0.f90199e, "pugv.detail.study-log.detail.click", null, 6);
        return Unit.INSTANCE;
    }
}

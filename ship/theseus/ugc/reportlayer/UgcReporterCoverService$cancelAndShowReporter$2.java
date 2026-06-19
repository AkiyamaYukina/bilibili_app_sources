package com.bilibili.ship.theseus.ugc.reportlayer;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.bililive.room.ui.playtogether.l;
import com.bilibili.bililive.room.ui.playtogether.m;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.ugc.reportlayer.a;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$cancelAndShowReporter$2.class */
final class UgcReporterCoverService$cancelAndShowReporter$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final UgcReporterCoverService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$cancelAndShowReporter$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$cancelAndShowReporter$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcReporterCoverService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcReporterCoverService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object next;
            boolean z6 = true;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcReporterCoverService ugcReporterCoverService = this.this$0;
                this.label = 1;
                ugcReporterCoverService.getClass();
                a.C0925a c0925a = new a.C0925a(new c(ugcReporterCoverService, 0), new l(ugcReporterCoverService, 1), new m(ugcReporterCoverService, 1));
                String str = ugcReporterCoverService.f98472e.f104046l;
                Iterator<T> it = ugcReporterCoverService.f98477k.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((o0) next).a()) {
                        break;
                    }
                }
                if (next == null) {
                    z6 = false;
                }
                ua0.c cVar = new ua0.c(2, 45, (BitmapTransformation) null);
                if (str != null) {
                    if (!Intrinsics.areEqual(str, c0925a.f98489f)) {
                        c0925a.f98489f = str;
                        c0925a.notifyPropertyChanged(67);
                    }
                    if (z6 != c0925a.f98488e) {
                        c0925a.f98488e = z6;
                        c0925a.notifyPropertyChanged(267);
                    }
                    if (!Intrinsics.areEqual(cVar, c0925a.f98490g)) {
                        c0925a.f98490g = cVar;
                        c0925a.notifyPropertyChanged(66);
                    }
                }
                RunningUIComponent runningUIComponent = new RunningUIComponent(new a(c0925a), 0, new UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1(ugcReporterCoverService, c0925a, null), 2);
                ArrayList arrayList = new ArrayList();
                SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
                selectKt$selectCancellingUnselected$scope$1.b(new UgcReporterCoverService$keepReporterLayerShowing$2$1(ugcReporterCoverService, runningUIComponent, null));
                selectKt$selectCancellingUnselected$scope$1.b(new UgcReporterCoverService$keepReporterLayerShowing$2$2(runningUIComponent, null));
                Unit unit = Unit.INSTANCE;
                Object objFirst = FlowKt.first(FlowKt.merge(arrayList), this);
                if (objFirst != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objFirst = Unit.INSTANCE;
                }
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcReporterCoverService$cancelAndShowReporter$2(UgcReporterCoverService ugcReporterCoverService, Continuation<? super UgcReporterCoverService$cancelAndShowReporter$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcReporterCoverService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcReporterCoverService$cancelAndShowReporter$2 ugcReporterCoverService$cancelAndShowReporter$2 = new UgcReporterCoverService$cancelAndShowReporter$2(this.this$0, continuation);
        ugcReporterCoverService$cancelAndShowReporter$2.L$0 = obj;
        return ugcReporterCoverService$cancelAndShowReporter$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Job job = this.this$0.f98481o;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        UgcReporterCoverService ugcReporterCoverService = this.this$0;
        ugcReporterCoverService.f98481o = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(ugcReporterCoverService, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}

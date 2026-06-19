package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import com.bilibili.playerbizcommon.features.interactvideo.model.Story;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$collectHalfHistoriesGraph$1.class */
final class TheseusInteractVideoService$collectHalfHistoriesGraph$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$collectHalfHistoriesGraph$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$collectHalfHistoriesGraph$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(TheseusInteractVideoService theseusInteractVideoService, MutableSharedFlow mutableSharedFlow) {
            theseusInteractVideoService.k();
            Unit unit = Unit.INSTANCE;
            mutableSharedFlow.tryEmit(unit);
            return unit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(TheseusInteractVideoService theseusInteractVideoService, MutableSharedFlow mutableSharedFlow, long j7, long j8, int i7, long j9, int i8) {
            theseusInteractVideoService.j(new com.bilibili.app.gemini.ugc.feature.interactivevideo.j(j7, j8, "", 0L, i7, i8, (int) j9), null, true);
            Unit unit = Unit.INSTANCE;
            mutableSharedFlow.tryEmit(unit);
            return unit;
        }

        private static final Unit invokeSuspend$lambda$2(TheseusInteractVideoService theseusInteractVideoService, m mVar, MutableSharedFlow mutableSharedFlow, com.bilibili.ogv.infra.coroutine.c cVar) {
            cVar.b(new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$1(theseusInteractVideoService, mVar, null));
            cVar.b(new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$2(theseusInteractVideoService, mVar, null));
            cVar.b(new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$3(mutableSharedFlow, mVar, null));
            cVar.b(new TheseusInteractVideoService$collectHalfHistoriesGraph$1$1$1$4(theseusInteractVideoService, mVar, null));
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List<Story> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                InteractNode interactNode = this.this$0.f99866C;
                List<Story> mStorys = interactNode != null ? interactNode.getMStorys() : null;
                if (interactNode == null || (list = mStorys) == null || list.isEmpty()) {
                    com.bilibili.playerbizcommonv2.utils.p.j(2131845828);
                    return Unit.INSTANCE;
                }
                if (interactNode.getNoBacktracking() == 1) {
                    BLog.i("TheseusInteractVideoService$collectHalfHistoriesGraph$1$1-invokeSuspend", "[theseus-united-TheseusInteractVideoService$collectHalfHistoriesGraph$1$1-invokeSuspend] no backtracking");
                    com.bilibili.playerbizcommonv2.utils.p.j(2131847234);
                    return Unit.INSTANCE;
                }
                MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
                TheseusInteractVideoService theseusInteractVideoService = this.this$0;
                m mVar = new m(mStorys, new p(theseusInteractVideoService, mutableSharedFlowMutableSharedFlow$default), new q(theseusInteractVideoService, mutableSharedFlowMutableSharedFlow$default), theseusInteractVideoService.f99904u.f102939c);
                TheseusInteractVideoService theseusInteractVideoService2 = this.this$0;
                this.label = 1;
                ArrayList arrayList = new ArrayList();
                invokeSuspend$lambda$2(theseusInteractVideoService2, mVar, mutableSharedFlowMutableSharedFlow$default, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
                if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
    public TheseusInteractVideoService$collectHalfHistoriesGraph$1(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super TheseusInteractVideoService$collectHalfHistoriesGraph$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusInteractVideoService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$collectHalfHistoriesGraph$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusInteractVideoService theseusInteractVideoService = this.this$0;
            SharedFlow<Unit> sharedFlow = theseusInteractVideoService.f99895l.f99966c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusInteractVideoService, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

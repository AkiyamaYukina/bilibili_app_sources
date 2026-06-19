package com.bilibili.ship.theseus.united.page.miniplayer;

import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectAutoMiniSuppress$1.class */
final class MiniPlayerSuppressionService$collectAutoMiniSuppress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MiniPlayerSuppressionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$collectAutoMiniSuppress$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectAutoMiniSuppress$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;
        final MiniPlayerSuppressionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = miniPlayerSuppressionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
            a aVar = miniPlayerSuppressionService.f102037e;
            aVar.getClass();
            boolean zC = a.c();
            boolean zD = aVar.d();
            boolean z6 = true;
            if (!miniPlayerSuppressionService.f102037e.e() && (zC || zD)) {
                z6 = false;
            }
            ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = miniPlayerSuppressionService.f102039g;
            if (z6) {
                toolbarMiniPlayerRepository.b("autoMiniPlayerSettingSuppressor");
            } else {
                toolbarMiniPlayerRepository.a("autoMiniPlayerSettingSuppressor");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerSuppressionService$collectAutoMiniSuppress$1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super MiniPlayerSuppressionService$collectAutoMiniSuppress$1> continuation) {
        super(2, continuation);
        this.this$0 = miniPlayerSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiniPlayerSuppressionService$collectAutoMiniSuppress$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
            StateFlow<Boolean> stateFlow = miniPlayerSuppressionService.f102037e.f129911c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(miniPlayerSuppressionService, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

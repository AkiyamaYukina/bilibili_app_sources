package com.bilibili.ship.theseus.united.page.miniplayer;

import com.bilibili.ship.theseus.united.page.miniplayer.b;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.videoplayer.coreV2.adapter.ijk.IjkMediaItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$collectQualityParamsScreenState$1.class */
final class DetailMiniPlayerService$collectQualityParamsScreenState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.DetailMiniPlayerService$collectQualityParamsScreenState$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$collectQualityParamsScreenState$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<b.InterfaceC1071b, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(b.InterfaceC1071b interfaceC1071b, Continuation<? super Unit> continuation) {
            return create(interfaceC1071b, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IPlayerCoreService iPlayerCoreService = this.this$0.h;
            TheseusPlayerQualityParamsConfigService.ScreenState screenState = TheseusPlayerQualityParamsConfigService.ScreenState.STATE_MINI;
            IjkMediaItem currentMediaItem = iPlayerCoreService.getCurrentMediaItem();
            IjkMediaItem ijkMediaItem = currentMediaItem instanceof IjkMediaItem ? currentMediaItem : null;
            if (ijkMediaItem != null) {
                BLog.i("PlayerQualityParamsConfigService", "updateScreenState: " + screenState);
                ijkMediaItem.setScreenState(screenState.getValue());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMiniPlayerService$collectQualityParamsScreenState$1(b bVar, Continuation<? super DetailMiniPlayerService$collectQualityParamsScreenState$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailMiniPlayerService$collectQualityParamsScreenState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar = this.this$0;
            SharedFlow<b.InterfaceC1071b> sharedFlow = bVar.f102064u;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
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

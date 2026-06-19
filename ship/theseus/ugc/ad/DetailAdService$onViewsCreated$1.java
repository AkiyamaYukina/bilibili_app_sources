package com.bilibili.ship.theseus.ugc.ad;

import android.content.res.Configuration;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import com.bilibili.ship.theseus.united.page.ad.AdPanelHelper;
import com.bilibili.ship.theseus.united.page.ad.AdPanelRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$1.class */
final class DetailAdService$onViewsCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Configuration, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final DetailAdService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailAdService detailAdService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailAdService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Configuration configuration, Continuation<? super Unit> continuation) {
            return create(configuration, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            com.bilibili.ship.theseus.united.page.ad.a<?> aVar;
            com.bilibili.ship.theseus.united.page.ad.a<?> aVar2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Configuration configuration = (Configuration) this.L$0;
            IAdUnderPlayerCallback iAdUnderPlayerCallback = this.this$0.f96270t;
            if (iAdUnderPlayerCallback != null) {
                iAdUnderPlayerCallback.onConfigurationChanged(configuration);
            }
            AdPanelRepository adPanelRepository = this.this$0.f96254c.f98927b;
            AdPanelHelper adPanelHelper = adPanelRepository.f98911k;
            if (adPanelHelper != null && (aVar2 = adPanelHelper.f98900j) != null) {
                aVar2.f98952a.onConfigurationChanged(configuration);
            }
            AdPanelHelper adPanelHelper2 = adPanelRepository.f98912l;
            if (adPanelHelper2 != null && (aVar = adPanelHelper2.f98900j) != null) {
                aVar.f98952a.onConfigurationChanged(configuration);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onViewsCreated$1(DetailAdService detailAdService, Continuation<? super DetailAdService$onViewsCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$onViewsCreated$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            DetailAdService detailAdService = this.this$0;
            Flow<Configuration> flow = detailAdService.f96259i;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(detailAdService, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

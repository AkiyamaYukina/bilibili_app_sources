package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1.class */
public final class WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $layerConfig;
    final TheseusWebUIComponent $uiComponent;
    int label;
    final WebFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.a $layerConfig;
        final TheseusWebUIComponent $uiComponent;
        int label;
        final WebFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebFloatLayerService webFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = webFloatLayerService;
            this.$uiComponent = theseusWebUIComponent;
            this.$layerConfig = aVar;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f104239a;
                TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
                TheseusFloatLayerService.a aVar = this.$layerConfig;
                this.label = 1;
                if (theseusFloatLayerService.e(theseusWebUIComponent, aVar, this) == coroutine_suspended) {
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
    public WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1(WebFloatLayerService webFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1> continuation) {
        super(1, continuation);
        this.this$0 = webFloatLayerService;
        this.$uiComponent = theseusWebUIComponent;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            WebFloatLayerService webFloatLayerService = this.this$0;
            BackActionRepository backActionRepository = webFloatLayerService.f104242d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(webFloatLayerService, this.$uiComponent, this.$layerConfig, null);
            this.label = 1;
            if (backActionRepository.a(anonymousClass1, this) == coroutine_suspended) {
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

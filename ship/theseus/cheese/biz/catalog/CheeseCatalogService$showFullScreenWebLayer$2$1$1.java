package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$showFullScreenWebLayer$2$1$1.class */
public final class CheeseCatalogService$showFullScreenWebLayer$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusWebUIComponent $webUiComponent;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$showFullScreenWebLayer$2$1$1(CheeseCatalogService cheeseCatalogService, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super CheeseCatalogService$showFullScreenWebLayer$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = cheeseCatalogService;
        this.$webUiComponent = theseusWebUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseCatalogService$showFullScreenWebLayer$2$1$1(this.this$0, this.$webUiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f89116l;
            TheseusWebUIComponent theseusWebUIComponent = this.$webUiComponent;
            this.label = 1;
            if (theseusFloatLayerService.f(theseusWebUIComponent, null, this) == coroutine_suspended) {
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

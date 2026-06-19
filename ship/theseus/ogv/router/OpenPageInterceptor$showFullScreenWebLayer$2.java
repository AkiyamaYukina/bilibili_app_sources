package com.bilibili.ship.theseus.ogv.router;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ogv.infra.coroutine.c;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/router/OpenPageInterceptor$showFullScreenWebLayer$2.class */
final class OpenPageInterceptor$showFullScreenWebLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    private Object L$0;
    int label;
    final OpenPageInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPageInterceptor$showFullScreenWebLayer$2(OpenPageInterceptor openPageInterceptor, String str, Continuation<? super OpenPageInterceptor$showFullScreenWebLayer$2> continuation) {
        super(2, continuation);
        this.this$0 = openPageInterceptor;
        this.$url = str;
    }

    private static final Unit invokeSuspend$lambda$0(TheseusWebUIComponent theseusWebUIComponent, OpenPageInterceptor openPageInterceptor, com.bilibili.ship.theseus.ogv.web.ui.a aVar, c cVar) {
        cVar.b(new OpenPageInterceptor$showFullScreenWebLayer$2$1$1(openPageInterceptor, aVar, null));
        cVar.a(theseusWebUIComponent.f104195o);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenPageInterceptor$showFullScreenWebLayer$2 openPageInterceptor$showFullScreenWebLayer$2 = new OpenPageInterceptor$showFullScreenWebLayer$2(this.this$0, this.$url, continuation);
        openPageInterceptor$showFullScreenWebLayer$2.L$0 = obj;
        return openPageInterceptor$showFullScreenWebLayer$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TheseusWebUIComponent theseusWebUIComponentB = WebFloatLayerService.b(this.this$0.f94437b, this.$url, new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, 0, false, 0, 0, false, false, null, 1048574));
            com.bilibili.ship.theseus.ogv.web.ui.a aVar = new com.bilibili.ship.theseus.ogv.web.ui.a(theseusWebUIComponentB, new OpenPageInterceptor$showFullScreenWebLayer$2$uiComponent$1(coroutineScope));
            OpenPageInterceptor openPageInterceptor = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(theseusWebUIComponentB, openPageInterceptor, aVar, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
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

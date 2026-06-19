package com.bilibili.ship.theseus.cheese.biz.catalog;

import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import java.util.ArrayList;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$showFullScreenWebLayer$2.class */
final class CheeseCatalogService$showFullScreenWebLayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $url;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$showFullScreenWebLayer$2(CheeseCatalogService cheeseCatalogService, String str, Continuation<? super CheeseCatalogService$showFullScreenWebLayer$2> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogService;
        this.$url = str;
    }

    private static final Unit invokeSuspend$lambda$0(TheseusWebUIComponent theseusWebUIComponent, CheeseCatalogService cheeseCatalogService, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new CheeseCatalogService$showFullScreenWebLayer$2$1$1(cheeseCatalogService, theseusWebUIComponent, null));
        cVar.a(theseusWebUIComponent.f104195o);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogService$showFullScreenWebLayer$2(this.this$0, this.$url, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f89118n.pause();
            BLog.i("CheeseCatalogService$showFullScreenWebLayer$2-invokeSuspend", "[theseus-cheese-CheeseCatalogService$showFullScreenWebLayer$2-invokeSuspend] Player paused: showing cheese credential full screen web layer.");
            CheeseCatalogService cheeseCatalogService = this.this$0;
            TheseusWebUIComponent theseusWebUIComponentB = WebFloatLayerService.b(cheeseCatalogService.f89121q, this.$url, new TheseusWebUIComponent.a(false, null, 0, 0, 0, false, cheeseCatalogService.f89125u.i() ? -1 : 2131245270, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(this.this$0.f89125u.b(), 0, 1, (Object) null)), false, false, null, 1011838));
            CheeseCatalogService cheeseCatalogService2 = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(theseusWebUIComponentB, cheeseCatalogService2, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f89118n.p();
        BLog.i("CheeseCatalogService$showFullScreenWebLayer$2-invokeSuspend", "[theseus-cheese-CheeseCatalogService$showFullScreenWebLayer$2-invokeSuspend] Player resumed after showing cheese credential full screen web layer.");
        return Unit.INSTANCE;
    }
}

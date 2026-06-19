package com.bilibili.ship.theseus.united.page.intro.module.tags;

import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsService$cellClick$1.class */
public final class TagsService$cellClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a $cell;
    int label;
    final TagsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsService$cellClick$1(TagsService tagsService, a aVar, Continuation<? super TagsService$cellClick$1> continuation) {
        super(2, continuation);
        this.this$0 = tagsService;
        this.$cell = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TagsService$cellClick$1(this.this$0, this.$cell, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            WebFloatLayerService webFloatLayerService = this.this$0.f101919f;
            a aVar = this.$cell;
            String str = aVar.f101935f;
            Integer numN = p.n(aVar.f101943o.f101945a);
            int iIntValue = numN != null ? numN.intValue() : 0;
            Integer numN2 = p.n(this.$cell.f101943o.f101947c);
            int iIntValue2 = numN2 != null ? numN2.intValue() : 0;
            Integer numN3 = p.n(this.$cell.f101943o.f101946b);
            TheseusWebUIComponent.a aVar2 = new TheseusWebUIComponent.a(false, aVar.f101939k, iIntValue, iIntValue2, numN3 != null ? numN3.intValue() : 0, false, 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(this.this$0.f101921i.b(), 0, 1, (Object) null)), false, false, null, 1015777);
            this.label = 1;
            if (webFloatLayerService.d(str, aVar2, this) == coroutine_suspended) {
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

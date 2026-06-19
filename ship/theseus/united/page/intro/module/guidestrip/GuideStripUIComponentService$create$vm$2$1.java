package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ov0.InterfaceC8269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$create$vm$2$1.class */
public final class GuideStripUIComponentService$create$vm$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GuideStripVo $guideBar;
    int label;
    final GuideStripUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$create$vm$2$1(GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo, Continuation<? super GuideStripUIComponentService$create$vm$2$1> continuation) {
        super(2, continuation);
        this.this$0 = guideStripUIComponentService;
        this.$guideBar = guideStripVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GuideStripUIComponentService$create$vm$2$1(this.this$0, this.$guideBar, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8269a interfaceC8269a = this.this$0.f100071c;
            String str = this.$guideBar.f100087j;
            this.label = 1;
            if (interfaceC8269a.a(str, this) == coroutine_suspended) {
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

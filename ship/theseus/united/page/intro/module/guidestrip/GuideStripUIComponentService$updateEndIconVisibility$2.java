package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$updateEndIconVisibility$2.class */
final class GuideStripUIComponentService$updateEndIconVisibility$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final f.a $vm;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$updateEndIconVisibility$2(f.a aVar, Continuation<? super GuideStripUIComponentService$updateEndIconVisibility$2> continuation) {
        super(2, continuation);
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuideStripUIComponentService$updateEndIconVisibility$2 guideStripUIComponentService$updateEndIconVisibility$2 = new GuideStripUIComponentService$updateEndIconVisibility$2(this.$vm, continuation);
        guideStripUIComponentService$updateEndIconVisibility$2.Z$0 = ((Boolean) obj).booleanValue();
        return guideStripUIComponentService$updateEndIconVisibility$2;
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
        boolean z6 = this.Z$0;
        f.a aVar = this.$vm;
        if (z6 != aVar.f100139r) {
            aVar.f100139r = z6;
            aVar.notifyPropertyChanged(186);
        }
        return Unit.INSTANCE;
    }
}

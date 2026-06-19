package com.bilibili.ship.theseus.united.page.intro.module.guidestrip;

import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.f;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/guidestrip/GuideStripUIComponentService$collectProfessionalState$2$1.class */
final class GuideStripUIComponentService$collectProfessionalState$2$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final GuideStripVo $guideBar;
    final f.a $vm;
    int I$0;
    int label;
    final GuideStripUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStripUIComponentService$collectProfessionalState$2$1(f.a aVar, GuideStripUIComponentService guideStripUIComponentService, GuideStripVo guideStripVo, Continuation<? super GuideStripUIComponentService$collectProfessionalState$2$1> continuation) {
        super(2, continuation);
        this.$vm = aVar;
        this.this$0 = guideStripUIComponentService;
        this.$guideBar = guideStripVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuideStripUIComponentService$collectProfessionalState$2$1 guideStripUIComponentService$collectProfessionalState$2$1 = new GuideStripUIComponentService$collectProfessionalState$2$1(this.$vm, this.this$0, this.$guideBar, continuation);
        guideStripUIComponentService$collectProfessionalState$2$1.I$0 = ((Number) obj).intValue();
        return guideStripUIComponentService$collectProfessionalState$2$1;
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = this.I$0;
        if (i7 <= 0) {
            this.$vm.m(0);
        } else {
            this.$vm.m(Uj0.c.b(50, this.this$0.f100069a));
            f.a aVar = this.$vm;
            String str = String.format(this.$guideBar.d(), Arrays.copyOf(new Object[]{Boxing.boxInt(i7)}, 1));
            if (!Intrinsics.areEqual(str, aVar.f100129g)) {
                aVar.f100129g = str;
                aVar.notifyPropertyChanged(655);
            }
        }
        return Unit.INSTANCE;
    }
}

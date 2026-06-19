package com.bilibili.ship.theseus.united.page;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.view.s;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/AutoPlayService$showFirstFrame$1.class */
final class AutoPlayService$showFirstFrame$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final AutoPlayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPlayService$showFirstFrame$1(AutoPlayService autoPlayService, Continuation<? super AutoPlayService$showFirstFrame$1> continuation) {
        super(2, continuation);
        this.this$0 = autoPlayService;
    }

    private static final Unit invokeSuspend$lambda$0(AutoPlayService autoPlayService, String str, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new AutoPlayService$showFirstFrame$1$1$1(autoPlayService, null));
        cVar.b(new AutoPlayService$showFirstFrame$1$1$2(autoPlayService, null));
        cVar.b(new AutoPlayService$showFirstFrame$1$1$3(autoPlayService, str, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoPlayService$showFirstFrame$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) s.f104123a.getValue()).booleanValue()) {
                BLog.i("AutoPlayService$showFirstFrame$1-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1-invokeSuspend] skip overlay: preload disabled");
                return Unit.INSTANCE;
            }
            String str = (String) this.this$0.f98790d.f121513d.getValue();
            if (str == null) {
                BLog.i("AutoPlayService$showFirstFrame$1-invokeSuspend", "[theseus-united-AutoPlayService$showFirstFrame$1-invokeSuspend] skip overlay: no image");
                return Unit.INSTANCE;
            }
            defpackage.a.b("[theseus-united-AutoPlayService$showFirstFrame$1-invokeSuspend] ", "first frame url: ".concat(str), "AutoPlayService$showFirstFrame$1-invokeSuspend");
            AutoPlayService autoPlayService = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(autoPlayService, str, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
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

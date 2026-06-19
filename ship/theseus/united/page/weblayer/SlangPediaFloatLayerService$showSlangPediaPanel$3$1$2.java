package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$showSlangPediaPanel$3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$showSlangPediaPanel$3$1$2.class */
public final class SlangPediaFloatLayerService$showSlangPediaPanel$3$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final SlangPediaFloatLayerService$showSlangPediaPanel$3.a $globalLayoutListener;
    final Ref.ObjectRef<com.bilibili.playerbizcommon.utils.l> $ugcSoftKeyBoardHelper;
    final TheseusWebUIComponent $uiComponent;
    final String $url;
    int label;
    final SlangPediaFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlangPediaFloatLayerService$showSlangPediaPanel$3$1$2(TheseusWebUIComponent theseusWebUIComponent, Ref.ObjectRef<com.bilibili.playerbizcommon.utils.l> objectRef, SlangPediaFloatLayerService slangPediaFloatLayerService, SlangPediaFloatLayerService$showSlangPediaPanel$3.a aVar, String str, Continuation<? super SlangPediaFloatLayerService$showSlangPediaPanel$3$1$2> continuation) {
        super(1, continuation);
        this.$uiComponent = theseusWebUIComponent;
        this.$ugcSoftKeyBoardHelper = objectRef;
        this.this$0 = slangPediaFloatLayerService;
        this.$globalLayoutListener = aVar;
        this.$url = str;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SlangPediaFloatLayerService$showSlangPediaPanel$3$1$2(this.$uiComponent, this.$ugcSoftKeyBoardHelper, this.this$0, this.$globalLayoutListener, this.$url, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow mutableSharedFlow = this.$uiComponent.f104195o;
            this.label = 1;
            if (FlowKt.first(mutableSharedFlow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        com.bilibili.playerbizcommon.utils.l lVar = (com.bilibili.playerbizcommon.utils.l) this.$ugcSoftKeyBoardHelper.element;
        if (lVar != null) {
            lVar.c();
        }
        this.this$0.f104154b.getWindow().getDecorView().removeOnLayoutChangeListener(this.$globalLayoutListener);
        BLog.i("SlangPediaFloatLayerService", "float layer close by user click close");
        SlangPediaFloatLayerService.a(this.this$0, this.$url, "1");
        return Unit.INSTANCE;
    }
}

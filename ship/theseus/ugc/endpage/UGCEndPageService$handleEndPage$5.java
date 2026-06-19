package com.bilibili.ship.theseus.ugc.endpage;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService$handleEndPage$5.class */
public final class UGCEndPageService$handleEndPage$5 extends SuspendLambda implements Function2<Triple<? extends c.a, ? extends Boolean, ? extends WindowSizeClass>, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final UGCEndPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEndPageService$handleEndPage$5(UGCEndPageService uGCEndPageService, Continuation<? super UGCEndPageService$handleEndPage$5> continuation) {
        super(2, continuation);
        this.this$0 = uGCEndPageService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEndPageService$handleEndPage$5 uGCEndPageService$handleEndPage$5 = new UGCEndPageService$handleEndPage$5(this.this$0, continuation);
        uGCEndPageService$handleEndPage$5.L$0 = obj;
        return uGCEndPageService$handleEndPage$5;
    }

    public final Object invoke(Triple<c.a, Boolean, WindowSizeClass> triple, Continuation<? super Unit> continuation) {
        return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.i iVar;
        UGCEndPageService uGCEndPageService;
        UGCEndPageService uGCEndPageService2;
        com.bilibili.ship.theseus.united.page.playingarea.i iVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Triple triple = (Triple) this.L$0;
            c.a aVar = (c.a) triple.component1();
            boolean zBooleanValue = ((Boolean) triple.component2()).booleanValue();
            if (this.this$0.f96478a.f91107a.k() == PlayerAvailability.COMPLETED && !zBooleanValue) {
                IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
                layoutParams.setEnterAnim(-1);
                layoutParams.setExitAnim(-1);
                layoutParams.setFunctionType(1);
                layoutParams.setLayoutType(32);
                Object obj2 = !aVar.f102988b ? this.this$0.f96482e.get() : (aVar.f102987a && this.this$0.f96492p.i()) ? this.this$0.f96483f.get() : this.this$0.f96484g.get();
                this.this$0.f96481d.hide();
                this.this$0.f96487k.removeAllToast();
                UGCEndPageService uGCEndPageService3 = this.this$0;
                iVar = uGCEndPageService3.f96486j;
                iVar.a(uGCEndPageService3);
                try {
                    UGCEndPageService$handleEndPage$5$1$1 uGCEndPageService$handleEndPage$5$1$1 = new UGCEndPageService$handleEndPage$5$1$1(uGCEndPageService3, obj2, layoutParams, aVar, null);
                    this.L$0 = iVar;
                    this.L$1 = uGCEndPageService3;
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(uGCEndPageService$handleEndPage$5$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uGCEndPageService2 = uGCEndPageService3;
                } catch (Throwable th) {
                    th = th;
                    uGCEndPageService = uGCEndPageService3;
                    iVar.c(uGCEndPageService);
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UGCEndPageService uGCEndPageService4 = (UGCEndPageService) this.L$1;
        iVar = (com.bilibili.ship.theseus.united.page.playingarea.i) this.L$0;
        uGCEndPageService = uGCEndPageService4;
        iVar2 = iVar;
        try {
            ResultKt.throwOnFailure(obj);
            uGCEndPageService2 = uGCEndPageService4;
        } catch (Throwable th2) {
            th = th2;
            iVar = iVar2;
            iVar.c(uGCEndPageService);
            throw th;
        }
        uGCEndPageService = uGCEndPageService2;
        iVar2 = iVar;
        Unit unit = Unit.INSTANCE;
        iVar.c(uGCEndPageService2);
        return Unit.INSTANCE;
    }
}

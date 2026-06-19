package com.bilibili.ship.theseus.ogv.intro;

import androidx.fragment.app.Fragment;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.floatlayer.d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvVipCashierShowingService$keepVipCashierLayerShowing$2.class */
final class OgvVipCashierShowingService$keepVipCashierLayerShowing$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Class<? extends Fragment> $externalBizFragmentClazz;
    final Qj0.d $fragmentSeed;
    final d.a $vm;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final Q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipCashierShowingService$keepVipCashierLayerShowing$2(d.a aVar, Q q7, Class<? extends Fragment> cls, Qj0.d dVar, Continuation<? super OgvVipCashierShowingService$keepVipCashierLayerShowing$2> continuation) {
        super(2, continuation);
        this.$vm = aVar;
        this.this$0 = q7;
        this.$externalBizFragmentClazz = cls;
        this.$fragmentSeed = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVipCashierShowingService$keepVipCashierLayerShowing$2 ogvVipCashierShowingService$keepVipCashierLayerShowing$2 = new OgvVipCashierShowingService$keepVipCashierLayerShowing$2(this.$vm, this.this$0, this.$externalBizFragmentClazz, this.$fragmentSeed, continuation);
        ogvVipCashierShowingService$keepVipCashierLayerShowing$2.L$0 = obj;
        return ogvVipCashierShowingService$keepVipCashierLayerShowing$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0161: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r17 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:41:0x0161 */
    public final Object invokeSuspend(Object obj) {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        CoroutineScope coroutineScope;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Q q7;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q7 = (Q) this.L$2;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$1;
                gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar = q7.f92271e;
                    cVar.f100709m.setValue(Boolean.TRUE);
                    gVar2.j(coroutineScope);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    coroutineScope = coroutineScope2;
                    com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar2 = q7.f92271e;
                    cVar2.f100709m.setValue(Boolean.TRUE);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            UIComponent<?> dVar = new com.bilibili.ship.theseus.united.page.floatlayer.d<>(this.$vm, new com.bilibili.ship.theseus.united.page.floatlayer.e(this.this$0.f92268b, this.$externalBizFragmentClazz, this.$fragmentSeed.f19964b, new OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1(coroutineScope, null)));
            Q q8 = this.this$0;
            gVar2 = q8.f92270d;
            gVar2.f(coroutineScope);
            try {
                com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar3 = q8.f92271e;
                cVar3.f100709m.setValue(Boolean.FALSE);
                TheseusFloatLayerService theseusFloatLayerService = q8.f92269c;
                this.L$0 = gVar2;
                this.L$1 = coroutineScope;
                this.L$2 = q8;
                this.label = 1;
                if (theseusFloatLayerService.h(dVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                q7 = q8;
                com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar4 = q7.f92271e;
                cVar4.f100709m.setValue(Boolean.TRUE);
                gVar2.j(coroutineScope);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                q7 = q8;
                th = th3;
                com.bilibili.ship.theseus.united.page.intro.module.promptbar.c cVar22 = q7.f92271e;
                cVar22.f100709m.setValue(Boolean.TRUE);
                throw th;
            }
        } catch (Throwable th4) {
            gVar.j(coroutine_suspended);
            throw th4;
        }
    }
}

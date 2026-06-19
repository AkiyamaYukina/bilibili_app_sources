package com.bilibili.pegasus.components.recover;

import androidx.lifecycle.ViewModel;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.config.FlushRecoverConfig;
import com.bilibili.pegasus.vm.PegasusViewModel;
import hp0.C7488c;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$showRecoverTips$1.class */
final class CardRecoverComponent$showRecoverTips$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final j $action;
    int label;
    final CardRecoverComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRecoverComponent$showRecoverTips$1(CardRecoverComponent cardRecoverComponent, j jVar, Continuation<? super CardRecoverComponent$showRecoverTips$1> continuation) {
        super(2, continuation);
        this.this$0 = cardRecoverComponent;
        this.$action = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardRecoverComponent$showRecoverTips$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List<C7488c> listG;
        HolderExtra holderExtra;
        HolderExtra holderExtra2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CardRecoverComponent cardRecoverComponent = this.this$0;
            j jVar = this.$action;
            FlushRecoverConfig flushRecoverConfig = jVar.f77159a;
            this.label = 1;
            Object objB = CardRecoverComponent.b(cardRecoverComponent, flushRecoverConfig, jVar.f77161c, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            CardRecoverComponent cardRecoverComponent2 = this.this$0;
            j jVar2 = this.$action;
            cardRecoverComponent2.getClass();
            for (PegasusHolderData pegasusHolderData : jVar2.f77160b) {
                pegasusHolderData.getExtra().setRecoverCard(true);
                pegasusHolderData.getExtra().setRecoverExposed(false);
                if (pegasusHolderData instanceof gp0.c) {
                    List<gp0.b> listK = ((gp0.c) pegasusHolderData).k();
                    if (listK != null) {
                        Iterator<T> it = listK.iterator();
                        while (it.hasNext()) {
                            BasePegasusData basePegasusDataM = ((gp0.b) it.next()).m();
                            if (basePegasusDataM != null) {
                                basePegasusDataM.getExtra().setRecoverCard(true);
                                basePegasusDataM.getExtra().setRecoverExposed(false);
                            }
                        }
                    }
                } else if ((pegasusHolderData instanceof hp0.j) && (listG = ((hp0.j) pegasusHolderData).g()) != null) {
                    for (C7488c c7488c : listG) {
                        if (c7488c != null && (holderExtra2 = c7488c.f121099z) != null) {
                            holderExtra2.setRecoverCard(true);
                        }
                        if (c7488c != null && (holderExtra = c7488c.f121099z) != null) {
                            holderExtra.setRecoverExposed(false);
                        }
                    }
                }
            }
            ViewModel viewModel = this.this$0.getViewModel();
            PegasusViewModel pegasusViewModel = viewModel instanceof PegasusViewModel ? (PegasusViewModel) viewModel : null;
            if (pegasusViewModel != null) {
                pegasusViewModel.z(pegasusViewModel, new com.bilibili.pegasus.vm.j(this.$action.f77160b));
            }
        }
        return Unit.INSTANCE;
    }
}

package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuAiAudioDialogViewHelper$showSwitchView$2.class */
final class MenuAiAudioDialogViewHelper$showSwitchView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final List<RunningUIComponent> $list;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuAiAudioDialogViewHelper$showSwitchView$2(FragmentActivity fragmentActivity, List<RunningUIComponent> list, Continuation<? super MenuAiAudioDialogViewHelper$showSwitchView$2> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MenuAiAudioDialogViewHelper$showSwitchView$2 menuAiAudioDialogViewHelper$showSwitchView$2 = new MenuAiAudioDialogViewHelper$showSwitchView$2(this.$activity, this.$list, continuation);
        menuAiAudioDialogViewHelper$showSwitchView$2.L$0 = obj;
        return menuAiAudioDialogViewHelper$showSwitchView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FragmentActivity fragmentActivity = this.$activity;
            com.bilibili.app.screen.adjust.widget.q qVar = new com.bilibili.app.screen.adjust.widget.q(fragmentActivity, com.bilibili.playerbizcommonv2.widget.setting.channel.m.a(fragmentActivity, coroutineScope, this.$list), G.b.a, (String) null, 0.0f, false, false, 0, a.b.a, (MutableStateFlow) null, 0, 15352);
            this.label = 1;
            if (com.bilibili.app.screen.adjust.widget.t.b(qVar, this) == coroutine_suspended) {
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

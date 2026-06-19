package com.bilibili.ship.theseus.united.page.keyboard;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/keyboard/TheseusKeyboardShortcutService$2.class */
final class TheseusKeyboardShortcutService$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusKeyboardShortcutService$2(a aVar, Continuation<? super TheseusKeyboardShortcutService$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusKeyboardShortcutService$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        PlayerServiceManager.Client client;
        PlayerServiceManager.Client client2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            client = new PlayerServiceManager.Client();
            this.this$0.f102010d.getPlayerServiceManager().bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(b.class), client, true);
            try {
                this.L$0 = client;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                this.this$0.f102010d.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(b.class), client);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PlayerServiceManager.Client client3 = (PlayerServiceManager.Client) this.L$0;
            client2 = client3;
            try {
                ResultKt.throwOnFailure(obj);
                client = client3;
            } catch (Throwable th2) {
                th = th2;
                client = client2;
                this.this$0.f102010d.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(b.class), client);
                throw th;
            }
        }
        client2 = client;
        throw new KotlinNothingValueException();
    }
}

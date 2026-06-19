package com.bilibili.ship.theseus.united.page.miniplayer;

import androidx.lifecycle.Observer;
import bi0.AbstractC5109a;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.bus.Violet;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1.class */
final class MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final MiniPlayerSuppressionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1> continuation) {
        super(2, continuation);
        this.this$0 = miniPlayerSuppressionService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService r3, bi0.AbstractC5109a.d r4) {
        /*
            r0 = r4
            boolean r0 = r0.f56600a
            r7 = r0
            r0 = r4
            boolean r0 = r0.f56601b
            r8 = r0
            r0 = 1
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L37
            r0 = r3
            com.bilibili.ship.theseus.united.page.miniplayer.a r0 = r0.f102037e
            com.bilibili.ship.theseus.united.page.miniplayer.b$a r0 = r0.f102046d
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L2c
            r0 = r4
            boolean r0 = r0.f102070a
            r1 = 1
            if (r0 != r1) goto L2c
            r0 = 1
            r5 = r0
            goto L2e
        L2c:
            r0 = 0
            r5 = r0
        L2e:
            r0 = r5
            if (r0 != 0) goto L37
            r0 = 1
            r5 = r0
            goto L39
        L37:
            r0 = 0
            r5 = r0
        L39:
            r0 = r3
            com.bilibili.ship.theseus.united.page.miniplayer.a r0 = r0.f102037e
            boolean r0 = r0.e()
            if (r0 == 0) goto L48
            r0 = r6
            r5 = r0
            goto L58
        L48:
            r0 = r7
            if (r0 != 0) goto L56
            r0 = r5
            if (r0 != 0) goto L56
            r0 = r6
            r5 = r0
            goto L58
        L56:
            r0 = 0
            r5 = r0
        L58:
            r0 = r3
            com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository r0 = r0.f102039g
            r3 = r0
            r0 = r5
            if (r0 == 0) goto L6a
            r0 = r3
            java.lang.String r1 = "autoMiniPlayerSettingSuppressor"
            r0.b(r1)
            goto L70
        L6a:
            r0 = r3
            java.lang.String r1 = "autoMiniPlayerSettingSuppressor"
            r0.a(r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1.invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService, bi0.a$d):void");
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Observer observerObserveForeverUnSticky;
        Observer observer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChannelOperation channelOperationOfChannel = Violet.INSTANCE.ofChannel(AbstractC5109a.d.class);
            final MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
            observerObserveForeverUnSticky = channelOperationOfChannel.observeForeverUnSticky(new Observer(miniPlayerSuppressionService) { // from class: com.bilibili.ship.theseus.united.page.miniplayer.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MiniPlayerSuppressionService f102081a;

                {
                    this.f102081a = miniPlayerSuppressionService;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    MiniPlayerSuppressionService$collectMiniPlayerAutoPlaySetting$1.invokeSuspend$lambda$0(this.f102081a, (AbstractC5109a.d) obj2);
                }
            });
            try {
                this.L$0 = observerObserveForeverUnSticky;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                Violet.INSTANCE.ofChannel(AbstractC5109a.d.class).removeObserver(observerObserveForeverUnSticky);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Observer observer2 = (Observer) this.L$0;
            observer = observer2;
            try {
                ResultKt.throwOnFailure(obj);
                observerObserveForeverUnSticky = observer2;
            } catch (Throwable th2) {
                observerObserveForeverUnSticky = observer;
                th = th2;
                Violet.INSTANCE.ofChannel(AbstractC5109a.d.class).removeObserver(observerObserveForeverUnSticky);
                throw th;
            }
        }
        Observer observer3 = observerObserveForeverUnSticky;
        observer = observerObserveForeverUnSticky;
        throw new KotlinNothingValueException();
    }
}

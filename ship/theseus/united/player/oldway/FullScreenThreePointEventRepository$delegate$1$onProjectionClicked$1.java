package com.bilibili.ship.theseus.united.player.oldway;

import android.content.res.Configuration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1.class */
public final class FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final FullScreenThreePointEventRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Configuration, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Configuration configuration, Continuation<? super Boolean> continuation) {
            return create(configuration, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z6 = true;
            if (((Configuration) this.L$0).orientation != 1) {
                z6 = false;
            }
            return Boxing.boxBoolean(z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1(FullScreenThreePointEventRepository fullScreenThreePointEventRepository, Continuation<? super FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = fullScreenThreePointEventRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository$delegate$1$onProjectionClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

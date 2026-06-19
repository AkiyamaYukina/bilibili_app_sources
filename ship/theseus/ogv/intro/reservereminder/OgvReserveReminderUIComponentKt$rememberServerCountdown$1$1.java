package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderUIComponentKt$rememberServerCountdown$1$1.class */
final class OgvReserveReminderUIComponentKt$rememberServerCountdown$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Duration> $remaining$delegate;
    final long $remainingSeconds;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvReserveReminderUIComponentKt$rememberServerCountdown$1$1(long j7, MutableState<Duration> mutableState, Continuation<? super OgvReserveReminderUIComponentKt$rememberServerCountdown$1$1> continuation) {
        super(2, continuation);
        this.$remainingSeconds = j7;
        this.$remaining$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$0(long j7) {
        return j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$1(long j7) {
        return j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvReserveReminderUIComponentKt$rememberServerCountdown$1$1(this.$remainingSeconds, this.$remaining$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0111  */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ec -> B:24:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderUIComponentKt$rememberServerCountdown$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

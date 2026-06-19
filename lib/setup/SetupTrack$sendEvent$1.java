package com.bilibili.lib.setup;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/setup/SetupTrack$sendEvent$1.class */
public final class SetupTrack$sendEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $activity;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupTrack$sendEvent$1(Activity activity, Continuation<? super SetupTrack$sendEvent$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SetupTrack$sendEvent$1(this.$activity, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:13:0x0064, B:15:0x006a, B:20:0x007b, B:22:0x00a4, B:27:0x00ba, B:29:0x00c8, B:31:0x00d0, B:25:0x00b4), top: B:36:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.setup.SetupTrack$sendEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

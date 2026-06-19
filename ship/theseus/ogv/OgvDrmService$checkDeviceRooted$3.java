package com.bilibili.ship.theseus.ogv;

import com.bilibili.droid.RootUtils;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$checkDeviceRooted$3.class */
final class OgvDrmService$checkDeviceRooted$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public OgvDrmService$checkDeviceRooted$3(Continuation<? super OgvDrmService$checkDeviceRooted$3> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvDrmService$checkDeviceRooted$3(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean zCheckRootPermissionSilent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            zCheckRootPermissionSilent = RootUtils.checkRootPermissionSilent();
        } catch (CancellationException e7) {
            throw e7;
        } catch (Exception e8) {
            com.bilibili.biligame.dialogdispatcher.e.a("[theseus-ogv-OgvDrmService$checkDeviceRooted$3-invokeSuspend] ", e8.getMessage(), "OgvDrmService$checkDeviceRooted$3-invokeSuspend", e8);
            zCheckRootPermissionSilent = false;
        }
        return Boxing.boxBoolean(zCheckRootPermissionSilent);
    }
}

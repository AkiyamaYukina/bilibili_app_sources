package com.bilibili.biligame.business.pegasus.config;

import android.content.SharedPreferences;
import com.bilibili.lib.blkv.SharedPrefX;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/config/PegasusDialogViewConfig$savePegasusDialogConfig$1.class */
public final class PegasusDialogViewConfig$savePegasusDialogConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusDialogViewConfig$savePegasusDialogConfig$1(String str, Continuation<? super PegasusDialogViewConfig$savePegasusDialogConfig$1> continuation) {
        super(2, continuation);
        this.$value = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusDialogViewConfig$savePegasusDialogConfig$1(this.$value, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SharedPrefX sharedPrefX = PegasusDialogViewConfig.f62717a;
        if (!Intrinsics.areEqual(this.$value, sharedPrefX != null ? sharedPrefX.getString("pggasus_view_config", "") : null) && sharedPrefX != null && (editorEdit = sharedPrefX.edit()) != null && (editorPutString = editorEdit.putString("pggasus_view_config", this.$value)) != null) {
            editorPutString.apply();
        }
        return Unit.INSTANCE;
    }
}

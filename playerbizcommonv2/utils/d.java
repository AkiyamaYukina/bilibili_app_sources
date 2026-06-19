package com.bilibili.playerbizcommonv2.utils;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/d.class */
public final /* synthetic */ class d implements Function0 {
    public final Object invoke() {
        Log.i("ControlContainerDDUtilsKt-requestAbtestBatch", "[playerbizcommonv2-ControlContainerDDUtilsKt-requestAbtestBatch] loadAbtestBatch");
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new ControlContainerDDUtilsKt$requestAbtestBatch$1(null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}

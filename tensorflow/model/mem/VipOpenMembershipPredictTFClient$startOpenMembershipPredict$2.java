package com.bilibili.tensorflow.model.mem;

import android.os.Build;
import kntr.base.utils.foundation.RomUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/model/mem/VipOpenMembershipPredictTFClient$startOpenMembershipPredict$2.class */
public final class VipOpenMembershipPredictTFClient$startOpenMembershipPredict$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;

    public VipOpenMembershipPredictTFClient$startOpenMembershipPredict$2(Continuation<? super VipOpenMembershipPredictTFClient$startOpenMembershipPredict$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipOpenMembershipPredictTFClient$startOpenMembershipPredict$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (Hj0.a.a("tf_ogv_open_membership_switch", false)) {
                boolean z6 = RomUtils.isHuaweiRom() || RomUtils.isHonorRom();
                if ((!z6 || !Hj0.a.a("tf_ogv_open_membership_huawei_switch_off", false)) && (((str2 = Build.MODEL) == null || !ArraysKt.contains(VipOpenMembershipPredictTFClient.f110797b, str2)) && ((!z6 || RomUtils.isHarmony()) && com.bilibili.ogv.infra.account.a.f67852b.mid() > 0))) {
                    VipOpenMembershipPredictTFClient vipOpenMembershipPredictTFClient = VipOpenMembershipPredictTFClient.f110796a;
                    this.label = 1;
                    Object objB = VipOpenMembershipPredictTFClient.b(vipOpenMembershipPredictTFClient, this);
                    obj = objB;
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            str = "00";
            return str;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        str = (String) obj;
        return str;
    }
}

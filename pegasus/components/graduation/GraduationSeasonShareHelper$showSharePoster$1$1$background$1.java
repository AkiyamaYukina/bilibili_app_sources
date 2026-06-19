package com.bilibili.pegasus.components.graduation;

import android.graphics.Bitmap;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonShareHelper$showSharePoster$1$1$background$1.class */
public final class GraduationSeasonShareHelper$showSharePoster$1$1$background$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final GraduationSeasonShareConfig $shareConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonShareHelper$showSharePoster$1$1$background$1(GraduationSeasonShareConfig graduationSeasonShareConfig, Continuation<? super GraduationSeasonShareHelper$showSharePoster$1$1$background$1> continuation) {
        super(2, continuation);
        this.$shareConfig = graduationSeasonShareConfig;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonShareHelper$showSharePoster$1$1$background$1(this.$shareConfig, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            W w7 = W.f76097a;
            GraduationSeasonShareConfig graduationSeasonShareConfig = this.$shareConfig;
            this.label = 1;
            Object objB = W.b(w7, graduationSeasonShareConfig, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

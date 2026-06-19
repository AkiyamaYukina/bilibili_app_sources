package com.bilibili.ogv.kmm.operation.banner;

import com.bilibili.lib.gripper.api.GripperKt;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import kntr.base.hilt.component.HiltSingletonComponent_androidKt;
import kntr.base.mod.GMod;
import kntr.base.mod.ModBundle;
import kntr.base.mod.ModRequirementPolicy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$6.class */
final class CreateHdrVideoModel$invoke$1$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C5437a.e $videoMod;
    int label;
    final T this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$6(C5437a.e eVar, T t7, Continuation<? super CreateHdrVideoModel$invoke$1$6> continuation) {
        super(2, continuation);
        this.$videoMod = eVar;
        this.this$0 = t7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$6(this.$videoMod, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            GMod gMod = (GMod) com.bilibili.bililive.room.component.room.b.a(GripperKt.getGripper(HiltSingletonComponent_androidKt.getHiltSingletonComponent()).getContainer(), GMod.class, (String) null, 2, (Object) null);
            C5437a.e eVar = this.$videoMod;
            String str = eVar.f68092a;
            ModRequirementPolicy modRequirementPolicy = ModRequirementPolicy.None;
            this.label = 1;
            Object obj2 = gMod.get(str, eVar.f68093b, modRequirementPolicy, this);
            obj = obj2;
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ModBundle modBundle = (ModBundle) obj;
        T t7 = this.this$0;
        String strA = null;
        if (modBundle != null) {
            strA = V.a(modBundle, this.$videoMod.f68094c);
        }
        t7.f68052f.setValue(strA);
        return Unit.INSTANCE;
    }
}

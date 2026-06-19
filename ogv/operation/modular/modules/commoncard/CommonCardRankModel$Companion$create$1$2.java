package com.bilibili.ogv.operation.modular.modules.commoncard;

import androidx.fragment.app.Fragment;
import com.bilibili.ogv.opbase.OGVRankThemeType;
import com.bilibili.ogv.opbase.RecommendModule;
import com.bilibili.ogv.operation.modular.modules.commoncard.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/commoncard/CommonCardRankModel$Companion$create$1$2.class */
final class CommonCardRankModel$Companion$create$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fragment $fragment;
    final RecommendModule $module;
    final f $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCardRankModel$Companion$create$1$2(Fragment fragment, RecommendModule recommendModule, f fVar, Continuation<? super CommonCardRankModel$Companion$create$1$2> continuation) {
        super(2, continuation);
        this.$fragment = fragment;
        this.$module = recommendModule;
        this.$this_apply = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonCardRankModel$Companion$create$1$2(this.$fragment, this.$module, this.$this_apply, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Fragment fragment = this.$fragment;
            RecommendModule recommendModule = this.$module;
            String str = recommendModule.f69916r;
            OGVRankThemeType oGVRankThemeTypeE = recommendModule.e();
            this.label = 1;
            Object objA = f.a.a(fragment, str, oGVRankThemeTypeE, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$this_apply.n(((Number) obj).intValue());
        f fVar = this.$this_apply;
        fVar.o(f.a.b(fVar.f70564l));
        return Unit.INSTANCE;
    }
}

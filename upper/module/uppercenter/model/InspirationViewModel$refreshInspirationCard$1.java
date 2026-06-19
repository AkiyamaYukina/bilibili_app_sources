package com.bilibili.upper.module.uppercenter.model;

import JE0.j;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.uppercenter.Inspiration;
import com.bilibili.upper.api.bean.uppercenter.UpperInspirationCategory;
import com.bilibili.upper.api.service.UpperCenterApiService;
import eJ0.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/InspirationViewModel$refreshInspirationCard$1.class */
public final class InspirationViewModel$refreshInspirationCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $index;
    int label;
    final InspirationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationViewModel$refreshInspirationCard$1(InspirationViewModel inspirationViewModel, int i7, Continuation<? super InspirationViewModel$refreshInspirationCard$1> continuation) {
        super(2, continuation);
        this.this$0 = inspirationViewModel;
        this.$index = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InspirationViewModel$refreshInspirationCard$1(this.this$0, this.$index, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String strE;
        String strF;
        Inspiration inspiration;
        String str;
        T t7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UpperInspirationCategory upperInspirationCategory = (UpperInspirationCategory) CollectionsKt.getOrNull(this.this$0.f114108c, this.$index);
            if (upperInspirationCategory == null) {
                return Unit.INSTANCE;
            }
            long category_id = upperInspirationCategory.getCategory_id();
            List list = upperInspirationCategory.getList();
            long id = (list == null || (inspiration = (Inspiration) CollectionsKt.lastOrNull(list)) == null) ? 0L : inspiration.getId();
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Lazy<r> lazy = r.f117287g;
            if (r.a.b()) {
                strE = r.a.a().e();
                strF = r.a.a().f();
            } else {
                strE = "";
                strF = "";
            }
            ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).refreshInspirationCard(category_id, id, strE, strF).enqueue(new j(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        GeneralResponse generalResponse = (GeneralResponse) obj;
        if (generalResponse != null) {
            InspirationViewModel inspirationViewModel = this.this$0;
            int i8 = this.$index;
            UpperInspirationCategory upperInspirationCategory2 = (UpperInspirationCategory) ((ArrayList) inspirationViewModel.f114108c).get(i8);
            int i9 = generalResponse.code;
            if (i9 == 0 && (t7 = generalResponse.data) != 0) {
                upperInspirationCategory2.setCan_rotate(((UpperInspirationCategory) t7).getCan_rotate());
                upperInspirationCategory2.setList(((UpperInspirationCategory) generalResponse.data).getList());
                inspirationViewModel.f114109d.setValue(Boxing.boxInt(i8));
            } else if (i9 == 21213 && (str = generalResponse.message) != null && str.length() != 0) {
                inspirationViewModel.f114110e.setValue(generalResponse.message);
            }
        }
        return Unit.INSTANCE;
    }
}

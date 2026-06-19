package com.bilibili.ship.theseus.cheese.biz.catalog;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.droid.ToastHelper;
import eu0.C6991j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogService$downloadCourseware$1.class */
final class CheeseCatalogService$downloadCourseware$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6991j $ware;
    int label;
    final CheeseCatalogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogService$downloadCourseware$1(CheeseCatalogService cheeseCatalogService, C6991j c6991j, Continuation<? super CheeseCatalogService$downloadCourseware$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogService;
        this.$ware = c6991j;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogService$downloadCourseware$1(this.this$0, this.$ware, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogRepository cheeseCatalogRepository = this.this$0.f89120p;
            String str = this.$ware.f117546f;
            this.label = 1;
            Object objA = cheeseCatalogRepository.a(str, this);
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
        String str2 = (String) obj;
        if (str2 == null || str2.length() == 0) {
            ToastHelper.showToastShort(this.this$0.f89107b, 2131848860);
            return Unit.INSTANCE;
        }
        CheeseCatalogService cheeseCatalogService = this.this$0;
        FragmentManager fragmentManager = cheeseCatalogService.f89108c;
        C6991j c6991j = this.$ware;
        ComponentActivity componentActivity = cheeseCatalogService.f89107b;
        du0.c.b(fragmentManager, componentActivity, c6991j, true, new com.bilibili.bililive.room.ui.roomv3.base.viewmodel.a(1, componentActivity, str2));
        return Unit.INSTANCE;
    }
}

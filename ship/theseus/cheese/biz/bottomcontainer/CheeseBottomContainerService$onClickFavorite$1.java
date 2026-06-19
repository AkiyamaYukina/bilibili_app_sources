package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$onClickFavorite$1.class */
public final class CheeseBottomContainerService$onClickFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final CheeseBottomContainerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$onClickFavorite$1(CheeseBottomContainerService cheeseBottomContainerService, Continuation<? super CheeseBottomContainerService$onClickFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseBottomContainerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseBottomContainerService$onClickFavorite$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        boolean zBooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!BiliAccounts.get(this.this$0.f89026c).isLogin()) {
                com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
                return Unit.INSTANCE;
            }
            zBooleanValue = ((Boolean) this.this$0.f89038p.f89089b.getValue()).booleanValue();
            CheeseBottomContainerService cheeseBottomContainerService = this.this$0;
            this.Z$0 = zBooleanValue;
            this.label = 1;
            obj = CheeseBottomContainerService.b(cheeseBottomContainerService, zBooleanValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zBooleanValue = this.Z$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            CheeseBottomContainerService cheeseBottomContainerService2 = this.this$0;
            Integer num = cheeseBottomContainerService2.f89042t.f117502a.get("pugv_operate_area_stat_fav");
            if (num != null && num.intValue() == 2) {
                RelationRepository relationRepository = cheeseBottomContainerService2.f89043u;
                if (zBooleanValue) {
                    relationRepository.x(relationRepository.f() - 1);
                } else {
                    relationRepository.x(relationRepository.f() + 1);
                }
            }
            ToastHelper.showToastLong(cheeseBottomContainerService2.f89026c, !zBooleanValue ? cheeseBottomContainerService2.f89026c.getString(2131848829) : cheeseBottomContainerService2.f89026c.getString(2131847059));
            this.this$0.f89038p.f89088a.setValue(Boolean.valueOf(!zBooleanValue));
        } else {
            CheeseBottomContainerService cheeseBottomContainerService3 = this.this$0;
            ToastHelper.showToastShort(cheeseBottomContainerService3.f89026c, !zBooleanValue ? cheeseBottomContainerService3.f89026c.getString(2131848867) : cheeseBottomContainerService3.f89026c.getString(2131846937));
        }
        return Unit.INSTANCE;
    }
}

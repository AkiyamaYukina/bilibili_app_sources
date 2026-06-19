package com.bilibili.ship.theseus.ogv.activity;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.okretro.response.BiliApiResponseKt;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import com.bilibili.ship.theseus.united.utils.q;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.GlobalScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/DeliverAction$invoke$2.class */
final class DeliverAction$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiliApiResponse<? extends OgvActivityDeliveryResult>>, Object> {
    final ActivityDialogActionType $action;
    final String $code;
    final String $id;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverAction$invoke$2(String str, String str2, ActivityDialogActionType activityDialogActionType, c cVar, Continuation<? super DeliverAction$invoke$2> continuation) {
        super(2, continuation);
        this.$id = str;
        this.$code = str2;
        this.$action = activityDialogActionType;
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DeliverAction$invoke$2 deliverAction$invoke$2 = new DeliverAction$invoke$2(this.$id, this.$code, this.$action, this.this$0, continuation);
        deliverAction$invoke$2.L$0 = obj;
        return deliverAction$invoke$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiliApiResponse<OgvActivityDeliveryResult>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        CoroutineScope coroutineScope;
        OgvActivityDeliveryResult.Action actionA;
        OgvActivityDeliveryResult.PlayAreaToast playAreaToast;
        Map<String, String> map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt.async$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new DeliverAction$invoke$2$result$1(this.$id, this.$code, this.$action, null), 3, (Object) null);
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = deferredAsync$default.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        Object objAsResult = BiliApiResponseKt.asResult(biliApiResponse);
        c cVar = this.this$0;
        if (Result.isSuccess-impl(objAsResult)) {
            OgvActivityDeliveryResult ogvActivityDeliveryResult = (OgvActivityDeliveryResult) objAsResult;
            if (ogvActivityDeliveryResult != null && (map = ogvActivityDeliveryResult.f91346b) != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DeliverAction$invoke$2$1$1$1(cVar, entry.getKey(), entry.getValue(), null), 3, (Object) null);
                }
            }
            if (ogvActivityDeliveryResult != null && (playAreaToast = ogvActivityDeliveryResult.f91347c) != null) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DeliverAction$invoke$2$1$2$1(cVar, playAreaToast, null), 3, (Object) null);
            }
            if (ogvActivityDeliveryResult != null && (actionA = ogvActivityDeliveryResult.a()) != null) {
                cVar.getClass();
                if (!(actionA instanceof OgvActivityDeliveryResult.Action.Navigate)) {
                    throw new NoWhenBranchMatchedException();
                }
                BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(((OgvActivityDeliveryResult.Action.Navigate) actionA).f91350a), (Context) null, 2, (Object) null);
            }
        }
        ActivityDialogActionType activityDialogActionType = this.$action;
        Throwable th = Result.exceptionOrNull-impl(objAsResult);
        if (th != null) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-ogv-DeliverAction$invoke$2-invokeSuspend] ", th.getMessage(), "DeliverAction$invoke$2-invokeSuspend", th);
            if ((th instanceof BiliApiException) && activityDialogActionType == ActivityDialogActionType.EXEC) {
                String message = th.getMessage();
                String str = message;
                if (message == null) {
                    str = "";
                }
                q.c(str);
            }
        }
        return biliApiResponse;
    }
}

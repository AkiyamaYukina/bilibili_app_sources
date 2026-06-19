package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.ui.graphics.colorspace.A;
import com.bilibili.community.like.LikeResponse;
import com.bilibili.droid.ToastHelper;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/RelationRepository$likeVideo$1.class */
public final class RelationRepository$likeVideo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final RelationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationRepository$likeVideo$1(RelationRepository relationRepository, Continuation<? super RelationRepository$likeVideo$1> continuation) {
        super(2, continuation);
        this.this$0 = relationRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RelationRepository$likeVideo$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            RelationRepository relationRepository = this.this$0;
            this.label = 1;
            Object objD = relationRepository.d(this);
            obj2 = objD;
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        RelationRepository relationRepository2 = this.this$0;
        if (Result.isSuccess-impl(obj2) && (str = ((LikeResponse) obj2).a) != null && str.length() != 0) {
            ToastHelper.showToastShort(relationRepository2.f103993a, str);
        }
        RelationRepository relationRepository3 = this.this$0;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            StringBuilder sbB = A.b(relationRepository3.f103995c.a(), "like video failed, id:", ", isLike:", relationRepository3.j());
            sbB.append(", error:");
            sbB.append(th);
            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-RelationRepository$likeVideo$1-invokeSuspend] ", sbB.toString(), "RelationRepository$likeVideo$1-invokeSuspend", (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}

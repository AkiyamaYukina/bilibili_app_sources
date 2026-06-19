package com.bilibili.playset.widget.favorite;

import com.bilibili.playset.widget.favorite.FavoriteDialog;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteDialog$commitChangeBatchManage$2.class */
final class FavoriteDialog$commitChangeBatchManage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<String> $addIds;
    int label;
    final FavoriteDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteDialog$commitChangeBatchManage$2(FavoriteDialog favoriteDialog, Ref.ObjectRef<String> objectRef, Continuation<? super FavoriteDialog$commitChangeBatchManage$2> continuation) {
        super(2, continuation);
        this.this$0 = favoriteDialog;
        this.$addIds = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteDialog$commitChangeBatchManage$2(this.this$0, this.$addIds, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = f.f85754a;
            FavoriteDialog.b bVar = this.this$0.f85685b;
            String str = bVar.f85720q;
            String str2 = (String) this.$addIds.element;
            this.label = 1;
            Object objB = fVar.b(str, str2, bVar.f85721r, bVar.f85722s, this);
            obj2 = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        FavoriteDialog favoriteDialog = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            FavoriteChangeResponse favoriteChangeResponse = (FavoriteChangeResponse) obj2;
            k kVar = favoriteDialog.f85702t;
            if (kVar != null) {
                kVar.f(favoriteChangeResponse != null ? favoriteChangeResponse.getToastMsg() : null, true);
            }
            favoriteDialog.dismiss();
        }
        FavoriteDialog favoriteDialog2 = this.this$0;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            FavoriteDialog.j(favoriteDialog2, th);
        }
        return Unit.INSTANCE;
    }
}

package com.bilibili.playerbizcommonv2.widget.share;

import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/share/ShareLoadingDialog$showWithBlocking$2.class */
public final class ShareLoadingDialog$showWithBlocking$2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
    final FragmentActivity $activity;
    final Function2<ShareLoadingDialog, Continuation<? super R>, Object> $block;
    private Object L$0;
    int label;
    final ShareLoadingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShareLoadingDialog$showWithBlocking$2(ShareLoadingDialog shareLoadingDialog, FragmentActivity fragmentActivity, Function2<? super ShareLoadingDialog, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super ShareLoadingDialog$showWithBlocking$2> continuation) {
        super(2, continuation);
        this.this$0 = shareLoadingDialog;
        this.$activity = fragmentActivity;
        this.$block = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareLoadingDialog$showWithBlocking$2 shareLoadingDialog$showWithBlocking$2 = new ShareLoadingDialog$showWithBlocking$2(this.this$0, this.$activity, this.$block, continuation);
        shareLoadingDialog$showWithBlocking$2.L$0 = obj;
        return shareLoadingDialog$showWithBlocking$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ShareLoadingDialog shareLoadingDialog = this.this$0;
                shareLoadingDialog.f83397b = new a(coroutineScope);
                shareLoadingDialog.showNow(this.$activity.getSupportFragmentManager(), "ShareLoadingDialog");
                Function2<ShareLoadingDialog, Continuation<? super R>, Object> function2 = this.$block;
                ShareLoadingDialog shareLoadingDialog2 = this.this$0;
                this.label = 1;
                Object objInvoke = function2.invoke(shareLoadingDialog2, this);
                obj = objInvoke;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!fragmentActivity.isFinishing() && !this.$activity.isDestroyed()) {
                this.this$0.dismissAllowingStateLoss();
            }
            return obj;
        } finally {
            if (!this.$activity.isFinishing() && !this.$activity.isDestroyed()) {
                this.this$0.dismissAllowingStateLoss();
            }
        }
    }
}

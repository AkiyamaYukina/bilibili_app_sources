package com.bilibili.ship.theseus.ugc.cachevideo;

import com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog;
import com.bilibili.ugc.offline.download.AbstractVideoDownloadDelegateV3;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoDialogService$showDownloadDialog$2$invokeSuspend$$inlined$awaitCancel$1.class */
public final class UgcCacheVideoDialogService$showDownloadDialog$2$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final mE0.a $service$inlined;
    int label;
    final UgcCacheVideoDialogService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCacheVideoDialogService$showDownloadDialog$2$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, mE0.a aVar, UgcCacheVideoDialogService ugcCacheVideoDialogService) {
        super(2, continuation);
        this.$service$inlined = aVar;
        this.this$0 = ugcCacheVideoDialogService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcCacheVideoDialogService$showDownloadDialog$2$invokeSuspend$$inlined$awaitCancel$1(continuation, this.$service$inlined, this.this$0);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV3;
        VideoDownloadDialog videoDownloadDialog;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            mE0.a aVar = this.$service$inlined;
            AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV32 = aVar.a;
            if ((abstractVideoDownloadDelegateV32 != null ? abstractVideoDownloadDelegateV32.e() : false) && (abstractVideoDownloadDelegateV3 = aVar.a) != null && (videoDownloadDialog = abstractVideoDownloadDelegateV3.l) != null) {
                videoDownloadDialog.dismiss();
            }
            AbstractVideoDownloadDelegateV3 abstractVideoDownloadDelegateV33 = aVar.a;
            if (abstractVideoDownloadDelegateV33 != null) {
                abstractVideoDownloadDelegateV33.release();
            }
            aVar.a = null;
            this.this$0.f96345c.i("UgcCacheVideoDialogService");
            throw th;
        }
    }
}

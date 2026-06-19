package com.bilibili.ogv.filmlist.share;

import kntr.common.share.domain.v1.ShareResultV1;
import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kntr.common.trio.toast.Toaster;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/share/CreateFilmListShareModel$invoke$1$ShareMenuDialogUi$1$1$2$1.class */
final class CreateFilmListShareModel$invoke$1$ShareMenuDialogUi$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ShareResultV1 $result;
    final Toaster $toaster;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/share/CreateFilmListShareModel$invoke$1$ShareMenuDialogUi$1$1$2$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f67797a;

        static {
            int[] iArr = new int[ShareResultV1.values().length];
            try {
                iArr[ShareResultV1.Success.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ShareResultV1.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ShareResultV1.Cancel.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f67797a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFilmListShareModel$invoke$1$ShareMenuDialogUi$1$1$2$1(ShareResultV1 shareResultV1, Toaster toaster, Continuation<? super CreateFilmListShareModel$invoke$1$ShareMenuDialogUi$1$1$2$1> continuation) {
        super(2, continuation);
        this.$result = shareResultV1;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFilmListShareModel$invoke$1$ShareMenuDialogUi$1$1$2$1(this.$result, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = a.f67797a[this.$result.ordinal()];
        if (i7 == 1) {
            Toaster.showToast$default(this.$toaster, "分享成功", (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
        } else if (i7 == 2) {
            Toaster.showToast$default(this.$toaster, "分享失败", (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
        } else if (i7 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

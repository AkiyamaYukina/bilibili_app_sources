package com.bilibili.socialize.share.core.helper;

import com.bilibili.socialize.share.core.shareparam.ShareImage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader$getThumbBytes$1.class */
final class ShareImageDownloader$getThumbBytes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ShareImage $image;
    final Function0<Unit> $task;
    int label;
    final ShareImageDownloader this$0;

    /* JADX INFO: renamed from: com.bilibili.socialize.share.core.helper.ShareImageDownloader$getThumbBytes$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader$getThumbBytes$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ShareImage $image;
        final Function0<Unit> $task;
        private Object L$0;
        int label;
        final ShareImageDownloader this$0;

        /* JADX INFO: renamed from: com.bilibili.socialize.share.core.helper.ShareImageDownloader$getThumbBytes$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader$getThumbBytes$1$1$1.class */
        public static final class C11781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Function0<Unit> $task;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11781(Function0<Unit> function0, Continuation<? super C11781> continuation) {
                super(2, continuation);
                this.$task = function0;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11781(this.$task, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pv0.b.c("ShareImageDownloader", "start task!");
                this.$task.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShareImage shareImage, ShareImageDownloader shareImageDownloader, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$image = shareImage;
            this.this$0 = shareImageDownloader;
            this.$task = function0;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$image, this.this$0, this.$task, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            byte[] bArr;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
            } catch (Exception e7) {
                Pv0.b.c("ShareImageDownloader", "getThumbBytes error: " + e7.getMessage() + " ");
            }
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred deferredAsync$default = BuildersKt.async$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new ShareImageDownloader$getThumbBytes$1$1$job$1(this.this$0, this.$image, null), 3, (Object) null);
                if (deferredAsync$default != null) {
                    this.label = 1;
                    if (deferredAsync$default.await(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            ShareImage shareImage = this.$image;
            Pv0.b.c("ShareImageDownloader", "await end, result.size = " + ((shareImage == null || (bArr = shareImage.f105016e) == null) ? null : Boxing.boxInt(bArr.length)));
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C11781 c11781 = new C11781(this.$task, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c11781, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareImageDownloader$getThumbBytes$1(ShareImage shareImage, ShareImageDownloader shareImageDownloader, Function0<Unit> function0, Continuation<? super ShareImageDownloader$getThumbBytes$1> continuation) {
        super(2, continuation);
        this.$image = shareImage;
        this.this$0 = shareImageDownloader;
        this.$task = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareImageDownloader$getThumbBytes$1(this.$image, this.this$0, this.$task, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$image, this.this$0, this.$task, null);
            this.label = 1;
            if (TimeoutKt.withTimeout(5000L, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

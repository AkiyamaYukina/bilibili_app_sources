package com.bilibili.playerbizcommonv2.utils;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/BiliScreenshotDetectionUtil$contentObserver$1$onChange$1.class */
public final class BiliScreenshotDetectionUtil$contentObserver$1$onChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Uri $uri;
    int label;
    final BiliScreenshotDetectionUtil this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.utils.BiliScreenshotDetectionUtil$contentObserver$1$onChange$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/BiliScreenshotDetectionUtil$contentObserver$1$onChange$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Uri $uri;
        int label;
        final BiliScreenshotDetectionUtil this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Uri uri, BiliScreenshotDetectionUtil biliScreenshotDetectionUtil, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.this$0 = biliScreenshotDetectionUtil;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$uri, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Uri uri;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                uri = this.$uri;
            } catch (Exception e7) {
                M.b("exception occurred, message: ", e7.getMessage(), "BiliScreenshotDetectionDelegate");
            }
            if (uri != null && !BiliScreenshotDetectionUtil.a(this.this$0, uri)) {
                BiliScreenshotDetectionUtil biliScreenshotDetectionUtil = this.this$0;
                Uri uri2 = this.$uri;
                biliScreenshotDetectionUtil.f81897c = uri2;
                Uri uri3 = uri2;
                if (uri2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastUri");
                    uri3 = null;
                }
                String string = uri3.buildUpon().clearQuery().toString();
                if (!StringsKt.w(string, "media") && !Intrinsics.areEqual(biliScreenshotDetectionUtil.f81898d, string)) {
                    biliScreenshotDetectionUtil.f81898d = string;
                    BiliScreenshotDetectionUtil.b(this.this$0);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliScreenshotDetectionUtil$contentObserver$1$onChange$1(Uri uri, BiliScreenshotDetectionUtil biliScreenshotDetectionUtil, Continuation<? super BiliScreenshotDetectionUtil$contentObserver$1$onChange$1> continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = biliScreenshotDetectionUtil;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliScreenshotDetectionUtil$contentObserver$1$onChange$1(this.$uri, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uri, this.this$0, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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

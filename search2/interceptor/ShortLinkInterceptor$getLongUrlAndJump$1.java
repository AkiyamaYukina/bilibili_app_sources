package com.bilibili.search2.interceptor;

import android.content.Context;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/interceptor/ShortLinkInterceptor$getLongUrlAndJump$1.class */
final class ShortLinkInterceptor$getLongUrlAndJump$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final String $shortLink;
    long J$0;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortLinkInterceptor$getLongUrlAndJump$1(String str, e eVar, Context context, Continuation<? super ShortLinkInterceptor$getLongUrlAndJump$1> continuation) {
        super(2, continuation);
        this.$shortLink = str;
        this.this$0 = eVar;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortLinkInterceptor$getLongUrlAndJump$1(this.$shortLink, this.this$0, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.search2.result.v, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            ?? obj2 = new Object();
            String str = this.$shortLink;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            obj = obj2.a(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        String str2 = (String) obj;
        BLog.d("searchShortLinkSuspend", "searchShortLinkSuspend longUrl:" + str2 + " shortLink:" + this.$shortLink);
        if (System.currentTimeMillis() - jCurrentTimeMillis >= this.this$0.f86617a) {
            BLog.d("searchShortLinkSuspend", "searchShortLinkSuspend timeout");
        } else if (str2 != null) {
            try {
                if (!StringsKt.isBlank(str2)) {
                    Os0.e.f(this.$context, Uri.parse(str2));
                }
            } catch (Exception e7) {
                BLog.e("searchShortLinkSuspend", e7.toString());
            }
        }
        return Unit.INSTANCE;
    }
}

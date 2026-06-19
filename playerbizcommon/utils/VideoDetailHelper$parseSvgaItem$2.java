package com.bilibili.playerbizcommon.utils;

import android.content.Context;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.SVGAVideoEntity;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/VideoDetailHelper$parseSvgaItem$2.class */
final class VideoDetailHelper$parseSvgaItem$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SVGAVideoEntity>, Object> {
    final Context $context;
    final String $fileName;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/VideoDetailHelper$parseSvgaItem$2$a.class */
    public static final class a implements SVGAParser.ParseCompletion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f80273a;

        public a(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f80273a = cancellableContinuationImpl;
        }

        public final void onCacheExist() {
            this.f80273a.resumeWith(Result.constructor-impl((Object) null));
        }

        public final void onComplete(SVGAVideoEntity sVGAVideoEntity) {
            this.f80273a.resumeWith(Result.constructor-impl(sVGAVideoEntity));
        }

        public final void onError() {
            this.f80273a.resumeWith(Result.constructor-impl((Object) null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDetailHelper$parseSvgaItem$2(Context context, String str, Continuation<? super VideoDetailHelper$parseSvgaItem$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$fileName = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoDetailHelper$parseSvgaItem$2(this.$context, this.$fileName, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SVGAVideoEntity> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.$context;
            String str = this.$fileName;
            this.L$0 = context;
            this.L$1 = str;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            new SVGAParser(context).parse(str, new a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

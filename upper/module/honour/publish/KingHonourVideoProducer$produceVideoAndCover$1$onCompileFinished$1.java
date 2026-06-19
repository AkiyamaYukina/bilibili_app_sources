package com.bilibili.upper.module.honour.publish;

import P50.n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1.class */
public final class KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function2<String, String, Unit> $onSuccess;
    final n $timeline;
    final String $videoPath;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.upper.module.honour.publish.KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $coverPath;
        final Function2<String, String, Unit> $onSuccess;
        final String $videoPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super String, ? super String, Unit> function2, String str, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$onSuccess = function2;
            this.$videoPath = str;
            this.$coverPath = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$onSuccess, this.$videoPath, this.$coverPath, continuation);
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
            this.$onSuccess.invoke(this.$videoPath, this.$coverPath);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1(a aVar, String str, n nVar, Function2<? super String, ? super String, Unit> function2, Continuation<? super KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$videoPath = str;
        this.$timeline = nVar;
        this.$onSuccess = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1(this.this$0, this.$videoPath, this.$timeline, this.$onSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.honour.publish.KingHonourVideoProducer$produceVideoAndCover$1$onCompileFinished$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

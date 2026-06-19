package com.bilibili.pegasus.components.graduation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2.class */
final class GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final String $pic;
    int label;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final String $pic;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pic = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pic, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: all -> 0x009f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x009f, blocks: (B:5:0x001e, B:7:0x0040, B:9:0x0049, B:15:0x0059, B:19:0x0069, B:21:0x0079, B:23:0x0082, B:29:0x0092, B:33:0x00a3), top: B:52:0x001e }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2(String str, Continuation<? super GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2> continuation) {
        super(2, continuation);
        this.$pic = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$2(this.$pic, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pic, null);
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(io2, anonymousClass1, this);
            obj = objWithContext;
            if (objWithContext == coroutine_suspended) {
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

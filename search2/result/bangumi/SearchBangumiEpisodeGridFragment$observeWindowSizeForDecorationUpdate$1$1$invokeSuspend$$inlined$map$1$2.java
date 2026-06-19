package com.bilibili.search2.result.bangumi;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2.class */
public final class SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f87370a;

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2 searchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2, Continuation continuation) {
            super(continuation);
            this.this$0 = searchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector) {
        this.f87370a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2.AnonymousClass1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2.AnonymousClass1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5e
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L54
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            goto L86
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            androidx.window.core.layout.WindowSizeClass r0 = (androidx.window.core.layout.WindowSizeClass) r0
            int r0 = r0.getMinWidthDp()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.flow.FlowCollector r0 = r0.f87370a
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r9
            if (r0 != r1) goto L86
            r0 = r9
            return r0
        L86:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$1$4$1.class */
final class PageModel$komponent$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isNormalWindow;
    final Ref.ObjectRef<Boolean> $lastIsNormalWindow;
    final Ref.ObjectRef<q91.i> $lastRefreshTime;
    final Ref.BooleanRef $pendingRefresh;
    final KomponentScope<a> $this_Komponent;
    final MutableState<p> $uiState$delegate;
    int label;
    final o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageModel$komponent$1$4$1(Ref.ObjectRef<Boolean> objectRef, boolean z6, Ref.BooleanRef booleanRef, KomponentScope<? super a> komponentScope, Ref.ObjectRef<q91.i> objectRef2, o oVar, MutableState<p> mutableState, Continuation<? super PageModel$komponent$1$4$1> continuation) {
        super(2, continuation);
        this.$lastIsNormalWindow = objectRef;
        this.$isNormalWindow = z6;
        this.$pendingRefresh = booleanRef;
        this.$this_Komponent = komponentScope;
        this.$lastRefreshTime = objectRef2;
        this.this$0 = oVar;
        this.$uiState$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageModel$komponent$1$4$1(this.$lastIsNormalWindow, this.$isNormalWindow, this.$pendingRefresh, this.$this_Komponent, this.$lastRefreshTime, this.this$0, this.$uiState$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = r6
            int r0 = r0.label
            if (r0 != 0) goto Lba
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Boolean> r0 = r0.$lastIsNormalWindow
            r9 = r0
            r0 = r9
            java.lang.Object r0 = r0.element
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r7 = r0
            r0 = r9
            r1 = r6
            boolean r1 = r1.$isNormalWindow
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.element = r1
            kntr.base.log.ILogger r0 = kntr.base.log.KLog_androidKt.getKLog()
            r9 = r0
            r0 = r6
            boolean r0 = r0.$isNormalWindow
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "WindowSizeClass changed: previous="
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            java.lang.String r1 = ", isNormal="
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r9
            java.lang.String r1 = "BangumiHomeFlowFragmentV5"
            r2 = r10
            java.lang.String r2 = r2.toString()
            r0.d(r1, r2)
            r0 = r7
            if (r0 != 0) goto L8d
            r0 = r6
            kotlin.jvm.internal.Ref$BooleanRef r0 = r0.$pendingRefresh
            r9 = r0
            r0 = r9
            boolean r0 = r0.element
            if (r0 == 0) goto L8d
            r0 = r9
            r1 = 0
            r0.element = r1
            r0 = r6
            kntr.common.komponent.KomponentScope<com.bilibili.ogv.kmm.operation.page.a> r0 = r0.$this_Komponent
            r1 = r6
            kotlin.jvm.internal.Ref$ObjectRef<q91.i> r1 = r1.$lastRefreshTime
            r2 = r6
            com.bilibili.ogv.kmm.operation.page.o r2 = r2.this$0
            r3 = r6
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Boolean> r3 = r3.$lastIsNormalWindow
            r4 = r6
            androidx.compose.runtime.MutableState<com.bilibili.ogv.kmm.operation.page.p> r4 = r4.$uiState$delegate
            com.bilibili.ogv.kmm.operation.page.o.a(r0, r1, r2, r3, r4)
            goto Lb6
        L8d:
            r0 = r7
            if (r0 == 0) goto Lb6
            r0 = r7
            r1 = r6
            boolean r1 = r1.$isNormalWindow
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto Lb6
            r0 = r6
            kntr.common.komponent.KomponentScope<com.bilibili.ogv.kmm.operation.page.a> r0 = r0.$this_Komponent
            r1 = r6
            kotlin.jvm.internal.Ref$ObjectRef<q91.i> r1 = r1.$lastRefreshTime
            r2 = r6
            com.bilibili.ogv.kmm.operation.page.o r2 = r2.this$0
            r3 = r6
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Boolean> r3 = r3.$lastIsNormalWindow
            r4 = r6
            androidx.compose.runtime.MutableState<com.bilibili.ogv.kmm.operation.page.p> r4 = r4.$uiState$delegate
            com.bilibili.ogv.kmm.operation.page.o.a(r0, r1, r2, r3, r4)
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lba:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.page.PageModel$komponent$1$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

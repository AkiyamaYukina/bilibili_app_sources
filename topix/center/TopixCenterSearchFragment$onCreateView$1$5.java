package com.bilibili.topix.center;

import PD0.C2772n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterSearchFragment$onCreateView$1$5.class */
public final class TopixCenterSearchFragment$onCreateView$1$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C2772n $this_onCreateView;
    int label;
    final TopixCenterSearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopixCenterSearchFragment$onCreateView$1$5(TopixCenterSearchFragment topixCenterSearchFragment, C2772n c2772n, Continuation<? super TopixCenterSearchFragment$onCreateView$1$5> continuation) {
        super(2, continuation);
        this.this$0 = topixCenterSearchFragment;
        this.$this_onCreateView = c2772n;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopixCenterSearchFragment$onCreateView$1$5(this.this$0, this.$this_onCreateView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = r4
            int r0 = r0.label
            if (r0 != 0) goto L3e
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.topix.center.TopixCenterSearchFragment r0 = r0.this$0
            com.bilibili.topix.center.TopixCenterSearchViewModel r0 = r0.kf()
            r7 = r0
            r0 = r4
            PD0.n r0 = r0.$this_onCreateView
            android.widget.EditText r0 = r0.f18775c
            android.text.Editable r0 = r0.getText()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L31
            r0 = r5
            java.lang.String r0 = r0.toString()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L34
        L31:
            java.lang.String r0 = ""
            r5 = r0
        L34:
            r0 = r7
            r1 = r5
            r2 = 1
            r0.I0(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterSearchFragment$onCreateView$1$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

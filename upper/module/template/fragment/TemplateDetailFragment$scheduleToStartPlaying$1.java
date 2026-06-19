package com.bilibili.upper.module.template.fragment;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/TemplateDetailFragment$scheduleToStartPlaying$1.class */
final class TemplateDetailFragment$scheduleToStartPlaying$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $position;
    final Ref.IntRef $times;
    int label;
    final TemplateDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateDetailFragment$scheduleToStartPlaying$1(Ref.IntRef intRef, TemplateDetailFragment templateDetailFragment, int i7, Continuation<? super TemplateDetailFragment$scheduleToStartPlaying$1> continuation) {
        super(2, continuation);
        this.$times = intRef;
        this.this$0 = templateDetailFragment;
        this.$position = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TemplateDetailFragment$scheduleToStartPlaying$1(this.$times, this.this$0, this.$position, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        com.bilibili.upper.module.template.fragment.TemplateDetailFragment.jf(r4.this$0, r4.$position);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009c -> B:24:0x00a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r7 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L23
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L19
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto La1
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L23:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
        L27:
            r0 = r4
            kotlin.jvm.internal.Ref$IntRef r0 = r0.$times
            int r0 = r0.element
            if (r0 <= 0) goto Lb3
            r0 = r4
            com.bilibili.upper.module.template.fragment.TemplateDetailFragment r0 = r0.this$0
            r8 = r0
            r0 = r8
            r1 = r4
            int r1 = r1.$position
            java.lang.String r0 = r0.lf(r1)
            r5 = r0
            r0 = r8
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.getFragments()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8f
            r0 = r8
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L63:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8f
            r0 = r8
            java.lang.Object r0 = r0.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r0 = r0.getTag()
            r1 = r5
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L63
            r0 = r4
            com.bilibili.upper.module.template.fragment.TemplateDetailFragment r0 = r0.this$0
            r1 = r4
            int r1 = r1.$position
            com.bilibili.upper.module.template.fragment.TemplateDetailFragment.jf(r0, r1)
            goto Lb3
        L8f:
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = 100
            r1 = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r7
            if (r0 != r1) goto La1
            r0 = r7
            return r0
        La1:
            r0 = r4
            kotlin.jvm.internal.Ref$IntRef r0 = r0.$times
            r5 = r0
            r0 = r5
            r1 = r5
            int r1 = r1.element
            r2 = 1
            int r1 = r1 - r2
            r0.element = r1
            goto L27
        Lb3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.template.fragment.TemplateDetailFragment$scheduleToStartPlaying$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

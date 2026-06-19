package com.bilibili.ship.theseus.ogv.ep;

import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.C6152d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1.class */
public final class OgvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super ExtraInfo>, C6152d, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public OgvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super ExtraInfo>) obj, (C6152d) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super ExtraInfo> flowCollector, C6152d c6152d, Continuation<? super Unit> continuation) {
        OgvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1 ogvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1 = new OgvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1(continuation);
        ogvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1.L$0 = flowCollector;
        ogvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1.L$1 = c6152d;
        return ogvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
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
            goto L68
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L23:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r8 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$1
            com.bilibili.ship.theseus.ogv.d r0 = (com.bilibili.ship.theseus.ogv.C6152d) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L51
            r0 = r5
            com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository r0 = r0.f91826a
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L51
            r0 = r5
            kotlinx.coroutines.flow.StateFlow<com.bilibili.lib.media.resource.ExtraInfo> r0 = r0.f99566b
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L51
            goto L56
        L51:
            r0 = 0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
            r5 = r0
        L56:
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r5
            r2 = r4
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.emitAll(r0, r1, r2)
            r1 = r7
            if (r0 != r1) goto L68
            r0 = r7
            return r0
        L68:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.ep.OgvEpBackedModule$provideMediaExtraInfoFlow$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

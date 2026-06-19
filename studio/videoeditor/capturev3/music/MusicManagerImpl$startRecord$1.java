package com.bilibili.studio.videoeditor.capturev3.music;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/MusicManagerImpl$startRecord$1.class */
final class MusicManagerImpl$startRecord$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicManagerImpl$startRecord$1(n nVar, Continuation<? super MusicManagerImpl$startRecord$1> continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicManagerImpl$startRecord$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:16:0x0043). Please report as a decompilation issue!!! */
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
            goto L43
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
            com.bilibili.studio.videoeditor.capturev3.music.n r0 = r0.this$0
            boolean r0 = r0.f109283g
            if (r0 == 0) goto L60
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = 300(0x12c, double:1.48E-321)
            r1 = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r7
            if (r0 != r1) goto L43
            r0 = r7
            return r0
        L43:
            r0 = r4
            com.bilibili.studio.videoeditor.capturev3.music.n r0 = r0.this$0
            AB0.a r0 = r0.r()
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r0.f192d
            r1 = r4
            com.bilibili.studio.videoeditor.capturev3.music.n r1 = r1.this$0
            com.bilibili.studio.videoeditor.capturev3.music.r r1 = r1.p()
            long r1 = r1.d()
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r1)
            r0.postValue(r1)
            goto L27
        L60:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.music.MusicManagerImpl$startRecord$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

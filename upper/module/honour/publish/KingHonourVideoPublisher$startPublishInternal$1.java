package com.bilibili.upper.module.honour.publish;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/publish/KingHonourVideoPublisher$startPublishInternal$1.class */
final class KingHonourVideoPublisher$startPublishInternal$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $coverPath;
    final String $videoPath;
    Object L$0;
    Object L$1;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingHonourVideoPublisher$startPublishInternal$1(e eVar, String str, String str2, Continuation<? super KingHonourVideoPublisher$startPublishInternal$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$videoPath = str;
        this.$coverPath = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingHonourVideoPublisher$startPublishInternal$1(this.this$0, this.$videoPath, this.$coverPath, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012f A[Catch: Exception -> 0x002c, TRY_ENTER, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0025, B:58:0x0167, B:60:0x0170, B:62:0x0177, B:64:0x0183, B:65:0x01ad, B:67:0x01b9, B:17:0x004b, B:48:0x0126, B:50:0x012f, B:53:0x0140, B:18:0x0052, B:30:0x0089, B:35:0x00a2, B:37:0x00ad, B:40:0x00b8, B:42:0x0119, B:68:0x01c2, B:33:0x009d, B:20:0x005d, B:22:0x0069, B:25:0x006e), top: B:75:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad A[Catch: Exception -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0025, B:58:0x0167, B:60:0x0170, B:62:0x0177, B:64:0x0183, B:65:0x01ad, B:67:0x01b9, B:17:0x004b, B:48:0x0126, B:50:0x012f, B:53:0x0140, B:18:0x0052, B:30:0x0089, B:35:0x00a2, B:37:0x00ad, B:40:0x00b8, B:42:0x0119, B:68:0x01c2, B:33:0x009d, B:20:0x005d, B:22:0x0069, B:25:0x006e), top: B:75:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b9 A[Catch: Exception -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0025, B:58:0x0167, B:60:0x0170, B:62:0x0177, B:64:0x0183, B:65:0x01ad, B:67:0x01b9, B:17:0x004b, B:48:0x0126, B:50:0x012f, B:53:0x0140, B:18:0x0052, B:30:0x0089, B:35:0x00a2, B:37:0x00ad, B:40:0x00b8, B:42:0x0119, B:68:0x01c2, B:33:0x009d, B:20:0x005d, B:22:0x0069, B:25:0x006e), top: B:75:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.honour.publish.KingHonourVideoPublisher$startPublishInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

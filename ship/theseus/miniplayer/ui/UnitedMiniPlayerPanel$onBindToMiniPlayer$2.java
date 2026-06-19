package com.bilibili.ship.theseus.miniplayer.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel$onBindToMiniPlayer$2.class */
public final class UnitedMiniPlayerPanel$onBindToMiniPlayer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UnitedMiniPlayerPanel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedMiniPlayerPanel$onBindToMiniPlayer$2(UnitedMiniPlayerPanel unitedMiniPlayerPanel, Continuation<? super UnitedMiniPlayerPanel$onBindToMiniPlayer$2> continuation) {
        super(2, continuation);
        this.this$0 = unitedMiniPlayerPanel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedMiniPlayerPanel$onBindToMiniPlayer$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L4d
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.ship.theseus.miniplayer.ui.UnitedMiniPlayerPanel r0 = r0.this$0
            com.bilibili.mini.player.biz.c r0 = r0.f128252c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L67
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r5
            com.bilibili.mini.player.biz.b r0 = r0.f66062a
            r1 = r4
            java.lang.Object r0 = com.bilibili.mini.player.biz.b.j(r0, r1)
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L4d
            r0 = r8
            return r0
        L4d:
            r0 = r5
            tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = (tv.danmaku.biliplayerv2.service.Video.PlayableParams) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L67
            r0 = r5
            tv.danmaku.biliplayerv2.service.Video$DisplayParams r0 = r0.getDisplayParams()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L67
            r0 = r5
            java.lang.String r0 = r0.getTitle()
            r5 = r0
            goto L69
        L67:
            r0 = 0
            r5 = r0
        L69:
            r0 = r5
            if (r0 == 0) goto L7f
            r0 = r5
            int r0 = r0.length()
            if (r0 != 0) goto L77
            goto L7f
        L77:
            r0 = r4
            com.bilibili.ship.theseus.miniplayer.ui.UnitedMiniPlayerPanel r0 = r0.this$0
            r1 = 1
            r0.f91160k = r1
        L7f:
            boolean r0 = com.bilibili.mini.player.common.utils.i.c()
            if (r0 != 0) goto L8f
            r0 = r4
            com.bilibili.ship.theseus.miniplayer.ui.UnitedMiniPlayerPanel r0 = r0.this$0
            r1 = 3000(0xbb8, double:1.482E-320)
            r0.p(r1)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.miniplayer.ui.UnitedMiniPlayerPanel$onBindToMiniPlayer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

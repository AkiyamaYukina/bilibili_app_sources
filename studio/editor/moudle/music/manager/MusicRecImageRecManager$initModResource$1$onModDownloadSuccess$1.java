package com.bilibili.studio.editor.moudle.music.manager;

import com.bilibili.studio.editor.moudle.music.manager.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1.class */
final class MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c.b $callback;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.music.manager.MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/manager/MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c.b $callback;
        int label;
        final c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, c.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$callback = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$callback, continuation);
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
            c cVar = this.this$0;
            c.b bVar = this.$callback;
            if (cVar.f107915f) {
                BLog.e("MusicRecImageRecManager", "callbackModSuccess isReleased=true");
            } else {
                bVar.a();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1(c cVar, c.b bVar, Continuation<? super MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$callback = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1(this.this$0, this.$callback, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L91
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            com.bilibili.studio.editor.moudle.music.manager.c r0 = r0.this$0
            r7 = r0
            r0 = r7
            com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic r0 = r0.f107911b
            com.bilibili.studio.comm.manager.j r0 = r0.b()
            r11 = r0
            r0 = r7
            boolean r0 = r0.f107913d
            if (r0 == 0) goto L42
        L3d:
            r0 = 1
            r9 = r0
            goto L62
        L42:
            r0 = r7
            xz0.a r0 = r0.f107916g
            r1 = r11
            java.lang.String r1 = r1.f105404a
            int r0 = r0.e(r1)
            if (r0 != 0) goto L60
            r0 = r7
            xz0.a r0 = r0.f107916g
            r1 = r11
            java.lang.String r1 = r1.f105405b
            r0.b(r1)
            goto L3d
        L60:
            r0 = 0
            r9 = r0
        L62:
            r0 = r7
            r1 = r9
            r0.f107913d = r1
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            r7 = r0
            com.bilibili.studio.editor.moudle.music.manager.MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1$1 r0 = new com.bilibili.studio.editor.moudle.music.manager.MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1$1
            r1 = r0
            r2 = r6
            com.bilibili.studio.editor.moudle.music.manager.c r2 = r2.this$0
            r3 = r6
            com.bilibili.studio.editor.moudle.music.manager.c$b r3 = r3.$callback
            r4 = 0
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r11
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r1 = r10
            if (r0 != r1) goto L91
            r0 = r10
            return r0
        L91:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.music.manager.MusicRecImageRecManager$initModResource$1$onModDownloadSuccess$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

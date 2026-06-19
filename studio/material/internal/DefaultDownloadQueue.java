package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.MaterialTask;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/DefaultDownloadQueue.class */
public final class DefaultDownloadQueue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Object f108533c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static DefaultDownloadQueue f108534d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Channel<MaterialTask> f108535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, MaterialTask> f108536b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.bilibili.studio.material.internal.DefaultDownloadQueue$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/DefaultDownloadQueue$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final DefaultDownloadQueue this$0;

        /* JADX INFO: renamed from: com.bilibili.studio.material.internal.DefaultDownloadQueue$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/DefaultDownloadQueue$1$1.class */
        public static final class C12011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MaterialTask $task;
            int label;
            final DefaultDownloadQueue this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12011(DefaultDownloadQueue defaultDownloadQueue, MaterialTask materialTask, Continuation<? super C12011> continuation) {
                super(2, continuation);
                this.this$0 = defaultDownloadQueue;
                this.$task = materialTask;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C12011(this.this$0, this.$task, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    Method dump skipped, instruction units count: 206
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.DefaultDownloadQueue.AnonymousClass1.C12011.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultDownloadQueue defaultDownloadQueue, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = defaultDownloadQueue;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:14:0x0060). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r14 = r0
                r0 = r9
                int r0 = r0.label
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L2c
                r0 = r11
                r1 = 1
                if (r0 != r1) goto L22
                r0 = r9
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                r12 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                goto L60
            L22:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L2c:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                r12 = r0
            L38:
                r0 = r9
                com.bilibili.studio.material.internal.DefaultDownloadQueue r0 = r0.this$0
                kotlinx.coroutines.channels.Channel<com.bilibili.studio.material.MaterialTask> r0 = r0.f108535a
                r10 = r0
                r0 = r9
                r1 = r12
                r0.L$0 = r1
                r0 = r9
                r1 = 1
                r0.label = r1
                r0 = r10
                r1 = r9
                java.lang.Object r0 = r0.receive(r1)
                r13 = r0
                r0 = r13
                r10 = r0
                r0 = r13
                r1 = r14
                if (r0 != r1) goto L60
                r0 = r14
                return r0
            L60:
                r0 = r10
                com.bilibili.studio.material.MaterialTask r0 = (com.bilibili.studio.material.MaterialTask) r0
                r10 = r0
                r0 = r12
                r1 = 0
                r2 = 0
                com.bilibili.studio.material.internal.DefaultDownloadQueue$1$1 r3 = new com.bilibili.studio.material.internal.DefaultDownloadQueue$1$1
                r4 = r3
                r5 = r9
                com.bilibili.studio.material.internal.DefaultDownloadQueue r5 = r5.this$0
                r6 = r10
                r7 = 0
                r4.<init>(r5, r6, r7)
                r4 = 3
                r5 = 0
                kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                goto L38
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.DefaultDownloadQueue.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public DefaultDownloadQueue(int i7) {
        this.f108535a = ChannelKt.Channel$default(i7, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}

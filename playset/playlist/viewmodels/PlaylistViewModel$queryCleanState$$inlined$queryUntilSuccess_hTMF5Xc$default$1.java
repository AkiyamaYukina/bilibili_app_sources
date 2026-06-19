package com.bilibili.playset.playlist.viewmodels;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1.class */
public final class PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $delay;
    final long $initDelay;
    final int $maxRepeat;
    final long $playlistId$inlined;
    final long $timeout;
    private Object L$0;
    int label;
    final PlaylistViewModel this$0;

    /* JADX INFO: renamed from: com.bilibili.playset.playlist.viewmodels.PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $delay;
        final long $initDelay;
        final int $maxRepeat;
        final long $playlistId$inlined;
        final long $timeout;
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        private Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final PlaylistViewModel this$0;

        /* JADX INFO: renamed from: com.bilibili.playset.playlist.viewmodels.PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1$1$1.class */
        public static final class C05711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final long $playlistId$inlined;
            private Object L$0;
            int label;
            final PlaylistViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05711(Continuation continuation, long j7, PlaylistViewModel playlistViewModel) {
                super(2, continuation);
                this.$playlistId$inlined = j7;
                this.this$0 = playlistViewModel;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05711 c05711 = new C05711(continuation, this.$playlistId$inlined, this.this$0);
                c05711.L$0 = obj;
                return c05711;
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    long j7 = this.$playlistId$inlined;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    obj = com.bilibili.playset.api.i.e(j7, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != 2) {
                    obj = null;
                }
                if (obj != null) {
                    ((Number) obj).intValue();
                    if (!Intrinsics.areEqual(this.this$0.f85535p.getValue(), "success")) {
                        this.this$0.f85535p.setValue("success");
                    }
                    CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j7, long j8, long j9, int i7, Continuation continuation, long j10, PlaylistViewModel playlistViewModel) {
            super(2, continuation);
            this.$timeout = j7;
            this.$initDelay = j8;
            this.$delay = j9;
            this.$maxRepeat = i7;
            this.$playlistId$inlined = j10;
            this.this$0 = playlistViewModel;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$timeout, this.$initDelay, this.$delay, this.$maxRepeat, continuation, this.$playlistId$inlined, this.this$0);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00b7 -> B:21:0x00bd). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.viewmodels.PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1(long j7, long j8, long j9, int i7, Continuation continuation, PlaylistViewModel playlistViewModel, PlaylistViewModel playlistViewModel2, long j10, PlaylistViewModel playlistViewModel3) {
        super(2, continuation);
        this.$timeout = j7;
        this.$initDelay = j8;
        this.$delay = j9;
        this.$maxRepeat = i7;
        this.this$0 = playlistViewModel;
        this.$playlistId$inlined = j10;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        long j7 = this.$timeout;
        long j8 = this.$initDelay;
        long j9 = this.$delay;
        int i7 = this.$maxRepeat;
        PlaylistViewModel playlistViewModel = this.this$0;
        PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1 playlistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1 = new PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1(j7, j8, j9, i7, continuation, playlistViewModel, playlistViewModel, this.$playlistId$inlined, playlistViewModel);
        playlistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1.L$0 = obj;
        return playlistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r18 = r0
            r0 = r13
            int r0 = r0.label
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L31
            r0 = r15
            r1 = 1
            if (r0 != r1) goto L27
            r0 = r13
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            r18 = r0
            r0 = r14
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.util.concurrent.CancellationException -> L23 java.lang.Exception -> L84 kotlinx.coroutines.TimeoutCancellationException -> Lb2
            goto Lae
        L23:
            r14 = move-exception
            goto L94
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L31:
            r0 = r14
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r13
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            r14 = r0
            r0 = r13
            long r0 = r0.$timeout     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r16 = r0
            com.bilibili.playset.playlist.viewmodels.PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1$1 r0 = new com.bilibili.playset.playlist.viewmodels.PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1$1     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r19 = r0
            r0 = r19
            r1 = r16
            r2 = r13
            long r2 = r2.$initDelay     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r3 = r13
            long r3 = r3.$delay     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r4 = r13
            int r4 = r4.$maxRepeat     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r5 = 0
            r6 = r13
            long r6 = r6.$playlistId$inlined     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r7 = r13
            com.bilibili.playset.playlist.viewmodels.PlaylistViewModel r7 = r7.this$0     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r0 = r13
            r1 = r14
            r0.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r0 = r13
            r1 = 1
            r0.label = r1     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r0 = r16
            r1 = r19
            r2 = r13
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.withTimeout-KLykuaI(r0, r1, r2)     // Catch: java.util.concurrent.CancellationException -> L23 kotlinx.coroutines.TimeoutCancellationException -> L7f java.lang.Exception -> L84
            r19 = r0
            r0 = r19
            r1 = r18
            if (r0 != r1) goto Lae
            r0 = r18
            return r0
        L7f:
            r18 = move-exception
            goto L96
        L84:
            r14 = move-exception
            r0 = r13
            com.bilibili.playset.playlist.viewmodels.PlaylistViewModel r0 = r0.this$0
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r0.f85535p
            java.lang.String r1 = "neterror"
            r0.setValue(r1)
            goto Lae
        L94:
            r0 = r14
            throw r0
        L96:
            r0 = r14
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            boolean r0 = kotlinx.coroutines.JobKt.isActive(r0)
            if (r0 == 0) goto Lae
            r0 = r13
            com.bilibili.playset.playlist.viewmodels.PlaylistViewModel r0 = r0.this$0
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r0.f85535p
            java.lang.String r1 = "timeout"
            r0.setValue(r1)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lb2:
            r14 = move-exception
            r0 = r18
            r14 = r0
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.viewmodels.PlaylistViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

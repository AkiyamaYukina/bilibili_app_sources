package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.Stun;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket.class */
public final class StunSocket {

    @NotNull
    private final ArrayList<MyChannel<Pair<Stun.Msg, InetSocketAddress>>> channels;

    @NotNull
    private AtomicBoolean isReceiving;

    @NotNull
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, (Object) null);

    @Nullable
    private Job recvJob;

    @NotNull
    private final DatagramSocket socket;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$MyChannel.class */
    public static final class MyChannel<T> {
        private boolean closed;

        @NotNull
        private final ArrayList<T> queue = new ArrayList<>();

        @NotNull
        private final Mutex mutex = MutexKt.Mutex$default(false, 1, (Object) null);

        /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object close(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                r5 = this;
                r0 = r6
                boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel$close$1
                if (r0 == 0) goto L25
                r0 = r6
                com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel$close$1 r0 = (com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel$close$1) r0
                r8 = r0
                r0 = r8
                int r0 = r0.label
                r7 = r0
                r0 = r7
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L25
                r0 = r8
                r1 = r7
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r8
                r6 = r0
                goto L2f
            L25:
                com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel$close$1 r0 = new com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel$close$1
                r1 = r0
                r2 = r5
                r3 = r6
                r1.<init>(r2, r3)
                r6 = r0
            L2f:
                r0 = r6
                java.lang.Object r0 = r0.result
                r10 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r8 = r0
                r0 = r6
                int r0 = r0.label
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L6d
                r0 = r7
                r1 = 1
                if (r0 != r1) goto L63
                r0 = r6
                java.lang.Object r0 = r0.L$1
                kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
                r9 = r0
                r0 = r6
                java.lang.Object r0 = r0.L$0
                com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel r0 = (com.bilibili.sistersplayer.p2p.stun.StunSocket.MyChannel) r0
                r8 = r0
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r9
                r6 = r0
                goto L9c
            L63:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L6d:
                r0 = r10
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                kotlinx.coroutines.sync.Mutex r0 = r0.mutex
                r9 = r0
                r0 = r6
                r1 = r5
                r0.L$0 = r1
                r0 = r6
                r1 = r9
                r0.L$1 = r1
                r0 = r6
                r1 = 1
                r0.label = r1
                r0 = r9
                r1 = 0
                r2 = r6
                java.lang.Object r0 = r0.lock(r1, r2)
                r1 = r8
                if (r0 != r1) goto L97
                r0 = r8
                return r0
            L97:
                r0 = r5
                r8 = r0
                r0 = r9
                r6 = r0
            L9c:
                r0 = r8
                r1 = 1
                r0.closed = r1     // Catch: java.lang.Throwable -> Lb0
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                r8 = r0
                r0 = r6
                r1 = 0
                r0.unlock(r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            Lb0:
                r8 = move-exception
                r0 = r6
                r1 = 0
                r0.unlock(r1)
                r0 = r8
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.MyChannel.close(kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ef A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:25:0x00e4, B:27:0x00ef, B:32:0x0106, B:34:0x010f, B:40:0x0151, B:41:0x015c), top: B:47:0x00e4 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #0 {all -> 0x0102, blocks: (B:25:0x00e4, B:27:0x00ef, B:32:0x0106, B:34:0x010f, B:40:0x0151, B:41:0x015c), top: B:47:0x00e4 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0167 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0142 -> B:39:0x0148). Please report as a decompilation issue!!! */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object get(int r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r7) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.MyChannel.get(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object put(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.MyChannel.put(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$Shared.class */
    public final class Shared {

        @NotNull
        private final MyChannel<Pair<Stun.Msg, InetSocketAddress>> channel = new MyChannel<>();
        final StunSocket this$0;

        public Shared(StunSocket stunSocket) {
            this.this$0 = stunSocket;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object close(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            /*
                Method dump skipped, instruction units count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.Shared.close(kotlin.coroutines.Continuation):java.lang.Object");
        }

        @NotNull
        public final MyChannel<Pair<Stun.Msg, InetSocketAddress>> getChannel() {
            return this.channel;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object receive(int r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Pair<? extends com.bilibili.sistersplayer.p2p.stun.Stun.Msg, ? extends java.net.InetSocketAddress>> r7) {
            /*
                r5 = this;
                r0 = r7
                boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.stun.StunSocket$Shared$receive$1
                if (r0 == 0) goto L29
                r0 = r7
                com.bilibili.sistersplayer.p2p.stun.StunSocket$Shared$receive$1 r0 = (com.bilibili.sistersplayer.p2p.stun.StunSocket$Shared$receive$1) r0
                r9 = r0
                r0 = r9
                int r0 = r0.label
                r8 = r0
                r0 = r8
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r9
                r1 = r8
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r9
                r7 = r0
                goto L33
            L29:
                com.bilibili.sistersplayer.p2p.stun.StunSocket$Shared$receive$1 r0 = new com.bilibili.sistersplayer.p2p.stun.StunSocket$Shared$receive$1
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L33:
                r0 = r7
                java.lang.Object r0 = r0.result
                r9 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L61
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L57
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
                r0 = r9
                r7 = r0
                goto L87
            L57:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L61:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r5
                com.bilibili.sistersplayer.p2p.stun.StunSocket$MyChannel<kotlin.Pair<com.bilibili.sistersplayer.p2p.stun.Stun$Msg, java.net.InetSocketAddress>> r0 = r0.channel     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
                r9 = r0
                r0 = r7
                r1 = 1
                r0.label = r1     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
                r0 = r9
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.get(r1, r2)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L89
                r9 = r0
                r0 = r9
                r7 = r0
                r0 = r9
                r1 = r10
                if (r0 != r1) goto L87
                r0 = r10
                return r0
            L87:
                r0 = r7
                return r0
            L89:
                r7 = move-exception
                java.net.SocketException r0 = new java.net.SocketException
                r1 = r0
                r1.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.Shared.receive(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0208 -> B:50:0x020e). Please report as a decompilation issue!!! */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object send(@org.jetbrains.annotations.NotNull byte[] r6, @org.jetbrains.annotations.NotNull java.net.SocketAddress r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.net.SocketException {
            /*
                Method dump skipped, instruction units count: 545
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.Shared.send(byte[], java.net.SocketAddress, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunSocket$close$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$close$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final StunSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StunSocket stunSocket, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = stunSocket;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.close(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunSocket$createShared$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$createShared$1.class */
    public static final class C65081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final StunSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65081(StunSocket stunSocket, Continuation<? super C65081> continuation) {
            super(continuation);
            this.this$0 = stunSocket;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.createShared(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunSocket$startReceive$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunSocket$startReceive$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final StunSocket this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StunSocket stunSocket, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = stunSocket;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v116 */
        /* JADX WARN: Type inference failed for: r0v120 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v23 */
        /* JADX WARN: Type inference failed for: r0v26 */
        /* JADX WARN: Type inference failed for: r0v28 */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v32, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v36 */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v42 */
        /* JADX WARN: Type inference failed for: r0v44 */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v48 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v50 */
        /* JADX WARN: Type inference failed for: r0v52 */
        /* JADX WARN: Type inference failed for: r0v54 */
        /* JADX WARN: Type inference failed for: r0v56 */
        /* JADX WARN: Type inference failed for: r0v58 */
        /* JADX WARN: Type inference failed for: r0v60 */
        /* JADX WARN: Type inference failed for: r0v62 */
        /* JADX WARN: Type inference failed for: r0v64 */
        /* JADX WARN: Type inference failed for: r0v66 */
        /* JADX WARN: Type inference failed for: r0v68 */
        /* JADX WARN: Type inference failed for: r0v86 */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x026c -> B:25:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02c1 -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 715
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public StunSocket() throws SocketException {
        DatagramSocket datagramSocket = new DatagramSocket();
        this.socket = datagramSocket;
        this.channels = new ArrayList<>();
        this.isReceiving = new AtomicBoolean(false);
        datagramSocket.setSoTimeout(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object close(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.close(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createShared(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.stun.StunSocket.Shared> r6) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunSocket.createShared(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final ArrayList<MyChannel<Pair<Stun.Msg, InetSocketAddress>>> getChannels() {
        return this.channels;
    }

    @NotNull
    public final Mutex getMutex() {
        return this.mutex;
    }

    @NotNull
    public final DatagramSocket getSocket() {
        return this.socket;
    }

    @Nullable
    public final Object startReceive(@NotNull Continuation<? super Unit> continuation) {
        if (!this.isReceiving.compareAndSet(false, true)) {
            return Unit.INSTANCE;
        }
        this.recvJob = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(continuation.getContext()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}

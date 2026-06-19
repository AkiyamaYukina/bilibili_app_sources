package com.bilibili.sistersplayer.p2p.stun;

import android.os.SystemClock;
import com.bilibili.sistersplayer.p2p.stun.Stun;
import com.bilibili.sistersplayer.p2p.stun.StunSocket;
import java.net.InetSocketAddress;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient.class */
public final class StunClient {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int RESULT_A = 1;
    private static final int RESULT_B = 2;
    private static final int RESULT_C = 3;
    private static final int RESULT_ERR = 0;

    @NotNull
    private StunSocket masterSocket;

    @NotNull
    private final Random rnd;

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunClient$Binding$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$Binding$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final StunClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StunClient stunClient, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = stunClient;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.Binding(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunClient$Binding$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$Binding$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InetSocketAddress>, Object> {
        final Stun.Msg $reqMsg;
        final byte[] $sendBuf;
        final InetSocketAddress $server;
        final StunSocket.Shared $socket;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StunSocket.Shared shared, byte[] bArr, InetSocketAddress inetSocketAddress, Stun.Msg msg, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$socket = shared;
            this.$sendBuf = bArr;
            this.$server = inetSocketAddress;
            this.$reqMsg = msg;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$socket, this.$sendBuf, this.$server, this.$reqMsg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InetSocketAddress> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00dc A[Catch: all -> 0x0075, SocketException -> 0x0175, TRY_ENTER, TryCatch #2 {SocketException -> 0x0175, all -> 0x0075, blocks: (B:10:0x006e, B:24:0x00d3, B:15:0x0084, B:19:0x00a7, B:26:0x00dc, B:28:0x00ed, B:30:0x00f5, B:33:0x010c, B:13:0x0079), top: B:59:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ce -> B:24:0x00d3). Please report as a decompilation issue!!! */
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
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 397
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunClient$CheckFiltering$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$CheckFiltering$1.class */
    public static final class C65051 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        Object result;
        final StunClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65051(StunClient stunClient, Continuation<? super C65051> continuation) {
            super(continuation);
            this.this$0 = stunClient;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.CheckFiltering(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunClient$CheckMapping$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$CheckMapping$1.class */
    public static final class C65061 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final StunClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65061(StunClient stunClient, Continuation<? super C65061> continuation) {
            super(continuation);
            this.this$0 = stunClient;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.CheckMapping(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunClient$CheckMapping$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$CheckMapping$2.class */
    public static final class C65072 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final InetSocketAddress[] $results;
        final List<InetSocketAddress> $servers;
        final int $timeoutMs;
        private Object L$0;
        int label;
        final StunClient this$0;

        /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.stun.StunClient$CheckMapping$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$CheckMapping$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final int $i;
            final InetSocketAddress[] $results;
            final List<InetSocketAddress> $servers;
            final int $timeoutMs;
            int I$0;
            Object L$0;
            int label;
            final StunClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(StunClient stunClient, InetSocketAddress[] inetSocketAddressArr, int i7, List<? extends InetSocketAddress> list, int i8, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = stunClient;
                this.$results = inetSocketAddressArr;
                this.$i = i7;
                this.$servers = list;
                this.$timeoutMs = i8;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$results, this.$i, this.$servers, this.$timeoutMs, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                int i7;
                Object objBinding;
                Object[] objArr;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i8 = this.label;
                if (i8 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int[] iArr = new int[3];
                    for (int i9 = 0; i9 < 3; i9++) {
                        iArr[i9] = this.this$0.getRnd().nextInt();
                    }
                    Object[] objArr2 = this.$results;
                    i7 = this.$i;
                    StunClient stunClient = this.this$0;
                    InetSocketAddress inetSocketAddress = this.$servers.get(i7);
                    int i10 = this.$timeoutMs;
                    this.L$0 = objArr2;
                    this.I$0 = i7;
                    this.label = 1;
                    objBinding = stunClient.Binding(inetSocketAddress, iArr, i10, this);
                    if (objBinding == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objArr = objArr2;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = this.I$0;
                    objArr = (InetSocketAddress[]) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objBinding = obj;
                }
                objArr[i7] = objBinding;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C65072(List<? extends InetSocketAddress> list, StunClient stunClient, InetSocketAddress[] inetSocketAddressArr, int i7, Continuation<? super C65072> continuation) {
            super(2, continuation);
            this.$servers = list;
            this.this$0 = stunClient;
            this.$results = inetSocketAddressArr;
            this.$timeoutMs = i7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C65072 c65072 = new C65072(this.$servers, this.this$0, this.$results, this.$timeoutMs, continuation);
            c65072.L$0 = obj;
            return c65072;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            int size = this.$servers.size();
            for (int i7 = 0; i7 < size; i7++) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$results, i7, this.$servers, this.$timeoutMs, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getRESULT_A$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getRESULT_B$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getRESULT_C$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getRESULT_ERR$annotations() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object Create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.stun.StunClient> r6) {
            /*
                r5 = this;
                r0 = r6
                boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.stun.StunClient$Companion$Create$1
                if (r0 == 0) goto L25
                r0 = r6
                com.bilibili.sistersplayer.p2p.stun.StunClient$Companion$Create$1 r0 = (com.bilibili.sistersplayer.p2p.stun.StunClient$Companion$Create$1) r0
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
                com.bilibili.sistersplayer.p2p.stun.StunClient$Companion$Create$1 r0 = new com.bilibili.sistersplayer.p2p.stun.StunClient$Companion$Create$1
                r1 = r0
                r2 = r5
                r3 = r6
                r1.<init>(r2, r3)
                r6 = r0
            L2f:
                r0 = r6
                java.lang.Object r0 = r0.result
                r8 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r9 = r0
                r0 = r6
                int r0 = r0.label
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L60
                r0 = r7
                r1 = 1
                if (r0 != r1) goto L56
                r0 = r6
                java.lang.Object r0 = r0.L$0
                com.bilibili.sistersplayer.p2p.stun.StunClient r0 = (com.bilibili.sistersplayer.p2p.stun.StunClient) r0
                r6 = r0
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                goto L8d
            L56:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L60:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                com.bilibili.sistersplayer.p2p.stun.StunClient r0 = new com.bilibili.sistersplayer.p2p.stun.StunClient
                r1 = r0
                r2 = 0
                r1.<init>(r2)
                r8 = r0
                r0 = r8
                com.bilibili.sistersplayer.p2p.stun.StunSocket r0 = r0.getMasterSocket()
                r10 = r0
                r0 = r6
                r1 = r8
                r0.L$0 = r1
                r0 = r6
                r1 = 1
                r0.label = r1
                r0 = r10
                r1 = r6
                java.lang.Object r0 = r0.startReceive(r1)
                r1 = r9
                if (r0 != r1) goto L8b
                r0 = r9
                return r0
            L8b:
                r0 = r8
                r6 = r0
            L8d:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient.Companion.Create(kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final int getRESULT_A() {
            return StunClient.RESULT_A;
        }

        public final int getRESULT_B() {
            return StunClient.RESULT_B;
        }

        public final int getRESULT_C() {
            return StunClient.RESULT_C;
        }

        public final int getRESULT_ERR() {
            return StunClient.RESULT_ERR;
        }
    }

    private StunClient() {
        this.masterSocket = new StunSocket();
        this.rnd = RandomKt.Random(SystemClock.uptimeMillis());
    }

    public /* synthetic */ StunClient(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final int getRESULT_A() {
        return Companion.getRESULT_A();
    }

    public static final int getRESULT_B() {
        return Companion.getRESULT_B();
    }

    public static final int getRESULT_C() {
        return Companion.getRESULT_C();
    }

    public static final int getRESULT_ERR() {
        return Companion.getRESULT_ERR();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Binding(@org.jetbrains.annotations.NotNull java.net.InetSocketAddress r9, @org.jetbrains.annotations.NotNull int[] r10, int r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.net.InetSocketAddress> r12) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient.Binding(java.net.InetSocketAddress, int[], int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0515  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x03f0 -> B:107:0x0404). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object CheckFiltering(@org.jetbrains.annotations.NotNull java.net.InetSocketAddress r9, @org.jetbrains.annotations.NotNull java.net.InetSocketAddress r10, int r11, int r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient.CheckFiltering(java.net.InetSocketAddress, java.net.InetSocketAddress, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object CheckMapping(@org.jetbrains.annotations.NotNull java.util.List<? extends java.net.InetSocketAddress> r9, int r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r11) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient.CheckMapping(java.util.List, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objClose = this.masterSocket.close(continuation);
        return objClose == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClose : Unit.INSTANCE;
    }

    @NotNull
    public final StunSocket getMasterSocket() {
        return this.masterSocket;
    }

    @NotNull
    public final Random getRnd() {
        return this.rnd;
    }

    public final void setMasterSocket(@NotNull StunSocket stunSocket) {
        this.masterSocket = stunSocket;
    }
}

package com.bilibili.sistersplayer.p2p;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable;
import com.bilibili.sistersplayer.p2p.peer.MsgQuery;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.peer.NyaPeerManager;
import com.bilibili.sistersplayer.p2p.utils.ConditionalVariable;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup.class */
public final class PeerFragWorkerGroup {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "PeerFragWorkerGroup";
    private boolean abandoned;

    @Nullable
    private int[] blockIds;

    @NotNull
    private final FragWorkerGroup ctx;

    @Nullable
    private byte[] distances;
    private boolean isDistanceFinal;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final NyaPeer peer;

    @Nullable
    private Long updateDistancesTS;

    @NotNull
    private final Mutex distancesUpdateLock = MutexKt.Mutex$default(false, 1, (Object) null);

    @NotNull
    private final Mutex taskAvailableMutex = MutexKt.Mutex$default(false, 1, (Object) null);

    @NotNull
    private final ConditionalVariable taskAvailableCV = new ConditionalVariable();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$doDownload$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$doDownload$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doDownload(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$launchInstance$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$launchInstance$1.class */
    public static final class C64801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        int label;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64801(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64801> continuation) {
            super(2, continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C64801(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0109 -> B:19:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x010e -> B:19:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0146 -> B:61:0x0167). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0161 -> B:61:0x0167). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.C64801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$runDownloadLoop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$runDownloadLoop$1.class */
    public static final class C64811 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64811(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64811> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.runDownloadLoop(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$sendDownloadBlock$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$sendDownloadBlock$1.class */
    public static final class C64821 extends ContinuationImpl {
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64821(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64821> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendDownloadBlock(0, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$sendGetProgress$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$sendGetProgress$1.class */
    public static final class C64831 extends ContinuationImpl {
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64831(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64831> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendGetProgress(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$setRemoteDistance$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$setRemoteDistance$1.class */
    public static final class C64841 extends ContinuationImpl {
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64841(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64841> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.setRemoteDistance(null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$suspendCurrentWorker$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$suspendCurrentWorker$1.class */
    public static final class C64851 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64851(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64851> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.suspendCurrentWorker(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$updateDistance$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$updateDistance$1.class */
    public static final class C64861 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64861(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64861> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateDistance(false, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$wakeUpWorkers$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/PeerFragWorkerGroup$wakeUpWorkers$1.class */
    public static final class C64871 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final PeerFragWorkerGroup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64871(PeerFragWorkerGroup peerFragWorkerGroup, Continuation<? super C64871> continuation) {
            super(continuation);
            this.this$0 = peerFragWorkerGroup;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.wakeUpWorkers(this);
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PeerFragWorkerGroup(@org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.FragWorkerGroup r7, @org.jetbrains.annotations.NotNull com.bilibili.sistersplayer.p2p.peer.NyaPeer r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.<init>(com.bilibili.sistersplayer.p2p.FragWorkerGroup, com.bilibili.sistersplayer.p2p.peer.NyaPeer):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(PeerFragWorkerGroup peerFragWorkerGroup, LiveFragment liveFragment) {
        P2PContext.launch$default(peerFragWorkerGroup.ctx.getP2pContext(), null, new PeerFragWorkerGroup$1$1(peerFragWorkerGroup, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(PeerFragWorkerGroup peerFragWorkerGroup) {
        P2PContext.launch$default(peerFragWorkerGroup.ctx.getP2pContext(), null, new PeerFragWorkerGroup$2$1(peerFragWorkerGroup, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ban(Continuation<? super Unit> continuation) {
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("ban peer: ", this.peer.getExtUserData().getPeerId()), null, 4, null);
        this.ctx.getP2pContext().getGhostPeerIds().add(this.peer.getExtUserData().getPeerId());
        NyaPeerManager rtcManager = this.ctx.getP2pContext().getRtcManager();
        if (rtcManager != null) {
            rtcManager.closePeer(this.peer.getExtUserData().getPeerId());
        }
        Object objStopAllInstance = stopAllInstance(continuation);
        return objStopAllInstance == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStopAllInstance : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doDownload$lambda$4(int i7, List list) {
        list.set(i7, Integer.valueOf(((Number) list.get(i7)).intValue() | SearchBangumiItem.TYPE_FULLNET_BANGUMI));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa A[EDGE_INSN: B:80:0x01aa->B:60:0x01aa BREAK  A[LOOP:0: B:26:0x00cf->B:59:0x01a2], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0214 -> B:71:0x021a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runDownloadLoop(kotlin.coroutines.Continuation<? super java.lang.Integer> r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.runDownloadLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendDownloadBlock(int r6, kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.peer.DownloadAndStatResponse> r7) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.sendDownloadBlock(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendGetProgress(kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.peer.DownloadAndStatResponse> r6) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.sendGetProgress(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendRequest(IMsgPackSeriable iMsgPackSeriable, Continuation<? super MsgQuery> continuation) {
        if (this.abandoned) {
            return null;
        }
        return this.peer.sendRequestMessage(iMsgPackSeriable, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setRemoteDistance(byte[] r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.setRemoteDistance(byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object setRemoteDistance$default(PeerFragWorkerGroup peerFragWorkerGroup, byte[] bArr, Continuation continuation, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bArr = null;
        }
        return peerFragWorkerGroup.setRemoteDistance(bArr, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x00f7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object suspendCurrentWorker(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.suspendCurrentWorker(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean suspendCurrentWorker$lambda$2(Ref.IntRef intRef) {
        int i7 = intRef.element;
        intRef.element = i7 + 1;
        return i7 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateDistance(boolean r7, kotlin.coroutines.Continuation<? super java.lang.Integer> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.updateDistance(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x009d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object wakeUpWorkers(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.C64871
            if (r0 == 0) goto L27
            r0 = r7
            com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$wakeUpWorkers$1 r0 = (com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.C64871) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L31
        L27:
            com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$wakeUpWorkers$1 r0 = new com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup$wakeUpWorkers$1
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L31:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L63
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L58
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup r0 = (com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup) r0
            r7 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L88
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L63:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            kotlinx.coroutines.sync.Mutex r0 = r0.taskAvailableMutex
            r9 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = 0
            r2 = r7
            r3 = 1
            r4 = 0
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r0, r1, r2, r3, r4)
            r1 = r10
            if (r0 != r1) goto L86
            r0 = r10
            return r0
        L86:
            r0 = r6
            r7 = r0
        L88:
            r0 = r7
            com.bilibili.sistersplayer.p2p.utils.ConditionalVariable r0 = r0.taskAvailableCV
            r0.notifyWhole()
            r0 = r7
            kotlinx.coroutines.sync.Mutex r0 = r0.taskAvailableMutex     // Catch: java.lang.Exception -> L9d
            r1 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L9d
        L99:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L9d
            return r0
        L9d:
            r7 = move-exception
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.wakeUpWorkers(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b4 A[Catch: all -> 0x03a7, TRY_ENTER, TryCatch #3 {all -> 0x03a7, blocks: (B:93:0x0351, B:95:0x0360, B:106:0x03b4, B:108:0x03de, B:124:0x0471, B:126:0x0490), top: B:171:0x0351 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04db A[Catch: all -> 0x0229, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0229, blocks: (B:49:0x01d9, B:51:0x01e5, B:53:0x01f3, B:56:0x0204, B:58:0x0212, B:60:0x0221, B:64:0x0239, B:66:0x0248, B:136:0x04db, B:145:0x0522), top: B:174:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0212 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #5 {all -> 0x0229, blocks: (B:49:0x01d9, B:51:0x01e5, B:53:0x01f3, B:56:0x0204, B:58:0x0212, B:60:0x0221, B:64:0x0239, B:66:0x0248, B:136:0x04db, B:145:0x0522), top: B:174:0x01d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0297 A[Catch: all -> 0x0341, TRY_LEAVE, TryCatch #2 {all -> 0x0341, blocks: (B:72:0x028c, B:74:0x0297), top: B:169:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0360 A[Catch: all -> 0x03a7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x03a7, blocks: (B:93:0x0351, B:95:0x0360, B:106:0x03b4, B:108:0x03de, B:124:0x0471, B:126:0x0490), top: B:171:0x0351 }] */
    /* JADX WARN: Type inference failed for: r0v101, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v103, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v121, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v134, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v143, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v151, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v156, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v160, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v170, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v180, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v185, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v189, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v191, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v199, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v209, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v76, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v92, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r0v97, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doDownload(int r9, int r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.PeerFragWorkerGroup.doDownload(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final NyaPeer getPeer() {
        return this.peer;
    }

    @Nullable
    public final Job launchInstance() {
        return this.ctx.getP2pContext().launch(CoroutineStart.LAZY, new C64801(this, null));
    }

    @Nullable
    public final Object stopAllInstance(@NotNull Continuation<? super Unit> continuation) {
        this.abandoned = true;
        Object objWakeUpWorkers = wakeUpWorkers(continuation);
        return objWakeUpWorkers == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWakeUpWorkers : Unit.INSTANCE;
    }
}

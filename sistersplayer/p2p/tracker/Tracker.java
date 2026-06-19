package com.bilibili.sistersplayer.p2p.tracker;

import B0.a;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.collection.d;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.bilibili.sistersplayer.hls.Fetcher;
import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker.class */
public final class Tracker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "Tracker";

    @NotNull
    public static final String TAG_RECEIVE = "Tracker receive";

    @NotNull
    public static final String TAG_SEND = "Tracker send";
    public static final int USER_CLOSE_CODE = 4000;

    @NotNull
    public static final String USER_CLOSE_REASON = "User Driving";

    @NotNull
    private AtomicBoolean isDestroyed;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final TrackerMessageSink msgSink;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final Map<Integer, CancellableContinuation<TrackerMessage>> pendingRequests;
    private int requestId;

    @NotNull
    private final String trackerSourceParam;

    @Nullable
    private WebSocket webSocket;

    @Nullable
    private CancellableContinuation<? super Boolean> webSocketJob;

    @Nullable
    private WebSocketListener webSocketListener;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void connect(@NotNull P2PContext p2PContext, @NotNull String str, @NotNull TrackerMessageSink trackerMessageSink, @NotNull P2PLogger p2PLogger) {
            P2PContext.launch$default(p2PContext, null, new Tracker$Companion$connect$1(p2PContext, str, trackerMessageSink, p2PLogger, null), 1, null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$TrackerMessage.class */
    @Keep
    public static final class TrackerMessage {

        @Nullable
        private String action;

        @Nullable
        private Object data;

        @Nullable
        private String from;

        @Nullable
        private Integer requestId;

        @Nullable
        private String status;

        /* JADX INFO: renamed from: to, reason: collision with root package name */
        @Nullable
        private String f104967to;

        @Nullable
        private String type;

        @Nullable
        public final String getAction() {
            return this.action;
        }

        @Nullable
        public final Object getData() {
            return this.data;
        }

        @Nullable
        public final String getFrom() {
            return this.from;
        }

        @Nullable
        public final Integer getRequestId() {
            return this.requestId;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        public final String getTo() {
            return this.f104967to;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setAction(@Nullable String str) {
            this.action = str;
        }

        public final void setData(@Nullable Object obj) {
            this.data = obj;
        }

        public final void setFrom(@Nullable String str) {
            this.from = str;
        }

        public final void setRequestId(@Nullable Integer num) {
            this.requestId = num;
        }

        public final void setStatus(@Nullable String str) {
            this.status = str;
        }

        public final void setTo(@Nullable String str) {
            this.f104967to = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$TrackerMessageSink.class */
    public interface TrackerMessageSink {
        void onPeerMessage(@NotNull TrackerMessage trackerMessage);

        @Nullable
        Object onServerMessage(@NotNull TrackerMessage trackerMessage, @NotNull Continuation<? super Unit> continuation);

        void onTrackerConnected(boolean z6);

        void onTrackerInit(@NotNull Tracker tracker);
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.Tracker$sendMessage$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$sendMessage$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        Object result;
        final Tracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Tracker tracker, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = tracker;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.sendMessage(0L, null, null, 0, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.sistersplayer.p2p.tracker.Tracker$sendMessage$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$sendMessage$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TrackerMessage>, Object> {
        final int $curRequestId;
        final HashMap<String, Object> $reqMsg;
        final int $requestId;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        final Tracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Tracker tracker, int i7, int i8, HashMap<String, Object> map, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = tracker;
            this.$requestId = i7;
            this.$curRequestId = i8;
            this.$reqMsg = map;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$requestId, this.$curRequestId, this.$reqMsg, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TrackerMessage> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Tracker tracker = this.this$0;
                int i8 = this.$requestId;
                int i9 = this.$curRequestId;
                HashMap<String, Object> map = this.$reqMsg;
                this.L$0 = tracker;
                this.L$1 = map;
                this.I$0 = i8;
                this.I$1 = i9;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                if (tracker.webSocket == null) {
                    P2PLogger.logE$default(tracker.logger, Tracker.TAG, "[LiveP2PProblem][tracker:error_state] Websocket is null", null, 4, null);
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
                } else {
                    if (i8 == 0) {
                        tracker.pendingRequests.put(Boxing.boxInt(i9), cancellableContinuationImpl);
                    } else {
                        cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
                    }
                    String jSONString = JSON.toJSONString(map);
                    P2PLogger.logI$default(tracker.logger, Tracker.TAG_SEND, jSONString, null, 4, null);
                    WebSocket webSocket = tracker.webSocket;
                    if (webSocket != null) {
                        Boxing.boxBoolean(webSocket.send(jSONString));
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    private Tracker(P2PContext p2PContext, String str, TrackerMessageSink trackerMessageSink, P2PLogger p2PLogger) {
        this.p2pContext = p2PContext;
        this.trackerSourceParam = str;
        this.msgSink = trackerMessageSink;
        this.logger = p2PLogger;
        this.pendingRequests = new HashMap();
        this.isDestroyed = new AtomicBoolean(false);
        P2PLogger.logI$default(p2PLogger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> Tracker init "), null, 4, null);
    }

    public /* synthetic */ Tracker(P2PContext p2PContext, String str, TrackerMessageSink trackerMessageSink, P2PLogger p2PLogger, DefaultConstructorMarker defaultConstructorMarker) {
        this(p2PContext, str, trackerMessageSink, p2PLogger);
    }

    private final void dispatchResponse(TrackerMessage trackerMessage) {
        CancellableContinuation<TrackerMessage> cancellableContinuation = this.pendingRequests.get(trackerMessage.getRequestId());
        if (cancellableContinuation == null) {
            P2PLogger.logE$default(this.logger, TAG, "[LiveP2PProblem][tracker=dispatch_error] no such request", null, 4, null);
            return;
        }
        Map<Integer, CancellableContinuation<TrackerMessage>> map = this.pendingRequests;
        TypeIntrinsics.asMutableMap(map).remove(trackerMessage.getRequestId());
        cancellableContinuation.resumeWith(Result.constructor-impl(trackerMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onMessageReceived(java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            r0 = r8
            java.lang.Class<com.bilibili.sistersplayer.p2p.tracker.Tracker$TrackerMessage> r1 = com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessage.class
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject(r0, r1)
            com.bilibili.sistersplayer.p2p.tracker.Tracker$TrackerMessage r0 = (com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessage) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Lac
            r0 = r8
            java.lang.String r0 = r0.getType()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto Lac
            r0 = r13
            int r0 = r0.length()
            if (r0 != 0) goto L26
            goto Lac
        L26:
            r0 = r8
            java.lang.String r0 = r0.getType()
            java.lang.String r1 = "response"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r12 = r0
            r0 = 0
            r11 = r0
            r0 = r12
            if (r0 == 0) goto L5b
            r0 = r8
            java.lang.Integer r0 = r0.getRequestId()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L4d
            r0 = r13
            int r0 = r0.intValue()
            r10 = r0
            goto L4f
        L4d:
            r0 = 0
            r10 = r0
        L4f:
            r0 = r10
            if (r0 <= 0) goto L5b
            r0 = r7
            r1 = r8
            r0.dispatchResponse(r1)
            goto La8
        L5b:
            r0 = r8
            java.lang.String r0 = r0.getType()
            java.lang.String r1 = "request"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto La8
            r0 = r8
            java.lang.String r0 = r0.getFrom()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L7f
            r0 = r11
            r10 = r0
            r0 = r13
            int r0 = r0.length()
            if (r0 != 0) goto L81
        L7f:
            r0 = 1
            r10 = r0
        L81:
            r0 = r10
            if (r0 == 0) goto L9e
            r0 = r7
            com.bilibili.sistersplayer.p2p.tracker.Tracker$TrackerMessageSink r0 = r0.msgSink
            r1 = r8
            r2 = r9
            java.lang.Object r0 = r0.onServerMessage(r1, r2)
            r8 = r0
            r0 = r8
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L9a
            r0 = r8
            return r0
        L9a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9e:
            r0 = r7
            com.bilibili.sistersplayer.p2p.tracker.Tracker$TrackerMessageSink r0 = r0.msgSink
            r1 = r8
            r0.onPeerMessage(r1)
        La8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lac:
            r0 = r7
            com.bilibili.sistersplayer.p2p.utils.P2PLogger r0 = r0.logger
            java.lang.String r1 = "Tracker"
            java.lang.String r2 = "[LiveP2PProblem][tracker=data_error] message is null"
            r3 = 0
            r4 = 4
            r5 = 0
            com.bilibili.sistersplayer.p2p.utils.P2PLogger.logE$default(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.tracker.Tracker.onMessageReceived(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendMessage(long r8, java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13, java.lang.String r14, java.lang.Object r15, kotlin.coroutines.Continuation<? super com.bilibili.sistersplayer.p2p.tracker.Tracker.TrackerMessage> r16) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.tracker.Tracker.sendMessage(long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object sendMessage$default(Tracker tracker, long j7, String str, String str2, int i7, String str3, String str4, Object obj, Continuation continuation, int i8, Object obj2) {
        if ((i8 & 64) != 0) {
            obj = null;
        }
        return tracker.sendMessage(j7, str, str2, i7, str3, str4, obj, continuation);
    }

    public static /* synthetic */ Object sendPeerRequest$default(Tracker tracker, String str, String str2, int i7, Object obj, Continuation continuation, int i8, Object obj2) {
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        if ((i8 & 8) != 0) {
            obj = null;
        }
        return tracker.sendPeerRequest(str, str2, i7, obj, continuation);
    }

    public static /* synthetic */ Object sendPeerResponse$default(Tracker tracker, String str, int i7, String str2, Object obj, Continuation continuation, int i8, Object obj2) {
        if ((i8 & 8) != 0) {
            obj = null;
        }
        return tracker.sendPeerResponse(str, i7, str2, obj, continuation);
    }

    public static /* synthetic */ Object sendServerRequest$default(Tracker tracker, String str, Integer num, Object obj, Continuation continuation, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return tracker.sendServerRequest(str, num, obj, continuation);
    }

    @Nullable
    public final Object connect(@NotNull Continuation<? super Boolean> continuation) {
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> Tracker connect "), null, 4, null);
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.webSocketJob = cancellableContinuationImpl;
        final String strA = a.a(this.p2pContext.getSistersConfiguration().trackerServers.get(this.p2pContext.getTrackerPositionInServers()), "?", this.trackerSourceParam);
        P2PContext p2PContext = this.p2pContext;
        P2PContext p2PContext2 = this.p2pContext;
        p2PContext2.setTrackerPositionInServers(p2PContext2.getTrackerPositionInServers() + 1);
        p2PContext.setTrackerPositionInServers(p2PContext2.getTrackerPositionInServers() % this.p2pContext.getSistersConfiguration().trackerServers.size());
        this.webSocketListener = new WebSocketListener(this, strA, cancellableContinuationImpl) { // from class: com.bilibili.sistersplayer.p2p.tracker.Tracker$connect$2$1
            final CancellableContinuation<Boolean> $it;
            final String $url;
            final Tracker this$0;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.this$0 = this;
                this.$url = strA;
                this.$it = cancellableContinuationImpl;
            }

            public void onClosed(WebSocket webSocket, int i7, String str) {
                if (this.this$0.isDestroyed.get()) {
                    return;
                }
                P2PContext.launch$default(this.this$0.p2pContext, null, new Tracker$connect$2$1$onClosed$1(this.this$0, i7, str, this.$url, null), 1, null);
            }

            public void onClosing(WebSocket webSocket, int i7, String str) {
                if (this.this$0.isDestroyed.get()) {
                    return;
                }
                if (this.this$0.p2pContext.isDestroyed()) {
                    P2PLogger.logW$default(this.this$0.logger, Tracker.TAG, d.a(this.this$0.hashCode(), this.this$0.p2pContext.hashCode(), "this@", "onClosing p2pContext@", " is destroyed, close this websocket"), null, 4, null);
                } else {
                    P2PContext.launch$default(this.this$0.p2pContext, null, new Tracker$connect$2$1$onClosing$1(this.this$0, str, null), 1, null);
                }
            }

            public void onFailure(WebSocket webSocket, Throwable th, Response response) {
                if (this.this$0.isDestroyed.get()) {
                    return;
                }
                if (this.this$0.p2pContext.isDestroyed()) {
                    P2PLogger.logW$default(this.this$0.logger, Tracker.TAG, d.a(this.this$0.hashCode(), this.this$0.p2pContext.hashCode(), "this@", "onFailure p2pContext@", " is destroyed, close this websocket"), null, 4, null);
                } else {
                    P2PContext.launch$default(this.this$0.p2pContext, null, new Tracker$connect$2$1$onFailure$1(this.this$0, response, this.$url, th, null), 1, null);
                }
            }

            public void onMessage(WebSocket webSocket, String str) {
                if (this.this$0.isDestroyed.get()) {
                    return;
                }
                if (this.this$0.p2pContext.isDestroyed()) {
                    P2PLogger.logW$default(this.this$0.logger, Tracker.TAG, d.a(this.this$0.hashCode(), this.this$0.p2pContext.hashCode(), "this@", " onMessage p2pContext@", " is destroyed, close this websocket "), null, 4, null);
                } else {
                    P2PContext.launch$default(this.this$0.p2pContext, null, new Tracker$connect$2$1$onMessage$1(this.this$0, str, null), 1, null);
                }
            }

            public void onOpen(WebSocket webSocket, Response response) {
                if (this.this$0.isDestroyed.get()) {
                    webSocket.close(4000, Tracker.USER_CLOSE_REASON);
                    P2PLogger.logI$default(this.this$0.logger, Tracker.TAG, "tracker destroy before websocket opend, close this websocket", null, 4, null);
                } else if (this.this$0.p2pContext.isDestroyed()) {
                    P2PLogger.logW$default(this.this$0.logger, Tracker.TAG, d.a(this.this$0.hashCode(), this.this$0.p2pContext.hashCode(), "this@", "onOpen p2pContext@", " is destroyed, close this websocket"), null, 4, null);
                } else {
                    P2PContext.launch$default(this.this$0.p2pContext, null, new Tracker$connect$2$1$onOpen$1(this.this$0, this.$url, webSocket, this.$it, null), 1, null);
                }
            }
        };
        P2PLogger.logI$default(this.logger, TAG, C4496a.a("tracker connect to ", strA), null, 4, null);
        Fetcher.Companion.getOkHttpClient().newWebSocket(new Request.Builder().url(strA).build(), this.webSocketListener);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final void destroy() {
        CancellableContinuation<? super Boolean> cancellableContinuation;
        P2PLogger.logI$default(this.logger, TAG, C3259x.a(hashCode(), "P2PLifeCycle-> Tracker destory "), null, 4, null);
        if (this.isDestroyed.get()) {
            P2PLogger.logI$default(this.logger, TAG, "had destroyed", null, 4, null);
            return;
        }
        P2PLogger.logI$default(this.logger, TAG, "tracker to close", null, 4, null);
        this.isDestroyed.set(true);
        CancellableContinuation<? super Boolean> cancellableContinuation2 = this.webSocketJob;
        if (cancellableContinuation2 != null && cancellableContinuation2.isActive() && (cancellableContinuation = this.webSocketJob) != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, (Throwable) null, 1, (Object) null);
        }
        this.webSocketJob = null;
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(4000, USER_CLOSE_REASON);
        }
        this.webSocket = null;
        for (Map.Entry<Integer, CancellableContinuation<TrackerMessage>> entry : this.pendingRequests.entrySet()) {
            if (entry.getValue().isActive()) {
                entry.getValue().cancel((Throwable) null);
            }
        }
        this.pendingRequests.clear();
        P2PLogger.logI$default(this.logger, TAG, "tracker close ok", null, 4, null);
    }

    @Nullable
    public final Object sendPeerRequest(@NotNull String str, @NotNull String str2, int i7, @Nullable Object obj, @NotNull Continuation<? super TrackerMessage> continuation) {
        return sendMessage(this.p2pContext.getSistersConfiguration().peerConnectionTimeoutMs, str, "request", i7, "action", str2, obj, continuation);
    }

    @Nullable
    public final Object sendPeerResponse(@NotNull String str, int i7, @NotNull String str2, @Nullable Object obj, @NotNull Continuation<? super TrackerMessage> continuation) {
        return sendMessage(this.p2pContext.getSistersConfiguration().serverTimeoutMs, str, "response", i7, NotificationCompat.CATEGORY_STATUS, str2, obj, continuation);
    }

    @Nullable
    public final Object sendServerRequest(@NotNull String str, @Nullable Integer num, @Nullable Object obj, @NotNull Continuation<? super TrackerMessage> continuation) {
        return sendMessage(this.p2pContext.getSistersConfiguration().serverTimeoutMs, null, "request", num != null ? num.intValue() : 0, "action", str, obj, continuation);
    }
}

package com.bilibili.ogvvega.tunnel;

import G3.B0;
import G3.C1932k0;
import G3.C1934l0;
import G3.C1938n0;
import G3.C1940o0;
import G3.C1949t0;
import G3.C1955w0;
import G3.C1957x0;
import com.bilibili.ad.composecomponent.feedbackpanel.s;
import com.bilibili.app.comm.opus.lightpublish.page.comment.A;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.accounts.BiliAccountsKt;
import com.bilibili.lib.moss.api.JvmException;
import com.bilibili.ogvvega.tunnel.VegaGrpcBidiTunnel;
import com.bilibili.okretro.ServiceGenerator;
import io.grpc.Channel;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaGrpcBidiTunnel.class */
public final class VegaGrpcBidiTunnel implements IBidiTunnel {
    private static final int CODE_SUCCESS = 0;

    @NotNull
    private static final String HOST = "vega-dsa.biliapi.net";

    @NotNull
    private static final String PACKAGE_PREFIX = "pgc.gateway.vega.v1.";
    private static final int PORT = 7443;

    @NotNull
    private static final String SEPARATOR = "-----------------------------------------";
    private static boolean authed;

    @Nullable
    private static BidiCall bidiCall;

    @Nullable
    private static CountDownLatch countdownLatch;

    @Nullable
    private static Heartbeat heartbeat;

    @NotNull
    private static final VegaGrpcBidiTunnel$listener$1 listener;

    @Nullable
    private static Disposable vegaNodeDisposable;

    @NotNull
    public static final VegaGrpcBidiTunnel INSTANCE = new VegaGrpcBidiTunnel();

    @NotNull
    private static final VegaApiService ogvGrpcService = (VegaApiService) ServiceGenerator.createService(VegaApiService.class);

    @NotNull
    private static final Map<TargetPath, Subscription> subscriptions = new LinkedHashMap();

    @NotNull
    private static final dd0.a reconnectPolicy = VegaConfigKt.reconnectPolicy();

    @NotNull
    private static final dd0.a reAuthPolicy = VegaConfigKt.reAuthPolicy();

    @NotNull
    private static final ConnTracker tracker = new ConnTracker();

    @NotNull
    private static final VegaMsgRetrieval msgRetrieval = new VegaMsgRetrieval(new Object());
    private static boolean vegaConnected = true;

    @NotNull
    private static final Map<String, VegaFrameVO> sendingFrames = new LinkedHashMap();

    @NotNull
    private static final Function0<Unit> onHeartbeatExecuteAction = new C1932k0(9);

    @NotNull
    private static final Function0<Unit> onHeartbeatLostAction = new C1934l0(9);

    /* JADX INFO: renamed from: com.bilibili.ogvvega.tunnel.VegaGrpcBidiTunnel$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaGrpcBidiTunnel$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(boolean z6) {
            if (z6) {
                VegaGrpcBidiTunnel vegaGrpcBidiTunnel = VegaGrpcBidiTunnel.INSTANCE;
                if (vegaGrpcBidiTunnel.hasSubscribedBiz()) {
                    vegaGrpcBidiTunnel.connect();
                }
            } else {
                VegaGrpcBidiTunnel.INSTANCE.disconnect(new Cause(CauseType.NOT_LOGIN, "not login"), false);
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final boolean z6 = this.Z$0;
            BLog.i("VegaGrpcBidiTunnel$1-invokeSuspend", "[ogv-vega-VegaGrpcBidiTunnel$1-invokeSuspend] " + com.bilibili.app.comm.bh.x5.b.a("login state changed, state = ", z6));
            HandlersKt.runOnGRPCThread(new Function0(z6) { // from class: com.bilibili.ogvvega.tunnel.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f73387a;

                {
                    this.f73387a = z6;
                }

                public final Object invoke() {
                    return VegaGrpcBidiTunnel.AnonymousClass1.invokeSuspend$lambda$0(this.f73387a);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Req] */
    /* JADX INFO: renamed from: com.bilibili.ogvvega.tunnel.VegaGrpcBidiTunnel$subscribe$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaGrpcBidiTunnel$subscribe$2.class */
    public static final class AnonymousClass2<Req> implements Requester<Req> {
        final TargetPath $targetPath;

        public AnonymousClass2(TargetPath targetPath) {
            this.$targetPath = targetPath;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit request$lambda$0(TargetPath targetPath, Object obj, String str) {
            VegaFrameVO vegaFrameVONewVegaFrame = FramesKt.newVegaFrame(targetPath.getKey(), obj, str);
            BidiCall bidiCall = VegaGrpcBidiTunnel.bidiCall;
            if (bidiCall != null) {
                bidiCall.onNext(vegaFrameVONewVegaFrame);
            }
            return Unit.INSTANCE;
        }

        @Override // com.bilibili.ogvvega.tunnel.Requester
        public void request(final Req req, final String str) {
            VegaGrpcBidiTunnel.INSTANCE.logWithSeparator("send business data, targetPath = " + this.$targetPath + ", value = " + req);
            final TargetPath targetPath = this.$targetPath;
            HandlersKt.runOnGRPCThread(new Function0(targetPath, req, str) { // from class: com.bilibili.ogvvega.tunnel.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TargetPath f73388a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f73389b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f73390c;

                {
                    this.f73388a = targetPath;
                    this.f73389b = req;
                    this.f73390c = str;
                }

                public final Object invoke() {
                    return VegaGrpcBidiTunnel.AnonymousClass2.request$lambda$0(this.f73388a, this.f73389b, this.f73390c);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.ogvvega.tunnel.IVegaMessageInteraction, java.lang.Object] */
    static {
        VegaGrpcBidiTunnel$listener$1 vegaGrpcBidiTunnel$listener$1 = new VegaGrpcBidiTunnel$listener$1();
        listener = vegaGrpcBidiTunnel$listener$1;
        HandlersKt.init();
        ConnectivityMonitor.getInstance().register(vegaGrpcBidiTunnel$listener$1);
        FlowKt.launchIn(FlowKt.onEach(FlowKt.drop(BiliAccountsKt.a(com.bilibili.ogv.infra.account.a.f67852b), 1), new AnonymousClass1(null)), GlobalScope.INSTANCE);
    }

    private VegaGrpcBidiTunnel() {
    }

    private final void auth() {
        HandlersKt.runOnGRPCThread(new EK0.b(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit auth$lambda$0() {
        VegaFrameVO vegaFrameVONewVegaFrame = FramesKt.newVegaFrame(ProtocolKt.getAUTH(), new AuthReqVO(), "type.googleapis.com/pgc.gateway.vega.v1.AuthReq");
        tracker.onStartAuth(vegaFrameVONewVegaFrame);
        sendingFrames.put(vegaFrameVONewVegaFrame.getOption().getReqId(), vegaFrameVONewVegaFrame);
        INSTANCE.logWithSeparator("send auth, frame = " + vegaFrameVONewVegaFrame);
        BidiCall bidiCall2 = bidiCall;
        if (bidiCall2 != null) {
            bidiCall2.onNext(vegaFrameVONewVegaFrame);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connect$lambda$0() {
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            BLog.i("VegaGrpcBidiTunnel-connect$lambda$0", "[ogv-vega-VegaGrpcBidiTunnel-connect$lambda$0] No activated network available");
            reconnectPolicy.c();
            return Unit.INSTANCE;
        }
        if (bidiCall != null) {
            return Unit.INSTANCE;
        }
        tracker.onStartConn();
        VegaGrpcBidiTunnel$connect$1$so$1 vegaGrpcBidiTunnel$connect$1$so$1 = new VegaGrpcBidiTunnel$connect$1$so$1();
        Single<VegaDenebNode> singleRequestVegaNodesUrl = ogvGrpcService.requestVegaNodesUrl();
        Functions.v vVar = Functions.a;
        vegaNodeDisposable = singleRequestVegaNodesUrl.subscribe(new Sg.e(vegaGrpcBidiTunnel$connect$1$so$1), new i(vegaGrpcBidiTunnel$connect$1$so$1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0$0$0(final VegaGrpcBidiTunnel$connect$1$so$1 vegaGrpcBidiTunnel$connect$1$so$1, final VegaDenebNode vegaDenebNode) {
        HandlersKt.runOnGRPCThread(new Function0(vegaDenebNode, vegaGrpcBidiTunnel$connect$1$so$1) { // from class: com.bilibili.ogvvega.tunnel.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VegaDenebNode f73382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VegaGrpcBidiTunnel$connect$1$so$1 f73383b;

            {
                this.f73382a = vegaDenebNode;
                this.f73383b = vegaGrpcBidiTunnel$connect$1$so$1;
            }

            public final Object invoke() {
                return VegaGrpcBidiTunnel.connect$lambda$0$0$0$0(this.f73382a, this.f73383b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connect$lambda$0$0$0$0(VegaDenebNode vegaDenebNode, VegaGrpcBidiTunnel$connect$1$so$1 vegaGrpcBidiTunnel$connect$1$so$1) {
        INSTANCE.connectByHost(vegaDenebNode.getHost(), vegaDenebNode.getPort(), vegaGrpcBidiTunnel$connect$1$so$1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connect$lambda$0$0$1(VegaGrpcBidiTunnel$connect$1$so$1 vegaGrpcBidiTunnel$connect$1$so$1, Throwable th) {
        HandlersKt.runOnGRPCThread(new EK0.f(vegaGrpcBidiTunnel$connect$1$so$1, th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit connect$lambda$0$0$1$0(VegaGrpcBidiTunnel$connect$1$so$1 vegaGrpcBidiTunnel$connect$1$so$1, Throwable th) {
        INSTANCE.connectByHost(HOST, PORT, vegaGrpcBidiTunnel$connect$1$so$1);
        com.bilibili.bangumi.logic.page.detail.service.e.a("[ogv-vega-VegaGrpcBidiTunnel-connect$lambda$0$0$1$0] ", O4.d.a("requestVegaNodesUrl error: ", th), "VegaGrpcBidiTunnel-connect$lambda$0$0$1$0", (Throwable) null);
        return Unit.INSTANCE;
    }

    private final void connectByHost(String str, int i7, KX0.c<VegaFrameVO> cVar) {
        Channel channelA = fc0.c.a(i7, str);
        if (channelA == null) {
            cVar.onError(new JvmException());
            return;
        }
        BidiCall bidiCall2 = new BidiCall(channelA);
        bidiCall = bidiCall2;
        bidiCall2.execute(cVar);
        auth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect(final Cause cause, final boolean z6) {
        BLog.i("VegaGrpcBidiTunnel-disconnect", "[ogv-vega-VegaGrpcBidiTunnel-disconnect] " + ("disconnect call, cause = " + cause + ", willReconnect = " + z6));
        HandlersKt.runOnGRPCThread(new Function0(cause, z6) { // from class: com.bilibili.ogvvega.tunnel.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Cause f73384a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f73385b;

            {
                this.f73384a = cause;
                this.f73385b = z6;
            }

            public final Object invoke() {
                return VegaGrpcBidiTunnel.disconnect$lambda$0(this.f73384a, this.f73385b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disconnect$lambda$0(Cause cause, boolean z6) {
        tracker.onDisconnect(cause.getMsg());
        Iterator<Map.Entry<TargetPath, Subscription>> it = subscriptions.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getSubscriber().onDisconnected(cause, z6);
        }
        if (bidiCall == null) {
            return Unit.INSTANCE;
        }
        sendingFrames.clear();
        HandlersKt.getHandler().removeCallbacksAndMessages(null);
        Heartbeat heartbeat2 = heartbeat;
        if (heartbeat2 != null) {
            heartbeat2.stop();
        }
        BidiCall bidiCall2 = bidiCall;
        if (bidiCall2 != null) {
            bidiCall2.onCompleted();
        }
        bidiCall = null;
        authed = false;
        INSTANCE.unsubscribeAll();
        Disposable disposable = vegaNodeDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disconnect$lambda$2() {
        reconnectPolicy.c();
        reAuthPolicy.c();
        INSTANCE.disconnect(new Cause(CauseType.NORMAL, "normal"), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleRespFrame(VegaFrameVO vegaFrameVO) {
        if (vegaFrameVO.getOption().isAck() && vegaFrameMessageIsContinuous(vegaFrameVO)) {
            sendAck(vegaFrameVO);
        }
        if (Intrinsics.areEqual(vegaFrameVO.getRoutePath(), ProtocolKt.getAUTH())) {
            onAuthResp(vegaFrameVO);
            return true;
        }
        if (Intrinsics.areEqual(vegaFrameVO.getRoutePath(), ProtocolKt.getHEARTBEAT())) {
            onHeartbeatResp(vegaFrameVO);
            return true;
        }
        if (!Intrinsics.areEqual(vegaFrameVO.getRoutePath(), ProtocolKt.getSUBSCRIBE())) {
            return false;
        }
        onSubscribeResp(vegaFrameVO);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasSubscribedBiz() {
        return !subscriptions.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logWithSeparator(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void msgRetrieval$lambda$0(VegaFrameVO vegaFrameVO) {
        INSTANCE.sendAck(vegaFrameVO);
    }

    private final void onAuthResp(VegaFrameVO vegaFrameVO) {
        HandlersKt.runOnGRPCThread(new HY0.c(vegaFrameVO, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAuthResp$lambda$0(VegaFrameVO vegaFrameVO) {
        if (vegaFrameVO.getOption().getStatus().getCode() == 0) {
            tracker.onAuthSuccess(vegaFrameVO);
            reAuthPolicy.c();
            reconnectPolicy.c();
            if (authed) {
                return Unit.INSTANCE;
            }
            authed = true;
            Heartbeat heartbeat2 = new Heartbeat(HandlersKt.getHandler(), onHeartbeatExecuteAction, onHeartbeatLostAction);
            heartbeat = heartbeat2;
            heartbeat2.start();
            INSTANCE.sendSubscribe();
        } else {
            tracker.onBizError(vegaFrameVO);
            if (vegaFrameVO.getOption().getStatus().getCode() == -401) {
                if (com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                    INSTANCE.reAuth();
                } else {
                    INSTANCE.disconnect(new Cause(CauseType.NOT_LOGIN, "not login"), false);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeartbeatExecuteAction$lambda$0() {
        HandlersKt.runOnGRPCThread(new C1955w0(8));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeartbeatExecuteAction$lambda$0$1() {
        VegaFrameVO vegaFrameVONewVegaFrame = FramesKt.newVegaFrame(ProtocolKt.getHEARTBEAT(), new HeartbeatReqVO(), "type.googleapis.com/pgc.gateway.vega.v1.MessageAckReq");
        INSTANCE.logWithSeparator("send heartbeat, frame = " + vegaFrameVONewVegaFrame);
        BidiCall bidiCall2 = bidiCall;
        if (bidiCall2 != null) {
            bidiCall2.onNext(vegaFrameVONewVegaFrame);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeartbeatLostAction$lambda$0() {
        BLog.e("VegaGrpcBidiTunnel-onHeartbeatLostAction$lambda$0", "[ogv-vega-VegaGrpcBidiTunnel-onHeartbeatLostAction$lambda$0] onHeartbeatLostAction", (Throwable) null);
        HandlersKt.runOnGRPCThread(new C1938n0(9));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeartbeatLostAction$lambda$0$0() {
        tracker.onHeartbeatLost();
        INSTANCE.reconnect(new Cause(CauseType.HEARTBEAT_LOST, "heartbeat lost"));
        return Unit.INSTANCE;
    }

    private final void onHeartbeatResp(VegaFrameVO vegaFrameVO) {
        HandlersKt.runOnGRPCThread(new C1949t0(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onHeartbeatResp$lambda$0() {
        Heartbeat heartbeat2 = heartbeat;
        if (heartbeat2 != null) {
            heartbeat2.onResp();
        }
        return Unit.INSTANCE;
    }

    private final void onSubscribeResp(VegaFrameVO vegaFrameVO) {
        HandlersKt.runOnGRPCThread(new A(vegaFrameVO, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubscribeResp$lambda$0(VegaFrameVO vegaFrameVO) {
        if (vegaFrameVO.getOption().getStatus().getCode() == 0) {
            tracker.onSubscribeSuccess(vegaFrameVO);
            Iterator<Map.Entry<TargetPath, Subscription>> it = subscriptions.entrySet().iterator();
            while (it.hasNext()) {
                Subscription value = it.next().getValue();
                if (value.getStarted() && !value.getSubscribed()) {
                    value.setSubscribed(true);
                    value.getSubscriber().onSubscribed(value.getReconnect());
                    BLog.i("VegaGrpcBidiTunnel-onSubscribeResp$lambda$0", "[ogv-vega-VegaGrpcBidiTunnel-onSubscribeResp$lambda$0] " + com.bilibili.app.comm.bh.x5.b.a("connect success isReconnect:", value.getReconnect()));
                    value.setReconnect(true);
                    vegaConnected = true;
                    msgRetrieval.reset();
                }
            }
        } else {
            tracker.onBizError(vegaFrameVO);
        }
        return Unit.INSTANCE;
    }

    private final void reAuth() {
        BLog.i("VegaGrpcBidiTunnel-reAuth", "[ogv-vega-VegaGrpcBidiTunnel-reAuth] re auth call");
        HandlersKt.runOnGRPCThread(new C1940o0(10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public static final Unit reAuth$lambda$0() {
        dd0.a aVar = reAuthPolicy;
        if (aVar.b()) {
            HandlersKt.getHandler().postDelayed(new Object(), aVar.a());
        } else {
            INSTANCE.disconnect(new Cause(CauseType.AUTH_FAILED, "re auth failed"), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reAuth$lambda$0$0() {
        INSTANCE.auth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reconnect(Cause cause) {
        dd0.a aVar = reconnectPolicy;
        defpackage.a.b("[ogv-vega-VegaGrpcBidiTunnel-reconnect] ", "vegaOpt reconnect call cause:" + cause + " hasMoreChance:" + aVar.b() + " reconnectPolicy.delay:" + aVar.a(), "VegaGrpcBidiTunnel-reconnect");
        vegaConnected = false;
        HandlersKt.runOnGRPCThread(new d(cause, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public static final Unit reconnect$lambda$0(Cause cause) {
        if (VegaManager.Companion.vegaOptEnabled()) {
            msgRetrieval.checkAndRetrieveMessageWhenReconnect(subscriptions);
        }
        VegaGrpcBidiTunnel vegaGrpcBidiTunnel = INSTANCE;
        dd0.a aVar = reconnectPolicy;
        vegaGrpcBidiTunnel.disconnect(cause, aVar.b());
        if (aVar.b()) {
            HandlersKt.getHandler().postDelayed(new Object(), aVar.a());
        } else {
            aVar.c();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reconnect$lambda$0$0() {
        INSTANCE.connect();
    }

    private final void sendAck(VegaFrameVO vegaFrameVO) {
        HandlersKt.runOnGRPCThread(new Kh.a(vegaFrameVO, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendAck$lambda$0(VegaFrameVO vegaFrameVO) {
        VegaFrameVO vegaFrameVONewVegaFrame = FramesKt.newVegaFrame(ProtocolKt.getMSG_ACK(), new MessageAckReqVO(String.valueOf(vegaFrameVO.getOption().getVegaId()), vegaFrameVO.getOption().getReqId(), vegaFrameVO.getOption().getAckOrigin(), "", vegaFrameVO.getOption().getSequence()), "type.googleapis.com/pgc.gateway.vega.v1.MessageAckReq");
        INSTANCE.logWithSeparator("send ack, reqFrame = " + vegaFrameVONewVegaFrame);
        BidiCall bidiCall2 = bidiCall;
        if (bidiCall2 != null) {
            bidiCall2.onNext(vegaFrameVONewVegaFrame);
        }
        return Unit.INSTANCE;
    }

    private final void sendSubscribe() {
        HandlersKt.runOnGRPCThread(new C1957x0(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendSubscribe$lambda$0() {
        Iterator<Map.Entry<TargetPath, Subscription>> it = subscriptions.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setStarted(true);
        }
        VegaFrameVO vegaFrameVONewVegaFrame = FramesKt.newVegaFrame(ProtocolKt.getSUBSCRIBE(), new SubscribeReqVO(CollectionsKt.toList(subscriptions.keySet())), "type.googleapis.com/pgc.gateway.vega.v1.SubscribeReq");
        tracker.onStartSubscribe(vegaFrameVONewVegaFrame);
        sendingFrames.put(vegaFrameVONewVegaFrame.getOption().getReqId(), vegaFrameVONewVegaFrame);
        INSTANCE.logWithSeparator("send subscribe, frame = " + vegaFrameVONewVegaFrame);
        BidiCall bidiCall2 = bidiCall;
        if (bidiCall2 != null) {
            bidiCall2.onNext(vegaFrameVONewVegaFrame);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$0(TargetPath targetPath, Subscriber subscriber) {
        subscriptions.put(targetPath, new Subscription(targetPath, subscriber, false, false, false, 16, null));
        if (authed) {
            INSTANCE.sendSubscribe();
        } else {
            INSTANCE.connect();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unsubscribe$lambda$0(TargetPath targetPath) {
        Map<TargetPath, Subscription> map = subscriptions;
        Subscription subscription = map.get(targetPath);
        if (subscription != null) {
            subscription.setStarted(false);
            subscription.setSubscribed(false);
        }
        map.remove(targetPath);
        if (authed) {
            INSTANCE.sendSubscribe();
        }
        if (map.isEmpty()) {
            INSTANCE.disconnect();
        }
        CountDownLatch countDownLatch = countdownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        return Unit.INSTANCE;
    }

    private final void unsubscribeAll() {
        for (Map.Entry<TargetPath, Subscription> entry : subscriptions.entrySet()) {
            entry.getValue().setStarted(false);
            entry.getValue().setSubscribed(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean vegaFrameMessageIsContinuous(VegaFrameVO vegaFrameVO) {
        return msgRetrieval.checkSeqIdIsContinuous(vegaFrameVO.getOption().getSequence());
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    public void connect() {
        BLog.i("VegaGrpcBidiTunnel-connect", "[ogv-vega-VegaGrpcBidiTunnel-connect] connect call");
        Disposable disposable = vegaNodeDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        HandlersKt.runOnGRPCThread(new EK0.d(10));
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    public void disconnect() {
        HandlersKt.runOnGRPCThread(new B0(8));
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    @NotNull
    public <Req> Requester<Req> subscribe(@NotNull TargetPath targetPath, @NotNull Subscriber<?> subscriber) throws InterruptedException {
        CountDownLatch countDownLatch = countdownLatch;
        if (countDownLatch != null) {
            countDownLatch.await(500L, TimeUnit.MILLISECONDS);
        }
        HandlersKt.runOnGRPCThread(new EK0.g(1, targetPath, subscriber));
        return new AnonymousClass2(targetPath);
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    public void unsubscribe(@NotNull TargetPath targetPath) {
        countdownLatch = new CountDownLatch(1);
        HandlersKt.runOnGRPCThread(new s(targetPath, 2));
    }

    public final boolean vegaConnected$ogv_vega_release() {
        return vegaConnected;
    }
}

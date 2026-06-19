package com.bilibili.ogvvega.tunnel;

import com.bapis.pgc.gateway.vega.v1.VegaFrame;
import com.bilibili.ogvvega.protobuf.MessageLiteConverter;
import com.bilibili.ogvvega.protobuf.ProtoBufEncoder;
import com.bilibili.ogvvega.tunnel.BidiCall;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.stub.ClientCalls;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/BidiCall.class */
public final class BidiCall {

    @NotNull
    private final Channel channel;
    private boolean completed;

    @Nullable
    private KX0.c<VegaFrame> reqObserver;

    /* JADX INFO: renamed from: com.bilibili.ogvvega.tunnel.BidiCall$execute$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/BidiCall$execute$1.class */
    public static final class AnonymousClass1 implements KX0.c<VegaFrame> {
        final KX0.c<VegaFrameVO> $respObserver;
        final BidiCall this$0;

        public AnonymousClass1(BidiCall bidiCall, KX0.c<VegaFrameVO> cVar) {
            this.this$0 = bidiCall;
            this.$respObserver = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onCompleted$lambda$2(BidiCall bidiCall, KX0.c cVar) {
            if (bidiCall.completed) {
                return Unit.INSTANCE;
            }
            cVar.onCompleted();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onError$lambda$1(BidiCall bidiCall, KX0.c cVar, Throwable th) {
            if (bidiCall.completed) {
                return Unit.INSTANCE;
            }
            cVar.onError(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNext$lambda$0(BidiCall bidiCall, VegaFrame vegaFrame, KX0.c cVar) {
            if (!bidiCall.completed && vegaFrame != null) {
                cVar.onNext(MessageLiteConverter.INSTANCE.messageLite2vo(vegaFrame, VegaFrameVO.class));
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        public void onCompleted() {
            BLog.i("BidiCall$execute$1-onCompleted", "[ogv-vega-BidiCall$execute$1-onCompleted] response onCompleted");
            final BidiCall bidiCall = this.this$0;
            final KX0.c<VegaFrameVO> cVar = this.$respObserver;
            HandlersKt.runOnGRPCThread(new Function0(bidiCall, cVar) { // from class: com.bilibili.ogvvega.tunnel.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BidiCall f73375a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final KX0.c f73376b;

                {
                    this.f73375a = bidiCall;
                    this.f73376b = cVar;
                }

                public final Object invoke() {
                    return BidiCall.AnonymousClass1.onCompleted$lambda$2(this.f73375a, this.f73376b);
                }
            });
        }

        public void onError(final Throwable th) {
            BLog.e("BidiCall$execute$1-onError", "[ogv-vega-BidiCall$execute$1-onError] response onError", th);
            final BidiCall bidiCall = this.this$0;
            final KX0.c<VegaFrameVO> cVar = this.$respObserver;
            HandlersKt.runOnGRPCThread(new Function0(bidiCall, cVar, th) { // from class: com.bilibili.ogvvega.tunnel.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BidiCall f73372a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final KX0.c f73373b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Throwable f73374c;

                {
                    this.f73372a = bidiCall;
                    this.f73373b = cVar;
                    this.f73374c = th;
                }

                public final Object invoke() {
                    return BidiCall.AnonymousClass1.onError$lambda$1(this.f73372a, this.f73373b, this.f73374c);
                }
            });
        }

        public void onNext(final VegaFrame vegaFrame) {
            defpackage.a.b("[ogv-vega-BidiCall$execute$1-onNext] ", "response onNext, value = " + vegaFrame, "BidiCall$execute$1-onNext");
            final BidiCall bidiCall = this.this$0;
            final KX0.c<VegaFrameVO> cVar = this.$respObserver;
            HandlersKt.runOnGRPCThread(new Function0(bidiCall, vegaFrame, cVar) { // from class: com.bilibili.ogvvega.tunnel.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BidiCall f73377a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final VegaFrame f73378b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final KX0.c f73379c;

                {
                    this.f73377a = bidiCall;
                    this.f73378b = vegaFrame;
                    this.f73379c = cVar;
                }

                public final Object invoke() {
                    return BidiCall.AnonymousClass1.onNext$lambda$0(this.f73377a, this.f73378b, this.f73379c);
                }
            });
        }
    }

    public BidiCall(@NotNull Channel channel) {
        this.channel = channel;
    }

    public final void execute(@NotNull KX0.c<VegaFrameVO> cVar) {
        HandlersKt.checkThread();
        ClientCall clientCallNewCall = this.channel.newCall(S7.g.getCreateTunnelMethod(), CallOptions.DEFAULT);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, cVar);
        Logger logger = ClientCalls.a;
        ClientCalls.a aVar = new ClientCalls.a(clientCallNewCall, true);
        ClientCalls.d dVar = new ClientCalls.d(anonymousClass1, aVar);
        clientCallNewCall.start(dVar, new Metadata());
        dVar.a();
        this.reqObserver = aVar;
    }

    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }

    public final void onCompleted() {
        HandlersKt.checkThread();
        if (this.completed) {
            return;
        }
        this.completed = true;
        KX0.c<VegaFrame> cVar = this.reqObserver;
        if (cVar != null) {
            cVar.onCompleted();
        }
        this.reqObserver = null;
    }

    public final void onNext(@NotNull VegaFrameVO vegaFrameVO) {
        KX0.c<VegaFrame> cVar;
        HandlersKt.checkThread();
        if (this.completed || (cVar = this.reqObserver) == null) {
            return;
        }
        cVar.onNext(VegaFrame.parseFrom(ProtoBufEncoder.INSTANCE.encode(vegaFrameVO)));
    }
}

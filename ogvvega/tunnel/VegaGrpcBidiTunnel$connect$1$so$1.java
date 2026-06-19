package com.bilibili.ogvvega.tunnel;

import EL.l;
import G3.D0;
import android.util.Log;
import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.biligame.ui.pointmall.address.dialog.H;
import kotlin.Unit;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaGrpcBidiTunnel$connect$1$so$1.class */
public final class VegaGrpcBidiTunnel$connect$1$so$1 implements KX0.c<VegaFrameVO> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCompleted$lambda$2() {
        VegaGrpcBidiTunnel.tracker.onServerCompleted();
        VegaGrpcBidiTunnel.INSTANCE.reconnect(new Cause(CauseType.SERVER_DISCONNECT, "server disconnect"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onError$lambda$1(Throwable th) {
        VegaGrpcBidiTunnel.tracker.onException(th, VegaGrpcBidiTunnel.sendingFrames);
        VegaGrpcBidiTunnel.sendingFrames.clear();
        VegaGrpcBidiTunnel.INSTANCE.reconnect(new Cause(CauseType.NETWORK_ERROR, "onError: msg = " + (th != null ? th.getMessage() : null) + ", throwable = " + th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNext$lambda$0(VegaFrameVO vegaFrameVO) {
        VegaGrpcBidiTunnel.sendingFrames.remove(vegaFrameVO.getOption().getReqId());
        VegaGrpcBidiTunnel vegaGrpcBidiTunnel = VegaGrpcBidiTunnel.INSTANCE;
        if (!vegaGrpcBidiTunnel.handleRespFrame(vegaFrameVO)) {
            BLog.i("VegaGrpcBidiTunnel$connect$1$so$1-onNext$lambda$0", "[ogv-vega-VegaGrpcBidiTunnel$connect$1$so$1-onNext$lambda$0] " + C3751q.a(vegaFrameVO.getOption().getSequence(), "vegaOpt start handle response vegaFrameVO sequence:"));
            VegaGrpcBidiTunnel.tracker.onReceiveMsg(vegaFrameVO);
            if (!VegaManager.Companion.vegaOptEnabled() || vegaGrpcBidiTunnel.vegaFrameMessageIsContinuous(vegaFrameVO)) {
                VegaGrpcBidiTunnel.msgRetrieval.onNextVegaMessage(VegaGrpcBidiTunnel.subscriptions, vegaFrameVO);
            } else {
                VegaGrpcBidiTunnel.msgRetrieval.checkAndRetrieveWhenDiscontinuous(vegaFrameVO.getOption().getSequence(), VegaGrpcBidiTunnel.subscriptions, vegaFrameVO);
            }
        }
        return Unit.INSTANCE;
    }

    public void onCompleted() {
        VegaGrpcBidiTunnel.INSTANCE.logWithSeparator("response onCompleted thread:" + Thread.currentThread().getName());
        HandlersKt.runOnGRPCThread(new D0(7));
    }

    public void onError(Throwable th) {
        VegaGrpcBidiTunnel.INSTANCE.logWithSeparator("response onError, error = " + th + ", stackTrace = " + Log.getStackTraceString(th));
        HandlersKt.runOnGRPCThread(new l(th, 2));
    }

    public void onNext(VegaFrameVO vegaFrameVO) {
        VegaGrpcBidiTunnel.INSTANCE.logWithSeparator("response onNext, value = " + vegaFrameVO + " thread:" + Thread.currentThread().getName());
        if (vegaFrameVO == null) {
            return;
        }
        HandlersKt.runOnGRPCThread(new H(vegaFrameVO, 1));
    }
}

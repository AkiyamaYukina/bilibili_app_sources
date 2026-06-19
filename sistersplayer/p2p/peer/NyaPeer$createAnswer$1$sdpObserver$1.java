package com.bilibili.sistersplayer.p2p.peer;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kntr.common.ad.capability.report.IReportExtraHandler;
import kntr.srcs.app.splash.reporter.ad.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$createAnswer$1$sdpObserver$1.class */
public final class NyaPeer$createAnswer$1$sdpObserver$1 implements SdpObserver {
    final NyaPeer.RelayChannel $ch;
    final PeerConnection $pc;
    final NyaPeer this$0;

    public NyaPeer$createAnswer$1$sdpObserver$1(PeerConnection peerConnection, NyaPeer nyaPeer, NyaPeer.RelayChannel relayChannel) {
        this.$pc = peerConnection;
        this.this$0 = nyaPeer;
        this.$ch = relayChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateSuccess$lambda$1$lambda$0(NyaPeer.RelayChannel relayChannel, NyaPeer nyaPeer, NyaPeer.IceCandidateData iceCandidateData) {
        relayChannel.sendCandidate(nyaPeer, iceCandidateData);
        return Unit.INSTANCE;
    }

    public void onCreateFailure(String str) {
        P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, C4496a.a("createAnswer onCreateFailure ", str), null, 4, null);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
        if (sessionDescription != null) {
            PeerConnection peerConnection = this.$pc;
            final NyaPeer nyaPeer = this.this$0;
            final NyaPeer.RelayChannel relayChannel = this.$ch;
            peerConnection.setLocalDescription(this, sessionDescription);
            final int i7 = 0;
            nyaPeer.waitForCandidate(sessionDescription.description, new Function1(i7, relayChannel, nyaPeer) { // from class: com.bilibili.sistersplayer.p2p.peer.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f104951a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f104952b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f104953c;

                {
                    this.f104951a = i7;
                    this.f104952b = relayChannel;
                    this.f104953c = nyaPeer;
                }

                public final Object invoke(Object obj) {
                    switch (this.f104951a) {
                        case 0:
                            return NyaPeer$createAnswer$1$sdpObserver$1.onCreateSuccess$lambda$1$lambda$0((NyaPeer.RelayChannel) this.f104952b, (NyaPeer) this.f104953c, (NyaPeer.IceCandidateData) obj);
                        default:
                            IReportExtraHandler iReportExtraHandler = (IReportExtraHandler) obj;
                            ((v) this.f104952b).c(iReportExtraHandler, false);
                            Function1 function1 = (Function1) this.f104953c;
                            if (function1 != null) {
                                function1.invoke(iReportExtraHandler);
                            }
                            return Unit.INSTANCE;
                    }
                }
            });
        }
    }

    public void onSetFailure(String str) {
        P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, C4496a.a("createAnswer onSetFailure ", str), null, 4, null);
    }

    public void onSetSuccess() {
        if (this.this$0.signalingState == PeerConnection.SignalingState.HAVE_REMOTE_OFFER || this.this$0.signalingState == PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER) {
            this.$pc.createAnswer(this, new MediaConstraints());
        }
    }
}

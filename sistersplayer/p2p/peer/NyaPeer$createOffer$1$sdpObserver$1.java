package com.bilibili.sistersplayer.p2p.peer;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.p2p.peer.NyaPeer;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$createOffer$1$sdpObserver$1.class */
public final class NyaPeer$createOffer$1$sdpObserver$1 implements SdpObserver {
    final NyaPeer.RelayChannel $ch;
    final PeerConnection $pc;
    final NyaPeer this$0;

    public NyaPeer$createOffer$1$sdpObserver$1(PeerConnection peerConnection, NyaPeer nyaPeer, NyaPeer.RelayChannel relayChannel) {
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
        P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, C4496a.a("createOffer onCreateFailure ", str), null, 4, null);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
        if (sessionDescription != null) {
            PeerConnection peerConnection = this.$pc;
            final NyaPeer nyaPeer = this.this$0;
            final NyaPeer.RelayChannel relayChannel = this.$ch;
            peerConnection.setLocalDescription(this, sessionDescription);
            nyaPeer.waitForCandidate(sessionDescription.description, new Function1(relayChannel, nyaPeer) { // from class: com.bilibili.sistersplayer.p2p.peer.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NyaPeer.RelayChannel f104954a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final NyaPeer f104955b;

                {
                    this.f104954a = relayChannel;
                    this.f104955b = nyaPeer;
                }

                public final Object invoke(Object obj) {
                    return NyaPeer$createOffer$1$sdpObserver$1.onCreateSuccess$lambda$1$lambda$0(this.f104954a, this.f104955b, (NyaPeer.IceCandidateData) obj);
                }
            });
        }
    }

    public void onSetFailure(String str) {
        P2PLogger.logI$default(this.this$0.logger, NyaPeer.TAG, C4496a.a("createOffer onSetFailure ", str), null, 4, null);
    }

    public void onSetSuccess() {
    }
}

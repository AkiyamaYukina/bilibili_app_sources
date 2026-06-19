package com.bilibili.sistersplayer.p2p.peer;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerExtData.class */
public final class NyaPeerExtData {

    @Nullable
    private CancellableContinuation<? super Boolean> candidateJob;

    @Nullable
    private String connectDescription;

    @Nullable
    private Job connectionTimeoutJob;
    private boolean incoming;
    private boolean isAnswerAccepted;
    private boolean isDownloadBlockReport;

    @Nullable
    private Integer offerRequestId;

    @NotNull
    private String peerId = "";

    @NotNull
    private PeerRole peerRole = PeerRole.PEER;

    @NotNull
    private final Set<Integer> seedSliceIds = new LinkedHashSet();
    private int seedScore = 100;

    @Nullable
    public final CancellableContinuation<Boolean> getCandidateJob() {
        return this.candidateJob;
    }

    @Nullable
    public final String getConnectDescription() {
        return this.connectDescription;
    }

    @Nullable
    public final Job getConnectionTimeoutJob() {
        return this.connectionTimeoutJob;
    }

    public final boolean getIncoming() {
        return this.incoming;
    }

    @Nullable
    public final Integer getOfferRequestId() {
        return this.offerRequestId;
    }

    @NotNull
    public final String getPeerId() {
        return this.peerId;
    }

    @NotNull
    public final PeerRole getPeerRole() {
        return this.peerRole;
    }

    public final int getSeedScore() {
        return this.seedScore;
    }

    @NotNull
    public final Set<Integer> getSeedSliceIds() {
        return this.seedSliceIds;
    }

    public final boolean isAnswerAccepted() {
        return this.isAnswerAccepted;
    }

    public final boolean isDownloadBlockReport() {
        return this.isDownloadBlockReport;
    }

    public final void setAnswerAccepted(boolean z6) {
        this.isAnswerAccepted = z6;
    }

    public final void setCandidateJob(@Nullable CancellableContinuation<? super Boolean> cancellableContinuation) {
        this.candidateJob = cancellableContinuation;
    }

    public final void setConnectDescription(@Nullable String str) {
        this.connectDescription = str;
    }

    public final void setConnectionTimeoutJob(@Nullable Job job) {
        this.connectionTimeoutJob = job;
    }

    public final void setDownloadBlockReport(boolean z6) {
        this.isDownloadBlockReport = z6;
    }

    public final void setIncoming(boolean z6) {
        this.incoming = z6;
    }

    public final void setOfferRequestId(@Nullable Integer num) {
        this.offerRequestId = num;
    }

    public final void setPeerId(@NotNull String str) {
        this.peerId = str;
    }

    public final void setPeerRole(@NotNull PeerRole peerRole) {
        this.peerRole = peerRole;
    }

    public final void setSeedScore(int i7) {
        this.seedScore = i7;
    }
}

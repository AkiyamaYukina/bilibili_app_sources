package com.bilibili.sistersplayer.p2p.tracker;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/GetPeersResult.class */
public final class GetPeersResult {

    @Nullable
    private List<String> leeches;

    @Nullable
    private List<String> peers;

    @Nullable
    private Map<String, ? extends List<String>> seedboxes;

    @Nullable
    public final List<String> getLeeches() {
        return this.leeches;
    }

    @Nullable
    public final List<String> getPeers() {
        return this.peers;
    }

    @Nullable
    public final Map<String, List<String>> getSeedboxes() {
        return this.seedboxes;
    }

    public final void setLeeches(@Nullable List<String> list) {
        this.leeches = list;
    }

    public final void setPeers(@Nullable List<String> list) {
        this.peers = list;
    }

    public final void setSeedboxes(@Nullable Map<String, ? extends List<String>> map) {
        this.seedboxes = map;
    }
}

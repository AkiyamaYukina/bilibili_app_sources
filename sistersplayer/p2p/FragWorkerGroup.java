package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragWorkerGroup.class */
public final class FragWorkerGroup {

    @NotNull
    private final LiveFragment frag;

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final List<Function0<Unit>> localDistanceChanged = new ArrayList();

    @NotNull
    private final List<Integer> blockMinDistances = new ArrayList();

    public FragWorkerGroup(@NotNull P2PContext p2PContext, @NotNull LiveFragment liveFragment) {
        this.p2pContext = p2PContext;
        this.frag = liveFragment;
        this.logger = p2PContext.getLogger();
        int blockCount = liveFragment.getBlockCount();
        for (int i7 = 0; i7 < blockCount; i7++) {
            this.blockMinDistances.add(Integer.valueOf(this.p2pContext.getSistersConfiguration().maxDistance));
        }
    }

    @NotNull
    public final List<Integer> getBlockMinDistances() {
        return this.blockMinDistances;
    }

    @NotNull
    public final LiveFragment getFrag() {
        return this.frag;
    }

    @NotNull
    public final List<Function0<Unit>> getLocalDistanceChanged() {
        return this.localDistanceChanged;
    }

    @NotNull
    public final P2PContext getP2pContext() {
        return this.p2pContext;
    }

    public final void updateLocalDistances(@NotNull Function1<? super List<Integer>, Unit> function1) {
        function1.invoke(this.frag.getDistance());
        Iterator<Function0<Unit>> it = this.localDistanceChanged.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
    }
}

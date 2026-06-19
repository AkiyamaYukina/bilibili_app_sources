package com.bilibili.sistersplayer.p2p.fragment;

import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.controller.SliceIdController;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.ArrayDeque;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/LiveFragmentSet.class */
public final class LiveFragmentSet {

    @NotNull
    private final P2PLogger logger;

    @NotNull
    private final P2PContext p2pContext;

    @NotNull
    private final HashMap<String, LiveFragment> fragmentSet = new HashMap<>();

    @NotNull
    private final ArrayDeque<String> fragmentQueue = new ArrayDeque<>();

    public LiveFragmentSet(@NotNull P2PContext p2PContext, @NotNull P2PLogger p2PLogger) {
        this.p2pContext = p2PContext;
        this.logger = p2PLogger;
    }

    public static /* synthetic */ LiveFragment addFragment$default(LiveFragmentSet liveFragmentSet, String str, int i7, Long l7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            l7 = null;
        }
        return liveFragmentSet.addFragment(str, i7, l7);
    }

    @Nullable
    public final LiveFragment addFragment(@NotNull String str, int i7, @Nullable Long l7) {
        LiveFragment liveFragment;
        LiveFragment liveFragment2 = this.fragmentSet.get(str);
        if (liveFragment2 == null) {
            LiveFragment liveFragment3 = new LiveFragment(this.p2pContext, str, i7, l7);
            this.fragmentSet.put(str, liveFragment3);
            this.fragmentQueue.add(str);
            liveFragment = liveFragment3;
        } else {
            liveFragment = liveFragment2.getFragmentSize() == i7 ? liveFragment2 : null;
        }
        return liveFragment;
    }

    public final boolean deleteFragment(@NotNull String str) {
        int iIndexOf = this.fragmentQueue.indexOf(str);
        if (iIndexOf >= 0) {
            this.fragmentQueue.remove(iIndexOf);
        }
        if (!this.fragmentSet.containsKey(str)) {
            return false;
        }
        LiveFragment liveFragment = this.fragmentSet.get(str);
        if (liveFragment != null) {
            liveFragment.destroy();
        }
        this.fragmentSet.remove(str);
        return true;
    }

    public final void deleteFragmentUntil(@NotNull String str) {
        LiveFragment liveFragmentRemove;
        for (int iIndexOf = this.fragmentQueue.indexOf(str); iIndexOf > this.p2pContext.getSistersConfiguration().fragmentCountOutdated; iIndexOf--) {
            String str2 = (String) this.fragmentQueue.removeFirst();
            if (str2.length() > 0 && (liveFragmentRemove = this.fragmentSet.remove(str2)) != null) {
                this.p2pContext.getP2pDataCollection().addFragmentDataCollection(liveFragmentRemove);
                SliceIdController sliceIdController = this.p2pContext.getSliceIdController();
                if (sliceIdController != null) {
                    sliceIdController.addFragmentShareData(liveFragmentRemove);
                }
                this.p2pContext.getShareQuotaController().addFragmentDataCollection(liveFragmentRemove);
                liveFragmentRemove.destroy();
            }
        }
    }

    public final void destroy() {
        this.fragmentQueue.clear();
        for (Map.Entry<String, LiveFragment> entry : this.fragmentSet.entrySet()) {
            entry.getValue().destroy();
            this.p2pContext.getP2pDataCollection().addFragmentDataCollection(entry.getValue());
        }
        this.fragmentSet.clear();
    }

    @Nullable
    public final LiveFragment getFragment(@Nullable String str) {
        return this.fragmentSet.get(str);
    }
}

package com.bilibili.sistersplayer.p2p.controller;

import com.bilibili.sistersplayer.p2p.fragment.LiveFragment;
import com.bilibili.sistersplayer.p2p.utils.LimitedQueue;
import com.bilibili.sistersplayer.p2p.utils.Wrapped;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/controller/ShareQuotaController.class */
public final class ShareQuotaController {

    @NotNull
    private final LimitedQueue<Wrapped<Integer>> remainingShareQuotaQueue = new LimitedQueue<>(10);

    public final void addFragmentDataCollection(@NotNull LiveFragment liveFragment) {
        this.remainingShareQuotaQueue.push(new Wrapped<>(Integer.valueOf(liveFragment.getRemainingShareQuotaBytes())));
    }

    public final int takeShareQuato(int i7) {
        int i8 = 0;
        while (!this.remainingShareQuotaQueue.empty() && i8 < i7) {
            int i9 = i7 - i8;
            if (i9 > 0) {
                Wrapped<Integer> wrappedFront = this.remainingShareQuotaQueue.front();
                Wrapped<Integer> wrapped = wrappedFront;
                if (wrappedFront == null) {
                    wrapped = new Wrapped<>(0);
                }
                int iIntValue = i9;
                if (i9 > wrapped.getData().intValue()) {
                    iIntValue = wrapped.getData().intValue();
                }
                int i10 = i8 + iIntValue;
                wrapped.setData(Integer.valueOf(wrapped.getData().intValue() - iIntValue));
                i8 = i10;
                if (wrapped.getData().intValue() <= 0) {
                    this.remainingShareQuotaQueue.pop();
                    i8 = i10;
                }
            }
        }
        return i8;
    }
}

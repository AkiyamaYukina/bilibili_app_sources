package com.bilibili.sistersplayer.p2p.fragment;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/fragment/SliceProgress.class */
public final class SliceProgress {
    private int curCount;
    private int maxCount;
    private int nextFinishedBlockId;
    private int shareSize;
    private int sliceSize;
    private int startBlockId;

    @NotNull
    private final List<Integer> statArray = new ArrayList();

    @NotNull
    private final List<Integer> roleArray = new ArrayList();

    public SliceProgress() {
        for (DataSourceType dataSourceType : DataSourceType.values()) {
            this.statArray.add(dataSourceType.ordinal(), 0);
        }
        for (DataRoleType dataRoleType : DataRoleType.values()) {
            this.roleArray.add(dataRoleType.ordinal(), 0);
        }
    }

    public final int getCurCount() {
        return this.curCount;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getNextFinishedBlockId() {
        return this.nextFinishedBlockId;
    }

    @NotNull
    public final List<Integer> getRoleArray() {
        return this.roleArray;
    }

    public final int getShareSize() {
        return this.shareSize;
    }

    public final int getSliceSize() {
        return this.sliceSize;
    }

    public final int getStartBlockId() {
        return this.startBlockId;
    }

    @NotNull
    public final List<Integer> getStatArray() {
        return this.statArray;
    }

    public final void setCurCount(int i7) {
        this.curCount = i7;
    }

    public final void setMaxCount(int i7) {
        this.maxCount = i7;
    }

    public final void setNextFinishedBlockId(int i7) {
        this.nextFinishedBlockId = i7;
    }

    public final void setShareSize(int i7) {
        this.shareSize = i7;
    }

    public final void setSliceSize(int i7) {
        this.sliceSize = i7;
    }

    public final void setStartBlockId(int i7) {
        this.startBlockId = i7;
    }
}

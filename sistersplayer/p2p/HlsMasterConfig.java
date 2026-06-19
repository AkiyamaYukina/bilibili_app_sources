package com.bilibili.sistersplayer.p2p;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/HlsMasterConfig.class */
@Keep
public final class HlsMasterConfig {

    @JSONField(name = "filter_pathway")
    private boolean filterPathway;

    @JSONField(name = "top_bitrate_reset_up")
    private boolean topBitrateResetUp;

    @JSONField(name = "switch_keep_buffer")
    private long switchKeepBuffer = 2000;

    @JSONField(name = "try_swich_max_count")
    private int trySwitchMaxCount = 3;

    @JSONField(name = "max_nesting_hls_depth")
    private int maxNestingHlsDepth = 2;

    @JSONField(name = "min_play_little_duration")
    private long minPlayLittleDuration = 1000;

    @JSONField(name = "filter_codec")
    private boolean filterCodec = true;

    @JSONField(name = "prohibit_av01")
    private boolean prohibitAv01 = true;

    public final boolean getFilterCodec() {
        return this.filterCodec;
    }

    public final boolean getFilterPathway() {
        return this.filterPathway;
    }

    public final int getMaxNestingHlsDepth() {
        return this.maxNestingHlsDepth;
    }

    public final long getMinPlayLittleDuration() {
        return this.minPlayLittleDuration;
    }

    public final boolean getProhibitAv01() {
        return this.prohibitAv01;
    }

    public final long getSwitchKeepBuffer() {
        return this.switchKeepBuffer;
    }

    public final boolean getTopBitrateResetUp() {
        return this.topBitrateResetUp;
    }

    public final int getTrySwitchMaxCount() {
        return this.trySwitchMaxCount;
    }

    public final void setFilterCodec(boolean z6) {
        this.filterCodec = z6;
    }

    public final void setFilterPathway(boolean z6) {
        this.filterPathway = z6;
    }

    public final void setMaxNestingHlsDepth(int i7) {
        this.maxNestingHlsDepth = i7;
    }

    public final void setMinPlayLittleDuration(long j7) {
        this.minPlayLittleDuration = j7;
    }

    public final void setProhibitAv01(boolean z6) {
        this.prohibitAv01 = z6;
    }

    public final void setSwitchKeepBuffer(long j7) {
        this.switchKeepBuffer = j7;
    }

    public final void setTopBitrateResetUp(boolean z6) {
        this.topBitrateResetUp = z6;
    }

    public final void setTrySwitchMaxCount(int i7) {
        this.trySwitchMaxCount = i7;
    }
}

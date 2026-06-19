package com.bilibili.lib.videoupload.speeddetect;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/ProbeResponse.class */
@Keep
public final class ProbeResponse {

    @Nullable
    private List<Line> lines;

    @Nullable
    private Probe probe;

    @Nullable
    public final List<Line> getLines() {
        return this.lines;
    }

    @Nullable
    public final Probe getProbe() {
        return this.probe;
    }

    public final void setLines(@Nullable List<Line> list) {
        this.lines = list;
    }

    public final void setProbe(@Nullable Probe probe) {
        this.probe = probe;
    }
}

package com.bilibili.studio.videocompile.data;

import androidx.annotation.Keep;
import com.bilibili.studio.videocompile.data.d;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileStrategyData.class */
@Keep
public class BVideoCompileStrategyData extends BVideoCompileBaseData {
    private final int audioBitrate;
    private final long beforeStuckInterval;
    private final int beforeStuckProgress;
    private final int fps;
    private final boolean isHardwareEncoder;
    private final boolean isStuck;
    private final int stuckProgress;
    private final long stuckTime;
    private final float videoBitrate;
    private final int videoHeight;
    private final int videoWidth;

    public BVideoCompileStrategyData(@NotNull d.b bVar, @NotNull d.e eVar) {
        super(bVar);
        this.audioBitrate = eVar.f108746a;
        this.videoBitrate = eVar.f108747b;
        this.fps = eVar.f108748c;
        int i7 = eVar.f108749d;
        this.videoWidth = i7;
        this.videoHeight = i7;
        this.isHardwareEncoder = eVar.f108750e;
        this.isStuck = eVar.f108751f;
        this.stuckTime = eVar.f108752g;
        this.stuckProgress = eVar.h;
        this.beforeStuckProgress = eVar.f108753i;
        this.beforeStuckInterval = eVar.f108754j;
    }

    @Override // com.bilibili.studio.videocompile.data.BVideoCompileBaseData
    @NotNull
    public HashMap<String, String> createMapData() {
        HashMap<String, String> mapCreateMapData = super.createMapData();
        mapCreateMapData.put("audioBitrate", String.valueOf(this.audioBitrate));
        mapCreateMapData.put("videoBitrate", String.valueOf(this.videoBitrate));
        mapCreateMapData.put("fps", String.valueOf(this.fps));
        mapCreateMapData.put("videoWidth", String.valueOf(this.videoWidth));
        mapCreateMapData.put("videoHeight", String.valueOf(this.videoHeight));
        mapCreateMapData.put("isHardwareEncoder", this.isHardwareEncoder ? "1" : "0");
        if (this.isStuck) {
            mapCreateMapData.put("stuckTime", String.valueOf(this.stuckTime));
            mapCreateMapData.put("stuckProgress", String.valueOf(this.stuckProgress));
            mapCreateMapData.put("beforeStuckProgress", String.valueOf(this.beforeStuckProgress));
            mapCreateMapData.put("beforeStuckInterval", String.valueOf(this.beforeStuckInterval));
        }
        return mapCreateMapData;
    }
}

package com.bilibili.studio.videocompile.data;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.bilibili.studio.videocompile.data.d;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileCancelData.class */
@Keep
public final class BVideoCompileCancelData extends BVideoCompileStrategyData implements OA0.a {

    @NotNull
    private final d.a cancelParams;

    @NotNull
    private final String classTag;
    private final int code;

    @NotNull
    private final d.b commonParams;

    @NotNull
    private final String message;
    private final int progress;

    @NotNull
    private final d.e strategyParams;
    private final long takenTime;
    private final long timelineDuration;

    public BVideoCompileCancelData(@NotNull d.b bVar, @NotNull d.e eVar, @NotNull d.a aVar) {
        super(bVar, eVar);
        this.commonParams = bVar;
        this.strategyParams = eVar;
        this.cancelParams = aVar;
        this.classTag = "BVideoCompileCancelData";
        this.code = aVar.f108726a;
        this.message = aVar.f108727b;
        this.takenTime = aVar.f108728c;
        this.progress = aVar.f108729d;
        this.timelineDuration = aVar.f108730e;
    }

    private final d.b component1() {
        return this.commonParams;
    }

    private final d.e component2() {
        return this.strategyParams;
    }

    private final d.a component3() {
        return this.cancelParams;
    }

    public static /* synthetic */ BVideoCompileCancelData copy$default(BVideoCompileCancelData bVideoCompileCancelData, d.b bVar, d.e eVar, d.a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bVar = bVideoCompileCancelData.commonParams;
        }
        if ((i7 & 2) != 0) {
            eVar = bVideoCompileCancelData.strategyParams;
        }
        if ((i7 & 4) != 0) {
            aVar = bVideoCompileCancelData.cancelParams;
        }
        return bVideoCompileCancelData.copy(bVar, eVar, aVar);
    }

    @NotNull
    public final BVideoCompileCancelData copy(@NotNull d.b bVar, @NotNull d.e eVar, @NotNull d.a aVar) {
        return new BVideoCompileCancelData(bVar, eVar, aVar);
    }

    @Override // com.bilibili.studio.videocompile.data.BVideoCompileStrategyData, com.bilibili.studio.videocompile.data.BVideoCompileBaseData
    @NotNull
    public HashMap<String, String> createMapData() {
        HashMap<String, String> mapCreateMapData = super.createMapData();
        mapCreateMapData.put("errorCode", String.valueOf(this.code));
        mapCreateMapData.put("errorMessage", this.message);
        mapCreateMapData.put("takenTime", String.valueOf(this.takenTime));
        mapCreateMapData.put(NotificationCompat.CATEGORY_PROGRESS, String.valueOf(this.progress));
        mapCreateMapData.put("timelineDuration", String.valueOf(this.timelineDuration));
        mapCreateMapData.put("sandboxedPath", this.commonParams.h);
        return mapCreateMapData;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BVideoCompileCancelData)) {
            return false;
        }
        BVideoCompileCancelData bVideoCompileCancelData = (BVideoCompileCancelData) obj;
        return Intrinsics.areEqual(this.commonParams, bVideoCompileCancelData.commonParams) && Intrinsics.areEqual(this.strategyParams, bVideoCompileCancelData.strategyParams) && Intrinsics.areEqual(this.cancelParams, bVideoCompileCancelData.cancelParams);
    }

    @Override // OA0.a
    @NotNull
    public String getClassTag() {
        return this.classTag;
    }

    public int hashCode() {
        int iHashCode = this.commonParams.hashCode();
        return this.cancelParams.hashCode() + ((this.strategyParams.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BVideoCompileCancelData(commonParams=" + this.commonParams + ", strategyParams=" + this.strategyParams + ", cancelParams=" + this.cancelParams + ")";
    }
}

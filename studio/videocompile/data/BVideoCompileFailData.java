package com.bilibili.studio.videocompile.data;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.bilibili.studio.videocompile.data.d;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileFailData.class */
@Keep
public final class BVideoCompileFailData extends BVideoCompileStrategyData implements OA0.a {

    @NotNull
    private final String classTag;
    private final int code;

    @NotNull
    private final d.b commonParams;

    @Nullable
    private final String crashDetail;

    @NotNull
    private final d.c failParams;

    @NotNull
    private final String message;
    private final int progress;

    @NotNull
    private final d.e strategyParams;
    private final long takenTime;
    private final long timelineDuration;

    public BVideoCompileFailData(@NotNull d.b bVar, @NotNull d.e eVar, @NotNull d.c cVar) {
        super(bVar, eVar);
        this.commonParams = bVar;
        this.strategyParams = eVar;
        this.failParams = cVar;
        this.classTag = "BVideoCompileFailData";
        this.code = cVar.f108738a;
        this.message = cVar.f108739b;
        this.takenTime = cVar.f108740c;
        this.progress = cVar.f108741d;
        this.timelineDuration = cVar.f108742e;
        this.crashDetail = cVar.f108743f;
    }

    private final d.b component1() {
        return this.commonParams;
    }

    private final d.e component2() {
        return this.strategyParams;
    }

    private final d.c component3() {
        return this.failParams;
    }

    public static /* synthetic */ BVideoCompileFailData copy$default(BVideoCompileFailData bVideoCompileFailData, d.b bVar, d.e eVar, d.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bVar = bVideoCompileFailData.commonParams;
        }
        if ((i7 & 2) != 0) {
            eVar = bVideoCompileFailData.strategyParams;
        }
        if ((i7 & 4) != 0) {
            cVar = bVideoCompileFailData.failParams;
        }
        return bVideoCompileFailData.copy(bVar, eVar, cVar);
    }

    @NotNull
    public final BVideoCompileFailData copy(@NotNull d.b bVar, @NotNull d.e eVar, @NotNull d.c cVar) {
        return new BVideoCompileFailData(bVar, eVar, cVar);
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
        String str = this.crashDetail;
        if (str != null) {
            mapCreateMapData.put("crashDetail", str);
        }
        return mapCreateMapData;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BVideoCompileFailData)) {
            return false;
        }
        BVideoCompileFailData bVideoCompileFailData = (BVideoCompileFailData) obj;
        return Intrinsics.areEqual(this.commonParams, bVideoCompileFailData.commonParams) && Intrinsics.areEqual(this.strategyParams, bVideoCompileFailData.strategyParams) && Intrinsics.areEqual(this.failParams, bVideoCompileFailData.failParams);
    }

    @Override // OA0.a
    @NotNull
    public String getClassTag() {
        return this.classTag;
    }

    public int hashCode() {
        int iHashCode = this.commonParams.hashCode();
        return this.failParams.hashCode() + ((this.strategyParams.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BVideoCompileFailData(commonParams=" + this.commonParams + ", strategyParams=" + this.strategyParams + ", failParams=" + this.failParams + ")";
    }
}

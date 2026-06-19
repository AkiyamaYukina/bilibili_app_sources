package com.bilibili.pegasus.request;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.opus.lightpublish.compose.F;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.pegasus.data.base.PegasusResponse;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/l.class */
@StabilityInferred(parameters = 0)
public final class l implements IParser<GeneralResponse<PegasusResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public F f78835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PegasusGsonParser f78836b;

    @Override // com.bilibili.okretro.converter.IParser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GeneralResponse<PegasusResponse> convert(@NotNull ResponseBody responseBody) {
        long[] jArr = com.bilibili.pegasus.components.customreporter.f.f75941a;
        Lazy lazy = com.bilibili.pegasus.components.customreporter.l.f75948a;
        jArr[4] = SystemClock.uptimeMillis();
        BLog.i("[SegPegasus]PegasusParser", "pegasus start parse");
        long jCurrentTimeMillis = System.currentTimeMillis();
        PegasusGsonParser pegasusGsonParser = this.f78836b;
        if (pegasusGsonParser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parser");
            pegasusGsonParser = null;
        }
        GeneralResponse<PegasusResponse> generalResponseG = pegasusGsonParser.g(responseBody);
        BLog.i("[SegPegasus]PegasusParser", "pegasus parse cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
        jArr[6] = SystemClock.uptimeMillis();
        return generalResponseG;
    }
}

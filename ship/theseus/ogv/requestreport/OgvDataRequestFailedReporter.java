package com.bilibili.ship.theseus.ogv.requestreport;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.moss.api.NetworkException;
import com.bilibili.lib.neuron.api.Neurons;
import java.io.IOException;
import java.net.ConnectException;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/requestreport/OgvDataRequestFailedReporter.class */
@StabilityInferred(parameters = 1)
public final class OgvDataRequestFailedReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final OgvDataRequestFailedReporter f94423a = new OgvDataRequestFailedReporter();

    public final void a(@NotNull String str, @NotNull Map<String, String> map, @NotNull Throwable th) {
        int i7 = 1002;
        if (!(th instanceof NetworkException)) {
            if (th instanceof ConnectException) {
                i7 = 1003;
            } else if (!(th instanceof IOException)) {
                i7 = 1001;
            }
        }
        Neurons.trackT$default(false, "ogv.detail.data.failed.report", MapsKt.mapOf(new Pair[]{TuplesKt.to("errorCode", String.valueOf(i7)), TuplesKt.to("errorMsg", String.valueOf(th.getMessage())), TuplesKt.to("requestUrl", str), TuplesKt.to("requestParams", map.toString())}), 0, new OgvDataRequestFailedReporter$reportOnDetailDataFailed$1(this), 8, (Object) null);
    }
}

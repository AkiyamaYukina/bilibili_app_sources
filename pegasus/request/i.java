package com.bilibili.pegasus.request;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.pegasus.data.base.PegasusResponse;
import j4.t;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import np0.C8128a;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/i.class */
@Singleton
@StabilityInferred(parameters = 0)
public final class i implements IParser<GeneralResponse<PegasusResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8128a f78833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f78834b = LazyKt.lazy(new HS0.h(this, 4));

    @Inject
    public i(@NotNull C8128a c8128a) {
        this.f78833a = c8128a;
    }

    @Override // com.bilibili.okretro.converter.IParser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GeneralResponse<PegasusResponse> convert(@NotNull ResponseBody responseBody) {
        long[] jArr = com.bilibili.pegasus.components.customreporter.f.f75941a;
        Lazy lazy = com.bilibili.pegasus.components.customreporter.l.f75948a;
        jArr[4] = SystemClock.uptimeMillis();
        BLog.i("[Pegasus]PegasusParser", "pegasus start parse");
        long jCurrentTimeMillis = System.currentTimeMillis();
        GeneralResponse<PegasusResponse> generalResponseG = ((PegasusGsonParser) this.f78834b.getValue()).g(responseBody);
        BLog.i("[Pegasus]PegasusParser", "pegasus parse cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
        jArr[6] = SystemClock.uptimeMillis();
        return generalResponseG;
    }

    public final void b() {
        PegasusGsonParser pegasusGsonParser = (PegasusGsonParser) this.f78834b.getValue();
        if (((Boolean) pegasusGsonParser.f78798b.getValue()).booleanValue()) {
            boolean bootOptEnable = EntryPointKt.getBootOptEnable();
            t.a("preload exp = ", "[Pegasus]GsonParser", bootOptEnable);
            if (bootOptEnable) {
                BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new PegasusGsonParser$preParseInnerCard$1(pegasusGsonParser, null), 2, (Object) null);
            } else {
                pegasusGsonParser.h();
            }
        }
    }
}

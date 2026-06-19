package com.bilibili.playerbizcommonv2.history;

import Wr0.f;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.playerdb.basic.IPlayerDBData;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/history/c.class */
@StabilityInferred(parameters = 1)
public final class c implements Wr0.b<CommonVideoPlayerDBData> {
    @Override // Wr0.b
    public final String a(IPlayerDBData iPlayerDBData) {
        CommonVideoPlayerDBData commonVideoPlayerDBData = (CommonVideoPlayerDBData) iPlayerDBData;
        long j7 = commonVideoPlayerDBData != null ? commonVideoPlayerDBData.f81780a : 0L;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.US, "av:%d", Arrays.copyOf(new Object[]{Long.valueOf(j7)}, 1));
    }

    @Override // Wr0.b
    public final /* bridge */ /* synthetic */ String b(IPlayerDBData iPlayerDBData) {
        return "1";
    }

    @Override // Wr0.b
    public final String c(IPlayerDBData iPlayerDBData) {
        CommonVideoPlayerDBData commonVideoPlayerDBData = (CommonVideoPlayerDBData) iPlayerDBData;
        Application application = BiliContext.application();
        long j7 = commonVideoPlayerDBData != null ? commonVideoPlayerDBData.f81781b : 0L;
        long jA = f.a(application);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.US, "av:%d%d", Arrays.copyOf(new Object[]{Long.valueOf(jA), Long.valueOf(j7)}, 2));
    }
}

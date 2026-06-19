package com.bilibili.playerbizcommon.history.ugc;

import Wr0.f;
import android.app.Application;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.base.BiliContext;
import com.bilibili.playerdb.basic.IPlayerDBData;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/history/ugc/b.class */
public final class b implements Wr0.b<UgcVideoPlayerDBData> {
    @Override // Wr0.b
    public final String a(IPlayerDBData iPlayerDBData) {
        long j7 = ((UgcVideoPlayerDBData) iPlayerDBData).f80086a;
        Locale locale = Locale.US;
        return C3751q.a(j7, "av:");
    }

    @Override // Wr0.b
    public final /* bridge */ /* synthetic */ String b(@Nullable IPlayerDBData iPlayerDBData) {
        return "1";
    }

    @Override // Wr0.b
    public final String c(IPlayerDBData iPlayerDBData) {
        Application application = BiliContext.application();
        long j7 = ((UgcVideoPlayerDBData) iPlayerDBData).f80087b;
        long jA = f.a(application);
        Locale locale = Locale.US;
        return "av:" + jA + j7;
    }
}

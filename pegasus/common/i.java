package com.bilibili.pegasus.common;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pvtracker.IPvTracker;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import pp0.C8340D;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/i.class */
@StabilityInferred(parameters = 1)
public final class i implements IPvTracker {
    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "tm.recommend.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Pair<String, String> pairA = C8340D.a();
        Bundle bundle = new Bundle();
        bundle.putString((String) pairA.getFirst(), (String) pairA.getSecond());
        bundle.putString("is_night_follow", MultipleThemeUtils.isNightFollowSystem(BiliContext.application()) ? "1" : "0");
        bundle.putString("sys_mode", MultipleThemeUtils.isContextModeNight(BiliContext.application()) ? "1" : "2");
        bundle.putString("app_mode", MultipleThemeUtils.isNightTheme(BiliContext.application()) ? "1" : "2");
        return bundle;
    }
}

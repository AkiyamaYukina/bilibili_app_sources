package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import hv0.C7510d;
import javax.inject.Inject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/v.class */
@StabilityInferred(parameters = 1)
public final class v {
    @Inject
    public v(@NotNull OgvSeason ogvSeason, @NotNull C7510d c7510d) {
        String str = ogvSeason.f94467t;
        String str2 = str;
        if (StringsKt.isBlank(str)) {
            String str3 = ogvSeason.f94468u;
            str2 = str3;
            if (StringsKt.isBlank(str3)) {
                str2 = ogvSeason.f94465r;
            }
        }
        c7510d.a(str2);
    }
}

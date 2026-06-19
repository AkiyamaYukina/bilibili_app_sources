package com.bilibili.ogv.misc.timeline;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.RouteRequest;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    @JvmStatic
    public static final void a(@NotNull Context context) {
        Qj0.g.d(new RouteRequest.Builder("bilibili://pgc/timeline-preference").requestCode(8010), context);
    }
}

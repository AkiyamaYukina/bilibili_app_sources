package com.bilibili.pegasus.page;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.routeui.launcher.AbstractLauncher;
import com.bilibili.routeui.launcher.AbstractLauncherKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/d.class */
@StabilityInferred(parameters = 0)
public final class C5715d extends AbstractLauncher {
    @NotNull
    public final Intent createIntent(@NotNull Context context, @NotNull RouteRequest routeRequest, @NotNull RouteInfo routeInfo) {
        Class clazz = routeInfo.getClazz();
        if (!Fragment.class.isAssignableFrom(clazz)) {
            throw new UnsupportedOperationException(clazz + " is neither androidx.fragment.app.Fragment");
        }
        Bundle bundleCreateExtrasForFragment = AbstractLauncherKt.createExtrasForFragment(routeRequest, routeInfo);
        int i7 = GraduationSeasonTimeMachineContainerActivity.f78288I;
        Intent intent = new Intent(context, (Class<?>) GraduationSeasonTimeMachineContainerActivity.class);
        intent.putExtra("fragment", clazz.getName());
        intent.putExtra("fragment_args", bundleCreateExtrasForFragment);
        if (routeRequest.getFlags() != 0) {
            intent.setFlags(routeRequest.getFlags());
        }
        ClipData clipData = routeRequest.getClipData();
        if (clipData != null) {
            intent.setClipData(clipData);
        }
        return intent;
    }
}

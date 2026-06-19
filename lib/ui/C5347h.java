package com.bilibili.lib.ui;

import Wf0.C3039l;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.routeui.launcher.AbstractLauncher;
import com.bilibili.routeui.launcher.AbstractLauncherKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.lib.ui.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/h.class */
public final class C5347h extends AbstractLauncher {
    @NotNull
    public final Intent createIntent(@NotNull Context context, @NotNull RouteRequest routeRequest, @NotNull RouteInfo routeInfo) {
        Class clazz = routeInfo.getClazz();
        if (!Fragment.class.isAssignableFrom(clazz)) {
            throw new UnsupportedOperationException(clazz + " is neither Activity nor androidx.fragment.app.Fragment");
        }
        Bundle bundleCreateExtrasForFragment = AbstractLauncherKt.createExtrasForFragment(routeRequest, routeInfo);
        int i7 = ComposeActivity.f64734B;
        int iB = C3039l.b(clazz);
        Intent intent = new Intent(context, (Class<?>) (C5350k.b(iB) ? BehindComposeActivity.class : C5350k.a(iB) ? LandscapeComposeActivity.class : ComposeActivity.class));
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

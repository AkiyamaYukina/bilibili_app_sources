package com.bilibili.lib.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.routeui.launcher.AbstractLauncher;
import com.bilibili.routeui.launcher.AbstractLauncherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/O.class */
public final class O extends AbstractLauncher {
    @Nullable
    public final Intent createIntent(@NotNull Context context, @NotNull RouteRequest routeRequest, @NotNull RouteInfo routeInfo) {
        Intent intent;
        Class<?> clazz = routeInfo.getClazz();
        if (Activity.class.isAssignableFrom(clazz)) {
            Intent intent2 = new Intent();
            intent2.setClass(context, clazz);
            intent2.putExtras(AbstractLauncherKt.createExtras(routeRequest, routeInfo));
            Uri data = routeRequest.getData();
            Uri pureUri = data;
            if (data == null) {
                pureUri = routeRequest.getPureUri();
            }
            intent2.setData(pureUri);
            intent = intent2;
        } else {
            if (!Fragment.class.isAssignableFrom(clazz)) {
                throw new UnsupportedOperationException(clazz + " is neither Activity nor androidx.fragment.app.Fragment");
            }
            Bundle bundleCreateExtrasForFragment = AbstractLauncherKt.createExtrasForFragment(routeRequest, routeInfo);
            int i7 = TransparentContainerActivity.f64825I;
            intent = new Intent(context, (Class<?>) TransparentContainerActivity.class);
            intent.putExtra("fragment", clazz.getName());
            intent.putExtra("fragment_args", bundleCreateExtrasForFragment);
        }
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

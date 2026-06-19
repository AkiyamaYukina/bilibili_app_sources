package com.bilibili.playset.editor.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RequestMode;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.router.Router;
import com.bilibili.playset.api.MultitypePlaylist;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/utils/g.class */
public final class g {
    @NotNull
    public static final RouteRequest a(int i7) {
        RouteRequest routeRequestBuild;
        if (DeviceDecision.INSTANCE.getBoolean("dd.hit_new_playset_editor", true)) {
            final int i8 = 0;
            routeRequestBuild = new RouteRequest.Builder(Uri.parse("bilibili://playset/editor")).extras(new Function1(i8) { // from class: com.bilibili.playset.editor.utils.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84851a;

                {
                    this.f84851a = i8;
                }

                public final Object invoke(Object obj) {
                    switch (this.f84851a) {
                        case 0:
                            Bundle bundle = new Bundle();
                            bundle.putInt("page_type", 1);
                            ((MutableBundleLike) obj).put("extra_play_set_editor", bundle);
                            return Unit.INSTANCE;
                        case 1:
                            return ((CharSequence) obj).toString();
                        default:
                            return Unit.INSTANCE;
                    }
                }
            }).requestCode(i7).build();
        } else {
            routeRequestBuild = new RouteRequest.Builder(Uri.parse("activity://playset/box/create")).requestCode(i7).build();
        }
        return routeRequestBuild;
    }

    public static final void b(@NotNull Context context, final long j7, @Nullable final MultitypePlaylist.Info info, @Nullable ActivityResultLauncher activityResultLauncher) {
        boolean z6 = DeviceDecision.INSTANCE.getBoolean("dd.hit_new_playset_editor", true);
        boolean z7 = info != null && ((info.attr >> 1) & 1) == 0;
        boolean z8 = info != null && (info.attr & 1) == 1;
        if (!z6) {
            Router.RouterProxy routerProxyWith = Router.Companion.global().with(context).with("id", String.valueOf(j7)).with("title", info != null ? info.title : null).with("intro", info != null ? info.intro : null).with("cover", info != null ? info.cover : null);
            String strValueOf = null;
            if (info != null) {
                strValueOf = String.valueOf(info.cover_type);
            }
            routerProxyWith.with("cover_type", strValueOf).with("is_default", String.valueOf(z7)).with("private", String.valueOf(z8)).forResult(1001).open("activity://playset/box/edit");
            return;
        }
        if (activityResultLauncher != null) {
            final boolean z9 = z7;
            final boolean z10 = z8;
            activityResultLauncher.launch((Intent) BLRouter.newCall(new RouteRequest.Builder(Uri.parse("bilibili://playset/editor")).extras(new Function1(j7, info, z9, z10) { // from class: com.bilibili.playset.editor.utils.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f84852a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MultitypePlaylist.Info f84853b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f84854c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f84855d;

                {
                    this.f84852a = j7;
                    this.f84853b = info;
                    this.f84854c = z9;
                    this.f84855d = z10;
                }

                public final Object invoke(Object obj) {
                    MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                    Bundle bundle = new Bundle();
                    bundle.putInt("page_type", 2);
                    bundle.putLong("id", this.f84852a);
                    MultitypePlaylist.Info info2 = this.f84853b;
                    bundle.putString("title", info2 != null ? info2.title : null);
                    bundle.putString("intro", info2 != null ? info2.intro : null);
                    String str = null;
                    if (info2 != null) {
                        str = info2.cover;
                    }
                    bundle.putString("cover", str);
                    bundle.putInt("cover_type", info2 != null ? info2.cover_type : 0);
                    bundle.putBoolean("is_default", this.f84854c);
                    bundle.putBoolean("private", this.f84855d);
                    mutableBundleLike.put("extra_play_set_editor", bundle);
                    return Unit.INSTANCE;
                }
            }).build(), context, (Fragment) null, RequestMode.INTENT, false).execute().getObj());
        } else {
            final boolean z11 = z7;
            final boolean z12 = z8;
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://playset/editor")).extras(new Function1(j7, info, z11, z12) { // from class: com.bilibili.playset.editor.utils.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f84856a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MultitypePlaylist.Info f84857b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f84858c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final boolean f84859d;

                {
                    this.f84856a = j7;
                    this.f84857b = info;
                    this.f84858c = z11;
                    this.f84859d = z12;
                }

                public final Object invoke(Object obj) {
                    MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                    Bundle bundle = new Bundle();
                    bundle.putInt("page_type", 2);
                    bundle.putLong("id", this.f84856a);
                    MultitypePlaylist.Info info2 = this.f84857b;
                    bundle.putString("title", info2 != null ? info2.title : null);
                    bundle.putString("intro", info2 != null ? info2.intro : null);
                    String str = null;
                    if (info2 != null) {
                        str = info2.cover;
                    }
                    bundle.putString("cover", str);
                    bundle.putInt("cover_type", info2 != null ? info2.cover_type : 0);
                    bundle.putBoolean("is_default", this.f84858c);
                    bundle.putBoolean("private", this.f84859d);
                    mutableBundleLike.put("extra_play_set_editor", bundle);
                    return Unit.INSTANCE;
                }
            }).requestCode(1001).build(), context);
        }
    }
}

package com.bilibili.upper.module.uppercenterlocal.service;

import android.app.Activity;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.p;
import androidx.lifecycle.ViewModelProvider;
import bJ0.C5096a;
import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.upper.module.uppercenter.model.UpperCenterViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/service/d.class */
@StabilityInferred(parameters = 0)
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WeakReference<Activity> f114268a;

    public d(@NotNull WeakReference<Activity> weakReference) {
        this.f114268a = weakReference;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.a
    public final void S0(@Nullable String str) {
        Activity activity = this.f114268a.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (str == null || str.length() == 0) {
            BLog.e("TaskCenterService", "target url is null");
            return;
        }
        final int i7 = 0;
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/transweb/")).data(Uri.parse(str)).extras(new Function1(i7) { // from class: com.bilibili.upper.module.uppercenterlocal.service.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f114267a;

            {
                this.f114267a = i7;
            }

            public final Object invoke(Object obj) {
                switch (this.f114267a) {
                    case 0:
                        ((MutableBundleLike) obj).put("param_control", p.a("intent_hide_close", "intent_is_bg_trans", true, true));
                        break;
                    case 1:
                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                        mutableBundleLike.put("key_modify_name_from", "main.my-information.0.0");
                        mutableBundleLike.put("key_modify_name_scene", "3");
                        break;
                    default:
                        break;
                }
                return Unit.INSTANCE;
            }
        }).build(), activity);
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.a
    public final void U3(int i7) {
        Activity activity = this.f114268a.get();
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
        if (componentActivity == null || componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            return;
        }
        ZI0.g.f29597a.cancel();
        String str = i7 == 0 ? "fail" : "success";
        if (!C5096a.f56464d) {
            C5096a.f56464d = true;
            TE0.b bVar = TE0.b.f24088a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j7 = C5096a.f56467g;
            bVar.getClass();
            TE0.b.q(jCurrentTimeMillis - j7, str);
        }
        if (i7 == C5096a.f56465e) {
            return;
        }
        BLog.e("TaskCenterService", "state is " + i7);
        UpperCenterViewModel upperCenterViewModel = (UpperCenterViewModel) new ViewModelProvider(componentActivity).get(UpperCenterViewModel.class);
        C5096a.f56465e = i7;
        upperCenterViewModel.f114115g.postValue(Boolean.TRUE);
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.service.a
    public final void h6(int i7) {
        Activity activity = this.f114268a.get();
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
        if (componentActivity == null || componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            return;
        }
        BLog.i("TaskCenterService", "requestWebViewLayout: height=" + i7);
        int toPx = AdExtensions.getToPx(i7);
        if (toPx == C5096a.f56463c) {
            return;
        }
        UpperCenterViewModel upperCenterViewModel = (UpperCenterViewModel) new ViewModelProvider(componentActivity).get(UpperCenterViewModel.class);
        C5096a.f56463c = toPx;
        upperCenterViewModel.f114115g.postValue(Boolean.TRUE);
    }
}

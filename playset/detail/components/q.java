package com.bilibili.playset.detail.components;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RequestMode;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/components/q.class */
@StabilityInferred(parameters = 0)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Fragment f84339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FragmentManager f84342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<Intent> f84345g;

    public q(@NotNull Fragment fragment, boolean z6, boolean z7, @Nullable FragmentManager fragmentManager, @NotNull ActivityResultLauncher<Intent> activityResultLauncher, @NotNull ActivityResultLauncher<Intent> activityResultLauncher2, @NotNull ActivityResultLauncher<Intent> activityResultLauncher3) {
        this.f84339a = fragment;
        this.f84340b = z6;
        this.f84341c = z7;
        this.f84342d = fragmentManager;
        this.f84343e = activityResultLauncher;
        this.f84344f = activityResultLauncher2;
        this.f84345g = activityResultLauncher3;
    }

    public static void c(q qVar, RouteRequest routeRequest, String str, com.bilibili.bililive.room.ui.roomv3.vertical.global.d dVar, p pVar, int i7) {
        ViewGroup viewGroup = null;
        if ((i7 & 4) != 0) {
            dVar = null;
        }
        if ((i7 & 8) != 0) {
            pVar = new Cy.b(routeRequest, 4);
        }
        if (!qVar.f84340b && !qVar.f84341c) {
            pVar.invoke();
            return;
        }
        FragmentManager fragmentManager = qVar.f84342d;
        if (fragmentManager == null) {
            pVar.invoke();
            return;
        }
        try {
            Fragment fragment = qVar.f84339a;
            View view = fragment.getView();
            ViewParent parent = view != null ? view.getParent() : null;
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            final p pVar2 = pVar;
            final int i8 = 0;
            com.bilibili.playset.utils.d.b(fragment, routeRequest, viewGroup != null ? viewGroup.getId() : 0, fragmentManager, str, dVar, new Function0(pVar2, i8) { // from class: com.bilibili.playset.detail.components.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84325a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f84326b;

                {
                    this.f84325a = i8;
                    this.f84326b = pVar2;
                }

                public final Object invoke() {
                    switch (this.f84325a) {
                        case 0:
                            this.f84326b.invoke();
                            break;
                        default:
                            this.f84326b.invoke();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        } catch (Exception e7) {
            pVar.invoke();
        }
    }

    public final void a() {
        this.f84343e.launch((Intent) BLRouter.newCall(RouteRequestKt.toRouteRequest("activity://main/login/"), this.f84339a.getContext(), (Fragment) null, RequestMode.INTENT, false).execute().getObj());
    }

    public final void b() {
        Unit unit;
        Fragment fragment = this.f84339a;
        FragmentManager fragmentManager = this.f84342d;
        if (fragmentManager != null) {
            if (fragmentManager.getBackStackEntryCount() > 0) {
                fragmentManager.popBackStack();
                unit = Unit.INSTANCE;
            } else {
                FragmentActivity fragmentActivityP3 = fragment.p3();
                if (fragmentActivityP3 != null) {
                    fragmentActivityP3.finish();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        FragmentActivity fragmentActivityP32 = fragment.p3();
        if (fragmentActivityP32 != null) {
            fragmentActivityP32.finish();
            Unit unit2 = Unit.INSTANCE;
        }
    }
}

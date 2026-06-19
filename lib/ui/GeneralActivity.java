package com.bilibili.lib.ui;

import Wf0.C3039l;
import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.garb.Garb;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/GeneralActivity.class */
@AndroidEntryPoint(AbstractActivityC5342c.class)
public class GeneralActivity extends s {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f64752H = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final LinkedList<Fragment> f64753F = new LinkedList<>();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Lazy f64754G = LazyKt.lazy(new WQ.G(this, 4));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/GeneralActivity$a.class */
    public static final class a implements RouteInterceptor {
        @NotNull
        public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
            final int i7 = 0;
            return chain.next(chain.getRequest().newBuilder().props(new Function1(i7) { // from class: com.bilibili.lib.ui.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f64848a;

                {
                    this.f64848a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f64848a) {
                        case 0:
                            ((MutableBundleLike) obj).put(RouteConstKt.PROPS_BG_COLOR, "0");
                            break;
                        default:
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }).build());
        }
    }

    @Override // com.bilibili.lib.ui.AbstractActivityC5342c
    @Nullable
    public final Integer Q6() {
        Integer numValueOf;
        int color;
        Bundle bundle;
        int color2 = ContextCompat.getColor(this, 2131101197);
        Bundle bundleY6 = Y6();
        String string = (bundleY6 == null || (bundle = bundleY6.getBundle(RouteConstKt.BLROUTER_PROPS)) == null) ? null : bundle.getString(RouteConstKt.PROPS_BG_COLOR);
        if (string == null || Intrinsics.areEqual(string, "1")) {
            numValueOf = Integer.valueOf(color2);
        } else if (Intrinsics.areEqual(string, "0")) {
            numValueOf = null;
        } else {
            try {
                color = Color.parseColor("#".concat(string));
            } catch (Exception e7) {
                color = color2;
            }
            numValueOf = Integer.valueOf(color);
        }
        return numValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.bilibili.lib.ui.AbstractActivityC5342c
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String R6() {
        /*
            r3 = this;
            r0 = r3
            android.os.Bundle r0 = r0.Y6()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "blrouter.props"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "ct.cutout.mode"
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L24
        L21:
            java.lang.String r0 = "0"
            r4 = r0
        L24:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.GeneralActivity.R6():java.lang.String");
    }

    @Override // com.bilibili.lib.ui.AbstractActivityC5342c
    public final int S6(@NotNull Garb garb) {
        Bundle bundle;
        String string;
        Integer color;
        Bundle bundleY6 = Y6();
        return (bundleY6 == null || (bundle = bundleY6.getBundle(RouteConstKt.BLROUTER_PROPS)) == null || (string = bundle.getString(RouteConstKt.PROPS_TOOLBAR_BGCOLOR)) == null || (color = RouteConstKt.parseColor(string)) == null) ? super.S6(garb) : color.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.bilibili.lib.ui.AbstractActivityC5342c
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String T6() {
        /*
            r3 = this;
            r0 = r3
            android.os.Bundle r0 = r0.Y6()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "blrouter.props"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "ct.statusbar.immersive"
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L24
        L21:
            java.lang.String r0 = "0"
            r4 = r0
        L24:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.GeneralActivity.T6():java.lang.String");
    }

    @Override // com.bilibili.lib.ui.AbstractActivityC5342c
    @NotNull
    public final String U6(@NotNull Garb garb) {
        Bundle bundle;
        String string;
        Bundle bundleY6 = Y6();
        if (bundleY6 != null && (bundle = bundleY6.getBundle(RouteConstKt.BLROUTER_PROPS)) != null && (string = bundle.getString(RouteConstKt.PROPS_STATUSBAR_MODE)) != null) {
            String str = string;
            if (!Intrinsics.areEqual(string, "0")) {
                str = Intrinsics.areEqual(string, "1") ? string : null;
            }
            if (str != null) {
                return str;
            }
        }
        return super.U6(garb);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.bilibili.lib.ui.AbstractActivityC5342c
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String V6() {
        /*
            r3 = this;
            r0 = r3
            android.os.Bundle r0 = r0.Y6()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "blrouter.props"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L21
            r0 = r4
            java.lang.String r1 = "ct.statusbar.hide"
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L24
        L21:
            java.lang.String r0 = "0"
            r4 = r0
        L24:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.GeneralActivity.V6():java.lang.String");
    }

    public final Bundle Y6() {
        return (Bundle) this.f64754G.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = (Fragment) this.f64753F.peek();
        if (activityResultCaller == null) {
            super.onBackPressed();
        } else {
            if ((activityResultCaller instanceof IBackPress) && ((IBackPress) activityResultCaller).onBackPressed()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3039l.a(this, null, "GeneralActivity");
    }

    @Override // com.bilibili.lib.ui.s, com.bilibili.lib.ui.AbstractActivityC5342c, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("fragment");
        FragmentContainerConfig fragmentContainerConfigC = null;
        if (stringExtra != null) {
            String str = !StringsKt.isBlank(stringExtra) ? stringExtra : null;
            fragmentContainerConfigC = null;
            if (str != null) {
                fragmentContainerConfigC = C3039l.c(getClassLoader(), str);
            }
        }
        C3039l.a(this, fragmentContainerConfigC, "GeneralActivity");
        super.onCreate(bundle);
        initializeViewTreeOwners();
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        Fragment fragmentInstantiate = fragmentFindFragmentById;
        if (fragmentFindFragmentById == null) {
            if (TextUtils.isEmpty(stringExtra)) {
                throw new NullPointerException("The specified Fragment class name is empty!");
            }
            fragmentInstantiate = Fragment.instantiate(this, stringExtra, Y6());
            getSupportFragmentManager().beginTransaction().add(R.id.content, fragmentInstantiate).commit();
        }
        LinkedList<Fragment> linkedList = this.f64753F;
        linkedList.clear();
        linkedList.push(fragmentInstantiate);
    }

    @Override // com.bilibili.lib.ui.s, com.bilibili.lib.ui.AbstractActivityC5342c, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        this.f64753F.clear();
        super.onDestroy();
    }
}

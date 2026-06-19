package com.bilibili.lib.ui;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.lib.ui.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/c.class */
public abstract class AbstractActivityC5342c extends BaseAppCompatActivity implements GarbWatcher.Observer {
    public final void P6(Garb garb) {
        if (Intrinsics.areEqual(V6(), "1")) {
            getWindow().addFlags(1024);
            getWindow().addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
            return;
        }
        if (Intrinsics.areEqual(T6(), "1")) {
            getWindow().clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1280);
            getWindow().setStatusBarColor(0);
            return;
        }
        int iS6 = S6(garb);
        Window window = getWindow();
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(iS6);
        String strU6 = U6(garb);
        if (Intrinsics.areEqual(strU6, "0")) {
            StatusBarCompat.setStatusBarDarkMode(getWindow());
        }
        if (Intrinsics.areEqual(strU6, "1")) {
            StatusBarCompat.setStatusBarLightMode(getWindow());
        }
    }

    @ColorInt
    @Nullable
    public Integer Q6() {
        return null;
    }

    @NotNull
    public String R6() {
        return "0";
    }

    public int S6(@NotNull Garb garb) {
        return !garb.isPure() ? garb.getSecondaryPageColor() : ThemeUtils.getThemeAttrColor(this, 2130968986);
    }

    @NotNull
    public String T6() {
        return "0";
    }

    @NotNull
    public String U6(@NotNull Garb garb) {
        String str = "1";
        if (!garb.isPure() ? garb.isDarkMode() : MultipleThemeUtils.isWhiteTheme(this)) {
            str = "0";
        }
        return str;
    }

    @NotNull
    public String V6() {
        return "0";
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String strR6 = R6();
        if (Intrinsics.areEqual(strR6, "1")) {
            if (NotchCompat.hasDisplayCutout(getWindow())) {
                NotchCompat.immersiveDisplayCutout(getWindow());
            }
        } else if (Intrinsics.areEqual(strR6, "2") && NotchCompat.hasDisplayCutout(getWindow())) {
            NotchCompat.blockDisplayCutout(getWindow());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Integer numQ6 = Q6();
        if (numQ6 != null) {
            ((ViewGroup) findViewById(R.id.content)).setBackgroundColor(numQ6.intValue());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        GarbWatcher.INSTANCE.unSubscribe(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        P6(GarbManager.getCurGarb());
        GarbWatcher.INSTANCE.subscribe(this);
        if (Build.VERSION.SDK_INT >= 26) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            getWindow().getDecorView().setSystemUiVisibility(MultipleThemeUtils.isNightTheme(this) ? systemUiVisibility & (-17) : systemUiVisibility | 16);
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R$color.f64616Wh0));
        }
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        P6(garb);
    }
}

package com.bilibili.opd.app.bizcommon.radar;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import cn0.d;
import com.bilibili.api.base.Config;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.ServicesProvider;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.image2.ImageRequestBuilder;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JvmField
    @Nullable
    public static Boolean f74171a = Boolean.TRUE;

    @JvmStatic
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "getServices", owner = {"com.bilibili.lib.blrouter.BLRouter"})
    @NotNull
    public static ServicesProvider a(@NotNull BLRouter bLRouter) {
        o00.a.a();
        return bLRouter.getServices(d.class);
    }

    @NotNull
    public static void b(@NotNull ImageRequestBuilder imageRequestBuilder, @Nullable String str) {
        if (!d(str) || StringsKt.Z(str, "http")) {
            imageRequestBuilder.url(str);
            return;
        }
        imageRequestBuilder.url("https:" + str);
    }

    @JvmStatic
    public static final DisplayMetrics c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static boolean d(@Nullable CharSequence charSequence) {
        return !(charSequence == null || ((String) charSequence).length() == 0);
    }

    public static boolean e(@NotNull Context context, @NotNull String str) {
        boolean z6;
        List<ActivityManager.RunningServiceInfo> runningServices;
        try {
            runningServices = ((ActivityManager) context.getSystemService(GameCenterBottomTabConfig.TAB_TYPE_ACT)).getRunningServices(30);
        } catch (Exception e7) {
            z6 = false;
        }
        if (runningServices != null && !runningServices.isEmpty()) {
            int size = runningServices.size();
            int i7 = 0;
            while (true) {
                z6 = false;
                if (i7 >= size) {
                    break;
                }
                if (TextUtils.equals(runningServices.get(i7).service.getClassName(), str)) {
                    z6 = true;
                    break;
                }
                i7++;
            }
            f("isServiceRunning: " + z6);
            return z6;
        }
        return false;
    }

    public static void f(@Nullable String str) {
        if (Config.isDebuggable()) {
            String str2 = str;
            if (str == null) {
                str2 = "null";
            }
            BLog.d("nov_test", str2);
        }
    }

    public static void g(TextView textView, String str, int i7, TextView textView2, int i8) {
        if ((i8 & 8) != 0) {
            textView2 = null;
        }
        boolean z6 = (i8 & 32) != 0;
        if (textView == null || str == null || !d(str)) {
            return;
        }
        float fMeasureText = textView.getPaint().measureText(str);
        while (fMeasureText > i7 && textView.getTextSize() >= i(8)) {
            float f7 = 1;
            textView.setTextSize(0, textView.getTextSize() - f7);
            if (textView2 != null) {
                textView2.setTextSize(0, Math.max(i(8), textView2.getTextSize() - f7));
            }
            fMeasureText = textView.getPaint().measureText(str);
        }
        if (z6) {
            textView.setText(str);
        }
    }

    public static void h(View view, boolean z6, Function1 function1, int i7) {
        if ((i7 & 4) != 0) {
            function1 = null;
        }
        if (!z6) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (function1 != null) {
            function1.invoke(view);
        }
    }

    public static int i(int i7) {
        return (int) ((i7 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}

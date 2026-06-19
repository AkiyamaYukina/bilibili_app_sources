package com.bilibili.playerbizcommonv2.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.StringRes;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.alipay.sdk.app.PayTask;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.foundation.FoundationAlias;
import java.util.Arrays;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/p.class */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f81943a = LazyKt.lazy(new Ee1.a(9));

    @NotNull
    public static final String a(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        Uri uriA;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str3.length() == 0) {
            return str;
        }
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str4 : queryParameterNames) {
                builderClearQuery.appendQueryParameter(str4, Intrinsics.areEqual(str4, str2) ? str3 : uri.getQueryParameter(str4));
            }
            uriA = builderClearQuery.build();
        } else {
            uriA = Re.t.a(uri, str2, str3);
        }
        return uriA.toString();
    }

    public static final boolean b(@NotNull Context context) {
        boolean z6;
        if (BiliAccounts.get(context).isLogin()) {
            z6 = true;
        } else {
            if (context != null) {
                BLRouter.routeTo(RouteRequestKt.toRouteRequest("bilibili://login"), context);
            }
            z6 = false;
        }
        return z6;
    }

    @ColorInt
    public static final int c(@NotNull Context context, @ColorRes int i7, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        return (ContextCompat.getColor(context, i7) & ViewCompat.MEASURED_SIZE_MASK) + ((((int) (f7 * 255)) & 255) << 24);
    }

    public static final boolean d() {
        return ((Boolean) f81943a.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(long r4, long r6) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r9 = r0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r10 = r0
            r0 = r9
            r1 = r4
            r0.setTimeInMillis(r1)
            r0 = r10
            r1 = r6
            r0.setTimeInMillis(r1)
            r0 = r9
            r1 = 6
            int r0 = r0.get(r1)
            r1 = r10
            r2 = 6
            int r1 = r1.get(r2)
            if (r0 != r1) goto L3c
            r0 = 1
            r8 = r0
            r0 = r9
            r1 = 1
            int r0 = r0.get(r1)
            r1 = r10
            r2 = 1
            int r1 = r1.get(r2)
            if (r0 != r1) goto L3c
            goto L3f
        L3c:
            r0 = 0
            r8 = r0
        L3f:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.utils.p.e(long, long):boolean");
    }

    @NotNull
    public static final Drawable f(@ColorInt int i7, float f7, int i8, @ColorInt int i9) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(DimenUtilsKt.dpToPx(i8));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i7);
        gradientDrawable.setStroke(DimenUtilsKt.dpToPx(f7), i9);
        return gradientDrawable;
    }

    public static final void h(@NotNull View view) {
        view.setVisibility(8);
    }

    public static final void i(@Nullable String str, @NotNull ScreenModeType screenModeType, @NotNull IToastService iToastService) {
        com.bilibili.biligame.ui.feed.preload.b.a("[playerbizcommonv2-PlayerExtensionsKt-showPlayerToast] ", C4496a.a("toast, ", str), "PlayerExtensionsKt-showPlayerToast");
        if (str == null || str.length() == 0) {
            return;
        }
        if (screenModeType == ScreenModeType.THUMB) {
            k(str);
        } else {
            iToastService.showToast(new PlayerToast.Builder().toastItemType(17).location(screenModeType == ScreenModeType.VERTICAL_FULLSCREEN ? 33 : 32).setExtraString("extra_title", str).duration(PayTask.f60018j).build());
        }
    }

    public static final void j(@StringRes int i7) {
        k(FoundationAlias.getFapp().getApplicationContext().getString(i7));
    }

    public static final void k(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        ToastHelper.showToast(FoundationAlias.getFapp(), str, 0, 17);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.utils.PlayerExtensionsKt$suspendRunCatching$1
            if (r0 == 0) goto L27
            r0 = r5
            com.bilibili.playerbizcommonv2.utils.PlayerExtensionsKt$suspendRunCatching$1 r0 = (com.bilibili.playerbizcommonv2.utils.PlayerExtensionsKt$suspendRunCatching$1) r0
            r7 = r0
            r0 = r7
            int r0 = r0.label
            r6 = r0
            r0 = r6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r7
            r1 = r6
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r7
            r5 = r0
            goto L30
        L27:
            com.bilibili.playerbizcommonv2.utils.PlayerExtensionsKt$suspendRunCatching$1 r0 = new com.bilibili.playerbizcommonv2.utils.PlayerExtensionsKt$suspendRunCatching$1
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
        L30:
            r0 = r5
            java.lang.Object r0 = r0.result
            r7 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r5
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L64
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L59
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L55
            r0 = r7
            r4 = r0
            goto L84
        L51:
            r4 = move-exception
            goto L8c
        L55:
            r4 = move-exception
            goto L9a
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L55
            r7 = r0
            r0 = r5
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L55
            r0 = r4
            r1 = r5
            java.lang.Object r0 = r0.invoke(r1)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L55
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            r1 = r8
            if (r0 != r1) goto L84
            r0 = r8
            return r0
        L84:
            r0 = r4
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L51 java.util.concurrent.CancellationException -> L55
            r4 = r0
            goto L98
        L8c:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r5 = r0
            r0 = r4
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            r4 = r0
        L98:
            r0 = r4
            return r0
        L9a:
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.utils.p.l(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @NotNull
    public static final String m(int i7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i7 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
    }

    @Nullable
    public static final Integer n(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e7) {
            return null;
        }
    }

    @NotNull
    public static final Drawable o(@ColorInt int i7, int i8) {
        float fDpToPx = DimenUtilsKt.dpToPx(i8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{fDpToPx, fDpToPx, fDpToPx, fDpToPx, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i7);
        return gradientDrawable;
    }
}

package com.bilibili.playerbizcommon.utils;

import Re.t;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.SimpleColorFilter;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import com.bilibili.app.authorspace.ui.I1;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/PlayerExtensionsKt.class */
public final class PlayerExtensionsKt {
    public static final boolean allNull(@NotNull Object... objArr) {
        return ArraysKt.filterNotNull(objArr).isEmpty();
    }

    public static final boolean anyNull(@NotNull Object... objArr) {
        return ArraysKt.filterNotNull(objArr).size() != objArr.length;
    }

    @NotNull
    public static final Uri appendOrReplaceQueryParameter(@NotNull Uri uri, @NotNull String str, @Nullable String str2) {
        Uri uriA;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str)) {
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str3 : queryParameterNames) {
                builderClearQuery.appendQueryParameter(str3, Intrinsics.areEqual(str3, str) ? str2 : uri.getQueryParameter(str3));
            }
            uriA = builderClearQuery.build();
        } else {
            uriA = t.a(uri, str, str2);
        }
        return uriA;
    }

    @NotNull
    public static final String appendOrReplaceQueryParameter(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String string = str;
        if (str3 != null) {
            string = str3.length() == 0 ? str : appendOrReplaceQueryParameter(Uri.parse(str), str2, str3).toString();
        }
        return string;
    }

    @NotNull
    public static final Drawable createFillBackgroundDrawable(@NotNull Context context, int i7, @ColorRes int i8) {
        int iA = (int) I1.a(context, 1, i7);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iA);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getResources().getColor(i8));
        return gradientDrawable;
    }

    @NotNull
    public static final Drawable createFillBorderDrawable(@NotNull Context context, int i7, @ColorRes int i8, int i9) {
        int iA = (int) I1.a(context, 1, i7);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iA);
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i9, context.getResources().getColor(i8));
        return gradientDrawable;
    }

    public static final void setGone(@NotNull View view) {
        view.setVisibility(8);
    }

    public static final void setInVisible(@NotNull View view) {
        view.setVisibility(4);
    }

    public static final void setLottieColorFilter(@NotNull LottieAnimationView lottieAnimationView, @ColorInt int i7) {
        lottieAnimationView.addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(new SimpleColorFilter(i7)));
    }

    public static /* synthetic */ void setLottieColorFilter$default(LottieAnimationView lottieAnimationView, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        setLottieColorFilter(lottieAnimationView, i7);
    }

    public static final void setVisible(@NotNull View view) {
        view.setVisibility(0);
    }

    @Nullable
    public static final Integer toIntColor(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e7) {
            return null;
        }
    }
}

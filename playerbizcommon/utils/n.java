package com.bilibili.playerbizcommon.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.lib.image2.BiliImageLoader;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/n.class */
public final class n {
    @JvmStatic
    @NotNull
    public static final Drawable a(@ColorInt int i7, @NotNull Drawable drawable) {
        Drawable drawableA = r.a(i7, drawable);
        DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
        return drawableA;
    }

    @JvmStatic
    @Nullable
    public static final Drawable b(@DrawableRes int i7, @NotNull Context context, @ColorRes int i8) {
        Drawable drawable;
        Resources resources = context.getResources();
        if (resources == null || (drawable = ResourcesCompat.getDrawable(resources, i7, null)) == null) {
            return null;
        }
        Drawable drawableA = r.a(ContextCompat.getColor(context, i8), drawable);
        DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
        return drawableA;
    }

    @Nullable
    public static Object c(@NotNull Context context, @NotNull String str, @NotNull SuspendLambda suspendLambda) {
        return BuildersKt.withContext(Dispatchers.getIO(), new VideoDetailHelper$parseSvgaItem$2(context, str, null), suspendLambda);
    }

    public static void d(@NotNull ComponentActivity componentActivity, @NotNull String str) {
        BiliImageLoader.INSTANCE.acquire(componentActivity, componentActivity.getLifecycle()).useOrigin().preload().url(str).fetchToDiskCache();
    }
}

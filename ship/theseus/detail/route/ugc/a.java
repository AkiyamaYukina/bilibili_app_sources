package com.bilibili.ship.theseus.detail.route.ugc;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/route/ugc/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f91070a = Pattern.compile("/video/av(\\d+)(?:.html)*", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f91071b = Pattern.compile("/av(\\d+)(?:.html)*", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f91072c = Pattern.compile("av(\\d+)", 2);

    @JvmStatic
    public static final boolean a(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return TextUtils.isDigitsOnly(str) ? true : f91072c.matcher(str).find();
    }
}

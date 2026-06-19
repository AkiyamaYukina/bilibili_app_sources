package com.bilibili.search2.utils;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.app.AppConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/C.class */
@StabilityInferred(parameters = 1)
public final class C {
    @JvmStatic
    @NotNull
    public static final String a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str == null || str.length() == 0) {
            return "";
        }
        Uri uri = Uri.parse(str);
        if (!AppConfig.isBiliDomain(uri)) {
            return str;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        try {
            String queryParameter = uri.getQueryParameter("from_spmid");
            if ((queryParameter == null || queryParameter.length() == 0) & (!(str2.length() == 0))) {
                builderBuildUpon.appendQueryParameter("from_spmid", str2);
            }
            String queryParameter2 = uri.getQueryParameter("from_module");
            boolean z6 = queryParameter2 == null || queryParameter2.length() == 0;
            boolean z7 = true;
            if (str3.length() == 0) {
                z7 = false;
            }
            String string = uri.toString();
            String str4 = (String) ConfigManager.Companion.config().get("following.url_from_source_reg", "(^(https?:)?//([w-]+.)?bilibili.com/blackboard/)|(bilibili://following/activity_landing/(\\d+))");
            boolean zFind = false;
            if (str4 != null) {
                try {
                    zFind = Pattern.compile(str4, 2).matcher(string).find();
                } catch (Exception e7) {
                    zFind = false;
                }
            }
            if (z6 & z7 & zFind) {
                builderBuildUpon.appendQueryParameter("from_module", str3);
            }
        } catch (Exception e8) {
        }
        return builderBuildUpon.build().toString();
    }
}

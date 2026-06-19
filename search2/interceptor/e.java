package com.bilibili.search2.interceptor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.lib.blconfig.ConfigManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/interceptor/e.class */
@StabilityInferred(parameters = 0)
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f86616b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86617a;

    static {
        String str = (String) ConfigManager.Companion.config().get("search.short_link_regex", "(?:https?://)?b23.tv/.+$");
        f86616b = str != null ? str : "(?:https?://)?b23.tv/.+$";
    }

    @Override // com.bilibili.search2.interceptor.d
    public final boolean b(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        String strGroup;
        Matcher matcher = Pattern.compile(f86616b, 2).matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            strGroup = matcher.group(0);
        } catch (Exception e7) {
            strGroup = null;
        }
        if (strGroup == null || !(!StringsKt.isBlank(strGroup))) {
            return false;
        }
        String strConcat = strGroup;
        if (!com.bilibili.adcommon.utils.ext.d.a("^https?://.*", strGroup)) {
            strConcat = "https://".concat(strGroup);
        }
        BuildersKt.launch$default(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ShortLinkInterceptor$getLongUrlAndJump$1(strConcat, this, fragmentActivity, null), 3, (Object) null);
        return true;
    }
}

package com.bilibili.search2.interceptor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/interceptor/a.class */
@StabilityInferred(parameters = 1)
public final class a implements d {
    @Override // com.bilibili.search2.interceptor.d
    public final boolean b(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        String strGroup;
        long j7;
        Pattern patternCompile = Pattern.compile("^(?:av)(\\d+)$", 2);
        if (str == null) {
            strGroup = null;
        } else {
            Matcher matcher = patternCompile.matcher(str);
            strGroup = !matcher.find() ? null : matcher.toMatchResult().group(1);
        }
        if (strGroup == null) {
            j7 = 0;
        } else {
            try {
                j7 = Long.parseLong(strGroup);
            } catch (NumberFormatException e7) {
                j7 = 0;
            }
        }
        if (j7 <= 0) {
            return false;
        }
        Os0.e eVar = Os0.e.f18030a;
        Os0.e.c(fragmentActivity, String.valueOf(j7));
        return true;
    }
}

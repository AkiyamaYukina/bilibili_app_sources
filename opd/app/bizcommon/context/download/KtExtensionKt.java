package com.bilibili.opd.app.bizcommon.context.download;

import androidx.compose.ui.text.font.C4496a;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/KtExtensionKt.class */
public final class KtExtensionKt {
    @NotNull
    public static final String formatCompleteImageUrl(@Nullable String str) {
        if (!isNotNullAndNotEmpty(str)) {
            str = "";
        } else if (str == null || !StringsKt.Z(str, "http")) {
            str = C4496a.a("https:", str);
        }
        return str;
    }

    public static final boolean isNotNullAndNotEmpty(@Nullable CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0);
    }
}

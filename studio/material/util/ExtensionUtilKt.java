package com.bilibili.studio.material.util;

import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/util/ExtensionUtilKt.class */
public final class ExtensionUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f108565a = CollectionsKt.listOf(new String[]{"-4", CaptureSchema.OLD_INVALID_ID_STRING, "-10086", "-10087", "0", "NA"});

    public static final boolean isMaterialIdValid(@Nullable String str) {
        return (str == null || str.length() == 0 || f108565a.contains(str)) ? false : true;
    }

    public static final boolean isNeedExtractMaterial(@Nullable String str, @Nullable String str2) {
        return ((str2 != null && str2.length() != 0 && m.b(str2)) || str == null || str.length() == 0 || f108565a.contains(str)) ? false : true;
    }

    @NotNull
    public static final String trimNAOfMaterialId(@NotNull String str) {
        String str2 = str;
        if (StringsKt.equals(str, "NA", true)) {
            str2 = "";
        }
        return str2;
    }
}

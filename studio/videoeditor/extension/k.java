package com.bilibili.studio.videoeditor.extension;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/k.class */
public final class k {
    public static final int a(@Nullable Long l7) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Integer.valueOf((int) l7.longValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        return num != null ? num.intValue() : 0;
    }

    public static final int b(@Nullable String str) {
        Integer intOrNull;
        return (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
    }
}

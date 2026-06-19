package com.bilibili.studio.videoeditor.extension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/extension/j.class */
public final class j {
    @NotNull
    public static final <T> List<T> a(@Nullable List<? extends T> list, @Nullable Function1<? super T, ? extends T> function1) {
        Object objEmptyList;
        Object obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                objEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                Object obj2 = next;
                if (function1 != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        obj = Result.constructor-impl(function1.invoke(next));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    obj2 = obj;
                    if (Result.isFailure-impl(obj)) {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else {
            objEmptyList = CollectionsKt.emptyList();
        }
        return (List<T>) objEmptyList;
    }

    @NotNull
    public static final String b(@Nullable List list) {
        Object obj;
        if (list == null) {
            return "";
        }
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(CollectionsKt.p(list, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str == null) {
            str = "";
        }
        return str;
    }
}

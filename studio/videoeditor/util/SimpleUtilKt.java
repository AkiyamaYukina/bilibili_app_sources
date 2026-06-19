package com.bilibili.studio.videoeditor.util;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/SimpleUtilKt.class */
public final class SimpleUtilKt {
    public static final boolean isActivityAlive(@Nullable Activity activity) {
        if (activity == null) {
            return false;
        }
        boolean z6 = false;
        if (!activity.isDestroyed()) {
            z6 = false;
            if (!activity.isFinishing()) {
                z6 = true;
            }
        }
        return z6;
    }

    @androidx.annotation.Nullable
    @Nullable
    public static final <T> T jsonObjToObj(@Nullable JSONObject jSONObject, @Nullable Class<T> cls) {
        Object object;
        if (jSONObject == null) {
            object = null;
        } else {
            try {
                object = JSON.parseObject(jSONObject.toJSONString(), cls);
            } catch (Exception e7) {
                BLog.d("SimpleUtil", e7);
                object = null;
            }
        }
        return (T) object;
    }

    @androidx.annotation.Nullable
    @Nullable
    public static final <T> T jsonStrToObj(@Nullable String str, @Nullable Class<T> cls) {
        Object object = null;
        if (str != null) {
            if (str.length() == 0) {
                object = null;
            } else {
                try {
                    object = JSON.parseObject(str, cls);
                } catch (Exception e7) {
                    BLog.d("SimpleUtil", e7);
                    object = null;
                }
            }
        }
        return (T) object;
    }

    @Nullable
    public static final JSONObject jsonToJSONObject(@Nullable String str) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(JSON.parseObject(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj2 = obj;
        if (Result.isFailure-impl(obj)) {
            obj2 = null;
        }
        return (JSONObject) obj2;
    }

    public static final <T> boolean listEquals(@Nullable List<? extends T> list, @Nullable List<? extends T> list2) {
        if (list != null && list2 == null) {
            return false;
        }
        if ((list2 != null && list == null) || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            T t7 = list.get(i7);
            T t8 = list.get(i7);
            boolean z6 = t7 instanceof List;
            if (z6 && (t8 instanceof List)) {
                if (!listEquals((List) t7, (List) t8)) {
                    return false;
                }
            } else {
                if (z6 && !(t8 instanceof List)) {
                    return false;
                }
                if ((!z6 && (t8 instanceof List)) || t7 == null || !t7.equals(t8)) {
                    return false;
                }
            }
        }
        return true;
    }

    @NonNull
    @NotNull
    public static final String objToJSONStr(@Nullable Object obj) {
        String jSONString;
        if (obj == null) {
            return "";
        }
        try {
            jSONString = JSON.toJSONString(obj);
        } catch (Exception e7) {
            BLog.d("SimpleUtil", e7);
            jSONString = "";
        }
        return jSONString;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x003b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final <T> void safeForEach(@org.jetbrains.annotations.Nullable java.util.List<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r5) {
        /*
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L3a
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            goto L3a
        L18:
            r0 = r4
            int r0 = r0.size()
            r7 = r0
            r0 = 0
            r6 = r0
        L21:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r5
            r1 = r4
            r2 = r6
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L3b
            java.lang.Object r0 = r0.invoke(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L3b
        L34:
            int r6 = r6 + 1
            goto L21
        L3a:
            return
        L3b:
            r8 = move-exception
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.SimpleUtilKt.safeForEach(java.util.List, kotlin.jvm.functions.Function1):void");
    }
}

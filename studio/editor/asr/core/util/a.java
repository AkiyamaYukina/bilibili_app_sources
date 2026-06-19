package com.bilibili.studio.editor.asr.core.util;

import android.os.Looper;
import com.alibaba.fastjson.JSONException;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.studio.editor.asr.core.bean.AsrRequestParam;
import com.bilibili.studio.editor.asr.core.config.AsrStep;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import com.bilibili.studio.editor.asr.core.exception.AsrCancelException;
import com.bilibili.studio.editor.asr.core.exception.AsrIOException;
import com.bilibili.studio.editor.asr.core.exception.AsrIllegalStateException;
import com.bilibili.studio.editor.asr.core.exception.AsrInterruptException;
import com.bilibili.studio.editor.asr.core.exception.AsrJsonException;
import com.bilibili.studio.editor.asr.core.exception.AsrNoNetException;
import com.bilibili.studio.editor.asr.core.exception.AsrOtherException;
import com.bilibili.studio.editor.asr.core.exception.AsrParamInvalidateException;
import java.io.File;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/util/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f105568a = new Object();

    public static long a(@Nullable String str) {
        Object obj;
        long jLongValue = 0;
        if (str != null) {
            if (str.length() == 0) {
                jLongValue = 0;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    File file = new File(str);
                    obj = Result.constructor-impl(Long.valueOf(file.exists() ? file.length() : 0L));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                Object obj2 = obj;
                if (Result.isFailure-impl(obj)) {
                    obj2 = null;
                }
                Long l7 = (Long) obj2;
                jLongValue = 0;
                if (l7 != null) {
                    jLongValue = l7.longValue();
                }
            }
        }
        return jLongValue;
    }

    @Nullable
    public static AsrBaseException b(@NotNull Dw0.a aVar, @NotNull AsrRequestParam asrRequestParam) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            return new AsrInterruptException(AsrStep.INIT_TASK, "can not run on main thread");
        }
        aVar.getClass();
        if (asrRequestParam.getFilePath().length() == 0) {
            return new AsrParamInvalidateException(AsrStep.INIT_TASK, "filePath is isEmpty");
        }
        if (asrRequestParam.getCaptionType().length() == 0) {
            return new AsrParamInvalidateException(AsrStep.INIT_TASK, "captionType is isEmpty");
        }
        return null;
    }

    public static void c(Call call, AsrStep asrStep, Function0 function0) {
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                function0.invoke();
                                if (call != null) {
                                    call.cancel();
                                }
                            } catch (JSONException e7) {
                                throw new AsrJsonException(asrStep, asrStep.getMsg() + "  " + e7.getMessage());
                            }
                        } catch (Exception e8) {
                            throw new AsrOtherException(asrStep, asrStep.getMsg() + "  " + e8.getMessage());
                        }
                    } catch (IOException e9) {
                        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                            throw new AsrNoNetException(asrStep, asrStep.getMsg() + "  " + e9.getMessage());
                        }
                        if (call == null || !call.isCanceled()) {
                            throw new AsrIOException(asrStep, asrStep.getMsg() + "  " + e9.getMessage());
                        }
                        throw new AsrCancelException(asrStep, asrStep.getMsg() + "  " + e9.getMessage());
                    }
                } catch (IllegalStateException e10) {
                    throw new AsrIllegalStateException(asrStep, asrStep.getMsg() + "  " + e10.getMessage());
                }
            } catch (org.json.JSONException e11) {
                throw new AsrJsonException(asrStep, asrStep.getMsg() + "  " + e11.getMessage());
            }
        } catch (Throwable th) {
            if (call != null) {
                call.cancel();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0130 -> B:34:0x0136). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2 r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.core.util.a.d(int, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

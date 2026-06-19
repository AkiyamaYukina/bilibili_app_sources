package com.bilibili.tflite;

import android.app.Application;
import androidx.appcompat.widget.C3246j;
import androidx.compose.runtime.I0;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import java.io.File;
import kntr.base.utils.foundation.CpuUtils;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/a.class */
public final class a {

    /* JADX INFO: renamed from: com.bilibili.tflite.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/a$a.class */
    public static final /* synthetic */ class C1216a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f110823a;

        static {
            int[] iArr = new int[CpuUtils.ARCH.values().length];
            try {
                iArr[CpuUtils.ARCH.X86.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f110823a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tflite/a$b.class */
    public static final class b implements ModResourceClient.OnUpdateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f110824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f110825b;

        public b(String str, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f110824a = str;
            this.f110825b = cancellableContinuationImpl;
        }

        public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
            BLog.e("ModManagerHelper", String.valueOf(modErrorInfo));
            com.bilibili.ogv.infra.coroutine.a.b(new IllegalStateException("tfmod is null"), this.f110825b);
        }

        public final void onSuccess(ModResource modResource) {
            File fileA = a.a(this.f110824a);
            CancellableContinuationImpl cancellableContinuationImpl = this.f110825b;
            if (fileA != null) {
                com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, fileA);
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("tfmod is null");
            BLog.e("ModManagerHelper", illegalStateException.toString());
            com.bilibili.ogv.infra.coroutine.a.b(illegalStateException, cancellableContinuationImpl);
        }
    }

    public static final File a(String str) {
        File fileRetrieveFile;
        try {
            ModResource modResource = ModResourceClient.getInstance().get(Aj0.a.f317a, "mall", str);
            fileRetrieveFile = null;
            if (modResource.isAvailable()) {
                fileRetrieveFile = modResource.retrieveFile("libtensorflowlite_jni.so");
            }
        } catch (Exception e7) {
            fileRetrieveFile = null;
        }
        return fileRetrieveFile;
    }

    @Nullable
    public static Object b(@NotNull Continuation continuation) {
        String str;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        String fawkesAppKey = Foundation.Companion.instance().getApps().getFawkesAppKey();
        C3246j.b("AppKey:", fawkesAppKey, "ModManagerHelper");
        Application application = Aj0.a.f317a;
        if (C1216a.f110823a[CpuUtils.getMyCpuArch2(application).ordinal()] == 1) {
            BLog.d("ModManagerHelper", "use x86 tfso-js");
            str = "android-tflite-x86-2.9";
        } else {
            int iHashCode = fawkesAppKey.hashCode();
            if (iHashCode != -861391249) {
                if (iHashCode != 1131699565) {
                    if (iHashCode == 1131700882 && fawkesAppKey.equals("android_b")) {
                        BLog.d("ModManagerHelper", "use blue ARM32 tfso-js");
                        str = "android-tflite-armeabi-v7a-2.9";
                    }
                } else if (fawkesAppKey.equals("android64")) {
                    BLog.d("ModManagerHelper", "use ARM64 tfso");
                    str = "android-tflite-arm64-v8a-2.9";
                }
                BLog.d("ModManagerHelper", "match nothing close");
                str = null;
            } else {
                if (fawkesAppKey.equals(Constant.SDK_OS)) {
                    BLog.d("ModManagerHelper", "use ARM32 tfso-js");
                    str = "android-tflite-armeabi-v7a-2.9";
                }
                BLog.d("ModManagerHelper", "match nothing close");
                str = null;
            }
        }
        if (str == null) {
            com.bilibili.ogv.infra.coroutine.a.b(new IllegalStateException("tfmod is null"), cancellableContinuationImpl);
        } else {
            File fileA = a(str);
            if (fileA == null || !fileA.exists()) {
                ModResourceClient.getInstance().update(application, I0.a("mall", str, true), new b(str, cancellableContinuationImpl));
            } else {
                com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, fileA);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}

package com.bilibili.studio.centerplus.model;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.okdownloader.DownloadListener;
import com.bilibili.live.LiveStreamModResourceOutService;
import com.bilibili.studio.centerplus.util.blink.BlinkEffectManager;
import java.io.File;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/a.class */
public final class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f105139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LiveStreamModResourceOutService f105141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f105142d;

    public a(CancellableContinuationImpl cancellableContinuationImpl, String str, LiveStreamModResourceOutService liveStreamModResourceOutService, String str2) {
        this.f105139a = cancellableContinuationImpl;
        this.f105140b = str;
        this.f105141c = liveStreamModResourceOutService;
        this.f105142d = str2;
    }

    public final void onCancel(String str) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f105139a;
        super.onCancel(str);
        BLog.w("CenterPlusRepository", "byte beauty res onCancel");
        try {
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
            }
        } catch (Throwable th) {
            com.bilibili.adcommon.utils.e.a("byte beauty res onCancel resume error: ", "CenterPlusRepository", th);
        }
    }

    public final void onError(String str, List<Integer> list, long j7, long j8) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f105139a;
        super.onError(str, list, j7, j8);
        BLog.w("CenterPlusRepository", "byte beauty res onError, errorCodes: " + (list != null ? list.get(0) : null) + "， resMd5: " + this.f105140b);
        try {
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
            }
        } catch (Throwable th) {
            com.bilibili.adcommon.utils.e.a("byte beauty res onError resume error: ", "CenterPlusRepository", th);
        }
    }

    public final void onFinish(String str, String str2, String str3) {
        boolean zIsByteEffect;
        super.onFinish(str, str2, str3);
        CancellableContinuationImpl cancellableContinuationImpl = this.f105139a;
        if (str3 == null) {
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
                return;
            }
            return;
        }
        File file = new File(str2, str3);
        String blinkBeautyResFilePath = this.f105141c.getBlinkBeautyResFilePath(this.f105140b);
        if (blinkBeautyResFilePath != null) {
            String str4 = this.f105142d;
            try {
                com.bilibili.studio.centerplus.util.c.c(file, blinkBeautyResFilePath);
                LiveStreamModResourceOutService liveStreamModResourceOutService = (LiveStreamModResourceOutService) BLRouter.get$default(BLRouter.INSTANCE, LiveStreamModResourceOutService.class, (String) null, 2, (Object) null);
                if (liveStreamModResourceOutService == null) {
                    BLog.w("CenterPlusRepository", "isByteEffect: LiveStreamModResourceOutService unavailable, fallback=true");
                    zIsByteEffect = true;
                } else {
                    zIsByteEffect = liveStreamModResourceOutService.isByteEffect();
                }
                if (!zIsByteEffect) {
                    BlinkEffectManager.Companion.instance().setBmmBeautyResPath(blinkBeautyResFilePath);
                }
                if (cancellableContinuationImpl.isActive()) {
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.TRUE));
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}

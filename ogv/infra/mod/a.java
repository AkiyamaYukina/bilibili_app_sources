package com.bilibili.ogv.infra.mod;

import androidx.fragment.app.z;
import androidx.room.B;
import cf.p;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/mod/a.class */
public final class a implements ModResourceClient.OnUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f67932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67934c;

    public a(String str, String str2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f67932a = cancellableContinuationImpl;
        this.f67933b = str;
        this.f67934c = str2;
    }

    public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
        super/*com.bilibili.lib.mod.ModResourceClient.OnUpdateObserver*/.onFail(modUpdateRequest, modErrorInfo);
        CancellableContinuationImpl cancellableContinuationImpl = this.f67932a;
        if (cancellableContinuationImpl.isActive()) {
            Integer numValueOf = modErrorInfo != null ? Integer.valueOf(modErrorInfo.getErrorCode()) : null;
            String modVersion = modErrorInfo != null ? modErrorInfo.getModVersion() : null;
            StringBuilder sb = new StringBuilder();
            p.a(numValueOf, this.f67934c, " download failed, errorCode ", ", modVersion ", sb);
            sb.append(modVersion);
            String string = sb.toString();
            e.a("[ogv-glue-ModKt$awaitModResource$3$1-onFail] ", string, "ModKt$awaitModResource$3$1-onFail", (Throwable) null);
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new RuntimeException(string))))));
        }
    }

    public final void onSuccess(ModResource modResource) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f67932a;
        if (cancellableContinuationImpl.isActive()) {
            boolean zIsAvailable = modResource.isAvailable();
            String str = this.f67933b;
            if (zIsAvailable && !b.b(modResource, str)) {
                BLog.i("ModKt$awaitModResource$3$1-onSuccess", "[ogv-glue-ModKt$awaitModResource$3$1-onSuccess] " + z.a("update modeRes success, name = ", modResource.getModName(), ", version = ", modResource.getModVersion()));
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(modResource))));
                return;
            }
            String modVersion = modResource.getModVersion();
            StringBuilder sb = new StringBuilder();
            B.a(this.f67934c, " load failed. Needed ", str, ", got ", sb);
            sb.append(modVersion);
            e.a("[ogv-glue-ModKt$awaitModResource$3$1-onSuccess] ", sb.toString(), "ModKt$awaitModResource$3$1-onSuccess", (Throwable) null);
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new RuntimeException("Mod resource load failed!"))))));
        }
    }
}

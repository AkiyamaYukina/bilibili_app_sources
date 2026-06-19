package com.bilibili.studio.centerplus.model;

import cf.p;
import com.bilibili.lib.mod.ModErrorInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.mod.request.ModUpdateRequest;
import com.bilibili.studio.centerplus.statistics.BlinkEffectReport;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/c.class */
public final class c implements ModResourceClient.OnUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<com.bilibili.studio.centerplus.util.e> f105151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModLoadFrom f105152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SafeContinuation f105153e;

    public c(String str, String str2, Ref.ObjectRef objectRef, ModLoadFrom modLoadFrom, SafeContinuation safeContinuation) {
        this.f105149a = str;
        this.f105150b = str2;
        this.f105151c = objectRef;
        this.f105152d = modLoadFrom;
        this.f105153e = safeContinuation;
    }

    public final void onFail(ModUpdateRequest modUpdateRequest, ModErrorInfo modErrorInfo) {
        AtomicBoolean atomicBoolean;
        Integer numValueOf = modErrorInfo != null ? Integer.valueOf(modErrorInfo.getErrorCode()) : null;
        String modVersion = modErrorInfo != null ? modErrorInfo.getModVersion() : null;
        StringBuilder sb = new StringBuilder("loadModResource...onFail...poolName = ");
        sb.append(this.f105149a);
        sb.append(", modName = ");
        String str = this.f105150b;
        p.a(numValueOf, str, ", errorCode = ", ", errorModVersion = ", sb);
        sb.append(modVersion);
        BLog.ifmt("CenterPlusRepository", sb.toString(), new Object[0]);
        Ref.ObjectRef<com.bilibili.studio.centerplus.util.e> objectRef = this.f105151c;
        Object obj = objectRef.element;
        if (obj == null || ((atomicBoolean = ((com.bilibili.studio.centerplus.util.e) obj).f105293e) != null && atomicBoolean.compareAndSet(true, false))) {
            if (this.f105152d == ModLoadFrom.LIVE) {
                BlinkEffectReport.Companion.instance().reportDownloadModResult(str, 0, null, 1);
            }
            Result.Companion companion = Result.Companion;
            this.f105153e.resumeWith(Result.constructor-impl(Boolean.FALSE));
            com.bilibili.studio.centerplus.util.e eVar = (com.bilibili.studio.centerplus.util.e) objectRef.element;
            if (eVar != null) {
                BLog.ifmt("CenterPlusRepository", "release", new Object[0]);
                eVar.a();
            }
            objectRef.element = null;
        }
    }

    public final void onSuccess(ModResource modResource) {
        AtomicBoolean atomicBoolean;
        StringBuilder sb = new StringBuilder("loadModResource...onSuccess...poolName = ");
        sb.append(this.f105149a);
        sb.append(", modName = ");
        String str = this.f105150b;
        sb.append(str);
        sb.append(", mod = ");
        sb.append(modResource);
        BLog.ifmt("CenterPlusRepository", sb.toString(), new Object[0]);
        Ref.ObjectRef<com.bilibili.studio.centerplus.util.e> objectRef = this.f105151c;
        Object obj = objectRef.element;
        if (obj == null || ((atomicBoolean = ((com.bilibili.studio.centerplus.util.e) obj).f105293e) != null && atomicBoolean.compareAndSet(true, false))) {
            if (this.f105152d == ModLoadFrom.LIVE) {
                BlinkEffectReport.Companion.instance().reportDownloadModResult(str, 1, Float.valueOf(1.0f), 1);
            }
            Result.Companion companion = Result.Companion;
            this.f105153e.resumeWith(Result.constructor-impl(Boolean.TRUE));
            com.bilibili.studio.centerplus.util.e eVar = (com.bilibili.studio.centerplus.util.e) objectRef.element;
            if (eVar != null) {
                BLog.ifmt("CenterPlusRepository", "release", new Object[0]);
                eVar.a();
            }
            objectRef.element = null;
        }
    }
}

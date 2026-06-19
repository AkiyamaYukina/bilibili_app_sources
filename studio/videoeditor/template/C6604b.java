package com.bilibili.studio.videoeditor.template;

import com.bilibili.base.MainThread;
import com.bilibili.studio.module.tuwen.ITuwenPluginService;
import com.bilibili.tribe.extra.BundleCallback;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.template.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/b.class */
public final class C6604b implements BundleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f110047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6603a f110048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hD0.e f110049c;

    public C6604b(g0 g0Var, C6603a c6603a, hD0.e eVar) {
        this.f110047a = g0Var;
        this.f110048b = c6603a;
        this.f110049c = eVar;
    }

    @Override // com.bilibili.tribe.extra.BundleCallback
    public final void onError(Throwable th) {
        BLog.e("BiliTemplateEngineControllerImpl", "installTemplateTribe onError " + th.getStackTrace());
        this.f110047a.a();
    }

    @Override // com.bilibili.tribe.extra.BundleCallback
    public final void onProgress(long j7, long j8, int i7, long j9) {
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "installTemplateTribe onProgress totalBytes=", ", downloadedBytes=");
        androidx.media3.common.G.a(i7, j8, ", progress=", sbA);
        BLog.ifmt("BiliTemplateEngineControllerImpl", Ld.c.a(sbA, j9, ", bytesPerSecond="), new Object[0]);
        g0 g0Var = this.f110047a;
        if (g0Var.f110090e) {
            BiliTemplateEngineManager biliTemplateEngineManager = g0Var.f110086a;
            biliTemplateEngineManager.getClass();
            MainThread.runOnMainThread(new C6608f(biliTemplateEngineManager, ((int) (i7 * 0.1f)) + 10));
        }
    }

    @Override // com.bilibili.tribe.extra.BundleCallback
    public final void onSuccess() {
        BLog.w("BiliTemplateEngineControllerImpl", "installTemplateTribe onSuccess");
        ITuwenPluginService iTuwenPluginServiceW = this.f110048b.w();
        g0 g0Var = this.f110047a;
        if (iTuwenPluginServiceW != null) {
            g0Var.b();
        } else {
            BLog.wfmt("BiliTemplateEngineControllerImpl", "installTemplateTribe success but service missing target=".concat(this.f110049c.a()), new Object[0]);
            g0Var.a();
        }
    }
}

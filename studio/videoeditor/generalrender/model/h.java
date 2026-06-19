package com.bilibili.studio.videoeditor.generalrender.model;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.annual.api.CodecInfo;
import kotlinx.coroutines.CancellableContinuationImpl;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/h.class */
public final class h extends BiliApiDataCallback<CodecInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f109606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f109608d;

    public h(CancellableContinuationImpl cancellableContinuationImpl, String str, f fVar) {
        this.f109606b = cancellableContinuationImpl;
        this.f109607c = str;
        this.f109608d = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDataSuccess(com.bilibili.studio.videoeditor.annual.api.CodecInfo r5) {
        /*
            r4 = this;
            r0 = r5
            com.bilibili.studio.videoeditor.annual.api.CodecInfo r0 = (com.bilibili.studio.videoeditor.annual.api.CodecInfo) r0
            r9 = r0
            r0 = 0
            r8 = r0
            r0 = r9
            if (r0 == 0) goto L17
            r0 = r9
            java.lang.String r0 = r0.profile
            r5 = r0
            goto L19
        L17:
            r0 = 0
            r5 = r0
        L19:
            r0 = r5
            java.lang.String r1 = "ugcnx/android"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L57
            java.lang.String r0 = com.bilibili.studio.videoeditor.generalrender.model.f.f109601c
            r5 = r0
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion
            com.bilibili.lib.blconfig.Contract r0 = r0.config()
            java.lang.String r1 = "annual_report.gop_models"
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.get(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L4f
            r0 = r5
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)
            r7 = r0
            r0 = 1
            r6 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L4f
            goto L51
        L4f:
            r0 = 0
            r6 = r0
        L51:
            r0 = r9
            r1 = r6
            r0.fixGop = r1
        L57:
            r0 = r4
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.f109606b
            r1 = r9
            yC0.a.a(r0, r1)
            r0 = r9
            if (r0 == 0) goto L6d
            r0 = r4
            java.lang.String r0 = r0.f109607c
            r5 = r0
            goto L6f
        L6d:
            r0 = 0
            r5 = r0
        L6f:
            r0 = r5
            if (r0 == 0) goto L83
            r0 = r4
            com.bilibili.studio.videoeditor.generalrender.model.f r0 = r0.f109608d
            java.util.Map<java.lang.String, com.bilibili.studio.videoeditor.annual.api.CodecInfo> r0 = r0.f109603a
            r1 = r5
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
        L83:
            r0 = r8
            r5 = r0
            r0 = r9
            if (r0 == 0) goto L91
            r0 = r9
            java.lang.String r0 = r0.toString()
            r5 = r0
        L91:
            java.lang.String r0 = "Req codec info success: "
            r1 = r5
            java.lang.String r2 = "GRResourceManager"
            q4.M.b(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.model.h.onDataSuccess(java.lang.Object):void");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String message = null;
        yC0.a.a(this.f109606b, (Object) null);
        if (th != null) {
            message = th.getMessage();
        }
        M.b("Req codec info error: ", message, "GRResourceManager");
    }
}

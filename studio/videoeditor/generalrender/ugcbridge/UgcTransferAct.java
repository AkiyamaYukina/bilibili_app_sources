package com.bilibili.studio.videoeditor.generalrender.ugcbridge;

import Xz0.j;
import android.content.Context;
import android.content.Intent;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/ugcbridge/UgcTransferAct.class */
public final class UgcTransferAct extends BaseAppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 == r1) goto Ld
            r0 = r6
            r1 = 1
            r0.setRequestedOrientation(r1)
        Ld:
            r0 = r6
            r1 = 0
            r2 = 0
            r0.overridePendingTransition(r1, r2)
            r0 = r6
            r1 = r7
            super.onCreate(r1)
            kotlin.Lazy<com.bilibili.studio.videoeditor.generalrender.ugcbridge.a> r0 = com.bilibili.studio.videoeditor.generalrender.ugcbridge.a.f109659g
            r7 = r0
            com.bilibili.studio.videoeditor.generalrender.ugcbridge.a r0 = com.bilibili.studio.videoeditor.generalrender.ugcbridge.a.b.a()
            r8 = r0
            r0 = r6
            android.content.Intent r0 = r0.getIntent()
            r7 = r0
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "handleAction...data = "
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = ", activity = "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "UGCTemplateRenderManager"
            r1 = r8
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            tv.danmaku.android.log.BLog.ifmt(r0, r1, r2)
            java.lang.String r0 = "template_page_from"
            java.lang.String r1 = "一键投稿"
            Xz0.j.c(r0, r1)
            r0 = r7
            if (r0 == 0) goto L75
            r0 = r7
            android.os.Bundle r0 = r0.getExtras()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L75
            r0 = r7
            java.lang.String r1 = "bili_param_control"
            android.os.Bundle r0 = r0.getBundle(r1)
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L7d
        L75:
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r7 = r0
        L7d:
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = new com.bilibili.lib.blrouter.RouteRequest$Builder
            r1 = r0
            java.lang.String r2 = "activity://uper/material/choose"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.<init>(r2)
            QJ.a r1 = new QJ.a
            r2 = r1
            r3 = r7
            r4 = 2
            r2.<init>(r3, r4)
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = r0.extras(r1)
            r1 = 19999(0x4e1f, float:2.8025E-41)
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = r0.requestCode(r1)
            com.bilibili.lib.blrouter.RouteRequest r0 = r0.build()
            r1 = r6
            com.bilibili.lib.blrouter.RouteResponse r0 = com.bilibili.lib.blrouter.BLRouter.routeTo(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.generalrender.ugcbridge.UgcTransferAct.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j.d("template_page_from");
    }
}

package com.bilibili.socialize.share.core.ui;

import Ev0.c;
import Iv0.b;
import Ov0.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/LineAssistActivity.class */
public class LineAssistActivity extends a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f105040D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Ev0.c] */
    @Override // Ov0.a
    public final c T6(SocializeMedia socializeMedia, BiliShareConfiguration biliShareConfiguration) {
        return socializeMedia == SocializeMedia.LINE ? new Ev0.a(this, biliShareConfiguration) : null;
    }

    @Override // Ov0.a
    public final String V6() {
        return "BShare.line.assist";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        c cVar = this.f18105A;
        if (cVar != null) {
            ((b) cVar).h(this, i7, i8, intent, this);
        }
    }

    @Override // Ov0.a, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f105040D = true;
        }
    }

    @Override // Ov0.a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        S6();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean z6 = this.f105040D;
        boolean z7 = this.f18106B;
        if (z6) {
            this.f105040D = false;
        } else {
            if (z7) {
                return;
            }
            Log.e("BShare.line.assist", "gonna finish share with incorrect callback (cancel)");
            P6();
        }
    }
}

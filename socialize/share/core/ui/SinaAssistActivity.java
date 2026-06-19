package com.bilibili.socialize.share.core.ui;

import Ev0.c;
import Pv0.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import c6.Q;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;
import com.sina.weibo.sdk.openapi.IWBAPI;
import java.util.Locale;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/SinaAssistActivity.class */
public class SinaAssistActivity extends Ov0.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f105041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f105042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Handler f105043F = new Handler();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final a f105044G = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/SinaAssistActivity$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SinaAssistActivity f105045a;

        public a(SinaAssistActivity sinaAssistActivity) {
            this.f105045a = sinaAssistActivity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.b("BShare.sina.assist", "finish share with pending task (cancel)", null);
            this.f105045a.P6();
        }
    }

    @Override // Ov0.a, Dv0.c
    public final void T0(SocializeMedia socializeMedia) {
        super.T0(socializeMedia);
        S6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Ev0.c] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [Kv0.a] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // Ov0.a
    @Nullable
    public final c T6(@Nullable SocializeMedia socializeMedia, @Nullable BiliShareConfiguration biliShareConfiguration) {
        boolean z6 = false;
        ?? r8 = z6;
        if (biliShareConfiguration != null) {
            r8 = z6;
            if (socializeMedia == SocializeMedia.SINA) {
                ?? aVar = new Ev0.a(this, biliShareConfiguration);
                aVar.f13009g = this;
                r8 = aVar;
            }
        }
        return r8;
    }

    @Override // Ov0.a
    public final String V6() {
        return "BShare.sina.assist";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // Ov0.a, Dv0.c
    public final void e4(@Nullable SocializeMedia socializeMedia, int i7, Throwable th) {
        super.e4(socializeMedia, i7, th);
        S6();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        this.f105041D = i8 == 0;
        b.c("BShare.sina.assist", String.format(Locale.getDefault(), "activity onResult: resultCode(%d), canceled(%s)", Integer.valueOf(i8), Boolean.valueOf(this.f105041D)));
        c cVar = this.f18105A;
        if (cVar != null) {
            ((Kv0.a) cVar).h(this, i7, i8, intent, this);
        }
    }

    @Override // Ov0.a, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f18107C = true;
        }
    }

    @Override // Ov0.a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f105043F.removeCallbacks(null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f105042E = true;
        b.c("BShare.sina.assist", "activity onNewIntent");
        c cVar = this.f18105A;
        if (cVar != null) {
            ((Kv0.a) cVar).f(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f105043F.removeCallbacks(this.f105044G);
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        c cVar;
        IWBAPI iwbapi;
        super.onResume();
        boolean z6 = this.f105042E;
        boolean z7 = this.f105041D;
        boolean zIsFinishing = isFinishing();
        StringBuilder sbA = Q.a("activity onResume: OnNewIntentCalled(", "), OnActivityResult(", "), isFinishing(", z6, z7);
        sbA.append(zIsFinishing);
        sbA.append(")");
        b.c("BShare.sina.assist", sbA.toString());
        if (this.f105042E || this.f18106B || isFinishing() || (cVar = this.f18105A) == null) {
            return;
        }
        Kv0.a aVar = (Kv0.a) cVar;
        if (aVar.f4782a != null && (iwbapi = aVar.f13008f) != null && iwbapi.isWBAppInstalled() && this.f105041D) {
            b.b("BShare.sina.assist", "gonna finish share with incorrect callback (cancel)", null);
            P6();
            return;
        }
        boolean z8 = this.f18107C;
        Handler handler = this.f105043F;
        if (!z8) {
            b.a("BShare.sina.assist", "post pending finish task delay 5000");
            handler.postDelayed(this.f105044G, 5000L);
        } else {
            this.f18107C = false;
            b.a("BShare.sina.assist", "post pending finish task delay 1500");
            handler.postDelayed(this.f105044G, 1500L);
        }
    }

    @Override // Ov0.a, Dv0.c
    public final void x4(SocializeMedia socializeMedia) {
        super.x4(socializeMedia);
        S6();
    }
}

package com.bilibili.socialize.share.core.ui;

import Ev0.c;
import Pv0.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/WxAssistActivity.class */
public class WxAssistActivity extends Ov0.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f105046F = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f105047D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final a f105048E = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/WxAssistActivity$a.class */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WxAssistActivity f105049a;

        public a(WxAssistActivity wxAssistActivity) {
            this.f105049a = wxAssistActivity;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra("status_code", -1);
            String stringExtra = intent.getStringExtra("status_msg");
            if (intExtra == 200) {
                b.c("BShare.wx.assist", "get result from broadcast: success");
                this.f105049a.R6();
            } else if (intExtra == 202) {
                b.c("BShare.wx.assist", "get result from broadcast: failed");
                this.f105049a.Q6(stringExtra);
            } else if (intExtra == 201) {
                b.c("BShare.wx.assist", "get result from broadcast: cancel");
                this.f105049a.P6();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Ev0.c] */
    @Override // Ov0.a
    @Nullable
    public final c T6(@Nullable SocializeMedia socializeMedia, @Nullable BiliShareConfiguration biliShareConfiguration) {
        Ev0.a aVar = null;
        if (biliShareConfiguration != null) {
            if (socializeMedia == SocializeMedia.WEIXIN) {
                b.c("BShare.wx.assist", "create wx chat share handler");
                aVar = new Ev0.a(this, biliShareConfiguration);
            } else if (socializeMedia == SocializeMedia.WEIXIN_MONMENT) {
                b.c("BShare.wx.assist", "create wx moment share handler");
                aVar = new Ev0.a(this, biliShareConfiguration);
            }
        }
        return aVar;
    }

    @Override // Ov0.a
    public final String V6() {
        return "BShare.wx.assist";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // Ov0.a, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            ContextCompat.registerReceiver(this, this.f105048E, new IntentFilter("com.bilibili.share.wechat.result"), 4);
            b.c("BShare.wx.assist", "broadcast has register");
        } catch (IllegalArgumentException e7) {
            b.b("BShare.wx.assist", "register receiver error", e7);
        }
        if (bundle == null) {
            this.f18107C = true;
        }
    }

    @Override // Ov0.a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        Handler handler;
        super.onDestroy();
        S6();
        if (EntryPointKt.getMemleakOptEnable() && (handler = this.f105047D) != null) {
            handler.removeCallbacksAndMessages(null);
            this.f105047D = null;
        }
        try {
            unregisterReceiver(this.f105048E);
            b.c("BShare.wx.assist", "broadcast has unregister");
        } catch (IllegalArgumentException e7) {
            b.b("BShare.wx.assist", "unregister receiver error", e7);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        b.c("BShare.wx.assist", O4.b.b("act resume: isFirst(", "),hasGetResult(", ")", this.f18107C, this.f18106B));
        if (this.f18107C) {
            this.f18107C = false;
            return;
        }
        if (this.f18106B) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (this.f105047D == null) {
                this.f105047D = new Handler(getMainLooper());
            }
            this.f105047D.postDelayed(new Ov0.c(this, 0), 200L);
        } else {
            b.b("BShare.wx.assist", "gonna finish share with incorrect callback (cancel)", null);
            setResult(0, BiliShareDelegateActivity.s6(-1, null));
            finish();
        }
    }
}

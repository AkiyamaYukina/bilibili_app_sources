package com.bilibili.socialize.share.core.ui;

import Ev0.c;
import Jv0.b;
import Ov0.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/QQAssistActivity.class */
public class QQAssistActivity extends a {
    @Override // Ov0.a
    @Nullable
    public final c T6(@Nullable SocializeMedia socializeMedia, @Nullable BiliShareConfiguration biliShareConfiguration) {
        b bVar = null;
        if (biliShareConfiguration != null) {
            if (socializeMedia == SocializeMedia.QQ) {
                Pv0.b.c("BShare.qq.assist", "create qq chat share handler");
                bVar = new b(this, biliShareConfiguration);
            } else if (socializeMedia == SocializeMedia.QZONE) {
                Pv0.b.c("BShare.qq.assist", "create qq zone share handler");
                bVar = new b(this, biliShareConfiguration);
            }
        }
        return bVar;
    }

    @Override // Ov0.a
    public final String V6() {
        return "BShare.qq.assist";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Pv0.b.c("BShare.qq.assist", "activity onResult, requestCode = " + i7 + ", resultCode = " + i8);
        c cVar = this.f18105A;
        if (cVar != null) {
            ((b) cVar).h(this, i7, i8, intent, this);
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
        S6();
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        Pv0.b.c("BShare.qq.assist", O4.b.b("act resume: isFirst(", "),hasGetResult(", ")", this.f18107C, this.f18106B));
        if (this.f18107C) {
            this.f18107C = false;
        } else {
            if (this.f18106B) {
                return;
            }
            Pv0.b.b("BShare.qq.assist", "gonna finish share with incorrect callback (cancel)", null);
            setResult(0, BiliShareDelegateActivity.s6(-1, null));
            finish();
        }
    }
}

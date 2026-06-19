package com.bilibili.socialize.share.core.ui;

import Ev0.c;
import Fv0.d;
import Ov0.a;
import Pv0.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.socialize.share.core.BiliShareConfiguration;
import com.bilibili.socialize.share.core.SocializeMedia;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/ui/MessengerAssistActivity.class */
public final class MessengerAssistActivity extends a {
    @Override // Ov0.a
    public final c T6(SocializeMedia socializeMedia, BiliShareConfiguration biliShareConfiguration) {
        return socializeMedia == SocializeMedia.MESSENGER ? new d(this, biliShareConfiguration) : null;
    }

    @Override // Ov0.a
    @NotNull
    public final String V6() {
        return "BShare.messenger.assist";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        b.a("BShare.messenger.assist", "activity onResult");
        c cVar = this.f18105A;
        if (cVar != null) {
            ((d) cVar).h(this, i7, i8, intent, this);
        }
        R6();
    }

    @Override // Ov0.a, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
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
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        b.a("BShare.messenger.assist", String.format("act resume: isFirst(%s),hasGetResult(%s)", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f18107C), Boolean.valueOf(this.f18106B)}, 2)));
        if (this.f18107C) {
            this.f18107C = false;
        } else {
            if (this.f18106B) {
                return;
            }
            b.b("BShare.messenger.assist", "gonna finish share with incorrect callback (cancel)", null);
            P6();
        }
    }
}

package com.bilibili.teenagersmode.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.teenagersmode.model.TeenagersModeAgeCheck;
import com.bilibili.teenagersmode.utils.TeenagersRouter;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersForceModeGuardianBindActivity.class */
@StabilityInferred(parameters = 0)
public final class TeenagersForceModeGuardianBindActivity extends FragmentActivity {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public TeenagersModeAgeCheck f110607x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersForceModeGuardianBindActivity$a.class */
    public static final class a extends BiliApiDataCallback<TeenagersModeAgeCheck> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TeenagersForceModeGuardianBindActivity f110608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TintProgressDialog f110609c;

        public a(TeenagersForceModeGuardianBindActivity teenagersForceModeGuardianBindActivity, TintProgressDialog tintProgressDialog) {
            this.f110608b = teenagersForceModeGuardianBindActivity;
            this.f110609c = tintProgressDialog;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(TeenagersModeAgeCheck teenagersModeAgeCheck) {
            TeenagersModeAgeCheck teenagersModeAgeCheck2 = teenagersModeAgeCheck;
            TeenagersForceModeGuardianBindActivity teenagersForceModeGuardianBindActivity = this.f110608b;
            teenagersForceModeGuardianBindActivity.f110607x = teenagersModeAgeCheck2;
            TintProgressDialog tintProgressDialog = this.f110609c;
            try {
                Result.Companion companion = Result.Companion;
                tintProgressDialog.dismiss();
                Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (teenagersModeAgeCheck2 != null && !teenagersModeAgeCheck2.getAfter14() && teenagersModeAgeCheck2.realName == 2) {
                BLRouter.routeTo(new RouteRequest.Builder(TeenagersRouter.a()).requestCode(10089).extras(new Sa.g(1)).build(), teenagersForceModeGuardianBindActivity);
            } else {
                teenagersForceModeGuardianBindActivity.P6("fail_not_14");
                teenagersForceModeGuardianBindActivity.finish();
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            TintProgressDialog tintProgressDialog = this.f110609c;
            try {
                Result.Companion companion = Result.Companion;
                tintProgressDialog.dismiss();
                Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th2));
            }
            TeenagersForceModeGuardianBindActivity teenagersForceModeGuardianBindActivity = this.f110608b;
            ToastHelper.showToast(teenagersForceModeGuardianBindActivity.getApplication(), 2131856000, 0);
            teenagersForceModeGuardianBindActivity.P6("fail_14_auth");
            teenagersForceModeGuardianBindActivity.finish();
        }
    }

    public final void P6(String str) {
        Intent intent = new Intent();
        TeenagersModeAgeCheck teenagersModeAgeCheck = this.f110607x;
        if (teenagersModeAgeCheck != null) {
            intent.putExtra("key_age_info", teenagersModeAgeCheck.toIntEnum());
        }
        intent.putExtra("key_fail", str);
        setResult(0, intent);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 10089) {
            if (i8 == -1 && intent != null && intent.hasExtra("isEnter") && intent.getBooleanExtra("isEnter", false)) {
                Intent intent2 = new Intent();
                TeenagersModeAgeCheck teenagersModeAgeCheck = this.f110607x;
                if (teenagersModeAgeCheck != null) {
                    intent2.putExtra("key_age_info", teenagersModeAgeCheck.toIntEnum());
                }
                setResult(-1, intent2);
                lj.h.b(this, new B21.k(11));
            } else {
                P6("fail_14_auth");
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        TintProgressDialog tintProgressDialog = new TintProgressDialog(this);
        tintProgressDialog.setCancelable(false);
        tintProgressDialog.setMessage(Foundation.Companion.instance().getApp().getString(2131855989));
        tintProgressDialog.show();
        a aVar = new a(this, tintProgressDialog);
        if (vD0.f.b == null) {
            vD0.f.b = (vD0.g) ServiceGenerator.createService(vD0.g.class);
        }
        vD0.f.b.ageCheck(BiliAccounts.get(this).getAccessKey()).enqueue(aVar);
    }
}

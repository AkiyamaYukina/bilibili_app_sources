package com.bilibili.teenagersmode.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.teenagersmode.c;
import java.util.Calendar;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeTimeUpActivity.class */
public class TeenagersModeTimeUpActivity extends BaseToolbarActivity implements FragmentManager.OnBackStackChangedListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f110654D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final b f110655E = new b(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final c f110656F = new c(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeTimeUpActivity$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersModeTimeUpActivity f110657a;

        public a(TeenagersModeTimeUpActivity teenagersModeTimeUpActivity) {
            this.f110657a = teenagersModeTimeUpActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.f110657a.isFragmentStateSaved()) {
                return;
            }
            this.f110657a.onBackPressed();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeTimeUpActivity$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersModeTimeUpActivity f110658a;

        public b(TeenagersModeTimeUpActivity teenagersModeTimeUpActivity) {
            this.f110658a = teenagersModeTimeUpActivity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bilibili.teenagersmode.b.j(this.f110658a, true);
            com.bilibili.teenagersmode.c cVar = c.C1213c.f110575a;
            cVar.n(null);
            cVar.u(BiliContext.application());
            this.f110658a.finish();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeTimeUpActivity$c.class */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenagersModeTimeUpActivity f110659a;

        public c(TeenagersModeTimeUpActivity teenagersModeTimeUpActivity) {
            this.f110659a = teenagersModeTimeUpActivity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bilibili.teenagersmode.b.m(this.f110659a, true);
            com.bilibili.teenagersmode.c cVar = c.C1213c.f110575a;
            cVar.f110570p.c = true;
            if (this.f110659a.f110654D == 2) {
                cVar.p(null);
                cVar.u(BiliContext.application());
                this.f110659a.finish();
            }
        }
    }

    public final void G(Bundle bundle, String str, boolean z6) {
        Fragment fragmentInstantiate = Fragment.instantiate(this, str, bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(2131299392, fragmentInstantiate, str);
        if (z6) {
            fragmentTransactionBeginTransaction.addToBackStack("TeenagersModeTimeUpActivity");
        }
        fragmentTransactionBeginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public final void onBackStackChanged() {
        if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
            showBackButton();
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.ui.TeenagersModeTimeUpActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getSupportFragmentManager().removeOnBackStackChangedListener(this);
        int i7 = this.f110654D;
        if (i7 == 1) {
            c.C1213c.f110575a.n(null);
        } else if (i7 == 2) {
            c.C1213c.f110575a.p(null);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        HandlerThreads.remove(0, this.f110655E);
        HandlerThreads.remove(0, this.f110656F);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        long timeInMillis;
        long j7;
        super.onResume();
        b bVar = this.f110655E;
        HandlerThreads.remove(0, bVar);
        c cVar = this.f110656F;
        HandlerThreads.remove(0, cVar);
        int i7 = this.f110654D;
        if (i7 != 1) {
            if (i7 == 2 && com.bilibili.teenagersmode.b.a(this).getBoolean("teenagers_mode_time_limited_pwd_finished", true)) {
                BLog.i("TeenagersModeTimeUpActivity", "NO NEED TO SHOW LIMITED PAGE");
                super.finish();
            }
            c.C1213c.f110575a.f110561f = true;
        }
        Calendar calendar = Calendar.getInstance();
        if (!com.bilibili.teenagersmode.b.n(this)) {
            calendar.setTimeInMillis(ServerClock.unreliableNow());
        }
        long timeInMillis2 = calendar.getTimeInMillis();
        int i8 = calendar.get(11);
        if (i8 < 6 || i8 >= 22) {
            if (i8 < 6) {
                calendar.set(11, 6);
                calendar.set(12, 0);
                calendar.set(13, 0);
                timeInMillis = calendar.getTimeInMillis();
            } else {
                calendar.set(11, 6);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.add(5, 1);
                timeInMillis = calendar.getTimeInMillis();
            }
            j7 = timeInMillis - timeInMillis2;
        } else {
            j7 = 0;
        }
        HandlerThreads.postDelayed(0, bVar, j7);
        Calendar calendar2 = Calendar.getInstance();
        if (!com.bilibili.teenagersmode.b.n(this)) {
            calendar2.setTimeInMillis(ServerClock.unreliableNow());
        }
        long timeInMillis3 = calendar2.getTimeInMillis();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.add(5, 1);
        long timeInMillis4 = calendar2.getTimeInMillis() - timeInMillis3;
        if (timeInMillis4 < 0) {
            timeInMillis4 = 0;
        }
        HandlerThreads.postDelayed(0, cVar, timeInMillis4);
        c.C1213c.f110575a.f110561f = true;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void showBackButton() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (shouldTintIcon()) {
            ((TintToolbar) this.mToolbar).setIconTintColorWithGarb(GarbManager.getCurGarb().getFontColor());
        }
    }
}

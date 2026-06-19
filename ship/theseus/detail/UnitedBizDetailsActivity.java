package com.bilibili.ship.theseus.detail;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.ipc.IPCAppStateManager;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.DeviceInfo;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.lib.performance.EntryAwait;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.module.main.innerpush.IPushContainer;
import com.bilibili.module.main.innerpush.PushBizParams;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.ship.theseus.detail.di.InterfaceC6141a;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.report.PVReportService;
import com.bilibili.ship.theseus.united.page.screenstate.PageRestoredState;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sv0.C8627a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/UnitedBizDetailsActivity.class */
@StabilityInferred(parameters = 0)
@EntryAwait(init = {"infra.opt.awaitPlayer"})
@AndroidEntryPoint
public final class UnitedBizDetailsActivity extends b implements IPvTracker, IPushContainer, IMiniPlayerContainer {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC6141a f90861F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Inject
    public a.j1.a f90862G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f90863H = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a f90864I = new com.bilibili.ship.theseus.united.page.performance.a();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C8627a> f90865J = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final a f90866K = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/UnitedBizDetailsActivity$a.class */
    public static final class a implements IPCAppStateManager.IPCActivityStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedBizDetailsActivity f90867a;

        public a(UnitedBizDetailsActivity unitedBizDetailsActivity) {
            this.f90867a = unitedBizDetailsActivity;
        }

        public final void onForegroundActivitiesChanged(int i7, int i8) {
        }

        public final void onVisibleCountChanged(int i7, int i8) {
            this.f90867a.f90865J.setValue(new C8627a(i7, i8));
        }
    }

    public static boolean Q6(UnitedBizDetailsActivity unitedBizDetailsActivity, int i7, KeyEvent keyEvent) {
        return super.onKeyUp(i7, keyEvent);
    }

    public static boolean R6(UnitedBizDetailsActivity unitedBizDetailsActivity, int i7, KeyEvent keyEvent) {
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean appendEndExtra() {
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(2130772395, 2130772396);
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final String getMiniPlayerContainerKey() {
        return "united_detail_page";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        a.T1 t12 = this.f90861F;
        if (t12 != null) {
            return ((PVReportService) t12.r1.get()).f102479b;
        }
        BLog.e("UnitedBizDetailsActivity-getPvEventId", "[theseus-detail-UnitedBizDetailsActivity-getPvEventId] component is null", (Throwable) null);
        return "united.player-video-detail.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        a.T1 t12 = this.f90861F;
        if (t12 != null) {
            return ((PVReportService) t12.r1.get()).a();
        }
        BLog.e("UnitedBizDetailsActivity-getPvExtra", "[theseus-detail-UnitedBizDetailsActivity-getPvExtra] component is null", (Throwable) null);
        Bundle bundle = new Bundle();
        bundle.putString("oaid", MsaHelper.getOaid());
        bundle.putString("android_id", DeviceInfo.getAndroidId(FoundationAlias.getFapp()));
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        a.T1 t12 = this.f90861F;
        a.T1 t13 = t12;
        if (t12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            t13 = null;
        }
        ((ActivityResultRepository) t13.o2.get()).a(i7, i8, intent);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onBackPressed() {
        a.T1 t12 = this.f90861F;
        a.T1 t13 = t12;
        if (t12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            t13 = null;
        }
        ((BackActionRepository) t13.K0.get()).c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0966  */
    /* JADX WARN: Type inference failed for: r0v230, types: [com.bilibili.ship.theseus.united.player.oldway.f, java.lang.Object] */
    @Override // com.bilibili.ship.theseus.detail.b, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 2940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.UnitedBizDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.ship.theseus.detail.b, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        IPCAppStateManager.getInstance().removeIPCActivityStateCallback(this.f90866K);
        super.onDestroy();
    }

    @Override // com.bilibili.module.main.innerpush.IPushContainer
    public final boolean onInterceptPushShow(@NotNull List<String> list, @Nullable PushBizParams pushBizParams) {
        if (list.contains("ugc-video-detail")) {
            return true;
        }
        boolean zEquals = false;
        if (pushBizParams != null) {
            Map<String, String> resource = pushBizParams.getResource();
            if (resource == null) {
                zEquals = false;
            } else {
                zEquals = false;
                if (TextUtils.equals(pushBizParams.getType(), "2")) {
                    a.T1 t12 = this.f90861F;
                    if (t12 == null) {
                        return false;
                    }
                    C7893a.C1318a c1318aC = ((C7893a) t12.x0.get()).c();
                    zEquals = false;
                    if (c1318aC != null) {
                        zEquals = TextUtils.equals(String.valueOf(c1318aC.f123395a.f123397a), resource.get(GameCardButton.extraAvid));
                    }
                }
            }
        }
        return zEquals;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(final int i7, @Nullable final KeyEvent keyEvent) {
        a.T1 t12 = this.f90861F;
        if (t12 == null) {
            return false;
        }
        if (((com.bilibili.ship.theseus.united.page.keyboard.a) t12.p2.get()).a(i7, this)) {
            return true;
        }
        a.T1 t13 = this.f90861F;
        a.T1 t14 = t13;
        if (t13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            t14 = null;
        }
        return ((com.bilibili.ship.theseus.united.page.backpress.c) t14.b1.get()).a(keyEvent, new Function0(this, i7, keyEvent) { // from class: com.bilibili.ship.theseus.detail.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnitedBizDetailsActivity f91066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f91067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final KeyEvent f91068c;

            {
                this.f91066a = this;
                this.f91067b = i7;
                this.f91068c = keyEvent;
            }

            public final Object invoke() {
                return Boolean.valueOf(UnitedBizDetailsActivity.R6(this.f91066a, this.f91067b, this.f91068c));
            }
        });
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, @Nullable KeyEvent keyEvent) {
        a.T1 t12 = this.f90861F;
        a.T1 t13 = t12;
        if (t12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            t13 = null;
        }
        return ((com.bilibili.ship.theseus.united.page.backpress.c) t13.b1.get()).a(keyEvent, new Ex.e(this, i7, keyEvent));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(@Nullable List<KeyboardShortcutGroup> list, @Nullable Menu menu, int i7) {
        KeyboardShortcutGroup keyboardShortcutGroup;
        super.onProvideKeyboardShortcuts(list, menu, i7);
        a.T1 t12 = this.f90861F;
        if (t12 == null || (keyboardShortcutGroup = ((com.bilibili.ship.theseus.united.page.keyboard.a) t12.p2.get()).h) == null || list == null) {
            return;
        }
        list.add(keyboardShortcutGroup);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a.T1 t12 = this.f90861F;
        a.T1 t13 = t12;
        if (t12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            t13 = null;
        }
        PageRestoredState pageRestoredStateA = ((com.bilibili.ship.theseus.united.page.screenstate.b) t13.n2.get()).a();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(pageRestoredStateA, 0);
        bundle.putByteArray("PageRestoredState", parcelObtain.marshall());
        parcelObtain.recycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        this.f90863H.setValue(Boolean.valueOf(z6));
    }
}

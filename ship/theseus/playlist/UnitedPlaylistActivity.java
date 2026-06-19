package com.bilibili.ship.theseus.playlist;

import Ah0.InterfaceC1405e;
import VG.X;
import VG.Y;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import c6.Q;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.base.ipc.IPCAppStateManager;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.DeviceInfo;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.module.main.innerpush.IPushContainer;
import com.bilibili.module.main.innerpush.PushBizParams;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.ship.theseus.playlist.UnitedPlaylistActivity;
import com.bilibili.ship.theseus.playlist.di.page.C6218a;
import com.bilibili.ship.theseus.playlist.di.page.C6233p;
import com.bilibili.ship.theseus.playlist.di.page.V;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.report.PVReportService;
import com.bilibili.ship.theseus.united.page.screenstate.PageRestoredState;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.internal.Preconditions;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sv0.C8627a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/UnitedPlaylistActivity.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class UnitedPlaylistActivity extends AbstractActivityC6216c implements IPvTracker, IPushContainer, IMiniPlayerContainer {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public V f95178F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Inject
    public a.j1.a f95179G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f95180H = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a f95181I = new com.bilibili.ship.theseus.united.page.performance.a();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C8627a> f95182J = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final a f95183K = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/UnitedPlaylistActivity$a.class */
    public static final class a implements IPCAppStateManager.IPCActivityStateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedPlaylistActivity f95184a;

        public a(UnitedPlaylistActivity unitedPlaylistActivity) {
            this.f95184a = unitedPlaylistActivity;
        }

        public final void onForegroundActivitiesChanged(int i7, int i8) {
        }

        public final void onVisibleCountChanged(int i7, int i8) {
            this.f95184a.f95182J.setValue(new C8627a(i7, i8));
        }
    }

    public static boolean Q6(UnitedPlaylistActivity unitedPlaylistActivity, int i7, KeyEvent keyEvent) {
        return super.onKeyUp(i7, keyEvent);
    }

    public static boolean R6(UnitedPlaylistActivity unitedPlaylistActivity, int i7, KeyEvent keyEvent) {
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
        a.S0 s02 = this.f95178F;
        if (s02 != null) {
            return ((PVReportService) s02.r1.get()).f102479b;
        }
        BLog.e("UnitedPlaylistActivity-getPvEventId", "[theseus-playlist-detail-UnitedPlaylistActivity-getPvEventId] component is null", (Throwable) null);
        return "united.player-video-detail.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        a.S0 s02 = this.f95178F;
        if (s02 != null) {
            return ((PVReportService) s02.r1.get()).a();
        }
        BLog.e("UnitedPlaylistActivity-getPvExtra", "[theseus-playlist-detail-UnitedPlaylistActivity-getPvExtra] component is null", (Throwable) null);
        Bundle bundle = new Bundle();
        bundle.putString("oaid", MsaHelper.getOaid());
        bundle.putString("android_id", DeviceInfo.getAndroidId(FoundationAlias.getFapp()));
        return bundle;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        a.S0 s02 = this.f95178F;
        a.S0 s03 = s02;
        if (s02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s03 = null;
        }
        ((ActivityResultRepository) s03.e2.get()).a(i7, i8, intent);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public final void onBackPressed() {
        a.S0 s02 = this.f95178F;
        a.S0 s03 = s02;
        if (s02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s03 = null;
        }
        ((BackActionRepository) s03.L0.get()).c(false);
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [com.bilibili.ship.theseus.united.player.oldway.f, java.lang.Object] */
    @Override // com.bilibili.ship.theseus.playlist.AbstractActivityC6216c, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Object parcelable;
        byte[] byteArray;
        if (bundle != null) {
            bundle.remove("android:support:fragments");
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 != null) {
                bundle2.remove("android:support:fragments");
            }
        }
        sh1.a.a(this, bundle);
        PerformanceTracerImpl.Entry entryAttach = PerformanceTracerImpl.Entry.ON_CREATE.attach(SystemClock.elapsedRealtime());
        final com.bilibili.ship.theseus.united.page.performance.a aVar = this.f95181I;
        aVar.b(entryAttach);
        if (!ListDeviceInfoKt.isHdApp()) {
            boolean zIsNormal = KScreenAdjustUtilsKt.isNormal(ScreenAdjustUtilsKt.windowSize(this));
            InterfaceC1405e interfaceC1405e = (InterfaceC1405e) com.bilibili.ship.theseus.united.page.screensize.b.f102942a.getValue();
            boolean z6 = interfaceC1405e != null && interfaceC1405e.b(this);
            int i7 = (zIsNormal || z6) ? 1 : -1;
            StringBuilder sbA = Q.a("onCreate: normal=", " inMagicWindow=", " set orientation=", zIsNormal, z6);
            sbA.append(i7);
            BLog.i("UnitedPlaylistActivity-onCreate", "[theseus-playlist-detail-UnitedPlaylistActivity-onCreate] " + sbA.toString());
            setRequestedOrientation(i7);
        }
        super.onCreate(null);
        ClassLoader classLoader = getClassLoader();
        if (bundle == null || (byteArray = bundle.getByteArray("PageRestoredState")) == null) {
            parcelable = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            try {
                parcelable = Build.VERSION.SDK_INT >= 33 ? parcelObtain.readParcelable(classLoader, PageRestoredState.class) : parcelObtain.readParcelable(classLoader);
            } finally {
                parcelObtain.recycle();
            }
        }
        try {
            C6233p c6233p = new C6233p(getIntent(), (PageRestoredState) parcelable);
            aVar.a("media_list", "detailType");
            aVar.a(Boolean.TRUE, "is_auto_play");
            final com.bilibili.ship.theseus.playlist.di.page.B b7 = new com.bilibili.ship.theseus.playlist.di.page.B(this);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            b7.f95585d.c(this, new Function1(b7, booleanRef, aVar) { // from class: com.bilibili.ship.theseus.playlist.di.page.A

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final B f95579a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.BooleanRef f95580b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.performance.a f95581c;

                {
                    this.f95579a = b7;
                    this.f95580b = booleanRef;
                    this.f95581c = aVar;
                }

                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    defpackage.a.b("[theseus-playlist-detail-PlaylistLayoutBackedModule-initContentView$lambda$0] ", com.bilibili.app.comm.bh.x5.b.a("updateContentView large=", zBooleanValue), "PlaylistLayoutBackedModule-initContentView$lambda$0");
                    B b8 = this.f95579a;
                    ViewGroup viewGroup = zBooleanValue ? b8.b().f20194a : b8.a().f20169a;
                    UnitedPlaylistActivity unitedPlaylistActivity = b8.f95582a;
                    unitedPlaylistActivity.setContentView(viewGroup);
                    Ref.BooleanRef booleanRef2 = this.f95580b;
                    if (booleanRef2.element) {
                        booleanRef2.element = false;
                        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(unitedPlaylistActivity), (CoroutineContext) null, (CoroutineStart) null, new PlaylistLayoutBackedModule$initContentView$1$1(viewGroup, this.f95581c, b8, null), 3, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            });
            IPCAppStateManager.getInstance().addIPCActivityStateCallback(this.f95183K);
            a.j1.a aVar2 = this.f95179G;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pageServiceComponentBuilderProvider");
                aVar2 = null;
            }
            a.R0 r0A = ((V.a) aVar2.get()).a(c6233p);
            r0A.f = (com.bilibili.ship.theseus.united.page.performance.a) Preconditions.checkNotNull(aVar);
            r0A.g = (Flow) Preconditions.checkNotNull(this.f95182J);
            r0A.c = (C6218a) Preconditions.checkNotNull(new C6218a(this));
            r0A.d = (com.bilibili.ship.theseus.playlist.di.page.B) Preconditions.checkNotNull(b7);
            r0A.e = (Flow) Preconditions.checkNotNull(this.f95180H);
            Preconditions.checkBuilderRequirement(r0A.b, C6233p.class);
            Preconditions.checkBuilderRequirement(r0A.c, C6218a.class);
            Preconditions.checkBuilderRequirement(r0A.d, com.bilibili.ship.theseus.playlist.di.page.B.class);
            Preconditions.checkBuilderRequirement(r0A.e, Flow.class);
            Preconditions.checkBuilderRequirement(r0A.f, com.bilibili.ship.theseus.united.page.performance.a.class);
            Preconditions.checkBuilderRequirement(r0A.g, Flow.class);
            a.S0 s02 = new a.S0(r0A.a, r0A.c, r0A.d, (com.bilibili.ship.theseus.united.player.oldway.f) new Object(), r0A.b, r0A.e, r0A.f, r0A.g);
            aVar.c(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_COMPONENT_CREATED.attach(SystemClock.elapsedRealtime()));
            aVar.c(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_PLAYER_CONTAINER_CREATED.attach(SystemClock.elapsedRealtime()));
            this.f95178F = s02;
            aVar.c(PerformanceTracerImpl.Entry.ON_THESEUS_PAGE_PAGE_ANCHOR_CREATED.attach(SystemClock.elapsedRealtime()));
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new UnitedPlaylistActivity$prepareFallbackOnBackPressed$1(this, null), 3, (Object) null);
        } catch (IllegalArgumentException e7) {
            finish();
        }
    }

    @Override // com.bilibili.ship.theseus.playlist.AbstractActivityC6216c, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        IPCAppStateManager.getInstance().removeIPCActivityStateCallback(this.f95183K);
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
                    a.S0 s02 = this.f95178F;
                    if (s02 == null) {
                        return false;
                    }
                    C7893a.C1318a c1318aC = ((C7893a) s02.y0.get()).c();
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
    public final boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent) {
        a.S0 s02 = this.f95178F;
        if (s02 == null) {
            return false;
        }
        if (((com.bilibili.ship.theseus.united.page.keyboard.a) s02.d2.get()).a(i7, this)) {
            return true;
        }
        a.S0 s03 = this.f95178F;
        a.S0 s04 = s03;
        if (s03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s04 = null;
        }
        return ((com.bilibili.ship.theseus.united.page.backpress.c) s04.b1.get()).a(keyEvent, new Y(this, i7, keyEvent));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, @Nullable KeyEvent keyEvent) {
        a.S0 s02 = this.f95178F;
        a.S0 s03 = s02;
        if (s02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s03 = null;
        }
        return ((com.bilibili.ship.theseus.united.page.backpress.c) s03.b1.get()).a(keyEvent, new X(this, i7, keyEvent));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(@Nullable List<KeyboardShortcutGroup> list, @Nullable Menu menu, int i7) {
        KeyboardShortcutGroup keyboardShortcutGroup;
        super.onProvideKeyboardShortcuts(list, menu, i7);
        a.S0 s02 = this.f95178F;
        if (s02 == null || (keyboardShortcutGroup = ((com.bilibili.ship.theseus.united.page.keyboard.a) s02.d2.get()).h) == null || list == null) {
            return;
        }
        list.add(keyboardShortcutGroup);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a.S0 s02 = this.f95178F;
        a.S0 s03 = s02;
        if (s02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s03 = null;
        }
        PageRestoredState pageRestoredStateA = ((com.bilibili.ship.theseus.united.page.screenstate.b) s03.c2.get()).a();
        a.S0 s04 = this.f95178F;
        if (s04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            s04 = null;
        }
        ((com.bilibili.ship.theseus.playlist.di.driver.b) s04.B1.get()).a();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(pageRestoredStateA, 0);
        bundle.putByteArray("PageRestoredState", parcelObtain.marshall());
        parcelObtain.recycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        this.f95180H.setValue(Boolean.valueOf(z6));
    }
}

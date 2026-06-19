package com.bilibili.studio.videoeditor.template;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.foundation.text.selection.P0;
import com.bilibili.base.BiliContext;
import com.bilibili.base.MainThread;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.studio.videoeditor.common.intent.a;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.template.bean.BiliActionRequest;
import com.bilibili.studio.videoeditor.template.util.BiliTemplateEnvironment;
import fD0.InterfaceC7041a;
import gD0.InterfaceC7247a;
import gD0.InterfaceC7248b;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import lB0.a;
import lB0.a$b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/BiliTemplateEngineManager.class */
public final class BiliTemplateEngineManager implements InterfaceC7247a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.centerplus.ui.c f109911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.contribute.picker.model.p f109912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliTemplateEnvironment f109913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC7041a f109914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f109915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Context f109916g;

    @Nullable
    public a.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a.a f109917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public iD0.a f109918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public InterfaceC7248b f109919k;

    public BiliTemplateEngineManager(int i7) {
        this.f109910a = i7;
    }

    public static /* synthetic */ void c(BiliTemplateEngineManager biliTemplateEngineManager, boolean z6, boolean z7, boolean z8, Function1 function1, int i7) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        if ((i7 & 4) != 0) {
            z8 = false;
        }
        biliTemplateEngineManager.b(z6, z7, z8, function1);
    }

    @Override // gD0.InterfaceC7247a
    public final void a(@NotNull BiliActionRequest biliActionRequest, @NotNull Fq.b bVar) {
        BLog.ifmt("BiliTemplateManager", "onBusinessAction...actionType = " + biliActionRequest.actionType + ", extra = " + biliActionRequest.extra + ", response = " + bVar, new Object[0]);
        int i7 = biliActionRequest.actionType;
        if (i7 == 1) {
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/template/transmit")).extras(new E80.P(2, biliActionRequest, this)).build(), BiliContext.application());
        } else if (i7 == 2) {
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/template/transmit")).extras(new I(biliActionRequest, this)).requestCode(30012).build(), BiliContext.application());
        } else {
            if (i7 != 3) {
                return;
            }
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/template/transmit")).extras(new F(0, biliActionRequest, this)).requestCode(30012).build(), BiliContext.application());
        }
    }

    @Override // gD0.InterfaceC7247a
    public final boolean ab(@NotNull String str) {
        if (!Intrinsics.areEqual("bbs_key_ab_config_large_bundle", str)) {
            return false;
        }
        Lazy lazy = zw0.b.f130950a;
        return Intrinsics.areEqual(Contract.get$default(ConfigManager.Companion.ab(), "uper.bcut_sdk_crash_ab", (Object) null, 2, (Object) null), Boolean.TRUE);
    }

    public final void b(final boolean z6, final boolean z7, final boolean z8, @NotNull final Function1<? super Boolean, Unit> function1) {
        P0.a(this.f109910a, "BiliTemplateManager", new StringBuilder("checkEditorEngineModState bizType="));
        final BiliTemplateEnvironment biliTemplateEnvironment = this.f109913d;
        if (biliTemplateEnvironment != null) {
            final Application application = BiliContext.application();
            if (biliTemplateEnvironment.isEditorEngineModAvailable()) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            if (z6) {
                if (this.f109916g != null) {
                    MainThread.runOnMainThread(new J81.C(this, 3));
                }
                MainThread.runOnMainThread(new C6608f(this, 0));
            }
            biliTemplateEnvironment.downloadAndCheckEditorEngineModsLoad(new Function1(z6, this) { // from class: com.bilibili.studio.videoeditor.template.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f110053a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BiliTemplateEngineManager f110054b;

                {
                    this.f110053a = z6;
                    this.f110054b = this;
                }

                public final Object invoke(Object obj) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (this.f110053a) {
                        int i7 = (int) (iIntValue * 0.1f);
                        BiliTemplateEngineManager biliTemplateEngineManager = this.f110054b;
                        biliTemplateEngineManager.getClass();
                        MainThread.runOnMainThread(new C6608f(biliTemplateEngineManager, i7));
                    }
                    return Unit.INSTANCE;
                }
            }, new Function1(biliTemplateEnvironment, function1, z8, this, z6, z7, application) { // from class: com.bilibili.studio.videoeditor.template.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliTemplateEnvironment f110057a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f110058b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f110059c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final BiliTemplateEngineManager f110060d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final boolean f110061e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final boolean f110062f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final Application f110063g;

                {
                    this.f110057a = biliTemplateEnvironment;
                    this.f110058b = function1;
                    this.f110059c = z8;
                    this.f110060d = this;
                    this.f110061e = z6;
                    this.f110062f = z7;
                    this.f110063g = application;
                }

                public final Object invoke(Object obj) {
                    Application application2 = this.f110063g;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    Function1 function12 = this.f110058b;
                    BiliTemplateEngineManager biliTemplateEngineManager = this.f110060d;
                    if (zBooleanValue) {
                        if (this.f110057a.isEditorEngineModAvailable()) {
                            function12.invoke(Boolean.TRUE);
                        } else {
                            function12.invoke(Boolean.FALSE);
                        }
                        if (this.f110059c) {
                            biliTemplateEngineManager.h();
                        }
                    } else {
                        if (this.f110061e) {
                            biliTemplateEngineManager.h();
                        }
                        if (this.f110062f && application2 != null) {
                            ToastHelper.showToast(application2, application2.getString(2131841949), 0, 17);
                        }
                        function12.invoke(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public final Object d(boolean z6, boolean z7, ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        Application application = BiliContext.application();
        InterfaceC7041a interfaceC7041a = this.f109914e;
        if (interfaceC7041a != null) {
            if (interfaceC7041a.j()) {
                MainThread.runOnMainThread(new c0(this, new e0(interfaceC7041a, application, cancellableContinuationImpl)));
            } else {
                if (z7 && application != null) {
                    ToastHelper.showToast(application, application.getString(2131841810), 0, 17);
                }
                if (z6) {
                    if (this.f109916g != null) {
                        MainThread.runOnMainThread(new J81.C(this, 3));
                    }
                    MainThread.runOnMainThread(new C6608f(this, 10));
                }
                interfaceC7041a.r(new g0(this, interfaceC7041a, application, cancellableContinuationImpl, z6, z7));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }

    public final void e(boolean z6, boolean z7, Function1<? super Boolean, Unit> function1) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new BiliTemplateEngineManager$checkTribeInstalledState$1(function1, this, z6, z7, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager.f(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Bundle g(Bundle bundle) {
        if (ab("bbs_key_ab_config_large_bundle")) {
            bundle.putString("bbs_key_template_track_id", Xz0.g.d());
            putIntentData("bbs_key_large_bundle_data", bundle);
            bundle = new Bundle();
        } else {
            bundle.putString("bbs_key_template_track_id", Xz0.g.d());
        }
        return bundle;
    }

    @Override // gD0.InterfaceC7247a
    @Nullable
    public final <T> T getIntentData(@NotNull String str, @NotNull Class<T> cls) {
        Object objA = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Application application = BiliContext.application();
        if (application != null) {
            Lazy<com.bilibili.studio.videoeditor.common.intent.a> lazy = com.bilibili.studio.videoeditor.common.intent.a.f109426c;
            objA = a.C1206a.a().a(application, cls, str);
        }
        return (T) objA;
    }

    public final void h() {
        MainThread.runOnMainThread(new J81.H(this, 4));
    }

    public final void i(@Nullable Context context) {
        this.f109913d = new BiliTemplateEnvironment();
        InterfaceC7041a.f117734a.getClass();
        this.f109914e = InterfaceC7041a.a.a();
        this.f109916g = context;
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: com.bilibili.studio.videoeditor.template.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliTemplateEngineManager f110160a;

            {
                this.f110160a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                BLog.ifmt("BiliTemplateManager", "EventFinishEdit..." + ((EventFinishEdit) obj), new Object[0]);
                BiliTemplateEngineManager biliTemplateEngineManager = this.f110160a;
                biliTemplateEngineManager.getClass();
                try {
                    InterfaceC7041a interfaceC7041a = biliTemplateEngineManager.f109914e;
                    if (interfaceC7041a != null) {
                        interfaceC7041a.closeTemplateEditPage();
                    }
                } catch (Throwable th) {
                    BLog.e("BiliTemplateManager", "closeTemplateEditPage error " + th.getMessage());
                    th.printStackTrace();
                }
            }
        };
        aVarA.getClass();
        this.h = lB0.a.b(EventFinishEdit.class, a_b);
        lB0.a aVarA2 = lB0.a.a();
        a$b a_b2 = new a$b(this) { // from class: com.bilibili.studio.videoeditor.template.D

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliTemplateEngineManager f109922a;

            {
                this.f109922a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                eD0.a aVar = (eD0.a) obj;
                BLog.ifmt("BiliTemplateManager", "EventTemplateEngine..." + aVar, new Object[0]);
                if (TextUtils.isEmpty(aVar.a)) {
                    return;
                }
                BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new BiliTemplateEngineManager$initEvent$2$1(this.f109922a, aVar, null), 3, (Object) null);
            }
        };
        aVarA2.getClass();
        this.f109917i = lB0.a.b(eD0.a.class, a_b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager.j(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void k() {
        BiliTemplateEnvironment biliTemplateEnvironment = this.f109913d;
        if (biliTemplateEnvironment != null) {
            biliTemplateEnvironment.release();
        }
        this.f109913d = null;
        InterfaceC7041a interfaceC7041a = this.f109914e;
        if (interfaceC7041a != null) {
            interfaceC7041a.release();
        }
        this.f109914e = null;
        this.f109915f = false;
        this.f109916g = null;
        h();
        this.f109918j = null;
        this.f109919k = null;
        a.a aVar = this.h;
        if (aVar != null) {
            aVar.a();
        }
        a.a aVar2 = this.f109917i;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    public final <T> void l(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final Class<T> cls, @NotNull final Function3<? super String, ? super String, ? super T, Unit> function3, @NotNull final Function2<? super Integer, ? super String, Unit> function2) {
        e(false, true, new Function1(function2, this, str, str2, str3, cls, function3) { // from class: com.bilibili.studio.videoeditor.template.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function2 f110115a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliTemplateEngineManager f110116b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f110117c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f110118d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f110119e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Class f110120f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Function3 f110121g;

            {
                this.f110115a = function2;
                this.f110116b = this;
                this.f110117c = str;
                this.f110118d = str2;
                this.f110119e = str3;
                this.f110120f = cls;
                this.f110121g = function3;
            }

            public final Object invoke(Object obj) {
                Unit unit;
                Class cls2 = this.f110120f;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Function2<? super Integer, ? super String, Unit> function22 = this.f110115a;
                if (zBooleanValue) {
                    InterfaceC7041a interfaceC7041a = this.f110116b.f109914e;
                    if (interfaceC7041a != null) {
                        interfaceC7041a.requestAITask(this.f110117c, this.f110118d, this.f110119e, cls2, this.f110121g, function22);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    function22.invoke(-1, "checkTribeInstalledState fail");
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        });
    }

    @Override // gD0.InterfaceC7247a
    public final void putIntentData(@NotNull String str, @NotNull Object obj) {
        Application application;
        if (TextUtils.isEmpty(str) || (application = BiliContext.application()) == null) {
            return;
        }
        Lazy<com.bilibili.studio.videoeditor.common.intent.a> lazy = com.bilibili.studio.videoeditor.common.intent.a.f109426c;
        a.C1206a.a().c(application, str, obj);
    }
}

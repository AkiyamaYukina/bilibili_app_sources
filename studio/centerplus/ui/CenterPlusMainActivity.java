package com.bilibili.studio.centerplus.ui;

import F3.O1;
import TB0.C2866a;
import Up0.p;
import Vn.A;
import Xz0.j;
import Xz0.l;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.app.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import bw0.InterfaceC5167a;
import com.alibaba.fastjson.JSON;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.app.authorspace.ui.pages.V;
import com.bilibili.app.history.ui.k;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.base.MainThread;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.PermissionRequestUtils;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.lib.ui.Target;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.moduleservice.upper.ICenterPlusContainer;
import com.bilibili.moduleservice.upper.ICenterPlusTab;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import com.bilibili.privacy.PrivacyHelper;
import com.bilibili.studio.centerplus.dialog.AlbumQuitDialog;
import com.bilibili.studio.centerplus.model.CenterPlusViewModel;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.ui.CenterPlusMainActivity;
import com.bilibili.studio.centerplus.util.a;
import com.bilibili.studio.centerplus.util.i;
import com.bilibili.studio.centerplus.widgets.TabEvent;
import com.bilibili.studio.centerplus.widgets.WheelTabLayout;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.comm.manager.IGVEntranceManager;
import com.bilibili.studio.comm.manager.t;
import com.bilibili.studio.editor.moudle.intelligence.vm.e;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.k;
import com.bilibili.studio.videoeditor.C6598f;
import com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.tribe.extra.TribeHelper;
import cw0.AbstractActivityC6766c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import qw0.C8488a;
import rw0.C8554a;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity.class */
public final class CenterPlusMainActivity extends AbstractActivityC6766c implements ICenterPlusContainer, IMiniPlayerContainer {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public EventFinishEdit.FinishReason f105203C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public Bundle f105212L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public a.a f105213M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public a.a f105214N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f105216P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f105217Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f105218R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final KProperty<Object>[] f105202S = {new PropertyReference1Impl(CenterPlusMainActivity.class, "binding", "getBinding()Lcom/bilibili/studio/videoeditor/databinding/BiliAppActivityCenterPlusMainBinding;", 0)};

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Cm.a f105204D = new Cm.a(UtilsKt.emptyVbCallback(), (Function1) new Object(), true);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Object> f105205E = new HashMap<>();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, Fragment> f105206F = new HashMap<>();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f105207G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f105208H = 1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public String f105209I = "center_plus";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public String f105210J = "bilibili://uper/center_plus";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final Lazy f105211K = LazyKt.lazy(new I90.d(this, 4));

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f105215O = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$a.class */
    public static final class a {
        @NotNull
        public static String a() {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            return fapp.getString(2131842309);
        }

        @NotNull
        public static String b() {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            return fapp.getString(2131842226);
        }

        @NotNull
        public static String c() {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            return fapp.getString(2131842394);
        }

        @NotNull
        public static String d() {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            return fapp.getString(2131842390);
        }

        @NotNull
        public static String e() {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            return fapp.getString(2131842340);
        }

        @NotNull
        public static String f() {
            Activity activity = BiliContext.topActivity();
            boolean zIsActive = ActivityExtKt.isActive(activity);
            Context fapp = activity;
            if (!zIsActive) {
                fapp = FoundationAlias.getFapp();
            }
            return fapp.getString(2131842022);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$b.class */
    public static final class b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f105219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f105220b;

        public c(@NotNull String str, @NotNull String str2) {
            this.f105219a = str;
            this.f105220b = str2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f105219a, cVar.f105219a) && Intrinsics.areEqual(this.f105220b, cVar.f105220b);
        }

        public final int hashCode() {
            return this.f105220b.hashCode() + (this.f105219a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("FeatureActivationTarget(bundleName=");
            sb.append(this.f105219a);
            sb.append(", moduleName=");
            return C8770a.a(sb, this.f105220b, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$d.class */
    public static final class d extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$e.class */
    public static final /* synthetic */ class e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f105221a;

        public e(Function1 function1) {
            this.f105221a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f105221a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f105221a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$f.class */
    public static final class f implements Function1<CenterPlusMainActivity, C2866a> {
        public final Object invoke(Object obj) {
            return C2866a.bind(UtilsKt.findRootView((ComponentActivity) obj));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.centerplus.ui.CenterPlusMainActivity$onCreate$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/CenterPlusMainActivity$onCreate$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CenterPlusMainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CenterPlusMainActivity centerPlusMainActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = centerPlusMainActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Lazy lazy = com.bilibili.studio.centerplus.util.f.f105295a;
                CenterPlusMainActivity centerPlusMainActivity = this.this$0;
                this.label = 1;
                String[] strArr = (String[]) com.bilibili.studio.centerplus.util.f.f105296b.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(strArr.length), 16));
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boxing.boxBoolean(false));
                }
                Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                if (((Boolean) com.bilibili.studio.centerplus.util.f.f105295a.getValue()).booleanValue()) {
                    try {
                        Result.Companion companion = Result.Companion;
                        PackageManager packageManager = centerPlusMainActivity.getPackageManager();
                        Iterator<T> it = PrivacyHelper.getApplicationsInfoForPrivacy(packageManager, 128).iterator();
                        loop2: while (it.hasNext()) {
                            CharSequence charSequenceLoadLabel = ((ApplicationInfo) it.next()).loadLabel(packageManager);
                            int length = strArr.length;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length) {
                                    str = null;
                                    break;
                                }
                                str = strArr[i8];
                                if (StringsKt.l(charSequenceLoadLabel, str)) {
                                    break;
                                }
                                i8++;
                            }
                            if (str != null) {
                                mutableMap.put(str, Boxing.boxBoolean(true));
                            }
                            if (!mutableMap.isEmpty()) {
                                Iterator it2 = mutableMap.entrySet().iterator();
                                while (it2.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                                        break;
                                    }
                                }
                                break loop2;
                            }
                            break;
                        }
                        obj2 = Result.constructor-impl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                    }
                    Throwable th2 = Result.exceptionOrNull-impl(obj2);
                    if (th2 != null) {
                        M.b("Scan fail: ", th2.getMessage(), "PackageUtils");
                    }
                    BLog.d("PackageUtils", "Scan success: " + mutableMap);
                }
                if (mutableMap == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = mutableMap;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            String strP = CollectionsKt.p(linkedHashMap2.keySet(), ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
            HashMap<String, String> map = j.f28473a;
            j.c("is_app_scanned", ((Boolean) com.bilibili.studio.centerplus.util.f.f105295a.getValue()).booleanValue() ? "1" : "0");
            j.c("cut_app", strP);
            S9.b.a(new StringBuilder("Scan app list: "), strP, "CenterPlusMainActivity");
            return Unit.INSTANCE;
        }
    }

    public static boolean P6(int i7, c cVar) {
        boolean z6 = false;
        if (cVar == null) {
            return false;
        }
        try {
            String str = cVar.f105220b;
            String str2 = cVar.f105219a;
            TribeHelper tribeHelper = TribeHelper.INSTANCE;
            if (!tribeHelper.isFeatureInstalled(str2)) {
                StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "ensureFeatureActivatedIfInstalled skip, feature not installed. routeTabIndex=", ", bundle=", str2, ", module=");
                sbB.append(str);
                BLog.w("CenterPlusMainActivity", sbB.toString());
                return false;
            }
            try {
                boolean zActivateFeatureIfInstalled = tribeHelper.activateFeatureIfInstalled(str2, str);
                BLog.ifmt("CenterPlusMainActivity", "ensureFeatureActivatedIfInstalled...routeTabIndex=" + i7 + ", bundle=" + str2 + ", module=" + str + ", activated=" + zActivateFeatureIfInstalled, new Object[0]);
                z6 = zActivateFeatureIfInstalled;
            } catch (Throwable th) {
                String str3 = cVar.f105219a;
                String str4 = cVar.f105220b;
                StringBuilder sbB2 = bilibili.live.app.service.resolver.a.b(i7, "ensureFeatureActivatedIfInstalled failed, routeTabIndex=", ", bundle=", str3, ", module=");
                sbB2.append(str4);
                BLog.e("CenterPlusMainActivity", sbB2.toString(), th);
            }
            return z6;
        } catch (Throwable th2) {
            BLog.e("CenterPlusMainActivity", o.a(i7, "ensureFeatureActivatedIfInstalled failed to query install state, routeTabIndex=", ", bundle=", cVar.f105219a), th2);
            return false;
        }
    }

    public static c S6(int i7) {
        return i7 != 0 ? (i7 == 5 || i7 == 2 || i7 == 3) ? new c("upper", "upper") : null : new c("livestream", "streaming");
    }

    public static int X6(int i7, List list) {
        String strE;
        if (list.isEmpty()) {
            return i7;
        }
        if (i7 == 0) {
            Companion.getClass();
            strE = a.e();
        } else if (i7 == 1) {
            Companion.getClass();
            strE = a.c();
        } else if (i7 == 2) {
            Companion.getClass();
            strE = a.b();
        } else if (i7 == 3) {
            Companion.getClass();
            strE = a.f();
        } else if (i7 == 4) {
            Companion.getClass();
            strE = a.d();
        } else if (i7 != 5) {
            Companion.getClass();
            strE = a.c();
        } else if (zw0.b.g()) {
            Companion.getClass();
            strE = a.a();
        } else {
            Companion.getClass();
            String str = CenterPlusStatisticsHelper.f105195a;
            strE = zw0.b.l();
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            if (Intrinsics.areEqual(((fw0.d) it.next()).f119643a, strE)) {
                break;
            }
            i8++;
        }
        if (i8 > -1) {
            return i8;
        }
        Iterator it2 = list.iterator();
        int i9 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i9 = -1;
                break;
            }
            String str2 = ((fw0.d) it2.next()).f119643a;
            Companion.getClass();
            if (Intrinsics.areEqual(str2, a.c())) {
                break;
            }
            i9++;
        }
        if (i9 > -1) {
            return i9;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int Y6(int r3, java.util.List r4) {
        /*
            r0 = r4
            boolean r0 = r0.isEmpty()
            r7 = r0
            r0 = 1
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 != 0) goto Lb4
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 < 0) goto Lb4
            r0 = r4
            int r0 = r0.size()
            r1 = r3
            if (r0 > r1) goto L26
            r0 = r6
            r5 = r0
            goto Lb4
        L26:
            r0 = r4
            r1 = r3
            java.lang.Object r0 = r0.get(r1)
            fw0.d r0 = (fw0.d) r0
            java.lang.String r0 = r0.f119643a
            r8 = r0
            r0 = r8
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3f
            r0 = 1
            return r0
        L3f:
            com.bilibili.studio.centerplus.ui.CenterPlusMainActivity$a r0 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.Companion
            java.lang.Class r0 = r0.getClass()
            r0 = r8
            java.lang.String r1 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.a.e()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L56
            r0 = 0
            r5 = r0
            goto Lb4
        L56:
            r0 = r8
            java.lang.String r1 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.a.c()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L66
            r0 = r6
            r5 = r0
            goto Lb4
        L66:
            r0 = r8
            java.lang.String r1 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.a.b()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L76
            r0 = 2
            r5 = r0
            goto Lb4
        L76:
            r0 = r8
            java.lang.String r1 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.a.f()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L86
            r0 = 3
            r5 = r0
            goto Lb4
        L86:
            r0 = r8
            java.lang.String r1 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.a.d()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L96
            r0 = 4
            r5 = r0
            goto Lb4
        L96:
            java.lang.String r0 = com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.f105195a
            r4 = r0
            r0 = r8
            java.lang.String r1 = zw0.b.l()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto Lb2
            r0 = r6
            r5 = r0
            r0 = r8
            java.lang.String r1 = com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.a.a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Lb4
        Lb2:
            r0 = 5
            r5 = r0
        Lb4:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.Y6(int, java.util.List):int");
    }

    public static final void access$initTabLayoutEvent(CenterPlusMainActivity centerPlusMainActivity, TabEvent tabEvent, fw0.d dVar) {
        centerPlusMainActivity.getClass();
        if (dVar.f119647e || dVar.f119648f) {
            TabEvent tabEvent2 = TabEvent.CLICK;
            String str = dVar.f119643a;
            if (tabEvent != tabEvent2) {
                if (tabEvent == TabEvent.SHOW) {
                    String str2 = dVar.f119644b;
                    HashMap mapC = O4.b.c("tab_name", str);
                    mapC.put(TextSource.CFG_CONTENT, str2 != null ? str2.length() == 0 ? "0" : str2 : "0");
                    Neurons.reportExposure$default(false, "creation.bottom-tab.tab-bubble.0.show", mapC, (List) null, 8, (Object) null);
                    return;
                }
                return;
            }
            long j7 = dVar.f119645c;
            if (com.bilibili.studio.centerplus.tabbubble.a.f105201b == null) {
                com.bilibili.studio.centerplus.tabbubble.a.f105201b = new ArrayList();
            }
            List<Long> list = com.bilibili.studio.centerplus.tabbubble.a.f105201b;
            if (list != null) {
                list.add(Long.valueOf(j7));
            }
            List<Long> list2 = com.bilibili.studio.centerplus.tabbubble.a.f105201b;
            BiliGlobalPreferenceHelper.getInstance(centerPlusMainActivity).setString("KEY_EXPIRE_BUBBLE", list2 != null ? CollectionsKt.p(list2, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62) : null);
            String str3 = dVar.f119644b;
            HashMap mapC2 = O4.b.c("tab_name", str);
            mapC2.put(TextSource.CFG_CONTENT, str3 != null ? str3.length() == 0 ? "0" : str3 : "0");
            Neurons.reportClick(false, "creation.bottom-tab.tab-bubble.0.click", mapC2);
        }
    }

    public final C2866a Q6() {
        return (C2866a) this.f105204D.b(this, f105202S[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.fragment.app.Fragment R6() {
        /*
            r3 = this;
            r0 = r3
            java.util.HashMap<java.lang.Integer, androidx.fragment.app.Fragment> r0 = r0.f105206F
            r1 = r3
            int r1 = r1.f105207G
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            boolean r0 = r0.isDetached()
            if (r0 != 0) goto L26
            r0 = r5
            r4 = r0
            r0 = r5
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L28
        L26:
            r0 = 0
            r4 = r0
        L28:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.R6():androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.fragment.app.Fragment T6(int r11, android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.CenterPlusMainActivity.T6(int, android.content.Context):androidx.fragment.app.Fragment");
    }

    public final Fragment U6(Context context, RouteRequest routeRequest) {
        BLog.dfmt("CenterPlusMainActivity", "getFragmentByRouteRequest...context=" + context + ", request=" + (routeRequest != null ? routeRequest.getPureUri() : null), new Object[0]);
        if (context == null || routeRequest == null) {
            return null;
        }
        Target targetFindRoute = RouteConstKt.findRoute(BLRouter.INSTANCE, routeRequest);
        BLog.dfmt("CenterPlusMainActivity", "getFragmentByRouteRequest...target=" + targetFindRoute, new Object[0]);
        if (targetFindRoute == null) {
            BLog.w("CenterPlusMainActivity", "getFragmentByRouteRequest target missing, request=" + routeRequest.getPureUri());
        } else {
            BLog.i("CenterPlusMainActivity", "getFragmentByRouteRequest target hit, request=" + routeRequest.getPureUri() + ", clazz=" + targetFindRoute.getClazz().getName());
        }
        if (targetFindRoute == null) {
            return null;
        }
        try {
            Fragment fragmentInstantiate = getSupportFragmentManager().getFragmentFactory().instantiate(context.getClassLoader(), targetFindRoute.getClazz().getName());
            fragmentInstantiate.setArguments(targetFindRoute.getArgs());
            return fragmentInstantiate;
        } catch (Exception e7) {
            BLog.wfmt("CenterPlusMainActivity", O4.d.a("getFragmentByRouteRequest...e=", e7.fillInStackTrace()), new Object[0]);
            return null;
        }
    }

    public final CenterPlusViewModel V6() {
        return (CenterPlusViewModel) this.f105211K.getValue();
    }

    public final List<fw0.d> a7() {
        return V6().getTabNameArray(this.f105208H);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [fw0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [fw0.j] */
    public final void b7(int i7, boolean z6, boolean z7) {
        int i8;
        int iWidth;
        C2866a c2866aQ6 = Q6();
        if (z7) {
            c2866aQ6.f23732e.setVisibility(0);
        }
        List<fw0.d> listA7 = a7();
        final WheelTabLayout wheelTabLayout = c2866aQ6.f23733f;
        wheelTabLayout.setMTabEvent(new CenterPlusMainActivity$initTabs$1$1$1(this));
        if (!z6) {
            i7 = X6(i7, CollectionsKt.toList(listA7));
        }
        fw0.d[] dVarArr = (fw0.d[]) listA7.toArray(new fw0.d[0]);
        wheelTabLayout.f105322b.clear();
        wheelTabLayout.f105321a.removeAllViews();
        wheelTabLayout.f105322b.clear();
        wheelTabLayout.f105323c.clear();
        wheelTabLayout.f105324d.clear();
        int length = dVarArr.length;
        int iA = 0;
        int i9 = 0;
        while (iA < length) {
            fw0.d dVar = dVarArr[iA];
            boolean z8 = true;
            if (i9 != dVarArr.length - 1) {
                z8 = false;
            }
            Paint paint = new Paint();
            int i10 = WheelTabLayout.f105320s;
            paint.setTextSize(i10);
            Rect rect = new Rect();
            String str = dVar.f119643a;
            paint.getTextBounds(str, 0, str.length(), rect);
            if (z8) {
                i8 = i10 * 3;
                iWidth = rect.width();
            } else {
                i8 = i10 * 2;
                iWidth = rect.width();
            }
            int i11 = iWidth + i8;
            Context context = wheelTabLayout.getContext();
            ?? obj = new Object();
            obj.f119653a = dVar;
            View viewInflate = LayoutInflater.from(context).inflate(2131498282, (ViewGroup) null, false);
            obj.f119654b = viewInflate;
            TextView textView = (TextView) viewInflate.findViewById(2131299712);
            obj.f119655c = textView;
            obj.f119656d = viewInflate.findViewById(2131299709);
            obj.f119657e = (TextView) viewInflate.findViewById(2131299710);
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(i11, -1));
            textView.setOnClickListener(new k((Object) obj, 2));
            obj.a();
            final int i12 = i9;
            obj.f119658f = new Function0(wheelTabLayout, i12) { // from class: fw0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final WheelTabLayout f119662a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f119663b;

                {
                    this.f119662a = wheelTabLayout;
                    this.f119663b = i12;
                }

                public final Object invoke() {
                    Unit unit;
                    WheelTabLayout wheelTabLayout2 = this.f119662a;
                    if (wheelTabLayout2.f105335p) {
                        wheelTabLayout2.h = false;
                        wheelTabLayout2.b(this.f119663b, 50L);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            };
            wheelTabLayout.addOnAttachStateChangeListener(new fw0.k(wheelTabLayout, dVar));
            wheelTabLayout.f105321a.addView(viewInflate);
            wheelTabLayout.f105322b.add((fw0.g) obj);
            wheelTabLayout.f105323c.add(Integer.valueOf(i11));
            iA = F1.b.a(i11, wheelTabLayout.f105324d, iA, 1);
            i9++;
        }
        if (i7 >= 0) {
            wheelTabLayout.f105329j = i7;
        }
        wheelTabLayout.post(new RV.f(wheelTabLayout, 1));
        wheelTabLayout.setOnItemSelectPreListener(new com.bilibili.bililive.room.ui.roomv3.tab.interaction.j(this, 2));
        wheelTabLayout.setScrollListener(new com.bilibili.bililive.room.ui.roomv3.tab.interaction.k(c2866aQ6, 1));
    }

    public final void c7(String str) {
        new AlertDialog.Builder(this).setMessage(str).setNegativeButton("确定", new DialogInterface.OnClickListener(this) { // from class: com.bilibili.studio.centerplus.ui.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CenterPlusMainActivity f105277a;

            {
                this.f105277a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                CenterPlusMainActivity centerPlusMainActivity = this.f105277a;
                CenterPlusMainActivity.a aVar = CenterPlusMainActivity.Companion;
                dialogInterface.dismiss();
                centerPlusMainActivity.finish();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: com.bilibili.studio.centerplus.ui.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CenterPlusMainActivity f105229a;

            {
                this.f105229a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CenterPlusMainActivity centerPlusMainActivity = this.f105229a;
                CenterPlusMainActivity.a aVar = CenterPlusMainActivity.Companion;
                centerPlusMainActivity.finish();
            }
        }).create().show();
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusContainer
    public void clearOtherTabCache() {
        BLog.dfmt("CenterPlusMainActivity", "clearOtherTabCache", new Object[0]);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f105206F.keySet()) {
            int i7 = this.f105207G;
            if (num == null || num.intValue() != i7) {
                Fragment fragment = this.f105206F.get(num);
                if (fragment != null) {
                    fragmentTransactionBeginTransaction.remove(fragment);
                }
                arrayList.add(num);
            }
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        BLog.vfmt("CenterPlusMainActivity", "clearOtherTabCache...removeList=" + arrayList, new Object[0]);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f105206F.put(Integer.valueOf(((Number) it.next()).intValue()), null);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        ActivityResultCaller activityResultCallerR6 = R6();
        if ((activityResultCallerR6 instanceof ICenterPlusTab) && ((ICenterPlusTab) activityResultCallerR6).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.Fragment, com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment, com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment] */
    @Override // android.app.Activity
    public void finish() {
        ICenterPlusTab iCenterPlusTabZf;
        BLog.ifmt("CenterPlusMainActivity", "finish", new Object[0]);
        Lazy lazy = com.bilibili.studio.comm.manager.d.f105389a;
        if (this.f105216P) {
            String str = CenterPlusStatisticsHelper.f105195a;
            CenterPlusViewModel.a aVar = CenterPlusViewModel.Companion;
            int i7 = this.f105208H;
            aVar.getClass();
            CenterPlusStatisticsHelper.f(CenterPlusViewModel.a.a(i7).getValue(), true);
        }
        try {
            Fragment fragment = this.f105206F.get(Integer.valueOf(X6(1, CollectionsKt.toList(a7()))));
            if ((fragment instanceof TabCaptureFragmentV2) && (iCenterPlusTabZf = ((TabCaptureFragmentV2) fragment).zf()) != null) {
                ?? r02 = (ForwardCaptureFragment) iCenterPlusTabZf;
                BLog.d("ForwardCaptureFragment", "beforeFinish: fragment = " + r02.hashCode());
                r02.release();
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        super.finish();
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusContainer
    @NotNull
    public HashMap<String, Object> getCameraHolder() {
        return this.f105205E;
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Nullable
    public final EventFinishEdit.FinishReason getFinishReason() {
        return this.f105203C;
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public String getMiniPlayerContainerKey() {
        return "capture_page";
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusContainer
    public int getTabBarHeight() {
        return Q6().f23732e.getMeasuredHeight();
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusContainer
    public boolean isCurrentShow(@NotNull ICenterPlusTab iCenterPlusTab) {
        Fragment fragment = this.f105206F.get(Integer.valueOf(this.f105207G));
        BLog.dfmt("CenterPlusMainActivity", "isCurrentShow...tab=" + iCenterPlusTab + ", mCurrentIndex=" + this.f105207G + ", fragment=" + fragment, new Object[0]);
        if (fragment instanceof ICenterPlusTab) {
            return Intrinsics.areEqual(fragment, iCenterPlusTab);
        }
        BLog.vfmt("CenterPlusMainActivity", "isCurrentShow...tab=" + iCenterPlusTab + "...return false", new Object[0]);
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Fragment fragmentR6 = R6();
        if (fragmentR6 != null) {
            fragmentR6.onActivityResult(i7, i8, intent);
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f105207G == 2) {
            Xz0.d.f28458a.getClass();
            Neurons.reportClick(false, "creation.choose-matter.0.quit.click", Xz0.d.e());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        int i9 = this.f105207G;
        int requestedOrientation = getRequestedOrientation();
        StringBuilder sbB = A.b(i7, i8, "onConfigurationChanged w=", ",h=", "，curIndex=");
        sbB.append(i9);
        sbB.append(",");
        sbB.append(requestedOrientation);
        BLog.e("CenterPlusMainActivity", sbB.toString());
        b7(this.f105207G, true, false);
        MainThread.postOnMainThread(new p(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LifecycleObserver, java.lang.Object] */
    @Override // cw0.AbstractActivityC6766c, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Object object;
        if (!PB0.d.a()) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        lB0.a aVarA = lB0.a.a();
        Vv0.a aVar = Vv0.a.a;
        aVarA.getClass();
        lB0.a.c(aVar);
        CopyOnWriteArrayList<i.b> copyOnWriteArrayList = i.f105298a;
        getLifecycle().addObserver(new Object());
        IGVEntranceManager iGVEntranceManager = IGVEntranceManager.f105374a;
        IGVEntranceManager.c();
        Map<String, String> map = ABManager.f105341a;
        ABManager.d(com.bilibili.studio.comm.ab.d.f105366r);
        com.bilibili.studio.editor.question.manager.a.c();
        AlbumQuitDialog.b bVar = AlbumQuitDialog.f105100e;
        bVar.f105104a = false;
        bVar.f105105b = "";
        bVar.f105106c = "";
        bVar.f105107d = "";
        bVar.f105110g = false;
        bVar.f105109f = false;
        bVar.f105108e = 0;
        getLifecycle().addObserver(defpackage.b.f54272a);
        String dataString = getIntent().getDataString();
        String str = dataString;
        if (dataString == null) {
            str = "bilibili://uper/center_plus";
        }
        defpackage.b.f54273b = str;
        setContentView(2131493724);
        this.f105217Q = PB0.d.a();
        getWindow().setFlags(1024, 1024);
        getWindow().setSoftInputMode(48);
        NotchCompat.blockDisplayCutout(getWindow());
        Intent intent = getIntent();
        if (intent != null) {
            String dataString2 = intent.getDataString();
            if (dataString2 == null) {
                dataString2 = "bilibili://uper/center_plus";
            }
            this.f105210J = dataString2;
            parseJumpParams();
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString("center_plus_type") : null;
            String string2 = extras != null ? extras.getString(CaptureSchema.POST_CONFIG) : null;
            String firstEntrance = "";
            if (string2 != null) {
                try {
                    object = JSON.parseObject(string2, (Class<Object>) CaptureSchema.PostConfig.class);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    String message = e7.getMessage();
                    String str2 = message;
                    if (message == null) {
                        str2 = "";
                    }
                    com.bilibili.adcommon.utils.i.a("Method: parseObject, JSON format is error! JsonStr:", string2, ", e:", str2, "ReportDataCompat");
                    object = null;
                }
                CaptureSchema.PostConfig postConfig = (CaptureSchema.PostConfig) object;
                firstEntrance = "";
                if (postConfig != null) {
                    firstEntrance = postConfig.getFirstEntrance();
                    if (firstEntrance == null) {
                        firstEntrance = "";
                    }
                }
            }
            String string3 = extras != null ? extras.getString(CaptureSchema.JUMP_PARAMS_RELATION_FROM) : null;
            if (TextUtils.isEmpty(string)) {
                if (TextUtils.isEmpty(firstEntrance)) {
                    firstEntrance = "外链跳转加号";
                }
                if (TextUtils.isEmpty(string3)) {
                    string3 = "external_link_centerplus";
                }
                Xz0.g.e(this, firstEntrance, string3);
            } else {
                if (TextUtils.isEmpty(extras != null ? extras.getString("track_id") : null)) {
                    if (TextUtils.isEmpty(firstEntrance)) {
                        firstEntrance = "加号";
                    }
                    if (TextUtils.isEmpty(string3)) {
                        string3 = "center_plus";
                    }
                    Xz0.g.e(this, firstEntrance, string3);
                }
            }
            j.c("first_entrance", "加号");
            String str3 = this.f105210J;
            BLog.i("ReportDataTemp", "saveEntrance...mJumpParams = " + str3);
            String strB = l.b(str3);
            if (strB != null) {
                j.c("first_entrance", strB);
            }
            Uz0.g.f25080c.clear();
            com.bilibili.studio.editor.smarttitle.c.f108226a.g(false);
        }
        int i7 = bundle != null ? bundle.getInt("instance_state_current_tab_index", -1) : -1;
        this.f105207G = i7;
        if (i7 > -1) {
            this.f105208H = i7;
        }
        String str4 = CenterPlusStatisticsHelper.f105195a;
        String str5 = this.f105209I;
        int i8 = this.f105208H;
        HashMap mapC = O4.b.c(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str5);
        mapC.put("to_page", CenterPlusStatisticsHelper.b(i8));
        mapC.put("track_id", Xz0.g.d());
        Neurons.trackT(false, "bilibili-creation.reader.entrance-count.tracker", mapC, 1, new O1(9));
        CenterPlusStatisticsHelper.g(this.f105208H, "center_plus_show", null, null, null, this.f105210J, null, 92);
        lB0.a aVarA2 = lB0.a.a();
        uC0.b bVar2 = new uC0.b();
        aVarA2.getClass();
        lB0.a.c(bVar2);
        int i9 = this.f105208H;
        C2866a c2866aQ6 = Q6();
        BLog.i("CenterPlusMainActivity", androidx.customview.widget.b.b(i9, "preInit start, tabIndex=", ", jumpParams=", this.f105210J, ", googlePlay=false"));
        P6(i9, S6(i9));
        if (i9 == 2) {
            AlbumQuitDialog.f105100e.f105109f = true;
        }
        Q6().f23731d.setShowClose(true).setOnLoadingStateChange(new Za.b(this, 2));
        if (Pw0.a.a(this)) {
            Lazy lazy = zw0.b.f130950a;
            boolean z6 = DeviceDecision.INSTANCE.getBoolean("uper.enable_center_plus_show_opt", true);
            if (!z6) {
                CenterPlusStatisticsHelper.g(this.f105208H, "center_plus_show_2", null, null, null, this.f105210J, null, 92);
            }
            if (BiliAccounts.get(this).isLogin()) {
                if (z6) {
                    CenterPlusStatisticsHelper.g(this.f105208H, "center_plus_show_2", null, null, null, this.f105210J, null, 92);
                }
                V6().getPreInitLiveData().observe(this, new e(new com.bilibili.studio.centerplus.ui.c(0, this, c2866aQ6)));
                V6().getTabLiveData().observe(this, new e(new I90.j(this, 3)));
                CenterPlusStatisticsHelper.p("loadingResourceStartTime");
                c2866aQ6.f23731d.onLoading();
                this.f105216P = true;
                V6().preInit(i9);
            } else {
                c7("请先登录");
            }
        } else {
            c7("网络连接异常，请检查网络");
        }
        BiliTemplateEngineManager biliTemplateEngineManager = new BiliTemplateEngineManager(6);
        this.f105218R = biliTemplateEngineManager;
        biliTemplateEngineManager.i(null);
        Lazy<com.bilibili.studio.editor.moudle.intelligence.vm.e> lazy2 = com.bilibili.studio.editor.moudle.intelligence.vm.e.f107608g;
        e.a.a().d(this, this.f105218R);
        C6598f.f109575c = true;
        C6598f.f109573a = System.currentTimeMillis();
        C6598f.f109574b = System.currentTimeMillis();
        Lazy lazy3 = zw0.b.f130950a;
        if (Intrinsics.areEqual(Contract.get$default(ConfigManager.Companion.ab(), "uper.enable_get_profiles", (Object) null, 2, (Object) null), Boolean.TRUE)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"开始拉 x/app/v1/user/profiles接口"});
            ((InterfaceC5167a) ServiceGenerator.createService(InterfaceC5167a.class)).getUserProfiles().enqueue(new t(jCurrentTimeMillis));
        }
        Lazy<C8554a> lazy4 = C8554a.f127050c;
        C8554a.C1351a.a().a();
        Lazy<C8488a> lazy5 = C8488a.f126360e;
        C8488a.C1345a.a().a();
        V6().initInBackground();
        V6().requestTabBubble(this);
        com.bilibili.studio.centerplus.util.b.a(this);
        UploadLineSpeedDetect.c();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(V6()), Dispatchers.getIO().plus(new AbstractCoroutineContextElement(CoroutineExceptionHandler.Key)), (CoroutineStart) null, new AnonymousClass2(this, null), 2, (Object) null);
        Map<String, com.bilibili.studio.centerplus.util.a> map2 = com.bilibili.studio.centerplus.util.a.f105281c;
        a.C1184a.a("Key_Center_Plus").f105282a = registerForActivityResult(new ActivityResultContract(), new Object());
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f105205E.clear();
        this.f105206F.clear();
        a.a aVar = this.f105213M;
        if (aVar != null) {
            aVar.a();
        }
        a.a aVar2 = this.f105214N;
        if (aVar2 != null) {
            aVar2.a();
        }
        BiliTemplateEngineManager biliTemplateEngineManager = this.f105218R;
        if (biliTemplateEngineManager != null) {
            biliTemplateEngineManager.k();
        }
        this.f105218R = null;
        if (EntryPointKt.getMemleakOptEnable()) {
            Lazy<com.bilibili.studio.editor.moudle.intelligence.vm.e> lazy = com.bilibili.studio.editor.moudle.intelligence.vm.e.f107608g;
            e.a.a().e();
        }
        Xz0.g.f28463b = "";
        C6598f.f109575c = false;
        C6598f.f109573a = System.currentTimeMillis();
        C6598f.f109574b = System.currentTimeMillis();
        Lazy<C8488a> lazy2 = C8488a.f126360e;
        C8488a.C1345a.a().b();
        com.bilibili.studio.editor.timeline.k kVar = k.a.f108315a;
        kVar.getClass();
        eA0.c.b(kVar, "destroy start");
        synchronized (kVar.c()) {
            try {
                Iterator<Map.Entry<UpperEngineScene, com.bilibili.studio.editor.timeline.i>> it = kVar.c().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<UpperEngineScene, com.bilibili.studio.editor.timeline.i> next = it.next();
                    com.bilibili.studio.editor.timeline.i value = next.getValue();
                    if (value != null) {
                        value.f(next.getKey().isAuxiliaryContext());
                    }
                    it.remove();
                    eA0.c.b(kVar, next.getKey().getInfo() + " destroy");
                }
            } catch (Exception e7) {
                eA0.c.a(kVar, "destroy exception:" + e7);
            }
            Unit unit = Unit.INSTANCE;
        }
        kVar.f108313a = false;
        eA0.c.b(kVar, "destroy end");
        Map<String, com.bilibili.studio.centerplus.util.a> map = com.bilibili.studio.centerplus.util.a.f105281c;
        com.bilibili.studio.centerplus.util.a aVarA = a.C1184a.a("Key_Center_Plus");
        aVarA.f105282a = null;
        aVarA.f105283b = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent) {
        ActivityResultCaller activityResultCallerR6 = R6();
        if ((activityResultCallerR6 instanceof ICenterPlusTab) && ((ICenterPlusTab) activityResultCallerR6).onKeyDown(i7, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        super.onNewIntent(intent);
        ActivityResultCaller activityResultCallerR6 = R6();
        if ((activityResultCallerR6 instanceof ICenterPlusTab) && ((ICenterPlusTab) activityResultCallerR6).needToReOpenActivity(intent)) {
            finish();
            String dataString = intent.getDataString();
            String str = dataString;
            if (dataString == null) {
                str = "";
            }
            BLRouter.routeTo(ec.c.a(str), BiliContext.application());
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        if (PermissionsChecker.onPermissionMultiResult(i7, strArr, iArr)) {
            PermissionRequestUtils.onRequestPermissionsResult(this, i7, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i7, strArr, iArr);
        }
        Fragment fragmentR6 = R6();
        if (fragmentR6 != null) {
            fragmentR6.onRequestPermissionsResult(i7, strArr, iArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("instance_state_current_tab_index", V6().getRoutIndexByRealIndex(this.f105207G));
    }

    @Override // cw0.AbstractActivityC6766c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        int i7;
        int identifier;
        super.onWindowFocusChanged(z6);
        if (this.f105215O) {
            if (!isFinishing() && !isDestroyed()) {
                Rect rect = new Rect();
                getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                BLog.e("CenterPlusMainActivitywindow", rect.toString());
                try {
                    identifier = getResources().getIdentifier("status_bar_height", "dimen", Constant.SDK_OS);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    BLog.e("CenterPlusMainActivitywindow", "get status_bar height failed : " + e7);
                }
                int dimensionPixelSize = identifier > 0 ? getResources().getDimensionPixelSize(identifier) : -1;
                T7.a.a(dimensionPixelSize, "statusBarHeight = ", "CenterPlusMainActivitywindow");
                if (dimensionPixelSize > 0 && (i7 = rect.top) != dimensionPixelSize) {
                    PB0.e.a(Q6().f23729b, Integer.valueOf(dimensionPixelSize - i7), null, 26);
                }
            }
            this.f105215O = false;
        }
    }

    public final void parseJumpParams() {
        boolean z6;
        if (TextUtils.isEmpty(this.f105210J)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Uri uri = Uri.parse(this.f105210J);
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            z6 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (Intrinsics.areEqual(next, CaptureSchema.JUMP_PARAMS_RELATION_FROM)) {
                if (queryParameter == null) {
                    queryParameter = "center_plus";
                }
                this.f105209I = queryParameter;
                linkedHashMap.put(next, queryParameter);
            } else if (Intrinsics.areEqual(next, "tab_index")) {
                int i7 = 1;
                if (queryParameter != null) {
                    try {
                        i7 = Integer.parseInt(queryParameter);
                    } catch (Exception e7) {
                        BLog.wfmt("CenterPlusMainActivity", O4.d.a("parseJumpParams...e = ", e7.fillInStackTrace()), new Object[0]);
                        i7 = 1;
                    }
                }
                this.f105208H = i7;
                linkedHashMap.put(next, String.valueOf(i7));
            } else {
                linkedHashMap.put(next, queryParameter != null ? queryParameter : "");
            }
        }
        if (!linkedHashMap.containsKey(CaptureSchema.JUMP_PARAMS_RELATION_FROM)) {
            linkedHashMap.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, "center_plus");
        }
        if (linkedHashMap.containsKey(CaptureSchema.TOPIC_ID)) {
            String str = (String) linkedHashMap.get(CaptureSchema.TOPIC_ID);
            Xz0.g.f28463b = str != null ? str : "";
        }
        BLog.vfmt("CenterPlusMainActivity", "parseJumpParams...queryParams = " + linkedHashMap, new Object[0]);
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        sb.append(scheme);
        sb.append("://");
        sb.append(host);
        sb.append("/");
        sb.append(path);
        for (String str2 : linkedHashMap.keySet()) {
            B0.b.b(z6 ? "?" : "&", str2, "=", sb);
            sb.append((String) linkedHashMap.get(str2));
            z6 = false;
        }
        String string = sb.toString();
        this.f105210J = string;
        BLog.ifmt("CenterPlusMainActivity", C4496a.a("parseJumpParams...mJumpParams = ", string), new Object[0]);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusContainer
    public void setTabBarVisible(boolean z6, boolean z7) {
        C2866a c2866aQ6 = Q6();
        c2866aQ6.f23733f.setMEnableTabClick(z6);
        if (z6 && c2866aQ6.f23732e.getVisibility() != 0) {
            c2866aQ6.f23732e.setVisibility(0);
            if (z7) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200L);
                c2866aQ6.f23732e.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        if (z6 || c2866aQ6.f23732e.getVisibility() != 0) {
            return;
        }
        if (z7) {
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(200L);
            c2866aQ6.f23732e.startAnimation(alphaAnimation2);
        }
        c2866aQ6.f23732e.setVisibility(8);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusContainer
    public void switchTab(int i7, @Nullable Bundle bundle) {
        Set<String> setKeySet;
        V.a(i7, "switchTab request, tabIndex=", ", extrasKeys=", (bundle == null || (setKeySet = bundle.keySet()) == null) ? null : CollectionsKt.p(setKeySet, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) null, 63), "CenterPlusMainActivity");
        P6(i7, S6(i7));
        this.f105212L = bundle;
        WheelTabLayout wheelTabLayout = Q6().f23733f;
        int iX6 = X6(i7, a7());
        int i8 = WheelTabLayout.f105320s;
        wheelTabLayout.b(iX6, 50L);
    }
}

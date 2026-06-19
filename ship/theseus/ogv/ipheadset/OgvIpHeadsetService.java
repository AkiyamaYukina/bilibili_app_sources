package com.bilibili.ship.theseus.ogv.ipheadset;

import Xg0.InterfaceC3112a;
import Xg0.InterfaceC3113b;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.bapis.bilibili.app.viewunite.pgcanymodel.Earphone;
import com.bapis.bilibili.app.viewunite.pgcanymodel.EarphoneConf;
import com.bilibili.app.gemini.share.p;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.community.b;
import com.bilibili.community.like.LikeRepository;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mall.IpDeviceInfo;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.misc.OgvAudioController;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import uq0.InterfaceC8754b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ipheadset/OgvIpHeadsetService.class */
@StabilityInferred(parameters = 0)
public final class OgvIpHeadsetService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f93936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f93937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final EarphoneConf f93938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f93939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f93940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f93941g;

    @NotNull
    public final KingPositionService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C8043a f93942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PageReportService f93943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final InterfaceC3113b f93944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f93945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f93946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public IpDeviceInfo f93947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy<OgvAudioController> f93948o = LazyKt.lazy(new p(this, 3));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final a f93949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final OgvIpHeadsetService$mDeviceEventListener$1 f93950q;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ipheadset.OgvIpHeadsetService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ipheadset/OgvIpHeadsetService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvIpHeadsetService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvIpHeadsetService ogvIpHeadsetService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvIpHeadsetService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                OgvIpHeadsetService ogvIpHeadsetService = this.this$0;
                FunctionWidgetToken functionWidgetToken = ogvIpHeadsetService.f93946m;
                if (functionWidgetToken != null) {
                    ogvIpHeadsetService.f93939e.hideWidget(functionWidgetToken);
                }
                ogvIpHeadsetService.f93946m = null;
                InterfaceC3113b interfaceC3113b = ogvIpHeadsetService.f93944k;
                if (interfaceC3113b != null) {
                    interfaceC3113b.d(ogvIpHeadsetService.f93950q);
                }
                ogvIpHeadsetService.f93936b.removeHeadsetEventObserver(ogvIpHeadsetService.f93949p);
                Lazy<OgvAudioController> lazy = ogvIpHeadsetService.f93948o;
                if (lazy.isInitialized()) {
                    OgvAudioController ogvAudioController = (OgvAudioController) lazy.getValue();
                    CoroutineScopeKt.cancel$default(ogvAudioController.f94033d, (CancellationException) null, 1, (Object) null);
                    ogvAudioController.f94031b.autoPause();
                    ogvAudioController.f94031b.release();
                    ogvAudioController.f94032c.clear();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ipheadset/OgvIpHeadsetService$a.class */
    public static final class a implements InterfaceC8754b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvIpHeadsetService f93951a;

        public a(OgvIpHeadsetService ogvIpHeadsetService) {
            this.f93951a = ogvIpHeadsetService;
        }

        @Override // uq0.InterfaceC8754b
        public final void d() {
            OgvIpHeadsetService ogvIpHeadsetService = this.f93951a;
            if (ogvIpHeadsetService.f93945l) {
                OgvIpHeadsetService.c(ogvIpHeadsetService);
            }
        }

        @Override // uq0.InterfaceC8754b
        public final void e() {
            OgvIpHeadsetService ogvIpHeadsetService = this.f93951a;
            if (ogvIpHeadsetService.f93945l) {
                OgvIpHeadsetService.c(ogvIpHeadsetService);
            }
        }

        @Override // uq0.InterfaceC8754b
        public final void pause() {
            OgvIpHeadsetService ogvIpHeadsetService = this.f93951a;
            if (!ogvIpHeadsetService.f93945l || ogvIpHeadsetService.f93937c.f91107a.a()) {
                return;
            }
            OgvIpHeadsetService.a(ogvIpHeadsetService, true);
        }

        @Override // uq0.InterfaceC8754b
        public final void resume() {
            OgvIpHeadsetService ogvIpHeadsetService = this.f93951a;
            if (ogvIpHeadsetService.f93945l && ogvIpHeadsetService.f93937c.f91107a.a()) {
                OgvIpHeadsetService.a(ogvIpHeadsetService, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [Xg0.a, com.bilibili.ship.theseus.ogv.ipheadset.OgvIpHeadsetService$mDeviceEventListener$1] */
    @Inject
    public OgvIpHeadsetService(@NotNull CoroutineScope coroutineScope, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull h hVar, @Nullable EarphoneConf earphoneConf, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull Context context, @NotNull OgvEpisode ogvEpisode, @NotNull KingPositionService kingPositionService, @NotNull C8043a c8043a, @NotNull PageReportService pageReportService) {
        this.f93935a = coroutineScope;
        this.f93936b = playerHeadsetService;
        this.f93937c = hVar;
        this.f93938d = earphoneConf;
        this.f93939e = absFunctionWidgetService;
        this.f93940f = context;
        this.f93941g = ogvEpisode;
        this.h = kingPositionService;
        this.f93942i = c8043a;
        this.f93943j = pageReportService;
        this.f93945l = true;
        a aVar = new a(this);
        this.f93949p = aVar;
        ?? r02 = new InterfaceC3112a(this) { // from class: com.bilibili.ship.theseus.ogv.ipheadset.OgvIpHeadsetService$mDeviceEventListener$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvIpHeadsetService f93952a;

            {
                this.f93952a = this;
            }

            @Override // Xg0.InterfaceC3112a
            public final void a() {
                OgvIpHeadsetService ogvIpHeadsetService = this.f93952a;
                InterfaceC3113b interfaceC3113b = ogvIpHeadsetService.f93944k;
                ogvIpHeadsetService.f93945l = interfaceC3113b != null ? interfaceC3113b.a() : false;
                InterfaceC3113b interfaceC3113b2 = ogvIpHeadsetService.f93944k;
                String deviceId = null;
                IpDeviceInfo ipDeviceInfoB = interfaceC3113b2 != null ? interfaceC3113b2.b() : null;
                ogvIpHeadsetService.f93947n = ipDeviceInfoB;
                if (ipDeviceInfoB != null) {
                    deviceId = ipDeviceInfoB.getDeviceId();
                }
                String strB = OgvIpHeadsetService.b(ogvIpHeadsetService, deviceId);
                if (StringsKt.isBlank(strB)) {
                    return;
                }
                OgvAudioController ogvAudioController = (OgvAudioController) ogvIpHeadsetService.f93948o.getValue();
                if (ogvAudioController.f94032c.containsKey(strB)) {
                    return;
                }
                ogvAudioController.f94032c.put(strB, new OgvAudioController.a(ogvAudioController, strB, ogvAudioController.f94034e));
            }

            @Override // Xg0.InterfaceC3112a
            public final void b() {
                OgvIpHeadsetService ogvIpHeadsetService = this.f93952a;
                ogvIpHeadsetService.f93945l = false;
                ogvIpHeadsetService.f93947n = null;
            }

            @Override // Xg0.InterfaceC3112a
            public void onLikeEvent(Function0<Unit> function0) {
                OgvIpHeadsetService ogvIpHeadsetService = this.f93952a;
                if (ogvIpHeadsetService.f93945l) {
                    Context context2 = ogvIpHeadsetService.f93940f;
                    if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                        ToastHelper.showToast(context2, context2.getString(2131847002), 3, 17);
                        return;
                    }
                    long jA = ogvIpHeadsetService.f93941g.a();
                    LikeRepository.a.getClass();
                    Boolean bool = (Boolean) LikeRepository.c.c(b.a(jA));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    HashMap map = new HashMap();
                    map.put(GameCardButton.extraAvid, String.valueOf(jA));
                    map.put("like_status", zBooleanValue ? "2" : "1");
                    PageReportService.g(ogvIpHeadsetService.f93943j, "player.player.headset-instruction.like.click", map, 4);
                    ogvIpHeadsetService.d();
                    if (zBooleanValue) {
                        return;
                    }
                    BuildersKt.launch$default(ogvIpHeadsetService.f93935a, (CoroutineContext) null, (CoroutineStart) null, new OgvIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1(ogvIpHeadsetService, context2, function0, null), 3, (Object) null);
                }
            }
        };
        this.f93950q = r02;
        InterfaceC3113b interfaceC3113b = (InterfaceC3113b) BLRouter.INSTANCE.get(InterfaceC3113b.class, "default");
        this.f93944k = interfaceC3113b;
        if (interfaceC3113b != 0) {
            interfaceC3113b.c(r02);
        }
        boolean zA = false;
        if (Hj0.a.a("ugc_bili_ip_func_open", true)) {
            zA = false;
            if (interfaceC3113b != 0) {
                zA = interfaceC3113b.a();
            }
        }
        this.f93945l = zA;
        this.f93947n = interfaceC3113b != 0 ? interfaceC3113b.b() : null;
        playerHeadsetService.addHeadsetEventObserver(aVar);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(OgvIpHeadsetService ogvIpHeadsetService, boolean z6) {
        ogvIpHeadsetService.getClass();
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
        layoutParams.setLayoutType(16);
        layoutParams.setFunctionType(1);
        layoutParams.setExitAnim(-1);
        layoutParams.setEnterAnim(-1);
        layoutParams.touchOutsideDismiss(false);
        layoutParams.touchEnable(false);
        ogvIpHeadsetService.f93946m = ogvIpHeadsetService.f93939e.showWidget(new com.bilibili.ship.theseus.ogv.ipheadset.a(ogvIpHeadsetService.f93940f, z6), layoutParams);
    }

    public static final String b(OgvIpHeadsetService ogvIpHeadsetService, String str) {
        String likeToastVoice;
        Object next;
        EarphoneConf earphoneConf = ogvIpHeadsetService.f93938d;
        if (earphoneConf == null) {
            likeToastVoice = "";
        } else {
            likeToastVoice = "";
            if (str != null) {
                if (str.length() == 0) {
                    likeToastVoice = "";
                } else {
                    Iterator it = earphoneConf.getSpPhonesList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(((Earphone) next).getProductModel(), str)) {
                            break;
                        }
                    }
                    Earphone earphone = (Earphone) next;
                    likeToastVoice = null;
                    if (earphone != null) {
                        likeToastVoice = earphone.getLikeToastVoice();
                    }
                    if (likeToastVoice == null) {
                        likeToastVoice = "";
                    }
                }
            }
        }
        return likeToastVoice;
    }

    public static final void c(OgvIpHeadsetService ogvIpHeadsetService) {
        String switchToastText;
        Object obj;
        IpDeviceInfo ipDeviceInfo = ogvIpHeadsetService.f93947n;
        String deviceId = ipDeviceInfo != null ? ipDeviceInfo.getDeviceId() : null;
        EarphoneConf earphoneConf = ogvIpHeadsetService.f93938d;
        if (earphoneConf == null) {
            switchToastText = null;
        } else {
            switchToastText = null;
            if (deviceId != null) {
                if (deviceId.length() == 0) {
                    switchToastText = null;
                } else {
                    Iterator it = earphoneConf.getSpPhonesList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((Earphone) next).getProductModel(), deviceId)) {
                            obj = next;
                            break;
                        }
                    }
                    Earphone earphone = (Earphone) obj;
                    switchToastText = null;
                    if (earphone != null) {
                        switchToastText = earphone.getSwitchToastText();
                    }
                }
            }
        }
        if (switchToastText != null && switchToastText.length() != 0) {
            ToastHelper.showToast(ogvIpHeadsetService.f93940f, switchToastText, 3, 17);
        }
        ogvIpHeadsetService.d();
    }

    public final void d() {
        Object systemService = ContextCompat.getSystemService(this.f93940f, Vibrator.class);
        if (systemService == null) {
            throw new IllegalArgumentException("Can not find system service for type ".concat(Vibrator.class.getName()).toString());
        }
        Vibrator vibrator = (Vibrator) systemService;
        if (vibrator.hasVibrator()) {
            vibrator.cancel();
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(50L, 1));
            } else {
                vibrator.vibrate(50L);
            }
        }
    }
}

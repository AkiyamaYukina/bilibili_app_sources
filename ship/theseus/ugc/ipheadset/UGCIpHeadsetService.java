package com.bilibili.ship.theseus.ugc.ipheadset;

import Hk.a;
import Xg0.InterfaceC3112a;
import Xg0.InterfaceC3113b;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.alipay.sdk.app.PayTask;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import uq0.InterfaceC8754b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ipheadset/UGCIpHeadsetService.class */
@StabilityInferred(parameters = 0)
public final class UGCIpHeadsetService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f97923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f97924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f97925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f97926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IToastService f97927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f97928g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RelationRepository f97929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final InterfaceC3113b f97930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public FunctionWidgetToken f97932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f97933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UGCIpHeadsetService$mDeviceEventListener$1 f97934n;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ipheadset.UGCIpHeadsetService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ipheadset/UGCIpHeadsetService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UGCIpHeadsetService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ipheadset.UGCIpHeadsetService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ipheadset/UGCIpHeadsetService$1$a.class */
        public static final class a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCIpHeadsetService f97935a;

            public a(UGCIpHeadsetService uGCIpHeadsetService) {
                this.f97935a = uGCIpHeadsetService;
            }

            public final void invoke() {
                UGCIpHeadsetService uGCIpHeadsetService = this.f97935a;
                FunctionWidgetToken functionWidgetToken = uGCIpHeadsetService.f97932l;
                if (functionWidgetToken != null) {
                    uGCIpHeadsetService.f97925d.hideWidget(functionWidgetToken);
                }
                uGCIpHeadsetService.f97932l = null;
                InterfaceC3113b interfaceC3113b = uGCIpHeadsetService.f97930j;
                if (interfaceC3113b != null) {
                    interfaceC3113b.d(uGCIpHeadsetService.f97934n);
                }
                uGCIpHeadsetService.f97923b.removeHeadsetEventObserver(uGCIpHeadsetService.f97933m);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCIpHeadsetService uGCIpHeadsetService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCIpHeadsetService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            j aVar;
            Throwable th;
            j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCIpHeadsetService uGCIpHeadsetService = this.this$0;
                InterfaceC3113b interfaceC3113b = uGCIpHeadsetService.f97930j;
                if (interfaceC3113b != null) {
                    interfaceC3113b.c(uGCIpHeadsetService.f97934n);
                }
                uGCIpHeadsetService.f97923b.addHeadsetEventObserver(uGCIpHeadsetService.f97933m);
                aVar = new a(uGCIpHeadsetService);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jVar = aVar;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j jVar2 = (j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = jVar2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar.invoke();
                    throw th;
                }
            }
            j jVar3 = aVar;
            jVar = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ipheadset/UGCIpHeadsetService$a.class */
    public static final class a implements InterfaceC8754b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCIpHeadsetService f97936a;

        public a(UGCIpHeadsetService uGCIpHeadsetService) {
            this.f97936a = uGCIpHeadsetService;
        }

        @Override // uq0.InterfaceC8754b
        public final void d() {
            UGCIpHeadsetService uGCIpHeadsetService = this.f97936a;
            if (uGCIpHeadsetService.f97931k) {
                UGCIpHeadsetService.b(uGCIpHeadsetService);
            }
        }

        @Override // uq0.InterfaceC8754b
        public final void e() {
            UGCIpHeadsetService uGCIpHeadsetService = this.f97936a;
            if (uGCIpHeadsetService.f97931k) {
                UGCIpHeadsetService.b(uGCIpHeadsetService);
            }
        }

        @Override // uq0.InterfaceC8754b
        public final void pause() {
            UGCIpHeadsetService uGCIpHeadsetService = this.f97936a;
            if (!uGCIpHeadsetService.f97931k || CompoundPlayStateProviderKt.c(uGCIpHeadsetService.f97928g)) {
                return;
            }
            UGCIpHeadsetService.a(uGCIpHeadsetService, true);
        }

        @Override // uq0.InterfaceC8754b
        public final void resume() {
            UGCIpHeadsetService uGCIpHeadsetService = this.f97936a;
            if (uGCIpHeadsetService.f97931k && CompoundPlayStateProviderKt.c(uGCIpHeadsetService.f97928g)) {
                UGCIpHeadsetService.a(uGCIpHeadsetService, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.bilibili.ship.theseus.ugc.ipheadset.UGCIpHeadsetService$mDeviceEventListener$1] */
    @Inject
    public UGCIpHeadsetService(@NotNull CoroutineScope coroutineScope, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull IControlContainerService iControlContainerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull C7893a c7893a, @NotNull IToastService iToastService, @NotNull h hVar, @NotNull Context context, @NotNull RelationRepository relationRepository) {
        this.f97922a = coroutineScope;
        this.f97923b = playerHeadsetService;
        this.f97924c = iControlContainerService;
        this.f97925d = absFunctionWidgetService;
        this.f97926e = c7893a;
        this.f97927f = iToastService;
        this.f97928g = hVar;
        this.h = context;
        this.f97929i = relationRepository;
        InterfaceC3113b interfaceC3113b = (InterfaceC3113b) BLRouter.INSTANCE.get(InterfaceC3113b.class, "default");
        this.f97930j = interfaceC3113b;
        this.f97933m = new a(this);
        this.f97934n = new InterfaceC3112a(this) { // from class: com.bilibili.ship.theseus.ugc.ipheadset.UGCIpHeadsetService$mDeviceEventListener$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCIpHeadsetService f97937a;

            {
                this.f97937a = this;
            }

            @Override // Xg0.InterfaceC3112a
            public final void a() {
                UGCIpHeadsetService uGCIpHeadsetService = this.f97937a;
                InterfaceC3113b interfaceC3113b2 = uGCIpHeadsetService.f97930j;
                uGCIpHeadsetService.f97931k = interfaceC3113b2 != null ? interfaceC3113b2.a() : false;
            }

            @Override // Xg0.InterfaceC3112a
            public final void b() {
                this.f97937a.f97931k = false;
            }

            @Override // Xg0.InterfaceC3112a
            public void onLikeEvent(Function0<Unit> function0) {
                UGCIpHeadsetService uGCIpHeadsetService = this.f97937a;
                if (uGCIpHeadsetService.f97931k) {
                    if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                        String string = uGCIpHeadsetService.h.getString(2131847002);
                        uGCIpHeadsetService.getClass();
                        uGCIpHeadsetService.f97927f.showToast(new PlayerToast.Builder().toastItemType(17).location(33).duration(PayTask.f60018j).setExtraString("extra_title", string).build());
                        return;
                    }
                    boolean zJ = uGCIpHeadsetService.f97929i.j();
                    C7893a.C1318a c1318aC = uGCIpHeadsetService.f97926e.c();
                    if (c1318aC != null) {
                        long j7 = c1318aC.f123395a.f123397a;
                        HashMap map = new HashMap();
                        map.put(GameCardButton.extraAvid, String.valueOf(j7));
                        map.put("like_status", String.valueOf(zJ));
                        Neurons.reportClick(true, "player.player.headset-instruction.like.click", map);
                    }
                    if (zJ) {
                        return;
                    }
                    BuildersKt.launch$default(uGCIpHeadsetService.f97922a, (CoroutineContext) null, (CoroutineStart) null, new UGCIpHeadsetService$mDeviceEventListener$1$onLikeEvent$1(uGCIpHeadsetService, function0, null), 3, (Object) null);
                }
            }
        };
        Boolean bool = (Boolean) ConfigManager.Companion.ab().get("ugc_bili_ip_func_open", Boolean.FALSE);
        boolean zA = false;
        if (bool != null ? bool.booleanValue() : false) {
            zA = false;
            if (interfaceC3113b != null) {
                zA = interfaceC3113b.a();
            }
        }
        this.f97931k = zA;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(UGCIpHeadsetService uGCIpHeadsetService, boolean z6) {
        uGCIpHeadsetService.getClass();
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
        layoutParams.setLayoutType(16);
        layoutParams.setFunctionType(1);
        layoutParams.setExitAnim(-1);
        layoutParams.setEnterAnim(-1);
        layoutParams.touchOutsideDismiss(false);
        layoutParams.touchEnable(false);
        uGCIpHeadsetService.f97932l = uGCIpHeadsetService.f97925d.showWidget(Hk.a.class, layoutParams, new a.a(z6));
    }

    public static final void b(UGCIpHeadsetService uGCIpHeadsetService) {
        Object systemService = ContextCompat.getSystemService(uGCIpHeadsetService.h, Vibrator.class);
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

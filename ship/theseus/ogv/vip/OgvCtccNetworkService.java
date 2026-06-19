package com.bilibili.ship.theseus.ogv.vip;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.playviewextra.EpUserStatus;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/OgvCtccNetworkService.class */
@StabilityInferred(parameters = 0)
public final class OgvCtccNetworkService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<EpUserStatus> f94830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f94831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f94832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final NetworkRequest f94833e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.OgvCtccNetworkService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/OgvCtccNetworkService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvCtccNetworkService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvCtccNetworkService ogvCtccNetworkService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvCtccNetworkService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            ConnectivityManager.NetworkCallback networkCallback;
            ConnectivityManager.NetworkCallback networkCallback2;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final OgvCtccNetworkService ogvCtccNetworkService = this.this$0;
                networkCallback = new ConnectivityManager.NetworkCallback(ogvCtccNetworkService) { // from class: com.bilibili.ship.theseus.ogv.vip.OgvCtccNetworkService$1$callback$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OgvCtccNetworkService f94834a;

                    {
                        this.f94834a = ogvCtccNetworkService;
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        OgvCtccNetworkService ogvCtccNetworkService2 = this.f94834a;
                        BuildersKt.launch$default(ogvCtccNetworkService2.f94829a, (CoroutineContext) null, (CoroutineStart) null, new OgvCtccNetworkService$1$callback$1$onAvailable$1(ogvCtccNetworkService2, null), 3, (Object) null);
                    }
                };
                try {
                    OgvCtccNetworkService ogvCtccNetworkService2 = this.this$0;
                    ogvCtccNetworkService2.f94832d.registerNetworkCallback(ogvCtccNetworkService2.f94833e, networkCallback);
                    this.L$0 = networkCallback;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    networkCallback2 = networkCallback;
                    th = th2;
                    OgvCtccNetworkService ogvCtccNetworkService3 = this.this$0;
                    ogvCtccNetworkService3.getClass();
                    ogvCtccNetworkService3.f94832d.unregisterNetworkCallback(networkCallback2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                OgvCtccNetworkService$1$callback$1 ogvCtccNetworkService$1$callback$1 = (OgvCtccNetworkService$1$callback$1) this.L$0;
                networkCallback2 = ogvCtccNetworkService$1$callback$1;
                try {
                    ResultKt.throwOnFailure(obj);
                    networkCallback = ogvCtccNetworkService$1$callback$1;
                } catch (Throwable th3) {
                    th = th3;
                    OgvCtccNetworkService ogvCtccNetworkService32 = this.this$0;
                    ogvCtccNetworkService32.getClass();
                    try {
                        ogvCtccNetworkService32.f94832d.unregisterNetworkCallback(networkCallback2);
                    } catch (IllegalArgumentException e7) {
                        BLog.w("OgvCtccNetworkService-safeUnregisterNetworkCallback", "[theseus-ogv-OgvCtccNetworkService-safeUnregisterNetworkCallback] Callback was not registered", e7);
                    } catch (Exception e8) {
                        BLog.w("OgvCtccNetworkService-safeUnregisterNetworkCallback", "[theseus-ogv-OgvCtccNetworkService-safeUnregisterNetworkCallback] Error during unregister", e8);
                    }
                    throw th;
                }
            }
            networkCallback2 = networkCallback;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public OgvCtccNetworkService(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<EpUserStatus> stateFlow, @NotNull h hVar, @NotNull Context context) {
        this.f94829a = coroutineScope;
        this.f94830b = stateFlow;
        this.f94831c = hVar;
        Context applicationContext = context.getApplicationContext();
        this.f94832d = (ConnectivityManager) (applicationContext == null ? context : applicationContext).getSystemService("connectivity");
        this.f94833e = new NetworkRequest.Builder().build();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}

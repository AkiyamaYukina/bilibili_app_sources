package com.bilibili.region;

import android.content.SharedPreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/region/RegionManager$regionFlow$1.class */
public final class RegionManager$regionFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super String>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public RegionManager$regionFlow$1(Continuation<? super RegionManager$regionFlow$1> continuation) {
        super(2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope producerScope, SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1404220148) {
                if (iHashCode != -1319243974 || !str.equals("legal_region")) {
                    return;
                }
            } else if (!str.equals("ip_region")) {
                return;
            }
            producerScope.trySend-JP2dKIU(RegionManager.INSTANCE.currentRegion());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        SharedPreferences sharedPreferences = RegionManager.f85870a;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RegionManager$regionFlow$1 regionManager$regionFlow$1 = new RegionManager$regionFlow$1(continuation);
        regionManager$regionFlow$1.L$0 = obj;
        return regionManager$regionFlow$1;
    }

    public final Object invoke(ProducerScope<? super String> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, com.bilibili.region.a] */
    public final Object invokeSuspend(Object obj) {
        ProducerScope producerScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope2 = (ProducerScope) this.L$0;
            String strCurrentRegion = RegionManager.INSTANCE.currentRegion();
            this.L$0 = producerScope2;
            this.label = 1;
            producerScope = producerScope2;
            if (producerScope2.send(strCurrentRegion, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ProducerScope producerScope3 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            producerScope = producerScope3;
        }
        final ProducerScope producerScope4 = producerScope;
        final ?? r02 = new SharedPreferences.OnSharedPreferenceChangeListener(producerScope4) { // from class: com.bilibili.region.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProducerScope f85872a;

            {
                this.f85872a = producerScope4;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                RegionManager$regionFlow$1.invokeSuspend$lambda$0(this.f85872a, sharedPreferences, str);
            }
        };
        SharedPreferences sharedPreferences = RegionManager.f85870a;
        if (sharedPreferences != 0) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(r02);
        }
        Function0 function0 = new Function0(r02) { // from class: com.bilibili.region.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f85873a;

            {
                this.f85873a = r02;
            }

            public final Object invoke() {
                return RegionManager$regionFlow$1.invokeSuspend$lambda$1(this.f85873a);
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}

package com.bilibili.ship.theseus.ogv.pay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService;
import ev0.InterfaceC7008a;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService.class */
@StabilityInferred(parameters = 0)
public final class OgvVipCashierFragmentInterceptorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f94165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvPayService f94166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ReloadOnAccountInfoChangeService f94167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FragmentManager f94168e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.pay.OgvVipCashierFragmentInterceptorService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final OgvVipCashierFragmentInterceptorService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.pay.OgvVipCashierFragmentInterceptorService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$1$a.class */
        public static final class a implements FragmentOnAttachListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvVipCashierFragmentInterceptorService f94169a;

            public a(OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService) {
                this.f94169a = ogvVipCashierFragmentInterceptorService;
            }

            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                if (fragment instanceof uK0.e) {
                    OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService = this.f94169a;
                    ogvVipCashierFragmentInterceptorService.getClass();
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), (CoroutineContext) null, (CoroutineStart) null, new OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1(fragment, ogvVipCashierFragmentInterceptorService, null), 3, (Object) null);
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), (CoroutineContext) null, (CoroutineStart) null, new OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2(fragment, ogvVipCashierFragmentInterceptorService, null), 3, (Object) null);
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), (CoroutineContext) null, (CoroutineStart) null, new OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3(fragment, ogvVipCashierFragmentInterceptorService, null), 3, (Object) null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvVipCashierFragmentInterceptorService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService;
            OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService2;
            a aVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService3 = this.this$0;
                aVar = new a(ogvVipCashierFragmentInterceptorService3);
                ogvVipCashierFragmentInterceptorService3.f94168e.addFragmentOnAttachListener(aVar);
                OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService4 = this.this$0;
                try {
                    this.L$0 = aVar;
                    this.L$1 = ogvVipCashierFragmentInterceptorService4;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ogvVipCashierFragmentInterceptorService2 = ogvVipCashierFragmentInterceptorService4;
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                    ogvVipCashierFragmentInterceptorService = ogvVipCashierFragmentInterceptorService4;
                    ogvVipCashierFragmentInterceptorService.f94168e.removeFragmentOnAttachListener(aVar2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ogvVipCashierFragmentInterceptorService2 = (OgvVipCashierFragmentInterceptorService) this.L$1;
                a aVar4 = (a) this.L$0;
                ogvVipCashierFragmentInterceptorService = ogvVipCashierFragmentInterceptorService2;
                aVar3 = aVar4;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar4;
                } catch (Throwable th2) {
                    aVar2 = aVar3;
                    th = th2;
                    ogvVipCashierFragmentInterceptorService.f94168e.removeFragmentOnAttachListener(aVar2);
                    throw th;
                }
            }
            ogvVipCashierFragmentInterceptorService = ogvVipCashierFragmentInterceptorService2;
            aVar3 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public OgvVipCashierFragmentInterceptorService(@NotNull CoroutineScope coroutineScope, @NotNull InterfaceC7008a interfaceC7008a, @NotNull OgvPayService ogvPayService, @NotNull ReloadOnAccountInfoChangeService reloadOnAccountInfoChangeService, @NotNull FragmentManager fragmentManager) {
        this.f94164a = coroutineScope;
        this.f94165b = interfaceC7008a;
        this.f94166c = ogvPayService;
        this.f94167d = reloadOnAccountInfoChangeService;
        this.f94168e = fragmentManager;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}

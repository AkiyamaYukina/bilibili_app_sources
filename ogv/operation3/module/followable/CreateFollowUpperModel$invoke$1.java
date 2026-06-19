package com.bilibili.ogv.operation3.module.followable;

import Da0.C;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.community.follow.FollowUpperRepository$flowOfFollowUpper$;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ogv.operation3.module.community.k;
import java.util.HashMap;
import kntr.base.account.AccountState;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.router.RouterKt;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import qj0.C8441c;
import qj0.InterfaceC8440b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowUpperModel$invoke$1.class */
public final class CreateFollowUpperModel$invoke$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f71319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f71320b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.followable.CreateFollowUpperModel$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowUpperModel$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $upMid;
        int label;
        final d this$0;
        final CreateFollowUpperModel$invoke$1 this$1;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.followable.CreateFollowUpperModel$invoke$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowUpperModel$invoke$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateFollowUpperModel$invoke$1 f71321a;

            public a(CreateFollowUpperModel$invoke$1 createFollowUpperModel$invoke$1) {
                this.f71321a = createFollowUpperModel$invoke$1;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f71321a.f71320b.setValue(Boolean.valueOf(Intrinsics.areEqual((Boolean) obj, Boxing.boxBoolean(true))));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, long j7, CreateFollowUpperModel$invoke$1 createFollowUpperModel$invoke$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$upMid = j7;
            this.this$1 = createFollowUpperModel$invoke$1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$upMid, this.this$1, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r52;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ogv.operation3.module.community.k kVar = this.this$0.f71338a;
                long j7 = this.$upMid;
                InterfaceC8440b interfaceC8440b = C8441c.f126030a;
                if (interfaceC8440b != null) {
                    r52 = interfaceC8440b.a(j7);
                } else {
                    HashMap<k.a, MutableStateFlow<Boolean>> map = kVar.f71196b;
                    k.a aVarA = com.bilibili.ogv.operation3.module.community.k.a(j7);
                    FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r02 = map.get(aVarA);
                    FollowUpperRepository$flowOfFollowUpper$.inlined.map.1 r53 = r02;
                    if (r02 == null) {
                        r53 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
                        map.put(aVarA, r53);
                    }
                    r52 = (Flow) r53;
                }
                a aVar = new a(this.this$1);
                this.label = 1;
                if (r52.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.ogv.operation3.module.followable.c] */
    public CreateFollowUpperModel$invoke$1(final KomponentScope<?> komponentScope, final d dVar, final long j7, final Toaster toaster) {
        this.f71319a = new Function0(komponentScope, this, dVar, j7, toaster) { // from class: com.bilibili.ogv.operation3.module.followable.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KomponentScope f71333a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreateFollowUpperModel$invoke$1 f71334b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final d f71335c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f71336d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Toaster f71337e;

            {
                this.f71333a = komponentScope;
                this.f71334b = this;
                this.f71335c = dVar;
                this.f71336d = j7;
                this.f71337e = toaster;
            }

            public final Object invoke() {
                boolean z6 = C.a() instanceof AccountState.Idle;
                KomponentScope komponentScope2 = this.f71333a;
                if (z6) {
                    ((Router) komponentScope2.getContext().getCompositionLocal(RouterKt.getLocalRouter())).launch(Uri.Companion.parse("bilibili://login"));
                } else {
                    KomponentHostScope.launch$default(komponentScope2, (CoroutineContext) null, (CoroutineStart) null, new CreateFollowUpperModel$invoke$1$toggle$1$1(this.f71334b, this.f71335c, this.f71336d, this.f71337e, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        };
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(dVar, j7, this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.f71320b.getValue()).booleanValue();
    }
}

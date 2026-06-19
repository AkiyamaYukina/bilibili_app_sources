package com.bilibili.ogv.operation3.module.followable;

import Da0.C;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ogv.operation3.module.community.h;
import java.util.HashMap;
import kntr.base.account.AccountState;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import qj0.C8441c;
import qj0.InterfaceC8440b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowableSeasonModel$invoke$1.class */
public final class CreateFollowableSeasonModel$invoke$1 implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f71324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f71325b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowableSeasonModel$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final l $followableSeason;
        int label;
        final h this$0;
        final CreateFollowableSeasonModel$invoke$1 this$1;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowableSeasonModel$invoke$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateFollowableSeasonModel$invoke$1 f71326a;

            public a(CreateFollowableSeasonModel$invoke$1 createFollowableSeasonModel$invoke$1) {
                this.f71326a = createFollowableSeasonModel$invoke$1;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f71326a.f71325b.setValue(bool);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, l lVar, CreateFollowableSeasonModel$invoke$1 createFollowableSeasonModel$invoke$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$followableSeason = lVar;
            this.this$1 = createFollowableSeasonModel$invoke$1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$followableSeason, this.this$1, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Flow flowE;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ogv.operation3.module.community.h hVar = this.this$0.f71350a;
                long jC = this.$followableSeason.c();
                InterfaceC8440b interfaceC8440b = C8441c.f126030a;
                if (interfaceC8440b != null) {
                    flowE = interfaceC8440b.e(jC);
                } else {
                    HashMap<h.a, MutableStateFlow<Boolean>> map = hVar.f71183b;
                    h.a aVarA = com.bilibili.ogv.operation3.module.community.h.a(jC);
                    MutableStateFlow<Boolean> mutableStateFlow = map.get(aVarA);
                    MutableStateFlow<Boolean> MutableStateFlow = mutableStateFlow;
                    if (mutableStateFlow == null) {
                        MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
                        map.put(aVarA, MutableStateFlow);
                    }
                    flowE = (Flow) MutableStateFlow;
                }
                a aVar = new a(this.this$1);
                this.label = 1;
                if (flowE.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.ogv.operation3.module.followable.g] */
    public CreateFollowableSeasonModel$invoke$1(final KomponentScope<?> komponentScope, final Router router, final h hVar, final l lVar, final Toaster toaster) {
        this.f71324a = new Function0(router, komponentScope, hVar, this, lVar, toaster) { // from class: com.bilibili.ogv.operation3.module.followable.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Router f71344a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final KomponentScope f71345b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final h f71346c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final CreateFollowableSeasonModel$invoke$1 f71347d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final l f71348e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Toaster f71349f;

            {
                this.f71344a = router;
                this.f71345b = komponentScope;
                this.f71346c = hVar;
                this.f71347d = this;
                this.f71348e = lVar;
                this.f71349f = toaster;
            }

            public final Object invoke() {
                if (C.a() instanceof AccountState.Idle) {
                    this.f71344a.launch(Uri.Companion.parse("bilibili://login"));
                } else {
                    KomponentHostScope.launch$default(this.f71345b, (CoroutineContext) null, (CoroutineStart) null, new CreateFollowableSeasonModel$invoke$1$toggle$1$1(this.f71346c, this.f71347d, this.f71348e, this.f71349f, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        };
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(hVar, lVar, this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.ogv.operation3.module.followable.k
    public final boolean a() {
        return ((Boolean) this.f71325b.getValue()).booleanValue();
    }

    @Override // com.bilibili.ogv.operation3.module.followable.k
    public final Function0<Unit> b() {
        return this.f71324a;
    }
}

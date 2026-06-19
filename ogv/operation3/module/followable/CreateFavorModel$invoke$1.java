package com.bilibili.ogv.operation3.module.followable;

import Da0.C;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bilibili.community.favorite.FavorRepository$flowOfFavor$;
import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ogv.operation3.module.community.d;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFavorModel$invoke$1.class */
public final class CreateFavorModel$invoke$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f71316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f71317b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.followable.CreateFavorModel$invoke$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFavorModel$invoke$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final i $favorable;
        int label;
        final b this$0;
        final CreateFavorModel$invoke$1 this$1;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.module.followable.CreateFavorModel$invoke$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFavorModel$invoke$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreateFavorModel$invoke$1 f71318a;

            public a(CreateFavorModel$invoke$1 createFavorModel$invoke$1) {
                this.f71318a = createFavorModel$invoke$1;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f71318a.f71317b.setValue(bool);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, i iVar, CreateFavorModel$invoke$1 createFavorModel$invoke$1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$favorable = iVar;
            this.this$1 = createFavorModel$invoke$1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$favorable, this.this$1, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            FavorRepository$flowOfFavor$.inlined.map.1 r52;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ogv.operation3.module.community.d dVar = this.this$0.f71332a;
                long oid = this.$favorable.getOid();
                InterfaceC8440b interfaceC8440b = C8441c.f126030a;
                if (interfaceC8440b != null) {
                    r52 = interfaceC8440b.c(oid);
                } else {
                    HashMap<d.a, MutableStateFlow<Boolean>> map = dVar.f71172b;
                    d.a aVarA = com.bilibili.ogv.operation3.module.community.d.a(oid);
                    FavorRepository$flowOfFavor$.inlined.map.1 r02 = map.get(aVarA);
                    FavorRepository$flowOfFavor$.inlined.map.1 r53 = r02;
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

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.ogv.operation3.module.followable.a] */
    public CreateFavorModel$invoke$1(final KomponentScope<?> komponentScope, final b bVar, final i iVar, final Toaster toaster) {
        this.f71316a = new Function0(komponentScope, this, bVar, iVar, toaster) { // from class: com.bilibili.ogv.operation3.module.followable.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KomponentScope f71327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreateFavorModel$invoke$1 f71328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f71329c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final i f71330d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Toaster f71331e;

            {
                this.f71327a = komponentScope;
                this.f71328b = this;
                this.f71329c = bVar;
                this.f71330d = iVar;
                this.f71331e = toaster;
            }

            public final Object invoke() {
                boolean z6 = C.a() instanceof AccountState.Idle;
                KomponentScope komponentScope2 = this.f71327a;
                if (z6) {
                    ((Router) komponentScope2.getContext().getCompositionLocal(RouterKt.getLocalRouter())).launch(Uri.Companion.parse("bilibili://login"));
                } else {
                    KomponentHostScope.launch$default(komponentScope2, (CoroutineContext) null, (CoroutineStart) null, new CreateFavorModel$invoke$1$toggle$1$1(this.f71328b, this.f71329c, this.f71330d, this.f71331e, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        };
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(bVar, iVar, this, null), 3, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.f71317b.getValue()).booleanValue();
    }
}

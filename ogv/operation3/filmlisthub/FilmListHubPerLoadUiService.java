package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.P;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import bl0.C5115a;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService;
import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import gl0.C7348a;
import gl0.C7358k;
import java.util.Iterator;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPerLoadUiService.class */
@StabilityInferred(parameters = 0)
public final class FilmListHubPerLoadUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f71040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.filmlisthub.api.b f71041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.filmlisthub.api.d f71042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C5115a f71043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Wk0.d f71044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7358k f71045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f71046g;

    @Nullable
    public Wk0.e h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f71047i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<k> f71048j = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final C7348a f71049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState f71050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final LazyListState f71051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final State<Long> f71052n;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPerLoadUiService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FilmListHubPerLoadUiService this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPerLoadUiService$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            int I$0;
            Object L$0;
            int label;
            final FilmListHubPerLoadUiService this$0;

            /* JADX INFO: renamed from: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService$1$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPerLoadUiService$1$3$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FilmListHubPerLoadUiService f71053a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Long f71054b;

                public a(FilmListHubPerLoadUiService filmListHubPerLoadUiService, Long l7) {
                    this.f71053a = filmListHubPerLoadUiService;
                    this.f71054b = l7;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                    ((Boolean) obj).booleanValue();
                    Object objB = FilmListHubPerLoadUiService.b(this.f71053a, this.f71054b.longValue(), continuation);
                    if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objB = Unit.INSTANCE;
                    }
                    return objB;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(FilmListHubPerLoadUiService filmListHubPerLoadUiService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = filmListHubPerLoadUiService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0(FilmListHubPerLoadUiService filmListHubPerLoadUiService) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) P.a(filmListHubPerLoadUiService.f71051m);
                return lazyListItemInfo != null && lazyListItemInfo.getIndex() >= filmListHubPerLoadUiService.f71051m.getLayoutInfo().getTotalItemsCount() - 2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            public final Object invoke(Long l7, Continuation<? super Unit> continuation) {
                return create(l7, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x010e A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 354
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService.AnonymousClass1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FilmListHubPerLoadUiService filmListHubPerLoadUiService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = filmListHubPerLoadUiService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long invokeSuspend$lambda$1(FilmListHubPerLoadUiService filmListHubPerLoadUiService) {
            return filmListHubPerLoadUiService.f71052n.getValue();
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FilmListHubPerLoadUiService filmListHubPerLoadUiService = this.this$0;
                for (InterfaceC5118d interfaceC5118d : filmListHubPerLoadUiService.f71041b.f71078a) {
                    KomponentHostScope komponentHostScope__sub$default = KomponentHostScope.__sub$default(filmListHubPerLoadUiService.f71040a, (Function0) null, 1, (Object) null);
                    filmListHubPerLoadUiService.f71048j.add(new k(komponentHostScope__sub$default.embed(filmListHubPerLoadUiService.f71043d.a(interfaceC5118d)), komponentHostScope__sub$default));
                }
                final FilmListHubPerLoadUiService filmListHubPerLoadUiService2 = this.this$0;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(filmListHubPerLoadUiService2) { // from class: com.bilibili.ogv.operation3.filmlisthub.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FilmListHubPerLoadUiService f71107a;

                    {
                        this.f71107a = filmListHubPerLoadUiService2;
                    }

                    public final Object invoke() {
                        return FilmListHubPerLoadUiService.AnonymousClass1.invokeSuspend$lambda$1(this.f71107a);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass3, this) == coroutine_suspended) {
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

    @Inject
    public FilmListHubPerLoadUiService(@NotNull KomponentScope<? super Unit> komponentScope, @NotNull com.bilibili.ogv.operation3.filmlisthub.api.b bVar, @NotNull com.bilibili.ogv.operation3.filmlisthub.api.d dVar, @NotNull C5115a c5115a, @NotNull Wk0.d dVar2, @NotNull C7358k c7358k, long j7) {
        C7348a c7348a;
        this.f71040a = komponentScope;
        this.f71041b = bVar;
        this.f71042c = dVar;
        this.f71043d = c5115a;
        this.f71044e = dVar2;
        this.f71045f = c7358k;
        this.f71046g = j7;
        Iterator<T> it = bVar.f71078a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c7348a = null;
                break;
            }
            InterfaceC5118d interfaceC5118d = (InterfaceC5118d) it.next();
            c7348a = interfaceC5118d instanceof C7348a ? (C7348a) interfaceC5118d : null;
            if (c7348a != null) {
                break;
            }
        }
        this.f71049k = c7348a;
        this.f71050l = SnapshotStateKt.mutableStateOf$default(MoreLoadingState.IDLE, null, 2, null);
        this.f71051m = new LazyListState(0, 0, 3, null);
        this.f71052n = SnapshotStateKt.derivedStateOf(new Dg0.f(this, 4));
        KomponentHostScope.launch$default(this.f71040a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService r8, long r9, kotlin.coroutines.Continuation r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService.b(com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, int r17) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.filmlisthub.FilmListHubPerLoadUiService.a(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}

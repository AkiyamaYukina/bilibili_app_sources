package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateRepository.class */
@StabilityInferred(parameters = 0)
public final class DetailRelateRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<q0> f100852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<q0> f100853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashMap<Long, RelateTab> f100854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f100855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f100856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f100857g;

    @NotNull
    public final MutableSharedFlow<List<o0>> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public r0 f100858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f100859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f100860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f100861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f100862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public C6306c f100863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f100864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f100865p;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DetailRelateRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailRelateRepository detailRelateRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailRelateRepository;
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
                StateFlow<q0> stateFlow = this.this$0.f100853c;
                this.label = 1;
                if (com.bilibili.ogv.infra.coroutine.b.a(stateFlow, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f100854d.put(Boxing.boxLong(Long.MIN_VALUE), new RelateTab(Long.MIN_VALUE, ""));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DetailRelateRepository(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r9, @org.jetbrains.annotations.Nullable com.bapis.bilibili.app.viewunite.v1.IntroductionTab r10) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository.<init>(kotlinx.coroutines.CoroutineScope, com.bapis.bilibili.app.viewunite.v1.IntroductionTab):void");
    }

    @NotNull
    public final List<o0> a() {
        q0 q0Var = (q0) this.f100853c.getValue();
        List<o0> list = q0Var != null ? q0Var.f101364a : null;
        List<o0> listEmptyList = list;
        if (list == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @Nullable
    public final RelateTab b() {
        return this.f100854d.get(Long.valueOf(((Number) this.f100857g.getValue()).longValue()));
    }
}

package com.bilibili.ship.theseus.ugc.reportlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6321j0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.p0;
import ev0.InterfaceC7008a;
import java.util.Iterator;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReportCoverPlayNextService.class */
@StabilityInferred(parameters = 0)
public final class UgcReportCoverPlayNextService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f98464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f98465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f98466d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReportCoverPlayNextService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReportCoverPlayNextService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcReportCoverPlayNextService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReportCoverPlayNextService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReportCoverPlayNextService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcReportCoverPlayNextService f98467a;

            public a(UgcReportCoverPlayNextService ugcReportCoverPlayNextService) {
                this.f98467a = ugcReportCoverPlayNextService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object next;
                Unit unit;
                C6321j0 c6321j0;
                UgcReportCoverPlayNextService ugcReportCoverPlayNextService = this.f98467a;
                Iterator<T> it = ugcReportCoverPlayNextService.f98466d.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((o0) next).a()) {
                        break;
                    }
                }
                o0 o0Var = (o0) next;
                if (o0Var == null) {
                    unit = Unit.INSTANCE;
                } else {
                    InterfaceC7008a interfaceC7008a = (InterfaceC7008a) ugcReportCoverPlayNextService.f98465c.get();
                    if (!o0Var.a() || (c6321j0 = o0Var.f101321f) == null) {
                        f.a("[theseus-ugc-UGCBusinessScopeDriverExtKt-switchToUGCVideo-6AbI3ys] ", "use ugc switch video but relateCard is not av card, it is " + o0Var.f101316a, "UGCBusinessScopeDriverExtKt-switchToUGCVideo-6AbI3ys", (Throwable) null);
                    } else {
                        p0 p0Var = o0Var.f101318c;
                        com.bilibili.ship.theseus.ugc.c.a(interfaceC7008a, p0Var.f101354l, c6321j0.f101264b, p0Var.f101347d, "", o0Var.f101338x, 0, false, 64);
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcReportCoverPlayNextService ugcReportCoverPlayNextService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcReportCoverPlayNextService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcReportCoverPlayNextService ugcReportCoverPlayNextService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcReportCoverPlayNextService.f98464b.f98492b;
                a aVar = new a(ugcReportCoverPlayNextService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public UgcReportCoverPlayNextService(@NotNull CoroutineScope coroutineScope, @NotNull b bVar, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull DetailRelateRepository detailRelateRepository) {
        this.f98463a = coroutineScope;
        this.f98464b = bVar;
        this.f98465c = aVar;
        this.f98466d = detailRelateRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}

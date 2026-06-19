package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelItemClickService.class */
@StabilityInferred(parameters = 0)
public final class UnitedSeasonPanelItemClickService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f101588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final E f101589c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelItemClickService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelItemClickService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedSeasonPanelItemClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelItemClickService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelItemClickService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnitedSeasonPanelItemClickService f101590a;

            public a(UnitedSeasonPanelItemClickService unitedSeasonPanelItemClickService) {
                this.f101590a = unitedSeasonPanelItemClickService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Pair pair = (Pair) obj;
                InterfaceC7008a.e((InterfaceC7008a) this.f101590a.f101588b.get(), ((Number) pair.component1()).longValue(), ((Number) pair.component2()).longValue(), null, "united.player-video-detail.drama-float.0", null, 0, null, true, 170);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedSeasonPanelItemClickService unitedSeasonPanelItemClickService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedSeasonPanelItemClickService;
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
                UnitedSeasonPanelItemClickService unitedSeasonPanelItemClickService = this.this$0;
                SharedFlow<Pair<Long, Long>> sharedFlow = unitedSeasonPanelItemClickService.f101589c.f101466p;
                a aVar = new a(unitedSeasonPanelItemClickService);
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
    public UnitedSeasonPanelItemClickService(@NotNull CoroutineScope coroutineScope, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull E e7) {
        this.f101587a = coroutineScope;
        this.f101588b = aVar;
        this.f101589c = e7;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}

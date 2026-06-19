package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonItemClickService.class */
@StabilityInferred(parameters = 0)
public final class UgcSeasonItemClickService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f97449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f97450c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonItemClickService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonItemClickService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcSeasonItemClickService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonItemClickService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonItemClickService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcSeasonItemClickService f97451a;

            public a(UgcSeasonItemClickService ugcSeasonItemClickService) {
                this.f97451a = ugcSeasonItemClickService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                C6355q c6355q = (C6355q) obj;
                InterfaceC7008a.e((InterfaceC7008a) this.f97451a.f97449b.get(), c6355q.f101682b, c6355q.f101683c, null, "united.player-video-detail.drama.0", null, 0, null, false, 426);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcSeasonItemClickService ugcSeasonItemClickService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonItemClickService;
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
                UgcSeasonItemClickService ugcSeasonItemClickService = this.this$0;
                SharedFlow<C6355q> sharedFlow = ugcSeasonItemClickService.f97450c.f101578j;
                a aVar = new a(ugcSeasonItemClickService);
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
    public UgcSeasonItemClickService(@NotNull CoroutineScope coroutineScope, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository) {
        this.f97448a = coroutineScope;
        this.f97449b = aVar;
        this.f97450c = unitedSeasonDetailRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}

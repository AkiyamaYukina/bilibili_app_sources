package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$createUgcUpLikesPanel$1$3.class */
final class UgcUpLikesService$createUgcUpLikesPanel$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<User> $list;
    final UgcUpLikesPanelComponent $panelComponent;
    int label;
    final UgcUpLikesService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService$createUgcUpLikesPanel$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$createUgcUpLikesPanel$1$3$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcUpLikesService f97687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<User> f97688b;

        public AnonymousClass1(UgcUpLikesService ugcUpLikesService, List<User> list) {
            this.f97687a = ugcUpLikesService;
            this.f97688b = list;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent.a r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 604
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService$createUgcUpLikesPanel$1$3.AnonymousClass1.emit(com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$a, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesService$createUgcUpLikesPanel$1$3(UgcUpLikesPanelComponent ugcUpLikesPanelComponent, UgcUpLikesService ugcUpLikesService, List<User> list, Continuation<? super UgcUpLikesService$createUgcUpLikesPanel$1$3> continuation) {
        super(2, continuation);
        this.$panelComponent = ugcUpLikesPanelComponent;
        this.this$0 = ugcUpLikesService;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpLikesService$createUgcUpLikesPanel$1$3(this.$panelComponent, this.this$0, this.$list, continuation);
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
            SharedFlow<UgcUpLikesPanelComponent.a> sharedFlow = this.$panelComponent.f97645p;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$list);
            this.label = 1;
            if (sharedFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

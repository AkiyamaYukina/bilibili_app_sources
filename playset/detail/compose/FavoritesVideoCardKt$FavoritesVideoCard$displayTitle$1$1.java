package com.bilibili.playset.detail.compose;

import androidx.compose.runtime.ProduceStateScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1.class */
public final class FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1 extends SuspendLambda implements Function2<ProduceStateScope<String>, Continuation<? super Unit>, Object> {
    final com.bilibili.playset.api.c $item;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1(com.bilibili.playset.api.c cVar, Continuation<? super FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1> continuation) {
        super(2, continuation);
        this.$item = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ProduceStateScope produceStateScope, com.bilibili.playset.api.c cVar) {
        produceStateScope.setValue(cVar.d());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(com.bilibili.playset.api.c cVar) {
        cVar.f84041B = null;
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1 favoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1 = new FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1(this.$item, continuation);
        favoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1.L$0 = obj;
        return favoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1;
    }

    public final Object invoke(ProduceStateScope<String> produceStateScope, Continuation<? super Unit> continuation) {
        return create(produceStateScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            final com.bilibili.playset.api.c cVar = this.$item;
            cVar.f84041B = new Function0(produceStateScope, cVar) { // from class: com.bilibili.playset.detail.compose.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProduceStateScope f84439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.playset.api.c f84440b;

                {
                    this.f84439a = produceStateScope;
                    this.f84440b = cVar;
                }

                public final Object invoke() {
                    return FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1.invokeSuspend$lambda$0(this.f84439a, this.f84440b);
                }
            };
            Function0<Unit> function0 = new Function0(cVar) { // from class: com.bilibili.playset.detail.compose.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.playset.api.c f84441a;

                {
                    this.f84441a = cVar;
                }

                public final Object invoke() {
                    return FavoritesVideoCardKt$FavoritesVideoCard$displayTitle$1$1.invokeSuspend$lambda$1(this.f84441a);
                }
            };
            this.label = 1;
            if (produceStateScope.awaitDispose(function0, this) == coroutine_suspended) {
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

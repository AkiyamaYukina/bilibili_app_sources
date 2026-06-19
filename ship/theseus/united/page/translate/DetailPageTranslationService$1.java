package com.bilibili.ship.theseus.united.page.translate;

import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/DetailPageTranslationService$1.class */
final class DetailPageTranslationService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.translate.DetailPageTranslationService$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/DetailPageTranslationService$1$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, b.class, "trySwitchDetailTranslation", "trySwitchDetailTranslation()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m9630invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m9630invoke() {
            ((b) ((CallableReference) this).receiver).a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailPageTranslationService$1(b bVar, Continuation<? super DetailPageTranslationService$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailPageTranslationService$1(this.this$0, continuation);
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
            MenuService menuService = this.this$0.f103466e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (menuService.h(anonymousClass1, this) == coroutine_suspended) {
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

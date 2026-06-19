package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowActorsLayer$component$2.class */
final class ShowActorsLayer$component$2 extends SuspendLambda implements Function2<OgvActorInfoFragment, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowActorsLayer$component$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvActorInfoFragment f92979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f92980b;

        public a(OgvActorInfoFragment ogvActorInfoFragment, c cVar) {
            this.f92979a = ogvActorInfoFragment;
            this.f92980b = cVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            c cVar = this.f92980b;
            int iA = com.bilibili.ship.theseus.united.page.intro.a.a((WindowSizeClass) obj, cVar.f92996g.f(), 12);
            com.bilibili.ship.theseus.united.page.screensize.a aVar = cVar.f92996g;
            int i7 = (aVar.h() || aVar.g()) ? 1 : 2;
            OgvActorInfoFragment ogvActorInfoFragment = this.f92979a;
            ogvActorInfoFragment.f92817d.setValue(Integer.valueOf(iA));
            ogvActorInfoFragment.f92818e.setValue(Integer.valueOf(i7));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowActorsLayer$component$2(c cVar, Continuation<? super ShowActorsLayer$component$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShowActorsLayer$component$2 showActorsLayer$component$2 = new ShowActorsLayer$component$2(this.this$0, continuation);
        showActorsLayer$component$2.L$0 = obj;
        return showActorsLayer$component$2;
    }

    public final Object invoke(OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super Unit> continuation) {
        return create(ogvActorInfoFragment, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvActorInfoFragment ogvActorInfoFragment = (OgvActorInfoFragment) this.L$0;
            c cVar = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = cVar.f92996g.f102939c;
            a aVar = new a(ogvActorInfoFragment, cVar);
            this.label = 1;
            if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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

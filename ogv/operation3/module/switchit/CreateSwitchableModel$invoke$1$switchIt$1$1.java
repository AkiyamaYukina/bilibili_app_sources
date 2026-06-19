package com.bilibili.ogv.operation3.module.switchit;

import US0.j;
import com.bilibili.ktor.KApiResponse;
import java.util.Iterator;
import java.util.List;
import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kntr.common.trio.toast.Toaster;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/switchit/CreateSwitchableModel$invoke$1$switchIt$1$1.class */
public final class CreateSwitchableModel$invoke$1$switchIt$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> $cyclicCards;
    final g $switchable;
    final Toaster $toaster;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final b this$0;
    final CreateSwitchableModel$invoke$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSwitchableModel$invoke$1$switchIt$1$1(b bVar, g gVar, CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1, Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> objectRef, Toaster toaster, Continuation<? super CreateSwitchableModel$invoke$1$switchIt$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$switchable = gVar;
        this.this$1 = createSwitchableModel$invoke$1;
        this.$cyclicCards = objectRef;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateSwitchableModel$invoke$1$switchIt$1$1(this.this$0, this.$switchable, this.this$1, this.$cyclicCards, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = this.this$0.f71430a;
            long moduleId = this.$switchable.getModuleId();
            int moduleType = this.$switchable.getModuleType();
            this.label = 1;
            Object objA = fVar.a(moduleId, String.valueOf(moduleType), this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.a aVar = (KApiResponse) obj;
        CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1 = this.this$1;
        Ref.ObjectRef<Iterator<List<com.bilibili.ogv.operation3.module.operablecard.a>>> objectRef = this.$cyclicCards;
        g gVar = this.$switchable;
        Toaster toaster = this.$toaster;
        if (aVar instanceof KApiResponse.a) {
            String str = aVar.b;
            if (str != null) {
                Toaster.showToast$default(toaster, str, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
            }
            createSwitchableModel$invoke$1.f71423e.setValue(Boolean.FALSE);
        } else if (aVar instanceof KApiResponse.ServiceUnavailable) {
            ((KApiResponse.ServiceUnavailable) aVar).getException();
            createSwitchableModel$invoke$1.f71423e.setValue(Boolean.FALSE);
        } else {
            if (!(aVar instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            List<com.bilibili.ogv.operation3.module.operablecard.a> list = (List) ((KApiResponse.c) aVar).a;
            createSwitchableModel$invoke$1.f71421c = list;
            int size = gVar.getSize();
            Iterator it = (list.isEmpty() ? SequencesKt.emptySequence() : SequencesKt.f(SequencesKt.flattenSequenceOfIterable(SequencesKt.generateSequence(new j(list, 4))), size, size)).iterator();
            objectRef.element = it;
            if (it.hasNext()) {
                ((Iterator) objectRef.element).next();
            }
            createSwitchableModel$invoke$1.f71423e.setValue(Boolean.FALSE);
            if (((Iterator) objectRef.element).hasNext()) {
                Object next = ((Iterator) objectRef.element).next();
                this.L$0 = SpillingKt.nullOutSpilledVariable(aVar);
                this.L$1 = SpillingKt.nullOutSpilledVariable(list);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 2;
                if (createSwitchableModel$invoke$1.f71419a.emit(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

package com.bilibili.ship.theseus.ugc.intro.profield;

import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService$createProfessionalFieldComponent$1$1.class */
final class UgcProfessionalFieldService$createProfessionalFieldComponent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<UgcProfessionalFieldComponent> $professionalFieldComponent;
    final UgcProfessionalFieldInfo $professionalFieldInfo;
    int label;
    final UgcProfessionalFieldService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcProfessionalFieldService$createProfessionalFieldComponent$1$1(UgcProfessionalFieldService ugcProfessionalFieldService, UgcProfessionalFieldInfo ugcProfessionalFieldInfo, Ref.ObjectRef<UgcProfessionalFieldComponent> objectRef, Continuation<? super UgcProfessionalFieldService$createProfessionalFieldComponent$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcProfessionalFieldService;
        this.$professionalFieldInfo = ugcProfessionalFieldInfo;
        this.$professionalFieldComponent = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcProfessionalFieldService$createProfessionalFieldComponent$1$1(this.this$0, this.$professionalFieldInfo, this.$professionalFieldComponent, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UgcProfessionalFieldService ugcProfessionalFieldService = this.this$0;
        UgcProfessionalFieldService.a(ugcProfessionalFieldService, ugcProfessionalFieldService.b(this.$professionalFieldInfo), (UIComponent) this.$professionalFieldComponent.element);
        return Unit.INSTANCE;
    }
}

package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$optionsPanel$3.class */
final class TheseusInteractVideoService$optionsPanel$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final boolean $showsReplay;
    boolean Z$0;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$optionsPanel$3(TheseusInteractVideoService theseusInteractVideoService, boolean z6, Continuation<? super TheseusInteractVideoService$optionsPanel$3> continuation) {
        super(2, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$showsReplay = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(TheseusInteractVideoService theseusInteractVideoService) {
        theseusInteractVideoService.h(TheseusInteractVideoService.a.e.f99916a);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusInteractVideoService$optionsPanel$3 theseusInteractVideoService$optionsPanel$3 = new TheseusInteractVideoService$optionsPanel$3(this.this$0, this.$showsReplay, continuation);
        theseusInteractVideoService$optionsPanel$3.Z$0 = ((Boolean) obj).booleanValue();
        return theseusInteractVideoService$optionsPanel$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.ship.theseus.united.page.interactvideo.v] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                TheseusInteractVideoService theseusInteractVideoService = this.this$0;
                boolean z6 = this.$showsReplay;
                this.label = 1;
                theseusInteractVideoService.getClass();
                IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
                layoutParams.setLayoutType(32);
                layoutParams.setFunctionType(1);
                layoutParams.touchEnable(false);
                Object objRetainFunctionWidget$default = IFunctionWidgetServiceKt.retainFunctionWidget$default(theseusInteractVideoService.f99890f, new h(theseusInteractVideoService.f99885a, theseusInteractVideoService, theseusInteractVideoService.f99898o, z6), layoutParams, (Function1) null, this, 4, (Object) null);
                if (objRetainFunctionWidget$default != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objRetainFunctionWidget$default = Unit.INSTANCE;
                }
                if (objRetainFunctionWidget$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                final TheseusInteractVideoService theseusInteractVideoService2 = this.this$0;
                TheseusInteractVideoService.c cVar = theseusInteractVideoService2.f99900q;
                boolean z7 = this.$showsReplay;
                ?? r02 = new Function0(theseusInteractVideoService2) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.v

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusInteractVideoService f100010a;

                    {
                        this.f100010a = theseusInteractVideoService2;
                    }

                    public final Object invoke() {
                        return TheseusInteractVideoService$optionsPanel$3.invokeSuspend$lambda$0(this.f100010a);
                    }
                };
                this.label = 2;
                if (cVar.b(z7, r02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

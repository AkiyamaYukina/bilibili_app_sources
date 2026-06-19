package com.bilibili.ship.theseus.ugc.intro.upcenter;

import com.bilibili.moduleservice.ugc.IUploaderCenterService;
import com.bilibili.moduleservice.ugc.IUploaderCenterServiceProvider;
import com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterService$create$3.class */
public final class UgcUpCenterService$create$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final UgcUpCenterUIComponent $uiComponent;
    final com.bilibili.ship.theseus.ugc.intro.upcenter.a $upDataModule;
    final List<UgcUpCenterUIComponent.c> $viewList;
    int label;
    final UgcUpCenterService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterService$create$3$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcUpCenterService f97520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.ship.theseus.ugc.intro.upcenter.a f97521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<UgcUpCenterUIComponent.c> f97522c;

        public a(UgcUpCenterService ugcUpCenterService, com.bilibili.ship.theseus.ugc.intro.upcenter.a aVar, List<UgcUpCenterUIComponent.c> list) {
            this.f97520a = ugcUpCenterService;
            this.f97521b = aVar;
            this.f97522c = list;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0295  */
        /* JADX WARN: Type inference failed for: r0v100, types: [com.bilibili.app.gemini.ui.UIComponent, com.bilibili.ship.theseus.ugc.intro.upcenter.c, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 727
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterService$create$3.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpCenterService$create$3(UgcUpCenterService ugcUpCenterService, UgcUpCenterUIComponent ugcUpCenterUIComponent, com.bilibili.ship.theseus.ugc.intro.upcenter.a aVar, List<UgcUpCenterUIComponent.c> list, Continuation<? super UgcUpCenterService$create$3> continuation) {
        super(1, continuation);
        this.this$0 = ugcUpCenterService;
        this.$uiComponent = ugcUpCenterUIComponent;
        this.$upDataModule = aVar;
        this.$viewList = list;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcUpCenterService$create$3(this.this$0, this.$uiComponent, this.$upDataModule, this.$viewList, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IUploaderCenterService service;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcUpCenterService ugcUpCenterService = this.this$0;
                ugcUpCenterService.getClass();
                BuildersKt.launch$default(ugcUpCenterService.f97507a, (CoroutineContext) null, (CoroutineStart) null, new UgcUpCenterService$collectExpandStateFlow$1(ugcUpCenterService, null), 3, (Object) null);
                UgcUpCenterService ugcUpCenterService2 = this.this$0;
                ugcUpCenterService2.getClass();
                BuildersKt.launch$default(ugcUpCenterService2.f97507a, (CoroutineContext) null, (CoroutineStart) null, new UgcUpCenterService$collectCurIndexStateFlow$1(ugcUpCenterService2, null), 3, (Object) null);
                SharedFlow<UgcUpCenterUIComponent.a> sharedFlow = this.$uiComponent.f97527d;
                a aVar = new a(this.this$0, this.$upDataModule, this.$viewList);
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
        } catch (Throwable th) {
            List<e> list = this.$upDataModule.f97546a;
            UgcUpCenterService ugcUpCenterService3 = this.this$0;
            for (e eVar : list) {
                IUploaderCenterServiceProvider iUploaderCenterServiceProvider = ugcUpCenterService3.h;
                if (iUploaderCenterServiceProvider != null && (service = iUploaderCenterServiceProvider.getService(b.a(eVar.f97558b))) != null) {
                    service.onUnbind();
                }
            }
            throw th;
        }
    }
}

package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.graphics.Rect;
import android.net.Uri;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCheeseComponent$1.class */
final class DetailRelateService$createCheeseComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final p0 $basicInfo;
    final o0 $card;
    final com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a $component;
    int label;
    final DetailRelateService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createCheeseComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCheeseComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.c, Continuation<? super Unit>, Object> {
        final p0 $basicInfo;
        final o0 $card;
        final com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a $component;
        Object L$0;
        int label;
        final DetailRelateService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailRelateService detailRelateService, o0 o0Var, com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a aVar, p0 p0Var, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailRelateService;
            this.$card = o0Var;
            this.$component = aVar;
            this.$basicInfo = p0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$card, this.$component, this.$basicInfo, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(a.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            a.c cVar = (a.c) this.L$0;
            defpackage.a.b("[theseus-united-DetailRelateService$createCheeseComponent$1$1-invokeSuspend] ", "createRelatedCheeseComponent effect: " + cVar, "DetailRelateService$createCheeseComponent$1$1-invokeSuspend");
            if (cVar instanceof a.c.C1044a) {
                final DetailRelateService detailRelateService = this.this$0;
                final o0 o0Var = this.$card;
                final com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a aVar = this.$component;
                Rect rect = ((a.c.C1044a) cVar).f101170a;
                detailRelateService.s(o0Var, false);
                detailRelateService.j(rect, o0Var, false, new QH0.c(detailRelateService, 3), new Function1(detailRelateService, o0Var, aVar) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final DetailRelateService f101382a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final o0 f101383b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a f101384c;

                    {
                        this.f101382a = detailRelateService;
                        this.f101383b = o0Var;
                        this.f101384c = aVar;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
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
                    public final Object invoke(Object obj2) {
                        Unit unit;
                        DetailRelateService.b bVar = (DetailRelateService.b) obj2;
                        DetailRelateService detailRelateService2 = this.f101382a;
                        IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService2.f100875k.get();
                        if (introRecycleViewService == null) {
                            unit = Unit.INSTANCE;
                        } else {
                            introRecycleViewService.e(detailRelateService2.f(this.f101383b, bVar, 1, new Object()), this.f101384c);
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    }
                }, null);
            } else if (Intrinsics.areEqual(cVar, a.c.b.f101171a)) {
                o0 o0Var2 = this.$card;
                p0 p0Var = this.$basicInfo;
                DetailRelateService detailRelateService2 = this.this$0;
                o0Var2.f101334t = true;
                String str = p0Var.f101347d;
                if (StringsKt.isBlank(str)) {
                    sh1.e.b(p0Var.f101354l, o0Var2.f101338x, detailRelateService2.f100867b);
                } else {
                    sh1.e.c(detailRelateService2.f100867b, Uri.parse(sh1.k.a(str, o0Var2.f101338x)));
                }
                detailRelateService2.o(o0Var2, "card", new HashMap<>());
            } else {
                if (!(cVar instanceof a.c.C1045c)) {
                    throw new NoWhenBranchMatchedException();
                }
                final DetailRelateService detailRelateService3 = this.this$0;
                final o0 o0Var3 = this.$card;
                final com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a aVar2 = this.$component;
                Rect rect2 = ((a.c.C1045c) cVar).f101172a;
                detailRelateService3.s(o0Var3, true);
                detailRelateService3.j(rect2, o0Var3, true, new QH0.c(detailRelateService3, 3), new Function1(detailRelateService3, o0Var3, aVar2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final DetailRelateService f101382a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final o0 f101383b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a f101384c;

                    {
                        this.f101382a = detailRelateService3;
                        this.f101383b = o0Var3;
                        this.f101384c = aVar2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
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
                    public final Object invoke(Object obj2) {
                        Unit unit;
                        DetailRelateService.b bVar = (DetailRelateService.b) obj2;
                        DetailRelateService detailRelateService22 = this.f101382a;
                        IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) detailRelateService22.f100875k.get();
                        if (introRecycleViewService == null) {
                            unit = Unit.INSTANCE;
                        } else {
                            introRecycleViewService.e(detailRelateService22.f(this.f101383b, bVar, 1, new Object()), this.f101384c);
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    }
                }, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createCheeseComponent$1(com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a aVar, DetailRelateService detailRelateService, o0 o0Var, p0 p0Var, Continuation<? super DetailRelateService$createCheeseComponent$1> continuation) {
        super(1, continuation);
        this.$component = aVar;
        this.this$0 = detailRelateService;
        this.$card = o0Var;
        this.$basicInfo = p0Var;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DetailRelateService$createCheeseComponent$1(this.$component, this.this$0, this.$card, this.$basicInfo, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.united.page.intro.module.relate.cheese.a aVar = this.$component;
            SharedFlow<a.c> sharedFlow = aVar.f101151d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$card, aVar, this.$basicInfo, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

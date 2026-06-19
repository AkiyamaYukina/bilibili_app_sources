package com.bilibili.ship.theseus.detail;

import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.ship.theseus.cheese.biz.modules.F;
import com.bilibili.ship.theseus.cheese.biz.modules.r;
import com.bilibili.ship.theseus.cheese.di.a;
import com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl;
import com.bilibili.ship.theseus.ogv.C6154f;
import com.bilibili.ship.theseus.ogv.report.d;
import com.bilibili.ship.theseus.ogv.z;
import com.bilibili.ship.theseus.ugc.t;
import com.bilibili.ship.theseus.ugc.v;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.di.E;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6367d;
import dagger.internal.Preconditions;
import ev0.C7013f;
import ev0.InterfaceC7008a;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$switchScope$2.class */
final class BusinessScopeDriverImpl$switchScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BusinessScopeDriverImpl.b.c $state;
    private Object L$0;
    int label;
    final BusinessScopeDriverImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$switchScope$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$switchScope$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final t $component;
        final BusinessScopeDriverImpl.b.c $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BusinessScopeDriverImpl.b.c cVar, t tVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state = cVar;
            this.$component = tVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$state, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$state.f90841e = this.$component.K2;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
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
                this.$state.f90841e = null;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$switchScope$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$switchScope$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final z $component;
        final BusinessScopeDriverImpl.b.c $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BusinessScopeDriverImpl.b.c cVar, z zVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$state = cVar;
            this.$component = zVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$state, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$state.f90841e = this.$component.t2;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
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
                this.$state.f90841e = null;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$switchScope$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$switchScope$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.cheese.di.a $component;
        final BusinessScopeDriverImpl.b.c $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BusinessScopeDriverImpl.b.c cVar, com.bilibili.ship.theseus.cheese.di.a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$state = cVar;
            this.$component = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$state, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$state.f90841e = this.$component.M1;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
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
                this.$state.f90841e = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessScopeDriverImpl$switchScope$2(BusinessScopeDriverImpl.b.c cVar, BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super BusinessScopeDriverImpl$switchScope$2> continuation) {
        super(2, continuation);
        this.$state = cVar;
        this.this$0 = businessScopeDriverImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BusinessScopeDriverImpl$switchScope$2 businessScopeDriverImpl$switchScope$2 = new BusinessScopeDriverImpl$switchScope$2(this.$state, this.this$0, continuation);
        businessScopeDriverImpl$switchScope$2.L$0 = obj;
        return businessScopeDriverImpl$switchScope$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v147, types: [com.bilibili.ship.theseus.united.page.intro.module.staffs.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v148, types: [com.bilibili.ship.theseus.ugc.intro.videomentioned.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.bilibili.ship.theseus.cheese.biz.modules.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [com.bilibili.ship.theseus.united.page.intro.module.staffs.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v87, types: [com.bilibili.ship.theseus.united.page.intro.module.staffs.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [com.bilibili.ship.theseus.ogv.followseason.c, java.lang.Object] */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BLog.i("BusinessScopeDriverImpl$switchScope$2-invokeSuspend", "[theseus-detail-BusinessScopeDriverImpl$switchScope$2-invokeSuspend] switchScope start");
        BusinessType businessType = this.$state.f90837a.getBusinessType();
        ViewReply viewReplyA = this.$state.f90837a.a();
        BusinessScopeDriverImpl.b.c cVar = this.$state;
        String str = cVar.f90838b;
        InterfaceC7008a.C1258a c1258a = cVar.f90839c;
        E e7 = new E(businessType, viewReplyA, str, c1258a);
        com.bilibili.ship.theseus.sail.e eVar = cVar.f90837a;
        if (eVar instanceof com.bilibili.ship.theseus.sail.c) {
            a.G1 g12 = this.this$0.f90813f;
            ViewUgcAny viewUgcAny = ((com.bilibili.ship.theseus.sail.c) eVar).f96155b;
            v vVar = new v(c1258a);
            Preconditions.checkNotNull(coroutineScope);
            CompletableDeferred<Unit> completableDeferred = cVar.f90840d;
            Preconditions.checkNotNull(completableDeferred);
            Preconditions.checkNotNull(e7);
            Preconditions.checkNotNull(vVar);
            a.H1 h12 = new a.H1(g12.a, g12.b, e7, (C6367d) new Object(), vVar, (com.bilibili.ship.theseus.ugc.intro.videomentioned.a) new Object(), coroutineScope, viewUgcAny, completableDeferred);
            this.this$0.f90820n.a("ugc", "biz_type");
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$state, h12, null), 3, (Object) null);
        } else if (eVar instanceof com.bilibili.ship.theseus.sail.b) {
            a.o0 o0Var = this.this$0.f90812e;
            ViewPgcAny viewPgcAny = ((com.bilibili.ship.theseus.sail.b) eVar).f96153b;
            C6154f c6154f = new C6154f(c1258a);
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(e7);
            Preconditions.checkNotNull(viewPgcAny);
            Preconditions.checkNotNull(c6154f);
            a.p0 p0Var = new a.p0(o0Var.a, o0Var.b, e7, c6154f, (C6367d) new Object(), (com.bilibili.ship.theseus.ogv.followseason.c) new Object(), coroutineScope, viewPgcAny);
            this.this$0.f90820n.a("ogv", "biz_type");
            com.bilibili.ship.theseus.ogv.report.d dVar = this.this$0.f90817k;
            if (dVar.f94404d) {
                dVar.f94403c.f94416c = Intrinsics.areEqual("ogv", "ogv");
            }
            com.bilibili.ship.theseus.ogv.report.d dVar2 = this.this$0.f90817k;
            d.c cVar2 = dVar2.f94403c;
            if (cVar2.f94417d) {
                dVar2.f94404d = false;
            }
            if (dVar2.f94404d) {
                cVar2.f94417d = true;
            }
            C7013f.a(this.$state.f90839c).complete(p0Var);
            if (EntryPointKt.getMemleakOptEnable()) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$state, p0Var, null), 3, (Object) null);
            } else {
                this.$state.f90841e = p0Var.t2;
                Unit unit = Unit.INSTANCE;
            }
        } else {
            if (!(eVar instanceof com.bilibili.ship.theseus.sail.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.u uVarA = ((a.InterfaceC0651a) this.this$0.f90814g.get()).a(e7);
            uVarA.c = (CoroutineScope) Preconditions.checkNotNull(coroutineScope);
            uVarA.d = ((com.bilibili.ship.theseus.sail.a) eVar).f96151b;
            uVarA.f = (F) Preconditions.checkNotNull(new F((com.bilibili.ship.theseus.united.bean.b) com.bilibili.ship.theseus.united.bean.c.f98751a.a(this.$state.f90839c)));
            Preconditions.checkBuilderRequirement(uVarA.c, CoroutineScope.class);
            Preconditions.checkBuilderRequirement(uVarA.e, E.class);
            if (uVarA.f == null) {
                uVarA.f = new F();
            }
            a.v vVar2 = new a.v(uVarA.a, uVarA.b, uVarA.e, uVarA.f, (r) new Object(), (C6367d) new Object(), uVarA.c, uVarA.d);
            this.this$0.f90820n.a("edu", "biz_type");
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$state, vVar2, null), 3, (Object) null);
        }
        BLog.i("BusinessScopeDriverImpl$switchScope$2-invokeSuspend", "[theseus-detail-BusinessScopeDriverImpl$switchScope$2-invokeSuspend] switchScope end");
        return Unit.INSTANCE;
    }
}

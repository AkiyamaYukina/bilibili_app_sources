package com.bilibili.ship.theseus.playlist.di.driver;

import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.cheese.biz.modules.F;
import com.bilibili.ship.theseus.cheese.biz.modules.r;
import com.bilibili.ship.theseus.ogv.C6154f;
import com.bilibili.ship.theseus.playlist.di.biz.cheese.a;
import com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl;
import com.bilibili.ship.theseus.sail.e;
import com.bilibili.ship.theseus.ugc.v;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.di.E;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6367d;
import dagger.internal.Preconditions;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$switchScope$2.class */
final class PlayListBusinessScopeDriverImpl$switchScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PlayListBusinessScopeDriverImpl.a.d $state;
    private Object L$0;
    int label;
    final PlayListBusinessScopeDriverImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$switchScope$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$switchScope$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.playlist.di.biz.cheese.a $component;
        final PlayListBusinessScopeDriverImpl.a.d $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayListBusinessScopeDriverImpl.a.d dVar, com.bilibili.ship.theseus.playlist.di.biz.cheese.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state = dVar;
            this.$component = aVar;
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
                    this.$state.f95442e = this.$component.R1;
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
                this.$state.f95442e = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayListBusinessScopeDriverImpl$switchScope$2(PlayListBusinessScopeDriverImpl.a.d dVar, PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super PlayListBusinessScopeDriverImpl$switchScope$2> continuation) {
        super(2, continuation);
        this.$state = dVar;
        this.this$0 = playListBusinessScopeDriverImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayListBusinessScopeDriverImpl$switchScope$2 playListBusinessScopeDriverImpl$switchScope$2 = new PlayListBusinessScopeDriverImpl$switchScope$2(this.$state, this.this$0, continuation);
        playListBusinessScopeDriverImpl$switchScope$2.L$0 = obj;
        return playListBusinessScopeDriverImpl$switchScope$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v122, types: [com.bilibili.ship.theseus.united.page.intro.module.staffs.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [com.bilibili.ship.theseus.ugc.intro.videomentioned.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.bilibili.ship.theseus.cheese.biz.modules.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [com.bilibili.ship.theseus.united.page.intro.module.staffs.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [com.bilibili.ship.theseus.united.page.intro.module.staffs.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v90, types: [com.bilibili.ship.theseus.ogv.followseason.c, java.lang.Object] */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BLog.i("PlayListBusinessScopeDriverImpl$switchScope$2-invokeSuspend", "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl$switchScope$2-invokeSuspend] switchScope start");
        BusinessType businessType = this.$state.f95438a.getBusinessType();
        ViewReply viewReplyA = this.$state.f95438a.a();
        PlayListBusinessScopeDriverImpl.a.d dVar = this.$state;
        String str = dVar.f95439b;
        InterfaceC7008a.C1258a c1258a = dVar.f95440c;
        E e7 = new E(businessType, viewReplyA, str, c1258a);
        e eVar = dVar.f95438a;
        if (eVar instanceof com.bilibili.ship.theseus.sail.c) {
            a.Z0 z02 = this.this$0.f95416g;
            ViewUgcAny viewUgcAny = ((com.bilibili.ship.theseus.sail.c) eVar).f96155b;
            v vVar = new v(c1258a);
            Preconditions.checkNotNull(coroutineScope);
            CompletableDeferred<Unit> completableDeferred = dVar.f95441d;
            Preconditions.checkNotNull(completableDeferred);
            Preconditions.checkNotNull(e7);
            Preconditions.checkNotNull(vVar);
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            this.this$0.f95418j.a("ugc", "biz_type");
        } else if (eVar instanceof com.bilibili.ship.theseus.sail.b) {
            a.P0 p02 = this.this$0.f95415f;
            ViewPgcAny viewPgcAny = ((com.bilibili.ship.theseus.sail.b) eVar).f96153b;
            C6154f c6154f = new C6154f(c1258a);
            Preconditions.checkNotNull(coroutineScope);
            Preconditions.checkNotNull(e7);
            Preconditions.checkNotNull(viewPgcAny);
            Preconditions.checkNotNull(c6154f);
            ?? obj4 = new Object();
            ?? obj5 = new Object();
            a.Q0 q02 = new a.Q0(p02.a, p02.b, p02.c, e7, c6154f, (C6367d) obj4, (com.bilibili.ship.theseus.ogv.followseason.c) obj5, coroutineScope, viewPgcAny);
            this.this$0.f95418j.a("ogv", "biz_type");
            this.$state.f95442e = q02.B2;
        } else {
            if (!(eVar instanceof com.bilibili.ship.theseus.sail.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.x0 x0VarA = ((a.InterfaceC0773a) this.this$0.h.get()).a(e7);
            x0VarA.d = (CoroutineScope) Preconditions.checkNotNull(coroutineScope);
            x0VarA.e = ((com.bilibili.ship.theseus.sail.a) eVar).f96151b;
            x0VarA.g = (F) Preconditions.checkNotNull(new F((com.bilibili.ship.theseus.united.bean.b) com.bilibili.ship.theseus.united.bean.c.f98751a.a(this.$state.f95440c)));
            Preconditions.checkBuilderRequirement(x0VarA.d, CoroutineScope.class);
            Preconditions.checkBuilderRequirement(x0VarA.f, E.class);
            if (x0VarA.g == null) {
                x0VarA.g = new F();
            }
            E e8 = x0VarA.f;
            F f7 = x0VarA.g;
            ?? obj6 = new Object();
            ?? obj7 = new Object();
            CoroutineScope coroutineScope2 = x0VarA.d;
            ViewPugvAny viewPugvAny = x0VarA.e;
            a.y0 y0Var = new a.y0(x0VarA.a, x0VarA.b, x0VarA.c, e8, f7, (r) obj6, (C6367d) obj7, coroutineScope2, viewPugvAny);
            this.this$0.f95418j.a("edu", "biz_type");
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$state, y0Var, null), 3, (Object) null);
        }
        BLog.i("PlayListBusinessScopeDriverImpl$switchScope$2-invokeSuspend", "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl$switchScope$2-invokeSuspend] switchScope end");
        return Unit.INSTANCE;
    }
}

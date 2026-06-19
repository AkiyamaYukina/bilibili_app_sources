package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.ship.theseus.ugc.intro.uplikes.c;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.utils.q;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$create$2.class */
public final class UgcUpLikesService$create$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final UserList $data;
    final List<User> $list;
    final c $ugcUpLikesComponent;
    int label;
    final UgcUpLikesService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService$create$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$create$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UserList $data;
        final List<User> $list;
        final c $ugcUpLikesComponent;
        private Object L$0;
        int label;
        final UgcUpLikesService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService$create$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$create$2$1$1.class */
        public static final class C08871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final UserList $data;
            final List<User> $list;
            final c $ugcUpLikesComponent;
            private Object L$0;
            int label;
            final UgcUpLikesService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService$create$2$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$create$2$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UgcUpLikesService f97683a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UserList f97684b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List<User> f97685c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final CoroutineScope f97686d;

                public a(UgcUpLikesService ugcUpLikesService, UserList userList, List<User> list, CoroutineScope coroutineScope) {
                    this.f97683a = ugcUpLikesService;
                    this.f97684b = userList;
                    this.f97685c = list;
                    this.f97686d = coroutineScope;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                    Unit unit;
                    c.a aVar = (c.a) obj;
                    defpackage.a.b("[theseus-ugc-UgcUpLikesService$create$2$1$1$1-emit] ", "handle action -> " + aVar, "UgcUpLikesService$create$2$1$1$1-emit");
                    boolean zAreEqual = Intrinsics.areEqual(aVar, c.a.C0888a.f97709a);
                    UserList userList = this.f97684b;
                    UgcUpLikesService ugcUpLikesService = this.f97683a;
                    if (zAreEqual) {
                        PageReportService.g(ugcUpLikesService.f97678i, "united.player-video-detail.like-list.entry.click", MapsKt.mapOf(TuplesKt.to("list_text", userList.f97697b)), 4);
                        if (this.f97685c.size() <= 1) {
                            User user = (User) CollectionsKt.getOrNull(this.f97685c, 0);
                            if (user == null) {
                                unit = Unit.INSTANCE;
                            } else {
                                if (user.a()) {
                                    q.b(2131848998);
                                } else {
                                    UgcUpLikesService.a(ugcUpLikesService, user.f97689a, user.f97690b);
                                }
                                unit = Unit.INSTANCE;
                            }
                            return unit;
                        }
                        BuildersKt.launch$default(this.f97686d, (CoroutineContext) null, (CoroutineStart) null, new UgcUpLikesService$create$2$1$1$1$1(ugcUpLikesService, this.f97685c, null), 3, (Object) null);
                    } else if (Intrinsics.areEqual(aVar, c.a.C0889c.f97711a)) {
                        ugcUpLikesService.f97674d.f97740f.setValue(Boolean.FALSE);
                    } else {
                        if (!Intrinsics.areEqual(aVar, c.a.b.f97710a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PageReportService.i(ugcUpLikesService.f97678i, "united.player-video-detail.like-list.entry.show", MapsKt.mapOf(TuplesKt.to("list_text", userList.f97697b)), 4);
                    }
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08871(c cVar, UgcUpLikesService ugcUpLikesService, UserList userList, List<User> list, Continuation<? super C08871> continuation) {
                super(2, continuation);
                this.$ugcUpLikesComponent = cVar;
                this.this$0 = ugcUpLikesService;
                this.$data = userList;
                this.$list = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08871 c08871 = new C08871(this.$ugcUpLikesComponent, this.this$0, this.$data, this.$list, continuation);
                c08871.L$0 = obj;
                return c08871;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    SharedFlow<c.a> sharedFlow = this.$ugcUpLikesComponent.f97707e;
                    a aVar = new a(this.this$0, this.$data, this.$list, coroutineScope);
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
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, UgcUpLikesService ugcUpLikesService, UserList userList, List<User> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ugcUpLikesComponent = cVar;
            this.this$0 = ugcUpLikesService;
            this.$data = userList;
            this.$list = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ugcUpLikesComponent, this.this$0, this.$data, this.$list, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C08871(this.$ugcUpLikesComponent, this.this$0, this.$data, this.$list, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesService$create$2(c cVar, UgcUpLikesService ugcUpLikesService, UserList userList, List<User> list, Continuation<? super UgcUpLikesService$create$2> continuation) {
        super(1, continuation);
        this.$ugcUpLikesComponent = cVar;
        this.this$0 = ugcUpLikesService;
        this.$data = userList;
        this.$list = list;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcUpLikesService$create$2(this.$ugcUpLikesComponent, this.this$0, this.$data, this.$list, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ugcUpLikesComponent, this.this$0, this.$data, this.$list, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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

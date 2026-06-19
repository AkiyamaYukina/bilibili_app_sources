package com.bilibili.ship.theseus.united.page.intro.module.owner;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Observer;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.bus.Violet;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playerbizcommonv2.utils.i;
import com.bilibili.relation.FollowStateEvent;
import com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1;
import com.bilibili.ship.theseus.united.page.popupwindow.a;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.d;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1.class */
public final class OwnerService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<f> $bindView;
    final Ref.BooleanRef $hasFollowed;
    final Ref.BooleanRef $needChargeAnimation;
    final long $upperMid;
    int label;
    final OwnerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<f> $bindView;
        final Ref.BooleanRef $hasFollowed;
        final Ref.BooleanRef $needChargeAnimation;
        final long $upperMid;
        private Object L$0;
        int label;
        final OwnerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$1.class */
        public static final class C10251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<f> $bindView;
            int label;
            final OwnerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$1$1.class */
            public static final class C10261 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<f> $bindView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10261(Ref.ObjectRef<f> objectRef, Continuation<? super C10261> continuation) {
                    super(2, continuation);
                    this.$bindView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10261(this.$bindView, continuation);
                }

                public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    f fVar = (f) this.$bindView.element;
                    if (fVar != null) {
                        fVar.b();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10251(OwnerService ownerService, Ref.ObjectRef<f> objectRef, Continuation<? super C10251> continuation) {
                super(2, continuation);
                this.this$0 = ownerService;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10251(this.this$0, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<Unit> sharedFlow = this.this$0.h.f100673c;
                    C10261 c10261 = new C10261(this.$bindView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c10261, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<f> $bindView;
            int label;
            final OwnerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$2$1.class */
            public static final class C10271 extends SuspendLambda implements Function2<com.bilibili.playerbizcommonv2.utils.i, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<f> $bindView;
                Object L$0;
                int label;
                final OwnerService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10271(Ref.ObjectRef<f> objectRef, OwnerService ownerService, Continuation<? super C10271> continuation) {
                    super(2, continuation);
                    this.$bindView = objectRef;
                    this.this$0 = ownerService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10271 c10271 = new C10271(this.$bindView, this.this$0, continuation);
                    c10271.L$0 = obj;
                    return c10271;
                }

                public final Object invoke(com.bilibili.playerbizcommonv2.utils.i iVar, Continuation<? super Unit> continuation) {
                    return create(iVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    Object obj2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.playerbizcommonv2.utils.i iVar = (com.bilibili.playerbizcommonv2.utils.i) this.L$0;
                    f fVar = (f) this.$bindView.element;
                    Boolean boolBoxBoolean = null;
                    com.bilibili.playerbizcommonv2.guideBubble.h hVarD = fVar != null ? fVar.d(iVar.f81936a) : null;
                    f fVar2 = (f) this.$bindView.element;
                    if (fVar2 != null) {
                        boolBoxBoolean = Boxing.boxBoolean(fVar2.e());
                    }
                    if (hVarD != null) {
                        OwnerService ownerService = this.this$0;
                        boolean z6 = ownerService.f100628s.c() || ownerService.f100628s.b();
                        if (boolBoxBoolean != null && (!boolBoxBoolean.booleanValue()) && !z6) {
                            ownerService.f100627r.c(new a.C1103a(hVarD));
                            int iA = com.bilibili.playerbizcommonv2.utils.h.a() + 1;
                            ((tv.danmaku.bili.widget.preference.a) com.bilibili.playerbizcommonv2.utils.h.f81935b.getValue()).n("key_all_strategy_show_times", RangesKt.coerceAtMost(RangesKt.coerceAtLeast(iA, 0), ((Number) com.bilibili.playerbizcommonv2.utils.h.f81934a.getValue()).intValue()));
                            BLog.i("updateFollowGuideTimes strategy: " + iVar + ", all times: " + iA);
                            ownerService.f100632w.tryEmit(Boxing.boxBoolean(true));
                            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                            mapCreateMapBuilder.put("spmid", "united.player-video-detail.up-info.0");
                            if (iVar instanceof i.a) {
                                obj2 = IVideoLikeRouteService.ACTION_LIKE;
                            } else if (iVar instanceof i.c) {
                                obj2 = "view";
                            } else {
                                if (!(iVar instanceof i.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                obj2 = "highlyrec";
                            }
                            mapCreateMapBuilder.put("from_action", obj2);
                            mapCreateMapBuilder.put("upmid", String.valueOf(ownerService.f100612b.f()));
                            mapCreateMapBuilder.put("text", iVar.f81936a);
                            Unit unit = Unit.INSTANCE;
                            PageReportService.i(ownerService.f100620k, "main.public-community.follow.guide-bubble.show", MapsKt.build(mapCreateMapBuilder), 4);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OwnerService ownerService, Ref.ObjectRef<f> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ownerService;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OwnerService ownerService = this.this$0;
                    SharedFlow<com.bilibili.playerbizcommonv2.utils.i> sharedFlow = ownerService.h.f100678i;
                    C10271 c10271 = new C10271(this.$bindView, ownerService, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c10271, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<f> $bindView;
            int label;
            final OwnerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$3$1.class */
            public static final class C10281 extends SuspendLambda implements Function2<d.a, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<f> $bindView;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10281(Ref.ObjectRef<f> objectRef, Continuation<? super C10281> continuation) {
                    super(2, continuation);
                    this.$bindView = objectRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10281(this.$bindView, continuation);
                }

                public final Object invoke(d.a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    f fVar = (f) this.$bindView.element;
                    if (fVar != null) {
                        fVar.a();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(OwnerService ownerService, Ref.ObjectRef<f> objectRef, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = ownerService;
                this.$bindView = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$bindView, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<d.a> stateFlow = this.this$0.f100612b.f104057d;
                    C10281 c10281 = new C10281(this.$bindView, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10281, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.owner.OwnerService$create$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$create$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.BooleanRef $hasFollowed;
            final Ref.BooleanRef $needChargeAnimation;
            final long $upperMid;
            Object L$0;
            int label;
            final OwnerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(OwnerService ownerService, long j7, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = ownerService;
                this.$upperMid = j7;
                this.$hasFollowed = booleanRef;
                this.$needChargeAnimation = booleanRef2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(long j7, OwnerService ownerService, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, List list) {
                Object objPrevious;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator.previous();
                        if (((FollowStateEvent) objPrevious).getUid() == j7) {
                            break;
                        }
                    }
                }
                FollowStateEvent followStateEvent = (FollowStateEvent) objPrevious;
                if (followStateEvent == null) {
                    return;
                }
                OwnerService.a(j7, ownerService, booleanRef, booleanRef2, followStateEvent.getUid(), followStateEvent.isFollow());
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$upperMid, this.$hasFollowed, this.$needChargeAnimation, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Observer observerObserveCachedInactiveUnSticky;
                Observer observer;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ChannelOperation channelOperationOfChannel = Violet.INSTANCE.ofChannel(FollowStateEvent.class);
                    final OwnerService ownerService = this.this$0;
                    ComponentActivity componentActivity = ownerService.f100622m;
                    final long j7 = this.$upperMid;
                    final Ref.BooleanRef booleanRef = this.$hasFollowed;
                    final Ref.BooleanRef booleanRef2 = this.$needChargeAnimation;
                    observerObserveCachedInactiveUnSticky = channelOperationOfChannel.observeCachedInactiveUnSticky(componentActivity, new Observer(j7, ownerService, booleanRef, booleanRef2) { // from class: com.bilibili.ship.theseus.united.page.intro.module.owner.s

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final long f100679a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final OwnerService f100680b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Ref.BooleanRef f100681c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Ref.BooleanRef f100682d;

                        {
                            this.f100679a = j7;
                            this.f100680b = ownerService;
                            this.f100681c = booleanRef;
                            this.f100682d = booleanRef2;
                        }

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            OwnerService ownerService2 = this.f100680b;
                            Ref.BooleanRef booleanRef3 = this.f100681c;
                            OwnerService$create$1.AnonymousClass1.AnonymousClass4.invokeSuspend$lambda$0(this.f100679a, ownerService2, booleanRef3, this.f100682d, (List) obj2);
                        }
                    });
                    try {
                        this.L$0 = observerObserveCachedInactiveUnSticky;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Violet.INSTANCE.ofChannel(FollowStateEvent.class).removeObserver(observerObserveCachedInactiveUnSticky);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Observer observer2 = (Observer) this.L$0;
                    observer = observer2;
                    try {
                        ResultKt.throwOnFailure(obj);
                        observerObserveCachedInactiveUnSticky = observer2;
                    } catch (Throwable th2) {
                        th = th2;
                        observerObserveCachedInactiveUnSticky = observer;
                        Violet.INSTANCE.ofChannel(FollowStateEvent.class).removeObserver(observerObserveCachedInactiveUnSticky);
                        throw th;
                    }
                }
                Observer observer3 = observerObserveCachedInactiveUnSticky;
                observer = observerObserveCachedInactiveUnSticky;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<f> objectRef, OwnerService ownerService, long j7, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bindView = objectRef;
            this.this$0 = ownerService;
            this.$upperMid = j7;
            this.$hasFollowed = booleanRef;
            this.$needChargeAnimation = booleanRef2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindView, this.this$0, this.$upperMid, this.$hasFollowed, this.$needChargeAnimation, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10251(this.this$0, this.$bindView, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$bindView, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$bindView, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$upperMid, this.$hasFollowed, this.$needChargeAnimation, null), 3, (Object) null);
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
                this.$bindView.element = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerService$create$1(Ref.ObjectRef<f> objectRef, OwnerService ownerService, long j7, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Continuation<? super OwnerService$create$1> continuation) {
        super(1, continuation);
        this.$bindView = objectRef;
        this.this$0 = ownerService;
        this.$upperMid = j7;
        this.$hasFollowed = booleanRef;
        this.$needChargeAnimation = booleanRef2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OwnerService$create$1(this.$bindView, this.this$0, this.$upperMid, this.$hasFollowed, this.$needChargeAnimation, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindView, this.this$0, this.$upperMid, this.$hasFollowed, this.$needChargeAnimation, null);
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

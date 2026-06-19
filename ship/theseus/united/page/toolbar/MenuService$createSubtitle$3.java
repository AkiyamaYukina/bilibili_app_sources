package com.bilibili.ship.theseus.united.page.toolbar;

import com.bapis.bilibili.community.service.dm.v1.SubtitleItem;
import com.bilibili.playerbizcommonv2.service.ai.PlayerAiServiceKt$special$$inlined$map$1;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.interact.biz.ISubtitleChangedObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSubtitle$3.class */
final class MenuService$createSubtitle$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
    final Ref.BooleanRef $disable;
    final int $switchCircleColor;
    final int $switchOffRectColor;
    final int $switchOnRectColor;
    int label;
    final MenuService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSubtitle$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSubtitle$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
        final Ref.BooleanRef $disable;
        final int $switchCircleColor;
        final int $switchOffRectColor;
        final int $switchOnRectColor;
        private Object L$0;
        int label;
        final MenuService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSubtitle$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSubtitle$3$1$1.class */
        public static final class C11271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
            final Ref.BooleanRef $disable;
            final int $switchCircleColor;
            final int $switchOffRectColor;
            final int $switchOnRectColor;
            int label;
            final MenuService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSubtitle$3$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSubtitle$3$1$1$1.class */
            public static final class C11281 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
                final Ref.BooleanRef $disable;
                final int $switchCircleColor;
                final int $switchOffRectColor;
                final int $switchOnRectColor;
                int label;
                final MenuService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11281(Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, MenuService menuService, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super C11281> continuation) {
                    super(2, continuation);
                    this.$component = objectRef;
                    this.this$0 = menuService;
                    this.$disable = booleanRef;
                    this.$switchOnRectColor = i7;
                    this.$switchOffRectColor = i8;
                    this.$switchCircleColor = i9;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C11281(this.$component, this.this$0, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
                }

                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return create(str, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    MenuService.d(this.this$0, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, (com.bilibili.playerbizcommonv2.widget.setting.channel.x) this.$component.element);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11271(MenuService menuService, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super C11271> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
                this.$component = objectRef;
                this.$disable = booleanRef;
                this.$switchOnRectColor = i7;
                this.$switchOffRectColor = i8;
                this.$switchCircleColor = i9;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11271(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayerAiServiceKt$special$$inlined$map$1 playerAiServiceKt$special$$inlined$map$1 = new PlayerAiServiceKt$special$$inlined$map$1(this.this$0.f103265x.b0());
                    C11281 c11281 = new C11281(this.$component, this.this$0, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(playerAiServiceKt$special$$inlined$map$1, c11281, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSubtitle$3$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSubtitle$3$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
            final Ref.BooleanRef $disable;
            final int $switchCircleColor;
            final int $switchOffRectColor;
            final int $switchOnRectColor;
            Object L$0;
            int label;
            final MenuService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.MenuService$createSubtitle$3$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/MenuService$createSubtitle$3$1$2$a.class */
            public static final class a implements ISubtitleChangedObserver {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MenuService f103273a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> f103274b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Ref.BooleanRef f103275c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f103276d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f103277e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f103278f;

                public a(int i7, int i8, int i9, MenuService menuService, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef) {
                    this.f103273a = menuService;
                    this.f103274b = objectRef;
                    this.f103275c = booleanRef;
                    this.f103276d = i7;
                    this.f103277e = i8;
                    this.f103278f = i9;
                }

                public final void onSubtitleChanged(SubtitleItem subtitleItem, SubtitleItem subtitleItem2) {
                    this.f103273a.f103242J.setValue(Boolean.valueOf(subtitleItem != null && subtitleItem.getLanDocBrief().length() > 0));
                    MenuService.d(this.f103273a, this.f103275c, this.f103276d, this.f103277e, this.f103278f, (com.bilibili.playerbizcommonv2.widget.setting.channel.x) this.f103274b.element);
                }

                public final void onSubtitleDrawRectChanged(int i7) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MenuService menuService, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = menuService;
                this.$component = objectRef;
                this.$disable = booleanRef;
                this.$switchOnRectColor = i7;
                this.$switchOffRectColor = i8;
                this.$switchCircleColor = i9;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                a aVar2;
                a aVar3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MenuService menuService = this.this$0;
                    Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef = this.$component;
                    aVar = new a(this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, menuService, this.$disable, objectRef);
                    try {
                        menuService.f103252k.addSubtitleChangedObserver(aVar);
                        this.L$0 = aVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        aVar2 = aVar;
                        this.this$0.f103252k.removeSubtitleChangedObserver(aVar2);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar4 = (a) this.L$0;
                    aVar3 = aVar4;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar4;
                    } catch (Throwable th2) {
                        aVar2 = aVar3;
                        th = th2;
                        this.this$0.f103252k.removeSubtitleChangedObserver(aVar2);
                        throw th;
                    }
                }
                aVar3 = aVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MenuService menuService, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = menuService;
            this.$component = objectRef;
            this.$disable = booleanRef;
            this.$switchOnRectColor = i7;
            this.$switchOffRectColor = i8;
            this.$switchCircleColor = i9;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
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
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11271(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuService$createSubtitle$3(MenuService menuService, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super MenuService$createSubtitle$3> continuation) {
        super(1, continuation);
        this.this$0 = menuService;
        this.$component = objectRef;
        this.$disable = booleanRef;
        this.$switchOnRectColor = i7;
        this.$switchOffRectColor = i8;
        this.$switchCircleColor = i9;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MenuService$createSubtitle$3(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, null);
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

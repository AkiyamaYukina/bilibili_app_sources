package com.bilibili.ship.theseus.united.page.toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2.class */
final class ToolbarRepository$enforceViews$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ToolbarRepository.a $views;
    private Object L$0;
    int label;
    final ToolbarRepository this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarRepository toolbarRepository = this.this$0;
                TintToolbar tintToolbar = this.$views.f103295a;
                this.label = 1;
                if (ToolbarRepository.c(toolbarRepository, tintToolbar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository.a f103303a;

            public a(ToolbarRepository.a aVar) {
                this.f103303a = aVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f103303a.f103298d.setVisibility(!((Boolean) obj).booleanValue() ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f103286j.f104859b;
                a aVar = new a(this.$views);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository.a f103304a;

            public a(ToolbarRepository.a aVar) {
                this.f103304a = aVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f103304a.f103300f.setVisibility(!((Boolean) obj).booleanValue() ? 4 : 0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f103287k.f104859b;
                a aVar = new a(this.$views);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$6$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository.a f103305a;

            public a(ToolbarRepository.a aVar) {
                this.f103305a = aVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ToolbarRepository.a aVar = this.f103305a;
                aVar.f103295a.setVisibility(!zBooleanValue ? 4 : 0);
                View view = aVar.f103296b;
                int i7 = 0;
                if (!zBooleanValue) {
                    i7 = 4;
                }
                view.setVisibility(i7);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flow = this.this$0.f103289m;
                a aVar = new a(this.$views);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$7$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$7$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository.a f103306a;

            public a(ToolbarRepository.a aVar) {
                this.f103306a = aVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f103306a.f103299e.setVisibility(!((Boolean) obj).booleanValue() ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f103290n.f104859b;
                a aVar = new a(this.$views);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$8$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$8$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository.a f103307a;

            public a(ToolbarRepository.a aVar) {
                this.f103307a = aVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f103307a.f103302i.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f103291o.f104859b;
                a aVar = new a(this.$views);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarRepository.a $views;
        int label;
        final ToolbarRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            final ToolbarRepository.a $views;
            Object L$0;
            int label;
            final ToolbarRepository this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository$enforceViews$2$9$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$enforceViews$2$9$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f103308a;

                static {
                    int[] iArr = new int[PlayerAvailability.values().length];
                    try {
                        iArr[PlayerAvailability.IDLE.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[PlayerAvailability.LOADING.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[PlayerAvailability.COMPLETED.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    f103308a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ToolbarRepository.a aVar, ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$views = aVar;
                this.this$0 = toolbarRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$views, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = a.f103308a[((PlayerAvailability) this.L$0).ordinal()];
                if (i7 == 1 || i7 == 2) {
                    this.$views.f103301g.setText(this.this$0.f103282e.getString(2131846477));
                } else if (i7 != 3) {
                    this.$views.f103301g.setText(this.this$0.f103282e.getString(2131846944));
                } else {
                    this.$views.f103301g.setText(this.this$0.f103282e.getString(2131845882));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(ToolbarRepository toolbarRepository, ToolbarRepository.a aVar, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = toolbarRepository;
            this.$views = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, this.$views, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarRepository toolbarRepository = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = toolbarRepository.h.f91107a.f79286c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$views, toolbarRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarRepository$enforceViews$2(ToolbarRepository.a aVar, ToolbarRepository toolbarRepository, Continuation<? super ToolbarRepository$enforceViews$2> continuation) {
        super(2, continuation);
        this.$views = aVar;
        this.this$0 = toolbarRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ToolbarRepository toolbarRepository, View view) {
        A a7 = toolbarRepository.f103293q;
        if (a7 != null) {
            a7.invoke();
        } else {
            ToastHelper.showToastShort(toolbarRepository.f103282e, 2131841476);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(ToolbarRepository toolbarRepository, View view) {
        if (view.getVisibility() == 0) {
            BuildersKt.launch$default(toolbarRepository.f103281d, (CoroutineContext) null, (CoroutineStart) null, new ToolbarRepository$enforceViews$2$2$1(toolbarRepository, null), 3, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(ToolbarRepository toolbarRepository, View view) {
        Function0<Unit> function0 = toolbarRepository.f103292p;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ToolbarRepository$enforceViews$2 toolbarRepository$enforceViews$2 = new ToolbarRepository$enforceViews$2(this.$views, this.this$0, continuation);
        toolbarRepository$enforceViews$2.L$0 = obj;
        return toolbarRepository$enforceViews$2;
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
        ImageView imageView = this.$views.f103299e;
        final ToolbarRepository toolbarRepository = this.this$0;
        imageView.setOnClickListener(new View.OnClickListener(toolbarRepository) { // from class: com.bilibili.ship.theseus.united.page.toolbar.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository f103229a;

            {
                this.f103229a = toolbarRepository;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolbarRepository$enforceViews$2.invokeSuspend$lambda$0(this.f103229a, view);
            }
        });
        LinearLayout linearLayout = this.$views.f103300f;
        final ToolbarRepository toolbarRepository2 = this.this$0;
        linearLayout.setOnClickListener(new View.OnClickListener(toolbarRepository2) { // from class: com.bilibili.ship.theseus.united.page.toolbar.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository f103230a;

            {
                this.f103230a = toolbarRepository2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolbarRepository$enforceViews$2.invokeSuspend$lambda$1(this.f103230a, view);
            }
        });
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this.this$0, this.$views, null), 3, (Object) null);
        TextView textView = this.$views.f103302i;
        final ToolbarRepository toolbarRepository3 = this.this$0;
        textView.setOnClickListener(new View.OnClickListener(toolbarRepository3) { // from class: com.bilibili.ship.theseus.united.page.toolbar.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ToolbarRepository f103231a;

            {
                this.f103231a = toolbarRepository3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolbarRepository$enforceViews$2.invokeSuspend$lambda$2(this.f103231a, view);
            }
        });
        return Unit.INSTANCE;
    }
}

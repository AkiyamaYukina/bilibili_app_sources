package com.bilibili.ship.theseus.united.page.intro;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.widget.UnitedRecyclerView;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2.class */
public final class IntroRecycleViewService$bindRecyclerView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final UnitedRecyclerView $recyclerView;
    private Object L$0;
    int label;
    final IntroRecycleViewService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedRecyclerView $recyclerView;
        int label;
        final IntroRecycleViewService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Integer, Boolean, Continuation<? super Pair<? extends Integer, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(int i7, boolean z6, Continuation<? super Pair<Integer, Boolean>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(i7, z6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<Integer, Boolean>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Boolean>, Continuation<? super Unit>, Object> {
            final UnitedRecyclerView $recyclerView;
            Object L$0;
            int label;
            final IntroRecycleViewService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$1$4$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$1$4$a.class */
            public static final class a extends GridLayoutManager.SpanSizeLookup {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IntroRecycleViewService f100053a;

                public a(IntroRecycleViewService introRecycleViewService) {
                    this.f100053a = introRecycleViewService;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i7) {
                    h hVar = (h) CollectionsKt.getOrNull(this.f100053a.f100040f, i7);
                    return hVar != null ? hVar.f100066c : 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnitedRecyclerView unitedRecyclerView, IntroRecycleViewService introRecycleViewService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$recyclerView = unitedRecyclerView;
                this.this$0 = introRecycleViewService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Pair invokeSuspend$lambda$1(IntroRecycleViewService introRecycleViewService, int i7, int i8) {
                h hVar = (h) CollectionsKt.getOrNull(introRecycleViewService.f100040f, i8);
                if (hVar != null && hVar.f100066c == 1) {
                    return new Pair(Integer.valueOf(i7), Integer.valueOf(i7));
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invokeSuspend$lambda$2(IntroRecycleViewService introRecycleViewService, int i7) {
                Integer numD = introRecycleViewService.f100037c.d();
                if (numD != null) {
                    i7 = numD.intValue();
                }
                return i7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$3(IntroRecycleViewService introRecycleViewService, int i7) {
                h hVar = (h) CollectionsKt.getOrNull(introRecycleViewService.f100040f, i7);
                if (hVar == null) {
                    return false;
                }
                boolean z6 = false;
                if (hVar.f100067d) {
                    z6 = false;
                    if (i7 < ((ArrayList) introRecycleViewService.f100040f).size() - 1) {
                        z6 = true;
                    }
                }
                return z6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$recyclerView, this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Integer, Boolean> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

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
            public final Object invokeSuspend(Object obj) throws Throwable {
                RecyclerView.LayoutManager linearLayoutManager;
                IntroRecycleViewService.a aVar;
                IntroRecycleViewService.a aVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    int iIntValue = ((Number) pair.component1()).intValue();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.$recyclerView.getContext(), 2);
                        gridLayoutManager.setSpanSizeLookup(new a(this.this$0));
                        linearLayoutManager = gridLayoutManager;
                    } else {
                        linearLayoutManager = new LinearLayoutManager(this.$recyclerView.getContext());
                    }
                    this.$recyclerView.setLayoutManager(linearLayoutManager);
                    int iDpToPx = DimenUtilsKt.dpToPx(iIntValue);
                    float px = NewPlayerUtilsKt.toPx(0.5f);
                    int color = ContextCompat.getColor(this.$recyclerView.getContext(), R$color.Line_regular);
                    IntroRecycleViewService introRecycleViewService = this.this$0;
                    aVar = new IntroRecycleViewService.a(new d(introRecycleViewService, iDpToPx), new e(introRecycleViewService, color), px, new f(introRecycleViewService));
                    this.$recyclerView.addItemDecoration(aVar);
                    try {
                        this.L$0 = aVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.$recyclerView.removeItemDecoration(aVar);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    IntroRecycleViewService.a aVar3 = (IntroRecycleViewService.a) this.L$0;
                    aVar2 = aVar3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                    } catch (Throwable th2) {
                        aVar = aVar2;
                        th = th2;
                        this.$recyclerView.removeItemDecoration(aVar);
                        throw th;
                    }
                }
                aVar2 = aVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntroRecycleViewService introRecycleViewService, UnitedRecyclerView unitedRecyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = introRecycleViewService;
            this.$recyclerView = unitedRecyclerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(int i7, boolean z6, Continuation continuation) {
            return new Pair(Boxing.boxInt(i7), Boxing.boxBoolean(z6));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$recyclerView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IntroContentSizeRepository introContentSizeRepository = this.this$0.f100036b;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(introContentSizeRepository.f100020a, introContentSizeRepository.f100022c, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$recyclerView, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedRecyclerView $recyclerView;
        int label;
        final IntroRecycleViewService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IntroRecycleViewService introRecycleViewService, UnitedRecyclerView unitedRecyclerView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = introRecycleViewService;
            this.$recyclerView = unitedRecyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$recyclerView, continuation);
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
                    MutableStateFlow<Integer> mutableStateFlow = this.this$0.f100043j;
                    mutableStateFlow.setValue(Boxing.boxInt(((Number) mutableStateFlow.getValue()).intValue() + 1));
                    this.$recyclerView.addOnScrollListener(this.this$0.f100045l);
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
                this.$recyclerView.removeOnScrollListener(this.this$0.f100045l);
                UnitedRecyclerView unitedRecyclerView = this.this$0.f100039e;
                if (unitedRecyclerView != null) {
                    unitedRecyclerView.setAdapter(null);
                }
                this.this$0.f100039e = null;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UnitedRecyclerView $recyclerView;
        int label;
        final IntroRecycleViewService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$bindRecyclerView$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$bindRecyclerView$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final IntroRecycleViewService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IntroRecycleViewService introRecycleViewService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = introRecycleViewService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.h.setValue(Boxing.boxInt(this.I$0));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UnitedRecyclerView unitedRecyclerView, IntroRecycleViewService introRecycleViewService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$recyclerView = unitedRecyclerView;
            this.this$0 = introRecycleViewService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$recyclerView, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.$recyclerView.f104912d);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAsStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public IntroRecycleViewService$bindRecyclerView$2(IntroRecycleViewService introRecycleViewService, UnitedRecyclerView unitedRecyclerView, Continuation<? super IntroRecycleViewService$bindRecyclerView$2> continuation) {
        super(2, continuation);
        this.this$0 = introRecycleViewService;
        this.$recyclerView = unitedRecyclerView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntroRecycleViewService$bindRecyclerView$2 introRecycleViewService$bindRecyclerView$2 = new IntroRecycleViewService$bindRecyclerView$2(this.this$0, this.$recyclerView, continuation);
        introRecycleViewService$bindRecyclerView$2.L$0 = obj;
        return introRecycleViewService$bindRecyclerView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$recyclerView, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$recyclerView, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$recyclerView, this.this$0, null), 3, (Object) null);
    }
}

package com.bilibili.ship.theseus.cheese.biz.intro.selection;

import android.content.Context;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.cheese.biz.intro.selection.a;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$special$$inlined$map$1;
import eu0.C6985d;
import fu0.C7181c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2.class */
final class CheeseSeasonSelectionComponent$bind$2 extends SuspendLambda implements Function2<a.c, Continuation<? super Unit>, Object> {
    final C7181c $binding;
    final Context $context;
    Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.C0634a $adapter;
        final C7181c $binding;
        final LinearLayoutManager $manager;
        final a.c $state;
        private Object L$0;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final C7181c $binding;
            final a.c $state;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a.c f90045a;

                public a(a.c cVar) {
                    this.f90045a = cVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    this.f90045a.f90058c.invoke();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C7181c c7181c, a.c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c7181c;
                this.$state = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$binding, this.$state, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowA = UIComponentExtKt.a(this.$binding.f119532d);
                    a aVar = new a(this.$state);
                    this.label = 1;
                    if (flowA.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$2.class */
        public static final class C06332 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final a.C0634a $adapter;
            final a.c $state;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final a.C0634a $adapter;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(a.C0634a c0634a, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$adapter = c0634a;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adapter, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z6 = this.Z$0;
                    a.C0634a c0634a = this.$adapter;
                    boolean z7 = c0634a.f90049a != z6;
                    c0634a.f90049a = z6;
                    if (z7) {
                        int i7 = 0;
                        for (Object obj2 : (ArrayList) c0634a.f90050b) {
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((a.b) obj2).f90053a.f117525u) {
                                c0634a.notifyItemChanged(i7);
                            }
                            i7++;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06332(a.c cVar, a.C0634a c0634a, Continuation<? super C06332> continuation) {
                super(2, continuation);
                this.$state = cVar;
                this.$adapter = c0634a;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06332(this.$state, this.$adapter, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$state.f90060e;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adapter, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final a.C0634a $adapter;
            final LinearLayoutManager $manager;
            final a.c $state;
            int label;
            final a this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$3$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$3$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6985d, Continuation<? super Unit>, Object> {
                final a.C0634a $adapter;
                final LinearLayoutManager $manager;
                final a.c $state;
                Object L$0;
                int label;
                final a this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(a aVar, a.c cVar, a.C0634a c0634a, LinearLayoutManager linearLayoutManager, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = aVar;
                    this.$state = cVar;
                    this.$adapter = c0634a;
                    this.$manager = linearLayoutManager;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$state, this.$adapter, this.$manager, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(C6985d c6985d, Continuation<? super Unit> continuation) {
                    return create(c6985d, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    C6985d c6985d = (C6985d) this.L$0;
                    if (c6985d != null) {
                        BLog.i("CheeseSeasonSelectionComponent", "bindToView updateSelectEp ep tile = " + c6985d.f117512g);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Boxing.boxInt(this.this$0.f90048c));
                        List<a.b> list = this.$state.f90056a;
                        a aVar = this.this$0;
                        int i7 = 0;
                        for (Object obj2 : list) {
                            if (i7 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            C6985d c6985d2 = ((a.b) obj2).f90053a;
                            if (c6985d2.f117510e == c6985d.f117510e) {
                                aVar.f90048c = i7;
                                arrayList.add(Boxing.boxInt(i7));
                                c6985d2.f117525u = true;
                            } else {
                                c6985d2.f117525u = false;
                            }
                            i7++;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.$adapter.notifyItemChanged(((Number) it.next()).intValue());
                        }
                        int i8 = this.this$0.f90048c;
                        if (i8 >= 0 && i8 < this.$state.f90056a.size()) {
                            LinearLayoutManager linearLayoutManager = this.$manager;
                            a aVar2 = this.this$0;
                            linearLayoutManager.scrollToPositionWithOffset(aVar2.f90048c, aVar2.f90047b);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(a.c cVar, a aVar, a.C0634a c0634a, LinearLayoutManager linearLayoutManager, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$state = cVar;
                this.this$0 = aVar;
                this.$adapter = c0634a;
                this.$manager = linearLayoutManager;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$state, this.this$0, this.$adapter, this.$manager, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a.c cVar = this.$state;
                    CheesePlayRepository$special$$inlined$map$1 cheesePlayRepository$special$$inlined$map$1 = cVar.f90059d;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar, this.$adapter, this.$manager, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(cheesePlayRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final C7181c $binding;
            final a.c $state;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.selection.CheeseSeasonSelectionComponent$bind$2$2$4$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/CheeseSeasonSelectionComponent$bind$2$2$4$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final C7181c $binding;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(C7181c c7181c, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$binding = c7181c;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
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
                    int i7 = this.I$0;
                    CommonExtensionKt.setMarginLeft(this.$binding.f119534f, DimenUtilsKt.dpToPx(i7));
                    CommonExtensionKt.setMarginRight(this.$binding.f119531c, DimenUtilsKt.dpToPx(i7));
                    CommonExtensionKt.setMarginLeft(this.$binding.f119533e, DimenUtilsKt.dpToPx(i7));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(a.c cVar, C7181c c7181c, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$state = cVar;
                this.$binding = c7181c;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$state, this.$binding, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Integer> stateFlow = this.$state.f90061f;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
        public AnonymousClass2(C7181c c7181c, a.c cVar, a.C0634a c0634a, a aVar, LinearLayoutManager linearLayoutManager, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c7181c;
            this.$state = cVar;
            this.$adapter = c0634a;
            this.this$0 = aVar;
            this.$manager = linearLayoutManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$binding, this.$state, this.$adapter, this.this$0, this.$manager, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.$state, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06332(this.$state, this.$adapter, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$state, this.this$0, this.$adapter, this.$manager, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$state, this.$binding, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseSeasonSelectionComponent$bind$2(C7181c c7181c, Context context, a aVar, Continuation<? super CheeseSeasonSelectionComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = c7181c;
        this.$context = context;
        this.this$0 = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(a aVar, C7181c c7181c, Context context, a.c cVar, LinearLayoutManager linearLayoutManager) {
        aVar.f90047b = (c7181c.f119533e.getWidth() / 2) - ((int) DpUtils.dp2px(context, 68.0f));
        Iterator<a.b> it = cVar.f90056a.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().f90053a.f117525u) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0 || i7 >= cVar.f90056a.size()) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i7, aVar.f90047b);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseSeasonSelectionComponent$bind$2 cheeseSeasonSelectionComponent$bind$2 = new CheeseSeasonSelectionComponent$bind$2(this.$binding, this.$context, this.this$0, continuation);
        cheeseSeasonSelectionComponent$bind$2.L$0 = obj;
        return cheeseSeasonSelectionComponent$bind$2;
    }

    public final Object invoke(a.c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final a.c cVar = (a.c) this.L$0;
            this.$binding.f119530b.setText(cVar.f90057b);
            final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.$context, 0, false);
            this.$binding.f119533e.setLayoutManager(linearLayoutManager);
            RecyclerView.Adapter adapter = this.$binding.f119533e.getAdapter();
            a.C0634a c0634a = adapter instanceof a.C0634a ? (a.C0634a) adapter : null;
            if (c0634a == null) {
                return Unit.INSTANCE;
            }
            List<a.b> list = cVar.f90056a;
            if (!Intrinsics.areEqual(list, c0634a.f90050b)) {
                if (((ArrayList) c0634a.f90050b).isEmpty()) {
                    ((ArrayList) c0634a.f90050b).addAll(list);
                    c0634a.notifyDataSetChanged();
                } else {
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new b(c0634a, list));
                    ((ArrayList) c0634a.f90050b).clear();
                    ((ArrayList) c0634a.f90050b).addAll(list);
                    diffResultCalculateDiff.dispatchUpdatesTo(c0634a);
                }
            }
            final C7181c c7181c = this.$binding;
            RecyclerView recyclerView = c7181c.f119533e;
            final a aVar = this.this$0;
            final Context context = this.$context;
            recyclerView.post(new Runnable(aVar, c7181c, context, cVar, linearLayoutManager) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.selection.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f90064a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final C7181c f90065b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Context f90066c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final a.c f90067d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final LinearLayoutManager f90068e;

                {
                    this.f90064a = aVar;
                    this.f90065b = c7181c;
                    this.f90066c = context;
                    this.f90067d = cVar;
                    this.f90068e = linearLayoutManager;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CheeseSeasonSelectionComponent$bind$2.invokeSuspend$lambda$0(this.f90064a, this.f90065b, this.f90066c, this.f90067d, this.f90068e);
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$binding, cVar, c0634a, this.this$0, linearLayoutManager, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass2, this) == coroutine_suspended) {
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

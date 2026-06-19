package com.bilibili.ship.theseus.united.page.intro.module.tags;

import android.app.Application;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.ship.theseus.united.page.intro.module.tags.f;
import dv0.m0;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2.class */
final class TagsComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final m0 $binding;
    final RecyclerView $recycler;
    private Object L$0;
    int label;
    final f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RecyclerView $recycler;
        int label;
        final f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$1$1.class */
        public static final class C10651 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final RecyclerView $recycler;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10651(RecyclerView recyclerView, Continuation<? super C10651> continuation) {
                super(2, continuation);
                this.$recycler = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10651 c10651 = new C10651(this.$recycler, continuation);
                c10651.I$0 = ((Number) obj).intValue();
                return c10651;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0 - 4);
                RecyclerView recyclerView = this.$recycler;
                recyclerView.setPadding(iDpToPx, recyclerView.getPaddingTop(), iDpToPx, this.$recycler.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$recycler = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$recycler, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f101958d;
                C10651 c10651 = new C10651(this.$recycler, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10651, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$2$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Integer, g, Continuation<? super Pair<? extends Integer, ? extends g>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(int i7, g gVar, Continuation<? super Pair<Integer, g>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$0(i7, gVar, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), (g) obj2, (Continuation<? super Pair<Integer, g>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends g>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(f fVar, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = fVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Integer, g> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                int iIntValue = ((Number) pair.component1()).intValue();
                g gVar = (g) pair.component2();
                List<a> list = gVar != null ? gVar.f101972a : null;
                f fVar = this.this$0;
                MutableStateFlow<Integer> mutableStateFlow = fVar.f101959e.f101965f;
                int size = list != null ? list.size() : 0;
                int iDpToPx = DimenUtilsKt.dpToPx(iIntValue);
                fVar.getClass();
                Application fapp = FoundationAlias.getFapp();
                int px = NewPlayerUtilsKt.toPx(24);
                int px2 = NewPlayerUtilsKt.toPx(8);
                mutableStateFlow.setValue(Boxing.boxInt((int) ((((double) ((RangesKt.coerceAtMost(iDpToPx, ScreenUtil.getScreenHeight(fapp)) - px) - ((size - 1) * px2))) * (size == 3 ? 0.33d : 0.5d)) - ((double) NewPlayerUtilsKt.toPx(48)))));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(int i7, g gVar, Continuation continuation) {
            return new Pair(Boxing.boxInt(i7), gVar);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(fVar.f101957c, fVar.f101955a, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final m0 $binding;
        int label;
        final f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends a>, Continuation<? super Unit>, Object> {
            final m0 $binding;
            Object L$0;
            int label;
            final f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(f fVar, m0 m0Var, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = fVar;
                this.$binding = m0Var;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$binding, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(List<a> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                f.a aVar = this.this$0.f101959e;
                int i7 = 0;
                if (!Intrinsics.areEqual(list, aVar.f101962c)) {
                    aVar.f101962c.clear();
                    if (list != null) {
                        aVar.f101962c.addAll(list);
                    }
                    synchronized (aVar) {
                        aVar.f101964e = false;
                        Unit unit = Unit.INSTANCE;
                    }
                    aVar.notifyDataSetChanged();
                    aVar.f101961b.invoke(list);
                }
                ConstraintLayout constraintLayout = this.$binding.f117048a;
                if (list == null || !(!list.isEmpty())) {
                    i7 = 8;
                }
                constraintLayout.setVisibility(i7);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(f fVar, m0 m0Var, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$binding = m0Var;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = this.this$0;
                final MutableStateFlow mutableStateFlow = fVar.f101955a;
                Flow<List<? extends a>> flow = new Flow<List<? extends a>>(mutableStateFlow) { // from class: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final MutableStateFlow f101912a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f101913a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f101913a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L8e
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                com.bilibili.ship.theseus.united.page.intro.module.tags.g r0 = (com.bilibili.ship.theseus.united.page.intro.module.tags.g) r0
                                r6 = r0
                                r0 = r6
                                if (r0 == 0) goto L74
                                r0 = r6
                                java.util.List<com.bilibili.ship.theseus.united.page.intro.module.tags.a> r0 = r0.f101972a
                                r6 = r0
                                goto L76
                            L74:
                                r0 = 0
                                r6 = r0
                            L76:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f101913a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L8e
                                r0 = r9
                                return r0
                            L8e:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.tags.TagsComponent$bind$2$3$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f101912a = mutableStateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f101912a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar, this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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
    public TagsComponent$bind$2(f fVar, RecyclerView recyclerView, m0 m0Var, Continuation<? super TagsComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$recycler = recyclerView;
        this.$binding = m0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TagsComponent$bind$2 tagsComponent$bind$2 = new TagsComponent$bind$2(this.this$0, this.$recycler, this.$binding, continuation);
        tagsComponent$bind$2.L$0 = obj;
        return tagsComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$recycler, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
    }
}

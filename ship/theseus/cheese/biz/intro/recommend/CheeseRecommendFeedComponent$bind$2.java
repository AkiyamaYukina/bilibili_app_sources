package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.a;
import fu0.G;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2.class */
final class CheeseRecommendFeedComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final G $binding;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final G $binding;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$1$1.class */
        public static final class C06261 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final G $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06261(G g7, Continuation<? super C06261> continuation) {
                super(2, continuation);
                this.$binding = g7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06261 c06261 = new C06261(this.$binding, continuation);
                c06261.I$0 = ((Number) obj).intValue();
                return c06261;
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
                TextView textView = this.$binding.f119441c;
                textView.setPaddingRelative(DimenUtilsKt.dpToPx(i7), textView.getPaddingTop(), DimenUtilsKt.dpToPx(i7), textView.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, G g7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$binding = g7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f89933a.f89942b;
                C06261 c06261 = new C06261(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06261, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final G $binding;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$2$2.class */
        public static final class C06272 extends SuspendLambda implements Function2<Context, Continuation<? super Unit>, Object> {
            final G $binding;
            Object L$0;
            int label;
            final com.bilibili.ship.theseus.cheese.biz.intro.recommend.a this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$2$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$2$2$a.class */
            public static final class a extends GridLayoutManager.SpanSizeLookup {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final GridLayoutManager f89929a;

                public a(GridLayoutManager gridLayoutManager) {
                    this.f89929a = gridLayoutManager;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i7) {
                    return i7 < this.f89929a.getItemCount() - 1 ? 1 : 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06272(com.bilibili.ship.theseus.cheese.biz.intro.recommend.a aVar, G g7, Continuation<? super C06272> continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$binding = g7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06272 c06272 = new C06272(this.this$0, this.$binding, continuation);
                c06272.L$0 = obj;
                return c06272;
            }

            public final Object invoke(Context context, Continuation<? super Unit> continuation) {
                return create(context, continuation).invokeSuspend(Unit.INSTANCE);
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
            public final Object invokeSuspend(Object obj) {
                RecyclerView.LayoutManager linearLayoutManager;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Context context = (Context) this.L$0;
                w wVar = (w) this.this$0.f89933a.f89941a.getValue();
                boolean zBooleanValue = ((Boolean) this.this$0.f89933a.f89943c.getValue()).booleanValue();
                a.c cVar = new a.c(this.this$0, wVar, zBooleanValue, ((Number) this.this$0.f89933a.f89942b.getValue()).intValue());
                this.$binding.f119441c.setText(wVar.f90013a.f89998a.f117589a);
                RecyclerView recyclerView = this.$binding.f119440b;
                if (zBooleanValue) {
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
                    gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
                    linearLayoutManager = gridLayoutManager;
                } else {
                    linearLayoutManager = new LinearLayoutManager(context);
                }
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setAdapter(cVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, G g7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$binding = g7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = this.this$0;
                a.d dVar = aVar.f89933a;
                Flow flow = dVar.f89941a;
                Flow flow2 = dVar.f89943c;
                Flow flow3 = dVar.f89942b;
                final G g7 = this.$binding;
                final Flow[] flowArr = {flow, flow2, flow3};
                Flow<Context> flow4 = new Flow<Context>(flowArr, g7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$2$invokeSuspend$$inlined$combine$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow[] f89930a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final G f89931b;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendFeedComponent$bind$2$2$invokeSuspend$$inlined$combine$1$3, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$2$invokeSuspend$$inlined$combine$1$3.class */
                    public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Context>, Object[], Continuation<? super Unit>, Object> {
                        final G $binding$inlined;
                        private Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(Continuation continuation, G g7) {
                            super(3, continuation);
                            this.$binding$inlined = g7;
                        }

                        public final Object invoke(FlowCollector<? super Context> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation, this.$binding$inlined);
                            anonymousClass3.L$0 = flowCollector;
                            anonymousClass3.L$1 = objArr;
                            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i7 = this.label;
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FlowCollector flowCollector = (FlowCollector) this.L$0;
                                Context context = this.$binding$inlined.f119439a.getContext();
                                this.label = 1;
                                if (flowCollector.emit(context, this) == coroutine_suspended) {
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

                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendFeedComponent$bind$2$2$invokeSuspend$$inlined$combine$1$a.class */
                    public static final class a implements Function0<Object[]> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Flow[] f89932a;

                        public a(Flow[] flowArr) {
                            this.f89932a = flowArr;
                        }

                        public final Object invoke() {
                            return new Object[this.f89932a.length];
                        }
                    }

                    {
                        this.f89930a = flowArr;
                        this.f89931b = g7;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Flow[] flowArr2 = this.f89930a;
                        Object objA = kotlinx.coroutines.flow.internal.i.a(flowArr2, new a(flowArr2), new AnonymousClass3(null, this.f89931b), flowCollector, continuation);
                        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
                    }
                };
                C06272 c06272 = new C06272(aVar, g7, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow4, c06272, this) == coroutine_suspended) {
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
    public CheeseRecommendFeedComponent$bind$2(a aVar, G g7, Continuation<? super CheeseRecommendFeedComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$binding = g7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseRecommendFeedComponent$bind$2 cheeseRecommendFeedComponent$bind$2 = new CheeseRecommendFeedComponent$bind$2(this.this$0, this.$binding, continuation);
        cheeseRecommendFeedComponent$bind$2.L$0 = obj;
        return cheeseRecommendFeedComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
    }
}

package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendSingleComponent$bind$2;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.s;
import eu0.C7004w;
import fu0.L;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendSingleComponent$bind$2.class */
final class CheeseRecommendSingleComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final L $binding;
    private Object L$0;
    int label;
    final p this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendSingleComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendSingleComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final L $binding;
        int label;
        final p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendSingleComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendSingleComponent$bind$2$1$1.class */
        public static final class C06281 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final L $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06281(L l7, Continuation<? super C06281> continuation) {
                super(2, continuation);
                this.$binding = l7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06281 c06281 = new C06281(this.$binding, continuation);
                c06281.I$0 = ((Number) obj).intValue();
                return c06281;
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
                ConstraintLayout constraintLayout = this.$binding.f119464b;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, L l7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pVar;
            this.$binding = l7;
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
                StateFlow<Integer> stateFlow = this.this$0.f89988a.f89990b;
                C06281 c06281 = new C06281(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06281, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendSingleComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendSingleComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final L $binding;
        int label;
        final p this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.recommend.CheeseRecommendSingleComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/CheeseRecommendSingleComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<w, Continuation<? super Unit>, Object> {
            final L $binding;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(L l7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = l7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(w wVar, View view) {
                wVar.f90015c.invoke(new s.a(0));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$1(w wVar, View view) {
                wVar.f90015c.invoke(s.b.f89994a);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(w wVar, Continuation<? super Unit> continuation) {
                return create(wVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final w wVar = (w) this.L$0;
                Context context = this.$binding.f119463a.getContext();
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f119463a, wVar.f90014b);
                TextView textView = this.$binding.f119467e;
                t tVar = wVar.f90013a;
                C7004w c7004w = tVar.f89998a;
                textView.setText(c7004w.f117589a);
                this.$binding.f119465c.setText(c7004w.f117590b);
                u uVar = (u) CollectionsKt.firstOrNull(tVar.f89999b);
                if (uVar == null) {
                    return Unit.INSTANCE;
                }
                BiliImageLoader.INSTANCE.with(context).url(uVar.f90002a).into(this.$binding.f119466d);
                this.$binding.h.setText(uVar.f90003b);
                this.$binding.f119469g.setText(uVar.f90004c);
                this.$binding.f119468f.setOnClickListener(new View.OnClickListener(wVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final w f89991a;

                    {
                        this.f89991a = wVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheeseRecommendSingleComponent$bind$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f89991a, view);
                    }
                });
                this.$binding.f119470i.setOnClickListener(new View.OnClickListener(wVar) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.r

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final w f89992a;

                    {
                        this.f89992a = wVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheeseRecommendSingleComponent$bind$2.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$1(this.f89992a, view);
                    }
                });
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(p pVar, L l7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pVar;
            this.$binding = l7;
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
                MutableStateFlow mutableStateFlow = this.this$0.f89988a.f89989a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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
    public CheeseRecommendSingleComponent$bind$2(p pVar, L l7, Continuation<? super CheeseRecommendSingleComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$binding = l7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseRecommendSingleComponent$bind$2 cheeseRecommendSingleComponent$bind$2 = new CheeseRecommendSingleComponent$bind$2(this.this$0, this.$binding, continuation);
        cheeseRecommendSingleComponent$bind$2.L$0 = obj;
        return cheeseRecommendSingleComponent$bind$2;
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

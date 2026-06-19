package com.bilibili.ship.theseus.ugc.intro.mhy;

import Vu0.A;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.DefaultTransformStrategy;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ship.theseus.ugc.intro.mhy.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailComponent$bind$2.class */
final class UgcStarRailComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final BiliImageView $banner;
    final A $binding;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.mhy.UgcStarRailComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BiliImageView $banner;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.mhy.UgcStarRailComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailComponent$bind$2$1$1.class */
        public static final class C08391 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final BiliImageView $banner;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08391(BiliImageView biliImageView, Continuation<? super C08391> continuation) {
                super(2, continuation);
                this.$banner = biliImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08391 c08391 = new C08391(this.$banner, continuation);
                c08391.I$0 = ((Number) obj).intValue();
                return c08391;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0 - 12);
                BiliImageView biliImageView = this.$banner;
                biliImageView.setPadding(iDpToPx, biliImageView.getPaddingTop(), iDpToPx, this.$banner.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, BiliImageView biliImageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$banner = biliImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$banner, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f97099c;
                C08391 c08391 = new C08391(this.$banner, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08391, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.mhy.UgcStarRailComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BiliImageView $banner;
        final A $binding;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.mhy.UgcStarRailComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/UgcStarRailComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<d.C0840d, Continuation<? super Unit>, Object> {
            final BiliImageView $banner;
            final A $binding;
            Object L$0;
            int label;
            final d this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BiliImageView biliImageView, d dVar, A a7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$banner = biliImageView;
                this.this$0 = dVar;
                this.$binding = a7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$banner, this.this$0, this.$binding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(d.C0840d c0840d, Continuation<? super Unit> continuation) {
                return create(c0840d, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                d.C0840d c0840d = (d.C0840d) this.L$0;
                ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(this.$banner.getContext());
                DefaultTransformStrategy defaultTransformStrategyDefaultStrategy = ThumbUrlTransformStrategyUtils.defaultStrategy();
                defaultTransformStrategyDefaultStrategy.disableCrop();
                imageRequestBuilderWith.thumbnailUrlTransformStrategy(defaultTransformStrategyDefaultStrategy).url(c0840d.f97107a).into(this.$banner);
                d.a aVar = this.this$0.f97101e;
                List<d.c> list = c0840d.f97108b;
                aVar.getClass();
                ArrayList arrayList = new ArrayList(aVar.f97103b);
                int size = arrayList.size();
                int size2 = list.size();
                aVar.f97103b.clear();
                aVar.f97103b.addAll(list);
                DiffUtil.calculateDiff(new c(size2, size, arrayList, list)).dispatchUpdatesTo(aVar);
                d dVar = this.this$0;
                if (!dVar.f97100d) {
                    dVar.f97100d = true;
                    Vq0.a aVar2 = new Vq0.a(this.$binding.f25781a.getContext());
                    aVar2.setTargetPosition(this.this$0.f97097a);
                    RecyclerView.LayoutManager layoutManager = this.$binding.f25783c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.startSmoothScroll(aVar2);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, BiliImageView biliImageView, A a7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$banner = biliImageView;
            this.$binding = a7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$banner, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                d dVar = this.this$0;
                MutableStateFlow mutableStateFlow = dVar.f97098b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$banner, dVar, this.$binding, null);
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
    public UgcStarRailComponent$bind$2(d dVar, BiliImageView biliImageView, A a7, Continuation<? super UgcStarRailComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$banner = biliImageView;
        this.$binding = a7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcStarRailComponent$bind$2 ugcStarRailComponent$bind$2 = new UgcStarRailComponent$bind$2(this.this$0, this.$banner, this.$binding, continuation);
        ugcStarRailComponent$bind$2.L$0 = obj;
        return ugcStarRailComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$banner, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$banner, this.$binding, null), 3, (Object) null);
    }
}

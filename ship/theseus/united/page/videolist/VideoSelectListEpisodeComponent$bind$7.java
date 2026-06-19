package com.bilibili.ship.theseus.united.page.videolist;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.videolist.d;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListEpisodeComponent$bind$7.class */
final class VideoSelectListEpisodeComponent$bind$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final AppCompatImageView $arrow;
    final LottieAnimationView $lottieWave;
    final TextView $title;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListEpisodeComponent$bind$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListEpisodeComponent$bind$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LottieAnimationView $lottieWave;
        final TextView $title;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListEpisodeComponent$bind$7$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListEpisodeComponent$bind$7$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Boolean, Long, Continuation<? super Pair<? extends Boolean, ? extends Long>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue(), (Continuation<? super Pair<Boolean, Long>>) obj3);
            }

            public final Object invoke(boolean z6, long j7, Continuation<? super Pair<Boolean, Long>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(z6, j7, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListEpisodeComponent$bind$7$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListEpisodeComponent$bind$7$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends Long>, Continuation<? super Unit>, Object> {
            final LottieAnimationView $lottieWave;
            final TextView $title;
            Object L$0;
            int label;
            final c this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(c cVar, LottieAnimationView lottieAnimationView, TextView textView, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cVar;
                this.$lottieWave = lottieAnimationView;
                this.$title = textView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$lottieWave, this.$title, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Boolean, Long> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object next;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                long jLongValue = ((Number) pair.component2()).longValue();
                Iterator<T> it = this.this$0.f103589a.f103605l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (jLongValue == ((d.a) next).f103614a) {
                        break;
                    }
                }
                if (next != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.this$0.f103589a.f103598d);
                    if (zBooleanValue) {
                        this.$lottieWave.cancelAnimation();
                        com.bilibili.playerbizcommonv2.utils.p.h(this.$lottieWave);
                    } else {
                        spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(DimenUtilsKt.dpToPx(18.0f), 0), 0, spannableStringBuilder.length(), 33);
                        LottieAnimationView lottieAnimationView = this.$lottieWave;
                        Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                        lottieAnimationView.setVisibility(0);
                        this.$lottieWave.playAnimation();
                    }
                    this.$title.setText(spannableStringBuilder);
                    this.$title.setTextColor(this.this$0.f103590b.f103583b);
                    this.$title.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    this.$lottieWave.cancelAnimation();
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$lottieWave);
                    this.$title.setText(this.this$0.f103589a.f103598d);
                    this.$title.setTextColor(this.this$0.f103590b.f103582a);
                    this.$title.setTypeface(Typeface.DEFAULT);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, LottieAnimationView lottieAnimationView, TextView textView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$lottieWave = lottieAnimationView;
            this.$title = textView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, long j7, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), Boxing.boxLong(j7));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$lottieWave, this.$title, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(cVar.f103589a.f103607n, cVar.f103591c, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$lottieWave, this.$title, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListEpisodeComponent$bind$7$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListEpisodeComponent$bind$7$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AppCompatImageView $arrow;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListEpisodeComponent$bind$7$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListEpisodeComponent$bind$7$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final AppCompatImageView $arrow;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AppCompatImageView appCompatImageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$arrow = appCompatImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$arrow, continuation);
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
                if (this.$arrow.getVisibility() == 0) {
                    this.$arrow.setRotation(z6 ? 180.0f : 0.0f);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, AppCompatImageView appCompatImageView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$arrow = appCompatImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$arrow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.this$0.f103589a.f103607n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$arrow, null);
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
    public VideoSelectListEpisodeComponent$bind$7(c cVar, LottieAnimationView lottieAnimationView, TextView textView, AppCompatImageView appCompatImageView, Continuation<? super VideoSelectListEpisodeComponent$bind$7> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$lottieWave = lottieAnimationView;
        this.$title = textView;
        this.$arrow = appCompatImageView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSelectListEpisodeComponent$bind$7 videoSelectListEpisodeComponent$bind$7 = new VideoSelectListEpisodeComponent$bind$7(this.this$0, this.$lottieWave, this.$title, this.$arrow, continuation);
        videoSelectListEpisodeComponent$bind$7.L$0 = obj;
        return videoSelectListEpisodeComponent$bind$7;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$lottieWave, this.$title, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$arrow, null), 3, (Object) null);
    }
}

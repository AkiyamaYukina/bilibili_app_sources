package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.playerbizcommonv2.widget.dowanload.k;
import com.bilibili.playerbizcommonv2.widget.dowanload.m;
import com.bilibili.playerbizcommonv2.widget.dowanload.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7.class */
final class VideoDownloadEpisodeComponent$bind$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final AppCompatImageView $arrow;
    final Context $context;
    final AppCompatTextView $downloadAll;
    final LottieAnimationView $lottieWave;
    final RingProgressBar $progress;
    final ImageView $status;
    final TextView $title;
    private Object L$0;
    int label;
    final k this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final LottieAnimationView $lottieWave;
        final TextView $title;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$1$3.class */
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

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends Long>, Continuation<? super Unit>, Object> {
            final Context $context;
            final LottieAnimationView $lottieWave;
            final TextView $title;
            Object L$0;
            int label;
            final k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(k kVar, LottieAnimationView lottieAnimationView, TextView textView, Context context, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = kVar;
                this.$lottieWave = lottieAnimationView;
                this.$title = textView;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$lottieWave, this.$title, this.$context, continuation);
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
                Iterator<T> it = this.this$0.f82553a.f82564j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (jLongValue == ((m.a) next).f82573a) {
                        break;
                    }
                }
                boolean z6 = next != null;
                if (z6) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.this$0.f82553a.f82558c);
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
                    this.$title.setTextColor(ContextCompat.getColor(this.$context, R$color.Pi5));
                    this.$title.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    this.$lottieWave.cancelAnimation();
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$lottieWave);
                    this.$title.setText(this.this$0.f82553a.f82558c);
                    this.$title.setTextColor(ContextCompat.getColor(this.$context, this.this$0.f82553a.f82561f ? R$color.Text4 : R$color.Text1));
                    this.$title.setTypeface(Typeface.DEFAULT);
                }
                this.$title.setAlpha((this.this$0.f82553a.f82561f && z6) ? 0.5f : 1.0f);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, LottieAnimationView lottieAnimationView, TextView textView, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$lottieWave = lottieAnimationView;
            this.$title = textView;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, long j7, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), Boxing.boxLong(j7));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$lottieWave, this.$title, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                k kVar = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(kVar.f82553a.f82568n, kVar.f82554b, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$lottieWave, this.$title, this.$context, null);
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AppCompatImageView $arrow;
        final AppCompatTextView $downloadAll;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final AppCompatImageView $arrow;
            final AppCompatTextView $downloadAll;
            boolean Z$0;
            int label;
            final k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, k kVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$arrow = appCompatImageView;
                this.$downloadAll = appCompatTextView;
                this.this$0 = kVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$arrow, this.$downloadAll, this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = r4
                    int r0 = r0.label
                    if (r0 != 0) goto L77
                    r0 = r5
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r4
                    boolean r0 = r0.Z$0
                    r10 = r0
                    r0 = r4
                    androidx.appcompat.widget.AppCompatImageView r0 = r0.$arrow
                    int r0 = r0.getVisibility()
                    if (r0 != 0) goto L36
                    r0 = r4
                    androidx.appcompat.widget.AppCompatImageView r0 = r0.$arrow
                    r5 = r0
                    r0 = r10
                    if (r0 == 0) goto L2f
                    r0 = 1127481344(0x43340000, float:180.0)
                    r6 = r0
                    goto L31
                L2f:
                    r0 = 0
                    r6 = r0
                L31:
                    r0 = r5
                    r1 = r6
                    r0.setRotation(r1)
                L36:
                    r0 = r4
                    androidx.appcompat.widget.AppCompatTextView r0 = r0.$downloadAll
                    r5 = r0
                    r0 = 0
                    r8 = r0
                    r0 = r10
                    if (r0 == 0) goto L5f
                    r0 = r4
                    com.bilibili.playerbizcommonv2.widget.dowanload.k r0 = r0.this$0
                    com.bilibili.playerbizcommonv2.widget.dowanload.k$a r0 = r0.f82553a
                    java.util.List<com.bilibili.playerbizcommonv2.widget.dowanload.m$a> r0 = r0.f82564j
                    int r0 = r0.size()
                    r9 = r0
                    r0 = 1
                    r7 = r0
                    r0 = r9
                    r1 = 1
                    if (r0 <= r1) goto L5f
                    goto L61
                L5f:
                    r0 = 0
                    r7 = r0
                L61:
                    r0 = r7
                    if (r0 == 0) goto L6b
                    r0 = r8
                    r7 = r0
                    goto L6e
                L6b:
                    r0 = 8
                    r7 = r0
                L6e:
                    r0 = r5
                    r1 = r7
                    r0.setVisibility(r1)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L77:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$arrow = appCompatImageView;
            this.$downloadAll = appCompatTextView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$arrow, this.$downloadAll, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                k kVar = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = kVar.f82553a.f82568n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$arrow, this.$downloadAll, kVar, null);
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RingProgressBar $progress;
        final ImageView $status;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$3$3.class */
        public static final /* synthetic */ class C05433 extends AdaptedFunctionReference implements Function3<Boolean, l, Continuation<? super Pair<? extends Boolean, ? extends l>>, Object>, SuspendFunction {
            public static final C05433 INSTANCE = new C05433();

            public C05433() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), (l) obj2, (Continuation<? super Pair<Boolean, l>>) obj3);
            }

            public final Object invoke(boolean z6, l lVar, Continuation<? super Pair<Boolean, l>> continuation) {
                return AnonymousClass3.invokeSuspend$lambda$0(z6, lVar, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadEpisodeComponent$bind$7$3$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadEpisodeComponent$bind$7$3$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Boolean, ? extends l>, Continuation<? super Unit>, Object> {
            final RingProgressBar $progress;
            final ImageView $status;
            Object L$0;
            int label;
            final k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ImageView imageView, RingProgressBar ringProgressBar, k kVar, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$status = imageView;
                this.$progress = ringProgressBar;
                this.this$0 = kVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$status, this.$progress, this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Boolean, l> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                s sVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                l lVar = (l) pair.component2();
                if (zBooleanValue) {
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$status);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progress);
                    return Unit.INSTANCE;
                }
                Map<Long, s> map = lVar.f82569a;
                s.d dVar = s.d.f82594a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<m.a> it = this.this$0.f82553a.f82564j.iterator();
                while (true) {
                    sVar = dVar;
                    if (!it.hasNext()) {
                        break;
                    }
                    m.a next = it.next();
                    sVar = map.get(Boxing.boxLong(next.f82573a));
                    if (sVar != null) {
                        if (Intrinsics.areEqual(sVar, s.b.f82592a)) {
                            break;
                        }
                        boolean zAreEqual = Intrinsics.areEqual(sVar, s.d.f82594a);
                        long j7 = next.f82573a;
                        if (!zAreEqual) {
                            arrayList.add(Boxing.boxLong(j7));
                        }
                        if (Intrinsics.areEqual(sVar, s.a.f82591a)) {
                            arrayList2.add(Boxing.boxLong(j7));
                        }
                    }
                }
                s cVar = sVar;
                if (!(sVar instanceof s.b)) {
                    if (arrayList.size() > 1) {
                        cVar = arrayList.size() == arrayList2.size() ? s.a.f82591a : new s.c(MathKt.roundToInt((arrayList2.size() / arrayList.size()) * 100));
                    } else {
                        cVar = sVar;
                        if (arrayList.size() == 1) {
                            s sVar2 = map.get(Boxing.boxLong(this.this$0.f82553a.f82557b));
                            cVar = sVar2;
                            if (sVar2 == null) {
                                cVar = s.d.f82594a;
                            }
                        }
                    }
                }
                if (cVar instanceof s.c) {
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$status);
                    this.$progress.setVisibility(0);
                    this.$progress.setProgress(((s.c) cVar).f82593a);
                } else if (Intrinsics.areEqual(cVar, s.a.f82591a)) {
                    ImageView imageView = this.$status;
                    Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                    imageView.setVisibility(0);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progress);
                    this.$status.setImageResource(2131236766);
                } else if (Intrinsics.areEqual(cVar, s.b.f82592a)) {
                    ImageView imageView2 = this.$status;
                    Lazy lazy2 = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                    imageView2.setVisibility(0);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progress);
                    this.$status.setImageResource(2131236767);
                } else {
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$status);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progress);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, ImageView imageView, RingProgressBar ringProgressBar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$status = imageView;
            this.$progress = ringProgressBar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, l lVar, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), lVar);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$status, this.$progress, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                k.a aVar = this.this$0.f82553a;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(aVar.f82568n, aVar.f82565k, C05433.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$status, this.$progress, this.this$0, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloadEpisodeComponent$bind$7(k kVar, LottieAnimationView lottieAnimationView, TextView textView, Context context, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, ImageView imageView, RingProgressBar ringProgressBar, Continuation<? super VideoDownloadEpisodeComponent$bind$7> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$lottieWave = lottieAnimationView;
        this.$title = textView;
        this.$context = context;
        this.$arrow = appCompatImageView;
        this.$downloadAll = appCompatTextView;
        this.$status = imageView;
        this.$progress = ringProgressBar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadEpisodeComponent$bind$7 videoDownloadEpisodeComponent$bind$7 = new VideoDownloadEpisodeComponent$bind$7(this.this$0, this.$lottieWave, this.$title, this.$context, this.$arrow, this.$downloadAll, this.$status, this.$progress, continuation);
        videoDownloadEpisodeComponent$bind$7.L$0 = obj;
        return videoDownloadEpisodeComponent$bind$7;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$lottieWave, this.$title, this.$context, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$arrow, this.$downloadAll, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$status, this.$progress, null), 3, (Object) null);
    }
}

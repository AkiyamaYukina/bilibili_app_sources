package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.widget.dowanload.k;
import com.bilibili.playerbizcommonv2.widget.dowanload.m;
import com.bilibili.playerbizcommonv2.widget.dowanload.t;
import com.bilibili.playerbizcommonv2.widget.setting.channel.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2.class */
final class VideoDownloadDialog$combineSeasonDownloadView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final StateFlow<Long> $currentCidFlow;
    final RecyclerView $selectView;
    final RecyclerView $tabView;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final VideoDownloadDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Long> $tabSelectFlow;
        final MutableStateFlow<Long> $tabUpdateFlow;
        final RecyclerView $tabView;
        int label;
        final VideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2$3$3, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$3$3.class */
        public static final /* synthetic */ class C05423 extends AdaptedFunctionReference implements Function3<Long, Long, Continuation<? super Pair<? extends Long, ? extends Long>>, Object>, SuspendFunction {
            public static final C05423 INSTANCE = new C05423();

            public C05423() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(long j7, long j8, Continuation<? super Pair<Long, Long>> continuation) {
                return AnonymousClass3.invokeSuspend$lambda$0(j7, j8, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (Continuation<? super Pair<Long, Long>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2$3$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$3$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Long>, Continuation<? super Unit>, Object> {
            final RecyclerView $tabView;
            Object L$0;
            int label;
            final VideoDownloadDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(VideoDownloadDialog videoDownloadDialog, RecyclerView recyclerView, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = videoDownloadDialog;
                this.$tabView = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$tabView, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<Long, Long> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                View view;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                long jLongValue = ((Number) pair.component1()).longValue();
                long jLongValue2 = ((Number) pair.component2()).longValue();
                if (jLongValue <= 0) {
                    return Unit.INSTANCE;
                }
                Iterator<t.a> it = this.this$0.f82489b.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (it.next().f82598a == jLongValue2) {
                        break;
                    }
                    i7++;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.$tabView.getLayoutManager();
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.$tabView.findViewHolderForAdapterPosition(i7);
                linearLayoutManager.scrollToPositionWithOffset(i7, (this.$tabView.getWidth() / 2) - (((viewHolderFindViewHolderForAdapterPosition == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) ? DimenUtilsKt.dpToPx(56.0f) : view.getWidth()) / 2));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MutableStateFlow<Long> mutableStateFlow, MutableStateFlow<Long> mutableStateFlow2, VideoDownloadDialog videoDownloadDialog, RecyclerView recyclerView, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$tabUpdateFlow = mutableStateFlow;
            this.$tabSelectFlow = mutableStateFlow2;
            this.this$0 = videoDownloadDialog;
            this.$tabView = recyclerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(long j7, long j8, Continuation continuation) {
            return new Pair(Boxing.boxLong(j7), Boxing.boxLong(j8));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$tabUpdateFlow, this.$tabSelectFlow, this.this$0, this.$tabView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(this.$tabUpdateFlow, this.$tabSelectFlow, C05423.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$tabView, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final StateFlow<Long> $currentCidFlow;
        final List<Pair<Long, List<Long>>> $selectComponentIdList;
        final MutableStateFlow<Long> $selectComponentUpdateFlow;
        final RecyclerView $selectView;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Long, Long, Continuation<? super Long>, Object> {
            long J$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public final Object invoke(long j7, long j8, Continuation<? super Long> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.J$0 = j8;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (Continuation<? super Long>) obj3);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxLong(this.J$0);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2$4$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$4$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            final List<Pair<Long, List<Long>>> $selectComponentIdList;
            final RecyclerView $selectView;
            long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RecyclerView recyclerView, List<Pair<Long, List<Long>>> list, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$selectView = recyclerView;
                this.$selectComponentIdList = list;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$selectView, this.$selectComponentIdList, continuation);
                anonymousClass2.J$0 = ((Number) obj).longValue();
                return anonymousClass2;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                if (j7 <= 0) {
                    return Unit.INSTANCE;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.$selectView.getLayoutManager();
                Iterator<Pair<Long, List<Long>>> it = this.$selectComponentIdList.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (((List) it.next().getSecond()).contains(Boxing.boxLong(j7))) {
                        break;
                    }
                    i7++;
                }
                linearLayoutManager.scrollToPositionWithOffset(i7, DimenUtilsKt.dpToPx(40.0f));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MutableStateFlow<Long> mutableStateFlow, StateFlow<Long> stateFlow, RecyclerView recyclerView, List<Pair<Long, List<Long>>> list, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$selectComponentUpdateFlow = mutableStateFlow;
            this.$currentCidFlow = stateFlow;
            this.$selectView = recyclerView;
            this.$selectComponentIdList = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$selectComponentUpdateFlow, this.$currentCidFlow, this.$selectView, this.$selectComponentIdList, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(this.$selectComponentUpdateFlow, this.$currentCidFlow, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$selectView, this.$selectComponentIdList, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$a.class */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView f82500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MutableStateFlow<Long> f82501b;

        public a(RecyclerView recyclerView, MutableStateFlow<Long> mutableStateFlow) {
            this.f82500a = recyclerView;
            this.f82501b = mutableStateFlow;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f82500a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f82501b.setValue(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$combineSeasonDownloadView$2$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f82502a = 10;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f82503b = DimenUtilsKt.dpToPx(40.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f82504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Pair<Long, List<Long>>> f82505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MutableStateFlow<Long> f82506e;

        public b(Ref.BooleanRef booleanRef, List<Pair<Long, List<Long>>> list, MutableStateFlow<Long> mutableStateFlow) {
            this.f82504c = booleanRef;
            this.f82505d = list;
            this.f82506e = mutableStateFlow;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            if (i7 == 0) {
                this.f82504c.element = false;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[LOOP:0: B:9:0x003d->B:20:0x0079, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[EDGE_INSN: B:25:0x0081->B:21:0x0081 BREAK  A[LOOP:0: B:9:0x003d->B:20:0x0079], SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
            /*
                r3 = this;
                r0 = r3
                kotlin.jvm.internal.Ref$BooleanRef r0 = r0.f82504c
                r10 = r0
                r0 = r10
                boolean r0 = r0.element
                r9 = r0
                r0 = 0
                r7 = r0
                r0 = r9
                if (r0 == 0) goto L23
                java.lang.String r0 = "VideoDownloadDialog"
                java.lang.String r1 = "scrolled from click"
                tv.danmaku.android.log.BLog.i(r0, r1)
                r0 = r10
                r1 = 0
                r0.element = r1
                return
            L23:
                r0 = r4
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.findFirstVisibleItemPosition()
                r6 = r0
                r0 = r3
                int r0 = r0.f82502a
                r8 = r0
                r0 = r6
                r5 = r0
                r0 = r8
                if (r0 < 0) goto L81
                r0 = r6
                r5 = r0
            L3d:
                r0 = r4
                r1 = r5
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.findViewHolderForAdapterPosition(r1)
                r10 = r0
                r0 = r5
                r6 = r0
                r0 = r10
                if (r0 == 0) goto L70
                r0 = r10
                android.view.View r0 = r0.itemView
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L5c
                r0 = r5
                r6 = r0
                goto L70
            L5c:
                r0 = r10
                int r0 = r0.getBottom()
                r1 = r3
                int r1 = r1.f82503b
                int r0 = r0 - r1
                if (r0 <= 0) goto L6c
                goto L81
            L6c:
                r0 = r5
                r1 = 1
                int r0 = r0 + r1
                r6 = r0
            L70:
                r0 = r6
                r5 = r0
                r0 = r7
                r1 = r8
                if (r0 == r1) goto L81
                int r7 = r7 + 1
                r0 = r6
                r5 = r0
                goto L3d
            L81:
                r0 = r3
                java.util.List<kotlin.Pair<java.lang.Long, java.util.List<java.lang.Long>>> r0 = r0.f82505d
                r1 = r5
                java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
                kotlin.Pair r0 = (kotlin.Pair) r0
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L9e
                r0 = r3
                kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> r0 = r0.f82506e
                r1 = r4
                java.lang.Object r1 = r1.getFirst()
                r0.setValue(r1)
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2.b.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloadDialog$combineSeasonDownloadView$2(RecyclerView recyclerView, RecyclerView recyclerView2, VideoDownloadDialog videoDownloadDialog, StateFlow<Long> stateFlow, Continuation<? super VideoDownloadDialog$combineSeasonDownloadView$2> continuation) {
        super(2, continuation);
        this.$tabView = recyclerView;
        this.$selectView = recyclerView2;
        this.this$0 = videoDownloadDialog;
        this.$currentCidFlow = stateFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(Ref.BooleanRef booleanRef, MutableStateFlow mutableStateFlow, t.a aVar, List list, RecyclerView recyclerView) {
        booleanRef.element = true;
        mutableStateFlow.setValue(Long.valueOf(aVar.f82598a));
        Iterator it = list.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (((Number) ((Pair) it.next()).getFirst()).longValue() == aVar.f82598a) {
                break;
            }
            i7++;
        }
        ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(i7, DimenUtilsKt.dpToPx(50.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$1(List list, k.a aVar, RecyclerView recyclerView, SimpleItemAnimator simpleItemAnimator, Ref.ObjectRef objectRef, List list2, com.bilibili.app.gemini.ui.f fVar, StateFlow stateFlow, UIComponent uIComponent) {
        ArrayList arrayList;
        if (list.size() <= 1) {
            aVar.f82566l.invoke();
            return Unit.INSTANCE;
        }
        if (recyclerView.getItemAnimator() == null) {
            recyclerView.setItemAnimator(simpleItemAnimator);
        }
        int iIndexOf = ((List) objectRef.element).indexOf(uIComponent);
        ArrayList arrayList2 = new ArrayList((Collection) objectRef.element);
        int i7 = 0;
        if (((Boolean) aVar.f82568n.getValue()).booleanValue()) {
            int iRoundToInt = MathKt.roundToInt(list.size() / 2.0f);
            while (true) {
                arrayList = arrayList2;
                if (i7 >= iRoundToInt) {
                    break;
                }
                int i8 = iIndexOf + 1;
                list2.remove(i8);
                arrayList2.remove(i8);
                i7++;
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            Object objFirst = CollectionsKt.first(list);
            int i9 = 0;
            for (Object obj : aVar.f82564j) {
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                m.a aVar2 = (m.a) obj;
                long j7 = aVar.f82556a;
                if (i9 % 2 == 1) {
                    list2.add(iIndexOf + 1, new Pair(Long.valueOf(j7), CollectionsKt.listOf(new Long[]{Long.valueOf(((m.a) objFirst).f82573a), Long.valueOf(aVar2.f82573a)})));
                    arrayList3.add(new m(new Pair(objFirst, aVar2), stateFlow));
                } else if (i9 == list.size() - 1) {
                    list2.add(iIndexOf + 1, new Pair(Long.valueOf(j7), CollectionsKt.listOf(Long.valueOf(aVar2.f82573a))));
                    arrayList3.add(new m(new Pair(aVar2, (Object) null), stateFlow));
                }
                objFirst = aVar2;
                i9++;
            }
            arrayList = arrayList2;
            arrayList.addAll(iIndexOf + 1, arrayList3);
        }
        fVar.N(arrayList);
        aVar.f82568n.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        objectRef.element = arrayList;
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadDialog$combineSeasonDownloadView$2 videoDownloadDialog$combineSeasonDownloadView$2 = new VideoDownloadDialog$combineSeasonDownloadView$2(this.$tabView, this.$selectView, this.this$0, this.$currentCidFlow, continuation);
        videoDownloadDialog$combineSeasonDownloadView$2.L$0 = obj;
        return videoDownloadDialog$combineSeasonDownloadView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.bilibili.playerbizcommonv2.widget.dowanload.f] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.bilibili.playerbizcommonv2.widget.dowanload.e] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.app.gemini.ui.f fVar;
        b bVar;
        Throwable th;
        com.bilibili.app.gemini.ui.f fVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            com.bilibili.app.gemini.ui.f fVar3 = new com.bilibili.app.gemini.ui.f(false);
            final com.bilibili.app.gemini.ui.f fVar4 = new com.bilibili.app.gemini.ui.f(false);
            this.$tabView.setItemAnimator(null);
            this.$tabView.setNestedScrollingEnabled(false);
            final SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) this.$selectView.getItemAnimator();
            simpleItemAnimator.setSupportsChangeAnimations(false);
            this.$selectView.setAdapter(fVar4);
            if (this.this$0.f82489b.size() > 1) {
                this.$tabView.setAdapter(fVar3);
                this.$tabView.setVisibility(0);
            } else {
                this.$tabView.setAdapter(null);
                this.$tabView.setVisibility(8);
            }
            final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boxing.boxLong(((t.a) CollectionsKt.first(this.this$0.f82489b)).f82598a));
            MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boxing.boxLong(0L));
            final ArrayList arrayList = new ArrayList();
            MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boxing.boxLong(0L));
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            b bVar2 = new b(booleanRef, arrayList, MutableStateFlow);
            this.$selectView.addOnScrollListener(bVar2);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new ArrayList();
            List<t.a> list = this.this$0.f82489b;
            final RecyclerView recyclerView = this.$selectView;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (final t.a aVar : list) {
                arrayList2.add(new t(aVar, MutableStateFlow, new Function0(booleanRef, MutableStateFlow, aVar, arrayList, recyclerView) { // from class: com.bilibili.playerbizcommonv2.widget.dowanload.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Ref.BooleanRef f82533a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final MutableStateFlow f82534b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final t.a f82535c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final List f82536d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final RecyclerView f82537e;

                    {
                        this.f82533a = booleanRef;
                        this.f82534b = MutableStateFlow;
                        this.f82535c = aVar;
                        this.f82536d = arrayList;
                        this.f82537e = recyclerView;
                    }

                    public final Object invoke() {
                        return VideoDownloadDialog$combineSeasonDownloadView$2.invokeSuspend$lambda$0$0(this.f82533a, this.f82534b, this.f82535c, this.f82536d, this.f82537e);
                    }
                }));
            }
            fVar3.N(arrayList2);
            this.$tabView.getViewTreeObserver().addOnGlobalLayoutListener(new a(this.$tabView, MutableStateFlow2));
            List<k.a> list2 = this.this$0.f82490c;
            Collection collection = (Collection) objectRef.element;
            final StateFlow<Long> stateFlow = this.$currentCidFlow;
            final RecyclerView recyclerView2 = this.$selectView;
            fVar = fVar3;
            for (final k.a aVar2 : list2) {
                final List<m.a> list3 = aVar2.f82564j;
                Long lBoxLong = Boxing.boxLong(aVar2.f82556a);
                List<m.a> list4 = aVar2.f82564j;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Boxing.boxLong(((m.a) it.next()).f82573a));
                }
                arrayList.add(new Pair(lBoxLong, arrayList3));
                collection.add(new k(aVar2, stateFlow, new Function1(list3, aVar2, recyclerView2, simpleItemAnimator, objectRef, arrayList, fVar4, stateFlow) { // from class: com.bilibili.playerbizcommonv2.widget.dowanload.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final List f82538a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final k.a f82539b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final RecyclerView f82540c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final SimpleItemAnimator f82541d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final Ref.ObjectRef f82542e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final List f82543f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final com.bilibili.app.gemini.ui.f f82544g;
                    public final StateFlow h;

                    {
                        this.f82538a = list3;
                        this.f82539b = aVar2;
                        this.f82540c = recyclerView2;
                        this.f82541d = simpleItemAnimator;
                        this.f82542e = objectRef;
                        this.f82543f = arrayList;
                        this.f82544g = fVar4;
                        this.h = stateFlow;
                    }

                    public final Object invoke(Object obj2) {
                        k.a aVar3 = this.f82539b;
                        SimpleItemAnimator simpleItemAnimator2 = this.f82541d;
                        Ref.ObjectRef objectRef2 = this.f82542e;
                        com.bilibili.app.gemini.ui.f fVar5 = this.f82544g;
                        return VideoDownloadDialog$combineSeasonDownloadView$2.invokeSuspend$lambda$1$1(this.f82538a, aVar3, this.f82540c, simpleItemAnimator2, objectRef2, this.f82543f, fVar5, this.h, (UIComponent) obj2);
                    }
                }));
            }
            this.$selectView.setItemAnimator(null);
            ((List) objectRef.element).add(new com.bilibili.app.gemini.ui.m());
            ((List) objectRef.element).add(new w(this.this$0.f82489b.size() > 1 ? 122 : 20));
            fVar4.N((List) objectRef.element);
            MutableStateFlow3.setValue(Boxing.boxLong(System.currentTimeMillis()));
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(MutableStateFlow2, MutableStateFlow, this.this$0, this.$tabView, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(MutableStateFlow3, this.$currentCidFlow, this.$selectView, arrayList, null), 3, (Object) null);
            try {
                this.L$0 = fVar;
                this.L$1 = fVar4;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.L$2 = bVar2;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar2 = fVar4;
                bVar = bVar2;
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                th = th;
                fVar2 = fVar4;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) this.L$2;
            fVar2 = (com.bilibili.app.gemini.ui.f) this.L$1;
            fVar = (com.bilibili.app.gemini.ui.f) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                try {
                    throw new KotlinNothingValueException();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        this.$selectView.removeOnScrollListener(bVar);
        fVar.N(CollectionsKt.emptyList());
        fVar2.N(CollectionsKt.emptyList());
        throw th;
    }
}

package com.bilibili.ship.theseus.united.page.intro;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ogv.secondary.part.H;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import com.bilibili.ship.theseus.united.widget.UnitedRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService.class */
@StabilityInferred(parameters = 0)
public final class IntroRecycleViewService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f100036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f100037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f100038d = i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public UnitedRecyclerView f100039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<h> f100040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<RecyclerView.OnScrollListener> f100041g;

    @NotNull
    public final MutableStateFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100042i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f100043j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f100044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final b f100045l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.united.page.performance.a $performanceTracker;
        int label;
        final IntroRecycleViewService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(IntroRecycleViewService introRecycleViewService, com.bilibili.ship.theseus.united.page.performance.a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = introRecycleViewService;
            this.$performanceTracker = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$performanceTracker, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.label
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L23
                r0 = r9
                r1 = 1
                if (r0 != r1) goto L19
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                goto L54
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L23:
                r0 = r8
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r7
                com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService r0 = r0.this$0
                com.bilibili.app.gemini.ui.f r0 = r0.f100038d
                r8 = r0
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r8
                kotlinx.coroutines.CompletableDeferred r0 = r0.b
                r1 = r7
                java.lang.Object r0 = r0.await(r1)
                r8 = r0
                r0 = r8
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L49
                goto L4d
            L49:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r8 = r0
            L4d:
                r0 = r8
                r1 = r10
                if (r0 != r1) goto L54
                r0 = r10
                return r0
            L54:
                r0 = r7
                com.bilibili.ship.theseus.united.page.performance.a r0 = r0.$performanceTracker
                tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl r0 = r0.f102235a
                r10 = r0
                r0 = r10
                tv.danmaku.bili.videopage.common.performance.b r0 = r0.c
                r8 = r0
                r0 = r8
                if (r0 == 0) goto Lb7
                r0 = r8
                boolean r0 = r0.a
                if (r0 != 0) goto Lb7
                r0 = r10
                boolean r0 = r0.e
                if (r0 != 0) goto Lb7
                r0 = r10
                r1 = 1
                r0.e = r1
                r0 = r10
                tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl$Entry r1 = tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl.Entry.ON_DETAIL_IMAGE_BIND
                long r2 = android.os.SystemClock.elapsedRealtime()
                tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl$Entry r1 = r1.attach(r2)
                r0.b(r1)
                r0 = r10
                com.alibaba.fastjson.JSONObject r0 = r0.a
                java.lang.String r1 = "biz_type"
                java.lang.Object r0 = r0.get(r1)
                r8 = r0
                r0 = r8
                if (r0 == 0) goto La4
                r0 = r8
                java.lang.String r0 = r0.toString()
                r10 = r0
                r0 = r10
                r8 = r0
                r0 = r10
                if (r0 != 0) goto La1
                goto La4
            La1:
                goto Laa
            La4:
                java.lang.String r0 = ""
                r8 = r0
                goto La1
            Laa:
                com.bilibili.lib.performance.BootOpt r0 = com.bilibili.lib.performance.BootOpt.INSTANCE
                com.bilibili.lib.performance.Scene r1 = com.bilibili.lib.performance.Scene.UGC_VIDEO_FIRST_SCREEN
                r2 = 0
                r3 = r8
                r4 = 2
                r5 = 0
                com.bilibili.lib.performance.BootOpt.reportAwakeTime$default(r0, r1, r2, r3, r4, r5)
            Lb7:
                java.lang.String r0 = "IntroRecycleViewService$3-invokeSuspend"
                java.lang.String r1 = "[theseus-united-IntroRecycleViewService$3-invokeSuspend] bindRecyclerView, traceImageLoading end"
                tv.danmaku.android.log.BLog.i(r0, r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$a.class */
    public static final class a extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final d f100046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final e f100047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f100048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final f f100049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f100050e = DimenUtilsKt.dpToPx(12);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final Paint f100051f;

        public a(@NotNull d dVar, @NotNull e eVar, float f7, @NotNull f fVar) {
            this.f100046a = dVar;
            this.f100047b = eVar;
            this.f100048c = f7;
            this.f100049d = fVar;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.f100051f = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            int childAdapterPosition;
            Pair pair;
            int iIntValue;
            int iIntValue2;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) == -1 || (pair = (Pair) this.f100046a.invoke(Integer.valueOf(childAdapterPosition))) == null) {
                return;
            }
            int iRoundToInt = ((Boolean) this.f100049d.invoke(Integer.valueOf(childAdapterPosition))).booleanValue() ? MathKt.roundToInt(this.f100048c) : 0;
            boolean z6 = layoutManager instanceof GridLayoutManager;
            int i7 = this.f100050e;
            if (!z6) {
                if (layoutManager instanceof LinearLayoutManager) {
                    rect.set(((Number) pair.getFirst()).intValue() - i7, 0, ((Number) pair.getSecond()).intValue() - i7, iRoundToInt);
                }
            } else {
                if (((GridLayoutManager) layoutManager).getSpanSizeLookup().getSpanSize(childAdapterPosition) != 1) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                GridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof GridLayoutManager.LayoutParams ? (GridLayoutManager.LayoutParams) layoutParams : null;
                if ((layoutParams2 != null ? layoutParams2.getSpanIndex() : 0) == 0) {
                    iIntValue2 = ((Number) pair.getFirst()).intValue() - i7;
                    iIntValue = 0;
                } else {
                    iIntValue = ((Number) pair.getSecond()).intValue() - i7;
                    iIntValue2 = 0;
                }
                rect.set(iIntValue2, 0, iIntValue, iRoundToInt);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Pair pair;
            Pair pair2;
            float width;
            float fIntValue;
            this.f100051f.setColor(((Number) this.f100047b.invoke()).intValue());
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            boolean z6 = layoutManager instanceof GridLayoutManager;
            float f7 = this.f100048c;
            d dVar = this.f100046a;
            f fVar = this.f100049d;
            if (!z6) {
                if (layoutManager instanceof LinearLayoutManager) {
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = recyclerView.getChildAt(i7);
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                        if (childAdapterPosition != -1 && ((Boolean) fVar.invoke(Integer.valueOf(childAdapterPosition))).booleanValue() && (pair = (Pair) dVar.invoke(Integer.valueOf(childAdapterPosition))) != null) {
                            float bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                            canvas.drawRect(((Number) pair.getFirst()).intValue(), bottom, recyclerView.getWidth(), bottom + f7, this.f100051f);
                        }
                    }
                    return;
                }
                return;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt2 = recyclerView.getChildAt(i8);
                int childAdapterPosition2 = recyclerView.getChildAdapterPosition(childAt2);
                if (childAdapterPosition2 != -1 && ((Boolean) fVar.invoke(Integer.valueOf(childAdapterPosition2))).booleanValue() && (pair2 = (Pair) dVar.invoke(Integer.valueOf(childAdapterPosition2))) != null) {
                    GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) childAt2.getLayoutParams();
                    float bottom2 = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (layoutParams.getSpanIndex() == 0) {
                        fIntValue = ((Number) pair2.getFirst()).intValue();
                        width = childAt2.getRight();
                    } else {
                        float left = childAt2.getLeft();
                        float f8 = this.f100050e;
                        width = recyclerView.getWidth();
                        fIntValue = left + f8;
                    }
                    canvas.drawRect(fIntValue, bottom2, width, bottom2 + f7, this.f100051f);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/IntroRecycleViewService$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IntroRecycleViewService f100052a;

        public b(IntroRecycleViewService introRecycleViewService) {
            this.f100052a = introRecycleViewService;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            Iterator<T> it = this.f100052a.f100041g.iterator();
            while (it.hasNext()) {
                ((RecyclerView.OnScrollListener) it.next()).onScrollStateChanged(recyclerView, i7);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            Iterator<T> it = this.f100052a.f100041g.iterator();
            while (it.hasNext()) {
                ((RecyclerView.OnScrollListener) it.next()).onScrolled(recyclerView, i7, i8);
            }
        }
    }

    @Inject
    public IntroRecycleViewService(@NotNull CoroutineScope coroutineScope, @NotNull List<RunningUIComponent> list, @NotNull com.bilibili.ship.theseus.united.page.performance.a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull ActivityColorRepository activityColorRepository) {
        this.f100035a = coroutineScope;
        this.f100036b = introContentSizeRepository;
        this.f100037c = activityColorRepository;
        ArrayList arrayList = new ArrayList();
        this.f100040f = arrayList;
        this.f100041g = new ArrayList();
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.h = MutableStateFlow;
        this.f100042i = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f100043j = MutableStateFlow2;
        this.f100044k = FlowKt.asStateFlow(MutableStateFlow2);
        this.f100045l = new b(this);
        for (RunningUIComponent runningUIComponent : list) {
            Job jobLaunch$default = BuildersKt.launch$default(this.f100035a, (CoroutineContext) null, (CoroutineStart) null, new IntroRecycleViewService$1$job$1(runningUIComponent, null), 3, (Object) null);
            UIComponent uIComponent = runningUIComponent.a;
            arrayList.add(new h(uIComponent, jobLaunch$default, runningUIComponent.b, uIComponent instanceof z0));
        }
        this.f100038d.N(com.bilibili.ogv.infra.util.g.a(this.f100040f, new H(1)));
        BuildersKt.launch$default(this.f100035a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, aVar, null), 3, (Object) null);
    }

    public final void a(@NotNull RecyclerView.OnScrollListener onScrollListener) {
        if (((ArrayList) this.f100041g).contains(onScrollListener)) {
            return;
        }
        ((ArrayList) this.f100041g).add(onScrollListener);
    }

    @Nullable
    public final Object b(@NotNull UnitedRecyclerView unitedRecyclerView, @NotNull Continuation<? super Unit> continuation) {
        BLog.i("IntroRecycleViewService", "bindRecyclerView");
        this.f100039e = unitedRecyclerView;
        unitedRecyclerView.setAdapter(this.f100038d);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new IntroRecycleViewService$bindRecyclerView$2(this, unitedRecyclerView, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final void c(final int i7, @NotNull List list) {
        List<RunningUIComponent> list2 = list;
        final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (RunningUIComponent runningUIComponent : list2) {
            Job jobLaunch$default = BuildersKt.launch$default(this.f100035a, (CoroutineContext) null, (CoroutineStart) null, new IntroRecycleViewService$insertComponents$items$1$job$1(runningUIComponent, null), 3, (Object) null);
            UIComponent uIComponent = runningUIComponent.a;
            arrayList.add(new h(uIComponent, jobLaunch$default, runningUIComponent.b, uIComponent instanceof z0));
        }
        ((ArrayList) this.f100040f).addAll(i7, arrayList);
        UnitedRecyclerView unitedRecyclerView = this.f100039e;
        if (unitedRecyclerView == null) {
            return;
        }
        if (unitedRecyclerView.isComputingLayout()) {
            unitedRecyclerView.post(new Runnable(this, i7, arrayList) { // from class: com.bilibili.ship.theseus.united.page.intro.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IntroRecycleViewService f100056a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f100057b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final List f100058c;

                {
                    this.f100056a = this;
                    this.f100057b = i7;
                    this.f100058c = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IntroRecycleViewService introRecycleViewService = this.f100056a;
                    introRecycleViewService.f100038d.notifyItemRangeInserted(this.f100057b, this.f100058c.size());
                }
            });
        } else {
            this.f100038d.notifyItemRangeInserted(i7, arrayList.size());
        }
    }

    public final void d(@NotNull UIComponent<?> uIComponent) {
        Iterator it = ((ArrayList) this.f100040f).iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (Intrinsics.areEqual(((h) it.next()).f100064a, uIComponent)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            BLog.i("IntroRecycleViewService", "removeComponent, index is invalid");
            return;
        }
        Job.DefaultImpls.cancel$default(((h) ((ArrayList) this.f100040f).remove(i7)).f100065b, (CancellationException) null, 1, (Object) null);
        UnitedRecyclerView unitedRecyclerView = this.f100039e;
        if (unitedRecyclerView == null) {
            return;
        }
        if (!unitedRecyclerView.isComputingLayout()) {
            this.f100038d.notifyItemRemoved(i7);
        } else {
            final int i8 = i7;
            unitedRecyclerView.post(new Runnable(this, i8) { // from class: com.bilibili.ship.theseus.united.page.intro.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IntroRecycleViewService f100054a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f100055b;

                {
                    this.f100054a = this;
                    this.f100055b = i8;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IntroRecycleViewService introRecycleViewService = this.f100054a;
                    introRecycleViewService.f100038d.notifyItemRemoved(this.f100055b);
                }
            });
        }
    }

    public final void e(@NotNull RunningUIComponent runningUIComponent, @NotNull UIComponent<?> uIComponent) {
        UIComponent uIComponent2 = runningUIComponent.a;
        BLog.i("IntroRecycleViewService", "replaceComponent, " + uIComponent2.getClass() + " " + uIComponent.getClass());
        Iterator it = ((ArrayList) this.f100040f).iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (Intrinsics.areEqual(((h) it.next()).f100064a, uIComponent)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            BLog.i("IntroRecycleViewService", "replaceComponent, index is invalid");
            return;
        }
        Job.DefaultImpls.cancel$default(((h) ((ArrayList) this.f100040f).remove(i7)).f100065b, (CancellationException) null, 1, (Object) null);
        ((ArrayList) this.f100040f).add(i7, new h(uIComponent2, BuildersKt.launch$default(this.f100035a, (CoroutineContext) null, (CoroutineStart) null, new IntroRecycleViewService$replaceComponent$job$1(runningUIComponent, null), 3, (Object) null), runningUIComponent.b, uIComponent2 instanceof z0));
        UnitedRecyclerView unitedRecyclerView = this.f100039e;
        if (unitedRecyclerView == null) {
            return;
        }
        if (unitedRecyclerView.isComputingLayout()) {
            unitedRecyclerView.post(new com.bilibili.bilibililive.streaming.pandora.core.f(this, i7, 1));
        } else {
            this.f100038d.notifyItemChanged(i7);
        }
    }
}

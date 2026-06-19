package com.bilibili.playerbizcommon.features.subtitle;

import Hh0.ViewOnClickListenerC2129b;
import Hh0.ViewOnClickListenerC2130c;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.annotation.FloatRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.analytics.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import c6.Q;
import com.bapis.bilibili.community.service.dm.v1.SubtitleItem;
import com.bapis.bilibili.community.service.dm.v1.VideoSubtitle;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fr0.C7151E;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2.class */
public final class SubtitleMultiSelectDialog2 extends ComponentDialog {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f79930v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f79931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.subtitle.a f79932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f79933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f79934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Group f79935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f79936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f79937g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RecyclerView f79938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public RecyclerView f79939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public View f79940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f79941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f79942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final a f79943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f79944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public VideoSubtitle f79946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ArrayList<C7151E> f79947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<?> f79948s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final d f79949t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final c f79950u;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$a.class */
    public final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f79951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<C7151E> f79952b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f79953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SubtitleMultiSelectDialog2 f79954d;

        public a(SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2, boolean z6) {
            this.f79954d = subtitleMultiSelectDialog2;
            this.f79951a = z6;
        }

        public final void N(@NotNull List<C7151E> list) {
            this.f79952b.clear();
            this.f79952b.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f79952b.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11) {
            /*
                Method dump skipped, instruction units count: 419
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.subtitle.SubtitleMultiSelectDialog2.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131500975, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f79955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f79956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ImageView f79957c;

        public b(@NotNull View view) {
            super(view);
            this.f79955a = (TextView) view.findViewById(2131308733);
            this.f79956b = view.findViewById(2131311975);
            this.f79957c = (ImageView) view.findViewById(2131320261);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$c.class */
    public static final class c extends RecyclerView.SimpleOnItemTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubtitleMultiSelectDialog2 f79958a;

        public c(SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2) {
            this.f79958a = subtitleMultiSelectDialog2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                try {
                    BottomSheetBehavior<?> bottomSheetBehavior = this.f79958a.f79948s;
                    if (bottomSheetBehavior != null) {
                        Field declaredField = bottomSheetBehavior.getClass().getDeclaredField("nestedScrollingChildRef");
                        declaredField.setAccessible(true);
                        declaredField.set(bottomSheetBehavior, new WeakReference(recyclerView));
                    }
                } catch (Exception e7) {
                    B.a("cannot set nestedScrollingChildRef ", e7);
                }
            }
            return super.onInterceptTouchEvent(recyclerView, motionEvent);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$d.class */
    public static final class d implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubtitleMultiSelectDialog2 f79959a;

        public d(SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2) {
            this.f79959a = subtitleMultiSelectDialog2;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2 = this.f79959a;
            subtitleMultiSelectDialog2.getClass();
            BLog.i("SubtitleMultiSelectDialog2", "video item start");
            subtitleMultiSelectDialog2.dismiss();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$e.class */
    public static final class e extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubtitleMultiSelectDialog2 f79960a;

        public e(SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2) {
            this.f79960a = subtitleMultiSelectDialog2;
        }

        public final void onSlide(View view, float f7) {
            float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
            SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2 = this.f79960a;
            Window window = subtitleMultiSelectDialog2.getWindow();
            if (window != null) {
                window.setDimAmount(f8 * subtitleMultiSelectDialog2.f79933c);
            }
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f79960a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.subtitle.SubtitleMultiSelectDialog2$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$onCreate$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        int label;
        final SubtitleMultiSelectDialog2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.subtitle.SubtitleMultiSelectDialog2$onCreate$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/SubtitleMultiSelectDialog2$onCreate$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<WindowSizeClass> $windowSize;
            Object L$0;
            int label;
            final SubtitleMultiSelectDialog2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$windowSize = objectRef;
                this.this$0 = subtitleMultiSelectDialog2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                if (!Intrinsics.areEqual(this.$windowSize.element, windowSizeClass)) {
                    this.$windowSize.element = windowSizeClass;
                    SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2 = this.this$0;
                    int i7 = SubtitleMultiSelectDialog2.f79930v;
                    subtitleMultiSelectDialog2.m(windowSizeClass);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SubtitleMultiSelectDialog2 subtitleMultiSelectDialog2, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = subtitleMultiSelectDialog2;
            this.$windowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$windowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f79931a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public /* synthetic */ SubtitleMultiSelectDialog2(ComponentActivity componentActivity, com.bilibili.playerbizcommon.features.subtitle.a aVar) {
        this(componentActivity, aVar, 0.5f);
    }

    public SubtitleMultiSelectDialog2(@NotNull ComponentActivity componentActivity, @NotNull com.bilibili.playerbizcommon.features.subtitle.a aVar, @FloatRange(from = 0.0d, to = 1.0d) float f7) {
        super(componentActivity, 2131886161);
        this.f79931a = componentActivity;
        this.f79932b = aVar;
        this.f79933c = f7;
        this.f79942m = new a(this, false);
        this.f79943n = new a(this, true);
        this.f79947r = new ArrayList<>();
        this.f79949t = new d(this);
        this.f79950u = new c(this);
    }

    public static void k(String str) {
        if (str == null) {
            return;
        }
        BLog.i("SubtitleMultiSelectDialog2", str);
    }

    public final void j(boolean z6) {
        C7151E c7151e;
        C7151E c7151e2;
        C7151E c7151e3;
        C7151E next;
        C7151E c7151e4;
        C7151E c7151e5;
        if (this.f79947r.isEmpty()) {
            BLog.i("SubtitleMultiSelectDialog2", "configSelectData,items is empty");
            return;
        }
        IInteractLayerService interactLayerService = this.f79932b.getInteractLayerService();
        if (interactLayerService == null) {
            return;
        }
        boolean z7 = this.f79944o;
        boolean z8 = this.f79945p;
        StringBuilder sbA = Q.a("configSelectData, ", " ", " ", z6, z7);
        sbA.append(z8);
        k(sbA.toString());
        if (z6) {
            if (this.f79945p && this.f79944o) {
                SubtitleItem mainSubtitle = interactLayerService.getMainSubtitle();
                SubtitleItem subtitleItemChooseMainSubtitle$default = mainSubtitle;
                if (mainSubtitle == null) {
                    subtitleItemChooseMainSubtitle$default = IInteractLayerService.chooseMainSubtitle$default(interactLayerService, false, 1, (Object) null);
                }
                SubtitleItem viceSubtitle = interactLayerService.getViceSubtitle();
                SubtitleItem subtitleItemChooseViceSubtitle$default = viceSubtitle;
                if (viceSubtitle == null) {
                    subtitleItemChooseViceSubtitle$default = IInteractLayerService.chooseViceSubtitle$default(interactLayerService, false, 1, (Object) null);
                }
                Iterator<C7151E> it = this.f79947r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c7151e4 = null;
                        break;
                    }
                    C7151E next2 = it.next();
                    if (Intrinsics.areEqual(next2.f119237a, subtitleItemChooseMainSubtitle$default != null ? subtitleItemChooseMainSubtitle$default.getLan() : null)) {
                        c7151e4 = next2;
                        break;
                    }
                }
                C7151E c7151e6 = c7151e4;
                C7151E c7151e7 = c7151e6;
                if (c7151e6 == null) {
                    c7151e7 = (C7151E) CollectionsKt.first(this.f79947r);
                }
                Iterator<C7151E> it2 = this.f79947r.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c7151e5 = null;
                        break;
                    }
                    C7151E next3 = it2.next();
                    if (Intrinsics.areEqual(next3.f119237a, subtitleItemChooseViceSubtitle$default != null ? subtitleItemChooseViceSubtitle$default.getLan() : null)) {
                        c7151e5 = next3;
                        break;
                    }
                }
                C7151E c7151e8 = c7151e5;
                next = c7151e8;
                c7151e3 = c7151e7;
                if (c7151e8 == null) {
                    Iterator<C7151E> it3 = this.f79947r.iterator();
                    while (it3.hasNext()) {
                        next = it3.next();
                        if (!Intrinsics.areEqual(next.f119237a, c7151e7.f119237a)) {
                            c7151e3 = c7151e7;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            } else {
                ArrayList<C7151E> arrayList = this.f79947r;
                IInteractLayerService interactLayerService2 = this.f79932b.getInteractLayerService();
                if (interactLayerService2 == null) {
                    c7151e2 = null;
                } else {
                    boolean zIsForbidCloseSubtitle = interactLayerService2.isForbidCloseSubtitle();
                    if (interactLayerService2.getMainSubtitle() == null) {
                        c7151e2 = (C7151E) CollectionsKt.lastOrNull(arrayList);
                    } else if (arrayList.size() == 1 && arrayList.get(0).f119239c == 2 && zIsForbidCloseSubtitle) {
                        c7151e2 = (C7151E) CollectionsKt.lastOrNull(arrayList);
                    } else {
                        SubtitleItem mainSubtitle2 = interactLayerService2.getMainSubtitle();
                        SubtitleItem subtitleItemChooseMainSubtitle$default2 = mainSubtitle2;
                        if (mainSubtitle2 == null) {
                            subtitleItemChooseMainSubtitle$default2 = IInteractLayerService.chooseMainSubtitle$default(interactLayerService2, false, 1, (Object) null);
                        }
                        Iterator<C7151E> it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                c7151e = null;
                                break;
                            }
                            C7151E next4 = it4.next();
                            if (Intrinsics.areEqual(next4.f119237a, subtitleItemChooseMainSubtitle$default2 != null ? subtitleItemChooseMainSubtitle$default2.getLan() : null)) {
                                c7151e = next4;
                                break;
                            }
                        }
                        c7151e2 = c7151e;
                    }
                }
                C7151E c7151e9 = c7151e2;
                if (c7151e2 == null) {
                    c7151e9 = (C7151E) CollectionsKt.last(this.f79947r);
                }
                c7151e3 = c7151e9;
                next = null;
            }
            SubtitleItem subtitleItemB = Oi1.c.b(this.f79946q, c7151e3.f119237a);
            if (this.f79945p && this.f79944o) {
                String str = null;
                if (next != null) {
                    str = next.f119237a;
                }
                interactLayerService.loadSubtitle(subtitleItemB, Oi1.c.b(this.f79946q, str));
            } else {
                interactLayerService.loadSubtitle(subtitleItemB, (SubtitleItem) null);
            }
            IInteractLayerService.recordSelectedSubtitle$default(interactLayerService, false, true, false, 1, (Object) null);
        }
        if (this.f79945p && this.f79944o) {
            this.f79942m.N(this.f79947r);
            this.f79943n.N(this.f79947r);
        } else {
            this.f79942m.N(this.f79947r);
            this.f79943n.N(CollectionsKt.emptyList());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.subtitle.SubtitleMultiSelectDialog2.l():void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void m(WindowSizeClass windowSizeClass) throws NoWhenBranchMatchedException {
        G.a aVar;
        int iDpToPx;
        G.b bVar = G.b.a;
        if (KScreenAdjustUtilsKt.isMedium(windowSizeClass) || KScreenAdjustUtilsKt.isLargeLandscape(windowSizeClass) || KScreenAdjustUtilsKt.isLargePortrait(windowSizeClass)) {
            aVar = new G.a(0.6f);
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.functionPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        } else {
            aVar = G.b.a;
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        }
        View view = this.f79940k;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (Intrinsics.areEqual(aVar, G.b.a)) {
                layoutParams2.dimensionRatio = "w,9:16";
                layoutParams2.matchConstraintPercentHeight = 1.0f;
            } else {
                if (!(aVar instanceof G.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutParams2.matchConstraintPercentHeight = 1 - aVar.a;
            }
            view.setLayoutParams(layoutParams2);
        }
        View view2 = this.f79941l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.matchConstraintMaxWidth = iDpToPx;
            view2.setLayoutParams(layoutParams4);
        }
        BLog.i("SubtitleMultiSelectDialog2", "onCreate: windowSize=" + windowSizeClass + ", topRatio=" + aVar);
    }

    public final void n(boolean z6, boolean z7) {
        StringBuilder sbA = Q.a("updateMultiSwitch, ", " ", " ", this.f79945p, z6);
        sbA.append(z7);
        k(sbA.toString());
        if (this.f79945p) {
            this.f79944o = z6;
            if (z7) {
                this.f79932b.d(new NeuronsEvents.NormalEvent("player.player.subtitle.bilingual.player", new String[]{"switch", z6 ? "1" : "0"}));
            }
            TextView textView = this.f79937g;
            if (textView != null) {
                textView.setVisibility(z6 ? 0 : 8);
            }
            TextView textView2 = this.h;
            if (textView2 != null) {
                textView2.setVisibility(z6 ? 0 : 8);
            }
            RecyclerView recyclerView = this.f79939j;
            if (recyclerView != null) {
                int i7 = 8;
                if (z6) {
                    i7 = 0;
                }
                recyclerView.setVisibility(i7);
            }
            if (z7) {
                this.f79932b.a(Boolean.valueOf(this.f79944o), "danmaku_subtitle_multi");
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        VideoSubtitle subtitleData;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        setContentView(2131500974);
        findViewById(2131306968).setOnClickListener(new Jb.d(this, 3));
        View viewFindViewById = findViewById(2131299396);
        viewFindViewById.setOnClickListener(new Object());
        this.f79934d = (TextView) findViewById(2131312679);
        this.f79935e = (Group) findViewById(2131312677);
        this.f79936f = (TextView) findViewById(2131317547);
        this.f79937g = (TextView) findViewById(2131312675);
        this.h = (TextView) findViewById(2131312696);
        this.f79938i = (RecyclerView) findViewById(2131312674);
        this.f79939j = (RecyclerView) findViewById(2131312695);
        this.f79940k = findViewById(2131313663);
        this.f79941l = findViewById(2131297591);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.f79931a);
        objectRef.element = windowSizeClassWindowSize;
        m(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, objectRef, null), 3, (Object) null);
        TextView textView = this.f79934d;
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC2129b(this, 3));
        }
        TextView textView2 = this.f79936f;
        if (textView2 != null) {
            textView2.setOnClickListener(new ViewOnClickListenerC2130c(this, 3));
        }
        if (viewFindViewById.getParent() instanceof CoordinatorLayout) {
            BottomSheetBehavior<?> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            this.f79948s = bottomSheetBehaviorFrom;
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
            }
            BottomSheetBehavior<?> bottomSheetBehavior = this.f79948s;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(3);
            }
            e eVar = new e(this);
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.f79948s;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.addBottomSheetCallback(eVar);
            }
        } else {
            ((ImageView) findViewById(2131317046)).setVisibility(4);
            ImageView imageView = (ImageView) findViewById(2131298371);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(DimenUtilsKt.dpToPx(18));
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(com.bilibili.playerbizcommon.features.subtitle.d.a(getContext().getResources().getColor(R$color.Graph_icon, null)));
            imageView.setBackground(gradientDrawable);
        }
        RecyclerView recyclerView = this.f79938i;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.f79938i;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f79942m);
        }
        RecyclerView recyclerView3 = this.f79938i;
        if (recyclerView3 != null) {
            recyclerView3.addOnItemTouchListener(this.f79950u);
        }
        RecyclerView recyclerView4 = this.f79938i;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView5 = this.f79939j;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        RecyclerView recyclerView6 = this.f79939j;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(this.f79943n);
        }
        RecyclerView recyclerView7 = this.f79939j;
        if (recyclerView7 != null) {
            recyclerView7.addOnItemTouchListener(this.f79950u);
        }
        RecyclerView recyclerView8 = this.f79939j;
        if (recyclerView8 != null) {
            recyclerView8.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        BLog.i("SubtitleMultiSelectDialog2", "config select view");
        IInteractLayerService interactLayerService = this.f79932b.getInteractLayerService();
        if (interactLayerService != null && (subtitleData = interactLayerService.getSubtitleData()) != null) {
            this.f79945p = subtitleData.getSubtitlesCount() > 1;
            this.f79946q = subtitleData;
            this.f79947r.clear();
            List<SubtitleItem> subtitlesList = subtitleData.getSubtitlesList();
            if (subtitlesList != null) {
                for (SubtitleItem subtitleItem : subtitlesList) {
                    C7151E c7151e = new C7151E();
                    c7151e.f119237a = subtitleItem.getLan();
                    c7151e.f119238b = subtitleItem.getLanDoc();
                    c7151e.f119239c = subtitleItem.getAiStatusValue();
                    c7151e.f119240d = subtitleItem.getType();
                    this.f79947r.add(c7151e);
                }
            }
            boolean z6 = interactLayerService.getViceSubtitle() != null;
            this.f79944o = z6;
            TextView textView3 = this.f79934d;
            if (textView3 != null) {
                textView3.setSelected(z6);
            }
            boolean zBooleanValue = ((Boolean) this.f79932b.c("danmaku-subtitle-large")).booleanValue();
            TextView textView4 = this.f79936f;
            if (textView4 != null) {
                textView4.setSelected(zBooleanValue);
            }
            if (this.f79945p) {
                Group group = this.f79935e;
                if (group != null) {
                    group.setVisibility(0);
                }
            } else {
                Group group2 = this.f79935e;
                if (group2 != null) {
                    group2.setVisibility(8);
                }
                TextView textView5 = this.f79937g;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                }
                TextView textView6 = this.h;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                RecyclerView recyclerView9 = this.f79939j;
                if (recyclerView9 != null) {
                    recyclerView9.setVisibility(8);
                }
            }
        }
        n(this.f79944o, false);
        j(false);
        this.f79932b.addVideoDirectorObserver(this.f79949t);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(this.f79933c);
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f79947r.clear();
        this.f79942m.N(CollectionsKt.emptyList());
        this.f79943n.N(CollectionsKt.emptyList());
        this.f79932b.removeVideoDirectorObserver(this.f79949t);
    }
}

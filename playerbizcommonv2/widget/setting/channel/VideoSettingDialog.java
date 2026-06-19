package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.utils.bus.GloBus;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.widget.setting.channel.InterfaceC5833b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDialog.class */
@StabilityInferred(parameters = 0)
public final class VideoSettingDialog extends ComponentDialog {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f83208i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f83209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<RunningUIComponent> f83210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f83211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Dr0.o f83213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f83214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f83215g;

    @NotNull
    public final List<C5832a> h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDialog$a.class */
    public static final class a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoSettingDialog f83216a;

        public a(VideoSettingDialog videoSettingDialog) {
            this.f83216a = videoSettingDialog;
        }

        public final void onSlide(View view, float f7) {
            float f8 = f7 > 0.0f ? 1.0f : 1 + f7;
            VideoSettingDialog videoSettingDialog = this.f83216a;
            Window window = videoSettingDialog.getWindow();
            if (window != null) {
                window.setDimAmount(f8 * videoSettingDialog.f83211c);
            }
        }

        public final void onStateChanged(View view, int i7) {
            if (i7 == 5) {
                this.f83216a.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDialog$onCreate$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDialog$onCreate$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        int label;
        final VideoSettingDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDialog$onCreate$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/VideoSettingDialog$onCreate$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<WindowSizeClass> $windowSize;
            Object L$0;
            int label;
            final VideoSettingDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, VideoSettingDialog videoSettingDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$windowSize = objectRef;
                this.this$0 = videoSettingDialog;
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
                    VideoSettingDialog videoSettingDialog = this.this$0;
                    int i7 = VideoSettingDialog.f83208i;
                    videoSettingDialog.j(windowSizeClass);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(VideoSettingDialog videoSettingDialog, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = videoSettingDialog;
            this.$windowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$windowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f83209a);
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

    public VideoSettingDialog(FragmentActivity fragmentActivity, List list, InterfaceC5833b.C0553b c0553b) {
        super(fragmentActivity, 2131886161);
        this.f83209a = fragmentActivity;
        this.f83210b = list;
        this.f83211c = 0.5f;
        this.f83212d = 0;
        this.f83215g = new com.bilibili.app.gemini.ui.f(false);
        this.h = new ArrayList();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void j(WindowSizeClass windowSizeClass) throws NoWhenBranchMatchedException {
        int iDpToPx;
        Object obj;
        if (KScreenAdjustUtilsKt.isMedium(windowSizeClass) || KScreenAdjustUtilsKt.isLargeLandscape(windowSizeClass)) {
            InterfaceC5833b.a aVar = new InterfaceC5833b.a(0.6f);
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.functionPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
            obj = aVar;
        } else if (KScreenAdjustUtilsKt.isLargePortrait(windowSizeClass)) {
            InterfaceC5833b.a aVar2 = new InterfaceC5833b.a(0.6f);
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.functionPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
            obj = aVar2;
        } else {
            InterfaceC5833b.C0553b c0553b = InterfaceC5833b.C0553b.f83223a;
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
            obj = c0553b;
        }
        Dr0.o oVar = this.f83213e;
        Dr0.o oVar2 = oVar;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            oVar2 = null;
        }
        View view = oVar2.f3124f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (Intrinsics.areEqual(obj, InterfaceC5833b.C0553b.f83223a)) {
            layoutParams2.dimensionRatio = "w,9:16";
            layoutParams2.matchConstraintPercentHeight = 1.0f;
        } else {
            if (!(obj instanceof InterfaceC5833b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2.matchConstraintPercentHeight = 1 - ((InterfaceC5833b.a) obj).f83222a;
        }
        view.setLayoutParams(layoutParams2);
        Dr0.o oVar3 = this.f83213e;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            oVar3 = null;
        }
        CoordinatorLayout coordinatorLayout = oVar3.f3120b;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.matchConstraintMaxWidth = iDpToPx;
        coordinatorLayout.setLayoutParams(layoutParams4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        Dr0.o oVarInflate = Dr0.o.inflate(getLayoutInflater());
        this.f83213e = oVarInflate;
        Dr0.o oVar = oVarInflate;
        if (oVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            oVar = null;
        }
        setContentView(oVar.f3119a);
        Dr0.o oVar2 = this.f83213e;
        Dr0.o oVar3 = oVar2;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            oVar3 = null;
        }
        oVar3.f3123e.setOnClickListener(new Mw0.b(this, 2));
        List<RunningUIComponent> list = this.f83210b;
        List<C5832a> list2 = this.h;
        for (RunningUIComponent runningUIComponent : list) {
            ((ArrayList) list2).add(new C5832a(runningUIComponent.a, BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new VideoSettingDialog$onCreate$2$1(runningUIComponent, null), 3, (Object) null)));
        }
        com.bilibili.app.gemini.ui.f fVar = this.f83215g;
        List<C5832a> list3 = this.h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it = ((ArrayList) list3).iterator();
        while (it.hasNext()) {
            arrayList.add(((C5832a) it.next()).f83220a);
        }
        fVar.N(arrayList);
        Dr0.o oVar4 = this.f83213e;
        Dr0.o oVar5 = oVar4;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            oVar5 = null;
        }
        RecyclerView recyclerView = oVar5.f3122d;
        this.f83214f = recyclerView;
        recyclerView.setAdapter(this.f83215g);
        Dr0.o oVar6 = this.f83213e;
        Dr0.o oVar7 = oVar6;
        if (oVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            oVar7 = null;
        }
        LinearLayout linearLayout = oVar7.f3121c;
        linearLayout.setBackground(com.bilibili.playerbizcommonv2.utils.p.o(ContextCompat.getColor(getContext(), R$color.Bg2_float), 12));
        final int i7 = 0;
        linearLayout.setOnClickListener(new View.OnClickListener(i7) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f83258a;

            {
                this.f83258a = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f83258a) {
                    case 0:
                        int i8 = VideoSettingDialog.f83208i;
                        break;
                    default:
                        ReporterV3.reportClick$default("home-discovery", "upcoming", "more", (Map) null, 8, (Object) null);
                        GloBus.get().post(new Ep.a("start_test"));
                        break;
                }
            }
        });
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.f83209a);
        objectRef.element = windowSizeClassWindowSize;
        j(windowSizeClassWindowSize);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, objectRef, null), 3, (Object) null);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(linearLayout);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.addBottomSheetCallback(new a(this));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setDimAmount(this.f83211c);
        }
        if (this.f83212d > 0) {
            RecyclerView recyclerView = this.f83214f;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView2 = null;
            }
            recyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingDialog.onStart.2

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoSettingDialog f83217a;

                {
                    this.f83217a = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    RecyclerView recyclerView3 = this.f83217a.f83214f;
                    RecyclerView recyclerView4 = recyclerView3;
                    if (recyclerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView4 = null;
                    }
                    recyclerView4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f83217a), (CoroutineContext) null, (CoroutineStart) null, new VideoSettingDialog$onStart$2$onGlobalLayout$1(this.f83217a, null), 3, (Object) null);
                }
            });
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.f83214f;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(null);
        this.f83215g.N(CollectionsKt.emptyList());
        for (C5832a c5832a : this.h) {
            if (c5832a.f83221b.isActive()) {
                Job.DefaultImpls.cancel$default(c5832a.f83221b, (CancellationException) null, 1, (Object) null);
            }
        }
    }
}

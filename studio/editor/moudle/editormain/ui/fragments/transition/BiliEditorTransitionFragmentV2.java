package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import A90.o;
import A90.t;
import A90.x;
import G.p;
import I31.A;
import I31.k;
import It0.n;
import TB0.I;
import TB0.g0;
import UD.P;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.node.C4448z;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.common.PlaybackException;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.bilibili.giftPanel.biz.LiveBaseCommonGiftItemPanel;
import com.bilibili.bilibili.giftPanel.biz.panel.page.LiveGiftPrivilegedPanelV2;
import com.bilibili.bililive.room.ui.im.m;
import com.bilibili.bililive.room.ui.roomv3.viewv5.business.common.C0;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import com.bilibili.studio.videoeditor.util.V;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kntr.base.net.comm.g;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionFragmentV2.class */
@AndroidEntryPoint
public final class BiliEditorTransitionFragmentV2 extends Hilt_BiliEditorTransitionFragmentV2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public g0 f107008g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final vy0.b f107009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f107010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Set<Integer> f107011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f107012l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionFragmentV2$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorTransitionFragmentV2 f107013a;

        public a(BiliEditorTransitionFragmentV2 biliEditorTransitionFragmentV2) {
            this.f107013a = biliEditorTransitionFragmentV2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                BiliEditorTransitionFragmentV2 biliEditorTransitionFragmentV2 = this.f107013a;
                CollectionsKt.addAll(biliEditorTransitionFragmentV2.f107011k, new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition));
                BiliEditorTransitionViewModel biliEditorTransitionViewModelLf = biliEditorTransitionFragmentV2.lf();
                List<TransitionSelectItem> value = biliEditorTransitionViewModelLf.f107026o.getValue();
                List<TransitionSelectItem> listEmptyList = value;
                if (value == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                int i9 = -1;
                if (iFindLastVisibleItemPosition == listEmptyList.size() - 1) {
                    TransitionSelectItem transitionSelectItem = (TransitionSelectItem) CollectionsKt.lastOrNull(listEmptyList);
                    if (transitionSelectItem != null) {
                        i9 = transitionSelectItem.tabIndex;
                    }
                } else {
                    TransitionSelectItem transitionSelectItem2 = (TransitionSelectItem) CollectionsKt.getOrNull(listEmptyList, iFindFirstVisibleItemPosition);
                    if (transitionSelectItem2 != null) {
                        i9 = transitionSelectItem2.tabIndex;
                    }
                }
                if (i9 >= 0) {
                    MutableLiveData<Integer> mutableLiveData = biliEditorTransitionViewModelLf.f107027p;
                    Integer value2 = mutableLiveData.getValue();
                    if (value2 != null && i9 == value2.intValue()) {
                        return;
                    }
                    mutableLiveData.setValue(Integer.valueOf(i9));
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionFragmentV2$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f107014a;

        public b(Function1 function1) {
            this.f107014a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f107014a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107014a.invoke(obj);
        }
    }

    public BiliEditorTransitionFragmentV2() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10070invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10071invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BiliEditorTransitionViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10072invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m10073invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$4.m10073invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m10074invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2$special$$inlined$viewModels$default$5.m10074invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f107009i = new vy0.b();
        this.f107010j = LazyKt.lazy(new t(this, 1));
        this.f107011k = new LinkedHashSet();
        this.f107012l = new a(this);
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        BiliEditorTransitionViewModel biliEditorTransitionViewModelLf = lf();
        biliEditorTransitionViewModelLf.getClass();
        biliEditorTransitionViewModelLf.N0(false);
        function1.invoke(Boolean.TRUE);
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        EditVideoInfo editVideoInfo;
        EditVideoInfo editVideoInfoM10450clone;
        BiliEditorTransitionViewModel biliEditorTransitionViewModelLf = lf();
        EditVideoInfo editVideoInfo2 = biliEditorTransitionViewModelLf.f107017e.f4806b;
        if (editVideoInfo2 == null || (editVideoInfoM10450clone = editVideoInfo2.m10450clone()) == null) {
            editVideoInfo = null;
        } else {
            biliEditorTransitionViewModelLf.K0(editVideoInfoM10450clone);
            EditVideoClip userVideoTrack = editVideoInfoM10450clone.getUserVideoTrack();
            editVideoInfo = editVideoInfoM10450clone;
            if (userVideoTrack != null) {
                userVideoTrack.setTransitionInfoList(biliEditorTransitionViewModelLf.f107020i);
                editVideoInfo = editVideoInfoM10450clone;
            }
        }
        return editVideoInfo;
    }

    public final com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.b kf() {
        return (com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.b) this.f107010j.getValue();
    }

    public final BiliEditorTransitionViewModel lf() {
        return (BiliEditorTransitionViewModel) this.h.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mf() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionViewModel r0 = r0.lf()
            com.bilibili.studio.videoeditor.ms.transition.TransitionData$TransitionTabBean r0 = r0.L0()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L17
            r0 = r8
            java.lang.String r0 = r0.name
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L1a
        L17:
            java.lang.String r0 = ""
            r8 = r0
        L1a:
            r0 = r7
            com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionViewModel r0 = r0.lf()
            androidx.lifecycle.MutableLiveData<java.util.List<com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem>> r0 = r0.f107026o
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L32
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r9 = r0
        L32:
            r0 = r7
            java.util.Set<java.lang.Integer> r0 = r0.f107011k
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            aT.e r1 = new aT.e
            r2 = r1
            r3 = r9
            r4 = 2
            r2.<init>(r3, r4)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.mapNotNull(r0, r1)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.distinct(r0)
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 62
            java.lang.String r0 = kotlin.sequences.SequencesKt.e(r0, r1, r2, r3, r4, r5)
            r11 = r0
            java.lang.String r0 = "sdk_type"
            java.lang.String r1 = "Mon"
            Xz0.j.c(r0, r1)
            java.lang.String r0 = "router_topic_id"
            java.lang.String r1 = Xz0.g.f28463b
            Xz0.j.c(r0, r1)
            java.lang.String[] r0 = Xz0.k.f28475b
            java.util.Map r0 = Xz0.j.b(r0)
            r10 = r0
            r0 = r10
            java.util.HashMap r0 = (java.util.HashMap) r0
            r9 = r0
            r0 = r9
            java.lang.String r1 = "tab"
            r2 = r8
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            java.lang.String r1 = "transition_id"
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = 0
            java.lang.String r1 = "creation.new-video-editor.transition.panel.show"
            r2 = r10
            r3 = 0
            r4 = 8
            r5 = 0
            com.bilibili.lib.neuron.api.Neurons.reportExposure$default(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.BiliEditorTransitionFragmentV2.mf():void");
    }

    public final void nf(boolean z6) {
        g0 g0Var = this.f107008g;
        if (g0Var != null) {
            Context context = getContext();
            if (context != null) {
                g0Var.f23793e.setEnabled(z6);
                if (z6) {
                    g0Var.h.setAlpha(1.0f);
                    g0Var.f23795g.setAlpha(1.0f);
                    g0Var.f23793e.setThumb(ContextCompat.getDrawable(context, 2131242820));
                } else {
                    g0Var.h.setAlpha(0.4f);
                    g0Var.f23795g.setAlpha(0.4f);
                    g0Var.f23793e.setThumb(ContextCompat.getDrawable(context, 2131242821));
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void of(long j7, boolean z6) {
        String strA;
        g0 g0Var = this.f107008g;
        if (g0Var != null) {
            TextView textView = g0Var.f23795g;
            if (z6) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strA = String.format("0s", Arrays.copyOf(new Object[0], 0));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(j7 / PlaybackException.CUSTOM_ERROR_CODE_BASE)}, 1));
                strA = StringsKt.w(str, ".0") ? p.a(C4448z.a(2, 0, str), DynamicModel.KEY_ABBR_ADYNAMIC_SWI) : str.concat(DynamicModel.KEY_ABBR_ADYNAMIC_SWI);
            }
            textView.setText(strA);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        g0 g0VarInflate = g0.inflate(layoutInflater, viewGroup, false);
        this.f107008g = g0VarInflate;
        return g0VarInflate != null ? g0VarInflate.f23789a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.adapter.b bVarKf = kf();
        bVarKf.f107041a = null;
        bVarKf.f107043c = null;
        bVarKf.f107042b = null;
        SC0.a aVar = bVarKf.f107047g;
        aVar.getClass();
        UB0.b.b();
        aVar.f22788a = null;
        this.f107008g = null;
    }

    @Override // com.bilibili.studio.editor.moudle.editormain.ui.fragments.BiliEditorMainBaseFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        I i7;
        I i8;
        super.onViewCreated(view, bundle);
        g0 g0Var = this.f107008g;
        if (g0Var != null && (i8 = g0Var.f23790b) != null) {
            i8.f23523b.setVisibility(8);
        }
        BiliEditorTransitionViewModel biliEditorTransitionViewModelLf = lf();
        biliEditorTransitionViewModelLf.getClass();
        BuildersKt.launch$default(((Yv0.c) biliEditorTransitionViewModelLf).b, Dispatchers.getIO(), (CoroutineStart) null, new BiliEditorTransitionViewModel$fetchAllTransition$1(biliEditorTransitionViewModelLf, null), 2, (Object) null);
        BiliEditorTransitionViewModel biliEditorTransitionViewModelLf2 = lf();
        Integer value = biliEditorTransitionViewModelLf2.f107021j.getValue();
        if (value != null) {
            biliEditorTransitionViewModelLf2.f107023l = biliEditorTransitionViewModelLf2.f107015c.j(value.intValue());
        }
        lf().f107021j.observe(getViewLifecycleOwner(), new b(new m(this, 2)));
        g0 g0Var2 = this.f107008g;
        if (g0Var2 != null && (i7 = g0Var2.f23790b) != null) {
            i7.f23525d.setText(2131850589);
            i7.f23523b.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorTransitionFragmentV2 f107037a;

                {
                    this.f107037a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BiliEditorTransitionFragmentV2 biliEditorTransitionFragmentV2 = this.f107037a;
                    if (V.f()) {
                        return;
                    }
                    BiliEditorTransitionViewModel biliEditorTransitionViewModelLf3 = biliEditorTransitionFragmentV2.lf();
                    List<? extends TransitionInfo> list = biliEditorTransitionViewModelLf3.h;
                    cz0.a aVar = biliEditorTransitionViewModelLf3.f107015c;
                    aVar.m(list, false);
                    aVar.l();
                    Xz0.d.f28458a.getClass();
                    Xz0.d.r("转场", "");
                    biliEditorTransitionFragmentV2.mf();
                }
            });
            i7.f23524c.setOnClickListener(new com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.b(0, this));
            Unit unit = Unit.INSTANCE;
        }
        g0 g0Var3 = this.f107008g;
        if (g0Var3 != null) {
            final RecyclerView recyclerView = g0Var3.f23792d;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.setAdapter(this.f107009i);
            this.f107009i.c = new C0(this, 1);
            lf().f107025n.observe(getViewLifecycleOwner(), new b(new n(this, 4)));
            lf().f107027p.observe(getViewLifecycleOwner(), new b(new Function1(this, recyclerView) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliEditorTransitionFragmentV2 f107054a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final RecyclerView f107055b;

                {
                    this.f107054a = this;
                    this.f107055b = recyclerView;
                }

                public final Object invoke(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        vy0.b bVar = this.f107054a.f107009i;
                        bVar.b = num.intValue();
                        bVar.notifyItemRangeChanged(0, bVar.getItemCount(), 1);
                        com.bilibili.studio.videoeditor.extension.p.c(this.f107055b, num.intValue(), null);
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        g0 g0Var4 = this.f107008g;
        if (g0Var4 != null) {
            final RecyclerView recyclerView2 = g0Var4.f23791c;
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.setAdapter(kf());
            recyclerView2.setItemAnimator(null);
            recyclerView2.addOnScrollListener(this.f107012l);
            kf().f107043c = new DK0.j(this, 4);
            kf().f107042b = new DJ.k(this, 3);
            lf().f107026o.observe(getViewLifecycleOwner(), new b(new P(this, 2)));
            lf().f107028q.observe(getViewLifecycleOwner(), new b(new o(this, 3)));
            final int i9 = 1;
            lf().f107030s.observe(getViewLifecycleOwner(), new b(new Function1(recyclerView2, i9) { // from class: FA0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f6023a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f6024b;

                {
                    this.f6023a = i9;
                    this.f6024b = recyclerView2;
                }

                public final Object invoke(Object obj) {
                    Object obj2 = this.f6024b;
                    switch (this.f6023a) {
                        case 0:
                            ((MutableBundleLike) obj).put("param_control", (Bundle) obj2);
                            return Unit.INSTANCE;
                        case 1:
                            Integer num = (Integer) obj;
                            if (num != null) {
                                com.bilibili.studio.videoeditor.extension.p.c((RecyclerView) obj2, num.intValue(), 0);
                            }
                            return Unit.INSTANCE;
                        case 2:
                            int i10 = LiveGiftPrivilegedPanelV2.v;
                            LiveBaseCommonGiftItemPanel.qf((LiveGiftPrivilegedPanelV2) obj2, (ArrayList) obj, false, false, 6);
                            return Unit.INSTANCE;
                        default:
                            A a7 = (A) obj;
                            if (Intrinsics.areEqual(a7.a("x-ticket-status"), "1")) {
                                k.b("ticker", "update");
                                ((g) obj2).update();
                            }
                            return a7;
                    }
                }
            }));
        }
        g0 g0Var5 = this.f107008g;
        if (g0Var5 != null) {
            lf().f107029r.observe(getViewLifecycleOwner(), new b(new x(this, 4)));
            g0Var5.f23793e.setOnSeekBarChangeListener(new d(this));
            g0Var5.f23794f.setOnClickListener(new bk.h(this, 2));
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.TRANSITION;
    }
}

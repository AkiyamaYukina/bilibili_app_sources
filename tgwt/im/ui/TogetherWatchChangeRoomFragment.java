package com.bilibili.tgwt.im.ui;

import DD0.AbstractC1530c;
import HD0.Q;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.ogv.pub.chat.ChangeRoomInitial;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sl0.C8597a;
import sl0.InterfaceC8598b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/TogetherWatchChangeRoomFragment.class */
@StabilityInferred(parameters = 0)
public final class TogetherWatchChangeRoomFragment extends androidx_fragment_app_Fragment implements InterfaceC8598b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EmptyStateView f111276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1530c f111277c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f111280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f111281g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f111282i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Q f111284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ChangeRoomInitial f111285l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bilibili.tgwt.square.h f111288o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f111278d = new com.bilibili.app.gemini.ui.f(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList<UIComponent<?>> f111279e = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f111283j = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C8597a> f111286m = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f111287n = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f111289p = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    public static final void hf(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment) {
        if (!togetherWatchChangeRoomFragment.f111281g || togetherWatchChangeRoomFragment.f111280f) {
            return;
        }
        togetherWatchChangeRoomFragment.f111280f = true;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchChangeRoomFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$loadNextPage$1(togetherWatchChangeRoomFragment, togetherWatchChangeRoomFragment.jf() ? "1" : "0", null), 3, (Object) null);
    }

    @Override // sl0.InterfaceC8598b
    public final void fa(boolean z6) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$changeInVisibility$1(this, z6, null), 3, (Object) null);
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m10570if(boolean z6) {
        if (this.f111280f) {
            return;
        }
        if (z6) {
            EmptyStateView emptyStateView = this.f111276b;
            EmptyStateView emptyStateView2 = emptyStateView;
            if (emptyStateView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmptyStateView");
                emptyStateView2 = null;
            }
            int i7 = EmptyStateView.f73157k;
            emptyStateView2.b(0, false);
        }
        String str = jf() ? "1" : "0";
        C8597a c8597a = (C8597a) this.f111286m.getValue();
        if (c8597a == null) {
            return;
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$getRoomFirstScreenData$1(this, c8597a, c8597a.f127283b, str, null), 3, (Object) null);
    }

    public final boolean jf() {
        boolean z6 = true;
        if (getResources().getConfiguration().orientation == 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleRequireArguments = requireArguments();
        ChangeRoomInitial changeRoomInitial = (ChangeRoomInitial) bundleRequireArguments.getParcelable("changeRoomInitial");
        if (changeRoomInitial == null) {
            throw new IllegalStateException("must have ChangeRoomInitial");
        }
        this.f111285l = changeRoomInitial;
        Q q7 = new Q(new w(this));
        this.f111284k = q7;
        String string = bundleRequireArguments.getString("show_type");
        String str = string;
        if (string == null) {
            str = "0";
        }
        int i7 = Integer.parseInt(str);
        if (i7 != q7.f8265c) {
            q7.f8265c = i7;
            q7.notifyPropertyChanged(575);
        }
        Context contextRequireContext = requireContext();
        ChangeRoomInitial changeRoomInitial2 = this.f111285l;
        ChangeRoomInitial changeRoomInitial3 = null;
        ChangeRoomInitial changeRoomInitial4 = changeRoomInitial2;
        if (changeRoomInitial2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initial");
            changeRoomInitial4 = null;
        }
        String str2 = !changeRoomInitial4.f71482e ? "pgc-video-detail" : jf() ? "watch-together-fullscreen-cinema.change-room-list" : "watch-together-cinema.change-room-list";
        ChangeRoomInitial changeRoomInitial5 = this.f111285l;
        if (changeRoomInitial5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("initial");
        } else {
            changeRoomInitial3 = changeRoomInitial5;
        }
        this.f111288o = new com.bilibili.tgwt.square.h(contextRequireContext, str2, changeRoomInitial3.f71481d);
        this.f111278d.N(this.f111279e);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        AbstractC1530c abstractC1530c = (AbstractC1530c) DataBindingUtil.inflate(layoutInflater, 2131500167, viewGroup, false);
        this.f111277c = abstractC1530c;
        AbstractC1530c abstractC1530c2 = abstractC1530c;
        if (abstractC1530c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            abstractC1530c2 = null;
        }
        Q q7 = this.f111284k;
        Q q8 = q7;
        if (q7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            q8 = null;
        }
        abstractC1530c2.q(q8);
        Q q9 = this.f111284k;
        Q q10 = q9;
        if (q9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            q10 = null;
        }
        boolean z6 = false;
        if (jf()) {
            ChangeRoomInitial changeRoomInitial = this.f111285l;
            ChangeRoomInitial changeRoomInitial2 = changeRoomInitial;
            if (changeRoomInitial == null) {
                Intrinsics.throwUninitializedPropertyAccessException("initial");
                changeRoomInitial2 = null;
            }
            z6 = false;
            if (changeRoomInitial2.f71482e) {
                z6 = true;
            }
        }
        if (z6 != q10.f8264b) {
            q10.f8264b = z6;
            q10.notifyPropertyChanged(333);
        }
        Q q11 = this.f111284k;
        Q q12 = q11;
        if (q11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            q12 = null;
        }
        this.f111283j = q12.f8265c == 1 ? "chat-change-room" : "change-room-page";
        Neurons.reportExposure$default(false, android.support.v4.media.a.a("pgc.", jf() ? "watch-together-fullscreen-cinema.change-room-list" : "watch-together-cinema.change-room-list", ".0.show"), (Map) null, (List) null, 12, (Object) null);
        AbstractC1530c abstractC1530c3 = this.f111277c;
        AbstractC1530c abstractC1530c4 = abstractC1530c3;
        if (abstractC1530c3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            abstractC1530c4 = null;
        }
        abstractC1530c4.f2451w.setOnClickListener(new Jb.d(this, 4));
        AbstractC1530c abstractC1530c5 = this.f111277c;
        if (abstractC1530c5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            abstractC1530c5 = null;
        }
        return abstractC1530c5.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1530c abstractC1530c = this.f111277c;
        AbstractC1530c abstractC1530c2 = abstractC1530c;
        if (abstractC1530c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            abstractC1530c2 = null;
        }
        this.f111276b = abstractC1530c2.f2452x;
        AbstractC1530c abstractC1530c3 = this.f111277c;
        AbstractC1530c abstractC1530c4 = abstractC1530c3;
        if (abstractC1530c3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            abstractC1530c4 = null;
        }
        abstractC1530c4.f2446C.setText(view.getContext().getText(2131836255));
        EmptyStateView emptyStateView = this.f111276b;
        EmptyStateView emptyStateView2 = emptyStateView;
        if (emptyStateView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmptyStateView");
            emptyStateView2 = null;
        }
        emptyStateView2.setBackBtnVisible(8);
        AbstractC1530c abstractC1530c5 = this.f111277c;
        AbstractC1530c abstractC1530c6 = abstractC1530c5;
        if (abstractC1530c5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            abstractC1530c6 = null;
        }
        RecyclerView recyclerView = abstractC1530c6.f2445B;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new x(this));
        recyclerView.addItemDecoration(new y(recyclerView, this));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f111278d);
        com.bilibili.tgwt.square.h hVar = this.f111288o;
        com.bilibili.tgwt.square.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("converter");
            hVar2 = null;
        }
        Q q7 = this.f111284k;
        Q q8 = q7;
        if (q7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            q8 = null;
        }
        hVar2.f112135d = q8.f8264b;
        recyclerView.addOnScrollListener(new z(this));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$initData$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$initData$2(this, null), 3, (Object) null);
    }

    @Override // sl0.InterfaceC8598b
    public final MutableSharedFlow s() {
        return this.f111289p;
    }

    @Override // sl0.InterfaceC8598b
    public final void w9(@NotNull C8597a c8597a) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChangeRoomFragment$dataWhenEpChange$1(this, c8597a, null), 3, (Object) null);
    }
}

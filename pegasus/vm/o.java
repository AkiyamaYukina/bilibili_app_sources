package com.bilibili.pegasus.vm;

import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bili.rvext.ThreadLayoutInflater;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.HolderBridge;
import com.bilibili.pegasus.PegasusHolder;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.PegasusHolderInfo;
import com.bilibili.pegasus.components.customreporter.EventType;
import dagger.hilt.android.scopes.FragmentScoped;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import np0.C8129b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/o.class */
@StabilityInferred(parameters = 0)
@FragmentScoped
public final class o extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8129b f79072a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HolderBridge f79074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BaseFragment f79075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IInlineControl f79076e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79078g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f79079i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolderData> f79073b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<PegasusHolder<?>> f79077f = new ArrayList();

    @NotNull
    public WindowSizeClass h = new WindowSizeClass(0, 0);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/o$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f79080a;

        public a(o oVar) {
            this.f79080a = oVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            Iterator<T> it = this.f79080a.f79077f.iterator();
            while (it.hasNext()) {
                ((PegasusHolder) it.next()).onPageScrollStateChanged(recyclerView, i7);
            }
        }
    }

    @Inject
    public o(@NotNull C8129b c8129b) {
        this.f79072a = c8129b;
        setHasStableIds(true);
        this.f79079i = new a(this);
    }

    public static PegasusHolder N(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof PegasusHolder) {
            return (PegasusHolder) viewHolder;
        }
        throw new IllegalStateException("holder must be a subclass of PegasusHolder");
    }

    public final void O(@NotNull List<? extends PegasusHolderData> list, @NotNull List<? extends PegasusHolderData> list2, @Nullable Function1<? super RecyclerView.Adapter<?>, Unit> function1) {
        ArrayList arrayList = (ArrayList) list;
        com.bilibili.bplus.im.protobuf.a.b(arrayList.size(), list2.size(), "update feed old:", " new:", "PegasusAdapter");
        List mutableList = CollectionsKt.toMutableList(arrayList);
        ((ArrayList) this.f79073b).clear();
        ((ArrayList) this.f79073b).addAll(list2);
        if (function1 != null) {
            function1.invoke(this);
        } else {
            DiffUtil.calculateDiff(new x(mutableList, list2)).dispatchUpdatesTo(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f79073b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        return ((PegasusHolderData) ((ArrayList) this.f79073b).get(i7)).getHolderItemId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return this.f79072a.a(((PegasusHolderData) ((ArrayList) this.f79073b).get(i7)).getHolderType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f79079i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7, @NotNull List<Object> list) {
        super.onBindViewHolder(viewHolder, i7, list);
        String holderType = ((PegasusHolderData) ((ArrayList) this.f79073b).get(i7)).getHolderType();
        Lazy lazy = com.bilibili.pegasus.components.customreporter.l.f75948a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        PegasusHolder pegasusHolderN = N(viewHolder);
        PegasusHolderData pegasusHolderData = (PegasusHolderData) ((ArrayList) this.f79073b).get(i7);
        HolderBridge holderBridge = this.f79074c;
        if (holderBridge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("holderBridge");
            holderBridge = null;
        }
        BaseFragment baseFragment = this.f79075d;
        if (baseFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
            baseFragment = null;
        }
        pegasusHolderN.onBind(pegasusHolderData, holderBridge, baseFragment, this.f79076e, list);
        Unit unit = Unit.INSTANCE;
        com.bilibili.pegasus.components.customreporter.j.a(EventType.CARD_BIND, MapsKt.mapOf(new Pair[]{TuplesKt.to("cost_time", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis)), TuplesKt.to("card_type", holderType)}));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        C8129b c8129b = this.f79072a;
        c8129b.getClass();
        LayoutInflater layoutInflaterFrom = ThreadLayoutInflater.Companion.from(viewGroup.getContext());
        PegasusHolderInfo<? extends PegasusHolderData, ?> pegasusHolderInfo = c8129b.f124349a.get(i7);
        String viewType = pegasusHolderInfo.getViewType();
        Lazy lazy = com.bilibili.pegasus.components.customreporter.l.f75948a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        RecyclerView.ViewHolder viewHolderOnCreateHolder = pegasusHolderInfo.onCreateHolder(viewGroup, layoutInflaterFrom);
        com.bilibili.pegasus.components.customreporter.j.a(EventType.CARD_CREATE, MapsKt.mapOf(new Pair[]{TuplesKt.to("cost_time", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis)), TuplesKt.to("is_main_thread", String.valueOf(Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread()))), TuplesKt.to("card_type", viewType)}));
        return viewHolderOnCreateHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f79079i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        ((ArrayList) this.f79077f).add(N(viewHolder));
        N(viewHolder).onWindowSizeChanged(this.h);
        N(viewHolder).onPageVisibleStateChanged(this.f79078g);
        N(viewHolder).onAttach();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        ((ArrayList) this.f79077f).remove(N(viewHolder));
        N(viewHolder).onDetach();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        N(viewHolder).onRecycle();
    }
}

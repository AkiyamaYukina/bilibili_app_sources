package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import By0.S0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.e;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.s;
import fu0.C7199v;
import fu0.H;
import fu0.I;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/e.class */
@StabilityInferred(parameters = 0)
public final class e extends com.bilibili.app.gemini.ui.m<C7199v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f89950a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/e$a.class */
    public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final w f89951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f89952b;

        public a(@NotNull e eVar, w wVar, int i7) {
            this.f89951a = wVar;
            this.f89952b = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int size = this.f89951a.f90013a.f89999b.size();
            return size > 0 ? size + 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            return i7 < getItemCount() - 1 ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, final int i7) {
            boolean z6 = viewHolder instanceof b;
            w wVar = this.f89951a;
            if (z6) {
                final b bVar = (b) viewHolder;
                u uVar = (u) CollectionsKt.getOrNull(wVar.f90013a.f89999b, i7);
                H h = bVar.f89953a;
                h.f119442a.setOnClickListener(new View.OnClickListener(bVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final e.b f89960a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f89961b;

                    {
                        this.f89960a = bVar;
                        this.f89961b = i7;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f89960a.f89954b.f90015c.invoke(new s.a(this.f89961b));
                    }
                });
                ImageRequestBuilder imageRequestBuilderUrl = BiliImageLoader.INSTANCE.with(h.f119442a.getContext()).url(uVar != null ? uVar.f90002a : null);
                ScalableImageView2 scalableImageView2 = h.f119445d;
                imageRequestBuilderUrl.into(scalableImageView2);
                h.h.setText(uVar != null ? uVar.f90003b : null);
                h.f119448g.setText(uVar != null ? uVar.f90004c : null);
                String str = null;
                if (uVar != null) {
                    str = uVar.f90006e;
                }
                h.f119444c.setText(str);
                int i8 = bVar.f89955c;
                CommonExtensionKt.setMarginLeft(scalableImageView2, DimenUtilsKt.dpToPx(i8));
                CommonExtensionKt.setMarginRight(h.f119447f, DimenUtilsKt.dpToPx(i8));
            } else if (viewHolder instanceof c) {
                c cVar = (c) viewHolder;
                v vVar = wVar.f90013a.f90000c;
                I i9 = cVar.f89956a;
                i9.f119450b.setText(vVar.f90010a);
                String str2 = vVar.f90012c;
                if (str2.length() > 0) {
                    i9.f119451c.setVisibility(0);
                    i9.f119451c.setText(str2);
                    i9.f119451c.setOnClickListener(new S0(cVar, 3));
                }
            }
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(viewHolder.itemView, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Function0(this, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.recommend.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e.a f89948a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89949b;

                {
                    this.f89948a = this;
                    this.f89949b = i7;
                }

                public final Object invoke() {
                    e.a aVar = this.f89948a;
                    List<u> list = aVar.f89951a.f90013a.f89999b;
                    int i10 = this.f89949b;
                    aVar.f89951a.f90015c.invoke(new s.d((u) CollectionsKt.getOrNull(list, i10), i10));
                    return Unit.INSTANCE;
                }
            }));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            w wVar = this.f89951a;
            return i7 == 1 ? new b(H.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), wVar, this.f89952b) : new c(I.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), wVar);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/e$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final H f89953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final w f89954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f89955c;

        public b(@NotNull H h, @NotNull w wVar, int i7) {
            super(h.f119442a);
            this.f89953a = h;
            this.f89954b = wVar;
            this.f89955c = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/e$c.class */
    public final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final I f89956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final w f89957b;

        public c(@NotNull I i7, @NotNull w wVar) {
            super(i7.f119449a);
            this.f89956a = i7;
            this.f89957b = wVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/e$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f89958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89959b;

        public d(@NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow) {
            this.f89958a = mutableStateFlow;
            this.f89959b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f89958a, dVar.f89958a) && Intrinsics.areEqual(this.f89959b, dVar.f89959b);
        }

        public final int hashCode() {
            return this.f89959b.hashCode() + (this.f89958a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89958a + ", horizontalPaddingFlow=" + this.f89959b + ")";
        }
    }

    public e(@NotNull d dVar) {
        this.f89950a = dVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseRecommendFloatLayerComponent$bind$2(this, (C7199v) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C7199v.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}

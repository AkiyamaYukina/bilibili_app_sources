package com.bilibili.ship.theseus.ugc.intro.mhy;

import N1.o;
import Vu0.A;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/d.class */
@StabilityInferred(parameters = 0)
public final class d extends m<A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f97098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f97100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f97101e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/d$a.class */
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<c, Unit> f97102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<c> f97103b = new ArrayList<>();

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super c, Unit> function1) {
            this.f97102a = function1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f97103b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            c cVar = (c) CollectionsKt.getOrNull(this.f97103b, i7);
            if (cVar == null) {
                return;
            }
            BiliImageLoader.INSTANCE.with(bVar.f97104a.getContext()).url(cVar.f97106b).into(bVar.f97104a);
            bVar.itemView.setOnClickListener(new Vg.c(2, this, cVar));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131500858, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/d$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f97104a;

        public b(@NotNull View view) {
            super(view);
            this.f97104a = view.findViewById(2131301895);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/d$c.class */
    @StabilityInferred(parameters = 1)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f97105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f97106b;

        public c(int i7, @NotNull String str) {
            this.f97105a = i7;
            this.f97106b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f97105a == cVar.f97105a && Intrinsics.areEqual(this.f97106b, cVar.f97106b);
        }

        public final int hashCode() {
            return this.f97106b.hashCode() + (Integer.hashCode(this.f97105a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("StarRail(index=");
            sb.append(this.f97105a);
            sb.append(", image=");
            return C8770a.a(sb, this.f97106b, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.mhy.d$d, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/d$d.class */
    @StabilityInferred(parameters = 0)
    public static final class C0840d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<c> f97108b;

        public C0840d(@NotNull String str, @NotNull List<c> list) {
            this.f97107a = str;
            this.f97108b = list;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0840d)) {
                return false;
            }
            C0840d c0840d = (C0840d) obj;
            return Intrinsics.areEqual(this.f97107a, c0840d.f97107a) && Intrinsics.areEqual(this.f97108b, c0840d.f97108b);
        }

        public final int hashCode() {
            return this.f97108b.hashCode() + (this.f97107a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            List<c> list = this.f97108b;
            return o.a(this.f97107a, ", items=", ")", new StringBuilder("StartRailState(banner="), list);
        }
    }

    public d(int i7, @NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow, @NotNull Function1 function1) {
        this.f97097a = i7;
        this.f97098b = mutableStateFlow;
        this.f97099c = stateFlow;
        this.f97101e = new a(function1);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        A a7 = (A) viewBinding;
        BiliImageView biliImageView = a7.f25782b;
        a7.f25783c.setAdapter(this.f97101e);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcStarRailComponent$bind$2(this, biliImageView, a7, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A aInflate = A.inflate(LayoutInflater.from(context), viewGroup, false);
        RecyclerView recyclerView = aInflate.f25783c;
        e eVar = new e(context, DimenUtilsKt.dpToPx(((Number) this.f97099c.getValue()).intValue() - 6));
        eVar.setDrawable(new ColorDrawable(0));
        recyclerView.addItemDecoration(eVar);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        return aInflate;
    }
}

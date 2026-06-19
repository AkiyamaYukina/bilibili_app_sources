package com.bilibili.ship.theseus.cheese.biz.intro.faq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.ship.theseus.cheese.biz.intro.faq.b;
import com.bilibili.ship.theseus.cheese.biz.intro.faq.g;
import fu0.C7193o;
import fu0.Y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/b.class */
@StabilityInferred(parameters = 0)
public final class b implements UIComponent<n<C7193o>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f89421a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/b$a.class */
    public final class a extends RecyclerView.Adapter<C0613b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.cheese.biz.intro.faq.a f89422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final h f89423b;

        public a(@NotNull b bVar, @NotNull com.bilibili.ship.theseus.cheese.biz.intro.faq.a aVar, h hVar) {
            this.f89422a = aVar;
            this.f89423b = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f89422a.f89420b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            final C0613b c0613b = (C0613b) viewHolder;
            d dVar = (d) CollectionsKt.getOrNull(this.f89422a.f89420b, i7);
            Y y6 = c0613b.f89424a;
            y6.f119519c.setText(dVar != null ? dVar.f89430a : null);
            TextView textView = y6.f119518b;
            String str = null;
            if (dVar != null) {
                str = dVar.f89431b;
            }
            textView.setText(str);
            y6.f119517a.setOnClickListener(new View.OnClickListener(c0613b, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.faq.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b.C0613b f89428a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89429b;

                {
                    this.f89428a = c0613b;
                    this.f89429b = i7;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws NoWhenBranchMatchedException {
                    this.f89428a.f89425b.f89439b.invoke(new g.a(this.f89429b));
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0613b(Y.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.f89423b);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.faq.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/b$b.class */
    public final class C0613b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Y f89424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final h f89425b;

        public C0613b(@NotNull Y y6, @NotNull h hVar) {
            super(y6.f119517a);
            this.f89424a = y6;
            this.f89425b = hVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/b$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f89426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f89427b;

        public c(@NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow) {
            this.f89426a = mutableStateFlow;
            this.f89427b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f89426a, cVar.f89426a) && Intrinsics.areEqual(this.f89427b, cVar.f89427b);
        }

        public final int hashCode() {
            return this.f89427b.hashCode() + (this.f89426a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f89426a + ", horizontalPaddingFlow=" + this.f89427b + ")";
        }
    }

    public b(@NotNull c cVar) {
        this.f89421a = cVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseFaqComponent$bindToView$2(this, (C7193o) ((n) viewEntry).a, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(C7193o.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}

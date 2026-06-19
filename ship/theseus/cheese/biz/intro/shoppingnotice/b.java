package com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.magicasakura.widgets.TintTextView;
import fu0.Q;
import fu0.S;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/b.class */
@StabilityInferred(parameters = 0)
public final class b extends m<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f90116a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/b$a.class */
    public final class a extends RecyclerView.Adapter<C0640b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.a f90117a;

        public a(@NotNull b bVar, com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.a aVar) {
            this.f90117a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f90117a.f90114b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            e eVar = (e) CollectionsKt.getOrNull(this.f90117a.f90114b, i7);
            Q q7 = ((C0640b) viewHolder).f90118a;
            q7.f119488c.setText(eVar != null ? eVar.f90124a : null);
            String str = null;
            if (eVar != null) {
                str = eVar.f90125b;
            }
            TintTextView tintTextView = q7.f119487b;
            tintTextView.setText(str);
            if (eVar == null || !eVar.f90126c) {
                tintTextView.setTypeface(Typeface.DEFAULT);
            } else {
                tintTextView.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new C0640b(Q.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/b$b.class */
    public final class C0640b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Q f90118a;

        public C0640b(@NotNull Q q7) {
            super(q7.f119486a);
            this.f90118a = q7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/b$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow f90119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f90120b;

        public c(@NotNull MutableStateFlow mutableStateFlow, @NotNull StateFlow stateFlow) {
            this.f90119a = mutableStateFlow;
            this.f90120b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f90119a, cVar.f90119a) && Intrinsics.areEqual(this.f90120b, cVar.f90120b);
        }

        public final int hashCode() {
            return this.f90120b.hashCode() + (this.f90119a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(stateFlow=" + this.f90119a + ", horizontalPaddingFlow=" + this.f90120b + ")";
        }
    }

    public b(@NotNull c cVar) {
        this.f90116a = cVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseShoppingNoticeComponent$bind$2(this, (S) viewBinding, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return S.inflate(layoutInflater, viewGroup, false);
    }
}

package com.bilibili.ship.theseus.cheese.biz.intro.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.biligame.compose.widget.J;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.cheese.biz.intro.series.a;
import eu0.C7004w;
import fu0.O;
import fu0.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import nu0.C8143b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ou0.C8266a;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a.class */
@StabilityInferred(parameters = 0)
public final class a implements UIComponent<n<O>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f90087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f90088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f90089c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.series.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a$a.class */
    public final class C0637a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<e> f90090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f90091b;

        public C0637a(@NotNull a aVar, List<e> list) {
            this.f90091b = aVar;
            this.f90090a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f90090a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
            b bVar = (b) viewHolder;
            final e eVar = (e) CollectionsKt.getOrNull(this.f90090a, i7);
            if (eVar == null) {
                bVar.getClass();
                return;
            }
            P p7 = bVar.f90092a;
            ConstraintLayout constraintLayout = p7.f119483a;
            final a aVar = bVar.f90093b;
            constraintLayout.setOnClickListener(new View.OnClickListener(eVar, aVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.series.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f90098a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f90099b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f90100c;

                {
                    this.f90098a = eVar;
                    this.f90099b = aVar;
                    this.f90100c = i7;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e eVar2 = this.f90098a;
                    a aVar2 = this.f90099b;
                    int i8 = this.f90100c;
                    if (eVar2.f90108b) {
                        return;
                    }
                    aVar2.f90088b.tryEmit(new a.c.C0638a(i8));
                }
            });
            p7.f119484b.setText(eVar.f90110d);
            TextView textView = p7.f119485c;
            String str = eVar.f90111e;
            textView.setText(str);
            p7.f119484b.setSelected(eVar.f90108b);
            p7.f119485c.setVisibility(str.length() > 0 ? 0 : 8);
            boolean z6 = eVar.f90109c;
            ConstraintLayout constraintLayout2 = p7.f119483a;
            if (z6) {
                b.p0(0.7f, constraintLayout2);
            } else {
                b.p0(1.0f, constraintLayout2);
            }
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(constraintLayout2, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new J(aVar, i7, 1)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(this.f90091b, P.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final P f90092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f90093b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull a aVar, P p7) {
            super(p7.f119483a);
            this.f90093b = aVar;
            this.f90092a = p7;
        }

        public static void p0(float f7, View view) {
            if (view instanceof ViewGroup) {
                Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setAlpha(f7);
                }
            }
            view.setAlpha(f7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a$c.class */
    @StabilityInferred(parameters = 1)
    public static abstract class c {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.series.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a$c$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0638a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f90094a;

            public C0638a(int i7) {
                this.f90094a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0638a) && this.f90094a == ((C0638a) obj).f90094a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f90094a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f90094a, ")", new StringBuilder("OnClickItem(pos="));
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f90095a;

            public b(int i7) {
                this.f90095a = i7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f90095a == ((b) obj).f90095a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f90095a);
            }

            @NotNull
            public final String toString() {
                return C4277b.a(this.f90095a, ")", new StringBuilder("OnExposureItemReport(pos="));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/a$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.cheese.biz.intro.series.d f90096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Integer> f90097b;

        public d(@NotNull com.bilibili.ship.theseus.cheese.biz.intro.series.d dVar, @NotNull StateFlow<Integer> stateFlow) {
            this.f90096a = dVar;
            this.f90097b = stateFlow;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f90096a, dVar.f90096a) && Intrinsics.areEqual(this.f90097b, dVar.f90097b);
        }

        public final int hashCode() {
            return this.f90097b.hashCode() + (this.f90096a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "State(seriesState=" + this.f90096a + ", horizontalPaddingFlow=" + this.f90097b + ")";
        }
    }

    public a(@NotNull d dVar) {
        this.f90087a = dVar;
        MutableSharedFlow<c> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(0, 3, BufferOverflow.DROP_OLDEST);
        this.f90088b = MutableSharedFlow;
        this.f90089c = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        O o7 = (O) ((n) viewEntry).a;
        Context context = o7.f119479a.getContext();
        com.bilibili.ship.theseus.cheese.biz.intro.series.d dVar = this.f90087a.f90096a;
        int i7 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView = o7.f119480b;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new C0637a(this, dVar.f90106b));
        TextView textView = o7.f119482d;
        C7004w c7004w = dVar.f90105a;
        textView.setText(c7004w.f117589a);
        o7.f119481c.setText(c7004w.f117590b);
        Iterator it = ((ArrayList) dVar.f90106b).iterator();
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (((e) it.next()).f90108b) {
                break;
            }
            i7++;
        }
        if (i7 != -1) {
            C8266a c8266a = new C8266a(context);
            c8266a.setTargetPosition(i7);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(c8266a);
            }
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseSeriesComponent$bindToView$2(this, o7, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        O oInflate = O.inflate(LayoutInflater.from(context), viewGroup, false);
        oInflate.f119480b.addItemDecoration(new C8143b(0, (int) DpUtils.dp2px(context, 8.0f), (int) DpUtils.dp2px(context, 10.0f)));
        return new n(oInflate);
    }
}

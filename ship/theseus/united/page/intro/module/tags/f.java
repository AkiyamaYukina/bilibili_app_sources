package com.bilibili.ship.theseus.united.page.intro.module.tags;

import X9.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.playerbizcommonv2.view.CustomMarqueeTextView;
import com.bilibili.ship.theseus.united.page.intro.module.tags.TagsService;
import dv0.l0;
import dv0.m0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/f.class */
@StabilityInferred(parameters = 0)
public final class f extends m<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f101955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TagsService.a f101956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f101957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f101958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f101959e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/f$a.class */
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.biligame.cloudgame.v2.ui.welfare.e f101960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MD.a f101961b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public TagsService.a f101963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f101964e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList<com.bilibili.ship.theseus.united.page.intro.module.tags.a> f101962c = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<Integer> f101965f = StateFlowKt.MutableStateFlow(0);

        public a(@NotNull com.bilibili.biligame.cloudgame.v2.ui.welfare.e eVar, @NotNull MD.a aVar) {
            this.f101960a = eVar;
            this.f101961b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f101962c.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x01b0  */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r12, int r13) {
            /*
                Method dump skipped, instruction units count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.tags.f.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(l0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            b bVar = (b) viewHolder;
            super.onViewAttachedToWindow(bVar);
            CoroutineScope coroutineScope = bVar.f101971f;
            if (coroutineScope == null || !CoroutineScopeKt.isActive(coroutineScope)) {
                bVar.f101971f = n.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            ((b) viewHolder).p0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            b bVar = (b) viewHolder;
            super.onViewRecycled(bVar);
            bVar.p0();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/f$b.class */
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TintLinearLayout f101966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BiliImageView f101967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final CustomMarqueeTextView f101968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BiliImageView f101969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public com.bilibili.ship.theseus.united.page.intro.module.tags.a f101970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public CoroutineScope f101971f;

        public b(@NotNull l0 l0Var) {
            super(l0Var.f117040a);
            this.f101966a = l0Var.f117040a;
            this.f101967b = l0Var.f117042c;
            this.f101968c = l0Var.f117043d;
            this.f101969d = l0Var.f117041b;
        }

        @MainThread
        public final void p0() {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2 = this.f101971f;
            if (coroutineScope2 == null || !CoroutineScopeKt.isActive(coroutineScope2) || (coroutineScope = this.f101971f) == null) {
                return;
            }
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
    }

    public f(@NotNull MutableStateFlow mutableStateFlow, @NotNull TagsService.a aVar, @NotNull MutableStateFlow mutableStateFlow2, @NotNull StateFlow stateFlow, @NotNull com.bilibili.biligame.cloudgame.v2.ui.welfare.e eVar, @NotNull MD.a aVar2) {
        this.f101955a = mutableStateFlow;
        this.f101956b = aVar;
        this.f101957c = mutableStateFlow2;
        this.f101958d = stateFlow;
        this.f101959e = new a(eVar, aVar2);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        m0 m0Var = (m0) viewBinding;
        Context context = m0Var.f117048a.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView = m0Var.f117050c;
        recyclerView.setLayoutManager(linearLayoutManager);
        a aVar = this.f101959e;
        recyclerView.setAdapter(aVar);
        recyclerView.setNestedScrollingEnabled(false);
        TagsService.a aVar2 = this.f101956b;
        aVar.f101963d = aVar2;
        View view = m0Var.f117049b;
        view.setVisibility(8);
        int iA = com.bilibili.ship.theseus.united.utils.g.a(0, aVar2.f101926d);
        if (iA == 0) {
            view.setBackgroundColor(ResourcesCompat.getColor(context.getResources(), R$color.Ga2, null));
        } else {
            view.setBackgroundColor(iA);
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TagsComponent$bind$2(this, recyclerView, m0Var, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m0.inflate(layoutInflater, viewGroup, false);
    }
}

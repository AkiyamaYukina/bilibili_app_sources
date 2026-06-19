package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.features.interactvideo.model.Story;
import dv0.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/m.class */
@StabilityInferred(parameters = 0)
public final class m extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<J> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final List<Story> f99988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final p f99989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f99990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final j f99991o;

    public m(@NotNull List list, @NotNull p pVar, @NotNull q qVar, @NotNull StateFlow stateFlow) {
        this.f99988l = list;
        this.f99989m = pVar;
        this.f99990n = stateFlow;
        this.f99991o = new j(qVar);
        l(0.5625f);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        J j7 = (J) viewBinding;
        j7.f116801c.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f99985a;

            {
                this.f99985a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99985a.f99989m.invoke();
            }
        });
        final RecyclerView recyclerView = j7.f116800b;
        j jVar = this.f99991o;
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(j7.f116799a.getContext(), R$color.Bg1_float), 0.0f, 8, 0));
        List<Story> list = this.f99988l;
        ((ArrayList) jVar.f99982b).clear();
        List<Story> list2 = jVar.f99982b;
        ((ArrayList) list2).addAll(list);
        jVar.notifyDataSetChanged();
        recyclerView.post(new Runnable(recyclerView, this) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecyclerView f99986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m f99987b;

            {
                this.f99986a = recyclerView;
                this.f99987b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView2 = this.f99986a;
                m mVar = this.f99987b;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
                Iterator<Story> it = mVar.f99988l.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    } else if (it.next().getCurrent() == 1) {
                        break;
                    } else {
                        i7++;
                    }
                }
                linearLayoutManager.scrollToPositionWithOffset(RangesKt.coerceAtLeast(i7, 0), DimenUtilsKt.dpToPx(38.0f));
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return J.inflate(layoutInflater, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return false;
    }
}

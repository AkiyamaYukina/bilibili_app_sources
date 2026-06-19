package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import fu0.C7175B;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/v.class */
@StabilityInferred(parameters = 0)
public final class v extends RecyclerView.Adapter<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<G> f89910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f89911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f89912c;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull List<G> list, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Integer, Unit> function12) {
        this.f89910a = list;
        this.f89911b = function1;
        this.f89912c = function12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f89910a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
        final y yVar = (y) viewHolder;
        G g7 = (G) CollectionsKt.getOrNull(this.f89910a, i7);
        yVar.f89917a.setText(g7 != null ? g7.f89843a : null);
        TextView textView = yVar.f89917a;
        boolean z6 = false;
        if (g7 != null) {
            z6 = false;
            if (g7.f89845c) {
                z6 = true;
            }
        }
        textView.setSelected(z6);
        yVar.f89917a.setOnClickListener(new View.OnClickListener(yVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y f89913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f89914b;

            {
                this.f89913a = yVar;
                this.f89914b = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89913a.f89918b.invoke(Integer.valueOf(this.f89914b));
            }
        });
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(yVar.f89917a, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new Function0(yVar, i7) { // from class: com.bilibili.ship.theseus.cheese.biz.intro.publisher.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final y f89915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f89916b;

            {
                this.f89915a = yVar;
                this.f89916b = i7;
            }

            public final Object invoke() {
                this.f89915a.f89919c.invoke(Integer.valueOf(this.f89916b));
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new y(C7175B.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false).f119413b, this.f89911b, this.f89912c);
    }
}

package com.bilibili.search2.result.holder.recommend;

import Bl.J;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.adcommon.utils.ext.ViewExtKt;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.search2.result.holder.recommend.o;
import com.bilibili.search2.utils.B;
import java.util.ArrayList;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/e.class */
@StabilityInferred(parameters = 0)
public final class e extends RecyclerView.Adapter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o.a f88174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<d> f88175b = new ArrayList<>();

    public e(@NotNull o.a aVar) {
        this.f88174a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f88175b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        f fVar = (f) viewHolder;
        d dVar = this.f88175b.get(i7);
        J j7 = fVar.f88176a;
        B.A(j7.c, dVar.f88167a);
        B.A(j7.b, dVar.f88172f);
        String str = MultipleThemeUtils.isNightTheme(j7.a.getContext()) ? dVar.f88171e : dVar.f88170d;
        BiliImageView biliImageView = j7.d;
        if (str != null) {
            ViewExtKt.visible(biliImageView);
            com.bilibili.search2.utils.extension.c.a(biliImageView, str, null, false, null, null, 0, 0, 254);
        } else {
            ViewExtKt.gone(biliImageView);
            Unit unit = Unit.INSTANCE;
        }
        j7.a.setOnClickListener(new So0.e(1, dVar, fVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new f(J.inflate(LayoutInflater.from(viewGroup.getContext())), this.f88174a);
    }
}

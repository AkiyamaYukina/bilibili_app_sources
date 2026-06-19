package com.bilibili.pegasus.channelv3.movie.detail;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/c.class */
@StabilityInferred(parameters = 0)
public final class c extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<e> f75365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75366d;

    public c(int i7, int i8) {
        this.f75363a = i7;
        this.f75364b = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<e> list = this.f75365c;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            List<e> list = this.f75365c;
            e eVar = list != null ? (e) CollectionsKt.getOrNull(list, i7) : null;
            int i8 = this.f75366d;
            aVar.getClass();
            if (eVar == null) {
                return;
            }
            BiliImageLoader.INSTANCE.with(aVar.itemView.getContext()).url(eVar.f75371b).into(aVar.f75358a);
            aVar.f75359b.setText(eVar.f75370a);
            aVar.f75360c.setText(eVar.f75372c);
            View view = aVar.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int bindingAdapterPosition = aVar.getBindingAdapterPosition();
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = aVar.getBindingAdapter();
            if (bindingAdapterPosition + 1 != (bindingAdapter != null ? bindingAdapter.getItemCount() : 0)) {
                marginLayoutParams.setMarginEnd(i8);
            }
            if (aVar.getBindingAdapterPosition() == 0) {
                marginLayoutParams.setMarginStart(this.f75363a);
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        return new a(p.a(viewGroup, 2131495428, viewGroup, false));
    }
}

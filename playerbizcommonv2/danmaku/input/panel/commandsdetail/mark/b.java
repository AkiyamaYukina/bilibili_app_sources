package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.MarkGoodsList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/b.class */
@StabilityInferred(parameters = 0)
public final class b extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<MarkGoodsList.MarkGoods> f81080a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d f81081b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/b$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f81082e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f81083a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final BiliImageView f81084b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final TextView f81085c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final TextView f81086d;

        public a(@NotNull View view, @NotNull b bVar) {
            super(view);
            this.f81083a = bVar;
            this.f81084b = view.findViewById(2131301546);
            this.f81085c = (TextView) view.findViewById(2131304923);
            this.f81086d = (TextView) view.findViewById(2131298761);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.mark.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/mark/b$b.class */
    public static final class C0528b extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = NewPlayerUtilsKt.toPx(8.0f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f81080a).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a aVar = (a) viewHolder;
        MarkGoodsList.MarkGoods markGoods = (MarkGoodsList.MarkGoods) CollectionsKt.getOrNull(this.f81080a, i7);
        if (markGoods == null) {
            aVar.getClass();
            return;
        }
        BiliImageView biliImageView = aVar.f81084b;
        if (biliImageView != null) {
            BiliImageLoader.INSTANCE.with(aVar.itemView.getContext()).url(markGoods.getImg()).into(biliImageView);
        }
        TextView textView = aVar.f81085c;
        if (textView != null) {
            textView.setText(markGoods.getName());
        }
        TextView textView2 = aVar.f81086d;
        if (textView2 != null) {
            textView2.setOnClickListener(new Hx.d(1, aVar, markGoods));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        int i8 = a.f81082e;
        return new a(p.a(viewGroup, 2131493838, viewGroup, false), this);
    }
}

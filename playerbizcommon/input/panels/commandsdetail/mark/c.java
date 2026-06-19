package com.bilibili.playerbizcommon.input.panels.commandsdetail.mark;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.MarkGoodsList;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/c.class */
public final class c extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<MarkGoodsList.MarkGoods> f80142a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public QH0.c f80143b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/c$a.class */
    public static final class a extends BaseViewHolder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f80144e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public BiliImageView f80145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public TextView f80146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public TextView f80147d;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/mark/c$b.class */
    public static final class b extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.bottom = NewPlayerUtilsKt.toPx(8.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    public final void bindHolder(@Nullable BaseViewHolder baseViewHolder, int i7, @Nullable View view) {
        final MarkGoodsList.MarkGoods markGoods;
        a aVar = baseViewHolder instanceof a ? (a) baseViewHolder : null;
        if (aVar == null || (markGoods = (MarkGoodsList.MarkGoods) CollectionsKt.getOrNull(this.f80142a, i7)) == null) {
            return;
        }
        BiliImageView biliImageView = aVar.f80145b;
        if (biliImageView != null) {
            BiliImageLoader.INSTANCE.with(aVar.itemView.getContext()).url(markGoods.getImg()).into(biliImageView);
        }
        TextView textView = aVar.f80146c;
        if (textView != null) {
            textView.setText(markGoods.getName());
        }
        TextView textView2 = aVar.f80147d;
        if (textView2 != null) {
            final a aVar2 = aVar;
            textView2.setOnClickListener(new View.OnClickListener(aVar2, markGoods) { // from class: com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c.a f80140a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MarkGoodsList.MarkGoods f80141b;

                {
                    this.f80140a = aVar2;
                    this.f80141b = markGoods;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QH0.c cVar;
                    c.a aVar3 = this.f80140a;
                    MarkGoodsList.MarkGoods markGoods2 = this.f80141b;
                    BaseAdapter adapter = aVar3.getAdapter();
                    c cVar2 = adapter instanceof c ? (c) adapter : null;
                    if (cVar2 == null || (cVar = cVar2.f80143b) == null) {
                        return;
                    }
                    cVar.invoke(markGoods2);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bilibili.playerbizcommon.input.panels.commandsdetail.mark.c$a, tv.danmaku.bili.widget.section.holder.BaseViewHolder] */
    @NotNull
    public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
        int i8 = a.f80144e;
        View viewA = p.a(viewGroup, 2131493837, viewGroup, false);
        ?? baseViewHolder = new BaseViewHolder(viewA, this);
        baseViewHolder.f80145b = viewA.findViewById(2131301546);
        baseViewHolder.f80146c = (TextView) viewA.findViewById(2131304923);
        baseViewHolder.f80147d = (TextView) viewA.findViewById(2131298761);
        return baseViewHolder;
    }

    public final int getItemCount() {
        return ((ArrayList) this.f80142a).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onAttachedToRecyclerView(recyclerView);
        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
    }
}

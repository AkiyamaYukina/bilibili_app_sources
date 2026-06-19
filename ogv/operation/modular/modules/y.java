package com.bilibili.ogv.operation.modular.modules;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ogv.opbase.CommonCard;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/y.class */
@StabilityInferred(parameters = 0)
public final class y extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70780b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f70781a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/y$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Pk0.w f70782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f70783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Ak0.c f70784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public List<CommonCard> f70785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public List<CommonCard> f70786e;

        public a(@NotNull Pk0.w wVar, @Nullable String str, @NotNull Ak0.c cVar) {
            this.f70782a = wVar;
            this.f70783b = str;
            this.f70784c = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<CommonCard> list = this.f70785d;
            return list != null ? list.size() : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            b bVar = (b) viewHolder;
            List<CommonCard> list = this.f70785d;
            if (list == null || list.isEmpty()) {
                return;
            }
            List<CommonCard> list2 = this.f70785d;
            CommonCard commonCard = list2 != null ? (CommonCard) CollectionsKt.getOrNull(list2, i7) : null;
            TextView textView = bVar.f70788b;
            textView.setText(commonCard != null ? commonCard.f69746a : null);
            textView.setTextColor(this.f70784c.f319a.get());
            Nl0.f.d(bVar.f70787a, commonCard != null ? commonCard.f69749b : null);
            Float fValueOf = null;
            if ((commonCard != null ? commonCard.f69767k : null) != null) {
                fValueOf = Float.valueOf(r11.f69881a / 100.0f);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bVar.f70789c.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) bVar.f70790d.getLayoutParams();
            if (fValueOf != null) {
                if (fValueOf.floatValue() <= 0.0f) {
                    layoutParams.weight = 0.0f;
                    layoutParams2.weight = 1.0f;
                } else if (fValueOf.floatValue() >= 1.0f) {
                    layoutParams.weight = 1.0f;
                    layoutParams2.weight = 0.0f;
                } else {
                    layoutParams2.weight = 1.0f;
                    layoutParams.weight = fValueOf.floatValue() / (1 - fValueOf.floatValue());
                }
            }
            bVar.f70789c.setLayoutParams(layoutParams);
            bVar.f70790d.setLayoutParams(layoutParams2);
            bVar.itemView.setOnClickListener(new Vg.a(1, this, commonCard));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            return new b(p.a(viewGroup, 2131499624, viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/y$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final BiliImageView f70787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextView f70788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final View f70789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final View f70790d;

        public b(@NotNull View view) {
            super(view);
            this.f70787a = view.findViewById(2131298941);
            this.f70788b = (TextView) view.findViewById(2131308958);
            this.f70789c = view.findViewById(2131316281);
            this.f70790d = view.findViewById(2131316282);
        }
    }

    public y(@NotNull View view, @NotNull Pk0.w wVar, @Nullable String str, @NotNull Ak0.c cVar) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131310666);
        a aVar = new a(wVar, str, cVar);
        this.f70781a = aVar;
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 4));
        int iB = Uj0.c.b(6.0f, view.getContext());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new x(iB));
        recyclerView.setAdapter(aVar);
    }
}

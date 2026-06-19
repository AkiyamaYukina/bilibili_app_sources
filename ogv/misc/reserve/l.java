package com.bilibili.ogv.misc.reserve;

import Ri0.C2851g;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import bo0.ViewOnClickListenerC5140j;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.ogv.pub.reserve.ReserveEpisode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/l.class */
@StabilityInferred(parameters = 0)
public final class l extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.ogv.pub.reserve.l> f69195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final h f69196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C2851g f69197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayMap f69199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final k f69200f = new CompoundButton.OnCheckedChangeListener(this) { // from class: com.bilibili.ogv.misc.reserve.k

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f69194a;

        {
            this.f69194a = this;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
            l lVar = this.f69194a;
            com.bilibili.ogv.pub.reserve.l lVar2 = (com.bilibili.ogv.pub.reserve.l) compoundButton.getTag(2131308226);
            if (z6) {
                lVar.f69199e.put(Long.valueOf(lVar2.f71679b), lVar2);
            } else {
                lVar.f69199e.remove(Long.valueOf(lVar2.f71679b));
            }
            h hVar = lVar.f69196b;
            if (hVar != null) {
                hVar.a(lVar.f69199e.size(), lVar.N());
            }
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/l$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final CheckBox f69201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ScalableImageView2 f69202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f69203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f69204d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f69205e;

        public a(@NotNull View view) {
            super(view);
            this.f69201a = (CheckBox) view.findViewById(2131298745);
            this.f69202b = view.findViewById(2131298941);
            this.f69203c = (TextView) view.findViewById(2131302792);
            this.f69204d = (TextView) view.findViewById(2131299190);
            this.f69205e = (TextView) view.findViewById(2131312055);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.ogv.misc.reserve.k] */
    public l(@NotNull List list, @Nullable h hVar, @Nullable C2851g c2851g) {
        this.f69195a = list;
        this.f69196b = hVar;
        this.f69197c = c2851g;
        this.f69199e = new ArrayMap(((ArrayList) list).size());
    }

    public final boolean N() {
        return this.f69199e.size() == ((ArrayList) this.f69195a).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f69195a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        com.bilibili.ogv.pub.reserve.l lVar = (com.bilibili.ogv.pub.reserve.l) ((ArrayList) this.f69195a).get(i7);
        a aVar = (a) viewHolder;
        if (this.f69198d) {
            CheckBox checkBox = aVar.f69201a;
            checkBox.setVisibility(0);
            checkBox.setTag(2131308226, lVar);
            checkBox.setOnCheckedChangeListener(null);
            checkBox.setChecked(this.f69199e.containsKey(Long.valueOf(lVar.f71679b)));
            checkBox.setOnCheckedChangeListener(this.f69200f);
        } else {
            CheckBox checkBox2 = aVar.f69201a;
            checkBox2.setVisibility(8);
            checkBox2.setOnCheckedChangeListener(null);
        }
        ReserveEpisode reserveEpisode = lVar.f71683f;
        int i8 = lVar.h;
        if (reserveEpisode != null) {
            BiliImageLoader.INSTANCE.with(aVar.f69202b.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(reserveEpisode.f71629b).into(aVar.f69202b);
            aVar.f69204d.setText(U1.i.a(lVar.f71686j, "\n", Nl0.f.h(aVar.itemView.getContext(), i8, lVar.f71687k, false), " ", lVar.f71688l));
        }
        aVar.f69203c.setText(com.bilibili.ogv.pub.season.b.b(i8 <= 0 ? com.bilibili.ogv.pub.season.a.f71781i : new com.bilibili.ogv.pub.season.a(i8), aVar.itemView.getContext()));
        if (lVar.f71680c == 1) {
            nn.e.a(aVar.itemView, 2131821861, aVar.f69205e);
        } else {
            nn.e.a(aVar.itemView, 2131821860, aVar.f69205e);
        }
        aVar.itemView.setTag(2131308227, Integer.valueOf(i7));
        aVar.itemView.setOnClickListener(new ViewOnClickListenerC5140j(1, aVar, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        return new a(p.a(viewGroup, 2131493145, viewGroup, false));
    }
}

package com.bilibili.ship.theseus.ugc.recommend;

import Vu0.u;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.utils.n;
import java.util.ArrayList;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Pm.d f98392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<o> f98393b = new ArrayList<>();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.recommend.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/a$a.class */
    public static final class C0920a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f98394e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f98395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TintTextView f98396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TintTextView f98397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BiliImageView f98398d;

        public C0920a(@NotNull u uVar) {
            super(uVar.f25974a);
            this.f98395a = uVar.f25978e;
            this.f98396b = uVar.f25977d;
            this.f98397c = uVar.f25976c;
            this.f98398d = uVar.f25975b;
        }
    }

    public a(@NotNull Pm.d dVar) {
        this.f98392a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f98393b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        String str;
        int i8;
        if (viewHolder instanceof C0920a) {
            C0920a c0920a = (C0920a) viewHolder;
            o oVar = (o) CollectionsKt.getOrNull(this.f98393b, c0920a.getBindingAdapterPosition());
            if (oVar != null) {
                c0920a.f98395a.setText(oVar.a);
                if (oVar.c.intValue() == 1) {
                    str = oVar.d;
                    i8 = 2131235257;
                } else {
                    str = NumberFormat_androidKt.format$default(oVar.b, "--", 0, 2, (Object) null);
                    i8 = 2131235038;
                }
                Drawable drawableB = n.b(i8, viewHolder.itemView.getContext(), R$color.Text_white);
                TintTextView tintTextView = c0920a.f98396b;
                tintTextView.setText(str);
                tintTextView.setCompoundDrawablesWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
                c0920a.f98397c.setText(oVar.g ? oVar.h : NumberFormat_androidKt.format$default(oVar.h, "--", 0, 2, (Object) null));
                BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
                BiliImageView biliImageView = c0920a.f98398d;
                biliImageLoader.with(biliImageView.getContext()).url(oVar.e).into(biliImageView);
            }
            View view = viewHolder.itemView;
            KProperty<Object> kProperty = e.f98424a[0];
            view.setTag(e.f98425b, oVar);
        }
        View view2 = viewHolder.itemView;
        KProperty<Object> kProperty2 = e.f98424a[1];
        view2.setTag(e.f98426c, Integer.valueOf(i7));
        viewHolder.itemView.setOnClickListener(this.f98392a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        int i8 = C0920a.f98394e;
        return new C0920a(u.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}

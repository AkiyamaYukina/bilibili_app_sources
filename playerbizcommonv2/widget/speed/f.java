package com.bilibili.playerbizcommonv2.widget.speed;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.magicasakura.utils.ThemeUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/f.class */
@StabilityInferred(parameters = 0)
public final class f extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f83425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<b> f83426c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final float[] f83427d = {2.0f, 1.5f, 1.25f, 1.0f, 0.75f, 0.5f};

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/f$a.class */
    public interface a {
        void a(float f7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/f$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f83428a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f83429b;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/f$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f83430b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextView f83431a;

        public c(TextView textView, int i7) {
            super(textView);
            this.f83431a = textView;
            textView.setTextColor(i7 == 2 ? ThemeUtils.getThemeColorStateList(textView.getContext(), 2131103518) : ThemeUtils.getThemeColorStateList(textView.getContext(), 2131103519));
        }
    }

    public f(int i7) {
        this.f83424a = i7;
    }

    public final void N(float f7) {
        ((ArrayList) this.f83426c).clear();
        int length = this.f83427d.length;
        for (int i7 = 0; i7 < length; i7++) {
            float f8 = this.f83427d[i7];
            b bVar = new b();
            bVar.f83428a = f8;
            bVar.f83429b = ((double) Math.abs(f7 - f8)) < 0.1d;
            ((ArrayList) this.f83426c).add(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f83426c).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        b bVar = (b) ((ArrayList) this.f83426c).get(i7);
        viewHolder.itemView.setTag(bVar);
        viewHolder.itemView.setOnClickListener(this);
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            if (bVar == null) {
                return;
            }
            String strValueOf = String.valueOf(bVar.f83428a);
            TextView textView = cVar.f83431a;
            textView.setText(textView.getContext().getString(2131832781, strValueOf));
            TextView textView2 = cVar.f83431a;
            textView2.setContentDescription(textView2.getContext().getString(2131845723, strValueOf));
            cVar.f83431a.setSelected(bVar.f83429b);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        if (this.f83425b != null && (view.getTag() instanceof b)) {
            b bVar = (b) view.getTag();
            int iIndexOf = ((ArrayList) this.f83426c).indexOf(bVar);
            if (bVar.f83429b) {
                return;
            }
            float f7 = bVar.f83428a;
            a aVar = this.f83425b;
            if (aVar != null) {
                aVar.a(f7);
            }
            int i7 = 0;
            for (Object obj : (ArrayList) this.f83426c) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((b) obj).f83429b = i7 == iIndexOf;
                i7++;
            }
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        int i8 = c.f83430b;
        return new c((TextView) p.a(viewGroup, 2131501793, viewGroup, false), this.f83424a);
    }
}

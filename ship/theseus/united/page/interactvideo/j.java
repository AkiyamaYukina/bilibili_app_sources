package com.bilibili.ship.theseus.united.page.interactvideo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.features.interactvideo.model.Story;
import dv0.I;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/j.class */
@StabilityInferred(parameters = 0)
public final class j extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final q f99981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Story> f99982b = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/j$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final I f99983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f99984b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull j jVar, I i7) {
            super(i7.f116787a);
            this.f99984b = jVar;
            this.f99983a = i7;
        }
    }

    public j(@NotNull q qVar) {
        this.f99981a = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f99982b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a aVar = (a) viewHolder;
        final Story story = (Story) ((ArrayList) this.f99982b).get(i7);
        boolean z6 = true;
        boolean z7 = i7 != getItemCount() - 1;
        aVar.getClass();
        BiliImageLoader biliImageLoader = BiliImageLoader.INSTANCE;
        I i8 = aVar.f99983a;
        biliImageLoader.with(i8.f116788b.getContext()).url(story.getCover()).into(i8.f116788b);
        if (story.getCurrent() != 1) {
            z6 = false;
        }
        i8.f116791e.setText(story.getTitle());
        TextView textView = i8.f116791e;
        textView.setTextColor(z6 ? ContextCompat.getColor(textView.getContext(), R$color.Pi5) : ContextCompat.getColor(textView.getContext(), R$color.Text1));
        i8.f116790d.setVisibility(z6 ? 0 : 8);
        i8.f116789c.setVisibility(z7 ? 0 : 8);
        final j jVar = aVar.f99984b;
        i8.f116787a.setOnClickListener(new View.OnClickListener(jVar, story) { // from class: com.bilibili.ship.theseus.united.page.interactvideo.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f99979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Story f99980b;

            {
                this.f99979a = jVar;
                this.f99980b = story;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar2 = this.f99979a;
                Story story2 = this.f99980b;
                jVar2.f99981a.invoke(Long.valueOf(story2.getId()), Long.valueOf(story2.getCid()), 1, Long.valueOf(story2.getStartPosition()), Integer.valueOf(story2.getCursor()));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new a(this, I.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}

package com.bilibili.playset.note;

import F70.o;
import F70.p;
import F70.q;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.room.ui.guide.cnyredpacket.j;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playset.api.f;
import com.bilibili.playset.note.RspNoteList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ns0.C8136d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/d.class */
@StabilityInferred(parameters = 0)
public final class d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f85147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.imagepicker.d f85148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ns0.j f85149c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85153g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85150d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final f f85151e = new f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<RspNoteList.NoteBean> f85152f = new ArrayList();

    @NotNull
    public final HashSet<RspNoteList.NoteBean> h = new HashSet<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/d$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C8136d f85154a;

        public a(@NotNull d dVar, ViewGroup viewGroup) {
            super(new C8136d(viewGroup.getContext(), 0));
            C8136d c8136d = (C8136d) this.itemView;
            this.f85154a = c8136d;
            c8136d.setRetryListener(new o(3, this, dVar));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/note/d$b.class */
    public final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final j f85155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TintCheckBox f85156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f85157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final TextView f85158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TextView f85159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final TextView f85160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final BiliImageView f85161g;
        public final d h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull d dVar, @NotNull ViewGroup viewGroup, j jVar) {
            super(p.a(viewGroup, 2131499705, viewGroup, false));
            this.h = dVar;
            this.f85155a = jVar;
            TintCheckBox tintCheckBox = (TintCheckBox) this.itemView.findViewById(2131298745);
            this.f85156b = tintCheckBox;
            this.f85157c = (TextView) this.itemView.findViewById(2131310619);
            this.f85158d = (TextView) this.itemView.findViewById(2131315180);
            this.f85159e = (TextView) this.itemView.findViewById(2131315458);
            this.f85160f = (TextView) this.itemView.findViewById(2131314718);
            this.f85161g = this.itemView.findViewById(2131302584);
            this.itemView.setOnClickListener(new p(2, this, dVar));
            tintCheckBox.setOnClickListener(new q(2, this, dVar));
        }
    }

    public d(@NotNull j jVar, @NotNull com.bilibili.app.imagepicker.d dVar, @NotNull ns0.j jVar2) {
        this.f85147a = jVar;
        this.f85148b = dVar;
        this.f85149c = jVar2;
    }

    public final int N() {
        return ((ArrayList) this.f85152f).size();
    }

    public final void O(int i7) {
        this.f85151e.f84073a = i7;
        notifyItemChanged(getItemCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f85152f).isEmpty() ? 0 : ((ArrayList) this.f85152f).size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return i7 < N() ? 0 : this.f85150d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
        int i8;
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.getClass();
            int i9 = this.f85151e.f84073a;
            C8136d c8136d = aVar.f85154a;
            if (i9 == 2) {
                c8136d.b();
                return;
            }
            if (i9 == 4) {
                c8136d.a();
                return;
            }
            TextView textView = c8136d.f124366a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            TintTextView tintTextView = c8136d.f124367b;
            if (tintTextView != null) {
                tintTextView.setVisibility(4);
            }
            c8136d.setBackgroundColor(0);
            return;
        }
        RspNoteList.NoteBean noteBean = (RspNoteList.NoteBean) CollectionsKt.getOrNull(this.f85152f, i7);
        if (noteBean == null || !(viewHolder instanceof b)) {
            return;
        }
        b bVar = (b) viewHolder;
        bVar.itemView.setTag(noteBean);
        d dVar = bVar.h;
        boolean z6 = dVar.f85153g;
        TintCheckBox tintCheckBox = bVar.f85156b;
        if (z6) {
            tintCheckBox.setVisibility(0);
            tintCheckBox.setChecked(dVar.h.contains(noteBean));
        } else {
            tintCheckBox.setVisibility(8);
            tintCheckBox.setChecked(false);
        }
        tintCheckBox.setTag(noteBean);
        bVar.f85157c.setText(noteBean.title);
        bVar.f85158d.setText(noteBean.summary);
        String str = noteBean.message;
        if (str == null || StringsKt.isBlank(str)) {
            bVar.f85159e.setVisibility(4);
        } else {
            bVar.f85159e.setVisibility(0);
            bVar.f85159e.setText(noteBean.message);
        }
        TextView textView2 = bVar.f85160f;
        if (noteBean.isValid()) {
            RspNoteList.NoteBean.ARC arc = noteBean.arc;
            ImageExtentionKt.displayImage$default(bVar.f85161g, arc != null ? arc.cover : null, (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, ScaleType.CENTER_CROP, (BitmapTransformation) null, false, 894, (Object) null);
            bVar.f85157c.setTextColor(ContextCompat.getColor(bVar.itemView.getContext(), R$color.Ga10));
            i8 = 8;
        } else {
            ImageExtentionKt.displayImage$default(bVar.f85161g, "", (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
            bVar.f85157c.setTextColor(ContextCompat.getColor(bVar.itemView.getContext(), R$color.Ga5));
            i8 = 0;
        }
        textView2.setVisibility(i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7, @NotNull List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i7);
            return;
        }
        if (viewHolder instanceof b) {
            Object obj = list.get(0);
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                if (Intrinsics.areEqual(str, "payload_external_select_all")) {
                    ((b) viewHolder).f85156b.setChecked(true);
                    return;
                } else {
                    if (Intrinsics.areEqual(str, "payload_external_un_select_all")) {
                        ((b) viewHolder).f85156b.setChecked(false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.getClass();
            int i8 = this.f85151e.f84073a;
            C8136d c8136d = aVar.f85154a;
            if (i8 == 2) {
                c8136d.b();
                return;
            }
            if (i8 == 4) {
                c8136d.a();
                return;
            }
            TextView textView = c8136d.f124366a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            TintTextView tintTextView = c8136d.f124367b;
            if (tintTextView != null) {
                tintTextView.setVisibility(4);
            }
            c8136d.setBackgroundColor(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        return i7 == 0 ? new b(this, viewGroup, this.f85147a) : new a(this, viewGroup);
    }
}

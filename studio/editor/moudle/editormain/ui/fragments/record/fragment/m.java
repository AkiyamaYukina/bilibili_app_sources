package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import TB0.H;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean.RecordVoiceCategory;
import com.bilibili.studio.videoeditor.extension.p;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/m.class */
public final class m extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Function1<? super Integer, Unit> f106936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<RecordVoiceCategory.FxData> f106937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Set<RecordVoiceCategory.FxData> f106939d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/m$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final H f106940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f106941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull m mVar, H h) {
            super(h.f23519a);
            this.f106941b = mVar;
            this.f106940a = h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<RecordVoiceCategory.FxData> list = this.f106937b;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        a aVar = (a) viewHolder;
        List<RecordVoiceCategory.FxData> list = this.f106937b;
        RecordVoiceCategory.FxData fxData = list != null ? (RecordVoiceCategory.FxData) CollectionsKt.getOrNull(list, i7) : null;
        if (fxData == null) {
            aVar.getClass();
            return;
        }
        m mVar = aVar.f106941b;
        mVar.f106939d.add(fxData);
        H h = aVar.f106940a;
        h.f23519a.setSelected(mVar.f106938c == i7);
        h.f23521c.setText(fxData.getName());
        if (fxData.getApplying()) {
            p.d(h.f23520b);
        } else {
            p.a(h.f23520b);
        }
        h.f23519a.setOnClickListener(new DI0.h(mVar, fxData, aVar, i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new a(this, H.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}

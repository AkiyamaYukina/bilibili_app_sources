package com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment;

import TB0.G;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.bean.RecordVoiceCategory;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.o;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/o.class */
public final class o extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Function1<? super RecordVoiceCategory, Unit> f106946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<RecordVoiceCategory> f106947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Set<RecordVoiceCategory> f106949d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/record/fragment/o$a.class */
    public final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final G f106950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f106951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull o oVar, G g7) {
            super(g7.f23517a);
            this.f106951b = oVar;
            this.f106950a = g7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<RecordVoiceCategory> list = this.f106947b;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
        final a aVar = (a) viewHolder;
        List<RecordVoiceCategory> list = this.f106947b;
        RecordVoiceCategory recordVoiceCategory = list != null ? (RecordVoiceCategory) CollectionsKt.getOrNull(list, i7) : null;
        if (recordVoiceCategory == null) {
            aVar.getClass();
            return;
        }
        final o oVar = aVar.f106951b;
        oVar.f106949d.add(recordVoiceCategory);
        G g7 = aVar.f106950a;
        g7.f23517a.setSelected(oVar.f106948c == i7);
        g7.f23518b.setText(recordVoiceCategory.getName());
        final RecordVoiceCategory recordVoiceCategory2 = recordVoiceCategory;
        g7.f23517a.setOnClickListener(new View.OnClickListener(oVar, aVar, i7, recordVoiceCategory2) { // from class: com.bilibili.studio.editor.moudle.editormain.ui.fragments.record.fragment.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f106942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final o.a f106943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f106944c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final RecordVoiceCategory f106945d;

            {
                this.f106942a = oVar;
                this.f106943b = aVar;
                this.f106944c = i7;
                this.f106945d = recordVoiceCategory2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o oVar2 = this.f106942a;
                o.a aVar2 = this.f106943b;
                int i8 = this.f106944c;
                RecordVoiceCategory recordVoiceCategory3 = this.f106945d;
                int i9 = oVar2.f106948c;
                if (i9 >= 0) {
                    List<RecordVoiceCategory> list2 = oVar2.f106947b;
                    if (i9 < (list2 != null ? list2.size() : 0)) {
                        oVar2.notifyItemChanged(oVar2.f106948c);
                    }
                }
                aVar2.f106950a.f23517a.setSelected(true);
                oVar2.f106948c = i8;
                oVar2.f106946a.invoke(recordVoiceCategory3);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new a(this, G.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}

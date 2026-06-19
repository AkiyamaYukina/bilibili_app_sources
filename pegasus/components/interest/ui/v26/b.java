package com.bilibili.pegasus.components.interest.ui.v26;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4866i0;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.pegasus.components.interest.ui.v26.InterestChooseDialogSecondTab$initBasicView$2;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/b.class */
@StabilityInferred(parameters = 0)
public final class b extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f76448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f76449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<InterestChooseSubItem> f76450c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76451d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76452e = -1;

    public b(@NotNull f fVar, @NotNull g gVar) {
        this.f76448a = fVar;
        this.f76449b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f76450c).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
        c cVar = (c) viewHolder;
        InterestChooseSubItem interestChooseSubItem = (InterestChooseSubItem) ((ArrayList) this.f76450c).get(i7);
        cVar.f76453a.f54061b.setText(interestChooseSubItem.j());
        C4866i0 c4866i0 = cVar.f76453a;
        c4866i0.f54061b.setTextColor(c4866i0.f54060a.getContext().getResources().getColor(interestChooseSubItem.f77422g ? R$color.Wh0_u : R$color.Text1));
        TintFrameLayout tintFrameLayout = c4866i0.f54060a;
        boolean zIsSelected = tintFrameLayout.isSelected();
        boolean z6 = interestChooseSubItem.f77422g;
        if (zIsSelected != z6) {
            tintFrameLayout.setSelected(z6);
        }
        tintFrameLayout.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.pegasus.components.interest.ui.v26.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f76446a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f76447b;

            {
                this.f76446a = this;
                this.f76447b = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f76446a;
                int i8 = this.f76447b;
                f fVar = bVar.f76448a;
                int i9 = bVar.f76451d;
                int i10 = bVar.f76452e;
                fVar.getClass();
                InterestChooseDialogSecondTab$initBasicView$2.AnonymousClass1.invokeSuspend$lambda$0(i9, i10, i8);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new c(C4866i0.bind(LayoutInflater.from(viewGroup.getContext()).inflate(2131498139, viewGroup, false)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        c cVar = (c) viewHolder;
        super.onViewAttachedToWindow(cVar);
        int layoutPosition = cVar.getLayoutPosition();
        InterestChooseSubItem interestChooseSubItem = (InterestChooseSubItem) ((ArrayList) this.f76450c).get(layoutPosition);
        if (interestChooseSubItem.h) {
            return;
        }
        interestChooseSubItem.h = true;
        int i7 = this.f76451d;
        int i8 = this.f76452e;
        getClass();
        InterestChooseDialogSecondTab$initBasicView$2.AnonymousClass1.invokeSuspend$lambda$1(i7, i8, layoutPosition);
    }
}

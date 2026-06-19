package com.bilibili.pegasus.components.interest.ui.v26;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4884r0;
import com.bilibili.pegasus.components.interest.ui.v26.InterestChooseDialogSecondTab$initBasicView$2;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/n.class */
@StabilityInferred(parameters = 0)
public final class n extends RecyclerView.Adapter<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f76464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f76465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<InterestChooseSubItem> f76466c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76467d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76468e = -1;

    public n(@NotNull f fVar, @NotNull g gVar) {
        this.f76464a = fVar;
        this.f76465b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f76466c).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i7) {
        o oVar = (o) viewHolder;
        InterestChooseSubItem interestChooseSubItem = (InterestChooseSubItem) ((ArrayList) this.f76466c).get(i7);
        oVar.f76469a.f54138d.setText(interestChooseSubItem.j());
        C4884r0 c4884r0 = oVar.f76469a;
        c4884r0.f54136b.setText(interestChooseSubItem.c());
        c4884r0.f54137c.setSelected(interestChooseSubItem.f77422g);
        c4884r0.f54135a.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.pegasus.components.interest.ui.v26.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n f76462a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f76463b;

            {
                this.f76462a = this;
                this.f76463b = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n nVar = this.f76462a;
                int i8 = this.f76463b;
                f fVar = nVar.f76464a;
                int i9 = nVar.f76467d;
                int i10 = nVar.f76468e;
                fVar.getClass();
                InterestChooseDialogSecondTab$initBasicView$2.AnonymousClass1.invokeSuspend$lambda$0(i9, i10, i8);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new o(C4884r0.bind(LayoutInflater.from(viewGroup.getContext()).inflate(2131498147, viewGroup, false)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        o oVar = (o) viewHolder;
        super.onViewAttachedToWindow(oVar);
        int layoutPosition = oVar.getLayoutPosition();
        InterestChooseSubItem interestChooseSubItem = (InterestChooseSubItem) ((ArrayList) this.f76466c).get(layoutPosition);
        if (interestChooseSubItem.h) {
            return;
        }
        interestChooseSubItem.h = true;
        int i7 = this.f76467d;
        int i8 = this.f76468e;
        getClass();
        InterestChooseDialogSecondTab$initBasicView$2.AnonymousClass1.invokeSuspend$lambda$1(i7, i8, layoutPosition);
    }
}

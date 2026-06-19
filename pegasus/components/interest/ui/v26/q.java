package com.bilibili.pegasus.components.interest.ui.v26;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4888t0;
import com.bilibili.opd.app.bizcommon.ui.flexbox.FlexboxLayoutManager;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/q.class */
@StabilityInferred(parameters = 0)
public final class q extends RecyclerView.Adapter<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f76470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f76471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f76472c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76473d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<InterestChooseSubSection> f76474e = new ArrayList();

    public q(@NotNull f fVar, @NotNull g gVar) {
        this.f76470a = fVar;
        this.f76471b = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f76474e).size();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        RecyclerView.LayoutManager linearLayoutManager;
        r rVar = (r) viewHolder;
        InterestChooseSubSection interestChooseSubSection = (InterestChooseSubSection) ((ArrayList) this.f76474e).get(i7);
        rVar.f76475a.f54155c.setText("- " + interestChooseSubSection.getTitle() + " -");
        C4888t0 c4888t0 = rVar.f76475a;
        RecyclerView recyclerView = c4888t0.f54154b;
        boolean z6 = this.f76472c;
        ConstraintLayout constraintLayout = c4888t0.f54153a;
        if (z6) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(constraintLayout.getContext());
            flexboxLayoutManager.r(2);
            linearLayoutManager = flexboxLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(constraintLayout.getContext());
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = c4888t0.f54154b;
        RecyclerView.ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator2 = recyclerView2.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.setRemoveDuration(0L);
        }
        RecyclerView.ItemAnimator itemAnimator3 = recyclerView2.getItemAnimator();
        if (itemAnimator3 != null) {
            itemAnimator3.setChangeDuration(0L);
        }
        boolean z7 = this.f76472c;
        g gVar = this.f76471b;
        f fVar = this.f76470a;
        if (z7) {
            if (!(recyclerView2.getAdapter() instanceof b)) {
                recyclerView2.setAdapter(new b(fVar, gVar));
            }
            b bVar = (b) recyclerView2.getAdapter();
            List<InterestChooseSubItem> subItems = interestChooseSubSection.getSubItems();
            List<InterestChooseSubItem> listEmptyList = subItems;
            if (subItems == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            bVar.f76451d = this.f76473d;
            bVar.f76452e = i7;
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(bVar.f76450c, listEmptyList));
            ((ArrayList) bVar.f76450c).clear();
            ((ArrayList) bVar.f76450c).addAll(listEmptyList);
            diffResultCalculateDiff.dispatchUpdatesTo(bVar);
            return;
        }
        if (!(recyclerView2.getAdapter() instanceof n)) {
            recyclerView2.setAdapter(new n(fVar, gVar));
        }
        n nVar = (n) recyclerView2.getAdapter();
        List<InterestChooseSubItem> subItems2 = interestChooseSubSection.getSubItems();
        List<InterestChooseSubItem> listEmptyList2 = subItems2;
        if (subItems2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        nVar.f76467d = this.f76473d;
        nVar.f76468e = i7;
        DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new Bo0.i(nVar.f76466c, listEmptyList2));
        ((ArrayList) nVar.f76466c).clear();
        ((ArrayList) nVar.f76466c).addAll(listEmptyList2);
        diffResultCalculateDiff2.dispatchUpdatesTo(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new r(C4888t0.bind(LayoutInflater.from(viewGroup.getContext()).inflate(2131498149, viewGroup, false)));
    }
}

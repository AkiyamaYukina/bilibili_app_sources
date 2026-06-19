package com.bilibili.pegasus.components.interest;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/g.class */
@StabilityInferred(parameters = 0)
public class g extends RecyclerView.Adapter<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterestChoose f76331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final i f76332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public List<InterestChooseItem> f76333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<InterestChooseItem> f76334d;

    public g(@NotNull InterestChoose interestChoose, @Nullable i iVar) {
        this.f76331a = interestChoose;
        this.f76332b = iVar;
        List<InterestChooseItem> listU = interestChoose.u();
        this.f76333c = listU == null ? CollectionsKt.emptyList() : listU;
        this.f76334d = new ArrayList();
        List<InterestChooseItem> listU2 = interestChoose.u();
        if (listU2 != null) {
            for (InterestChooseItem interestChooseItem : listU2) {
                if (interestChooseItem.isSelected()) {
                    ((ArrayList) this.f76334d).add(interestChooseItem);
                }
            }
        }
        i iVar2 = this.f76332b;
        if (iVar2 != null) {
            KProperty<Object>[] kPropertyArr = InterestChoseDialogG.f76271n;
            ((InterestChoseDialogG) iVar2.f76337a).mf();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f76333c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        final l lVar = (l) viewHolder;
        final InterestChooseItem interestChooseItem = this.f76333c.get(i7);
        lVar.f76346d = interestChooseItem;
        interestChooseItem.setListPosition(lVar.getBindingAdapterPosition());
        lVar.f76343a.setText(interestChooseItem.getName());
        ImageExtentionKt.displayImage$default(lVar.f76344b, interestChooseItem.getIcon(), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
        boolean zIsSelected = interestChooseItem.isSelected();
        View view = lVar.f76345c;
        if (view != null) {
            view.setVisibility(zIsSelected ? 0 : 8);
        }
        lVar.f76345c.setSelected(zIsSelected);
        lVar.itemView.setSelected(zIsSelected);
        lVar.itemView.setOnClickListener(new View.OnClickListener(interestChooseItem, lVar, this) { // from class: com.bilibili.pegasus.components.interest.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterestChooseItem f76328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final l f76329b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final g f76330c;

            {
                this.f76328a = interestChooseItem;
                this.f76329b = lVar;
                this.f76330c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterestChooseItem interestChooseItem2 = this.f76328a;
                l lVar2 = this.f76329b;
                g gVar = this.f76330c;
                interestChooseItem2.setSelected(!lVar2.f76345c.isSelected());
                if (lVar2.f76345c.isSelected()) {
                    ((ArrayList) gVar.f76334d).remove(interestChooseItem2);
                } else {
                    ((ArrayList) gVar.f76334d).add(interestChooseItem2);
                }
                boolean zIsSelected2 = lVar2.f76345c.isSelected();
                boolean z6 = !zIsSelected2;
                View view3 = lVar2.f76345c;
                if (view3 != null) {
                    view3.setVisibility(!zIsSelected2 ? 0 : 8);
                }
                lVar2.f76345c.setSelected(z6);
                lVar2.itemView.setSelected(z6);
                int iD = gVar.f76331a.D();
                long jO = gVar.f76331a.O();
                long id = interestChooseItem2.getId();
                String name = interestChooseItem2.getName();
                String str = name;
                if (name == null) {
                    str = "";
                }
                e.k(iD, jO, id, str, interestChooseItem2.getListPosition() + 1, null, 0, 0, lVar2.f76345c.isSelected(), null, 1760);
                i iVar = gVar.f76332b;
                if (iVar != null) {
                    KProperty<Object>[] kPropertyArr = InterestChoseDialogG.f76271n;
                    ((InterestChoseDialogG) iVar.f76337a).mf();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        InterestChoose interestChoose = this.f76331a;
        if (interestChoose.D() == 17) {
            return new l(p.a(viewGroup, 2131498152, viewGroup, false));
        }
        throw new IllegalArgumentException(C3259x.a(interestChoose.D(), "unknown style :"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l lVar = (l) viewHolder;
        super.onViewAttachedToWindow(lVar);
        InterestChooseItem interestChooseItem = lVar.f76346d;
        if (interestChooseItem == null || interestChooseItem.getHasReported()) {
            return;
        }
        int listPosition = interestChooseItem.getListPosition();
        InterestChoose interestChoose = this.f76331a;
        e.l(interestChooseItem, listPosition + 1, null, 0, 0, interestChoose.D(), interestChoose.O(), null, false, 412);
        interestChooseItem.setHasReported(true);
    }
}

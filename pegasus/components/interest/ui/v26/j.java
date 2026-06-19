package com.bilibili.pegasus.components.interest.ui.v26;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4878o0;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbnailUrlTransformStrategy;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/j.class */
@StabilityInferred(parameters = 0)
public final class j extends RecyclerView.Adapter<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final P61.c f76457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bililive.room.ui.chronosguidecard.c f76458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<InterestChooseItem> f76459c = new ArrayList();

    public j(@NotNull P61.c cVar, @NotNull com.bilibili.bililive.room.ui.chronosguidecard.c cVar2) {
        this.f76457a = cVar;
        this.f76458b = cVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f76459c).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        h hVar = (h) viewHolder;
        final InterestChooseItem interestChooseItem = (InterestChooseItem) ((ArrayList) this.f76459c).get(i7);
        hVar.f76454a.f54114d.setText(interestChooseItem.getName());
        C4878o0 c4878o0 = hVar.f76454a;
        c4878o0.f54112b.setText(interestChooseItem.getDesc());
        String desc = interestChooseItem.getDesc();
        TintTextView tintTextView = c4878o0.f54112b;
        if (desc == null || StringsKt.isBlank(desc)) {
            tintTextView.setVisibility(8);
        } else {
            tintTextView.setVisibility(0);
        }
        ImageExtentionKt.displayImage$default(c4878o0.f54113c, interestChooseItem.getIcon(), (ThumbnailUrlTransformStrategy) null, (ImageLoadingListener) null, 0, 0, false, false, (ScaleType) null, (BitmapTransformation) null, false, 1022, (Object) null);
        boolean zIsSelected = interestChooseItem.isSelected();
        TintLinearLayout tintLinearLayout = c4878o0.f54111a;
        tintLinearLayout.setSelected(zIsSelected);
        tintLinearLayout.setOnClickListener(new View.OnClickListener(this, interestChooseItem) { // from class: com.bilibili.pegasus.components.interest.ui.v26.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final j f76455a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterestChooseItem f76456b;

            {
                this.f76455a = this;
                this.f76456b = interestChooseItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = this.f76455a;
                jVar.f76457a.invoke(this.f76456b);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return new h(C4878o0.bind(LayoutInflater.from(viewGroup.getContext()).inflate(2131498144, viewGroup, false)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        h hVar = (h) viewHolder;
        super.onViewAttachedToWindow(hVar);
        int layoutPosition = hVar.getLayoutPosition();
        if (layoutPosition < 0 || layoutPosition >= ((ArrayList) this.f76459c).size()) {
            return;
        }
        InterestChooseItem interestChooseItem = (InterestChooseItem) ((ArrayList) this.f76459c).get(layoutPosition);
        if (interestChooseItem.getHasReported()) {
            return;
        }
        interestChooseItem.setHasReported(true);
        this.f76458b.invoke(interestChooseItem);
    }
}

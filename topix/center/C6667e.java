package com.bilibili.topix.center;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.topix.center.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/e.class */
@StabilityInferred(parameters = 0)
public final class C6667e extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f112416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<n> f112417b = new ArrayList();

    /* JADX INFO: renamed from: com.bilibili.topix.center.e$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/e$a.class */
    public static final class a extends RecyclerView.ViewHolder {
    }

    public C6667e(@NotNull j jVar) {
        this.f112416a = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) this.f112417b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        TopixCenterItemType type;
        n nVar = (n) CollectionsKt.getOrNull(this.f112417b, i7);
        return (nVar == null || (type = nVar.getType()) == null) ? -1 : type.ordinal();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(@org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.ViewHolder r15, int r16) {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.C6667e.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        RecyclerView.ViewHolder a7;
        if (i7 == TopixCenterItemType.TOPIC_SECTION.ordinal()) {
            a7 = new x(viewGroup);
        } else if (i7 == TopixCenterItemType.TOPIC_HOT.ordinal() || i7 == TopixCenterItemType.TOPIC_COMMON.ordinal()) {
            a7 = new A(viewGroup);
        } else if (i7 == TopixCenterItemType.TOPIC_COLLECTED_LIST.ordinal()) {
            a7 = new D(viewGroup);
        } else if (i7 == TopixCenterItemType.TOPIC_IP.ordinal()) {
            a7 = new m(viewGroup, this.f112416a);
        } else {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setText(2131836463);
            a7 = new RecyclerView.ViewHolder(textView);
        }
        return a7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        n nVar = (n) CollectionsKt.getOrNull(this.f112417b, viewHolder.getBindingAdapterPosition());
        if (nVar instanceof TopicItem) {
            TopicItem topicItem = (TopicItem) nVar;
            q.c(topicItem.getType(), topicItem, topicItem.getPos());
            return;
        }
        if (nVar instanceof IpTopicItem) {
            IpTopicItem ipTopicItem = (IpTopicItem) nVar;
            TopixCenterItemType type = ipTopicItem.getType();
            int pos = ipTopicItem.getPos();
            Pair pair = TuplesKt.to("sub_module", type.getLabel());
            Pair pair2 = TuplesKt.to("server_info", ipTopicItem.getServerInfo());
            Pair pairA = com.bilibili.app.authorspace.ui.pages.p.a(pos, 1, "pos");
            Pair pair3 = TuplesKt.to("entity", "newtopic");
            Pair pair4 = TuplesKt.to("entity_id", String.valueOf(ipTopicItem.getId()));
            String rcmdText = ipTopicItem.getRcmdText();
            String str = rcmdText;
            if (rcmdText == null) {
                str = "";
            }
            Neurons.reportExposure$default(false, "dt.new-topic-center.topic-card.topic.show", MapsKt.mapOf(new Pair[]{pair, pair2, pairA, pair3, pair4, TuplesKt.to("participation_tag", str), TuplesKt.to("topic_tag", ipTopicItem.getRcmdIconUrl())}), (List) null, 8, (Object) null);
        }
    }
}

package com.bilibili.topix.center;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.mixstream.rtc3.listener.LiveMediaLinkBizListener;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.topix.center.D;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/D.class */
@StabilityInferred(parameters = 0)
public final class D extends RecyclerView.ViewHolder implements ExposeItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PD0.B f112355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f112356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<cY.a> f112357c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/D$a.class */
    public final class a extends RecyclerView.Adapter<xQ.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public List<TopicItem> f112358a = CollectionsKt.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final D f112359b;

        public a(D d7) {
            this.f112359b = d7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f112358a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
            xQ.m mVar = (xQ.m) viewHolder;
            mVar.itemView.setTag(Integer.valueOf(i7));
            TopicItem topicItem = (TopicItem) CollectionsKt.getOrNull(this.f112358a, i7);
            if (topicItem == null) {
                return;
            }
            PD0.z.bind(mVar.itemView).f18841b.setText(topicItem.getName());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
            final xQ.m mVarP0 = xQ.m.p0(2131500576, viewGroup.getContext(), viewGroup);
            mVarP0.itemView.setOnClickListener(new View.OnClickListener(mVarP0, this) { // from class: com.bilibili.topix.center.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final xQ.m f112352a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final D.a f112353b;

                {
                    this.f112352a = mVarP0;
                    this.f112353b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xQ.m mVar = this.f112352a;
                    D.a aVar = this.f112353b;
                    Object tag = mVar.itemView.getTag();
                    Integer num = tag instanceof Integer ? (Integer) tag : null;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        TopicItem topicItem = (TopicItem) CollectionsKt.getOrNull(aVar.f112358a, iIntValue);
                        if (topicItem == null) {
                            return;
                        }
                        q.b(TopixCenterItemType.TOPIC_COLLECTED_LIST, topicItem, iIntValue);
                        String jumpUrl = topicItem.getJumpUrl();
                        if (jumpUrl != null) {
                            final int i8 = 0;
                            BLRouter.routeTo(RouteRequestKt.toRouteRequest(jumpUrl).newBuilder().extras(new Function1(i8) { // from class: com.bilibili.topix.center.C

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f112354a;

                                {
                                    this.f112354a = i8;
                                }

                                public final Object invoke(Object obj) {
                                    switch (this.f112354a) {
                                        case 0:
                                            ((MutableBundleLike) obj).put("from_spmid", "dt.new-topic-center.topic-card.topic");
                                            break;
                                        default:
                                            ((LiveMediaLinkBizListener) obj).onMediaLinkingDestroyed();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }).build(), view.getContext());
                        }
                    }
                }
            });
            return mVarP0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            Object obj;
            xQ.m mVar = (xQ.m) viewHolder;
            super.onViewAttachedToWindow(mVar);
            View viewFindViewById = mVar.itemView.findViewById(2131298661);
            D d7 = this.f112359b;
            Iterator<T> it = d7.f112357c.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                cY.a aVar = (cY.a) next;
                if (!(aVar instanceof C6666d)) {
                    aVar = null;
                }
                C6666d c6666d = (C6666d) aVar;
                View view = null;
                if (c6666d != null) {
                    view = c6666d.f112415d;
                }
                if (Intrinsics.areEqual(view, viewFindViewById)) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                d7.f112357c.add(new C6666d(mVar, viewFindViewById));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            xQ.m mVar = (xQ.m) viewHolder;
            super.onViewDetachedFromWindow(mVar);
            CollectionsKt.removeAll(this.f112359b.f112357c, new Jq.s(mVar.itemView.findViewById(2131298661), 5));
        }
    }

    public D(@NotNull ViewGroup viewGroup) {
        super(p.a(viewGroup, 2131500580, viewGroup, false));
        PD0.B bBind = PD0.B.bind(this.itemView);
        this.f112355a = bBind;
        a aVar = new a(this);
        this.f112356b = aVar;
        this.f112357c = CollectionsKt.mutableListOf(new cY.a[]{new cY.b(new eY.c(bBind.f18594d), 0.5f)});
        RecyclerView recyclerView = bBind.f18594d;
        recyclerView.setLayoutManager(new GridLayoutManager(this.itemView.getContext(), 3, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(aVar);
    }

    @NotNull
    public final List<cY.a> getExposeChildren() {
        return this.f112357c;
    }

    public final void onChildExpose(int i7, @NotNull View view) {
        Object obj;
        xQ.m mVar;
        super.onChildExpose(i7, view);
        Iterator<T> it = this.f112357c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            Object next = it.next();
            cY.a aVar = (cY.a) next;
            if (!(aVar instanceof C6666d)) {
                aVar = null;
            }
            C6666d c6666d = (C6666d) aVar;
            if (Intrinsics.areEqual(c6666d != null ? c6666d.f112415d : null, view)) {
                obj = next;
                break;
            }
        }
        cY.a aVar2 = (cY.a) obj;
        if (aVar2 != null) {
            cY.a aVar3 = null;
            if (aVar2 instanceof C6666d) {
                aVar3 = aVar2;
            }
            C6666d c6666d2 = (C6666d) aVar3;
            if (c6666d2 == null || (mVar = c6666d2.f112414c) == null) {
                return;
            }
            int bindingAdapterPosition = mVar.getBindingAdapterPosition();
            TopicItem topicItem = (TopicItem) CollectionsKt.getOrNull(this.f112356b.f112358a, bindingAdapterPosition);
            if (topicItem == null) {
                return;
            }
            q.c(TopixCenterItemType.TOPIC_COLLECTED_LIST, topicItem, bindingAdapterPosition);
        }
    }
}

package com.bilibili.pegasus.holders.bannerv8.items;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.inline.card.CardPlayState;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.listeners.CardScrollStateObserver;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.holders.bannerv8.BannerItemType;
import com.bilibili.pegasus.holders.bannerv8.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/o.class */
@StabilityInferred(parameters = 0)
public final class o extends b<gp0.b, g<Th.b>> implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f77804a = "no_type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public g<Th.b> f77805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77806c;

    @Override // com.bilibili.pegasus.holders.bannerv8.z
    public final void a() {
        this.f77806c = true;
    }

    public final boolean allowShowIndicator() {
        CardScrollStateObserver cardScrollStateObserver;
        CardScrollStateObserver cardScrollStateObserver2;
        g<Th.b> gVar = this.f77805b;
        return (gVar != null && gVar.s0().getCardPlayProperty().getState().compareTo(CardPlayState.PAUSE) > 0) || ((cardScrollStateObserver = this.f77805b) != null && BannerItemType.INLINE_LIVE.getViewType() == cardScrollStateObserver.getItemViewType()) || ((cardScrollStateObserver2 = this.f77805b) != null && BannerItemType.INLINE_OGV.getViewType() == cardScrollStateObserver2.getItemViewType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder createViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            com.bilibili.pegasus.holders.bannerv8.BannerItemType[] r0 = com.bilibili.pegasus.holders.bannerv8.BannerItemType.values()
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r8 = r0
        Lc:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L2a
            r0 = r11
            r1 = r8
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            int r0 = r0.getViewType()
            r1 = r7
            if (r0 != r1) goto L24
            goto L2d
        L24:
            int r8 = r8 + 1
            goto Lc
        L2a:
            r0 = 0
            r10 = r0
        L2d:
            r0 = r10
            if (r0 == 0) goto L41
            r0 = r10
            java.lang.String r0 = r0.getType()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L41
            goto L45
        L41:
            java.lang.String r0 = "no_type"
            r10 = r0
        L45:
            r0 = r5
            r1 = r10
            r0.f77804a = r1
            r0 = r6
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131498129(0x7f0c1491, float:1.861987E38)
            r2 = r6
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r6 = r0
            r0 = r6
            com.bilibili.app.comm.list.widget.utils.ListExtentionsKt.setChildrenAllAccessibilityNo(r0)
            r0 = r7
            com.bilibili.pegasus.holders.bannerv8.BannerItemType r1 = com.bilibili.pegasus.holders.bannerv8.BannerItemType.INLINE_AV
            int r1 = r1.getViewType()
            if (r0 != r1) goto L74
            com.bilibili.pegasus.holders.bannerv8.items.p r0 = new com.bilibili.pegasus.holders.bannerv8.items.p
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            goto La5
        L74:
            r0 = r7
            com.bilibili.pegasus.holders.bannerv8.BannerItemType r1 = com.bilibili.pegasus.holders.bannerv8.BannerItemType.INLINE_OGV
            int r1 = r1.getViewType()
            if (r0 != r1) goto L8e
            com.bilibili.pegasus.holders.bannerv8.items.n r0 = new com.bilibili.pegasus.holders.bannerv8.items.n
            r1 = r0
            r2 = r6
            r3 = r5
            boolean r3 = r3.f77806c
            r1.<init>(r2, r3)
            r6 = r0
            goto La5
        L8e:
            r0 = r7
            com.bilibili.pegasus.holders.bannerv8.BannerItemType r1 = com.bilibili.pegasus.holders.bannerv8.BannerItemType.INLINE_LIVE
            int r1 = r1.getViewType()
            if (r0 != r1) goto La7
            com.bilibili.pegasus.holders.bannerv8.items.m r0 = new com.bilibili.pegasus.holders.bannerv8.items.m
            r1 = r0
            r2 = r6
            r3 = r5
            boolean r3 = r3.f77806c
            r1.<init>(r2, r3)
            r6 = r0
        La5:
            r0 = r6
            return r0
        La7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "can't create pegasus banner inline item,view type does not match,error type = "
            r3 = r5
            java.lang.String r3 = r3.f77804a
            java.lang.String r2 = androidx.compose.ui.text.font.C4496a.a(r2, r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.bannerv8.items.o.createViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final boolean isConsumingLoopEvent() {
        g<Th.b> gVar = this.f77805b;
        boolean z6 = false;
        if (gVar != null) {
            z6 = false;
            if (gVar.s0().getCardPlayProperty().getState().compareTo(CardPlayState.PAUSE) <= 0) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBindViewHolder(Object obj, RecyclerView.ViewHolder viewHolder, Fragment fragment, BannerController bannerController, IInlineControl iInlineControl) {
        gp0.b bVar = (gp0.b) obj;
        final g<Th.b> gVar = (g) viewHolder;
        this.f77805b = gVar;
        gVar.f77755b = iInlineControl;
        BasePegasusData basePegasusDataM = bVar.m();
        gp0.d dVar = basePegasusDataM instanceof gp0.d ? (gp0.d) basePegasusDataM : null;
        if (dVar != null) {
            dVar.setType(bVar.getType());
        }
        if (dVar == null) {
            Dd.k.b("bind ", this.f77804a, " video banner error video data can not be null", "PegasusVideoBannerItem");
            return;
        }
        gVar.f77756c = dVar;
        gVar.f77758e = bannerController;
        gVar.f77754a = fragment;
        gVar.bind();
        boolean z6 = false;
        if (dVar.isInlinePlayable()) {
            PlayerArgs playerArgs = dVar.getPlayerArgs();
            z6 = false;
            if (playerArgs != null ? playerArgs.clickToPlay() : false) {
                z6 = true;
            }
        }
        if (z6) {
            return;
        }
        gVar.f77761i.setOnClickListener(new View.OnClickListener(gVar) { // from class: com.bilibili.pegasus.holders.bannerv8.items.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f77751a;

            {
                this.f77751a = gVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77751a.x0();
            }
        });
    }

    public final void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder) {
        super/*com.bilibili.app.comm.list.widget.banneradapter.BannerItem*/.onViewDetachedFromWindow(viewHolder);
        g<Th.b> gVar = this.f77805b;
        if (gVar != null) {
            BLog.i(gVar.v0(), "banner item detached and unregister release observer");
            gVar.r0();
        }
    }
}

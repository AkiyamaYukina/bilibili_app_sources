package com.bilibili.pegasus.holders.bannerv8;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.banneradapter.BannerController;
import com.bilibili.app.comm.list.widget.banneradapter.BannerItem;
import com.bilibili.app.comm.list.widget.banneradapter.CardBannerAdapter;
import com.bilibili.inline.control.IInlineControl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/f.class */
@StabilityInferred(parameters = 0)
public final class f extends CardBannerAdapter<gp0.b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<gp0.b> f77736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f77737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final p f77738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public IInlineControl f77739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Map<Integer, String> f77740n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f77741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final SparseArray<y> f77742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final e f77743q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/f$a.class */
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f77744a;

        public a(f fVar) {
            this.f77744a = fVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            view.setClipToOutline(true);
            view.setOutlineProvider(new b(this.f77744a));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/f$b.class */
    public static final class b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f77745a;

        public b(f fVar) {
            this.f77745a = fVar;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f77745a.f77737k);
        }
    }

    public f(@NotNull List list, @NotNull g gVar, @NotNull V8Banner v8Banner, float f7, @NotNull p pVar) {
        super(list, gVar, v8Banner, (BannerController) null, 8, (DefaultConstructorMarker) null);
        this.f77736j = list;
        this.f77737k = f7;
        this.f77738l = pVar;
        this.f77740n = new LinkedHashMap();
        this.f77741o = true;
        this.f77742p = new SparseArray<>();
        this.f77743q = new e(v8Banner, this);
    }

    public final int getViewType(int i7) {
        String type;
        gp0.b bVar = (gp0.b) CollectionsKt.getOrNull(this.f77736j, i7);
        int iHashCode = (bVar == null || (type = bVar.getType()) == null) ? -1 : type.hashCode();
        this.f77740n.put(Integer.valueOf(iHashCode), bVar != null ? bVar.getType() : null);
        return iHashCode;
    }

    public final void onBindViewHolderReal(@NotNull RecyclerView.ViewHolder viewHolder, int i7, @NotNull List<Object> list) {
        gp0.b bVar = (gp0.b) CollectionsKt.getOrNull(getMDataList(), i7);
        Fragment mFragment = getMFragment();
        if (bVar != null && mFragment != null) {
            BannerItem bannerItem = getBannerItem(viewHolder);
            if (bannerItem == null) {
                return;
            }
            y yVar = this.f77742p.get(i7);
            y yVar2 = yVar;
            if (yVar == null) {
                yVar2 = new y(getBanner(), i7, this.f77743q, this.f77738l);
                this.f77742p.put(i7, yVar2);
                bilibili.live.app.service.resolver.c.a(this.f77742p.size(), "controller size :", "BannerAdapter");
            }
            yVar2.f77839f = bannerItem.getLogName();
            bannerItem.onBindViewHolder(bVar, viewHolder, mFragment, yVar2, this.f77739m);
        }
        View view = viewHolder.itemView;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(this));
        } else {
            view.setClipToOutline(true);
            view.setOutlineProvider(new b(this));
        }
    }
}

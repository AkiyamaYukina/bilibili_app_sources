package com.bilibili.pegasus.channelv2.detail.tab.baike;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeTreePart;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/a.class */
@StabilityInferred(parameters = 0)
public final class a extends si.f<b, C0475a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RecyclerView f75093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f75094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<ChannelBaikeTreePart> f75095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f75096g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TR.f f75097i;

    /* JADX INFO: renamed from: com.bilibili.pegasus.channelv2.detail.tab.baike.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/a$a.class */
    public final class C0475a extends si.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TintTextView f75098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public ChannelBaikeTreePart f75099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ChannelBaikeTreePart f75100c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0475a(@NotNull a aVar, ViewGroup viewGroup) {
            super(p.a(viewGroup, 2131495389, viewGroup, false));
            this.f75098a = (TintTextView) this.itemView.findViewById(2131312039);
            this.itemView.setOnClickListener(new Qv.b(1, this, aVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void p0(int i7, boolean z6) {
            TintTextView tintTextView = this.f75098a;
            if (z6) {
                tintTextView.setTextColor(i7);
                tintTextView.setBackgroundColor(ColorUtils.setAlphaComponent(i7, 25));
            } else {
                tintTextView.setTextColor(this.itemView.getResources().getColor(R$color.Ga10));
                tintTextView.setBackgroundColor(this.itemView.getResources().getColor(R$color.f64616Wh0));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/a$b.class */
    public final class b extends si.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TintTextView f75101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TintImageView f75102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final View f75103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ChannelBaikeTreePart f75104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f75105f;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull a aVar, ViewGroup viewGroup) {
            this.f75105f = aVar;
            View viewA = p.a(viewGroup, 2131495390, viewGroup, false);
            super(viewA);
            viewA.setOnClickListener(this);
            this.f75101b = (TintTextView) this.itemView.findViewById(2131310619);
            this.f75102c = (TintImageView) this.itemView.findViewById(2131296843);
            this.f75103d = this.itemView.findViewById(2131313888);
        }

        public final void p0() {
            this.f75102c.setImageResource(2131234511);
            this.f75102c.setImageTintList(R$color.Ga5);
        }

        public final void q0() {
            this.f75102c.setImageResource(2131234513);
            this.f75102c.setImageTintList(R$color.Ga5);
        }

        public final void r0(@Nullable ChannelBaikeTreePart channelBaikeTreePart) {
            this.f75104e = channelBaikeTreePart;
            this.f75101b.setText(channelBaikeTreePart != null ? channelBaikeTreePart.getCatalogueTitle() : null);
            TintImageView tintImageView = this.f75102c;
            List<ChannelBaikeTreePart> childPart = null;
            if (channelBaikeTreePart != null) {
                childPart = channelBaikeTreePart.getChildPart();
            }
            List<ChannelBaikeTreePart> list = childPart;
            tintImageView.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void s0(int i7, boolean z6) {
            if (!z6) {
                this.f75101b.setTextColor(this.itemView.getResources().getColor(R$color.Ga10));
                this.f75101b.setBackgroundColor(this.itemView.getResources().getColor(R$color.f64616Wh0));
                this.f75102c.setBackgroundColor(this.itemView.getResources().getColor(R$color.f64616Wh0));
                this.f75103d.setBackgroundColor(0);
                return;
            }
            this.f75101b.setTextColor(i7);
            int iBlendARGB = ColorUtils.blendARGB(this.itemView.getResources().getColor(R$color.f64616Wh0), i7, 0.1f);
            this.f75101b.setBackgroundColor(iBlendARGB);
            this.f75102c.setBackgroundColor(iBlendARGB);
            this.f75103d.setBackgroundColor(ColorUtils.setAlphaComponent(i7, 26));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, si.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, si.b] */
    public a(@NotNull RecyclerView recyclerView, int i7, @NotNull List list, int i8, long j7, @NotNull TR.f fVar) {
        ?? obj = new Object();
        ((si.d) obj).a = list;
        ((si.d) obj).b = new boolean[list.size()];
        int i9 = 0;
        while (i9 < list.size()) {
            ((si.d) obj).b[i9] = i9 == i8;
            i9++;
        }
        ((si.f) this).a = obj;
        ?? obj2 = new Object();
        ((si.b) obj2).b = obj;
        ((si.b) obj2).a = this;
        ((si.f) this).b = obj2;
        this.f75093d = recyclerView;
        this.f75094e = i7;
        this.f75095f = list;
        this.f75096g = i8;
        this.h = j7;
        this.f75097i = fVar;
        ((si.f) this).c = new C60.k(this);
    }

    public final si.e O(int i7) {
        si.e eVarA;
        try {
            si.d dVar = ((si.f) this).a;
            eVarA = null;
            if (dVar != null) {
                eVarA = dVar.a(i7);
            }
        } catch (RuntimeException e7) {
            eVarA = null;
        }
        return eVarA;
    }

    public final long b(int i7) {
        si.e eVarO = O(i7);
        si.d dVar = ((si.f) this).a;
        long nid = -1;
        if (Intrinsics.areEqual(ArraysKt.getOrNull(dVar.b, eVarO != null ? eVarO.a : -1), Boolean.TRUE)) {
            List list = dVar.a;
            int i8 = -1;
            if (eVarO != null) {
                i8 = eVarO.a;
            }
            si.c cVar = (si.c) CollectionsKt.getOrNull(list, i8);
            ChannelBaikeTreePart channelBaikeTreePart = null;
            if (cVar != null) {
                channelBaikeTreePart = (ChannelBaikeTreePart) (cVar instanceof ChannelBaikeTreePart ? cVar : null);
            }
            nid = -1;
            if (channelBaikeTreePart != null) {
                nid = channelBaikeTreePart.getNid();
            }
        }
        return nid;
    }

    public final int getItemViewType(int i7) {
        si.e eVarO = O(i7);
        return eVarO != null ? eVarO.d : -1;
    }
}

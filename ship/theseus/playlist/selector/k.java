package com.bilibili.ship.theseus.playlist.selector;

import I.E;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewbinding.ViewBinding;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k.class */
@StabilityInferred(parameters = 0)
public final class k extends com.bilibili.app.gemini.ui.m<Pu0.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f95879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f95880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f95881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<b> f95882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<b> f95883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.selector.b f95884f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int px = NewPlayerUtilsKt.toPx(12.0f);
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            com.bilibili.ship.theseus.playlist.selector.b bVar = adapter instanceof com.bilibili.ship.theseus.playlist.selector.b ? (com.bilibili.ship.theseus.playlist.selector.b) adapter : null;
            if (bVar == null) {
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1 || ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanSizeLookup().getSpanSize(childAdapterPosition) != 1 || bVar.f95857c.size() == 0) {
                return;
            }
            if (bVar.N(childAdapterPosition)) {
                i8 = px / 2;
                i7 = px;
            } else {
                i7 = px / 2;
                i8 = px;
            }
            rect.set(i7, px, i8, (!bVar.N(childAdapterPosition) ? !((i9 = childAdapterPosition + 1) >= bVar.f95857c.size() || !(bVar.getItemViewType(i9) == 2 || bVar.getItemViewType(i9) == 2)) : !((i10 = childAdapterPosition + 1) >= bVar.f95857c.size() || !((bVar.getItemViewType(i10) == 2 || bVar.getItemViewType(i10) == 2) && (i11 = childAdapterPosition + 2) < bVar.f95857c.size() && (bVar.getItemViewType(i11) == 2 || bVar.getItemViewType(i11) == 2)))) ? px : 0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f95885a = new Object();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.k$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0797b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0797b f95886a = new Object();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$c.class */
    @StabilityInferred(parameters = 0)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MultiTypeMedia f95887a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$c$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a extends c {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$c$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b extends c {
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.k$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$c$c.class */
        @StabilityInferred(parameters = 0)
        public static final class C0798c extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Ou0.c f95888b;

            public C0798c(@NotNull MultiTypeMedia multiTypeMedia, @NotNull Ou0.c cVar) {
                super(multiTypeMedia);
                this.f95888b = cVar;
            }
        }

        public c(MultiTypeMedia multiTypeMedia) {
            this.f95887a = multiTypeMedia;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Flow<List<b>> f95889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<PlaylistRepository.b> f95890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final PlaylistRepository.e f95891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f95892d;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$d$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f95893a = -1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f95894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f95895c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f95896d;

            public a(String str, int i7) {
                this.f95894b = str;
                this.f95895c = i7;
                this.f95896d = i7 > 0;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f95893a == aVar.f95893a && Intrinsics.areEqual(this.f95894b, aVar.f95894b) && this.f95895c == aVar.f95895c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f95895c) + E.a(Long.hashCode(this.f95893a) * 31, 31, this.f95894b);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("HeaderInfo(id=");
                sb.append(this.f95893a);
                sb.append(", title=");
                sb.append(this.f95894b);
                sb.append(", totalMedia=");
                return C4277b.a(this.f95895c, ")", sb);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$d$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Object f95897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f95898b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f95899c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public final ExposureEntry f95900d;

            public b(@NotNull Object obj, int i7, long j7, @Nullable ExposureEntry exposureEntry) {
                this.f95897a = obj;
                this.f95898b = i7;
                this.f95899c = j7;
                this.f95900d = exposureEntry;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f95897a, bVar.f95897a) && this.f95898b == bVar.f95898b && this.f95899c == bVar.f95899c && Intrinsics.areEqual(this.f95900d, bVar.f95900d);
            }

            public final int hashCode() {
                int iA = C3554n0.a(I.a(this.f95898b, this.f95897a.hashCode() * 31, 31), 31, this.f95899c);
                ExposureEntry exposureEntry = this.f95900d;
                return iA + (exposureEntry == null ? 0 : exposureEntry.hashCode());
            }

            @NotNull
            public final String toString() {
                return "ListItem(data=" + this.f95897a + ", type=" + this.f95898b + ", id=" + this.f95899c + ", exposureEntry=" + this.f95900d + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull Flow<? extends List<b>> flow, @NotNull StateFlow<PlaylistRepository.b> stateFlow, @NotNull PlaylistRepository.e eVar, int i7) {
            this.f95889a = flow;
            this.f95890b = stateFlow;
            this.f95891c = eVar;
            this.f95892d = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f95889a, dVar.f95889a) && Intrinsics.areEqual(this.f95890b, dVar.f95890b) && Intrinsics.areEqual(this.f95891c, dVar.f95891c) && this.f95892d == dVar.f95892d;
        }

        public final int hashCode() {
            int iA = androidx.core.content.b.a(this.f95890b, this.f95889a.hashCode() * 31, 31);
            return Integer.hashCode(this.f95892d) + ((this.f95891c.hashCode() + iA) * 31);
        }

        @NotNull
        public final String toString() {
            return "State(mediaListFlow=" + this.f95889a + ", loaderStateFlow=" + this.f95890b + ", playingMedia=" + this.f95891c + ", playlistType=" + this.f95892d + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/k$e.class */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f95901a;

        public e(k kVar) {
            this.f95901a = kVar;
        }
    }

    public k(@NotNull d dVar) {
        this.f95879a = dVar;
        MutableSharedFlow<c> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95880b = mutableSharedFlowMutableSharedFlow$default;
        this.f95881c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<b> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f95882d = mutableSharedFlowMutableSharedFlow$default2;
        this.f95883e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.f95884f = new com.bilibili.ship.theseus.playlist.selector.b(new e(this), dVar.f95892d);
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        Pu0.d dVar = (Pu0.d) viewBinding;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlaylistSelectorUIComponent$bind$2(dVar.f19313a, this, dVar, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Pu0.d dVarInflate = Pu0.d.inflate(layoutInflater, viewGroup, false);
        PlaylistRecyclerView playlistRecyclerView = dVarInflate.f19314b;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.setSpanSizeLookup(new l(this));
        playlistRecyclerView.setLayoutManager(gridLayoutManager);
        playlistRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration());
        playlistRecyclerView.setLoadEventCallback(new m(this));
        playlistRecyclerView.setAdapter(this.f95884f);
        ((SimpleItemAnimator) playlistRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        return dVarInflate;
    }
}

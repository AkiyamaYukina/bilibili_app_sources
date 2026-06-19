package com.bilibili.ogv.operation.inlineplayer2;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.card.DefaultInlineProperty;
import com.bilibili.inline.card.IInlineBehavior;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.IInlineCardData;
import com.bilibili.inline.card.IInlinePlayItem;
import com.bilibili.inline.card.IInlineProperty;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.inline.utils.InlineReportParam;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer2/a.class */
@StabilityInferred(parameters = 0)
public abstract class a<P extends InlinePanel> extends RecyclerView.ViewHolder implements IInlineCard<P> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70262c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private P f70263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final PanelDetachListener f70264b;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation.inlineplayer2.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer2/a$a.class */
    public static final class C0428a implements IInlineCardData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<P> f70265a;

        public C0428a(a<P> aVar) {
            this.f70265a = aVar;
        }

        public IInlineProperty getCardPlayProperty() {
            return this.f70265a.s0();
        }

        public IInlineBehavior getInlineBehavior() {
            return this.f70265a.x0();
        }

        public IInlinePlayItem getInlinePlayerItem() {
            return this.f70265a.y0();
        }

        public InlineReportParam getInlineReportParams() {
            return this.f70265a.z0();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer2/a$b.class */
    public static final class b implements IInlineBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<P> f70266a;

        public b(a<P> aVar) {
            this.f70266a = aVar;
        }

        public boolean getCardPlayable(boolean z6) {
            return z6 && this.f70266a.A0();
        }

        public boolean getReleaseOnEnd() {
            return this.f70266a.B0();
        }

        public int getRepeatCount() {
            return this.f70266a.C0();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer2/a$c.class */
    public static final class c implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<P> f70267a;

        public c(a<P> aVar) {
            this.f70267a = aVar;
        }

        public CharSequence getInlineLogDescription() {
            return this.f70267a.u0();
        }

        public Video.PlayableParams getInlinePlayableParams() {
            return this.f70267a.t0();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/inlineplayer2/a$d.class */
    public static final class d implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<P> f70268a;

        public d(a<P> aVar) {
            this.f70268a = aVar;
        }

        public void onDetach(InlinePanel inlinePanel) {
            this.f70268a.D0(null);
        }
    }

    public a(@NotNull View view) {
        super(view);
        this.f70264b = new d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInlineBehavior x0() {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInlinePlayItem y0() {
        return new c(this);
    }

    public abstract boolean A0();

    public boolean B0() {
        return true;
    }

    public int C0() {
        return -1;
    }

    public final void D0(@Nullable P p7) {
        P p8 = this.f70263a;
        if (p8 != null) {
            p8.removeOnDetachListener(this.f70264b);
        }
        this.f70263a = p7;
        if (p7 != null) {
            p7.addOnDetachListener(this.f70264b);
        }
    }

    @Nullable
    public ViewGroup getInlineContainer() {
        ViewGroup viewGroupW0 = w0();
        viewGroupW0.setVisibility(0);
        return viewGroupW0;
    }

    @CallSuper
    public void onBindPanel(@NotNull P p7) {
        D0(p7);
    }

    @NotNull
    public final IInlineCardData r0() {
        return new C0428a(this);
    }

    @NotNull
    public IInlineProperty s0() {
        return new DefaultInlineProperty();
    }

    @Nullable
    public abstract Video.PlayableParams t0();

    @NotNull
    public CharSequence u0() {
        StringBuilder sb = new StringBuilder("Card playable card log info");
        Video.PlayableParams playableParamsT0 = t0();
        sb.append(playableParamsT0 != null ? playableParamsT0.getLogDescription() : null);
        return sb;
    }

    @Nullable
    public final P v0() {
        return this.f70263a;
    }

    @NotNull
    public abstract ViewGroup w0();

    @Nullable
    public InlineReportParam z0() {
        return null;
    }
}

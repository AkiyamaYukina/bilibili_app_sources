package com.bilibili.ogv.operation2.inlinevideo;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
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

/* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/e.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC5495e<P extends InlinePanel> implements IInlineCard<P> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70922d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f70923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private P f70924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final PanelDetachListener f70925c = new d(this);

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.e$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/e$a.class */
    public static final class a implements IInlineCardData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC5495e<P> f70926a;

        public a(AbstractC5495e<P> abstractC5495e) {
            this.f70926a = abstractC5495e;
        }

        public IInlineProperty getCardPlayProperty() {
            return this.f70926a.d();
        }

        public IInlineBehavior getInlineBehavior() {
            return this.f70926a.j();
        }

        public IInlinePlayItem getInlinePlayerItem() {
            return this.f70926a.k();
        }

        public InlineReportParam getInlineReportParams() {
            return this.f70926a.l();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.e$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/e$b.class */
    public static final class b implements IInlineBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC5495e<P> f70927a;

        public b(AbstractC5495e<P> abstractC5495e) {
            this.f70927a = abstractC5495e;
        }

        public boolean getCardPlayable(boolean z6) {
            return z6 && this.f70927a.m();
        }

        public boolean getReleaseOnEnd() {
            return this.f70927a.n();
        }

        public int getRepeatCount() {
            return this.f70927a.o();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.e$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/e$c.class */
    public static final class c implements IInlinePlayItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC5495e<P> f70928a;

        public c(AbstractC5495e<P> abstractC5495e) {
            this.f70928a = abstractC5495e;
        }

        public CharSequence getInlineLogDescription() {
            return this.f70928a.g();
        }

        public Video.PlayableParams getInlinePlayableParams() {
            return this.f70928a.e();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.inlinevideo.e$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/e$d.class */
    public static final class d implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AbstractC5495e<P> f70929a;

        public d(AbstractC5495e<P> abstractC5495e) {
            this.f70929a = abstractC5495e;
        }

        public void onDetach(InlinePanel inlinePanel) {
            this.f70929a.p(null);
        }
    }

    public AbstractC5495e(@NotNull View view) {
        this.f70923a = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInlineBehavior j() {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInlinePlayItem k() {
        return new c(this);
    }

    @NotNull
    public final IInlineCardData c() {
        return new a(this);
    }

    @NotNull
    public IInlineProperty d() {
        return new DefaultInlineProperty();
    }

    @Nullable
    public abstract Video.PlayableParams e();

    @NotNull
    public final View f() {
        return this.f70923a;
    }

    @NotNull
    public CharSequence g() {
        StringBuilder sb = new StringBuilder("Card playable card log info");
        Video.PlayableParams playableParamsE = e();
        sb.append(playableParamsE != null ? playableParamsE.getLogDescription() : null);
        return sb;
    }

    @NotNull
    public ViewGroup getInlineContainer() {
        ViewGroup viewGroupI = i();
        viewGroupI.setVisibility(0);
        return viewGroupI;
    }

    @Nullable
    public final P h() {
        return this.f70924b;
    }

    @NotNull
    public abstract ViewGroup i();

    @Nullable
    public InlineReportParam l() {
        return null;
    }

    public abstract boolean m();

    public boolean n() {
        return true;
    }

    public int o() {
        return -1;
    }

    @CallSuper
    public void onBindPanel(@NotNull P p7) {
        p(p7);
    }

    public final void p(@Nullable P p7) {
        P p8 = this.f70924b;
        if (p8 != null) {
            p8.removeOnDetachListener(this.f70925c);
        }
        this.f70924b = p7;
        if (p7 != null) {
            p7.addOnDetachListener(this.f70925c);
        }
    }
}

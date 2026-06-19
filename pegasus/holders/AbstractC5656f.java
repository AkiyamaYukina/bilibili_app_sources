package com.bilibili.pegasus.holders;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import kotlin.Lazy;
import kotlin.LazyKt;
import op0.C8249a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/f.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC5656f<T extends BasePegasusPlayerData, P extends InlinePanel> extends AbstractC5652d<T> implements IInlineCard<P>, com.bilibili.pegasus.common.inline.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f77860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public P f77861g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f77862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f77863j;

    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.f$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/f$a.class */
    public static final class a implements Wi1.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC5656f<T, P> f77864a;

        public a(AbstractC5656f<T, P> abstractC5656f) {
            this.f77864a = abstractC5656f;
        }

        public final void onClick(ICardPlayerContext iCardPlayerContext) {
            AbstractC5656f<T, P> abstractC5656f = this.f77864a;
            C8249a.h(abstractC5656f, abstractC5656f, null, null, "1", null, false, false, false, false, null, 2038);
        }

        public final void onDismiss(ICardPlayerContext iCardPlayerContext) {
            P p7 = this.f77864a.f77861g;
            if (p7 != null) {
                p7.setVisibility(true);
            }
        }

        public final void onShow(ICardPlayerContext iCardPlayerContext) {
            P p7 = this.f77864a.f77861g;
            if (p7 != null) {
                p7.setVisibility(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.f$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/f$b.class */
    public static final class b implements PanelDetachListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC5656f<T, P> f77865a;

        public b(AbstractC5656f<T, P> abstractC5656f) {
            this.f77865a = abstractC5656f;
        }

        public final void onDetach(InlinePanel inlinePanel) {
            AbstractC5656f<T, P> abstractC5656f = this.f77865a;
            abstractC5656f.B0(inlinePanel);
            P p7 = abstractC5656f.f77861g;
            if (p7 != null) {
                p7.removeOnDetachListener(abstractC5656f.f77860f);
            }
            abstractC5656f.f77861g = null;
        }
    }

    public AbstractC5656f(@NotNull View view) {
        super(view);
        this.f77860f = new b(this);
        this.h = LazyKt.lazy(new H3.E(8));
        this.f77862i = LazyKt.lazy(new bi.a(this, 2));
        this.f77863j = ListExtentionsKt.lazyUnsafe(new PQ0.c(this, 4));
    }

    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    @CallSuper
    /* JADX INFO: renamed from: A0 */
    public void u0(@NotNull T t7) {
        p0();
        z0().setId(ViewCompat.generateViewId());
        y0();
        boolean z6 = false;
        if (t7.isInlinePlayable()) {
            PlayerArgs playerArgs = t7.getPlayerArgs();
            z6 = false;
            if (playerArgs != null ? playerArgs.clickToPlay() : false) {
                z6 = true;
            }
        }
        if (z6) {
            return;
        }
        final int i7 = 0;
        z0().setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.pegasus.holders.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77857b;

            {
                this.f77856a = i7;
                this.f77857b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r14) {
                /*
                    Method dump skipped, instruction units count: 602
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.ViewOnClickListenerC5654e.onClick(android.view.View):void");
            }
        });
    }

    @CallSuper
    public void B0(@NotNull P p7) {
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        return z0();
    }

    @CallSuper
    public void onBindPanel(@NotNull P p7) {
        P p8 = this.f77861g;
        b bVar = this.f77860f;
        if (p8 != null) {
            p8.removeOnDetachListener(bVar);
        }
        this.f77861g = p7;
        if (p7 != null) {
            p7.addOnDetachListener(bVar);
        }
        P p9 = this.f77861g;
        if (p9 != null) {
            p9.setVisibility(true);
        }
        if (((Boolean) this.h.getValue()).booleanValue()) {
            P p10 = this.f77861g;
            Lazy lazy = this.f77862i;
            if (p10 != null) {
                p10.removeNetworkAlertCallback((Wi1.k) lazy.getValue());
            }
            P p11 = this.f77861g;
            if (p11 != null) {
                p11.addNetworkAlertCallback((Wi1.k) lazy.getValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y0() {
        /*
            r7 = this;
            r0 = r7
            com.bilibili.pegasus.PegasusHolderData r0 = r0.getBindData()
            com.bilibili.pegasus.data.base.BasePegasusPlayerData r0 = (com.bilibili.pegasus.data.base.BasePegasusPlayerData) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = r7
            com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout r0 = r0.z0()
            r11 = r0
            F80.c r0 = new F80.c
            r1 = r0
            r2 = r7
            r3 = 3
            r1.<init>(r2, r3)
            r14 = r0
            A90.d r0 = new A90.d
            r1 = r0
            r2 = r7
            r3 = 3
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r13
            com.bilibili.app.comm.list.common.api.model.PlayerArgs r0 = r0.getPlayerArgs()
            r15 = r0
            r0 = 1
            r10 = r0
            r0 = r15
            if (r0 == 0) goto L48
            r0 = r15
            boolean r0 = r0.hidePlayButton
            if (r0 != 0) goto L48
            r0 = 1
            r8 = r0
            goto L4a
        L48:
            r0 = 0
            r8 = r0
        L4a:
            r0 = r13
            boolean r0 = r0.isInlinePlayable()
            if (r0 == 0) goto L76
            r0 = r13
            com.bilibili.app.comm.list.common.api.model.PlayerArgs r0 = r0.getPlayerArgs()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L6b
            r0 = r15
            boolean r0 = r0.clickToPlay()
            r9 = r0
            goto L6d
        L6b:
            r0 = 0
            r9 = r0
        L6d:
            r0 = r9
            if (r0 == 0) goto L76
            r0 = r10
            r9 = r0
            goto L78
        L76:
            r0 = 0
            r9 = r0
        L78:
            r0 = r11
            r1 = r14
            r2 = r12
            r3 = r8
            r4 = r9
            r5 = r13
            java.util.Map r5 = pp0.C8340D.d(r5)
            r0.bindViewPlay(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.AbstractC5656f.y0():void");
    }

    @NotNull
    public final CardFragmentPlayerContainerLayout z0() {
        return (CardFragmentPlayerContainerLayout) this.f77863j.getValue();
    }
}

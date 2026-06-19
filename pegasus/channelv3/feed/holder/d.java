package com.bilibili.pegasus.channelv3.feed.holder;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.comm.list.widget.play.CardFragmentPlayerContainerLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.pegasus.card.base.E;
import gl.z;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo0.AbstractC8906a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/d.class */
@StabilityInferred(parameters = 0)
public abstract class d<T extends AbstractC8906a, VB extends ViewBinding, P extends InlinePanel> extends a<T, VB> implements IInlineCard<P>, E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IInlineControl f75297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public P f75298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f75299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c f75300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f75301g;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull z zVar) {
        super(zVar);
        this.f75299e = this.itemView.getContext();
        this.f75300f = new c(this);
        this.f75301g = ListExtentionsKt.lazyUnsafe(new b(this, 0));
    }

    @NotNull
    public final Context getContext() {
        return this.f75299e;
    }

    @Nullable
    public final ViewGroup getInlineContainer() {
        return q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBind(int r10, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r11) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.feed.holder.d.onBind(int, java.util.List):void");
    }

    @NotNull
    public final CardFragmentPlayerContainerLayout q0() {
        return (CardFragmentPlayerContainerLayout) this.f75301g.getValue();
    }

    public final void r0(@Nullable P p7) {
        P p8 = this.f75298d;
        c cVar = this.f75300f;
        if (p8 != null) {
            p8.removeOnDetachListener(cVar);
        }
        this.f75298d = p7;
        if (p7 != null) {
            p7.addOnDetachListener(cVar);
        }
    }
}

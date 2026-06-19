package com.bilibili.ogv.operation2.inlinevideo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.delegate.DefaultInlinePlayDelegate;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/l.class */
@StabilityInferred(parameters = 0)
public final class l extends DefaultInlinePlayDelegate {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f70952p = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final IInlineVolumeService f70953o;

    public l(@NotNull Fragment fragment) {
        super(fragment, (FragmentActivity) null, (Context) null, 6, (DefaultConstructorMarker) null);
        this.f70953o = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
    }

    public final void f() {
        pausePlayInner();
    }

    public final <T extends InlinePanel> void g(@NotNull IInlineCard<T> iInlineCard) {
        pausePlayInner(iInlineCard);
    }

    @Nullable
    public IInlineVolumeService getMuteService() {
        return this.f70953o;
    }

    public final void h() {
        replayInner();
    }

    public final <T extends InlinePanel> void i(@NotNull IInlineCard<T> iInlineCard) {
        replayInner(iInlineCard);
    }

    public final void j() {
        resumePlayInner();
    }

    public final <T extends InlinePanel> void k(@NotNull IInlineCard<T> iInlineCard) {
        resumePlayInner(iInlineCard);
    }

    public final <T extends InlinePanel> void l(@NotNull IInlineCard<T> iInlineCard) {
        startPlayInner(iInlineCard, false);
    }

    public final void m() {
        stopPlayInner();
    }

    public final <T extends InlinePanel> void n(@NotNull IInlineCard<T> iInlineCard) {
        stopPlayInner(iInlineCard);
    }
}

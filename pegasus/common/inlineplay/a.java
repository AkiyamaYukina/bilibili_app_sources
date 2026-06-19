package com.bilibili.pegasus.common.inlineplay;

import F3.K;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleKt;
import com.bilibili.app.comm.list.common.inline.SingleColumnInlineProperty;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.delegate.DefaultInlinePlayDelegate;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.list.IInlineVolumeService;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.player.BiliCardPlayerScene;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/a.class */
@StabilityInferred(parameters = 0)
public final class a extends DefaultInlinePlayDelegate {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final IInlineVolumeService f75639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public IInlineCard<?> f75640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f75641q;

    public a(@NotNull Fragment fragment) {
        super(fragment, (FragmentActivity) null, (Context) null, 6, (DefaultConstructorMarker) null);
        this.f75639o = (IInlineVolumeService) BLRouter.INSTANCE.get(IInlineVolumeService.class, "pegasus_inline_volume_key");
        this.f75641q = ListExtentionsKt.lazyUnsafe(new K(12));
    }

    public final boolean allowAutoResume(@NotNull IInlineCard<?> iInlineCard) {
        boolean zAllowAutoResume;
        BiliCardPlayerScene.CardPlayTask.Token currentToken;
        if (PegasusStyleKt.currentIsSingleColumn(PegasusStyle.INSTANCE)) {
            SingleColumnInlineProperty cardPlayProperty = iInlineCard.getCardData().getCardPlayProperty();
            Boolean boolValueOf = null;
            SingleColumnInlineProperty singleColumnInlineProperty = cardPlayProperty instanceof SingleColumnInlineProperty ? cardPlayProperty : null;
            if (singleColumnInlineProperty != null) {
                boolValueOf = Boolean.valueOf(singleColumnInlineProperty.isManualPause());
            }
            zAllowAutoResume = (Intrinsics.areEqual(boolValueOf, Boolean.TRUE) && (currentToken = getCurrentToken()) != null && currentToken.getPlayerState() == 5) ? false : true;
        } else {
            zAllowAutoResume = super.allowAutoResume(iInlineCard);
        }
        return zAllowAutoResume;
    }

    @Nullable
    public final IInlineVolumeService getMuteService() {
        return this.f75639o;
    }

    @NotNull
    public final String getTag() {
        return "PegasusInlineDelegate";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends InlinePanel> void startPlayInner(@NotNull IInlineCard<T> iInlineCard, boolean z6) {
        if (z6) {
            ListExtentionsKt.closeVideoFloatWindowShow();
        }
        this.f75640p = iInlineCard;
        super.startPlayInner(iInlineCard, z6);
    }
}

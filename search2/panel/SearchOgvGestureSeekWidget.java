package com.bilibili.search2.panel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.common.inline.widgetV3.InlineGestureSeekWidgetV3;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.inline.panel.PanelWidgetKt;
import com.bilibili.search2.api.SearchOgvClipInfo;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/panel/SearchOgvGestureSeekWidget.class */
@StabilityInferred(parameters = 0)
public class SearchOgvGestureSeekWidget extends InlineGestureSeekWidgetV3 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public SearchOgvClipInfo f86952D;

    @JvmOverloads
    public SearchOgvGestureSeekWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchOgvGestureSeekWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchOgvGestureSeekWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void refresh() {
        ICardPlayerContext playerContext = PanelWidgetKt.getPlayerContext(this);
        if (playerContext != null) {
            if (!getMSeekBarDragging()) {
                long duration = playerContext.getDuration();
                long currentPosition = playerContext.getCurrentPosition();
                updateCardProgress((int) currentPosition, (int) duration, false);
                if (!getMHorizontalDraggingSeek()) {
                    SearchOgvClipInfo searchOgvClipInfo = this.f86952D;
                    Long lValueOf = null;
                    Long lValueOf2 = searchOgvClipInfo != null ? Long.valueOf(searchOgvClipInfo.getEndTimeMills()) : null;
                    SearchOgvClipInfo searchOgvClipInfo2 = this.f86952D;
                    if (searchOgvClipInfo2 != null) {
                        lValueOf = Long.valueOf(searchOgvClipInfo2.getStartTimeMills());
                    }
                    StringBuilder sb = new StringBuilder("progress ");
                    sb.append(currentPosition);
                    sb.append(" ");
                    sb.append(lValueOf2);
                    r.b(currentPosition, " ", "SearchOgvGestureSeekWidget", sb);
                    if (lValueOf2 != null && lValueOf != null && lValueOf2.longValue() < duration && Math.abs(lValueOf2.longValue() - currentPosition) < 999) {
                        BLog.i("SearchOgvGestureSeekWidget", "progress jumped " + currentPosition + " " + lValueOf2);
                        playerContext.seekTo(lValueOf.longValue());
                    }
                }
            }
            if (!getMSeekBarPressing() || getMSeekBarDragging()) {
                return;
            }
            updatePanelProgress(false, (int) playerContext.getCurrentPosition());
        }
    }
}

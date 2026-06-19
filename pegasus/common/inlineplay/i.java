package com.bilibili.pegasus.common.inlineplay;

import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.biz.card.IListInlineAutoPlayerParams;
import com.bilibili.inline.card.CardPlayState;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.InlineParent;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.fetcher.DescendingInlineFetcher;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.inline.panel.InlinePanel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/i.class */
@StabilityInferred(parameters = 0)
public final class i extends DescendingInlineFetcher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f75651e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/i$a.class */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((IInlineCard) t8).getCardData().getCardPlayProperty().getPriority().getPriorityInt()), Integer.valueOf(((IInlineCard) t7).getCardData().getCardPlayProperty().getPriority().getPriorityInt()));
        }
    }

    public i(InlinePage inlinePage, IListInlineAutoPlayerParams iListInlineAutoPlayerParams, c cVar) {
        super(inlinePage, new h(iListInlineAutoPlayerParams, 100));
        this.f75651e = cVar;
    }

    public final void a(IInlineCard<?> iInlineCard) {
        IInlineControl inlineControl;
        CardPlayState state = iInlineCard.getCardData().getCardPlayProperty().getState();
        if (!isCardPlayViewVisibility(iInlineCard) && ((state == CardPlayState.PLAYING || state == CardPlayState.PAUSE) && (inlineControl = getPage().getInlineControl()) != null)) {
            inlineControl.stopPlay(iInlineCard);
        }
        if ((isSwitchEnable(iInlineCard) || isInlineActive(iInlineCard) || iInlineCard.getCardData().getCardPlayProperty().getPlayReason() == PlayReason.INLINE_SCROLL_TO_PLAY) && isCardPlayViewVisibility(iInlineCard)) {
            getInlineCards().add(iInlineCard);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    @MainThread
    @NotNull
    public final LinkedList<IInlineCard<InlinePanel>> fetchPlayableCard(@Nullable RecyclerView recyclerView) {
        getInlineCards().clear();
        if (isVideoFloat()) {
            return getInlineCards();
        }
        findInlineCards(recyclerView);
        LinkedList inlineCards = getInlineCards();
        if (inlineCards.size() > 1) {
            CollectionsKt.sortWith(inlineCards, (Comparator) new Object());
        }
        return getInlineCards();
    }

    public final void findInlineCards(@Nullable RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            InlineParent inlineParentFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
            if (inlineParentFindViewHolderForLayoutPosition instanceof InlineParent) {
                InlineParent inlineParent = inlineParentFindViewHolderForLayoutPosition;
                if (inlineParent.hasInlinePlayItem()) {
                    inlineParent.addScrollListenerIfNotExist(this.f75651e);
                    Iterator it = inlineParent.getInlineCards().iterator();
                    while (it.hasNext()) {
                        a((IInlineCard) it.next());
                    }
                }
            }
            if (inlineParentFindViewHolderForLayoutPosition instanceof IInlineCard) {
                a((IInlineCard) inlineParentFindViewHolderForLayoutPosition);
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public final boolean isCardPlayViewVisibility(@NotNull IInlineCard<?> iInlineCard) {
        return getViewChecker().isViewVisible(iInlineCard.getInlineContainer());
    }
}

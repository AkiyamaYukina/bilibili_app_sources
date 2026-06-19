package com.bilibili.pegasus.common.inlineplay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.InlineParent;
import com.bilibili.inline.fetcher.DescendingInlineFetcher;
import com.bilibili.inline.page.InlinePage;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inlineplay/b.class */
@StabilityInferred(parameters = 0)
public final class b extends DescendingInlineFetcher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.inline.fetcher.a f75642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c f75643f;

    public b(@NotNull InlinePage inlinePage, @NotNull com.bilibili.inline.fetcher.a aVar, @NotNull c cVar) {
        super(inlinePage, aVar);
        this.f75642e = aVar;
        this.f75643f = cVar;
    }

    public final void a(IInlineCard<?> iInlineCard) {
        if (isInlineActive(iInlineCard) && getChecker().isViewVisible(iInlineCard.getInlineContainer())) {
            getInlineCards().add(iInlineCard);
        } else if (isSwitchEnable(iInlineCard) && isCardPlayViewVisibility(iInlineCard)) {
            getInlineCards().add(iInlineCard);
        }
    }

    public final void afterInlineCardsSorted() {
        int priorityInt;
        super.afterInlineCardsSorted();
        if (getInlineCards().isEmpty() || getInlineCards().size() == 1) {
            return;
        }
        Iterator it = getInlineCards().iterator();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (!it.hasNext()) {
                return;
            }
            Object next = it.next();
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            d dVar = (IInlineCard) next;
            if (i7 == 0) {
                priorityInt = getPriorityInt(dVar);
            } else {
                priorityInt = i9;
                if (dVar instanceof d) {
                    if (getPriorityInt(dVar) < i9) {
                        dVar.X();
                        priorityInt = i9;
                    } else {
                        dVar.i();
                        priorityInt = i9;
                    }
                }
            }
            i7++;
            i8 = priorityInt;
        }
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
                    inlineParent.addScrollListenerIfNotExist(this.f75643f);
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

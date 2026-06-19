package com.bilibili.pegasus.page;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.inline.card.CardPlayState;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.card.InlineParent;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.fetcher.DescendingInlineFetcher;
import com.bilibili.inline.fetcher.IInlineFetcher;
import com.bilibili.inline.panel.InlinePanel;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/u.class */
@StabilityInferred(parameters = 0)
public final class C5731u extends DescendingInlineFetcher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.common.inlineplay.c f78440e;

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.u$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/u$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements IInlineFetcher.IViewChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final RecyclerView f78441a;

        public a(@NotNull RecyclerView recyclerView) {
            this.f78441a = recyclerView;
        }

        public final boolean isViewVisible(@Nullable View view) {
            RecyclerView recyclerView;
            if (view == null || !view.isShown()) {
                return false;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            boolean z6 = false;
            if (width != 0) {
                if (height == 0) {
                    z6 = false;
                } else {
                    View view2 = view;
                    int left = 0;
                    while (true) {
                        recyclerView = this.f78441a;
                        if (view2 == null || view2 == recyclerView) {
                            break;
                        }
                        left += view2.getLeft();
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                    Integer numValueOf = view2 == recyclerView ? Integer.valueOf(left) : null;
                    z6 = false;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        int top = 0;
                        while (view != null && view != recyclerView) {
                            top += view.getTop();
                            Object parent2 = view.getParent();
                            view = parent2 instanceof View ? (View) parent2 : null;
                        }
                        Integer numValueOf2 = null;
                        if (view == recyclerView) {
                            numValueOf2 = Integer.valueOf(top);
                        }
                        z6 = false;
                        if (numValueOf2 != null) {
                            int iIntValue2 = numValueOf2.intValue();
                            int paddingLeft = recyclerView.getPaddingLeft();
                            int paddingTop = recyclerView.getPaddingTop();
                            int width2 = recyclerView.getWidth();
                            int paddingRight = recyclerView.getPaddingRight();
                            int height2 = recyclerView.getHeight();
                            int paddingBottom = recyclerView.getPaddingBottom();
                            z6 = false;
                            if (iIntValue >= paddingLeft) {
                                z6 = false;
                                if (width + iIntValue <= width2 - paddingRight) {
                                    z6 = false;
                                    if (iIntValue2 >= paddingTop) {
                                        z6 = false;
                                        if (height + iIntValue2 <= height2 - paddingBottom) {
                                            z6 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return z6;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.u$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/u$b.class */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((IInlineCard) t8).getCardData().getCardPlayProperty().getPriority().getPriorityInt()), Integer.valueOf(((IInlineCard) t7).getCardData().getCardPlayProperty().getPriority().getPriorityInt()));
        }
    }

    public C5731u(TimeMachinePegasusFragment timeMachinePegasusFragment, RecyclerView recyclerView, com.bilibili.pegasus.common.inlineplay.c cVar) {
        super(timeMachinePegasusFragment, new a(recyclerView));
        this.f78440e = cVar;
    }

    public final void a(IInlineCard<?> iInlineCard) {
        IInlineControl inlineControl;
        CardPlayState state = iInlineCard.getCardData().getCardPlayProperty().getState();
        boolean zIsCardPlayViewVisibility = isCardPlayViewVisibility(iInlineCard);
        if (!zIsCardPlayViewVisibility && ((state == CardPlayState.PLAYING || state == CardPlayState.PAUSE) && (inlineControl = getPage().getInlineControl()) != null)) {
            inlineControl.stopPlay(iInlineCard);
        }
        if ((isSwitchEnable(iInlineCard) || isInlineActive(iInlineCard) || iInlineCard.getCardData().getCardPlayProperty().getPlayReason() == PlayReason.INLINE_SCROLL_TO_PLAY) && zIsCardPlayViewVisibility) {
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
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            InlineParent inlineParentFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
            if (inlineParentFindViewHolderForLayoutPosition instanceof InlineParent) {
                InlineParent inlineParent = inlineParentFindViewHolderForLayoutPosition;
                if (inlineParent.hasInlinePlayItem()) {
                    inlineParent.addScrollListenerIfNotExist(this.f78440e);
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

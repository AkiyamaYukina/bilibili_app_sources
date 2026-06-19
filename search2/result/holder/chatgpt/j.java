package com.bilibili.search2.result.holder.chatgpt;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.dynamic.v2.ModuleParagraph;
import com.bapis.bilibili.app.dynamic.v2.Paragraph;
import com.bapis.bilibili.app.dynamic.v2.TextParagraph;
import com.bapis.bilibili.broadcast.message.main.CardItem;
import com.bilibili.app.comm.list.widget.opus.A;
import com.bilibili.app.comm.list.widget.opus.D;
import com.bilibili.app.comm.list.widget.opus.F;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.C6053g;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import com.bilibili.search2.result.holder.chatgpt.api.SearchSmallVideoItem;
import com.mall.ui.page.ip.view.IpHeaderInfoModuleV2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/j.class */
@StabilityInferred(parameters = 0)
public final class j extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<SearchChatResultItem.Bubble> f88014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final BS0.e f88015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Fragment f88016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SearchChatGptHolder f88017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f88018e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88020g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f88021i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Integer> f88019f = new LinkedHashMap();

    @NotNull
    public final JW0.g h = new JW0.g(this, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final i f88022j = new i(this);

    /* JADX WARN: Type inference failed for: r1v6, types: [com.bilibili.search2.result.holder.chatgpt.h] */
    public j(@NotNull List list, @Nullable BS0.e eVar, @NotNull Fragment fragment, @NotNull SearchChatGptHolder searchChatGptHolder) {
        this.f88014a = list;
        this.f88015b = eVar;
        this.f88016c = fragment;
        this.f88017d = searchChatGptHolder;
        final int i7 = 0;
        this.f88021i = new Function2(this, i7) { // from class: com.bilibili.search2.result.holder.chatgpt.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f88011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f88012b;

            {
                this.f88011a = i7;
                this.f88012b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Object obj3 = this.f88012b;
                int i8 = 0;
                switch (this.f88011a) {
                    case 0:
                        Integer num = (Integer) obj;
                        int iIntValue = num.intValue();
                        Integer num2 = (Integer) obj2;
                        num2.intValue();
                        SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
                        j jVar = (j) obj3;
                        jVar.f88019f.put(num, num2);
                        if (iIntValue >= 0) {
                            while (true) {
                                if (iIntValue > 0) {
                                    SearchChatGptHolder.a aVar2 = SearchChatGptHolder.f87922q;
                                }
                                if (i8 != iIntValue) {
                                    i8++;
                                }
                            }
                        }
                        break;
                    default:
                        Composer composer = (Composer) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue2 & 3) != 2, 1 & iIntValue2)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1114146180, iIntValue2, -1, "com.mall.ui.page.ip.view.IpHeaderInfoModuleV2.<anonymous> (IpHeaderInfoModuleV2.kt:78)");
                            }
                            ((IpHeaderInfoModuleV2) obj3).a(composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f88014a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        BaseSearchItem item = this.f88014a.get(i7).getItem();
        return item != null ? ((K90.c) item).viewType : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v82, types: [androidx.lifecycle.Observer, com.bilibili.search2.result.holder.chatgpt.c] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, final int i7) {
        A aC;
        List<ModuleParagraph> paragraphs;
        TextParagraph text;
        boolean z6 = viewHolder instanceof ChatBubbleViewHolder;
        final i iVar = this.f88022j;
        h hVar = this.f88021i;
        Function1<? super Integer, Triple<Boolean, Long, Integer>> function1 = this.h;
        if (!z6) {
            if (viewHolder instanceof SmallVideoHolder) {
                SmallVideoHolder smallVideoHolder = (SmallVideoHolder) viewHolder;
                BaseSearchItem item = this.f88014a.get(i7).getItem();
                SearchSmallVideoItem searchSmallVideoItem = item instanceof SearchSmallVideoItem ? (SearchSmallVideoItem) item : null;
                SearchChatResultItem.Bubble bubble = this.f88014a.get(i7);
                smallVideoHolder.q0(searchSmallVideoItem, bubble instanceof SearchChatResultItem.Bubble ? bubble : null, function1, hVar, iVar);
                return;
            }
            if (viewHolder instanceof SmallArticleHolder) {
                SmallArticleHolder smallArticleHolder = (SmallArticleHolder) viewHolder;
                BaseSearchItem item2 = this.f88014a.get(i7).getItem();
                com.bilibili.search2.result.holder.chatgpt.api.d dVar = item2 instanceof com.bilibili.search2.result.holder.chatgpt.api.d ? (com.bilibili.search2.result.holder.chatgpt.api.d) item2 : null;
                SearchChatResultItem.Bubble bubble2 = this.f88014a.get(i7);
                smallArticleHolder.q0(dVar, bubble2 instanceof SearchChatResultItem.Bubble ? bubble2 : null, function1, hVar, iVar);
                return;
            }
            return;
        }
        final ChatBubbleViewHolder chatBubbleViewHolder = (ChatBubbleViewHolder) viewHolder;
        final SearchChatResultItem.Bubble bubble3 = this.f88014a.get(i7);
        bubble3.bind(chatBubbleViewHolder.f87906b, chatBubbleViewHolder.getBindingAdapterPosition(), function1, hVar, new Function2(iVar, chatBubbleViewHolder) { // from class: com.bilibili.search2.result.holder.chatgpt.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final i f87996a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ChatBubbleViewHolder f87997b;

            {
                this.f87996a = iVar;
                this.f87997b = chatBubbleViewHolder;
            }

            public final Object invoke(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                this.f87996a.invoke(num, num2);
                if (iIntValue == 0) {
                    ChatBubbleViewHolder chatBubbleViewHolder2 = this.f87997b;
                    if (chatBubbleViewHolder2.getBindingAdapterPosition() == 0) {
                        chatBubbleViewHolder2.s0(chatBubbleViewHolder2.f87905a);
                    }
                }
                return Unit.INSTANCE;
            }
        });
        Bl.n nVar = chatBubbleViewHolder.f87905a;
        if (i7 == 0) {
            chatBubbleViewHolder.s0(nVar);
        } else {
            ListExtentionsKt.gone(nVar.b);
            ListExtentionsKt.gone(nVar.c);
            ListExtentionsKt.gone(nVar.f);
        }
        c cVar = chatBubbleViewHolder.f87908d;
        MutableLiveData<A> mutableLiveData = chatBubbleViewHolder.f87909e;
        if (cVar != null && mutableLiveData != null) {
            mutableLiveData.removeObserver(cVar);
        }
        ?? r02 = new Observer(chatBubbleViewHolder, i7, bubble3) { // from class: com.bilibili.search2.result.holder.chatgpt.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatBubbleViewHolder f87998a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchChatResultItem.Bubble f87999b;

            {
                this.f87998a = chatBubbleViewHolder;
                this.f87999b = bubble3;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                A a7 = (A) obj;
                if (a7 != null) {
                    SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
                    ChatBubbleViewHolder chatBubbleViewHolder2 = this.f87998a;
                    chatBubbleViewHolder2.getBindingAdapterPosition();
                    a7.toString();
                    if (chatBubbleViewHolder2.getBindingAdapterPosition() >= 0) {
                        Bl.n nVar2 = chatBubbleViewHolder2.f87905a;
                        com.bilibili.app.comm.list.widget.opus.q.d(nVar2.g, a7, new com.bilibili.bplus.followingpublish.fragments.aphro.g(1, chatBubbleViewHolder2, this.f87999b));
                        ListExtentionsKt.visible(nVar2.a);
                    } else {
                        c cVar2 = chatBubbleViewHolder2.f87908d;
                        MutableLiveData<A> mutableLiveData2 = chatBubbleViewHolder2.f87909e;
                        if (cVar2 == null || mutableLiveData2 == null) {
                            return;
                        }
                        mutableLiveData2.removeObserver(cVar2);
                    }
                }
            }
        };
        chatBubbleViewHolder.f87908d = r02;
        bubble3.getProgressiveItemLiveData().observe(chatBubbleViewHolder.f87906b, r02);
        chatBubbleViewHolder.f87909e = bubble3.getProgressiveItemLiveData();
        if (bubble3.getNodeSize() == 0 && (paragraphs = bubble3.getParagraphs()) != null) {
            for (ModuleParagraph moduleParagraph : paragraphs) {
                int nodeSize = bubble3.getNodeSize();
                Paragraph paragraph = moduleParagraph.getParagraph();
                bubble3.setNodeSize(nodeSize + ((paragraph == null || (text = paragraph.getText()) == null) ? 0 : text.getNodesCount()));
            }
        }
        SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
        bubble3.getNodeSize();
        chatBubbleViewHolder.getBindingAdapterPosition();
        bubble3.toString();
        if (bubble3.getMaxHeight() == 0) {
            List<ModuleParagraph> paragraphs2 = bubble3.getParagraphs();
            if (paragraphs2 != null && (aC = D.c(paragraphs2)) != null) {
                final int i8 = 0;
                com.bilibili.app.comm.list.widget.opus.q.d(nVar.g, aC, new Function1(i8, chatBubbleViewHolder, bubble3) { // from class: com.bilibili.search2.result.holder.chatgpt.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f88000a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f88001b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f88002c;

                    {
                        this.f88000a = i8;
                        this.f88001b = chatBubbleViewHolder;
                        this.f88002c = bubble3;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f88000a) {
                            case 0:
                                return ((ChatBubbleViewHolder) this.f88001b).p0((F) obj, (SearchChatResultItem.Bubble) this.f88002c);
                            default:
                                Boolean bool = (Boolean) obj;
                                boolean zBooleanValue = bool.booleanValue();
                                ((MutableState) this.f88002c).setValue(bool);
                                if (zBooleanValue) {
                                    kntr.common.ouro.ui.textField.h.a((kntr.common.ouro.ui.textField.h) this.f88001b, false, false, 2);
                                }
                                return Unit.INSTANCE;
                        }
                    }
                });
            }
            OneShotPreDrawListener.add(nVar.a, new Runnable(bubble3, chatBubbleViewHolder) { // from class: com.bilibili.search2.result.holder.chatgpt.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchChatResultItem.Bubble f88003a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ChatBubbleViewHolder f88004b;

                {
                    this.f88003a = bubble3;
                    this.f88004b = chatBubbleViewHolder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SearchChatResultItem.Bubble bubble4 = this.f88003a;
                    ChatBubbleViewHolder chatBubbleViewHolder2 = this.f88004b;
                    bubble4.setMaxHeight(chatBubbleViewHolder2.f87905a.a.getHeight());
                    SearchChatGptHolder.a aVar2 = SearchChatGptHolder.f87922q;
                    chatBubbleViewHolder2.f87905a.a.getHeight();
                }
            });
        }
        chatBubbleViewHolder.f87910f = bubble3.getChatDislikeClicked();
        chatBubbleViewHolder.f87911g = bubble3.getChatLikeClicked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
        Object objA;
        SearchChatGptHolder searchChatGptHolder = this.f88017d;
        Fragment fragment = this.f88016c;
        if (i7 == -1) {
            objA = new ChatBubbleViewHolder(Bl.n.inflate(LayoutInflater.from(viewGroup.getContext())), fragment, searchChatGptHolder);
        } else if (i7 == CardItem.CardItemCase.ARTICLE.getNumber()) {
            SmallArticleHolder smallArticleHolderCreate = SmallArticleHolder.f87949p.create(viewGroup, searchChatGptHolder);
            smallArticleHolderCreate.bindFragment(fragment);
            objA = smallArticleHolderCreate;
        } else if (i7 == CardItem.CardItemCase.AV.getNumber()) {
            SmallVideoHolder smallVideoHolderCreate = SmallVideoHolder.f87962l.create(viewGroup, searchChatGptHolder);
            smallVideoHolderCreate.bindFragment(fragment);
            objA = smallVideoHolderCreate;
        } else {
            int i8 = C6053g.f87282b;
            objA = C6053g.a.a(viewGroup);
        }
        return objA;
    }
}

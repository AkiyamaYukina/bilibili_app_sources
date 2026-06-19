package com.bilibili.search2.result.holder.chatgpt.api;

import android.os.SystemClock;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.O;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.dynamic.v2.ModuleParagraph;
import com.bapis.bilibili.app.dynamic.v2.ParaSpacing;
import com.bapis.bilibili.app.dynamic.v2.Paragraph;
import com.bapis.bilibili.broadcast.message.main.CardItem;
import com.bapis.bilibili.broadcast.message.main.ChatResult;
import com.bapis.bilibili.broadcast.message.main.LikeState;
import com.bilibili.app.comm.list.widget.opus.A;
import com.bilibili.app.comm.list.widget.opus.D;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatResultItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchChatResultItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "bubbles")
    @Nullable
    private List<Bubble> bubbles;

    @JSONField(name = "business")
    @Nullable
    private String business;

    @JSONField(name = "code")
    @Nullable
    private Integer code;

    @JSONField(name = "like_number")
    @Nullable
    private Long likeNumber;

    @JSONField(name = "like_state")
    @Nullable
    private LikeState likeState;

    @JSONField(name = "message_id")
    @Nullable
    private Long messageId;

    @Nullable
    private Long receivedUptime;

    @JSONField(name = "rewrite_word")
    @Nullable
    private String rewriteWord;

    @JSONField(name = "session_id")
    @Nullable
    private String sessionId;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatResultItem$Bubble.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Bubble {
        public static final int $stable = 8;
        private boolean binded;
        private boolean chatDislikeClicked;
        private boolean chatLikeClicked;

        @Nullable
        private BaseSearchItem item;
        private int maxHeight;
        private int nodeSize;

        @Nullable
        private Observer<Boolean> observe;

        @JSONField(name = "paragraphs")
        @Nullable
        private List<ModuleParagraph> paragraphs;

        @NotNull
        private MutableLiveData<Boolean> animStartShow = new MutableLiveData<>(Boolean.FALSE);

        @NotNull
        private MutableLiveData<A> progressiveItemLiveData = new MutableLiveData<>();
        private int bindingAdapterPosition = -1;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatResultItem$Bubble$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f87979a;

            static {
                int[] iArr = new int[CardItem.CardItemCase.values().length];
                try {
                    iArr[CardItem.CardItemCase.ARTICLE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[CardItem.CardItemCase.AV.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f87979a = iArr;
            }
        }

        public Bubble(@NotNull com.bapis.bilibili.broadcast.message.main.Bubble bubble) {
            int i7 = -1;
            BaseSearchItem baseSearchItem = null;
            if (bubble.getItemCount() > 0) {
                CardItem item = bubble.getItem(0);
                CardItem.CardItemCase cardItemCase = item.getCardItemCase();
                i7 = cardItemCase != null ? a.f87979a[cardItemCase.ordinal()] : i7;
                BaseSearchItem searchSmallVideoItem = i7 != 1 ? i7 != 2 ? null : new SearchSmallVideoItem(item.getAv()) : new d(item.getArticle());
                if (searchSmallVideoItem != null) {
                    searchSmallVideoItem.setUri(item.getUri());
                    searchSmallVideoItem.setParam(item.getParam());
                    searchSmallVideoItem.setGoTo(item.getGoto());
                    ((K90.c) searchSmallVideoItem).viewType = item.getCardItemCase().getNumber();
                    baseSearchItem = searchSmallVideoItem;
                }
                this.item = baseSearchItem;
                return;
            }
            List paragraphsList = bubble.getParagraphsList();
            ArrayList arrayList = null;
            if (paragraphsList != null) {
                List list = paragraphsList;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    Paragraph paragraph = (Paragraph) it.next();
                    double textSize = parseTextSize(paragraph) * 0.5d;
                    arrayList2.add(ModuleParagraph.newBuilder().setParagraph(paragraph).setParaSpacing(ParaSpacing.newBuilder().setLineSpacing(1.5d).setSpacingBeforePara(textSize).setSpacingAfterPara(textSize).build()).build());
                }
            }
            this.paragraphs = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(Bubble bubble, Fragment fragment, Function1 function1, Function2 function2, Function2 function22, boolean z6) {
            if (z6) {
                bubble.showTypeWriterAnim(fragment, function1, function2, function22);
                Observer<Boolean> observer = bubble.observe;
                if (observer != null) {
                    bubble.animStartShow.removeObserver(observer);
                }
            }
        }

        private final int calculateCurrentIndex(long j7) {
            return (int) (((SystemClock.uptimeMillis() - j7) / 1000.0d) * SearchChatGptHolder.f87922q.b());
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final double parseTextSize(com.bapis.bilibili.app.dynamic.v2.Paragraph r5) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem.Bubble.parseTextSize(com.bapis.bilibili.app.dynamic.v2.Paragraph):double");
        }

        private final void showTypeWriterAnim(Fragment fragment, Function1<? super Integer, Triple<Boolean, Long, Integer>> function1, Function2<? super Integer, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22) {
            A aC;
            SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
            List<ModuleParagraph> list = this.paragraphs;
            if (list == null || (aC = D.c(list)) == null || LifecycleOwnerKt.getLifecycleScope(fragment.getViewLifecycleOwner()).launchWhenCreated(new SearchChatResultItem$Bubble$showTypeWriterAnim$1$1(this, aC, function2, function22, function1, null)) == null) {
                if (this.item != null) {
                    LifecycleOwnerKt.getLifecycleScope(fragment.getViewLifecycleOwner()).launchWhenCreated(new SearchChatResultItem$Bubble$showTypeWriterAnim$2$1(this, function2, function22, function1, null));
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0335  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0338  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0382  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0338 -> B:15:0x00aa). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object typeWriterAnim(com.bilibili.app.comm.list.widget.opus.A r8, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Triple<java.lang.Boolean, java.lang.Long, java.lang.Integer>> r9, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r10, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            /*
                Method dump skipped, instruction units count: 915
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem.Bubble.typeWriterAnim(com.bilibili.app.comm.list.widget.opus.A, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object typeWriterAnim(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Triple<java.lang.Boolean, java.lang.Long, java.lang.Integer>> r6, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r7, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                Method dump skipped, instruction units count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem.Bubble.typeWriterAnim(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final void bind(@NotNull final Fragment fragment, int i7, @NotNull final Function1<? super Integer, Triple<Boolean, Long, Integer>> function1, @NotNull final Function2<? super Integer, ? super Integer, Unit> function2, @NotNull final Function2<? super Integer, ? super Integer, Unit> function22) {
            if (this.binded) {
                return;
            }
            this.binded = true;
            this.bindingAdapterPosition = i7;
            Observer<Boolean> observer = new Observer(this, fragment, function1, function2, function22) { // from class: com.bilibili.search2.result.holder.chatgpt.api.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchChatResultItem.Bubble f87980a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Fragment f87981b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f87982c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function2 f87983d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Function2 f87984e;

                {
                    this.f87980a = this;
                    this.f87981b = fragment;
                    this.f87982c = function1;
                    this.f87983d = function2;
                    this.f87984e = function22;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SearchChatResultItem.Bubble.bind$lambda$0(this.f87980a, this.f87981b, this.f87982c, this.f87983d, this.f87984e, zBooleanValue);
                }
            };
            this.observe = observer;
            this.animStartShow.observe(fragment, observer);
            SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
        }

        @NotNull
        public final MutableLiveData<Boolean> getAnimStartShow() {
            return this.animStartShow;
        }

        public final int getBindingAdapterPosition() {
            return this.bindingAdapterPosition;
        }

        public final boolean getChatDislikeClicked() {
            return this.chatDislikeClicked;
        }

        public final boolean getChatLikeClicked() {
            return this.chatLikeClicked;
        }

        @Nullable
        public final BaseSearchItem getItem() {
            return this.item;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getNodeSize() {
            return this.nodeSize;
        }

        @Nullable
        public final Observer<Boolean> getObserve() {
            return this.observe;
        }

        @Nullable
        public final List<ModuleParagraph> getParagraphs() {
            return this.paragraphs;
        }

        @NotNull
        public final MutableLiveData<A> getProgressiveItemLiveData() {
            return this.progressiveItemLiveData;
        }

        public final void setAnimStartShow(@NotNull MutableLiveData<Boolean> mutableLiveData) {
            this.animStartShow = mutableLiveData;
        }

        public final void setBindingAdapterPosition(int i7) {
            this.bindingAdapterPosition = i7;
        }

        public final void setChatDislikeClicked(boolean z6) {
            this.chatDislikeClicked = z6;
        }

        public final void setChatLikeClicked(boolean z6) {
            this.chatLikeClicked = z6;
        }

        public final void setItem(@Nullable BaseSearchItem baseSearchItem) {
            this.item = baseSearchItem;
        }

        public final void setMaxHeight(int i7) {
            this.maxHeight = i7;
        }

        public final void setNodeSize(int i7) {
            this.nodeSize = i7;
        }

        public final void setObserve(@Nullable Observer<Boolean> observer) {
            this.observe = observer;
        }

        public final void setParagraphs(@Nullable List<ModuleParagraph> list) {
            this.paragraphs = list;
        }

        public final void setProgressiveItemLiveData(@NotNull MutableLiveData<A> mutableLiveData) {
            this.progressiveItemLiveData = mutableLiveData;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 429
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem.Bubble.toString():java.lang.String");
        }
    }

    public SearchChatResultItem() {
        this(null, null, null, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public SearchChatResultItem(@NotNull ChatResult chatResult) {
        int code = chatResult.getCode();
        String sessionId = chatResult.getSessionId();
        List bubblesList = chatResult.getBubblesList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bubblesList, 10));
        Iterator it = bubblesList.iterator();
        while (it.hasNext()) {
            arrayList.add(new Bubble((com.bapis.bilibili.broadcast.message.main.Bubble) it.next()));
        }
        this(Integer.valueOf(code), sessionId, arrayList, chatResult.getRewriteWord(), chatResult.getBusiness(), Long.valueOf(chatResult.getMessageId()), chatResult.getLikeState(), null, null, 384, null);
        setTitle(chatResult.getTitle());
        this.likeNumber = Long.valueOf(this.likeState == LikeState.LIKE ? chatResult.getLikeNumber() - 1 : chatResult.getLikeNumber());
    }

    public SearchChatResultItem(@Nullable Integer num, @Nullable String str, @Nullable List<Bubble> list, @Nullable String str2, @Nullable String str3, @Nullable Long l7, @Nullable LikeState likeState, @Nullable Long l8, @Nullable Long l9) {
        this.code = num;
        this.sessionId = str;
        this.bubbles = list;
        this.rewriteWord = str2;
        this.business = str3;
        this.messageId = l7;
        this.likeState = likeState;
        this.likeNumber = l8;
        this.receivedUptime = l9;
    }

    public /* synthetic */ SearchChatResultItem(Integer num, String str, List list, String str2, String str3, Long l7, LikeState likeState, Long l8, Long l9, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : list, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? null : str3, (i7 & 32) != 0 ? null : l7, (i7 & 64) != 0 ? null : likeState, (i7 & 128) != 0 ? null : l8, (i7 & 256) != 0 ? null : l9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchChatResultItem copy$default(SearchChatResultItem searchChatResultItem, Integer num, String str, List list, String str2, String str3, Long l7, LikeState likeState, Long l8, Long l9, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = searchChatResultItem.code;
        }
        if ((i7 & 2) != 0) {
            str = searchChatResultItem.sessionId;
        }
        if ((i7 & 4) != 0) {
            list = searchChatResultItem.bubbles;
        }
        if ((i7 & 8) != 0) {
            str2 = searchChatResultItem.rewriteWord;
        }
        if ((i7 & 16) != 0) {
            str3 = searchChatResultItem.business;
        }
        if ((i7 & 32) != 0) {
            l7 = searchChatResultItem.messageId;
        }
        if ((i7 & 64) != 0) {
            likeState = searchChatResultItem.likeState;
        }
        if ((i7 & 128) != 0) {
            l8 = searchChatResultItem.likeNumber;
        }
        if ((i7 & 256) != 0) {
            l9 = searchChatResultItem.receivedUptime;
        }
        return searchChatResultItem.copy(num, str, list, str2, str3, l7, likeState, l8, l9);
    }

    @Nullable
    public final Integer component1() {
        return this.code;
    }

    @Nullable
    public final String component2() {
        return this.sessionId;
    }

    @Nullable
    public final List<Bubble> component3() {
        return this.bubbles;
    }

    @Nullable
    public final String component4() {
        return this.rewriteWord;
    }

    @Nullable
    public final String component5() {
        return this.business;
    }

    @Nullable
    public final Long component6() {
        return this.messageId;
    }

    @Nullable
    public final LikeState component7() {
        return this.likeState;
    }

    @Nullable
    public final Long component8() {
        return this.likeNumber;
    }

    @Nullable
    public final Long component9() {
        return this.receivedUptime;
    }

    @NotNull
    public final SearchChatResultItem copy(@Nullable Integer num, @Nullable String str, @Nullable List<Bubble> list, @Nullable String str2, @Nullable String str3, @Nullable Long l7, @Nullable LikeState likeState, @Nullable Long l8, @Nullable Long l9) {
        return new SearchChatResultItem(num, str, list, str2, str3, l7, likeState, l8, l9);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChatResultItem)) {
            return false;
        }
        SearchChatResultItem searchChatResultItem = (SearchChatResultItem) obj;
        return Intrinsics.areEqual(this.code, searchChatResultItem.code) && Intrinsics.areEqual(this.sessionId, searchChatResultItem.sessionId) && Intrinsics.areEqual(this.bubbles, searchChatResultItem.bubbles) && Intrinsics.areEqual(this.rewriteWord, searchChatResultItem.rewriteWord) && Intrinsics.areEqual(this.business, searchChatResultItem.business) && Intrinsics.areEqual(this.messageId, searchChatResultItem.messageId) && this.likeState == searchChatResultItem.likeState && Intrinsics.areEqual(this.likeNumber, searchChatResultItem.likeNumber) && Intrinsics.areEqual(this.receivedUptime, searchChatResultItem.receivedUptime);
    }

    @Nullable
    public final List<Bubble> getBubbles() {
        return this.bubbles;
    }

    @Nullable
    public final String getBusiness() {
        return this.business;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Long getLikeNumber() {
        return this.likeNumber;
    }

    @Nullable
    public final LikeState getLikeState() {
        return this.likeState;
    }

    @Nullable
    public final Long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final Long getReceivedUptime() {
        return this.receivedUptime;
    }

    @Nullable
    public final String getRewriteWord() {
        return this.rewriteWord;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.sessionId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<Bubble> list = this.bubbles;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str2 = this.rewriteWord;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.business;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Long l7 = this.messageId;
        int iHashCode7 = l7 == null ? 0 : l7.hashCode();
        LikeState likeState = this.likeState;
        int iHashCode8 = likeState == null ? 0 : likeState.hashCode();
        Long l8 = this.likeNumber;
        int iHashCode9 = l8 == null ? 0 : l8.hashCode();
        Long l9 = this.receivedUptime;
        if (l9 != null) {
            iHashCode = l9.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
    }

    public final void setBubbles(@Nullable List<Bubble> list) {
        this.bubbles = list;
    }

    public final void setBusiness(@Nullable String str) {
        this.business = str;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setLikeNumber(@Nullable Long l7) {
        this.likeNumber = l7;
    }

    public final void setLikeState(@Nullable LikeState likeState) {
        this.likeState = likeState;
    }

    public final void setMessageId(@Nullable Long l7) {
        this.messageId = l7;
    }

    public final void setReceivedUptime(@Nullable Long l7) {
        this.receivedUptime = l7;
    }

    public final void setRewriteWord(@Nullable String str) {
        this.rewriteWord = str;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.code;
        String str = this.sessionId;
        List<Bubble> list = this.bubbles;
        String str2 = this.rewriteWord;
        String str3 = this.business;
        Long l7 = this.messageId;
        LikeState likeState = this.likeState;
        Long l8 = this.likeNumber;
        Long l9 = this.receivedUptime;
        StringBuilder sbB = z.b("SearchChatResultItem(code=", num, ", sessionId=", str, ", bubbles=");
        O.b(", rewriteWord=", str2, ", business=", sbB, list);
        sbB.append(str3);
        sbB.append(", messageId=");
        sbB.append(l7);
        sbB.append(", likeState=");
        sbB.append(likeState);
        sbB.append(", likeNumber=");
        sbB.append(l8);
        sbB.append(", receivedUptime=");
        return com.bilibili.adcommon.utils.c.a(sbB, l9, ")");
    }
}

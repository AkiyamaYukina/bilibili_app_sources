package com.bilibili.search2.result.holder.aichat;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.dynamic.v2.AdditionalType;
import com.bapis.bilibili.app.dynamic.v2.ContentOpusCard;
import com.bapis.bilibili.app.dynamic.v2.ContentVideoCard;
import com.bapis.bilibili.app.dynamic.v2.IconBadge;
import com.bapis.bilibili.app.dynamic.v2.MdlDynDrawItem;
import com.bapis.bilibili.app.dynamic.v2.ModuleAdditional;
import com.bapis.bilibili.app.dynamic.v2.ModuleParagraph;
import com.bapis.bilibili.broadcast.message.main.BubbleV2;
import com.bapis.bilibili.broadcast.message.main.ChatResultV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.app.search.aicard.container.LikeState;
import kntr.app.search.aicard.reference.ReferenceCardType;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f87797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f87798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f87799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SearchAIChatItem f87800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kntr.app.search.aicard.e f87801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c f87802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f87803g;

    @NotNull
    public final CoroutineScope h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f87804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f87805j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/l$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f87806a;

        static {
            int[] iArr = new int[AdditionalType.values().length];
            try {
                iArr[AdditionalType.additional_type_content_video.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[AdditionalType.additional_type_content_opus.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f87806a = iArr;
        }
    }

    public l(String str, String str2, String str3, SearchAIChatItem searchAIChatItem, kntr.app.search.aicard.e eVar, long j7) {
        c cVar = ((b) b.f87770c.getValue()).f87772b;
        this.f87797a = str;
        this.f87798b = str2;
        this.f87799c = str3;
        this.f87800d = searchAIChatItem;
        this.f87801e = eVar;
        this.f87802f = cVar;
        this.f87803g = j7;
        this.h = o.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }

    public static Pair a(ChatResultV2 chatResultV2) {
        Object next;
        kntr.app.search.aicard.reference.i iVar;
        List bubblesList = chatResultV2.getBubblesList();
        ArrayList arrayList = new ArrayList();
        Iterator it = bubblesList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((BubbleV2) it.next()).getParagraphsList());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ModuleParagraph) it2.next()).toByteArray());
        }
        List<ModuleAdditional> itemsList = chatResultV2.getReference().getItemsList();
        ArrayList arrayList3 = new ArrayList();
        for (ModuleAdditional moduleAdditional : itemsList) {
            AdditionalType type = moduleAdditional.getType();
            int i7 = type == null ? -1 : a.f87806a[type.ordinal()];
            if (i7 == 1) {
                ContentVideoCard video = moduleAdditional.getVideo();
                Iterator it3 = video.getStatInfosList().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (((ContentVideoCard.StatInfo) next).getType() == ContentVideoCard.StatInfoType.VIDEO_VIEW_INFO) {
                        break;
                    }
                }
                ContentVideoCard.StatInfo statInfo = (ContentVideoCard.StatInfo) next;
                String text = statInfo != null ? statInfo.getText() : null;
                if (text == null) {
                    text = "";
                }
                iVar = new kntr.app.search.aicard.reference.i(video.getCover(), video.getTitle(), video.getAuthorName(), text, (String) null, video.getPublishText(), video.getSummary(), video.getVideoTs().getDurationText(), (String) null, ReferenceCardType.VIDEO, video.getJumpUrl(), String.valueOf(video.getAvid()), 272);
            } else if (i7 != 2) {
                iVar = null;
            } else {
                ContentOpusCard opus = moduleAdditional.getOpus();
                IconBadge iconBadge = opus.getCardBadge().getIconBadge();
                String title = opus.getTitle();
                String authorName = opus.getAuthorName();
                MdlDynDrawItem mdlDynDrawItem = (MdlDynDrawItem) CollectionsKt.firstOrNull(opus.getPicsList());
                String src = mdlDynDrawItem != null ? mdlDynDrawItem.getSrc() : null;
                if (src == null) {
                    src = "";
                }
                iVar = new kntr.app.search.aicard.reference.i(src, title, authorName, (String) null, opus.getLike(), opus.getPublishText(), opus.getSummary(), (String) null, iconBadge.getText(), ReferenceCardType.OPUS, opus.getJumpUrl(), String.valueOf(opus.getOpusId()), 136);
            }
            if (iVar != null) {
                arrayList3.add(iVar);
            }
        }
        return TuplesKt.to(arrayList2, arrayList3);
    }

    public final void b(ChatResultV2 chatResultV2) {
        String business = chatResultV2.getBusiness();
        SearchAIChatItem searchAIChatItem = this.f87800d;
        searchAIChatItem.setBusiness(business);
        searchAIChatItem.setMessageId(chatResultV2.getMessageId());
        LikeState likeState = searchAIChatItem.getLikeState();
        LikeState likeState2 = LikeState.DEFAULT;
        if (likeState == likeState2) {
            int i7 = m.f87807a[chatResultV2.getLikeState().ordinal()];
            searchAIChatItem.setLikeState(i7 != 1 ? i7 != 2 ? likeState2 : LikeState.DISLIKE : LikeState.LIKE);
        }
    }
}

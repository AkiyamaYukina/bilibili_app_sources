package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.foundation.text.selection.C3751q;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.DolbyItem;
import com.bapis.bilibili.playershared.Fragment;
import com.bapis.bilibili.playershared.QnItem;
import com.bapis.bilibili.playershared.Stream;
import com.bapis.bilibili.playershared.StreamInfo;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.app.gemini.base.resolver.GeminiCommonResolver;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/DownloadFloatLayerService$qualitiesAndAudios$data$1.class */
final class DownloadFloatLayerService$qualitiesAndAudios$data$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends StreamInfo>, ? extends List<? extends Du0.a>>>, Object> {
    final OgvEpisode $episode;
    int label;
    final DownloadFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFloatLayerService$qualitiesAndAudios$data$1(OgvEpisode ogvEpisode, DownloadFloatLayerService downloadFloatLayerService, Continuation<? super DownloadFloatLayerService$qualitiesAndAudios$data$1> continuation) {
        super(2, continuation);
        this.$episode = ogvEpisode;
        this.this$0 = downloadFloatLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DownloadFloatLayerService$qualitiesAndAudios$data$1(this.$episode, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends List<StreamInfo>, ? extends List<Du0.a>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PlayViewUniteReply playViewUniteReplyI = null;
        try {
            GeminiCommonResolver.a aVar = GeminiCommonResolver.Companion;
            GeminiCommonResolverParams geminiCommonResolverParams = new GeminiCommonResolverParams();
            OgvEpisode ogvEpisode = this.$episode;
            geminiCommonResolverParams.setAvid(ogvEpisode.a());
            geminiCommonResolverParams.setCid(ogvEpisode.f93561g);
            geminiCommonResolverParams.setDomainParams(2);
            geminiCommonResolverParams.setRequestFromDownloader(2);
            geminiCommonResolverParams.setContentCtrl(GeminiCommonResolverParams.ContentCtrl.SIMPLIFY);
            geminiCommonResolverParams.setSpmid("");
            geminiCommonResolverParams.setFromSpmid("");
            geminiCommonResolverParams.setSoftVal(0L);
            aVar.getClass();
            playViewUniteReplyI = GeminiCommonResolver.a.i(geminiCommonResolverParams, (Fragment) null, false);
        } catch (CancellationException e7) {
            throw e7;
        } catch (Exception e8) {
            com.bilibili.ogv.infra.util.e.b(new RuntimeException(C3751q.a(this.$episode.a(), "Request failed for av"), e8));
        }
        if (playViewUniteReplyI == null) {
            DownloadFloatLayerService downloadFloatLayerService = this.this$0;
            downloadFloatLayerService.getClass();
            return new Pair(CollectionsKt.listOf(new StreamInfo[]{StreamInfo.newBuilder().setQuality(80).setNewDescription(downloadFloatLayerService.f92432e.getString(2131851611)).setNeedVip(false).build(), StreamInfo.newBuilder().setQuality(64).setNewDescription(downloadFloatLayerService.f92432e.getString(2131851586)).setNeedVip(false).build(), StreamInfo.newBuilder().setQuality(32).setNewDescription(downloadFloatLayerService.f92432e.getString(2131851650)).setNeedVip(false).build(), StreamInfo.newBuilder().setQuality(16).setNewDescription(downloadFloatLayerService.f92432e.getString(2131851607)).setNeedVip(false).build()}), CollectionsKt.emptyList());
        }
        if (playViewUniteReplyI.getVodInfo().hasQnPanel()) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            for (QnItem qnItem : playViewUniteReplyI.getVodInfo().getQnPanel().getQnItemsList()) {
                listCreateListBuilder.addAll(qnItem.getQnGroup().getStreamInfosList());
                if (qnItem.hasStreamInfo()) {
                    listCreateListBuilder.add(qnItem.getStreamInfo().toBuilder().clearSuperscript().build());
                }
            }
            arrayList = CollectionsKt.build(listCreateListBuilder);
        } else {
            List streamListList = playViewUniteReplyI.getVodInfo().getStreamListList();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(streamListList, 10));
            Iterator it = streamListList.iterator();
            while (it.hasNext()) {
                arrayList.add(((Stream) it.next()).getStreamInfo().toBuilder().clearSuperscript().build());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        DolbyItem dolby = playViewUniteReplyI.getVodInfo().getDolby();
        if (dolby.getType() == DolbyItem.Type.ATMOS || dolby.getType() == DolbyItem.Type.COMMON) {
            arrayList2.add(new Du0.a(dolby.getType(), this.this$0.f92432e.getString(2131848915), true));
        }
        arrayList2.add(new Du0.a(DolbyItem.Type.NONE, this.this$0.f92432e.getString(2131848886), false));
        return new Pair((Object) arrayList, arrayList2);
    }
}

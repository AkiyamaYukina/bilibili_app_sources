package com.bilibili.pegasus.channelv3.movie.video;

import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.app.interfaces.v1.BigItem;
import com.bapis.bilibili.app.interfaces.v1.MediaMoss;
import com.bapis.bilibili.app.interfaces.v1.MediaMossKtxKt;
import com.bapis.bilibili.app.interfaces.v1.MediaVideoReply;
import com.bapis.bilibili.app.interfaces.v1.MediaVideoReq;
import com.bapis.bilibili.app.interfaces.v1.UserCard;
import com.bilibili.app.comm.list.common.api.ListPlayerPreloadUtilKt;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.app.comm.list.common.inline.view.InlineProgressBar;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.BasePlayerItem;
import com.bilibili.pegasus.channelv3.feed.item.ChannelDetailCardUserInfo;
import com.bilibili.pegasus.channelv3.feed.item.ChannelDetailLargeCoverItem;
import com.bilibili.pegasus.channelv3.movie.ChannelMovieSpmid;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/ChannelMovieVideoVM$load$1.class */
final class ChannelMovieVideoVM$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMovieVideoVM$load$1(f fVar, Continuation<? super ChannelMovieVideoVM$load$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelMovieVideoVM$load$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MediaVideoReply mediaVideoReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = this.this$0;
                a aVar = fVar.f75506i;
                long j7 = aVar.f75489a;
                long j8 = aVar.f75490b;
                long j9 = aVar.f75491c;
                String str = aVar.f75492d;
                if (aVar.f75493e) {
                    ((ArrayList) fVar.f75507j).clear();
                }
                this.this$0.f75508k.setValue(Resource.a.c(Resource.Companion));
                MediaMoss mediaMoss = new MediaMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                MediaVideoReq mediaVideoReqBuild = MediaVideoReq.newBuilder().setBizId(j7).setBizType(j8).setFeedId(j9).setOffset(str).setPs(10).setPlayerArgs(ListPlayerPreloadUtilKt.getPlayerArgsParams()).build();
                this.label = 1;
                Object objSuspendMediaVideo = MediaMossKtxKt.suspendMediaVideo(mediaMoss, mediaVideoReqBuild, this);
                obj = objSuspendMediaVideo;
                if (objSuspendMediaVideo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mediaVideoReply = (MediaVideoReply) obj;
        } catch (Exception e7) {
            BLog.i(this.this$0.f75499a, "response is error:" + e7);
            MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> mutableLiveData = this.this$0.f75508k;
            Resource.Companion.getClass();
            mutableLiveData.setValue(Resource.a.a(e7));
        }
        if (mediaVideoReply == null) {
            BLog.i(this.this$0.f75499a, "response is null.");
            MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> mutableLiveData2 = this.this$0.f75508k;
            Resource.a aVar2 = Resource.Companion;
            Throwable th = new Throwable("no data.");
            aVar2.getClass();
            mutableLiveData2.setValue(Resource.a.a(th));
            return Unit.INSTANCE;
        }
        this.this$0.f75506i.f75492d = mediaVideoReply.getOffset();
        this.this$0.f75506i.f75494f = mediaVideoReply.getHasMore();
        List<BasicIndexItem> list = this.this$0.f75507j;
        List listList = mediaVideoReply.getListList();
        final ChannelMovieSpmid channelMovieSpmid = ChannelMovieSpmid.CHANNEL_MOVIE_VIDEO_SPMID;
        String str2 = this.this$0.f75501c;
        final String spmid = (str2 == null || StringsKt.isBlank(str2)) ? channelMovieSpmid.getSpmid() : this.this$0.f75501c;
        ((ArrayList) list).addAll(SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(listList), new Function1(channelMovieSpmid, spmid) { // from class: com.bilibili.pegasus.channelv3.movie.video.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelMovieSpmid f75495a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75496b;

            {
                this.f75495a = channelMovieSpmid;
                this.f75496b = spmid;
            }

            public final Object invoke(Object obj2) {
                BigItem bigItem = (BigItem) obj2;
                String coverRightText = bigItem.getCoverRightText();
                String coverLeftText1 = bigItem.getCoverLeftText1();
                int coverLeftIcon1 = (int) bigItem.getCoverLeftIcon1();
                String coverLeftText2 = bigItem.getCoverLeftText2();
                int coverLeftIcon2 = (int) bigItem.getCoverLeftIcon2();
                UserCard userCard = bigItem.getUserCard();
                ChannelDetailLargeCoverItem channelDetailLargeCoverItem = new ChannelDetailLargeCoverItem(coverRightText, coverLeftText1, coverLeftIcon1, coverLeftText2, coverLeftIcon2, new ChannelDetailCardUserInfo(userCard.getUserName(), userCard.getUserFace(), userCard.getUserUrl(), userCard.getMid()), bigItem.getParam(), bigItem.getIsFav(), bigItem.hasSharePlane() ? new SharePlane(bigItem.getSharePlane()) : null, bigItem.hasThreePointMeta() ? new InlineThreePointPanel(bigItem.getThreePointMeta()) : null, bigItem.hasInlineProgressBar() ? new InlineProgressBar(bigItem.getInlineProgressBar()) : null, null, 2048, null);
                ((BasicIndexItem) channelDetailLargeCoverItem).title = bigItem.getTitle();
                ((BasicIndexItem) channelDetailLargeCoverItem).cover = bigItem.getCoverImageUri();
                channelDetailLargeCoverItem.setUri(bigItem.getUri());
                ((BasePlayerItem) channelDetailLargeCoverItem).likeButton = new LikeButtonItemV2(bigItem.getLikeButton());
                ((BasicIndexItem) channelDetailLargeCoverItem).playerArgs = new PlayerArgs(bigItem.getPlayerArgs());
                channelDetailLargeCoverItem.spmid = this.f75495a;
                channelDetailLargeCoverItem.fromSpmid = this.f75496b;
                ((BasePlayerItem) channelDetailLargeCoverItem).canPlay = bigItem.getCanPlay();
                ((BasePlayerItem) channelDetailLargeCoverItem).disableDanmaku = true;
                ((BasePlayerItem) channelDetailLargeCoverItem).hideDanmakuSwitch = true;
                return channelDetailLargeCoverItem;
            }
        })));
        MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> mutableLiveData3 = this.this$0.f75508k;
        Resource.a aVar3 = Resource.Companion;
        Pair pair = TuplesKt.to(Boxing.boxBoolean(mediaVideoReply.getHasMore()), this.this$0.f75507j);
        aVar3.getClass();
        mutableLiveData3.setValue(Resource.a.d(pair));
        return Unit.INSTANCE;
    }
}

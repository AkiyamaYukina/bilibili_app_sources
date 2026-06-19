package com.bilibili.pegasus.channelv3.movie.head;

import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.app.interfaces.v1.Button;
import com.bapis.bilibili.app.interfaces.v1.ChannelInfo;
import com.bapis.bilibili.app.interfaces.v1.MediaMoss;
import com.bapis.bilibili.app.interfaces.v1.MediaMossKtxKt;
import com.bapis.bilibili.app.interfaces.v1.MediaTabReply;
import com.bapis.bilibili.app.interfaces.v1.MediaTabReq;
import com.bapis.bilibili.app.interfaces.v1.Supernatant;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.pegasus.channelv3.utils.ChannelStatus;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import yo0.C9069c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/ChannelMovieHeadVM$loadHeader$1.class */
public final class ChannelMovieHeadVM$loadHeader$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, String> $movieArgs;
    int label;
    final ChannelMovieHeadVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMovieHeadVM$loadHeader$1(ChannelMovieHeadVM channelMovieHeadVM, Map<String, String> map, Continuation<? super ChannelMovieHeadVM$loadHeader$1> continuation) {
        super(2, continuation);
        this.this$0 = channelMovieHeadVM;
        this.$movieArgs = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelMovieHeadVM$loadHeader$1(this.this$0, this.$movieArgs, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long longOrNull;
        MediaTabReply mediaTabReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f75385g.setValue(new C9069c<>(ChannelStatus.LOADING, null, 4));
                String str = this.$movieArgs.get("biz_id");
                long jLongValue = (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? -1L : longOrNull.longValue();
                String str2 = this.$movieArgs.get("biz_type");
                long jLongValue2 = -1;
                if (str2 != null) {
                    Long longOrNull2 = StringsKt.toLongOrNull(str2);
                    jLongValue2 = -1;
                    if (longOrNull2 != null) {
                        jLongValue2 = longOrNull2.longValue();
                    }
                }
                MediaMoss mediaMoss = new MediaMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                MediaTabReq.c spmid = MediaTabReq.newBuilder().setSpmid("traffic.new-channel-detail.0.0");
                String str3 = this.$movieArgs.get(GameCardButton.extraParamSource);
                String str4 = str3;
                if (str3 == null) {
                    str4 = "";
                }
                MediaTabReq mediaTabReqBuild = spmid.setSource(str4).setBizId(jLongValue).setBizType(jLongValue2).putAllArgs(this.$movieArgs).build();
                this.label = 1;
                Object objSuspendMediaTab = MediaMossKtxKt.suspendMediaTab(mediaMoss, mediaTabReqBuild, this);
                obj = objSuspendMediaTab;
                if (objSuspendMediaTab == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mediaTabReply = (MediaTabReply) obj;
        } catch (Exception e7) {
            this.this$0.f75385g.setValue(new C9069c<>(ChannelStatus.ERROR, null, 2));
            BLog.e(this.this$0.f75379a, "request head error", e7);
        }
        if (mediaTabReply == null) {
            MutableLiveData<C9069c<MediaTabReply>> mutableLiveData = this.this$0.f75385g;
            new Throwable("no data");
            mutableLiveData.setValue(new C9069c<>(ChannelStatus.ERROR, null, 2));
            BLog.e(this.this$0.f75379a, "request empty data.");
            return Unit.INSTANCE;
        }
        if (mediaTabReply.hasMediaCard() && !mediaTabReply.getTabList().isEmpty()) {
            this.this$0.f75380b = mediaTabReply.getMediaCard().getCurTitle();
            if (mediaTabReply.hasChannelInfo()) {
                MutableLiveData<p> mutableLiveData2 = this.this$0.f75388k;
                ChannelInfo channelInfo = mediaTabReply.getChannelInfo();
                p pVar = this.this$0.f75384f;
                String curTitle = mediaTabReply.getMediaCard().getCurTitle();
                pVar.f75449a = channelInfo.getChannelId();
                pVar.f75451c = channelInfo.getSubscribed();
                pVar.f75450b = curTitle;
                mutableLiveData2.setValue(pVar);
            }
            if (mediaTabReply.getMediaCard().hasButFirst()) {
                MutableLiveData<c> mutableLiveData3 = this.this$0.h;
                Button butFirst = mediaTabReply.getMediaCard().getButFirst();
                c cVar = this.this$0.f75382d;
                cVar.f75400a = butFirst.getTitle();
                cVar.f75401b = butFirst.getHasTitle();
                cVar.f75402c = butFirst.getLink();
                cVar.f75403d = butFirst.getId();
                cVar.f75404e = (int) butFirst.getIcon();
                cVar.f75405f = butFirst.getButType();
                if (butFirst.getFollowState() != 1) {
                    z6 = false;
                }
                cVar.f75406g = z6;
                mutableLiveData3.setValue(cVar);
            }
            if (mediaTabReply.getMediaCard().hasButSecond()) {
                MutableLiveData<o> mutableLiveData4 = this.this$0.f75386i;
                Supernatant butSecond = mediaTabReply.getMediaCard().getButSecond();
                o oVar = this.this$0.f75383e;
                d.a(butSecond, oVar);
                mutableLiveData4.setValue(oVar);
            }
            this.this$0.f75385g.setValue(new C9069c<>(ChannelStatus.SUCCESS, mediaTabReply, 4));
            return Unit.INSTANCE;
        }
        this.this$0.f75385g.setValue(new C9069c<>(ChannelStatus.EMPTY, null, 6));
        return Unit.INSTANCE;
    }
}

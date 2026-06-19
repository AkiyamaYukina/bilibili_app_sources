package com.bilibili.music.podcast.utils.triple;

import android.content.Context;
import com.bapis.bilibili.app.listener.v1.TripleLikeResp;
import com.bilibili.bus.Violet;
import com.bilibili.droid.ToastHelper;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.data.p;
import com.bilibili.music.podcast.moss.f;
import com.bilibili.music.podcast.utils.triple.a;
import com.opensource.svgaplayer.SVGAImageView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/triple/MusicTripleHelper$onTriggerTripleLike$1.class */
final class MusicTripleHelper$onTriggerTripleLike$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final MusicPlayItem $musicPlayItem;
    final MusicPlayVideo $musicPlayVideo;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicTripleHelper$onTriggerTripleLike$1(MusicPlayItem musicPlayItem, MusicPlayVideo musicPlayVideo, a aVar, Context context, Continuation<? super MusicTripleHelper$onTriggerTripleLike$1> continuation) {
        super(2, continuation);
        this.$musicPlayItem = musicPlayItem;
        this.$musicPlayVideo = musicPlayVideo;
        this.this$0 = aVar;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicTripleHelper$onTriggerTripleLike$1(this.$musicPlayItem, this.$musicPlayVideo, this.this$0, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        TripleLikeResp tripleLikeResp;
        MusicPlayItem.State state;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            f fVar = f.f66883a;
            long oid = this.$musicPlayItem.getOid();
            long sid = this.$musicPlayItem.getSid();
            int itemType = this.$musicPlayItem.getItemType();
            this.label = 1;
            Object objF = fVar.f(itemType, oid, sid, this);
            obj2 = objF;
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        MusicPlayItem musicPlayItem = this.$musicPlayItem;
        MusicPlayVideo musicPlayVideo = this.$musicPlayVideo;
        a aVar = this.this$0;
        Context context = this.$context;
        if (Result.isSuccess-impl(obj2) && (tripleLikeResp = (TripleLikeResp) obj2) != null) {
            boolean zA = p.a(musicPlayItem.getState());
            if (musicPlayVideo != null) {
                if (tripleLikeResp.getThumbOk()) {
                    MusicPlayItem.State state2 = musicPlayVideo.getState();
                    if (!(state2 != null ? state2.isLiked() : false) && (state = musicPlayVideo.getState()) != null) {
                        state.setLike(state.getLike() + 1);
                    }
                    MusicPlayItem.State state3 = musicPlayVideo.getState();
                    if (state3 != null) {
                        state3.setLiked(true);
                    }
                }
                if (tripleLikeResp.getCoinOk()) {
                    if (musicPlayVideo.getState() != null) {
                        MusicPlayItem.State state4 = musicPlayVideo.getState();
                        boolean zIsCoin = false;
                        if (state4 != null) {
                            zIsCoin = state4.isCoin();
                        }
                        if (!zIsCoin) {
                            MusicPlayItem.State state5 = musicPlayVideo.getState();
                            int coin = musicPlayVideo.getState().getCoin();
                            MusicPlayItem.MusicPlayArchive playArchive = musicPlayVideo.getPlayArchive();
                            int i8 = (playArchive == null || playArchive.getCopyright() != 1) ? 1 : 2;
                            if (state5 != null) {
                                state5.setCoin(coin + i8);
                            }
                        }
                    }
                    MusicPlayItem.State state6 = musicPlayVideo.getState();
                    if (state6 != null) {
                        state6.setCoin(true);
                    }
                }
                if (tripleLikeResp.getFavOk() && !p.a(musicPlayVideo.getState())) {
                    p.b(musicPlayVideo.getState(), true);
                }
            }
            Violet.INSTANCE.setValue(new b(musicPlayItem.getOid()));
            boolean thumbOk = tripleLikeResp.getThumbOk();
            boolean coinOk = tripleLikeResp.getCoinOk();
            boolean favOk = tripleLikeResp.getFavOk();
            if (thumbOk && coinOk && favOk) {
                SVGAImageView sVGAImageView = aVar.f67034e;
                SVGAImageView sVGAImageView2 = sVGAImageView;
                if (sVGAImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLikeSvga");
                    sVGAImageView2 = null;
                }
                sVGAImageView2.startAnimation();
                SVGAImageView sVGAImageView3 = aVar.f67035f;
                SVGAImageView sVGAImageView4 = sVGAImageView3;
                if (sVGAImageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCoinSvga");
                    sVGAImageView4 = null;
                }
                sVGAImageView4.startAnimation();
                SVGAImageView sVGAImageView5 = aVar.f67036g;
                if (sVGAImageView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFavoriteSvga");
                    sVGAImageView5 = null;
                }
                sVGAImageView5.startAnimation();
            }
            if (tripleLikeResp.getMessage().length() > 0) {
                if (thumbOk && coinOk && favOk && !zA) {
                    a.InterfaceC0385a interfaceC0385a = aVar.h;
                    if (interfaceC0385a != null) {
                        interfaceC0385a.d(tripleLikeResp.getMessage());
                    }
                } else {
                    ToastHelper.showToastShort(context, tripleLikeResp.getMessage());
                }
            }
        }
        Context context2 = this.$context;
        if (Result.exceptionOrNull-impl(obj2) != null) {
            ToastHelper.showToastShort(context2, 2131847093);
        }
        return Unit.INSTANCE;
    }
}

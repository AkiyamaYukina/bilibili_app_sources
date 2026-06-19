package com.bilibili.playerbizcommon.features.network;

import android.view.ViewGroup;
import androidx.transition.TransitionManager;
import com.bilibili.bililive.animation.LiveAnimationCacheHelper;
import com.bilibili.bililive.biz.entryEffect.view.LiveEntryAnimationVideo;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.im.ui.PlayerChatFragment;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.webrtc.SurfaceTextureHelper;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/g.class */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79918b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f79917a = i7;
        this.f79918b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        switch (this.f79917a) {
            case 0:
                PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79918b;
                PlayerContainer playerContainer = null;
                if (playerNetworkService.f79894u == 2) {
                    long currentMediaSize = playerNetworkService.getCurrentMediaSize();
                    PlayerContainer playerContainer2 = playerNetworkService.f79875a;
                    if (playerContainer2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    } else {
                        playerContainer = playerContainer2;
                    }
                    string = playerContainer.getContext().getString(2131846366, String.valueOf(currentMediaSize));
                } else {
                    PlayerContainer playerContainer3 = playerNetworkService.f79875a;
                    if (playerContainer3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        playerContainer3 = null;
                    }
                    string = playerContainer3.getContext().getString(2131845638);
                }
                playerNetworkService.j(string, false, false);
                break;
            default:
                final PlayerChatFragment playerChatFragment = (PlayerChatFragment) this.f79918b;
                final int i7 = 0;
                playerChatFragment.f111253e.postDelayed(new Runnable(playerChatFragment, i7) { // from class: com.bilibili.tgwt.im.ui.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f111313a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f111314b;

                    {
                        this.f111313a = i7;
                        this.f111314b = playerChatFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f111313a) {
                            case 0:
                                PlayerChatFragment playerChatFragment2 = (PlayerChatFragment) this.f111314b;
                                if (playerChatFragment2.getView() instanceof ViewGroup) {
                                    TransitionManager.beginDelayedTransition((ViewGroup) playerChatFragment2.getView());
                                }
                                com.bilibili.tgwt.detail.chat.p pVar = playerChatFragment2.f111250b;
                                com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
                                if (pVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                                    pVar2 = null;
                                }
                                pVar2.f111133t.set(false);
                                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = playerChatFragment2.f111251c;
                                if (togetherWatchDetailPageViewModel == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                                    togetherWatchDetailPageViewModel = null;
                                }
                                togetherWatchDetailPageViewModel.getChatRoomManagerService().k(ChatRoomManagerService.FullScreenChatPopLayerType.WAIT_PEOPLE_POP_LAYER, false);
                                break;
                            case 1:
                                SurfaceTextureHelper.e((SurfaceTextureHelper) this.f111314b);
                                break;
                            default:
                                LiveEntryAnimationVideo liveEntryAnimationVideo = (LiveEntryAnimationVideo) this.f111314b;
                                LiveLog.Companion companion = LiveLog.Companion;
                                String logTag = liveEntryAnimationVideo.getLogTag();
                                if (companion.matchLevel(3)) {
                                    String str = "execute removeRunnable" == 0 ? "" : "execute removeRunnable";
                                    LiveLogDelegate logDelegate = companion.getLogDelegate();
                                    if (logDelegate != null) {
                                        LiveLogDelegate.onLog$default(logDelegate, 3, logTag, str, (Throwable) null, 8, (Object) null);
                                    }
                                    BLog.i(logTag, str);
                                }
                                LiveAnimationCacheHelper.INSTANCE.removeResourceCacheListener(liveEntryAnimationVideo.q);
                                liveEntryAnimationVideo.b();
                                break;
                        }
                    }
                }, 200L);
                break;
        }
    }
}

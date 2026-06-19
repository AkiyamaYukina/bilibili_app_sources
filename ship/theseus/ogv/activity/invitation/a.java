package com.bilibili.ship.theseus.ogv.activity.invitation;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.app.comm.supermenu.share.v2.ShareContentProvider;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.ShareResult;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityBackgroundVo;
import com.bilibili.ship.theseus.ogv.activity.OgvInvitationActivityHostVo;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvInvitationActivityHostVo f91569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8044b f91570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f91571c = new c(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShareOnlineParams f91572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ShareOnlineParams f91573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f91574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C0678a f91575g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.invitation.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/a$a.class */
    public static final class C0678a implements ShareHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f91576a;

        public C0678a(a aVar) {
            this.f91576a = aVar;
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public final Bundle getShareContent(String str) {
            ThirdPartyExtraBuilder thirdPartyExtraBuilderShareType = new ThirdPartyExtraBuilder().clientName("ogvinvite").shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_WEB);
            a aVar = this.f91576a;
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA = aVar.f91569a.a();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderContent = thirdPartyExtraBuilderShareType.content(ogvInvitationActivityBackgroundVoA != null ? ogvInvitationActivityBackgroundVoA.f91450l : null);
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA2 = aVar.f91569a.a();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderImageUrl = thirdPartyExtraBuilderContent.imageUrl(ogvInvitationActivityBackgroundVoA2 != null ? ogvInvitationActivityBackgroundVoA2.f91451m : null);
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA3 = aVar.f91569a.a();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderTitle = thirdPartyExtraBuilderImageUrl.title(ogvInvitationActivityBackgroundVoA3 != null ? ogvInvitationActivityBackgroundVoA3.f91449k : null);
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA4 = aVar.f91569a.a();
            String str2 = null;
            if (ogvInvitationActivityBackgroundVoA4 != null) {
                str2 = ogvInvitationActivityBackgroundVoA4.f91448j;
            }
            return thirdPartyExtraBuilderTitle.targetUrl(str2).build();
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public final void onShareCancel(String str, ShareResult shareResult) {
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public final void onShareFail(String str, ShareResult shareResult) {
        }

        @Override // com.bilibili.lib.sharewrapper.ShareHelper.Callback
        public final void onShareSuccess(String str, ShareResult shareResult) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/a$b.class */
    public static final class b implements ShareCallback {
        public final boolean onShareCancel(String str, int i7) {
            return false;
        }

        public final boolean onShareFail(String str, int i7, String str2) {
            return false;
        }

        public final boolean onShareSuccess(String str, String str2) {
            return false;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/invitation/a$c.class */
    public static final class c implements ShareContentProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f91577a;

        public c(a aVar) {
            this.f91577a = aVar;
        }

        public final Bundle getShareContent(String str) {
            ThirdPartyExtraBuilder thirdPartyExtraBuilderShareType = new ThirdPartyExtraBuilder().clientName("ogvinvite").shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_WEB);
            a aVar = this.f91577a;
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA = aVar.f91569a.a();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderContent = thirdPartyExtraBuilderShareType.content(ogvInvitationActivityBackgroundVoA != null ? ogvInvitationActivityBackgroundVoA.f91450l : null);
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA2 = aVar.f91569a.a();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderImageUrl = thirdPartyExtraBuilderContent.imageUrl(ogvInvitationActivityBackgroundVoA2 != null ? ogvInvitationActivityBackgroundVoA2.f91451m : null);
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA3 = aVar.f91569a.a();
            ThirdPartyExtraBuilder thirdPartyExtraBuilderTitle = thirdPartyExtraBuilderImageUrl.title(ogvInvitationActivityBackgroundVoA3 != null ? ogvInvitationActivityBackgroundVoA3.f91449k : null);
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA4 = aVar.f91569a.a();
            String str2 = null;
            if (ogvInvitationActivityBackgroundVoA4 != null) {
                str2 = ogvInvitationActivityBackgroundVoA4.f91448j;
            }
            return thirdPartyExtraBuilderTitle.targetUrl(str2).build();
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.bilibili.ship.theseus.ogv.activity.invitation.a$b, java.lang.Object] */
    public a(@NotNull OgvInvitationActivityHostVo ogvInvitationActivityHostVo, @NotNull C8044b c8044b) {
        this.f91569a = ogvInvitationActivityHostVo;
        this.f91570b = c8044b;
        ShareOnlineParams.ShareOnlineParamsBuilder shareOnlineParamsBuilder = new ShareOnlineParams.ShareOnlineParamsBuilder();
        OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA = ogvInvitationActivityHostVo.a();
        this.f91572d = shareOnlineParamsBuilder.oid(ogvInvitationActivityBackgroundVoA != null ? ogvInvitationActivityBackgroundVoA.f91448j : null).shareId("united.player-video-detail.new-ogv.qqshare.click").shareOrigin("").fromSpmId(c8044b.f123883e).shareMode(3).build();
        ShareOnlineParams.ShareOnlineParamsBuilder shareOnlineParamsBuilder2 = new ShareOnlineParams.ShareOnlineParamsBuilder();
        OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA2 = ogvInvitationActivityHostVo.a();
        this.f91573e = shareOnlineParamsBuilder2.oid(ogvInvitationActivityBackgroundVoA2 != null ? ogvInvitationActivityBackgroundVoA2.f91448j : null).shareId("united.player-video-detail.new-ogv.wechatshare.click").shareOrigin("").fromSpmId(c8044b.f123883e).shareMode(3).build();
        this.f91574f = new Object();
        this.f91575g = new C0678a(this);
    }
}

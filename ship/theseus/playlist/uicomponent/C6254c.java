package com.bilibili.ship.theseus.playlist.uicomponent;

import android.app.Activity;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.supermenu.share.v2.MenuItemHandler;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelWrapper;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.ship.theseus.playlist.C6250o;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/c.class */
@StabilityInferred(parameters = 0)
public final class C6254c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f96021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistInfo f96022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharePanelWrapper.SharePanelWrapperBuilder f96023c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/c$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f96024a = "playlist.playlist-video-detail.0.0.pv";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f96025b = "playlist_share";
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.c$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/c$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f96026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f96027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f96028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f96029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f96030e;

        public b(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            this.f96026a = str;
            this.f96027b = str2;
            this.f96028c = str3;
            this.f96029d = str4;
            this.f96030e = str5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.lib.sharewrapper.online.ShareOnlineParams$ShareItemHandler, java.lang.Object] */
    public C6254c(@NotNull Activity activity, @NotNull PlaylistInfo playlistInfo, @NotNull b bVar, @NotNull a aVar, @NotNull C6250o c6250o) {
        this.f96021a = activity;
        this.f96022b = playlistInfo;
        SharePanelWrapper.SharePanelWrapperBuilder sharePanelWrapperBuilderWith = SharePanelWrapper.Companion.with(activity);
        this.f96023c = sharePanelWrapperBuilderWith;
        ?? obj = new Object();
        C6256e c6256e = new C6256e(this);
        ShareOnlineParams shareOnlineParamsBuild = ShareOnlineParams.builder().shareId(aVar.f96024a).shareOrigin(aVar.f96025b).sid(bVar.f96026a).oid(bVar.f96027b).spmId(bVar.f96029d).from(bVar.f96028c).fromSpmId(bVar.f96030e).shareItemHandler(obj).build();
        sharePanelWrapperBuilderWith.shareOnlineParams(shareOnlineParamsBuild).shareContentProvider(c6256e).shareCallback(c6250o).menuItemHandler(new MenuItemHandler()).sharePanelShowCallback(new C6253b(this));
    }

    public final Bundle a(String str) {
        ThirdPartyExtraBuilder thirdPartyExtraBuilderContent = new ThirdPartyExtraBuilder().content(str);
        PlaylistInfo playlistInfo = this.f96022b;
        return thirdPartyExtraBuilderContent.title(playlistInfo.f95281n).targetUrl("https://www.bilibili.com/medialist/play/ml" + playlistInfo.f95276i).shareType(ThirdPartyExtraBuilder.PARAMS_TYPE_WEB).imageUrl(playlistInfo.d()).build();
    }
}

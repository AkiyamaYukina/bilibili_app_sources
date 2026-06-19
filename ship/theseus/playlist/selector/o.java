package com.bilibili.ship.theseus.playlist.selector;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.chatroom.ui.ChatPlayerMsgFragment;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playerbizcommon.view.FromTextView;
import com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.ControlWidgetChangedObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/o.class */
@StabilityInferred(parameters = 0)
public final class o extends FromTextView implements IControlWidget {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f95906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f95907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f95908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlaylistSelectorService f95909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f95910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f95911g;

    @NotNull
    public final b h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/o$a.class */
    public static final class a implements ControlWidgetChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f95912a;

        public a(o oVar) {
            this.f95912a = oVar;
        }

        public final void onControllerWidgetChanged() {
            this.f95912a.J(false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/o$b.class */
    public static final class b implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f95913a;

        public b(o oVar) {
            this.f95913a = oVar;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            this.f95913a.J(false);
        }

        public final void onPlayableParamsChanged(Video.PlayableParams playableParams) {
            this.f95913a.J(false);
        }
    }

    @Inject
    public o(@NotNull Context context, @NotNull IControlContainerService iControlContainerService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IPlayDirector iPlayDirector, @NotNull PlaylistSelectorService playlistSelectorService, @NotNull PageReportService pageReportService) {
        super(context);
        this.f95906b = iControlContainerService;
        this.f95907c = iPlayerSettingService;
        this.f95908d = iPlayDirector;
        this.f95909e = playlistSelectorService;
        this.f95910f = pageReportService;
        this.f95911g = new a(this);
        this.h = new b(this);
    }

    public final void J(boolean z6) {
        boolean zB = this.f95907c.getCloudConfig().a.getSelectionsConf().b(false);
        setVisibility(zB ? 0 : 8);
        if (!z6) {
            this.f95909e.f95843i.tryEmit(PlaylistSelectorService.a.C0795a.f95847a);
        } else {
            if (zB) {
                return;
            }
            this.f95909e.f95843i.tryEmit(PlaylistSelectorService.a.C0795a.f95847a);
        }
    }

    public final void onWidgetActive() {
        final int i7 = 0;
        setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ship.theseus.playlist.selector.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f95904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f95905b;

            {
                this.f95904a = i7;
                this.f95905b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f95904a) {
                    case 0:
                        o oVar = (o) this.f95905b;
                        oVar.f95909e.f95843i.tryEmit(PlaylistSelectorService.a.b.f95848a);
                        oVar.f95906b.hide();
                        PageReportService.g(oVar.f95910f, "player.player.episode.0.player", null, 6);
                        break;
                    default:
                        ChatPlayerMsgFragment chatPlayerMsgFragment = (ChatPlayerMsgFragment) this.f95905b;
                        fV.b bVar = chatPlayerMsgFragment.m;
                        fV.b bVar2 = bVar;
                        if (bVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("commonReport");
                            bVar2 = null;
                        }
                        Neurons.reportClick(false, "main.public-community.watch-together.im-input.click", bVar2.a);
                        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://main/login/")).build(), view.getContext());
                        } else {
                            chatPlayerMsgFragment.lf();
                            com.bilibili.chatroom.widget.h hVar = chatPlayerMsgFragment.f;
                            if (hVar != null) {
                                hVar.e(false);
                            }
                        }
                        break;
                }
            }
        });
        J(true);
        setText(getContext().getString(2131851649));
        this.f95906b.registerWidgetChangedObserver(this.f95911g);
        this.f95908d.addVideoDirectorObserver(this.h);
    }

    public final void onWidgetInactive() {
        setOnClickListener(null);
        this.f95906b.unregisterWidgetChangedObserver(this.f95911g);
        this.f95908d.removeVideoDirectorObserver(this.h);
    }
}

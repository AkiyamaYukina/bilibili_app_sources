package com.bilibili.ship.theseus.ugc.intro.uplikes;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService.class */
@StabilityInferred(parameters = 0)
public final class UgcUpLikesService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f97671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f97674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f97675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f97676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f97677g;

    @NotNull
    public final IntroContentSizeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f97678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f97679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f97680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f97681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f97682m;

    @Inject
    public UgcUpLikesService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull C8043a c8043a, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar3) {
        this.f97671a = context;
        this.f97672b = coroutineScope;
        this.f97673c = aVar;
        this.f97674d = hVar;
        this.f97675e = gVar;
        this.f97676f = theseusFloatLayerService;
        this.f97677g = c8043a;
        this.h = introContentSizeRepository;
        this.f97678i = pageReportService;
        this.f97679j = aVar2;
        this.f97680k = backActionRepository;
        this.f97681l = dVar;
        this.f97682m = aVar3;
    }

    public static final void a(UgcUpLikesService ugcUpLikesService, long j7, String str) {
        ugcUpLikesService.getClass();
        RouteRequest.Builder builder = new RouteRequest.Builder(Uri.parse("bilibili://space/:mid/"));
        builder.getExtras().put(EditCustomizeSticker.TAG_MID, String.valueOf(j7));
        builder.getExtras().put("name", str);
        builder.getExtras().put("from", ugcUpLikesService.f97677g.a().f123879a);
        builder.getExtras().put("defaultTab", "video");
        builder.getExtras().put(GameCardButton.extraAvid, ugcUpLikesService.f97673c.b());
        BLRouter.routeTo(builder.build(), ugcUpLikesService.f97671a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.app.gemini.ui.RunningUIComponent b(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ugc.intro.uplikes.UserList r13) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService.b(com.bilibili.ship.theseus.ugc.intro.uplikes.UserList):com.bilibili.app.gemini.ui.RunningUIComponent");
    }
}

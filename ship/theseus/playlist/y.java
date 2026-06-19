package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.bilibili.playset.widget.favorite.FavoriteDialog;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/y.class */
@StabilityInferred(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f96135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f96136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentManager f96137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f96138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ActivityResultRepository f96139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f96140g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final IVideoLikeRouteService f96141i = (IVideoLikeRouteService) BLRouter.INSTANCE.get(IVideoLikeRouteService.class, "video_like");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public FavoriteDialog f96142j;

    @Inject
    public y(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ComponentActivity componentActivity, @NotNull FragmentManager fragmentManager, @NotNull PlaylistRepository playlistRepository, @NotNull ActivityResultRepository activityResultRepository, @NotNull C8043a c8043a, @NotNull PageReportService pageReportService) {
        this.f96134a = coroutineScope;
        this.f96135b = context;
        this.f96136c = componentActivity;
        this.f96137d = fragmentManager;
        this.f96138e = playlistRepository;
        this.f96139f = activityResultRepository;
        this.f96140g = c8043a;
        this.h = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistMediaActionService$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistMediaActionService$2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, tv.danmaku.bili.widget.dialog.BiliCommonDialog$OnDialogTextClickListener] */
    public final void a(@NotNull MultiTypeMedia multiTypeMedia) {
        PlaylistRepository playlistRepository = this.f96138e;
        Iterator<MultiTypeMedia> it = playlistRepository.d().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().d() == multiTypeMedia.d()) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            BLog.e("PlaylistMediaActionService-detail", "[theseus-playlist-PlaylistMediaActionService-detail] Invalid media index!", (Throwable) null);
            return;
        }
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            BiliCommonDialog.Builder.setPositiveButton$default(new BiliCommonDialog.Builder(this.f96135b).setTitle(2131851571), 2131851597, (BiliCommonDialog.OnDialogTextClickListener) new Object(), false, (CustomButtonInfo) null, 12, (Object) null).build().show(this.f96137d, "PlaylistMediaActionService");
            return;
        }
        PlaylistRepository.e eVarC = playlistRepository.c();
        long jD = multiTypeMedia.d();
        long jD2 = eVarC.f95137a.d();
        String str = multiTypeMedia.f95239m;
        String str2 = str;
        if (jD == jD2) {
            Ou0.c cVar = eVarC.f95138b;
            str2 = str;
            if (cVar != null) {
                str2 = cVar.h;
                if (str2 == null) {
                    str2 = str;
                }
            }
        }
        BLRouter.routeTo(new RouteRequest.Builder(str2).extras(new A70.a(this, 2)).requestCode(-1).build(), this.f96135b);
        PageReportService.g(this.h, "united.player-video-detail.playlist-three-float.detail-show.click", N.b(multiTypeMedia), 4);
    }

    public final void b(@NotNull final MultiTypeMedia multiTypeMedia) {
        Iterator<MultiTypeMedia> it = this.f96138e.d().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().d() == multiTypeMedia.d()) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            BLog.e("PlaylistMediaActionService-favor", "[theseus-playlist-PlaylistMediaActionService-favor] Invalid media index!", (Throwable) null);
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("oid", String.valueOf(multiTypeMedia.d()));
        Context context = this.f96135b;
        String string = context.getString(2131845673);
        C8043a c8043a = this.f96140g;
        if (sh1.o.a(context, string, c8043a.a().f123881c, c8043a.a().f123880b, jsonObject.toString())) {
            FavoriteDialog.BizType bizType = multiTypeMedia.t() ? FavoriteDialog.BizType.OGV_AVID : FavoriteDialog.BizType.UGC;
            HashMap map = new HashMap();
            long jD = multiTypeMedia.d();
            Ou0.c cVarB = multiTypeMedia.b();
            final FavoriteDialog.b bVar = new FavoriteDialog.b(jD, cVarB != null ? cVarB.f18089b : 0L, bizType, multiTypeMedia.h == 1, ErrorCode.E_T0_HANDLE_INVALID, false, false, false, map, c8043a.a().f123879a, c8043a.a().f123880b, c8043a.a().f123881c, FavSnackBarUtil.Scene.DetailPage, Boolean.FALSE, false, false, null, null, null, 491520);
            FavoriteDialog favoriteDialog = new FavoriteDialog(this.f96136c, bVar, null);
            favoriteDialog.setOnDismissListener(new DialogInterface.OnDismissListener(bVar, multiTypeMedia, this) { // from class: com.bilibili.ship.theseus.playlist.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FavoriteDialog.b f96129a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MultiTypeMedia f96130b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final y f96131c;

                {
                    this.f96129a = bVar;
                    this.f96130b = multiTypeMedia;
                    this.f96131c = this;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    FavoriteDialog.b bVar2 = this.f96129a;
                    MultiTypeMedia multiTypeMedia2 = this.f96130b;
                    y yVar = this.f96131c;
                    boolean z6 = bVar2.f85708d;
                    boolean z7 = true;
                    if (multiTypeMedia2.h != 1) {
                        z7 = false;
                    }
                    if (z7 != z6) {
                        if (z6) {
                            com.bilibili.ship.theseus.united.utils.q.b(2131846674);
                        } else {
                            com.bilibili.ship.theseus.united.utils.q.b(2131845692);
                        }
                        yVar.f96138e.f95114v.tryEmit(new PlaylistRepository.c.a(multiTypeMedia2, z6));
                    }
                    yVar.f96142j = null;
                }
            });
            favoriteDialog.show();
            this.f96142j = favoriteDialog;
            PageReportService.g(this.h, "united.player-video-detail.playlist-three-float.collect.click", N.b(multiTypeMedia), 4);
        }
    }
}

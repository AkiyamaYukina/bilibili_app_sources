package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.playlist.api.FolderFavorite;
import com.bilibili.ship.theseus.playlist.api.PlaylistThumbUp;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/f.class */
@StabilityInferred(parameters = 0)
public final class C6241f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f95746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f95747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f95749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f95750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f95751g;

    @NotNull
    public final BackActionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f95752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C8043a f95753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f95754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f95755l = (a) ServiceGenerator.createService(a.class);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.f$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/f$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @RequestInterceptor(Ou0.b.class)
        @Nullable
        @FormUrlEncoded
        @POST("x/v3/fav/folder/fav")
        Object favorite(@Field("media_id") long j7, @Field("from_spmid") @NotNull String str, @Field("spmid") @NotNull String str2, @Field("action_id") @Nullable String str3, @Header("x-bili-gaia-vtoken") @Nullable String str4, @NotNull Continuation<? super Response<BiliApiResponse<FolderFavorite>>> continuation);

        @RequestInterceptor(Ou0.b.class)
        @Nullable
        @FormUrlEncoded
        @POST("x/v3/fav/thump/up")
        Object thumbUp(@Field("rid") long j7, @Field("thumb_type") int i7, @Field("type") int i8, @Field("up_mid") long j8, @Field("from_spmid") @NotNull String str, @Field("spmid") @NotNull String str2, @Field("action_id") @Nullable String str3, @Header("x-bili-gaia-vtoken") @Nullable String str4, @NotNull Continuation<? super Response<BiliApiResponse<PlaylistThumbUp>>> continuation);

        @RequestInterceptor(Ou0.b.class)
        @Nullable
        @FormUrlEncoded
        @POST("x/v3/fav/folder/unfav")
        Object unFavorite(@Field("media_id") long j7, @Field("from_spmid") @NotNull String str, @Field("spmid") @NotNull String str2, @Field("action_id") @Nullable String str3, @NotNull Continuation<? super BiliApiResponse<String>> continuation);
    }

    @Inject
    public C6241f(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull ComponentActivity componentActivity, @NotNull PlaylistRepository playlistRepository, @NotNull BiliAccounts biliAccounts, @NotNull PageReportService pageReportService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f95745a = coroutineScope;
        this.f95746b = context;
        this.f95747c = componentActivity;
        this.f95748d = playlistRepository;
        this.f95749e = biliAccounts;
        this.f95750f = pageReportService;
        this.f95751g = theseusFloatLayerService;
        this.h = backActionRepository;
        this.f95752i = cVar;
        this.f95753j = c8043a;
        this.f95754k = aVar;
    }
}

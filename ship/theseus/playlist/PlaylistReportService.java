package com.bilibili.ship.theseus.playlist;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.playlist.PlaylistReportService;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistReportService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f95072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f95073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f95075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f95076f = (a) ServiceGenerator.createService(a.class);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistReportService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistReportService playlistReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistReportService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(PlaylistReportService playlistReportService, boolean z6) {
            if (!playlistReportService.f95074d.f95091N) {
                return false;
            }
            playlistReportService.f95072b.setResult(-1);
            return false;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final PlaylistReportService playlistReportService = this.this$0;
                BackActionRepository backActionRepository = playlistReportService.f95075e;
                Function1<? super Boolean, Boolean> function1 = new Function1(playlistReportService) { // from class: com.bilibili.ship.theseus.playlist.B

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlaylistReportService f94930a;

                    {
                        this.f94930a = playlistReportService;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PlaylistReportService.AnonymousClass1.invokeSuspend$lambda$0(this.f94930a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistReportService$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @RequestInterceptor(Ou0.b.class)
        @Nullable
        @FormUrlEncoded
        @POST("x/v3/fav/statistics/count")
        Object reportPlay(@Field("rid") long j7, @Field("r_type") int i7, @Field("cnt_type") int i8, @Field("sid") long j8, @Field("stype") int i9, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

        @RequestInterceptor(Ou0.b.class)
        @Nullable
        @FormUrlEncoded
        @POST("/x/v1/medialist/history")
        Object reportProgress(@Field("upper_mid") long j7, @Field("oid") long j8, @Field("desc") boolean z6, @Field("dt") int i7, @Field("biz_id") long j9, @Field("type") int i8, @Field("otype") int i9, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);
    }

    @Inject
    public PlaylistReportService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull BiliAccounts biliAccounts, @NotNull PlaylistRepository playlistRepository, @NotNull BackActionRepository backActionRepository) {
        this.f95071a = coroutineScope;
        this.f95072b = activity;
        this.f95073c = biliAccounts;
        this.f95074d = playlistRepository;
        this.f95075e = backActionRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void a(long j7) {
        BuildersKt.launch$default(this.f95071a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistReportService$reportPlaylistMediaPlay$1(this, j7, null), 3, (Object) null);
    }
}

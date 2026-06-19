package com.bilibili.ship.theseus.cheese.biz.report;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.alipay.alipaysecuritysdk.common.model.DynamicModel;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.droid.DeviceInfo;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.oaid.MsaHelper;
import com.bilibili.okretro.response.BiliApiResponse;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseLinkReportService.class */
@StabilityInferred(parameters = 0)
public final class CheeseLinkReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.bean.b f90451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f90452c = LazyKt.lazy((Function0) new Object());

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.report.CheeseLinkReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseLinkReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Bundle $extra;
        int label;
        final CheeseLinkReportService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bundle bundle, CheeseLinkReportService cheeseLinkReportService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$extra = bundle;
            this.this$0 = cheeseLinkReportService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$extra, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            String strA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String string = this.$extra.getString("sy_trackid", "");
                String string2 = this.$extra.getString("campaignid", "");
                String string3 = this.$extra.getString("accountid", "");
                String string4 = this.$extra.getString("unitid", "");
                String string5 = this.$extra.getString("crid", "");
                if (string.length() == 0 && string2.length() == 0 && string3.length() == 0 && string4.length() == 0 && string5.length() == 0) {
                    return Unit.INSTANCE;
                }
                a aVar = (a) this.this$0.f90452c.getValue();
                long jUnreliableNow = ServerClock.unreliableNow();
                Long l7 = this.this$0.f90451b.f98740a;
                long jLongValue = l7 != null ? l7.longValue() : 0L;
                Long l8 = this.this$0.f90451b.f98742c;
                long jLongValue2 = l8 != null ? l8.longValue() : 0L;
                long j7 = this.$extra.getLong("product_id", 0L);
                String string6 = this.$extra.getString("idfa", "");
                String string7 = this.$extra.getString("caid", "");
                String string8 = this.$extra.getString("aaid", "");
                String string9 = this.$extra.getString("shopid", "");
                String string10 = this.$extra.getString("upmid", "");
                long j8 = this.$extra.getLong(KeySign.UID, 0L);
                long j9 = this.$extra.getLong("upid", 0L);
                this.label = 1;
                Object objLinkReport = aVar.linkReport(string, string3, string2, string4, string5, 0, string6, string7, string8, DeviceInfo.getAndroidId(FoundationAlias.getFapp()), MsaHelper.getOaid(), jUnreliableNow, string9, string10, j8, jLongValue, jLongValue2, j9, j7, "blue_link", "pugv_detail", FoundationAlias.getFdevices().getModel(), this);
                obj = objLinkReport;
                if (objLinkReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                strA = "Link report failed: " + new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                    if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    defpackage.a.b("[theseus-cheese-CheeseLinkReportService$1-invokeSuspend] ", C4496a.a("Link report succeed: ", (String) ((BiliApiResponse.Success) biliApiResponse).getData()), "CheeseLinkReportService$1-invokeSuspend");
                    return Unit.INSTANCE;
                }
                strA = N4.a.a("Link report failed: ", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
            }
            e.a("[theseus-cheese-CheeseLinkReportService$1-invokeSuspend] ", strA, "CheeseLinkReportService$1-invokeSuspend", (Throwable) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseLinkReportService$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @GET("/pugv/adclick/linkreport")
        @Nullable
        Object linkReport(@Query("trackid") @NotNull String str, @Query("accountid") @NotNull String str2, @Query("campaignid") @NotNull String str3, @Query("unitid") @NotNull String str4, @Query("crid") @NotNull String str5, @Query(DynamicModel.KEY_DYNAMIC_OS) int i7, @Query("idfa") @NotNull String str6, @Query("caid") @NotNull String str7, @Query("aaid") @NotNull String str8, @Query("androidid") @NotNull String str9, @Query("oaid") @NotNull String str10, @Query("ts") long j7, @Query("shopid") @NotNull String str11, @Query("upmid") @NotNull String str12, @Query(KeySign.UID) long j8, @Query("seasonid") long j9, @Query("seriesid") long j10, @Query("upid") long j11, @Query("pkg_id") long j12, @Query("report_scene") @NotNull String str13, @Query("source_type") @NotNull String str14, @Query("model") @NotNull String str15, @NotNull Continuation<? super BiliApiResponse<String>> continuation);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/report/CheeseLinkReportService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Bundle f90453a;

        public b(@NotNull Bundle bundle) {
            this.f90453a = bundle;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Inject
    public CheeseLinkReportService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.bean.b bVar, @NotNull b bVar2) {
        this.f90450a = coroutineScope;
        this.f90451b = bVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(bVar2.f90453a, this, null), 3, (Object) null);
    }
}

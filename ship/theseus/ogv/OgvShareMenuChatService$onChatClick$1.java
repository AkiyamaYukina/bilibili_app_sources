package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvShareMenuChatService$onChatClick$1.class */
public final class OgvShareMenuChatService$onChatClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    static final KProperty<Object>[] $$delegatedProperties = {new PropertyReference0Impl(OgvShareMenuChatService.class, "v", "<v#0>", 0), new PropertyReference0Impl(OgvShareMenuChatService.class, "v", "<v#1>", 0)};
    final long $epId;
    final long $seasonId;
    final int $seasonTypeValue;
    private Object L$0;
    int label;
    final OgvShareMenuChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvShareMenuChatService$onChatClick$1(long j7, long j8, int i7, OgvShareMenuChatService ogvShareMenuChatService, Continuation<? super OgvShareMenuChatService$onChatClick$1> continuation) {
        super(2, continuation);
        this.$seasonId = j7;
        this.$epId = j8;
        this.$seasonTypeValue = i7;
        this.this$0 = ogvShareMenuChatService;
    }

    private static final int invokeSuspend$lambda$0$0(ReadWriteProperty<Object, Integer> readWriteProperty) {
        return ((Number) readWriteProperty.getValue((Object) null, $$delegatedProperties[0])).intValue();
    }

    private static final String invokeSuspend$lambda$1$0(ReadWriteProperty<Object, String> readWriteProperty) {
        return (String) readWriteProperty.getValue((Object) null, $$delegatedProperties[1]);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvShareMenuChatService$onChatClick$1 ogvShareMenuChatService$onChatClick$1 = new OgvShareMenuChatService$onChatClick$1(this.$seasonId, this.$epId, this.$seasonTypeValue, this.this$0, continuation);
        ogvShareMenuChatService$onChatClick$1.L$0 = obj;
        return ogvShareMenuChatService$onChatClick$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        String queryParameter;
        String queryParameter2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomApi chatRoomApi = (ChatRoomApi) ServiceGenerator.createService(ChatRoomApi.class);
            long j7 = this.$seasonId;
            long j8 = this.$epId;
            int i8 = this.$seasonTypeValue;
            long jMid = this.this$0.f91331f.mid();
            SharedPreferences sharedPreferences = w.f94906a;
            int iInvokeSuspend$lambda$0$0 = invokeSuspend$lambda$0$0(new Cj0.c(0, sharedPreferences, C3751q.a(jMid, "togetherwatch_authorize_dialog_agetype")));
            String strInvokeSuspend$lambda$1$0 = invokeSuspend$lambda$1$0(Cj0.f.e(sharedPreferences, "togetherwatch_authorize_dialog_version" + this.this$0.f91331f.mid()));
            this.label = 1;
            Object objRequestShareOgvLink = chatRoomApi.requestShareOgvLink(j7, j8, i8, iInvokeSuspend$lambda$0$0, strInvokeSuspend$lambda$1$0, this);
            obj = objRequestShareOgvLink;
            if (objRequestShareOgvLink == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        OgvShareMenuChatService ogvShareMenuChatService = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            ToastHelper.showToastShort(ogvShareMenuChatService.f91329d, ((BiliApiResponse.BusinessFailure) biliApiResponse).getMessage());
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            Context context = ogvShareMenuChatService.f91329d;
            ToastHelper.showToastShort(context, context.getString(2131851623));
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            FreyaShare freyaShare = (FreyaShare) ((BiliApiResponse.Success) biliApiResponse).getData();
            Uri uri = Uri.parse(freyaShare.f91226a);
            String queryParameter3 = uri.getQueryParameter("need_page");
            String queryParameter4 = uri.getQueryParameter("need_open_share");
            if (Intrinsics.areEqual(queryParameter3, "1")) {
                RouteRequest.Builder builder = new RouteRequest.Builder(freyaShare.f91226a);
                Qj0.g.b(builder, "from_spmid", ogvShareMenuChatService.f91330e.a().f123880b);
                BLRouter.routeTo$default(builder.build(), (Context) null, 2, (Object) null);
            } else {
                String queryParameter5 = uri.getQueryParameter("seasonId");
                if (queryParameter5 != null && (queryParameter = uri.getQueryParameter("episodeId")) != null && (queryParameter2 = uri.getQueryParameter("type")) != null) {
                    String queryParameter6 = uri.getQueryParameter("from_page");
                    long j9 = Long.parseLong(queryParameter5);
                    long j10 = Long.parseLong(queryParameter);
                    int i9 = Integer.parseInt(queryParameter2);
                    String strValueOf = String.valueOf(queryParameter6);
                    boolean zAreEqual = Intrinsics.areEqual(queryParameter4, "1");
                    this.label = 2;
                    if (OgvShareMenuChatService.a(ogvShareMenuChatService, j9, j10, i9, strValueOf, zAreEqual, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}

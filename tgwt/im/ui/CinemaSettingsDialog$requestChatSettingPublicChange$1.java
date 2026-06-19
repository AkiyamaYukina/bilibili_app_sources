package com.bilibili.tgwt.im.ui;

import HD0.A;
import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/CinemaSettingsDialog$requestChatSettingPublicChange$1.class */
final class CinemaSettingsDialog$requestChatSettingPublicChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $requestOpen;
    int label;
    final CinemaSettingsDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CinemaSettingsDialog$requestChatSettingPublicChange$1(CinemaSettingsDialog cinemaSettingsDialog, boolean z6, Continuation<? super CinemaSettingsDialog$requestChatSettingPublicChange$1> continuation) {
        super(2, continuation);
        this.this$0 = cinemaSettingsDialog;
        this.$requestOpen = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CinemaSettingsDialog$requestChatSettingPublicChange$1(this.this$0, this.$requestOpen, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.app.Dialog, com.bilibili.tgwt.im.ui.CinemaSettingsDialog] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        ChatRoomInfo chatRoomInfo;
        A a7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CinemaSettingsDialog cinemaSettingsDialog = this.this$0;
            ChatRoomOperationService chatRoomOperationService = cinemaSettingsDialog.f111242k;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = cinemaSettingsDialog.f111244m;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            BangumiUniformSeason season = togetherWatchDetailPageViewModel2.getSeasonService().getSeason();
            long jT = (season == null || (chatRoomInfo = season.E) == null) ? 0L : chatRoomInfo.t();
            boolean z6 = this.$requestOpen;
            this.label = 1;
            Object objModifyRoomInfo = chatRoomOperationService.modifyRoomInfo(jT, z6 ? 1 : 0, this);
            obj = objModifyRoomInfo;
            if (objModifyRoomInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        ?? r02 = this.this$0;
        boolean z7 = this.$requestOpen;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            Context context = r02.getContext();
            String message = biliApiException.getMessage();
            ToastHelper.showToastShort(context, message != null ? message : "");
            a7 = r02.f111245n;
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                r02.f111245n.f8163g.set(z7);
                return Unit.INSTANCE;
            }
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            Context context2 = r02.getContext();
            String message2 = exception.getMessage();
            ToastHelper.showToastShort(context2, message2 != null ? message2 : "");
            a7 = r02.f111245n;
        }
        a7.f8163g.set(!z7);
        return Unit.INSTANCE;
    }
}

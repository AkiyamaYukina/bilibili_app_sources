package com.bilibili.tgwt.match.ui;

import android.content.DialogInterface;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bilibili.api.BiliApiException;
import com.bilibili.bangumi.module.chatroom.TogetherWatchAuthorizeInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1.class */
final class TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $listener;
    int label;
    final TogetherWatchMatchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(TogetherWatchMatchFragment togetherWatchMatchFragment, Function0<Unit> function0, Continuation<? super TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchMatchFragment;
        this.$listener = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$0(TogetherWatchAuthorizeInfo togetherWatchAuthorizeInfo, TogetherWatchMatchFragment togetherWatchMatchFragment, Function0 function0, DialogInterface dialogInterface) throws Throwable {
        String str = togetherWatchAuthorizeInfo.a;
        Lazy lazy = Nl0.i.f17294a;
        BiliAccounts biliAccounts = com.bilibili.ogv.infra.account.a.f67852b;
        Nl0.i.c("togetherwatch_authorize_dialog_version" + biliAccounts.mid(), str);
        Nl0.i.c(C3751q.a(biliAccounts.mid(), "togetherwatch_authorize_dialog_agetype"), Integer.valueOf(togetherWatchAuthorizeInfo.a()));
        if (togetherWatchMatchFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            function0.invoke();
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1(this.this$0, this.$listener, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111479c;
            Lazy lazy = Nl0.i.f17294a;
            BiliAccounts biliAccounts = com.bilibili.ogv.infra.account.a.f67852b;
            int iIntValue = ((Number) Nl0.i.a(C3751q.a(biliAccounts.mid(), "togetherwatch_authorize_dialog_agetype"), 0)).intValue();
            String str = (String) Nl0.i.a("togetherwatch_authorize_dialog_version" + biliAccounts.mid(), "");
            this.label = 1;
            Object objRequestTogetherWatchAuthorize = chatRoomOperationService.requestTogetherWatchAuthorize(iIntValue, str, this);
            obj = objRequestTogetherWatchAuthorize;
            if (objRequestTogetherWatchAuthorize == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        final TogetherWatchMatchFragment togetherWatchMatchFragment = this.this$0;
        final Function0<Unit> function0 = this.$listener;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                final TogetherWatchAuthorizeInfo togetherWatchAuthorizeInfo = (TogetherWatchAuthorizeInfo) ((BiliApiResponse.Success) biliApiResponse).getData();
                if (togetherWatchAuthorizeInfo.f()) {
                    FragmentActivity fragmentActivityP3 = togetherWatchMatchFragment.p3();
                    if (fragmentActivityP3 != null) {
                        fragmentActivityP3.setRequestedOrientation(1);
                    }
                    TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog = new TogetherWatchAuthorizeDialog(togetherWatchMatchFragment.requireContext(), togetherWatchAuthorizeInfo);
                    togetherWatchMatchFragment.f111494s = togetherWatchAuthorizeDialog;
                    togetherWatchAuthorizeDialog.setOnDismissListener(new DialogInterface.OnDismissListener(togetherWatchAuthorizeInfo, togetherWatchMatchFragment, function0) { // from class: com.bilibili.tgwt.match.ui.l

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final TogetherWatchAuthorizeInfo f111516a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final TogetherWatchMatchFragment f111517b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Function0 f111518c;

                        {
                            this.f111516a = togetherWatchAuthorizeInfo;
                            this.f111517b = togetherWatchMatchFragment;
                            this.f111518c = function0;
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
                            TogetherWatchMatchFragment$requestTogetherWatchAuthorize$1.invokeSuspend$lambda$0$0(this.f111516a, this.f111517b, this.f111518c, dialogInterface);
                        }
                    });
                    TogetherWatchAuthorizeDialog togetherWatchAuthorizeDialog2 = togetherWatchMatchFragment.f111494s;
                    if (togetherWatchAuthorizeDialog2 != null) {
                        togetherWatchAuthorizeDialog2.show();
                    }
                } else {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}

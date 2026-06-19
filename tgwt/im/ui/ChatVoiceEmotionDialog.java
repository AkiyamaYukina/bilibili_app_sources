package com.bilibili.tgwt.im.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.authorspace.ui.J1;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.router.BiligameRouterHelper;
import com.bilibili.biligame.router.BiligameRouterHelperV2Kt;
import com.bilibili.biligame.ui.home.bean.BiligameHomeBanner;
import com.bilibili.biligame.ui.home.bean.GameHomeItem;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.fasthybrid.biz.debug.h0;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.service.ChatService;
import gs.K;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatVoiceEmotionDialog.class */
@StabilityInferred(parameters = 0)
public final class ChatVoiceEmotionDialog extends ComponentDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChatService f111239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ED0.l f111240b;

    /* JADX INFO: renamed from: com.bilibili.tgwt.im.ui.ChatVoiceEmotionDialog$onCreate$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatVoiceEmotionDialog$onCreate$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChatVoiceEmotionDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChatVoiceEmotionDialog chatVoiceEmotionDialog, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chatVoiceEmotionDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            ChatRoomInfo chatRoomInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChatService chatService = this.this$0.f111239a;
                this.label = 1;
                BangumiUniformSeason season = chatService.f111882c.getSeason();
                Object emoteList = chatService.f111869R.getEmoteList((season == null || (chatRoomInfo = season.E) == null) ? 0L : chatRoomInfo.e(), 0, this);
                obj = emoteList;
                if (emoteList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            ChatVoiceEmotionDialog chatVoiceEmotionDialog = this.this$0;
            if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                    if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chatVoiceEmotionDialog.f111240b.f3952c.setValue((List) ((BiliApiResponse.Success) biliApiResponse).getData());
                    return Unit.INSTANCE;
                }
                ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            }
            chatVoiceEmotionDialog.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Inject
    public ChatVoiceEmotionDialog(@NotNull Context context, @NotNull ChatService chatService) {
        super(context, 0, 2, null);
        this.f111239a = chatService;
        this.f111240b = new ED0.l(new BS0.e(this, 8), new Function2(this) { // from class: com.bilibili.tgwt.im.ui.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatVoiceEmotionDialog f111301a;

            {
                this.f111301a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ChatVoiceEmotionDialog chatVoiceEmotionDialog = this.f111301a;
                Neurons.reportClick(false, "pgc.watch-together-cinema-voice.expression.0.click", chatVoiceEmotionDialog.f111239a.c(MapsKt.mapOf(TuplesKt.to("expression_id", String.valueOf(iIntValue2)))));
                chatVoiceEmotionDialog.dismiss();
                chatVoiceEmotionDialog.f111239a.k(iIntValue);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParamsA = J1.a(window, 0);
            layoutParamsA.width = -1;
            layoutParamsA.height = Uj0.c.b(220, window.getContext());
            layoutParamsA.gravity = 80;
            window.setDimAmount(0.5f);
            window.setAttributes(layoutParamsA);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        Neurons.reportExposure$default(false, "pgc.watch-together-cinema-voice.expression.0.show", this.f111239a.f111870S, (List) null, 8, (Object) null);
        ComposeView composeView = new ComposeView(getContext(), null, 0, 6, null);
        final int i7 = 0;
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2031104530, true, new Function2(this, i7) { // from class: com.bilibili.tgwt.im.ui.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f111299a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f111300b;

            {
                this.f111299a = i7;
                this.f111300b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f111299a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2031104530, iIntValue, -1, "com.bilibili.tgwt.im.ui.ChatVoiceEmotionDialog.onCreate.<anonymous> (ChatVoiceEmotionDialogFragment.kt:71)");
                            }
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-559772362, true, new h0((ChatVoiceEmotionDialog) this.f111300b, 1), composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        BiligameHomeBanner biligameHomeBanner = (BiligameHomeBanner) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        K k7 = (K) this.f111300b;
                        GameHomeItem gameHomeItem = k7.q;
                        if (gameHomeItem != null) {
                            ReporterV3.reportClick("game-ball.home-selected-page.new-feeds-cards.all.click", k7.v0(iIntValue2, gameHomeItem, biligameHomeBanner));
                        }
                        if (biligameHomeBanner.type == 0) {
                            BiligameRouterHelperV2Kt.handleGameDetail$default(k7.itemView.getContext(), biligameHomeBanner.getGameInfo(), 66003, false, 0, false, false, MapsKt.mapOf(new Pair[]{TuplesKt.to("from_page", "home-selected-page"), TuplesKt.to("from_module", "Banner")}), k7.getTranslationParams(), "home-selected-page", 120, (Object) null);
                        } else {
                            BiligameRouterHelper.openUrl(k7.itemView.getContext(), biligameHomeBanner.activityUrl);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        setContentView(composeView);
    }
}

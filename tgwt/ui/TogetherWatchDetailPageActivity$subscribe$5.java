package com.bilibili.tgwt.ui;

import android.view.View;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.datawrapper.ContinuingType;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$subscribe$5.class */
final class TogetherWatchDetailPageActivity$subscribe$5 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchDetailPageActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchDetailPageActivity$subscribe$5(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super TogetherWatchDetailPageActivity$subscribe$5> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchDetailPageActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, View view) {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = togetherWatchDetailPageActivity.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        NewSeasonService.loadSeason$default(togetherWatchDetailPageViewModel2.getSeasonService(), (Consumer) null, 1, (Object) null);
        togetherWatchDetailPageActivity.Q6(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, View view) {
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = togetherWatchDetailPageActivity.f112214D;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        NewSeasonService.loadSeason$default(togetherWatchDetailPageViewModel2.getSeasonService(), (Consumer) null, 1, (Object) null);
        togetherWatchDetailPageActivity.Q6(false);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchDetailPageActivity$subscribe$5 togetherWatchDetailPageActivity$subscribe$5 = new TogetherWatchDetailPageActivity$subscribe$5(this.this$0, continuation);
        togetherWatchDetailPageActivity$subscribe$5.L$0 = obj;
        return togetherWatchDetailPageActivity$subscribe$5;
    }

    public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
        return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
        if (bangumiUniformSeason != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            togetherWatchDetailPageViewModel2.getPopFragmentService().hideAllFragment();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a screenStateHelper = togetherWatchDetailPageViewModel4.getScreenStateService().getScreenStateHelper();
            screenStateHelper.getClass();
            screenStateHelper.f.a(screenStateHelper, com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a.n[4], Boolean.FALSE);
            this.this$0.getIntent().putExtra("season_id", String.valueOf(bangumiUniformSeason.a));
            this.this$0.findViewById(2131308595).setVisibility(8);
            this.this$0.findViewById(2131308994).setVisibility(8);
            if (bangumiUniformSeason.a() != null) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.this$0.f112214D;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
                if (togetherWatchDetailPageViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel6 = null;
                }
                togetherWatchDetailPageViewModel6.getScreenStateService().getScreenStateHelper().h();
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.this$0.f112214D;
                if (togetherWatchDetailPageViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel7 = null;
                }
                togetherWatchDetailPageViewModel7.getPlayControlService().stop();
            } else {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = this.this$0.f112214D;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = togetherWatchDetailPageViewModel8;
                if (togetherWatchDetailPageViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel9 = null;
                }
                BangumiUniformEpisode firstPlayEpisode = togetherWatchDetailPageViewModel9.getPlayHistoryService().getFirstPlayEpisode();
                if (firstPlayEpisode != null) {
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel10 = this.this$0.f112214D;
                    if (togetherWatchDetailPageViewModel10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        togetherWatchDetailPageViewModel10 = null;
                    }
                    Boxing.boxBoolean(PlayControlService.switchEpisode$default(togetherWatchDetailPageViewModel10.getPlayControlService(), firstPlayEpisode.a(), (ContinuingType) null, 2, (Object) null));
                } else {
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel11 = this.this$0.f112214D;
                    if (togetherWatchDetailPageViewModel11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        togetherWatchDetailPageViewModel11 = null;
                    }
                    togetherWatchDetailPageViewModel11.getScreenStateService().getScreenStateHelper().h();
                }
            }
            this.this$0.setVolumeControlStream(3);
        } else {
            this.this$0.findViewById(2131308595).setVisibility(0);
            View viewFindViewById = this.this$0.findViewById(2131314945);
            final TogetherWatchDetailPageActivity togetherWatchDetailPageActivity = this.this$0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(togetherWatchDetailPageActivity) { // from class: com.bilibili.tgwt.ui.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TogetherWatchDetailPageActivity f112296a;

                {
                    this.f112296a = togetherWatchDetailPageActivity;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TogetherWatchDetailPageActivity$subscribe$5.invokeSuspend$lambda$0(this.f112296a, view);
                }
            });
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel12 = this.this$0.f112214D;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel13 = togetherWatchDetailPageViewModel12;
            if (togetherWatchDetailPageViewModel12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel13 = null;
            }
            int playerState = togetherWatchDetailPageViewModel13.getPlayerContainerService().getPlayerState();
            if (playerState < 1 || playerState == 7) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel14 = this.this$0.f112214D;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel15 = togetherWatchDetailPageViewModel14;
                if (togetherWatchDetailPageViewModel14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel15 = null;
                }
                togetherWatchDetailPageViewModel15.getScreenStateService().getScreenStateHelper().h();
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel16 = this.this$0.f112214D;
                if (togetherWatchDetailPageViewModel16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel16 = null;
                }
                com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a screenStateHelper2 = togetherWatchDetailPageViewModel16.getScreenStateService().getScreenStateHelper();
                screenStateHelper2.getClass();
                screenStateHelper2.f.a(screenStateHelper2, com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a.n[4], Boolean.TRUE);
                this.this$0.findViewById(2131308994).setVisibility(0);
                View viewFindViewById2 = this.this$0.findViewById(2131315009);
                final TogetherWatchDetailPageActivity togetherWatchDetailPageActivity2 = this.this$0;
                viewFindViewById2.setOnClickListener(new View.OnClickListener(togetherWatchDetailPageActivity2) { // from class: com.bilibili.tgwt.ui.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TogetherWatchDetailPageActivity f112297a;

                    {
                        this.f112297a = togetherWatchDetailPageActivity2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TogetherWatchDetailPageActivity$subscribe$5.invokeSuspend$lambda$1(this.f112297a, view);
                    }
                });
            }
            this.this$0.Q6(true);
        }
        return Unit.INSTANCE;
    }
}

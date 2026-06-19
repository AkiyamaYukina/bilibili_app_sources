package com.bilibili.biligame.business.pegasus.view;

import Co.A;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.business.pegasus.bean.GamePegasusNoticeBean;
import com.bilibili.biligame.business.pegasus.bean.PegasusConfigBean;
import com.bilibili.biligame.business.pegasus.config.PegasusDialogViewConfig;
import com.bilibili.biligame.report.ReportHelper;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.utils.BiliCallGameExsKt;
import com.bilibili.biligame.utils.GameImageExtensionsKt;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import com.bilibili.okretro.call.BiliCall;
import java.util.HashMap;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/GamePanelSmallGameDialogV2.class */
@StabilityInferred(parameters = 0)
public final class GamePanelSmallGameDialogV2 extends GameBasePanelDialog {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public GamePegasusNoticeBean.PanelMainGame f62726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public A f62727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BiliImageView f62728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f62729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f62730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f62731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f62732o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TintCheckBox f62733p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public PegasusConfigBean f62734q;

    /* JADX INFO: renamed from: com.bilibili.biligame.business.pegasus.view.GamePanelSmallGameDialogV2$onCreate$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/GamePanelSmallGameDialogV2$onCreate$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final GamePanelSmallGameDialogV2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(GamePanelSmallGameDialogV2 gamePanelSmallGameDialogV2, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = gamePanelSmallGameDialogV2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BiliCall<BiligameApiResponse<JSONObject>> biliCallNoticeGameReport = this.this$0.getApiService().noticeGameReport(this.this$0.f62726i.getNoticeId());
                    this.label = 1;
                    if (BiliCallGameExsKt.gameAwait(biliCallNoticeGameReport, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final HashMap<String, String> c() {
        return MapsKt.hashMapOf(new Pair[]{TuplesKt.to("sourcefrom", this.f62726i.sourceFrom), TuplesKt.to("game_base_id", String.valueOf(this.f62726i.gameBaseId)), TuplesKt.to("game_name", this.f62726i.gameName), TuplesKt.to("ab_group", this.f62726i.getAbTestGroup()), TuplesKt.to("notice_id", this.f62726i.getNoticeId())});
    }

    @Override // com.bilibili.biligame.business.pegasus.view.GameBasePanelDialog
    public final long getShowDuration() {
        return PegasusDialogViewConfig.c() != null ? r0.getDialogDuration() : 8000;
    }

    @Override // android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131496810);
        this.f62732o = (TextView) findViewById(2131315395);
        this.f62733p = (TintCheckBox) findViewById(2131298552);
        findViewById(2131302903).setOnClickListener(new XC0.i(this, 1));
        this.f62728k = findViewById(2131302505);
        this.f62729l = (TextView) findViewById(2131314603);
        this.f62730m = (TextView) findViewById(2131315249);
        this.f62731n = (TextView) findViewById(2131314712);
        findViewById(2131311199).setOnClickListener(new Yn.m(this));
        TintCheckBox tintCheckBox = this.f62733p;
        if (tintCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cbRemindDay");
            tintCheckBox = null;
        }
        tintCheckBox.setOnClickListener(new Sr0.a(this, 4));
        this.f62734q = PegasusDialogViewConfig.c();
        BiliImageView biliImageView = this.f62728k;
        if (biliImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconIv");
            biliImageView = null;
        }
        GameImageExtensionsKt.displayGameImage(biliImageView, this.f62726i.icon);
        TextView textView = this.f62729l;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameTitle");
            textView = null;
        }
        textView.setText(this.f62726i.gameName);
        PegasusConfigBean pegasusConfigBean = this.f62734q;
        if (pegasusConfigBean != null) {
            TextView textView2 = this.f62732o;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitleHint");
                textView2 = null;
            }
            String title = pegasusConfigBean.getTitle();
            if (title == null) {
                title = getContext().getString(2131838738);
            }
            textView2.setText(title);
            String str = this.f62726i.summary;
            if (str == null || str.length() == 0) {
                TextView textView3 = this.f62730m;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitle");
                    textView3 = null;
                }
                String subtitleText = pegasusConfigBean.getSubtitleText();
                if (subtitleText == null) {
                    subtitleText = getContext().getString(2131838739);
                }
                textView3.setText(subtitleText);
            } else {
                TextView textView4 = this.f62730m;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitle");
                    textView4 = null;
                }
                textView4.setText(this.f62726i.summary);
            }
            TextView textView5 = this.f62731n;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("installBtn");
                textView5 = null;
            }
            String buttonTextOne = pegasusConfigBean.getButtonTextOne();
            if (buttonTextOne == null) {
                buttonTextOne = getContext().getString(2131838737);
            }
            textView5.setText(buttonTextOne);
        } else {
            TextView textView6 = this.f62732o;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvTitleHint");
                textView6 = null;
            }
            textView6.setText(getContext().getString(2131838738));
            TextView textView7 = this.f62731n;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("installBtn");
                textView7 = null;
            }
            textView7.setText(getContext().getString(2131838737));
            String str2 = this.f62726i.summary;
            if (str2 == null || str2.length() == 0) {
                TextView textView8 = this.f62730m;
                if (textView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitle");
                    textView8 = null;
                }
                textView8.setText(getContext().getString(2131838739));
            } else {
                TextView textView9 = this.f62730m;
                if (textView9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subTitle");
                    textView9 = null;
                }
                textView9.setText(this.f62726i.summary);
            }
        }
        setOnDismissListener(new DialogInterface.OnDismissListener(this) { // from class: com.bilibili.biligame.business.pegasus.view.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final GamePanelSmallGameDialogV2 f62786a;

            {
                this.f62786a = this;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                GamePanelSmallGameDialogV2 gamePanelSmallGameDialogV2 = this.f62786a;
                TintCheckBox tintCheckBox2 = gamePanelSmallGameDialogV2.f62733p;
                if (tintCheckBox2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cbRemindDay");
                    tintCheckBox2 = null;
                }
                if (tintCheckBox2.isChecked()) {
                    Tc.j.a(BLKV.getBLSharedPreferences$default(gamePanelSmallGameDialogV2.getContext(), "biligame_install_panel", true, 0, 4, (Object) null).edit(), "smallgame_not_remind_recent");
                }
                A a7 = gamePanelSmallGameDialogV2.f62727j;
                if (a7 != null) {
                    a7.invoke();
                }
            }
        });
        ReportHelper.getHelperInstance(getContext()).setSourceFrom(this.f62726i.sourceFrom);
        ReporterV3.reportExposure("game-ball.mini-game.retention-popup.0.show", c());
        BuildersKt.launch$default(getDialogScope(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }
}

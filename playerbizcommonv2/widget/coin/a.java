package com.bilibili.playerbizcommonv2.widget.coin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import bolts.CancellationTokenSource;
import bolts.Task;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.riskcontrol.ActionValidateHelper;
import com.bilibili.playerbizcommon.view.FixedDrawableTextView;
import com.bilibili.playerbizcommonv2.delegate.IDelegateStoreService;
import com.bilibili.pvtracker.PageViewTracker;
import dq0.d;
import java.lang.ref.WeakReference;
import java.util.Random;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qb.g;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AbsFunctionWidget implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Button f82413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextView f82414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f82415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FixedDrawableTextView f82416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public FixedDrawableTextView f82417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CheckBox f82418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f82419g;

    @Nullable
    public b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final dq0.d f82420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CancellationTokenSource f82421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private IDelegateStoreService f82422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private IRenderContainerService f82423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f82424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InjectPlayerService
    private IInteractLayerService f82425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InjectPlayerService
    private IActivityStateService f82426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerSettingService f82427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f82428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @InjectPlayerService
    private IToastService f82429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f82430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f82431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f82432u;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.coin.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C0540a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f82433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b f82434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f82435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f82436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f82437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f82438f;

        public C0540a(boolean z6, @Nullable b bVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f82433a = z6;
            this.f82434b = bVar;
            this.f82435c = str;
            this.f82436d = str2;
            this.f82437e = str3;
            this.f82438f = str4;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/a$b.class */
    public interface b {
        void a(int i7, boolean z6);
    }

    public a(@NotNull Context context) {
        super(context);
        this.f82420i = (dq0.d) BLRouter.INSTANCE.get(dq0.d.class, "video_coin");
        this.f82421j = new CancellationTokenSource();
    }

    public static final void h(a aVar, String str) {
        aVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        PlayerToast playerToastBuild = g.a(33, 17, "extra_title", str).duration(PayTask.f60018j).build();
        IToastService iToastService = aVar.f82429r;
        IToastService iToastService2 = iToastService;
        if (iToastService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mToastService");
            iToastService2 = null;
        }
        iToastService2.showToast(playerToastBuild);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496489, (ViewGroup) null);
        this.f82413a = (Button) viewInflate.findViewById(2131308711);
        this.f82414b = (TextView) viewInflate.findViewById(2131313764);
        this.f82415c = (TextView) viewInflate.findViewById(2131298998);
        this.f82418f = (CheckBox) viewInflate.findViewById(2131305015);
        this.f82416d = (FixedDrawableTextView) viewInflate.findViewById(2131308713);
        this.f82417e = (FixedDrawableTextView) viewInflate.findViewById(2131308714);
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.changeOrientationDisableWhenShow(true);
        builder.persistent(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PayCoinFunctionWidget";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        dq0.d dVar;
        if (view != this.f82413a) {
            FixedDrawableTextView fixedDrawableTextView = this.f82416d;
            if (view == fixedDrawableTextView) {
                if (fixedDrawableTextView != null) {
                    fixedDrawableTextView.setSelected(true);
                }
                FixedDrawableTextView fixedDrawableTextView2 = this.f82417e;
                if (fixedDrawableTextView2 != null) {
                    fixedDrawableTextView2.setSelected(false);
                    return;
                }
                return;
            }
            if (view == this.f82417e) {
                if (fixedDrawableTextView != null) {
                    fixedDrawableTextView.setSelected(false);
                }
                FixedDrawableTextView fixedDrawableTextView3 = this.f82417e;
                if (fixedDrawableTextView3 != null) {
                    fixedDrawableTextView3.setSelected(true);
                    return;
                }
                return;
            }
            if (view == this.f82415c) {
                BLRouter.routeTo(RouteRequestKt.toRouteRequest("https://www.bilibili.com/blackboard/help.html#/?qid=da118395f95348bca6a5ee6fa7bcf8e8"), ((TextView) view).getContext());
                return;
            }
            if (view == this.f82418f) {
                boolean zIsChecked = ((CheckBox) view).isChecked();
                IPlayerSettingService iPlayerSettingService = this.f82427p;
                if (iPlayerSettingService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerSettingService");
                    iPlayerSettingService = null;
                }
                iPlayerSettingService.putBoolean("pref_key_paycoin_is_sync_like", zIsChecked);
                return;
            }
            return;
        }
        FixedDrawableTextView fixedDrawableTextView4 = this.f82417e;
        int i7 = (fixedDrawableTextView4 == null || !fixedDrawableTextView4.isSelected()) ? 1 : 2;
        IReporterService iReporterService = this.f82432u;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReporterService");
            iReporterService2 = null;
        }
        CheckBox checkBox = this.f82418f;
        iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.player-coins.0.player", new String[]{"coins_counts", String.valueOf(i7), "check", (checkBox == null || !checkBox.isChecked()) ? "2" : "1"}));
        if (BiliAccounts.get(getMContext()).isLogin()) {
            IPlayDirector iPlayDirector = this.f82428q;
            IPlayDirector iPlayDirector2 = iPlayDirector;
            if (iPlayDirector == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayDirector");
                iPlayDirector2 = null;
            }
            Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
            if (currentPlayableParams != null) {
                long avid = currentPlayableParams.getDisplayParams().getAvid();
                CheckBox checkBox2 = this.f82418f;
                d.b bVar = new d.b(avid, i7, 1, currentPlayableParams.getFrom(), (checkBox2 == null || !checkBox2.isChecked()) ? 0 : 1, null, currentPlayableParams.getFromSpmid(), currentPlayableParams.getSpmid(), null, null, ActionValidateHelper.ACTION_VALIDATE_SOURCE, null, PageViewTracker.getInstance().currentPolarisActionId());
                c cVar = new c(this, i7);
                FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getMContext());
                if (fragmentActivityFindFragmentActivityOrNull != null && (dVar = this.f82420i) != null) {
                    dVar.b(new WeakReference(fragmentActivityFindFragmentActivityOrNull), bVar, cVar);
                }
            }
        }
        AbsFunctionWidgetService absFunctionWidgetService = this.f82430s;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFunctionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(getToken());
    }

    public final void onRelease() {
        this.h = null;
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        CheckBox checkBox = this.f82418f;
        if (checkBox != null) {
            checkBox.setOnClickListener(null);
        }
        TextView textView = this.f82415c;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        Button button = this.f82413a;
        if (button != null) {
            button.setOnClickListener(null);
        }
        FixedDrawableTextView fixedDrawableTextView = this.f82416d;
        if (fixedDrawableTextView != null) {
            fixedDrawableTextView.setOnClickListener(null);
        }
        FixedDrawableTextView fixedDrawableTextView2 = this.f82417e;
        if (fixedDrawableTextView2 != null) {
            fixedDrawableTextView2.setOnClickListener(null);
        }
        this.f82421j.cancel();
    }

    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.concurrent.Callable] */
    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        String str;
        String str2;
        String str3;
        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
        super.onWidgetShow(configuration);
        if (configuration instanceof C0540a) {
            C0540a c0540a = (C0540a) configuration;
            this.f82419g = c0540a.f82433a;
            this.h = c0540a.f82434b;
            Drawable drawable = getMContext().getResources().getDrawable(2131239302);
            Drawable drawable2 = getMContext().getResources().getDrawable(2131239303);
            FixedDrawableTextView fixedDrawableTextView = this.f82416d;
            if (fixedDrawableTextView != null) {
                fixedDrawableTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
            }
            FixedDrawableTextView fixedDrawableTextView2 = this.f82417e;
            if (fixedDrawableTextView2 != null) {
                fixedDrawableTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, (Drawable) null);
            }
            String str4 = c0540a.f82435c;
            if (str4 != null && (str = c0540a.f82437e) != null && (str2 = c0540a.f82436d) != null && (str3 = c0540a.f82438f) != null && (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getMContext())) != null) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull), (CoroutineContext) null, (CoroutineStart) null, new PayCoinFunctionWidget$updateCoinDrawable$1(this, str4, str2, str, str3, null), 3, (Object) null);
            }
        }
        IPlayDirector iPlayDirector = this.f82428q;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayDirector");
            iPlayDirector2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
        if ((currentPlayableParams != null ? currentPlayableParams.getDisplayParams() : null) != null) {
            if (this.f82416d != null) {
                if (new Random().nextInt(1000) == 233) {
                    FixedDrawableTextView fixedDrawableTextView3 = this.f82416d;
                    if (fixedDrawableTextView3 != null) {
                        fixedDrawableTextView3.setText(2131847227);
                    }
                } else {
                    FixedDrawableTextView fixedDrawableTextView4 = this.f82416d;
                    if (fixedDrawableTextView4 != null) {
                        fixedDrawableTextView4.setText(2131845829);
                    }
                }
            }
            FixedDrawableTextView fixedDrawableTextView5 = this.f82417e;
            if (fixedDrawableTextView5 != null) {
                fixedDrawableTextView5.setText(2131847452);
            }
            if (this.f82419g) {
                FixedDrawableTextView fixedDrawableTextView6 = this.f82416d;
                if (fixedDrawableTextView6 != null) {
                    fixedDrawableTextView6.setVisibility(0);
                }
                FixedDrawableTextView fixedDrawableTextView7 = this.f82417e;
                if (fixedDrawableTextView7 != null) {
                    fixedDrawableTextView7.setVisibility(0);
                }
                FixedDrawableTextView fixedDrawableTextView8 = this.f82416d;
                if (fixedDrawableTextView8 != null) {
                    fixedDrawableTextView8.setSelected(false);
                }
                FixedDrawableTextView fixedDrawableTextView9 = this.f82417e;
                if (fixedDrawableTextView9 != null) {
                    fixedDrawableTextView9.setSelected(true);
                }
            } else {
                FixedDrawableTextView fixedDrawableTextView10 = this.f82416d;
                if (fixedDrawableTextView10 != null) {
                    fixedDrawableTextView10.setVisibility(0);
                }
                FixedDrawableTextView fixedDrawableTextView11 = this.f82417e;
                if (fixedDrawableTextView11 != null) {
                    fixedDrawableTextView11.setVisibility(8);
                }
                FixedDrawableTextView fixedDrawableTextView12 = this.f82416d;
                if (fixedDrawableTextView12 != null) {
                    fixedDrawableTextView12.setSelected(true);
                }
                FixedDrawableTextView fixedDrawableTextView13 = this.f82417e;
                if (fixedDrawableTextView13 != null) {
                    fixedDrawableTextView13.setSelected(false);
                }
            }
            CheckBox checkBox = this.f82418f;
            if (checkBox != null) {
                checkBox.setVisibility(0);
            }
            IPlayerSettingService iPlayerSettingService = this.f82427p;
            IPlayerSettingService iPlayerSettingService2 = iPlayerSettingService;
            if (iPlayerSettingService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerSettingService");
                iPlayerSettingService2 = null;
            }
            boolean z6 = iPlayerSettingService2.getBoolean("pref_key_paycoin_is_sync_like", true);
            CheckBox checkBox2 = this.f82418f;
            if (checkBox2 != null) {
                checkBox2.setChecked(z6);
            }
            AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
            String string = (accountInfoFromCache != null ? Float.valueOf(accountInfoFromCache.getCoins()) : 0).toString();
            IPlayerSettingService iPlayerSettingService3 = this.f82427p;
            if (iPlayerSettingService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerSettingService");
                iPlayerSettingService3 = null;
            }
            String string2 = iPlayerSettingService3.getPlayerParamsConfig().getTheme() == 3 ? getMContext().getString(2131857205, string) : getMContext().getString(2131857206, string);
            TextView textView = this.f82414b;
            if (textView != null) {
                textView.setText(HtmlCompat.fromHtml(string2, 0));
            }
            Task.callInBackground(new Object()).continueWith(new e(this), Task.UI_THREAD_EXECUTOR, this.f82421j.getToken());
        }
        CheckBox checkBox3 = this.f82418f;
        if (checkBox3 != null) {
            checkBox3.setOnClickListener(this);
        }
        TextView textView2 = this.f82415c;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        Button button = this.f82413a;
        if (button != null) {
            button.setOnClickListener(this);
        }
        FixedDrawableTextView fixedDrawableTextView14 = this.f82416d;
        if (fixedDrawableTextView14 != null) {
            fixedDrawableTextView14.setOnClickListener(this);
        }
        FixedDrawableTextView fixedDrawableTextView15 = this.f82417e;
        if (fixedDrawableTextView15 != null) {
            fixedDrawableTextView15.setOnClickListener(this);
        }
    }
}

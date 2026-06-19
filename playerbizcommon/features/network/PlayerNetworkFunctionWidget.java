package com.bilibili.playerbizcommon.features.network;

import I.E;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import bolts.Task;
import br0.AbstractC5149a;
import com.alipay.sdk.app.PayTask;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tf.TfProvider;
import com.bilibili.playerbizcommon.features.network.PlayerNetworkFunctionWidget;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.localization.Locale;
import kntr.base.localization.Localization;
import kntr.base.localization.q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.RenderSynchronizer;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget.class */
public final class PlayerNetworkFunctionWidget extends AbstractC5149a implements View.OnClickListener, VideoEnvironmentObserver {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String NORMAL_URL = "https://www.bilibili.com/blackboard/activity-new-freedata.html";
    public CheckBox h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextView f79845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public TextView f79846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f79847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ImageView f79848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f79849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f79850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f79851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.ServiceDescriptor<PlayerNetworkService> f79852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<PlayerNetworkService> f79853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f79854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f79855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public PanelType f79856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public ActivateState f79857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Lazy f79858v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$ActivateState.class */
    public static final class ActivateState {
        private static final EnumEntries $ENTRIES;
        private static final ActivateState[] $VALUES;
        public static final ActivateState UNKNOWN = new ActivateState("UNKNOWN", 0);
        public static final ActivateState START = new ActivateState("START", 1);
        public static final ActivateState END = new ActivateState("END", 2);

        private static final /* synthetic */ ActivateState[] $values() {
            return new ActivateState[]{UNKNOWN, START, END};
        }

        static {
            ActivateState[] activateStateArr$values = $values();
            $VALUES = activateStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(activateStateArr$values);
        }

        private ActivateState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ActivateState> getEntries() {
            return $ENTRIES;
        }

        public static ActivateState valueOf(String str) {
            return (ActivateState) Enum.valueOf(ActivateState.class, str);
        }

        public static ActivateState[] values() {
            return (ActivateState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$Configuration.class */
    public static final class Configuration extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PanelCustomData f79859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final PanelType f79860b;

        public Configuration(@NotNull PanelCustomData panelCustomData, @NotNull PanelType panelType) {
            this.f79859a = panelCustomData;
            this.f79860b = panelType;
        }

        public /* synthetic */ Configuration(PanelCustomData panelCustomData, PanelType panelType, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(panelCustomData, (i7 & 2) != 0 ? PanelType.NORMAL : panelType);
        }

        @NotNull
        public final PanelCustomData getPanelData() {
            return this.f79859a;
        }

        @NotNull
        public final PanelType getType() {
            return this.f79860b;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$PanelCustomData.class */
    public static final class PanelCustomData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f79861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f79862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f79863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f79864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f79865e;

        public PanelCustomData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            this.f79861a = str;
            this.f79862b = str2;
            this.f79863c = str3;
            this.f79864d = str4;
            this.f79865e = str5;
        }

        public static /* synthetic */ PanelCustomData copy$default(PanelCustomData panelCustomData, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = panelCustomData.f79861a;
            }
            if ((i7 & 2) != 0) {
                str2 = panelCustomData.f79862b;
            }
            if ((i7 & 4) != 0) {
                str3 = panelCustomData.f79863c;
            }
            if ((i7 & 8) != 0) {
                str4 = panelCustomData.f79864d;
            }
            if ((i7 & 16) != 0) {
                str5 = panelCustomData.f79865e;
            }
            return panelCustomData.copy(str, str2, str3, str4, str5);
        }

        @NotNull
        public final String component1() {
            return this.f79861a;
        }

        @NotNull
        public final String component2() {
            return this.f79862b;
        }

        @NotNull
        public final String component3() {
            return this.f79863c;
        }

        @NotNull
        public final String component4() {
            return this.f79864d;
        }

        @NotNull
        public final String component5() {
            return this.f79865e;
        }

        @NotNull
        public final PanelCustomData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            return new PanelCustomData(str, str2, str3, str4, str5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PanelCustomData)) {
                return false;
            }
            PanelCustomData panelCustomData = (PanelCustomData) obj;
            return Intrinsics.areEqual(this.f79861a, panelCustomData.f79861a) && Intrinsics.areEqual(this.f79862b, panelCustomData.f79862b) && Intrinsics.areEqual(this.f79863c, panelCustomData.f79863c) && Intrinsics.areEqual(this.f79864d, panelCustomData.f79864d) && Intrinsics.areEqual(this.f79865e, panelCustomData.f79865e);
        }

        @NotNull
        public final String getColor() {
            return this.f79864d;
        }

        @NotNull
        public final String getImg() {
            return this.f79861a;
        }

        @NotNull
        public final String getLink() {
            return this.f79862b;
        }

        @NotNull
        public final String getMain() {
            return this.f79865e;
        }

        @NotNull
        public final String getText() {
            return this.f79863c;
        }

        public int hashCode() {
            return this.f79865e.hashCode() + E.a(E.a(E.a(this.f79861a.hashCode() * 31, 31, this.f79862b), 31, this.f79863c), 31, this.f79864d);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("PanelCustomData(img=");
            sb.append(this.f79861a);
            sb.append(", link=");
            sb.append(this.f79862b);
            sb.append(", text=");
            sb.append(this.f79863c);
            sb.append(", color=");
            sb.append(this.f79864d);
            sb.append(", main=");
            return C8770a.a(sb, this.f79865e, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$PanelType.class */
    public static final class PanelType {
        private static final EnumEntries $ENTRIES;
        private static final PanelType[] $VALUES;
        public static final PanelType NORMAL = new PanelType("NORMAL", 0);
        public static final PanelType SPECIAL = new PanelType("SPECIAL", 1);
        public static final PanelType ORDER_TRY = new PanelType("ORDER_TRY", 2);
        public static final PanelType ORDER_END = new PanelType("ORDER_END", 3);

        private static final /* synthetic */ PanelType[] $values() {
            return new PanelType[]{NORMAL, SPECIAL, ORDER_TRY, ORDER_END};
        }

        static {
            PanelType[] panelTypeArr$values = $values();
            $VALUES = panelTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(panelTypeArr$values);
        }

        private PanelType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<PanelType> getEntries() {
            return $ENTRIES;
        }

        public static PanelType valueOf(String str) {
            return (PanelType) Enum.valueOf(PanelType.class, str);
        }

        public static PanelType[] values() {
            return (PanelType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$b.class */
    public static final class b extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f79866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f79867b;

        public b() {
            this(false, false);
        }

        public b(boolean z6, boolean z7) {
            this.f79866a = z6;
            this.f79867b = z7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f79868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f79869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f79870c;

        static {
            int[] iArr = new int[ScreenModeType.values().length];
            try {
                iArr[ScreenModeType.LANDSCAPE_FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ScreenModeType.VERTICAL_FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ScreenModeType.THUMB.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f79868a = iArr;
            int[] iArr2 = new int[VideoEnvironment.values().length];
            try {
                iArr2[VideoEnvironment.WIFI_FREE.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[VideoEnvironment.FREE_DATA_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[VideoEnvironment.MOBILE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr2[VideoEnvironment.FREE_DATA_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[VideoEnvironment.THIRD_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr2[VideoEnvironment.DRM_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError e15) {
            }
            f79869b = iArr2;
            int[] iArr3 = new int[PanelType.values().length];
            try {
                iArr3[PanelType.SPECIAL.ordinal()] = 1;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr3[PanelType.ORDER_TRY.ordinal()] = 2;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr3[PanelType.ORDER_END.ordinal()] = 3;
            } catch (NoSuchFieldError e18) {
            }
            f79870c = iArr3;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkFunctionWidget$d.class */
    public static final class d implements mY.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerNetworkFunctionWidget f79871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f79872b;

        public d(PlayerNetworkFunctionWidget playerNetworkFunctionWidget, Context context) {
            this.f79871a = playerNetworkFunctionWidget;
            this.f79872b = context;
        }

        public final void onFailed() {
            final Context context = this.f79872b;
            final PlayerNetworkFunctionWidget playerNetworkFunctionWidget = this.f79871a;
            HandlerThreads.post(0, new Runnable(playerNetworkFunctionWidget, context, this) { // from class: com.bilibili.playerbizcommon.features.network.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerNetworkFunctionWidget f79908a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f79909b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final PlayerNetworkFunctionWidget.d f79910c;

                {
                    this.f79908a = playerNetworkFunctionWidget;
                    this.f79909b = context;
                    this.f79910c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PlayerNetworkFunctionWidget playerNetworkFunctionWidget2 = this.f79908a;
                    Context context2 = this.f79909b;
                    PlayerNetworkFunctionWidget.d dVar = this.f79910c;
                    playerNetworkFunctionWidget2.f79857u = PlayerNetworkFunctionWidget.ActivateState.END;
                    playerNetworkFunctionWidget2.h().getToastService().showToast(new PlayerToast.Builder().location(32).setExtraString("extra_title", context2.getString(2131845742)).toastItemType(17).duration(PayTask.f60018j).build());
                    PlayerNetworkFunctionWidget playerNetworkFunctionWidget3 = dVar.f79871a;
                    TextView textView = playerNetworkFunctionWidget3.f79847k;
                    if (textView != null) {
                        Context context3 = dVar.f79872b;
                        textView.setText(context3.getString(2131845721));
                        textView.setBackground(ContextCompat.getDrawable(context3, 2131240076));
                    }
                    playerNetworkFunctionWidget3.f79849m = PlayerNetworkFunctionWidget.NORMAL_URL;
                    playerNetworkFunctionWidget3.f79856t = PlayerNetworkFunctionWidget.PanelType.NORMAL;
                }
            });
        }

        public final void onSuccess() {
            final PlayerNetworkFunctionWidget playerNetworkFunctionWidget = this.f79871a;
            final int i7 = 0;
            HandlerThreads.post(0, new Runnable(playerNetworkFunctionWidget, i7) { // from class: com.bilibili.playerbizcommon.features.network.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f79911a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f79912b;

                {
                    this.f79911a = i7;
                    this.f79912b = playerNetworkFunctionWidget;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f79911a) {
                        case 0:
                            PlayerNetworkFunctionWidget playerNetworkFunctionWidget2 = (PlayerNetworkFunctionWidget) this.f79912b;
                            playerNetworkFunctionWidget2.f79857u = PlayerNetworkFunctionWidget.ActivateState.END;
                            PlayerNetworkService playerNetworkService = (PlayerNetworkService) playerNetworkFunctionWidget2.f79853q.getService();
                            if (playerNetworkService != null) {
                                playerNetworkService.refreshOnFreeDataActive();
                            }
                            break;
                        default:
                            RenderSynchronizer.c((RenderSynchronizer) this.f79912b);
                            break;
                    }
                }
            });
        }
    }

    public PlayerNetworkFunctionWidget(@NotNull final Context context) {
        super(context);
        this.f79849m = NORMAL_URL;
        this.f79850n = "";
        this.f79852p = PlayerServiceManager.ServiceDescriptor.Companion.obtain(PlayerNetworkService.class);
        this.f79853q = new PlayerServiceManager.Client<>();
        this.f79856t = PanelType.NORMAL;
        this.f79857u = ActivateState.UNKNOWN;
        this.f79858v = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0(this, context) { // from class: com.bilibili.playerbizcommon.features.network.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerNetworkFunctionWidget f79904a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f79905b;

            {
                this.f79904a = this;
                this.f79905b = context;
            }

            public final Object invoke() {
                return new PlayerNetworkFunctionWidget.d(this.f79904a, this.f79905b);
            }
        });
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        CheckBox checkBox = null;
        View viewInflate = layoutInflaterFrom.inflate(2131496468, (ViewGroup) null);
        this.f79845i = (TextView) viewInflate.findViewById(2131313373);
        this.f79846j = (TextView) viewInflate.findViewById(2131313424);
        this.f79847k = (TextView) viewInflate.findViewById(2131313426);
        this.h = (CheckBox) viewInflate.findViewById(2131313420);
        this.f79851o = (TextView) viewInflate.findViewById(2131313423);
        this.f79848l = (ImageView) viewInflate.findViewById(2131296853);
        this.f79845i.setOnClickListener(this);
        this.f79847k.setOnClickListener(this);
        this.f79848l.setOnClickListener(this);
        CheckBox checkBox2 = this.h;
        if (checkBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
        } else {
            checkBox = checkBox2;
        }
        checkBox.setOnClickListener(this);
        viewInflate.setOnClickListener(this);
        if (!q.c((Locale) Localization.INSTANCE.getLocaleFlow().getValue())) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            int iDp2px = (int) DpUtils.dp2px(constraintLayout.getContext(), 24.0f);
            int iDp2px2 = (int) DpUtils.dp2px(constraintLayout.getContext(), 12.0f);
            int iDp2px3 = (int) DpUtils.dp2px(constraintLayout.getContext(), 22.0f);
            int iDp2px4 = (int) DpUtils.dp2px(constraintLayout.getContext(), 30.0f);
            constraintSet.connect(2131313424, 4, 2131313426, 3);
            constraintSet.clear(2131313426);
            constraintSet.connect(2131313426, 3, 2131313424, 4, iDp2px3);
            constraintSet.connect(2131313426, 4, 2131313373, 3);
            constraintSet.connect(2131313426, 1, 0, 1, iDp2px);
            constraintSet.connect(2131313426, 2, 0, 2, iDp2px);
            constraintSet.constrainWidth(2131313426, 0);
            constraintSet.constrainHeight(2131313426, iDp2px4);
            constraintSet.clear(2131313373);
            constraintSet.connect(2131313373, 3, 2131313426, 4, iDp2px2);
            constraintSet.connect(2131313373, 4, 2131297914, 3);
            constraintSet.connect(2131313373, 1, 0, 1, iDp2px);
            constraintSet.connect(2131313373, 2, 0, 2, iDp2px);
            constraintSet.constrainWidth(2131313373, 0);
            constraintSet.constrainHeight(2131313373, iDp2px4);
            constraintSet.applyTo(constraintLayout);
        }
        return viewInflate;
    }

    @NotNull
    public tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    @NotNull
    public FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().dismissWhenScreenModeChange(false).dismissWhenActivityStop(false).changeOrientationDisableWhenShow(false).persistent(false).launchType(1).build();
    }

    @NotNull
    public String getTag() {
        return "PlayerNetworkFunctionWidget";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void i(ScreenModeType screenModeType) throws NoWhenBranchMatchedException {
        Context context = h().getContext();
        int i7 = c.f79868a[screenModeType.ordinal()];
        if (i7 == 1) {
            l(context, 208.0f, 44.0f, 16.0f, 50.0f);
            ImageView imageView = this.f79848l;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i7 == 2) {
            l(context, 142.0f, 30.0f, 14.0f, 25.0f);
            ImageView imageView2 = this.f79848l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
                return;
            }
            return;
        }
        if (i7 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        l(context, 142.0f, 30.0f, 14.0f, 25.0f);
        ImageView imageView3 = this.f79848l;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }

    public final Map<String, String> k() {
        String strValueOf;
        String str;
        HashMap map = new HashMap();
        CheckBox checkBox = this.h;
        CheckBox checkBox2 = checkBox;
        if (checkBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
            checkBox2 = null;
        }
        if (checkBox2.getVisibility() == 0) {
            strValueOf = String.valueOf(this.f79856t.ordinal() + 1);
            CheckBox checkBox3 = this.h;
            if (checkBox3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                checkBox3 = null;
            }
            str = checkBox3.isChecked() ? "1" : "0";
        } else {
            strValueOf = "";
            str = "";
        }
        map.put("type", strValueOf);
        map.put("remind_status", str);
        return map;
    }

    public final void l(Context context, float f7, float f8, float f9, float f10) {
        TextView textView = this.f79845i;
        ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = (int) DpUtils.dp2px(context, f7);
        }
        if (layoutParams != null) {
            layoutParams.height = (int) DpUtils.dp2px(context, f8);
        }
        TextView textView2 = this.f79845i;
        if (textView2 != null) {
            textView2.setPadding((int) DpUtils.dp2px(context, f10), 0, (int) DpUtils.dp2px(context, f10), 0);
        }
        TextView textView3 = this.f79845i;
        if (textView3 != null) {
            textView3.setTextSize(1, f9);
        }
        TextView textView4 = this.f79845i;
        if (textView4 != null) {
            textView4.setLayoutParams(layoutParams);
        }
        TextView textView5 = this.f79847k;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (textView5 != null) {
            layoutParams2 = textView5.getLayoutParams();
        }
        if (layoutParams2 != null) {
            layoutParams2.width = (int) DpUtils.dp2px(context, f7);
        }
        if (layoutParams2 != null) {
            layoutParams2.height = (int) DpUtils.dp2px(context, f8);
        }
        TextView textView6 = this.f79847k;
        if (textView6 != null) {
            textView6.setTextSize(1, f9);
        }
        TextView textView7 = this.f79847k;
        if (textView7 != null) {
            textView7.setLayoutParams(layoutParams2);
        }
    }

    public boolean onBackPressed() {
        INetworkAlertHandler networkAlertHandler;
        PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79853q.getService();
        return (playerNetworkService == null || (networkAlertHandler = playerNetworkService.getNetworkAlertHandler()) == null) ? false : networkAlertHandler.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        INetworkAlertHandler networkAlertHandler;
        INetworkAlertHandler networkAlertHandler2;
        INetworkAlertHandler networkAlertHandler3;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131296853) {
            Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view.getContext());
            if (activityFindActivityOrNull != null) {
                activityFindActivityOrNull.onBackPressed();
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131313373) {
            PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79853q.getService();
            if (playerNetworkService != null) {
                playerNetworkService.allowToContinuePlay();
            }
            PlayerNetworkService playerNetworkService2 = (PlayerNetworkService) this.f79853q.getService();
            if (playerNetworkService2 != null && (networkAlertHandler3 = playerNetworkService2.getNetworkAlertHandler()) != null) {
                networkAlertHandler3.onContinueToPlay();
            }
            CheckBox checkBox = this.h;
            CheckBox checkBox2 = checkBox;
            if (checkBox == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                checkBox2 = null;
            }
            if (checkBox2.getVisibility() == 0) {
                CheckBox checkBox3 = this.h;
                if (checkBox3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                    checkBox3 = null;
                }
                if (checkBox3.isChecked()) {
                    BiliGlobalPreferenceHelper.getBLKVSharedPreference(getMContext()).edit().putBoolean("pref_key_mobile_data_auto_play", true).apply();
                }
            }
            Neurons.reportClick(true, "player.player.network-layer-freeflow.1.click", k());
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2131313426) {
            if (numValueOf == null || numValueOf.intValue() != 2131313420) {
                PlayerNetworkService playerNetworkService3 = (PlayerNetworkService) this.f79853q.getService();
                if (playerNetworkService3 == null || (networkAlertHandler = playerNetworkService3.getNetworkAlertHandler()) == null) {
                    return;
                }
                networkAlertHandler.onPanelClick();
                return;
            }
            CheckBox checkBox4 = this.h;
            CheckBox checkBox5 = checkBox4;
            if (checkBox4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                checkBox5 = null;
            }
            Context mContext = getMContext();
            CheckBox checkBox6 = this.h;
            if (checkBox6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                checkBox6 = null;
            }
            checkBox5.setTextColor(ContextCompat.getColor(mContext, checkBox6.isChecked() ? 17170443 : 2131101466));
            return;
        }
        PlayerNetworkService playerNetworkService4 = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService4 != null) {
            playerNetworkService4.goToFreeData();
        }
        PlayerNetworkService playerNetworkService5 = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService5 != null && (networkAlertHandler2 = playerNetworkService5.getNetworkAlertHandler()) != null) {
            networkAlertHandler2.onGotoUnicom();
        }
        PlayerNetworkService playerNetworkService6 = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService6 != null) {
            playerNetworkService6.replayAfterFreeDataActive();
        }
        if (this.f79857u != ActivateState.UNKNOWN || this.f79856t != PanelType.ORDER_TRY || FreeDataManager.getInstance().getIsp() != TfProvider.UNICOM) {
            if (this.f79857u != ActivateState.START) {
                PlayerRouteUris.Routers.gotoAssignUrl(view.getContext(), this.f79849m);
                HashMap map = new HashMap();
                map.put("type", String.valueOf(this.f79856t.ordinal() + 1));
                Neurons.reportClick(true, "player.player.network-layer-freeflow.0.click", map);
                return;
            }
            return;
        }
        this.f79857u = ActivateState.START;
        mY.c cVar = mY.c.a;
        view.getContext();
        d dVar = (d) this.f79858v.getValue();
        cVar.getClass();
        Task.callInBackground(new mY.a(dVar)).continueWith(new mY.b(dVar));
        HashMap map2 = new HashMap();
        map2.put("type", String.valueOf(this.f79856t.ordinal() + 1));
        Neurons.reportClick(true, "player.player.network-layer-freeflow.0.click", map2);
    }

    public void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof Configuration) {
            Configuration configuration2 = (Configuration) configuration;
            final PanelCustomData panelData = configuration2.getPanelData();
            PanelType type = configuration2.getType();
            if (this.f79847k == null) {
                return;
            }
            this.f79856t = type;
            int i7 = c.f79870c[type.ordinal()];
            String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? "player.player.network-layer-freeflow.0.show" : "player.player.network-layer-freeflow.cubag-tryout-endpage.show" : "player.player.network-layer-freeflow.cubag-tryout.show" : "player.player.network-layer-freeflow.s10.show";
            if (!TextUtils.isEmpty(str)) {
                Neurons.reportExposure$default(true, str, (Map) null, (List) null, 12, (Object) null);
            }
            HandlerThreads.post(0, new Runnable(this, panelData) { // from class: com.bilibili.playerbizcommon.features.network.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerNetworkFunctionWidget f79906a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PlayerNetworkFunctionWidget.PanelCustomData f79907b;

                {
                    this.f79906a = this;
                    this.f79907b = panelData;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:33:0x014e
                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                    	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        Method dump skipped, instruction units count: 339
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.network.b.run():void");
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // br0.AbstractC5149a
    public void onControlContainerChanged(@NotNull ControlContainerType controlContainerType, @NotNull ScreenModeType screenModeType) throws NoWhenBranchMatchedException {
        super.onControlContainerChanged(controlContainerType, screenModeType);
        i(screenModeType);
    }

    public void onRelease() {
    }

    @Override // com.bilibili.playerbizcommon.features.network.VideoEnvironmentObserver
    public void onVideoEnvironmentChanged(@Nullable VideoEnvironment videoEnvironment) {
        Context mContext = getMContext();
        switch (videoEnvironment == null ? -1 : c.f79869b[videoEnvironment.ordinal()]) {
            case 1:
            case 2:
                h().getFunctionWidgetService().hideWidget(getToken());
                break;
            case 3:
                String string = mContext.getString(2131846944);
                PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79853q.getService();
                long currentMediaSize = playerNetworkService != null ? playerNetworkService.getCurrentMediaSize() : 0L;
                String string2 = (currentMediaSize <= 0 || this.f79854r) ? mContext.getString(2131845638) : mContext.getString(2131845605, String.valueOf(currentMediaSize));
                TextView textView = this.f79846j;
                if (textView != null) {
                    textView.setText(string2);
                }
                this.f79850n = string2;
                TextView textView2 = this.f79845i;
                if (textView2 != null) {
                    textView2.setText(string);
                }
                TextView textView3 = this.f79847k;
                if (textView3 != null) {
                    textView3.setText(mContext.getString(2131845721));
                }
                if (AppBuildConfig.Companion.isHDApp(mContext)) {
                    TextView textView4 = this.f79847k;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                } else {
                    TextView textView5 = this.f79847k;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                }
                CheckBox checkBox = null;
                if (this.f79855s) {
                    CheckBox checkBox2 = this.h;
                    if (checkBox2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                    } else {
                        checkBox = checkBox2;
                    }
                    checkBox.setVisibility(0);
                } else {
                    CheckBox checkBox3 = this.h;
                    if (checkBox3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mNoMoreCheckBox");
                        checkBox3 = null;
                    }
                    checkBox3.setVisibility(8);
                }
                Neurons.reportExposure$default(true, "player.player.network-layer-freeflow.1.show", k(), (List) null, 8, (Object) null);
                break;
            case 4:
                PlayerNetworkService playerNetworkService2 = (PlayerNetworkService) this.f79853q.getService();
                long currentMediaSize2 = playerNetworkService2 != null ? playerNetworkService2.getCurrentMediaSize() : 0L;
                String string3 = PlayerFreeDataHelper.INSTANCE.getFreeDataResultCode() == 2036 ? currentMediaSize2 > 0 ? mContext.getString(2131845745, String.valueOf(currentMediaSize2)) : mContext.getString(2131845891) : currentMediaSize2 > 0 ? mContext.getString(2131847291, String.valueOf(currentMediaSize2)) : mContext.getString(2131845436);
                String string4 = mContext.getString(2131846944);
                TextView textView6 = this.f79846j;
                if (textView6 != null) {
                    textView6.setText(string3);
                }
                this.f79850n = string3;
                TextView textView7 = this.f79845i;
                if (textView7 != null) {
                    textView7.setText(string4);
                }
                TextView textView8 = this.f79847k;
                if (textView8 != null) {
                    textView8.setText("");
                }
                TextView textView9 = this.f79847k;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
                Neurons.reportExposure$default(true, "player.player.network-layer-freeflow.1.show", k(), (List) null, 8, (Object) null);
                break;
            case 5:
                PlayerNetworkService playerNetworkService3 = (PlayerNetworkService) this.f79853q.getService();
                long currentMediaSize3 = playerNetworkService3 != null ? playerNetworkService3.getCurrentMediaSize() : 0L;
                String string5 = currentMediaSize3 > 0 ? mContext.getString(2131847139, String.valueOf(currentMediaSize3)) : mContext.getString(2131847032);
                String string6 = mContext.getString(2131847431);
                TextView textView10 = this.f79846j;
                if (textView10 != null) {
                    textView10.setText(string6);
                }
                this.f79850n = string6;
                TextView textView11 = this.f79845i;
                if (textView11 != null) {
                    textView11.setText(string5);
                }
                TextView textView12 = this.f79847k;
                if (textView12 != null) {
                    textView12.setText("");
                }
                TextView textView13 = this.f79847k;
                if (textView13 != null) {
                    textView13.setVisibility(8);
                }
                Neurons.reportExposure$default(true, "player.player.network-layer-freeflow.1.show", k(), (List) null, 8, (Object) null);
                break;
            case 6:
                PlayerNetworkService playerNetworkService4 = (PlayerNetworkService) this.f79853q.getService();
                long currentMediaSize4 = playerNetworkService4 != null ? playerNetworkService4.getCurrentMediaSize() : 0L;
                String string7 = currentMediaSize4 > 0 ? mContext.getString(2131847139, String.valueOf(currentMediaSize4)) : mContext.getString(2131847032);
                String string8 = mContext.getString(PlayerFreeDataHelper.INSTANCE.isFreeCardUser() ? 2131846697 : 2131845732);
                TextView textView14 = this.f79846j;
                if (textView14 != null) {
                    textView14.setText(string8);
                }
                this.f79850n = string8;
                TextView textView15 = this.f79845i;
                if (textView15 != null) {
                    textView15.setText(string7);
                }
                TextView textView16 = this.f79847k;
                if (textView16 != null) {
                    textView16.setText("");
                }
                TextView textView17 = this.f79847k;
                if (textView17 != null) {
                    textView17.setVisibility(8);
                }
                Neurons.reportExposure$default(true, "player.player.network-layer-freeflow.1.show", k(), (List) null, 8, (Object) null);
                break;
        }
    }

    @Override // br0.AbstractC5149a
    public void onWidgetDismiss() {
        INetworkAlertHandler networkAlertHandler;
        super.onWidgetDismiss();
        this.f79855s = false;
        this.f79854r = false;
        PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService != null) {
            playerNetworkService.unregisterVideoEnvironmentObserver(this);
        }
        h().getPlayerServiceManager().unbindService(this.f79852p, this.f79853q);
        PlayerNetworkService playerNetworkService2 = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService2 == null || (networkAlertHandler = playerNetworkService2.getNetworkAlertHandler()) == null) {
            return;
        }
        networkAlertHandler.onAlertWidgetDismiss();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // br0.AbstractC5149a
    public void onWidgetShow() throws NoWhenBranchMatchedException {
        INetworkAlertHandler networkAlertHandler;
        super.onWidgetShow();
        this.f79857u = ActivateState.UNKNOWN;
        h().getPlayerServiceManager().bindService(this.f79852p, this.f79853q);
        h().getControlContainerService().hide();
        PlayerNetworkService playerNetworkService = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService != null) {
            playerNetworkService.registerVideoEnvironmentObserver(this);
        }
        PlayerNetworkService playerNetworkService2 = (PlayerNetworkService) this.f79853q.getService();
        onVideoEnvironmentChanged(playerNetworkService2 != null ? playerNetworkService2.getVideoEnvironment() : null);
        PlayerNetworkService playerNetworkService3 = (PlayerNetworkService) this.f79853q.getService();
        if (playerNetworkService3 != null && (networkAlertHandler = playerNetworkService3.getNetworkAlertHandler()) != null) {
            networkAlertHandler.onAlertWidgetShow();
        }
        i(h().getControlContainerService().getScreenModeType());
    }

    public void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof b) {
            b bVar = (b) configuration;
            this.f79855s = bVar.f79867b;
            this.f79854r = bVar.f79866a;
        }
        super.onWidgetShow(configuration);
    }
}

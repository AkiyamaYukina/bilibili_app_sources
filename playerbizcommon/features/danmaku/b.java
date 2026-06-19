package com.bilibili.playerbizcommon.features.danmaku;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import q4.M;
import qb.g;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.PlayerDataSource;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.widget.PlayerRadioGridGroup;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/b.class */
public final class b extends AbsFunctionWidget implements View.OnClickListener, PlayerRadioGridGroup.c, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PlayerContainer f79637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CommandsDanmaku f79638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f79640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f79641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f79642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public StaticImageView2 f79643g;

    @Nullable
    public NestedScrollView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public PlayerRadioGridGroup f79644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String[] f79646k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/b$a.class */
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public CommandsDanmaku f79647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f79648b;
    }

    public b(@NotNull Context context) {
        super(context);
        this.f79639c = 3;
        this.f79645j = -1;
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79637a = playerContainer;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496388, (ViewGroup) null, false);
        this.f79643g = viewInflate.findViewById(2131299171);
        this.f79642f = (TextView) viewInflate.findViewById(2131299172);
        this.h = (NestedScrollView) viewInflate.findViewById(2131299175);
        this.f79641e = (TextView) viewInflate.findViewById(2131299176);
        TextView textView = (TextView) viewInflate.findViewById(2131299170);
        this.f79640d = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f79640d;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        PlayerRadioGridGroup playerRadioGridGroupFindViewById = viewInflate.findViewById(2131299174);
        this.f79644i = playerRadioGridGroupFindViewById;
        if (playerRadioGridGroupFindViewById != null) {
            playerRadioGridGroupFindViewById.setSpanCount(2);
        }
        PlayerRadioGridGroup playerRadioGridGroup = this.f79644i;
        if (playerRadioGridGroup != null) {
            playerRadioGridGroup.setItemCheckedChangeListener(this);
        }
        h(context);
        return viewInflate;
    }

    public final void d(int i7) {
        TextView textView = this.f79640d;
        if (textView != null) {
            textView.setText(getMContext().getString(2131841373));
        }
        TextView textView2 = this.f79640d;
        if (textView2 != null) {
            textView2.setEnabled(true);
        }
        TextView textView3 = this.f79640d;
        if (textView3 != null) {
            textView3.setTextColor(ContextCompat.getColor(getMContext(), R.color.white));
        }
        this.f79645j = i7;
    }

    public final Video.PlayableParams g() {
        IPlayerContainer iPlayerContainer = this.f79637a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video currentVideo = iPlayerContainer2.getVideoPlayDirectorService().getCurrentVideo();
        Video.PlayableParams videoItem = null;
        if (currentVideo != null) {
            IPlayerContainer iPlayerContainer3 = this.f79637a;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            PlayerDataSource playerDataSource = iPlayerContainer4.getVideoPlayDirectorService().getPlayerDataSource();
            videoItem = null;
            if (playerDataSource != null) {
                videoItem = playerDataSource.getVideoItem(currentVideo, currentVideo.getCurrentIndex());
            }
        }
        return videoItem;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, true);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @NotNull
    public final String getTag() {
        return "CommandDanmakuReportFunctionWidget";
    }

    public final void h(Context context) {
        if (context == null || this.f79639c != 3) {
            return;
        }
        String[] stringArray = context.getResources().getStringArray(2130903085);
        this.f79646k = context.getResources().getStringArray(2130903084);
        PlayerRadioGridGroup playerRadioGridGroup = this.f79644i;
        if (playerRadioGridGroup != null) {
            playerRadioGridGroup.setData(stringArray);
        }
        TextView textView = this.f79641e;
        if (textView != null) {
            textView.setText(2131845445);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f79644i.getLayoutParams();
        layoutParams.topMargin = -((int) DpUtils.dp2px(this.f79644i.getContext(), 5.0f));
        PlayerRadioGridGroup playerRadioGridGroup2 = this.f79644i;
        if (playerRadioGridGroup2 != null) {
            playerRadioGridGroup2.setLayoutParams(layoutParams);
        }
        this.f79645j = -1;
    }

    public final void i(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        PlayerToast playerToastBuild = g.a(32, 17, "extra_title", str).duration(5000L).build();
        IPlayerContainer iPlayerContainer = this.f79637a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getToastService().showToast(playerToastBuild);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(@NotNull CompoundButton compoundButton, boolean z6) {
        IPlayerContainer iPlayerContainer = this.f79637a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerSettingService().putBoolean("key_shield_checked", z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(@org.jetbrains.annotations.NotNull android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.danmaku.b.onClick(android.view.View):void");
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        StaticImageView2 staticImageView2;
        if (configuration instanceof a) {
            a aVar = (a) configuration;
            CommandsDanmaku commandsDanmaku = aVar.f79647a;
            int i7 = aVar.f79648b;
            this.f79638b = commandsDanmaku;
            PlayerRadioGridGroup playerRadioGridGroup = this.f79644i;
            if (playerRadioGridGroup != null) {
                playerRadioGridGroup.g();
            }
            if (this.f79639c != i7) {
                this.f79639c = i7;
                TextView textView = this.f79640d;
                if (textView != null) {
                    h(textView.getContext());
                }
            }
            this.f79645j = -1;
            TextView textView2 = this.f79640d;
            if (textView2 != null) {
                textView2.setEnabled(false);
                TextView textView3 = this.f79640d;
                if (textView3 != null) {
                    textView3.setTextColor(ContextCompat.getColor(getMContext(), 2131103712));
                }
            }
            TextView textView4 = this.f79642f;
            if (textView4 != null) {
                String content = commandsDanmaku.getContent();
                if (content == null) {
                    content = "";
                }
                textView4.setText(content);
            }
            try {
                String extra = commandsDanmaku.getExtra();
                if (extra != null) {
                    JSONObject jSONObject = new JSONObject(extra);
                    if (jSONObject.has("icon") && (staticImageView2 = this.f79643g) != null) {
                        ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(staticImageView2.getContext()).roundingParams(RoundingParams.Companion.asCircle()), 2131233999, (ScaleType) null, 2, (Object) null).url(jSONObject.getString("icon")).into(staticImageView2);
                    }
                }
            } catch (Exception e7) {
                M.b("parse command danmaku icon title error ", e7.getMessage(), "CommandDanmakuReportFunctionWidget");
            }
            NestedScrollView nestedScrollView = this.h;
            if (nestedScrollView != null) {
                nestedScrollView.scrollTo(0, 0);
            }
        }
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        PlayerRadioGridGroup playerRadioGridGroup = this.f79644i;
        if (playerRadioGridGroup != null) {
            playerRadioGridGroup.g();
        }
        TextView textView = this.f79640d;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f79640d;
        if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(getMContext(), 2131100084));
        }
    }
}

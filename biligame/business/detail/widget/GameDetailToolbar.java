package com.bilibili.biligame.business.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.iconfont.IconFontTextView;
import com.bilibili.biligame.report.ReportExtra;
import com.bilibili.biligame.report3.ReportParams;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.utils.OnSafeClickListener;
import com.bilibili.biligame.widget.action.follow.GameFollowBtn;
import java.util.Map;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/GameDetailToolbar.class */
@StabilityInferred(parameters = 0)
public final class GameDetailToolbar extends Toolbar implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ImageView f62699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IconFontTextView f62700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f62701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IconFontTextView f62702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final GameFollowBtn f62703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f62704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final View f62705g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f62706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ReportExtra f62707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f62708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public GameDetailCallback f62709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayMap<String, Boolean> f62710m;

    @JvmOverloads
    public GameDetailToolbar(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public GameDetailToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public GameDetailToolbar(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.h = -1;
        this.f62706i = ContextCompat.getColor(context, 2131100655);
        View.OnClickListener onSafeClickListener = new OnSafeClickListener(this);
        ViewGroup.inflate(context, 2131496920, this);
        ImageView imageView = (ImageView) findViewById(2131304549);
        this.f62699a = imageView;
        IconFontTextView iconFontTextViewFindViewById = findViewById(2131304551);
        this.f62700b = iconFontTextViewFindViewById;
        this.f62701c = findViewById(2131304552);
        IconFontTextView iconFontTextViewFindViewById2 = findViewById(2131304553);
        this.f62702d = iconFontTextViewFindViewById2;
        GameFollowBtn gameFollowBtnFindViewById = findViewById(2131315409);
        this.f62703e = gameFollowBtnFindViewById;
        gameFollowBtnFindViewById.setCanUnfollow(true).setUnfollowModule("track-detail-unfollow").setReportPage("detailTag").setReportModule("track-detail-follow");
        this.f62704f = (TextView) findViewById(2131315410);
        this.f62705g = findViewById(2131300240);
        imageView.setOnClickListener(onSafeClickListener);
        iconFontTextViewFindViewById.setOnClickListener(onSafeClickListener);
        iconFontTextViewFindViewById2.setOnClickListener(onSafeClickListener);
        this.f62710m = new ArrayMap<>();
    }

    public final void a(String str, String str2, Map<String, String> map) {
        Boolean bool = this.f62710m.get(str.concat(str2));
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        ReporterV3.reportExposure("game-detail-page", str, str2, map);
        this.f62710m.put(str.concat(str2), Boolean.TRUE);
    }

    @Nullable
    public final GameDetailCallback getGameDetailCallback() {
        return this.f62709l;
    }

    @NotNull
    public final View getMoreView() {
        return this.f62702d;
    }

    public final boolean getPrivateRecruit() {
        return this.f62708k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131304549) {
            GameDetailCallback gameDetailCallback = this.f62709l;
            if (gameDetailCallback != null) {
                gameDetailCallback.onBack();
                return;
            }
            return;
        }
        JSONObject jSONObjectBuild = null;
        if (id == 2131304551) {
            ReportParams reportParamsCreateWithGameBaseId = ReportParams.Companion.createWithGameBaseId(String.valueOf(this.h));
            ReportExtra reportExtra = this.f62707j;
            if (reportExtra != null) {
                jSONObjectBuild = reportExtra.build();
            }
            ReporterV3.reportClick("game-detail-page", "game-center-icon", "all", reportParamsCreateWithGameBaseId.put(jSONObjectBuild).build());
            GameDetailCallback gameDetailCallback2 = this.f62709l;
            if (gameDetailCallback2 != null) {
                gameDetailCallback2.onGameCenter();
                return;
            }
            return;
        }
        if (id == 2131304553) {
            ReportParams reportParamsCreateWithGameBaseId2 = ReportParams.Companion.createWithGameBaseId(String.valueOf(this.h));
            ReportExtra reportExtra2 = this.f62707j;
            JSONObject jSONObjectBuild2 = null;
            if (reportExtra2 != null) {
                jSONObjectBuild2 = reportExtra2.build();
            }
            ReporterV3.reportClick("game-detail-page", "basic-function", "top-share-button", reportParamsCreateWithGameBaseId2.put(jSONObjectBuild2).build());
            GameDetailCallback gameDetailCallback3 = this.f62709l;
            if (gameDetailCallback3 != null) {
                gameDetailCallback3.onShare();
            }
        }
    }

    public final void setGameDetailCallback(@Nullable GameDetailCallback gameDetailCallback) {
        this.f62709l = gameDetailCallback;
    }

    public final void setLifecycle(@Nullable Lifecycle lifecycle) {
        this.f62703e.setLifecycle(lifecycle);
    }

    public final void setPrivateRecruit(boolean z6) {
        this.f62708k = z6;
    }

    public final void setReportExtra(@Nullable ReportExtra reportExtra) {
        this.f62707j = reportExtra;
        this.f62703e.setReportExtra(reportExtra);
    }
}

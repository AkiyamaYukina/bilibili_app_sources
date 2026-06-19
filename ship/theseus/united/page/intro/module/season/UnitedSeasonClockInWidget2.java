package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.C3246j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.bapis.bilibili.app.view.v1.SeasonActivityRecordReply;
import com.bapis.bilibili.app.view.v1.SeasonActivityRecordReq;
import com.bapis.bilibili.app.view.v1.SeasonShow;
import com.bapis.bilibili.app.view.v1.SeasonWidgetExposeReq;
import com.bapis.bilibili.app.view.v1.UgcSeasonActivity;
import com.bapis.bilibili.app.view.v1.UserActivity;
import com.bapis.bilibili.app.view.v1.ViewMoss;
import com.bilibili.app.comm.list.widget.image.IUrlGetter;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.CenterVerticalImageSpan;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.iconfont.IconFont;
import com.bilibili.iconfont.IconTextDrawable;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonClockInWidget2;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelComponent2$bindContent$8;
import com.bililive.bililive.infra.hybrid.callhandler.K;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonClockInWidget2.class */
@StabilityInferred(parameters = 0)
public final class UnitedSeasonClockInWidget2 extends FrameLayout {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f101533G = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f101534A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f101535B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public String f101536C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public UnitedSeasonActivity f101537D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public InterfaceC6340b f101538E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final c f101539F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextView f101540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f101541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f101542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextView f101543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f101544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final TextView f101545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ImageView f101546g;

    @Nullable
    public final BiliImageView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ConstraintLayout f101547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final View f101548j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final ImageView f101549k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final TextView f101550l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final TextView f101551m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final UnitedSeasonClockExpandableLayout2 f101552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final TextView f101553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final TextView f101554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final TextView f101555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final TextView f101556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final Space f101557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Space f101558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f101559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final TextView f101560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final TextView f101561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Integer f101562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f101563y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f101564z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonClockInWidget2$a.class */
    public static final class a implements InterfaceC6341c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedSeasonClockInWidget2 f101565a;

        public a(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2) {
            this.f101565a = unitedSeasonClockInWidget2;
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.season.InterfaceC6341c
        public final void a(boolean z6) {
            ImageView imageView = this.f101565a.f101546g;
            if (imageView != null) {
                imageView.setVisibility(z6 ? 0 : 8);
            }
        }

        @Override // com.bilibili.ship.theseus.united.page.intro.module.season.InterfaceC6341c
        public final void onStateChange() {
            UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.f101565a;
            UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = unitedSeasonClockInWidget2.f101552n;
            if (unitedSeasonClockExpandableLayout2 == null || !unitedSeasonClockExpandableLayout2.f101525c) {
                ImageView imageView = unitedSeasonClockInWidget2.f101546g;
                if (imageView != null) {
                    imageView.setRotation(0.0f);
                    return;
                }
                return;
            }
            ImageView imageView2 = unitedSeasonClockInWidget2.f101546g;
            if (imageView2 != null) {
                imageView2.setRotation(180.0f);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonClockInWidget2$b.class */
    public static final class b {
        @NotNull
        public static UnitedSeasonActivity a(@NotNull UgcSeasonActivity ugcSeasonActivity) {
            int type = ugcSeasonActivity.getType();
            long oid = ugcSeasonActivity.getOid();
            long activityId = ugcSeasonActivity.getActivityId();
            String title = ugcSeasonActivity.getTitle();
            String intro = ugcSeasonActivity.getIntro();
            int dayCount = ugcSeasonActivity.getDayCount();
            int userCount = ugcSeasonActivity.getUserCount();
            long joinDeadline = ugcSeasonActivity.getJoinDeadline();
            long j7 = 1000;
            long activityDeadline = ugcSeasonActivity.getActivityDeadline();
            int checkinViewTime = ugcSeasonActivity.getCheckinViewTime();
            boolean newActivity = ugcSeasonActivity.getNewActivity();
            UserActivity userActivity = ugcSeasonActivity.getUserActivity();
            UnitedSeasonUserActivity unitedSeasonUserActivity = new UnitedSeasonUserActivity(userActivity.getPortrait(), userActivity.getUserState(), userActivity.getCheckinToday(), userActivity.getUserDayCount(), userActivity.getUserViewTime(), userActivity.getLastCheckinDate());
            SeasonShow seasonShow = ugcSeasonActivity.getSeasonShow();
            return new UnitedSeasonActivity(type, oid, activityId, title, intro, dayCount, userCount, joinDeadline * j7, j7 * activityDeadline, checkinViewTime, newActivity, unitedSeasonUserActivity, new UnitedActivitySeasonShow(seasonShow.getButtonText(), seasonShow.getJoinText(), seasonShow.getRuleText(), seasonShow.getCheckinText(), seasonShow.getCheckinPrompt()));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonClockInWidget2$c.class */
    public static final class c implements MossResponseHandler<SeasonActivityRecordReply> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnitedSeasonClockInWidget2 f101566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f101567b;

        public c(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, Context context) {
            this.f101566a = unitedSeasonClockInWidget2;
            this.f101567b = context;
        }

        public final void onError(MossException mossException) {
            C3246j.b("season req fail, cause ", mossException != null ? mossException.getMessage() : null, "Ugc-Clock-In");
            BusinessException businessException = null;
            if (mossException instanceof BusinessException) {
                businessException = (BusinessException) mossException;
            }
            if (businessException != null) {
                ToastHelper.showToastShort(this.f101567b, businessException.getMessage());
            }
        }

        public final void onNext(Object obj) {
            final SeasonActivityRecordReply seasonActivityRecordReply = (SeasonActivityRecordReply) obj;
            if (seasonActivityRecordReply != null) {
                long activityId = seasonActivityRecordReply.getActivity().getActivityId();
                long oid = seasonActivityRecordReply.getActivity().getOid();
                StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(activityId, "season req succeed, activityId=", ", seasonId=");
                sbA.append(oid);
                BLog.d("Ugc-Clock-In", sbA.toString());
                final UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.f101566a;
                HandlerThreads.post(0, new Runnable(unitedSeasonClockInWidget2, seasonActivityRecordReply) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UnitedSeasonClockInWidget2 f101665a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final SeasonActivityRecordReply f101666b;

                    {
                        this.f101665a = unitedSeasonClockInWidget2;
                        this.f101666b = seasonActivityRecordReply;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
                        UnitedSeasonClockInWidget2 unitedSeasonClockInWidget22 = this.f101665a;
                        SeasonActivityRecordReply seasonActivityRecordReply2 = this.f101666b;
                        int i7 = UnitedSeasonClockInWidget2.f101533G;
                        unitedSeasonClockInWidget22.i(UnitedSeasonClockInWidget2.b.a(seasonActivityRecordReply2.getActivity()), true);
                        InterfaceC6340b interfaceC6340b = unitedSeasonClockInWidget22.f101538E;
                        if (interfaceC6340b != null) {
                            UnitedSeasonPanelComponent2$bindContent$8.AnonymousClass6.AnonymousClass1.invokeSuspend$lambda$0(((A) interfaceC6340b).f101441a, UnitedSeasonClockInWidget2.b.a(seasonActivityRecordReply2.getActivity()));
                        }
                        if (seasonActivityRecordReply2.getActivity().getUserActivity().getUserState() != 1 || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(unitedSeasonClockInWidget22.getContext())) == null) {
                            return;
                        }
                        BiliCommonDialog.Builder builder = new BiliCommonDialog.Builder(fragmentActivityFindFragmentActivityOrNull);
                        BiliCommonDialog.Builder.setPositiveButton$default(BiliCommonDialog.Builder.setNegativeButton$default(BiliCommonDialog.Builder.setLink$default(builder.setContentText(fragmentActivityFindFragmentActivityOrNull.getString(2131845598)).setTitle(fragmentActivityFindFragmentActivityOrNull.getString(2131841694)).setCanceledOnTouchOutside(true), fragmentActivityFindFragmentActivityOrNull.getString(2131847298), new androidx.media3.exoplayer.W(unitedSeasonClockInWidget22), false, 4, (Object) null), 2131846844, new androidx.media3.exoplayer.X(unitedSeasonClockInWidget22), false, (CustomButtonInfo) null, 12, (Object) null), 2131851570, new androidx.media3.exoplayer.Y(unitedSeasonClockInWidget22), false, (CustomButtonInfo) null, 12, (Object) null);
                        builder.build().show(fragmentActivityFindFragmentActivityOrNull.getSupportFragmentManager(), "clockInDialog");
                    }
                });
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonClockInWidget2$d.class */
    public static final class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f101568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UnitedSeasonClockInWidget2 f101569b;

        public d(int i7, UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2) {
            this.f101568a = i7;
            this.f101569b = unitedSeasonClockInWidget2;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            if (i10 - i8 != this.f101568a) {
                final UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2 = this.f101569b;
                final int i15 = 0;
                unitedSeasonClockInWidget2.post(new Runnable(unitedSeasonClockInWidget2, i15) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.n

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f101667a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f101668b;

                    {
                        this.f101667a = i15;
                        this.f101668b = unitedSeasonClockInWidget2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f101667a) {
                            case 0:
                                ((UnitedSeasonClockInWidget2) this.f101668b).f101559u = false;
                                break;
                            default:
                                K.b jBBehavior = ((com.bililive.bililive.infra.hybrid.callhandler.K) this.f101668b).getJBBehavior();
                                if (jBBehavior != null) {
                                    jBBehavior.onH5PageLoadSuccess();
                                }
                                break;
                        }
                    }
                });
                this.f101569b.removeOnLayoutChangeListener(this);
            }
        }
    }

    @JvmOverloads
    public UnitedSeasonClockInWidget2(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public UnitedSeasonClockInWidget2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public UnitedSeasonClockInWidget2(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f101562x = 0;
        this.f101536C = "";
        this.f101539F = new c(this, context);
        FrameLayout.inflate(context, 2131501523, this);
        setVisibility(8);
        setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context, R$color.Bg2_float), 0.0f, 8, 0));
        this.f101548j = findViewById(2131298922);
        this.f101540a = (TextView) findViewById(2131298931);
        TextView textView = (TextView) findViewById(2131298917);
        textView.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.dialog.v(this));
        this.f101561w = textView;
        this.f101541b = (TextView) findViewById(2131298930);
        this.f101550l = (TextView) findViewById(2131298927);
        this.f101551m = (TextView) findViewById(2131298928);
        this.f101542c = (TextView) findViewById(2131298929);
        this.f101543d = (TextView) findViewById(2131298927);
        this.f101544e = (TextView) findViewById(2131298923);
        this.f101545f = (TextView) findViewById(2131298921);
        this.f101553o = (TextView) findViewById(2131298912);
        this.f101554p = (TextView) findViewById(2131304632);
        this.f101555q = (TextView) findViewById(2131298936);
        this.f101556r = (TextView) findViewById(2131298933);
        this.f101557s = (Space) findViewById(2131298932);
        this.f101558t = (Space) findViewById(2131298911);
        TextView textView2 = (TextView) findViewById(2131298935);
        textView2.setOnClickListener(new Hw.a(this, 3));
        this.f101560v = textView2;
        UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = (UnitedSeasonClockExpandableLayout2) findViewById(2131298910);
        this.f101552n = unitedSeasonClockExpandableLayout2;
        unitedSeasonClockExpandableLayout2.setExpandListener(new a(this));
        this.f101546g = (ImageView) findViewById(2131298920);
        findViewById(2131317891).setOnClickListener(new W9.m(this, 4));
        this.h = findViewById(2131298915);
        this.f101547i = (ConstraintLayout) findViewById(2131298926);
        this.f101549k = (ImageView) findViewById(2131298919);
    }

    public static void a(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, BiliCommonDialog biliCommonDialog) {
        unitedSeasonClockInWidget2.h();
        HashMap map = new HashMap(5);
        UnitedSeasonActivity unitedSeasonActivity = unitedSeasonClockInWidget2.f101537D;
        map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
        Hr.k.a(unitedSeasonClockInWidget2.getStatusForReport(), "clock_in_status", "action_type", "2", map);
        j("united.player-video-detail.drama-float.clockin-popup-all.click", map);
        biliCommonDialog.dismiss();
    }

    public static void b(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2, BiliCommonDialog biliCommonDialog) {
        biliCommonDialog.dismiss();
        HashMap map = new HashMap(5);
        UnitedSeasonActivity unitedSeasonActivity = unitedSeasonClockInWidget2.f101537D;
        map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
        Hr.k.a(unitedSeasonClockInWidget2.getStatusForReport(), "clock_in_status", "action_type", "3", map);
        j("united.player-video-detail.drama-float.clockin-popup-all.click", map);
    }

    public static void c(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2) {
        HashMap map = new HashMap(5);
        UnitedSeasonActivity unitedSeasonActivity = unitedSeasonClockInWidget2.f101537D;
        map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
        map.put("clock_in_status", String.valueOf(unitedSeasonClockInWidget2.getStatusForReport()));
        UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2 = unitedSeasonClockInWidget2.f101552n;
        map.put("action_type", (unitedSeasonClockExpandableLayout2 == null || !unitedSeasonClockExpandableLayout2.f101525c) ? "unfold" : "fold");
        j("united.player-video-detail.drama-float.clockin-all.click", map);
        final UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout22 = unitedSeasonClockInWidget2.f101552n;
        if (unitedSeasonClockExpandableLayout22 != null) {
            boolean z6 = unitedSeasonClockExpandableLayout22.f101525c;
            if (z6) {
                if (!unitedSeasonClockExpandableLayout22.f101528f && z6 && unitedSeasonClockExpandableLayout22.f101526d) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(unitedSeasonClockExpandableLayout22.f101524b, unitedSeasonClockExpandableLayout22.f101523a);
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(unitedSeasonClockExpandableLayout22) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final View f101658a;

                        {
                            this.f101658a = unitedSeasonClockExpandableLayout22;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ViewGroup.LayoutParams layoutParams;
                            View view = this.f101658a;
                            int i7 = UnitedSeasonClockExpandableLayout2.f101522l;
                            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            }
                            if (view != null) {
                                view.requestLayout();
                            }
                        }
                    });
                    valueAnimatorOfInt.addListener(new C6348j(unitedSeasonClockExpandableLayout22));
                    final int i7 = 0;
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(unitedSeasonClockExpandableLayout22, i7) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.f

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f101656a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f101657b;

                        {
                            this.f101656a = i7;
                            this.f101657b = unitedSeasonClockExpandableLayout22;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (this.f101656a) {
                                case 0:
                                    UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout23 = (UnitedSeasonClockExpandableLayout2) this.f101657b;
                                    int i8 = UnitedSeasonClockExpandableLayout2.f101522l;
                                    unitedSeasonClockExpandableLayout23.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                    unitedSeasonClockExpandableLayout23.requestLayout();
                                    break;
                                default:
                                    tv.danmaku.bili.ui.main2.mine.fansachievement.c cVar = (tv.danmaku.bili.ui.main2.mine.fansachievement.c) this.f101657b;
                                    Object animatedValue = valueAnimator.getAnimatedValue();
                                    Float f7 = animatedValue instanceof Float ? (Float) animatedValue : null;
                                    if (f7 != null) {
                                        float fFloatValue = f7.floatValue();
                                        TextView textView = cVar.c;
                                        if (textView != null) {
                                            textView.setScaleX(fFloatValue);
                                        }
                                        TextView textView2 = cVar.c;
                                        if (textView2 != null) {
                                            textView2.setScaleY(fFloatValue);
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfInt.setDuration(300L);
                    valueAnimatorOfInt.setInterpolator(new FastOutSlowInInterpolator());
                    valueAnimatorOfInt.start();
                    unitedSeasonClockExpandableLayout22.f101529g = true;
                    unitedSeasonClockExpandableLayout22.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6349k(unitedSeasonClockExpandableLayout22));
                    return;
                }
                return;
            }
            if (unitedSeasonClockExpandableLayout22.f101528f || !unitedSeasonClockExpandableLayout22.f101526d || z6) {
                return;
            }
            unitedSeasonClockExpandableLayout22.getLayoutParams().height = unitedSeasonClockExpandableLayout22.f101523a;
            unitedSeasonClockExpandableLayout22.c();
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(unitedSeasonClockExpandableLayout22.f101523a, unitedSeasonClockExpandableLayout22.f101524b);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(unitedSeasonClockExpandableLayout22) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f101658a;

                {
                    this.f101658a = unitedSeasonClockExpandableLayout22;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ViewGroup.LayoutParams layoutParams;
                    View view = this.f101658a;
                    int i72 = UnitedSeasonClockExpandableLayout2.f101522l;
                    if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    }
                    if (view != null) {
                        view.requestLayout();
                    }
                }
            });
            valueAnimatorOfInt2.setDuration(300L);
            valueAnimatorOfInt2.setInterpolator(new FastOutSlowInInterpolator());
            valueAnimatorOfInt2.addListener(new C6346h(unitedSeasonClockExpandableLayout22));
            final int i8 = 0;
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(unitedSeasonClockExpandableLayout22, i8) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f101654a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f101655b;

                {
                    this.f101654a = i8;
                    this.f101655b = unitedSeasonClockExpandableLayout22;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (this.f101654a) {
                        case 0:
                            UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout23 = (UnitedSeasonClockExpandableLayout2) this.f101655b;
                            int i9 = UnitedSeasonClockExpandableLayout2.f101522l;
                            unitedSeasonClockExpandableLayout23.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            unitedSeasonClockExpandableLayout23.requestLayout();
                            break;
                        default:
                            tv.danmaku.bili.ui.main2.mine.fansachievement.c cVar = (tv.danmaku.bili.ui.main2.mine.fansachievement.c) this.f101655b;
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                TextView textView = cVar.c;
                                if (textView != null) {
                                    textView.setText(NumberFormat_androidKt.formatNumber$default(iIntValue, (String) null, 0, 6, (Object) null));
                                }
                            }
                            break;
                    }
                }
            });
            valueAnimatorOfInt2.start();
            unitedSeasonClockExpandableLayout22.f101529g = true;
            unitedSeasonClockExpandableLayout22.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6347i(unitedSeasonClockExpandableLayout22));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(final com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonClockInWidget2 r6) {
        /*
            r0 = r6
            java.lang.Integer r0 = r0.f101562x
            r9 = r0
            r0 = r9
            if (r0 != 0) goto Lc
            goto L1b
        Lc:
            r0 = r9
            int r0 = r0.intValue()
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 2
            r7 = r0
        L1d:
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = new com.bilibili.lib.blrouter.RouteRequest$Builder
            r1 = r0
            java.lang.String r2 = "bilibili://main/favorite?tab=checkin"
            r1.<init>(r2)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = r0.flags(r1)
            com.bilibili.ship.theseus.united.page.intro.module.season.l r1 = new com.bilibili.ship.theseus.united.page.intro.module.season.l
            r2 = r1
            r3 = r7
            r4 = r6
            r2.<init>(r3, r4)
            com.bilibili.lib.blrouter.RouteRequest$Builder r0 = r0.extras(r1)
            com.bilibili.lib.blrouter.RouteRequest r0 = r0.build()
            r1 = r6
            android.content.Context r1 = r1.getContext()
            com.bilibili.lib.blrouter.RouteResponse r0 = com.bilibili.lib.blrouter.BLRouter.routeTo(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r2 = 5
            r1.<init>(r2)
            r10 = r0
            r0 = r6
            com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity r0 = r0.f101537D
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L62
            r0 = r9
            int r0 = r0.k()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = r0
            goto L64
        L62:
            r0 = 0
            r9 = r0
        L64:
            r0 = r10
            java.lang.String r1 = "clockin_type"
            r2 = r9
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            int r0 = r0.getStatusForReport()
            java.lang.String r1 = "clock_in_status"
            java.lang.String r2 = "action_type"
            java.lang.String r3 = "1"
            r4 = r10
            Hr.k.a(r0, r1, r2, r3, r4)
            java.lang.String r0 = "united.player-video-detail.drama-float.clockin-popup-all.click"
            r1 = r10
            j(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonClockInWidget2.d(com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonClockInWidget2):void");
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, tv.danmaku.bili.widget.dialog.BiliCommonDialog$OnDialogTextClickListener] */
    public static void e(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2) {
        HashMap map = new HashMap(3);
        UnitedSeasonActivity unitedSeasonActivity = unitedSeasonClockInWidget2.f101537D;
        map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
        Hr.k.a(unitedSeasonClockInWidget2.getStatusForReport(), "clock_in_status", "action_type", "clockin", map);
        j("united.player-video-detail.drama-float.clockin-all.click", map);
        if (!BiliAccounts.get(unitedSeasonClockInWidget2.getContext()).isLogin()) {
            PlayerRouteUris.Routers.toMainLogin$default(PlayerRouteUris.Routers.INSTANCE, unitedSeasonClockInWidget2.getContext(), (String) null, 2, (Object) null);
            return;
        }
        Integer num = unitedSeasonClockInWidget2.f101562x;
        if (num != null && num.intValue() == 1) {
            FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(unitedSeasonClockInWidget2.getContext());
            if (fragmentActivityFindFragmentActivityOrNull != null) {
                BiliCommonDialog.Builder builder = new BiliCommonDialog.Builder(fragmentActivityFindFragmentActivityOrNull);
                BiliCommonDialog.Builder.setPositiveButton$default(BiliCommonDialog.Builder.setNegativeButton$default(builder.setTitle(fragmentActivityFindFragmentActivityOrNull.getString(2131847425)).setCanceledOnTouchOutside(true), 2131841721, (BiliCommonDialog.OnDialogTextClickListener) new Object(), false, (CustomButtonInfo) null, 12, (Object) null), 2131847112, new com.bilibili.biligame.cloudgame.v2.ui.feedback.weight.b(unitedSeasonClockInWidget2), false, (CustomButtonInfo) null, 12, (Object) null);
                builder.build().show(fragmentActivityFindFragmentActivityOrNull.getSupportFragmentManager(), "cancelClockInDialog");
                return;
            }
            return;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 0)) {
            unitedSeasonClockInWidget2.g(1);
            return;
        }
        if (num != null && num.intValue() == 2) {
            unitedSeasonClockInWidget2.g(1);
            return;
        }
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5)) {
            UnitedSeasonActivity unitedSeasonActivity2 = unitedSeasonClockInWidget2.f101537D;
            if (unitedSeasonActivity2 == null || !unitedSeasonActivity2.g()) {
                return;
            }
            unitedSeasonClockInWidget2.g(4);
            return;
        }
        BLog.d("Ugc-Clock-In", "clock state is " + unitedSeasonClockInWidget2.f101562x + ", no need to request");
    }

    public static void f(UnitedSeasonClockInWidget2 unitedSeasonClockInWidget2) {
        unitedSeasonClockInWidget2.h();
        HashMap map = new HashMap(5);
        UnitedSeasonActivity unitedSeasonActivity = unitedSeasonClockInWidget2.f101537D;
        map.put("clockin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
        Hr.k.a(unitedSeasonClockInWidget2.getStatusForReport(), "clock_in_status", "action_type", "remind", map);
        j("united.player-video-detail.drama-float.clockin-all.click", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int getStatusForReport() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Integer r0 = r0.f101562x
            r7 = r0
            r0 = 1
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L10
            goto L1a
        L10:
            r0 = r5
            r4 = r0
            r0 = r7
            int r0 = r0.intValue()
            if (r0 == 0) goto Lc2
        L1a:
            r0 = 3
            r4 = r0
            r0 = r7
            if (r0 != 0) goto L24
            goto L32
        L24:
            r0 = r7
            int r0 = r0.intValue()
            r1 = 3
            if (r0 != r1) goto L32
            r0 = r5
            r4 = r0
            goto Lc2
        L32:
            r0 = 2
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L3c
            goto L4a
        L3c:
            r0 = r7
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L4a
            r0 = r5
            r4 = r0
        L47:
            goto Lc2
        L4a:
            r0 = r7
            if (r0 != 0) goto L52
            goto L5e
        L52:
            r0 = r7
            int r0 = r0.intValue()
            r1 = 2
            if (r0 != r1) goto L5e
        L5b:
            goto Lc2
        L5e:
            r0 = 5
            r5 = r0
            r0 = 4
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L6a
            goto L90
        L6a:
            r0 = r7
            int r0 = r0.intValue()
            r1 = 4
            if (r0 != r1) goto L90
            r0 = r3
            com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity r0 = r0.f101537D
            r7 = r0
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto L5b
            r0 = r5
            r4 = r0
            r0 = r7
            boolean r0 = r0.g()
            r1 = 1
            if (r0 != r1) goto L5b
            r0 = r6
            r4 = r0
            goto L47
        L90:
            r0 = r7
            if (r0 != 0) goto L98
            goto Lc0
        L98:
            r0 = r7
            int r0 = r0.intValue()
            r1 = 5
            if (r0 != r1) goto Lc0
            r0 = r3
            com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity r0 = r0.f101537D
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lba
            r0 = r7
            boolean r0 = r0.g()
            r1 = 1
            if (r0 != r1) goto Lba
            r0 = r6
            r4 = r0
            goto L47
        Lba:
            r0 = 6
            r4 = r0
            goto Lc2
        Lc0:
            r0 = -1
            r4 = r0
        Lc2:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonClockInWidget2.getStatusForReport():int");
    }

    public static void j(String str, Map map) {
        if (str.length() == 0 || ((HashMap) map).isEmpty()) {
            return;
        }
        Neurons.reportClick(false, str, map);
    }

    public final void g(int i7) {
        new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).seasonActivityRecord(SeasonActivityRecordReq.newBuilder().setAction(i7).setActivityId(this.f101563y).setScene(2L).setSeasonId(this.f101564z).setSpmid(this.f101536C).setAid(this.f101534A).setCid(this.f101535B).setActionId(PageViewTracker.getInstance().currentPolarisActionId()).build(), this.f101539F);
    }

    public final void h() {
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://main/checkin/notice").flags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE).extras(new com.bilibili.bililive.room.biz.ad.answer.m(this, 1)).build(), getContext());
    }

    public final void i(UnitedSeasonActivity unitedSeasonActivity, boolean z6) {
        Integer num;
        String strD;
        UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout2;
        TextPaint paint;
        this.f101537D = unitedSeasonActivity;
        this.f101562x = Integer.valueOf(unitedSeasonActivity.l().e());
        this.f101563y = unitedSeasonActivity.b();
        this.f101564z = unitedSeasonActivity.h();
        this.f101561w.setText(unitedSeasonActivity.i().a());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        IconTextDrawable iconDrawable = IconFont.getIconDrawable("calendar_mark_line@500", ContextCompat.getColor(getContext(), R$color.Ga10));
        if (iconDrawable != null) {
            iconDrawable.setBounds(0, 0, NewPlayerUtilsKt.toPx(20.0f), NewPlayerUtilsKt.toPx(20.0f));
        }
        CenterVerticalImageSpan centerVerticalImageSpan = new CenterVerticalImageSpan((String) null, (String) null, (IUrlGetter) null, false, false, iconDrawable, 31, (DefaultConstructorMarker) null);
        centerVerticalImageSpan.setSize(NewPlayerUtilsKt.toPx(20.0f), NewPlayerUtilsKt.toPx(20.0f));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(centerVerticalImageSpan, 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) unitedSeasonActivity.j());
        TextView textView = this.f101540a;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        Integer num2 = this.f101562x;
        boolean z7 = num2 != null && num2.intValue() == 1;
        Integer num3 = this.f101562x;
        boolean z8 = (num3 != null && num3.intValue() == 0) || ((num = this.f101562x) != null && num.intValue() == 3);
        Integer num4 = this.f101562x;
        boolean z9 = num4 != null && num4.intValue() == 1;
        String strE = unitedSeasonActivity.e();
        String strA = C4496a.a("· ", unitedSeasonActivity.i().e());
        TextView textView2 = this.f101545f;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = this.f101545f;
        if (textView3 != null) {
            textView3.setText(unitedSeasonActivity.i().d());
        }
        if (strE.length() > 0) {
            TextView textView4 = this.f101553o;
            if (textView4 != null) {
                textView4.setText(strE);
            }
            TextView textView5 = this.f101553o;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            Space space = this.f101558t;
            if (space != null) {
                space.setVisibility(0);
            }
            if (z7) {
                strD = unitedSeasonActivity.i().d();
                TextView textView6 = this.f101545f;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
                TextView textView7 = this.f101553o;
                if (textView7 != null) {
                    textView7.setText(strE);
                }
                TextView textView8 = this.f101553o;
                if (textView8 != null) {
                    textView8.setVisibility(0);
                }
                Space space2 = this.f101558t;
                if (space2 != null) {
                    space2.setVisibility(0);
                }
                TextView textView9 = this.f101556r;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
                Space space3 = this.f101557s;
                if (space3 != null) {
                    space3.setVisibility(0);
                }
                TextView textView10 = this.f101556r;
                if (textView10 != null) {
                    textView10.setText(strD);
                }
            } else {
                TextView textView11 = this.f101556r;
                if (textView11 != null) {
                    textView11.setVisibility(8);
                }
                Space space4 = this.f101557s;
                strD = strE;
                if (space4 != null) {
                    space4.setVisibility(8);
                    strD = strE;
                }
            }
        } else {
            TextView textView12 = this.f101553o;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
            Space space5 = this.f101558t;
            if (space5 != null) {
                space5.setVisibility(8);
            }
            strD = "";
        }
        UnitedSeasonClockExpandableLayout2 unitedSeasonClockExpandableLayout22 = this.f101552n;
        if (unitedSeasonClockExpandableLayout22 != null) {
            unitedSeasonClockExpandableLayout22.f101527e = true;
            unitedSeasonClockExpandableLayout22.getLayoutParams().height = -2;
        }
        if (z6 && (unitedSeasonClockExpandableLayout2 = this.f101552n) != null && strD.length() != 0) {
            unitedSeasonClockExpandableLayout2.f101527e = true;
            unitedSeasonClockExpandableLayout2.f101530i = strD;
            TextView textView13 = unitedSeasonClockExpandableLayout2.f101532k;
            if (textView13 != null && (paint = textView13.getPaint()) != null) {
                unitedSeasonClockExpandableLayout2.f101531j = UnitedSeasonClockExpandableLayout2.a(new StaticLayout(strD, paint, unitedSeasonClockExpandableLayout2.getMeasuredWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false), strD);
            }
            unitedSeasonClockExpandableLayout2.getLayoutParams().height = -2;
            unitedSeasonClockExpandableLayout2.b();
        }
        if (strA.length() > 0) {
            TextView textView14 = this.f101555q;
            if (textView14 != null) {
                textView14.setText(strA);
            }
            TextView textView15 = this.f101555q;
            if (textView15 != null) {
                textView15.setVisibility(0);
            }
        } else {
            TextView textView16 = this.f101555q;
            if (textView16 != null) {
                textView16.setVisibility(8);
            }
        }
        if (z8) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String string = getContext().getString(2131824523);
            String string2 = getContext().getString(2131824524);
            String strB = com.bilibili.playset.utils.a.b(unitedSeasonActivity.f());
            String strB2 = com.bilibili.playset.utils.a.b(unitedSeasonActivity.a());
            spannableStringBuilder2.append((CharSequence) "· ");
            spannableStringBuilder2.append((CharSequence) strB);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.Ga10)), spannableStringBuilder2.length() - strB.length(), spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) string);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.Ga5)), spannableStringBuilder2.length() - string.length(), spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) strB2);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.Ga10)), spannableStringBuilder2.length() - strB2.length(), spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) string2);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R$color.Ga5)), spannableStringBuilder2.length() - string2.length(), spannableStringBuilder2.length(), 33);
            TextView textView17 = this.f101554p;
            if (textView17 != null) {
                textView17.setText(spannableStringBuilder2);
            }
            TextView textView18 = this.f101554p;
            if (textView18 != null) {
                textView18.setVisibility(0);
            }
        } else {
            TextView textView19 = this.f101554p;
            if (textView19 != null) {
                textView19.setVisibility(8);
            }
        }
        this.f101560v.setVisibility(z9 ? 0 : 8);
        if (unitedSeasonActivity.i().a().length() > 3) {
            ViewGroup.LayoutParams layoutParams = this.f101561w.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) DpUtils.dp2px(getContext(), 68.0f);
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f101561w.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = (int) DpUtils.dp2px(getContext(), 56.0f);
            }
        }
        Integer num5 = this.f101562x;
        this.f101562x = num5;
        if (num5 != null && num5.intValue() == 0) {
            this.f101561w.setClickable(true);
            m(false);
            this.f101561w.setTextColor(ContextCompat.getColor(getContext(), R$color.Brand_pink));
            this.f101561w.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(0, 0.5f, 12, ContextCompat.getColor(getContext(), R$color.Brand_pink)));
        } else if (num5 != null && num5.intValue() == 3) {
            this.f101561w.setClickable(true);
            m(false);
            this.f101561w.setTextColor(ContextCompat.getColor(getContext(), R$color.Brand_pink));
            this.f101561w.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(0, 0.5f, 12, ContextCompat.getColor(getContext(), R$color.Brand_pink)));
        } else if (num5 != null && num5.intValue() == 1) {
            this.f101561w.setClickable(true);
            m(true);
            l(true);
            this.f101561w.setTextColor(ContextCompat.getColor(getContext(), R$color.Text2));
            this.f101561w.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(0, 0.5f, 12, ContextCompat.getColor(getContext(), R$color.Line_bold)));
        } else if (num5 != null && num5.intValue() == 2) {
            this.f101561w.setClickable(true);
            m(true);
            l(false);
            this.f101561w.setTextColor(ContextCompat.getColor(getContext(), R$color.Brand_pink));
            this.f101561w.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(0, 0.5f, 12, ContextCompat.getColor(getContext(), R$color.Brand_pink)));
            SeasonWidgetExposeReq.b bVarNewBuilder = SeasonWidgetExposeReq.newBuilder();
            bVarNewBuilder.setActivityId(this.f101563y).setAid(this.f101534A).setCid(this.f101535B).setMid(BiliAccounts.get(getContext()).mid()).setSeasonId(this.f101564z).setType(1).setScene(4L).build();
            new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).seasonWidgetExpose(bVarNewBuilder.build(), (MossResponseHandler) null);
        } else if ((num5 != null && num5.intValue() == 4) || (num5 != null && num5.intValue() == 5)) {
            m(true);
            l(!Intrinsics.areEqual(unitedSeasonActivity.l() != null ? Integer.valueOf(r0.d()) : null, Integer.valueOf(unitedSeasonActivity.d())));
            if (unitedSeasonActivity.g()) {
                this.f101561w.setClickable(true);
                this.f101561w.setTextColor(ContextCompat.getColor(getContext(), R$color.Brand_pink));
                this.f101561w.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(0, 0.5f, 12, ContextCompat.getColor(getContext(), R$color.Brand_pink)));
            } else {
                this.f101561w.setClickable(false);
                this.f101561w.setTextColor(ContextCompat.getColor(getContext(), R$color.Text2));
                this.f101561w.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(0, 0.5f, 12, ContextCompat.getColor(getContext(), R$color.Line_bold)));
            }
            SeasonWidgetExposeReq.b bVarNewBuilder2 = SeasonWidgetExposeReq.newBuilder();
            SeasonWidgetExposeReq.b type = bVarNewBuilder2.setActivityId(this.f101563y).setAid(this.f101534A).setCid(this.f101535B).setMid(BiliAccounts.get(getContext()).mid()).setSeasonId(this.f101564z).setType(1);
            Integer num6 = this.f101562x;
            type.setScene((num6 != null && num6.intValue() == 4) ? 3L : 2L).build();
            new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).seasonWidgetExpose(bVarNewBuilder2.build(), (MossResponseHandler) null);
        }
        TextView textView20 = this.f101541b;
        if (textView20 != null) {
            textView20.setText(unitedSeasonActivity.i().c());
        }
        ImageView imageView = this.f101549k;
        if (imageView != null) {
            imageView.setVisibility(unitedSeasonActivity.l().a() == 2 ? 0 : 8);
        }
        TextView textView21 = this.f101542c;
        if (textView21 != null) {
            textView21.setText(unitedSeasonActivity.i().b());
        }
        TextView textView22 = this.f101543d;
        if (textView22 != null) {
            textView22.setText(unitedSeasonActivity.l().d() + "/" + unitedSeasonActivity.d());
        }
        TextView textView23 = this.f101544e;
        if (textView23 != null) {
            textView23.setText(String.valueOf(unitedSeasonActivity.l().f()));
        }
        BiliImageView biliImageView = this.h;
        if (biliImageView != null) {
            ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(getContext()).url(unitedSeasonActivity.l().c()), 2131233999, (ScaleType) null, 2, (Object) null).into(biliImageView);
        }
    }

    public final void k() {
        HashMap map = new HashMap(5);
        UnitedSeasonActivity unitedSeasonActivity = this.f101537D;
        map.put("checkin_type", String.valueOf(unitedSeasonActivity != null ? Integer.valueOf(unitedSeasonActivity.k()) : null));
        map.put("clock_in_status", String.valueOf(getStatusForReport()));
        if (map.isEmpty()) {
            return;
        }
        Neurons.reportExposure$default(false, "united.player-video-detail.drama-float.clockin.show", map, (List) null, 8, (Object) null);
    }

    public final void l(boolean z6) {
        if (z6) {
            TextView textView = this.f101550l;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f101551m;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView3 = this.f101550l;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.f101551m;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    public final void m(boolean z6) {
        ConstraintLayout constraintLayout = this.f101547i;
        if (constraintLayout == null) {
            return;
        }
        this.f101559u = true;
        addOnLayoutChangeListener(new d(constraintLayout.getHeight(), this));
        constraintLayout.setVisibility(z6 ? 0 : 8);
    }

    public final void setClockStateChangedListener(@NotNull InterfaceC6340b interfaceC6340b) {
        this.f101538E = interfaceC6340b;
    }
}

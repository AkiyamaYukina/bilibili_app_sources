package com.bilibili.upper.module.honour.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import bk.x;
import cI0.C5246a;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.aurorasdk.AuroraVersion;
import com.bilibili.base.BiliContext;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.montage.MontageVersion;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.videoeditor.extension.ActivityExtKt;
import com.bilibili.upper.module.honour.bean.KingHonourGameBean;
import com.bilibili.upper.module.honour.bean.KingHonourPreviewBean;
import com.bilibili.upper.module.honour.net.KingHonourApiService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/p.class */
@StabilityInferred(parameters = 1)
public final class p {
    public static final void a(Context context, String str, KingHonourPreviewBean kingHonourPreviewBean, boolean z6, boolean z7) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        bundle.putSerializable("king_honour_local_video_path", arrayList);
        bundle.putSerializable("king_honour_publish_data", kingHonourPreviewBean);
        bundle.putBoolean("king_honour_is_from_banner", z6);
        bundle.putBoolean("king_honour_is_from_game_factory", z7);
        RouteRequest routeRequestBuild = new RouteRequest.Builder("activity://upper/king_honour/publish").extras(new com.bilibili.tgwt.filmselection.l(bundle, 1)).build();
        BLog.e("KingHonourManager", "jump to publish activity");
        BLRouter.routeTo(routeRequestBuild, context);
    }

    public static void b(Context context, C5246a c5246a, KingHonourGameBean kingHonourGameBean, boolean z6, int i7, int i8) {
        if ((i8 & 8) != 0) {
            z6 = false;
        }
        if ((i8 & 16) != 0) {
            i7 = 0;
        }
        String str = kingHonourGameBean.heroIcon;
        if (str != null) {
            BiliImageLoader.INSTANCE.with(context).url(str).into(c5246a.f58823a);
        }
        if (Intrinsics.areEqual(kingHonourGameBean.loseMvp, "1")) {
            c5246a.f58824b.setVisibility(0);
            c5246a.f58824b.setBackground(context.getDrawable(2131241281));
        } else if (Intrinsics.areEqual(kingHonourGameBean.mvpCnt, "1")) {
            c5246a.f58824b.setVisibility(0);
            c5246a.f58824b.setBackground(context.getDrawable(2131241292));
        } else {
            c5246a.f58824b.setVisibility(8);
        }
        if (i7 == 2) {
            TextView textView = c5246a.f58833l;
            if (textView != null) {
                Activity activity = BiliContext.topActivity();
                boolean zIsActive = ActivityExtKt.isActive(activity);
                Context fapp = activity;
                if (!zIsActive) {
                    fapp = FoundationAlias.getFapp();
                }
                x.a(textView, fapp.getString(2131851312), kingHonourGameBean.killCnt);
            }
            TextView textView2 = c5246a.f58834m;
            if (textView2 != null) {
                Activity activity2 = BiliContext.topActivity();
                boolean zIsActive2 = ActivityExtKt.isActive(activity2);
                Context fapp2 = activity2;
                if (!zIsActive2) {
                    fapp2 = FoundationAlias.getFapp();
                }
                x.a(textView2, fapp2.getString(2131851213), kingHonourGameBean.deadCnt);
            }
            TextView textView3 = c5246a.f58835n;
            if (textView3 != null) {
                Activity activity3 = BiliContext.topActivity();
                boolean zIsActive3 = ActivityExtKt.isActive(activity3);
                Context fapp3 = activity3;
                if (!zIsActive3) {
                    fapp3 = FoundationAlias.getFapp();
                }
                x.a(textView3, fapp3.getString(2131850999), kingHonourGameBean.assistCnt);
            }
            TextView textView4 = c5246a.f58832k;
            if (textView4 != null) {
                textView4.setText(kingHonourGameBean.heroName);
            }
        } else {
            String strA = U1.i.a(kingHonourGameBean.killCnt, "/", kingHonourGameBean.deadCnt, "/", kingHonourGameBean.assistCnt);
            TextView textView5 = c5246a.f58831j;
            if (textView5 != null) {
                textView5.setText(strA);
            }
            TextView textView6 = c5246a.f58831j;
            if (textView6 != null) {
                textView6.setTextColor(Color.parseColor("#9499A0"));
            }
        }
        c5246a.f58827e.setVisibility(0);
        c5246a.f58828f.setVisibility(0);
        if (kingHonourGameBean.pentaKillCnt > 0) {
            c5246a.f58827e.setText(context.getString(2131851198));
        } else if (kingHonourGameBean.quadraKillCnt > 0) {
            c5246a.f58827e.setText(context.getString(2131850967));
        } else if (kingHonourGameBean.tripleKillCnt > 0) {
            c5246a.f58827e.setText(context.getString(2131851290));
        } else {
            c5246a.f58827e.setVisibility(8);
            c5246a.f58828f.setVisibility(8);
        }
        String str2 = kingHonourGameBean.branchEvaluateName;
        if (str2 == null || str2.length() == 0) {
            c5246a.f58826d.setVisibility(8);
            if (!z6) {
                c5246a.f58827e.setVisibility(8);
                c5246a.f58828f.setVisibility(8);
            }
        } else if (StringsKt.n(kingHonourGameBean.branchEvaluateName, "金牌")) {
            c5246a.f58826d.setVisibility(0);
            c5246a.f58826d.setText(kingHonourGameBean.branchEvaluateName);
            c5246a.f58826d.setTextColor(Color.parseColor("#663D00"));
            c5246a.f58826d.setBackground(context.getDrawable(2131232058));
        } else if (StringsKt.n(kingHonourGameBean.branchEvaluateName, "银牌")) {
            c5246a.f58826d.setVisibility(0);
            c5246a.f58826d.setText(kingHonourGameBean.branchEvaluateName);
            c5246a.f58826d.setBackground(context.getDrawable(2131232060));
            c5246a.f58826d.setTextColor(Color.parseColor("#394C64"));
        } else {
            c5246a.f58826d.setVisibility(8);
            if (!z6) {
                c5246a.f58827e.setVisibility(8);
                c5246a.f58828f.setVisibility(8);
            }
        }
        TextView textView7 = c5246a.f58830i;
        int i9 = kingHonourGameBean.valorType;
        textView7.setText(i9 != 1 ? i9 != 4 ? i9 != 7 ? "" : (String) KingHonourConstant.f113326c.getValue() : (String) KingHonourConstant.f113325b.getValue() : (String) KingHonourConstant.f113324a.getValue());
        if (z6) {
            c5246a.f58825c.setText(kingHonourGameBean.heroName);
            c5246a.f58825c.setTextColor(Color.parseColor("#FFFFFF"));
            c5246a.h.setText(context.getString(2131851065));
            c5246a.f58829g.setVisibility(8);
            TextView textView8 = c5246a.f58831j;
            if (textView8 != null) {
                textView8.setTextColor(Color.parseColor("#C9CCD0"));
                return;
            }
            return;
        }
        if (kingHonourGameBean.topFlag == 1) {
            ImageView imageView = c5246a.f58838q;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            c5246a.f58825c.setVisibility(8);
            if (Intrinsics.areEqual(kingHonourGameBean.gameResult, "1")) {
                ImageView imageView2 = c5246a.f58838q;
                if (imageView2 != null) {
                    imageView2.setBackground(context.getDrawable(2131241291));
                }
            } else {
                ImageView imageView3 = c5246a.f58838q;
                if (imageView3 != null) {
                    imageView3.setBackground(context.getDrawable(2131241278));
                }
            }
        } else {
            ImageView imageView4 = c5246a.f58838q;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            c5246a.f58825c.setVisibility(0);
            if (Intrinsics.areEqual(kingHonourGameBean.gameResult, "1")) {
                c5246a.f58825c.setText(context.getString(2131851136));
                c5246a.f58825c.setTextColor(Color.parseColor("#FAD493"));
            } else {
                c5246a.f58825c.setText(context.getString(2131851179));
                c5246a.f58825c.setTextColor(Color.parseColor("#AEC2EC"));
            }
        }
        c5246a.f58829g.setVisibility(0);
        c5246a.f58829g.setText(kingHonourGameBean.gameTime);
        e(false, c5246a);
        if (kingHonourGameBean.repoState == 1) {
            LinearLayout linearLayout = c5246a.f58836o;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            c5246a.h.setVisibility(8);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, 2130772024);
            ImageView imageView5 = c5246a.f58837p;
            if (imageView5 != null) {
                imageView5.startAnimation(animationLoadAnimation);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = c5246a.f58836o;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        c5246a.h.setVisibility(0);
        int i10 = kingHonourGameBean.repoState;
        if (i10 == 0) {
            c5246a.h.getLayoutParams().width = ListExtentionsKt.toPx(72);
            c5246a.h.setText(context.getString(2131851052));
            c5246a.h.setBackground(context.getDrawable(2131232057));
            c5246a.h.setTextColor(Color.parseColor("#FFFFFF"));
            return;
        }
        if (i10 == 2) {
            c5246a.h.getLayoutParams().width = ListExtentionsKt.toPx(72);
            c5246a.h.setText(context.getString(2131851158));
            c5246a.h.setBackground(context.getDrawable(2131232059));
            c5246a.h.setTextColor(Color.parseColor("#4D2932"));
            return;
        }
        c5246a.h.getLayoutParams().width = -2;
        c5246a.h.setText(context.getString(2131850918));
        c5246a.h.setBackground(null);
        c5246a.h.setTextColor(context.getColor(2131104162));
        e(true, c5246a);
    }

    public static void c(Context context, long j7, long j8, long j9, long j10, boolean z6, boolean z7, int i7) {
        if ((i7 & 32) != 0) {
            z6 = false;
        }
        if ((i7 & 64) != 0) {
            z7 = false;
        }
        eI0.e eVar = new eI0.e(context);
        eVar.show();
        BLog.e("KingHonourManager", "start request");
        long jCurrentTimeMillis = System.currentTimeMillis();
        KingHonourApiService kingHonourApiService = (KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class);
        com.bilibili.studio.editor.timeline.d.f108285a.getClass();
        String auroraVersion = AuroraVersion.getAuroraVersion();
        String str = auroraVersion;
        if (auroraVersion == null) {
            str = "";
        }
        kingHonourApiService.getPreviewInfo(j7, j8, j9, j10, "mon", str, MontageVersion.getVersion()).enqueue(new m(eVar, context, z6, z7, jCurrentTimeMillis));
    }

    public static void d(Context context, boolean z6, final boolean z7, final boolean z8, int i7) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        BLRouter.routeTo(new RouteRequest.Builder("activity://upper/king_honour/battle").extras(new Function1(z7, z8) { // from class: com.bilibili.upper.module.honour.utils.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f113347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f113348b;

            {
                this.f113347a = z7;
                this.f113348b = z8;
            }

            public final Object invoke(Object obj) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("king_honour_user_is_grant", this.f113347a);
                bundle.putBoolean("king_honour_is_from_game_factory", this.f113348b);
                Unit unit = Unit.INSTANCE;
                ((MutableBundleLike) obj).put("param_control", bundle);
                return Unit.INSTANCE;
            }
        }).build(), context);
        if (z6) {
            new SharedPreferencesHelper(context).setBoolean("first_use_king_honour", true);
        }
    }

    public static void e(boolean z6, C5246a c5246a) {
        if (z6) {
            c5246a.f58825c.setAlpha(0.4f);
            TextView textView = c5246a.f58831j;
            if (textView != null) {
                textView.setAlpha(0.4f);
            }
            c5246a.f58830i.setAlpha(0.4f);
            c5246a.f58823a.setAlpha(0.4f);
            return;
        }
        c5246a.f58825c.setAlpha(1.0f);
        TextView textView2 = c5246a.f58831j;
        if (textView2 != null) {
            textView2.setAlpha(1.0f);
        }
        c5246a.f58830i.setAlpha(1.0f);
        c5246a.f58823a.setAlpha(1.0f);
    }
}

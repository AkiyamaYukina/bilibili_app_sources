package com.bilibili.pegasus.holders;

import android.app.Application;
import android.graphics.Color;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListConstKt;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pegasus.compat.PegasusCoverStyle;
import com.bilibili.pegasus.data.card.RecommendReasonStyle;
import com.bilibili.pegasus.data.component.AvatarData;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.widget.PendantAvatarFrameLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/k1.class */
@StabilityInferred(parameters = 0)
public final class k1 extends AbstractC5652d<fp0.x> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final aq0.Q0 f77887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final g1 f77888g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/k1$a.class */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f77889a;

        public a(k1 k1Var) {
            this.f77889a = k1Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ThemeWatcher.getInstance().subscribe(this.f77889a.f77888g);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ThemeWatcher.getInstance().unSubscribe(this.f77889a.f77888g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.pegasus.holders.g1] */
    public k1(@NotNull aq0.Q0 q02) {
        super(q02.f53838a);
        this.f77887f = q02;
        this.f77888g = new ThemeWatcher.Observer(this) { // from class: com.bilibili.pegasus.holders.g1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k1 f77870a;

            {
                this.f77870a = this;
            }

            @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
            public final void onThemeChanged() {
                k1 k1Var = this.f77870a;
                k1Var.f77887f.f53845i.setTextColor(k1Var.z0());
            }
        };
        this.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.pegasus.holders.h1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k1 f77875a;

            {
                this.f77875a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    r0 = r7
                    com.bilibili.pegasus.holders.k1 r0 = r0.f77875a
                    r8 = r0
                    r0 = r8
                    android.view.View r0 = r0.itemView
                    android.content.Context r0 = r0.getContext()
                    r10 = r0
                    r0 = r8
                    com.bilibili.pegasus.PegasusHolderData r0 = r0.getBindData()
                    com.bilibili.pegasus.data.base.BasePegasusData r0 = (com.bilibili.pegasus.data.base.BasePegasusData) r0
                    r11 = r0
                    r0 = r8
                    com.bilibili.pegasus.PegasusHolderData r0 = r0.getBindData()
                    fp0.x r0 = (fp0.x) r0
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L3f
                    r0 = r8
                    com.bilibili.pegasus.data.component.AvatarData r0 = r0.getAvatar()
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L3f
                    r0 = r8
                    long r0 = r0.getMid()
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r9 = r0
                    r0 = r9
                    r8 = r0
                    r0 = r9
                    if (r0 != 0) goto L3c
                    goto L3f
                L3c:
                    goto L45
                L3f:
                    java.lang.String r0 = ""
                    r8 = r0
                    goto L3c
                L45:
                    r0 = r10
                    r1 = r11
                    r2 = 0
                    r3 = r8
                    r4 = 0
                    r5 = 988(0x3dc, float:1.384E-42)
                    op0.C8249a.e(r0, r1, r2, r3, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.h1.onClick(android.view.View):void");
            }
        });
        this.itemView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: com.bilibili.pegasus.holders.i1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k1 f77879a;

            {
                this.f77879a = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                k1 k1Var = this.f77879a;
                rp0.p.c(k1Var, true, ListExtentionsKt.getGlobalRect(k1Var.f77887f.f53843f));
                return true;
            }
        });
        final int i7 = 0;
        q02.f53843f.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.pegasus.holders.j1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77884b;

            {
                this.f77883a = i7;
                this.f77884b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f77883a) {
                    case 0:
                        k1 k1Var = (k1) this.f77884b;
                        rp0.p.c(k1Var, false, ListExtentionsKt.getGlobalRect(k1Var.f77887f.f53843f));
                        break;
                    default:
                        ((com.bilibili.video.story.view.web.d) this.f77884b).u();
                        break;
                }
            }
        });
        this.itemView.addOnAttachStateChangeListener(new a(this));
    }

    public static final void y0(k1 k1Var, boolean z6) {
        fp0.q qVarH;
        fp0.x xVar = (fp0.x) k1Var.getBindData();
        boolean z7 = false;
        if (xVar != null) {
            fp0.q qVarH2 = xVar.h();
            z7 = false;
            if (qVarH2 != null) {
                z7 = false;
                if (qVarH2.a() == 1) {
                    z7 = true;
                }
            }
        }
        fp0.x xVar2 = (fp0.x) k1Var.getBindData();
        if (xVar2 != null && (qVarH = xVar2.h()) != null) {
            qVarH.c(z6 ? 1 : 0);
        }
        k1Var.f77887f.f53842e.updateUI(z6, z7);
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, tv.danmaku.bili.widget.PendantAvatarFrameLayout$a] */
    public final void A0() {
        AvatarData avatar;
        int px = ListExtentionsKt.toPx(((double) PegasusCoverStyle.INSTANCE.getCoverRatio()) >= 1.5d ? 64 : 80);
        PendantAvatarFrameLayout pendantAvatarFrameLayout = this.f77887f.f53844g;
        PendantAvatarFrameLayout.ShowParams showParams = new PendantAvatarFrameLayout.ShowParams();
        showParams.mode(1);
        showParams.defaultAvatar(2131232458);
        fp0.x xVar = (fp0.x) getBindData();
        showParams.avatarImgUrl((xVar == null || (avatar = xVar.getAvatar()) == null) ? null : avatar.getCover());
        showParams.borderWidth(2.0f);
        showParams.borderColor(R$color.Wh0_u);
        showParams.mIsBadgeShow = Boolean.TRUE;
        fp0.x xVar2 = (fp0.x) getBindData();
        if (xVar2 != null) {
            showParams.badgeImgRes(ListConstKt.getIconRes(xVar2.getOfficialIconV2()));
        }
        int i7 = (int) (((double) px) * 0.22d);
        int px2 = ListExtentionsKt.toPx(2.0f * 2);
        ?? obj = new Object();
        ((PendantAvatarFrameLayout.a) obj).a = px;
        int i8 = px - px2;
        ((PendantAvatarFrameLayout.a) obj).b = i8;
        ((PendantAvatarFrameLayout.a) obj).c = px2;
        ((PendantAvatarFrameLayout.a) obj).d = i8;
        ((PendantAvatarFrameLayout.a) obj).e = i7;
        ((PendantAvatarFrameLayout.a) obj).f = px2;
        ((PendantAvatarFrameLayout.a) obj).g = px;
        showParams.dynamicAvatarSize((PendantAvatarFrameLayout.a) obj);
        pendantAvatarFrameLayout.show(showParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(@org.jetbrains.annotations.NotNull fp0.x r13) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.k1.u0(fp0.x):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFirstExpose(@org.jetbrains.annotations.NotNull fp0.x r7, int r8) {
        /*
            r6 = this;
            r0 = r7
            com.bilibili.pegasus.data.component.AvatarData r0 = r0.getAvatar()
            r9 = r0
            java.lang.String r0 = ""
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L1f
            r0 = r9
            long r0 = r0.getMid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L23
        L1f:
            java.lang.String r0 = ""
            r9 = r0
        L23:
            java.lang.String r0 = "sub_param"
            r1 = r9
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r12 = r0
            java.lang.String r0 = "banner_index"
            r1 = r8
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r13 = r0
            r0 = r6
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.pegasus.PegasusFragment
            if (r0 == 0) goto L4c
            r0 = r9
            com.bilibili.pegasus.PegasusFragment r0 = (com.bilibili.pegasus.PegasusFragment) r0
            r9 = r0
            goto L4e
        L4c:
            r0 = 0
            r9 = r0
        L4e:
            r0 = r11
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L68
            r0 = r9
            java.lang.String r0 = r0.isShouping()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L68
            r0 = r11
            r10 = r0
            goto L68
        L68:
            r0 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            r3 = r12
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r13
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "is_shouping"
            r4 = r10
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r9 = r0
            r0 = r7
            r1 = r7
            com.bilibili.pegasus.HolderExtra r1 = r1.f119131H
            int r1 = r1.getIndexInResponse()
            r2 = r9
            pp0.C8340D.j(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.k1.onFirstExpose(fp0.x, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRecoverFirstExpose(@org.jetbrains.annotations.NotNull fp0.x r7, int r8) {
        /*
            r6 = this;
            r0 = r7
            com.bilibili.pegasus.data.component.AvatarData r0 = r0.getAvatar()
            r9 = r0
            java.lang.String r0 = ""
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L1f
            r0 = r9
            long r0 = r0.getMid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L23
        L1f:
            java.lang.String r0 = ""
            r9 = r0
        L23:
            java.lang.String r0 = "sub_param"
            r1 = r9
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r12 = r0
            java.lang.String r0 = "banner_index"
            r1 = r8
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r13 = r0
            r0 = r6
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof com.bilibili.pegasus.PegasusFragment
            if (r0 == 0) goto L4d
            r0 = r9
            com.bilibili.pegasus.PegasusFragment r0 = (com.bilibili.pegasus.PegasusFragment) r0
            r10 = r0
            goto L50
        L4d:
            r0 = 0
            r10 = r0
        L50:
            r0 = r11
            r9 = r0
            r0 = r10
            if (r0 == 0) goto L68
            r0 = r10
            java.lang.String r0 = r0.isShouping()
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L68
            r0 = r11
            r9 = r0
            goto L68
        L68:
            r0 = 3
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            r3 = r12
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r13
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "is_shouping"
            r4 = r9
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r9 = r0
            r0 = r7
            r1 = r7
            com.bilibili.pegasus.HolderExtra r1 = r1.f119131H
            int r1 = r1.getIndexInResponse()
            r2 = r9
            pp0.C8340D.l(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.k1.onRecoverFirstExpose(fp0.x, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // com.bilibili.pegasus.holders.AbstractC5652d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onExposeEnd(int r9, @org.jetbrains.annotations.NotNull android.view.View r10) {
        /*
            r8 = this;
            r0 = r8
            com.bilibili.pegasus.PegasusHolderData r0 = r0.getBindData()
            fp0.x r0 = (fp0.x) r0
            r14 = r0
            r0 = r14
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = r14
            com.bilibili.pegasus.HolderExtra r0 = r0.f119131H
            r15 = r0
            r0 = r15
            long r0 = r0.getCardStartTime()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            return
        L21:
            long r0 = java.lang.System.currentTimeMillis()
            r11 = r0
            r0 = r11
            r1 = r15
            long r1 = r1.getCardStartTime()
            long r0 = r0 - r1
            com.bilibili.app.comm.list.common.feed.PegasusExposeConfig r1 = com.bilibili.app.comm.list.common.feed.PegasusExposeConfig.INSTANCE
            long r1 = r1.getExposeMinReportTimeMs()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3d
            r0 = r15
            r1 = 0
            r0.setCardStartTime(r1)
            return
        L3d:
            r0 = r14
            com.bilibili.pegasus.data.component.AvatarData r0 = r0.getAvatar()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L58
            r0 = r10
            long r0 = r0.getMid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13 = r0
            r0 = r13
            r10 = r0
            r0 = r13
            if (r0 != 0) goto L5c
        L58:
            java.lang.String r0 = ""
            r10 = r0
        L5c:
            r0 = 2
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "sub_param"
            r4 = r10
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "banner_index"
            r4 = r9
            java.lang.String r4 = java.lang.String.valueOf(r4)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r10 = r0
            r0 = r14
            r1 = r15
            int r1 = r1.getIndexInResponse()
            r2 = r15
            long r2 = r2.getCardStartTime()
            r3 = r11
            r4 = r10
            pp0.C8340D.i(r0, r1, r2, r3, r4)
            r0 = r15
            r1 = 0
            r0.setCardStartTime(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.k1.onExposeEnd(int, android.view.View):void");
    }

    public final int z0() {
        int color;
        Application application = BiliContext.application();
        if (application != null ? MultipleThemeUtils.isNightTheme(application) : false) {
            fp0.x xVar = (fp0.x) getBindData();
            String textColorNight = "#FF000000";
            if (xVar != null) {
                RecommendReasonStyle recommendReasonStyleG = xVar.g();
                textColorNight = "#FF000000";
                if (recommendReasonStyleG != null) {
                    textColorNight = recommendReasonStyleG.getTextColorNight();
                    if (textColorNight == null) {
                        textColorNight = "#FF000000";
                    }
                }
            }
            color = Color.parseColor(textColorNight);
        } else {
            fp0.x xVar2 = (fp0.x) getBindData();
            String textColor = "#FF000000";
            if (xVar2 != null) {
                RecommendReasonStyle recommendReasonStyleG2 = xVar2.g();
                textColor = "#FF000000";
                if (recommendReasonStyleG2 != null) {
                    textColor = recommendReasonStyleG2.getTextColor();
                    if (textColor == null) {
                        textColor = "#FF000000";
                    }
                }
            }
            color = Color.parseColor(textColor);
        }
        return color;
    }
}

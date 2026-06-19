package com.bilibili.pegasus.holders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.app.comm.list.common.feed.PegasusExposeConfig;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.compose.theme.BiliColors;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.pegasus.BasePegasusHolder;
import com.bilibili.pegasus.FontSizeStrategy;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/d.class */
@StabilityInferred(parameters = 0)
public abstract class AbstractC5652d<T extends BasePegasusData> extends BasePegasusHolder<T> implements ExposeItem {
    public void onExposeEnd(int i7, @NotNull View view) {
        BasePegasusData basePegasusData = (BasePegasusData) getBindData();
        if (basePegasusData == null || basePegasusData.getExtra().getCardStartTime() == 0) {
            return;
        }
        if (((Boolean) com.bilibili.pegasus.common.o.f75657a.getValue()).booleanValue()) {
            com.bilibili.app.authorspace.ui.pages.V.a(basePegasusData.getExtra().getIndexInResponse(), "onExposeEnd, pos = ", ", title = ", basePegasusData.getTitle(), "[NewPegasus]BaseHolder");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - basePegasusData.getExtra().getCardStartTime() < PegasusExposeConfig.INSTANCE.getExposeMinReportTimeMs()) {
            basePegasusData.getExtra().setCardStartTime(0L);
        } else {
            C8340D.i(basePegasusData, basePegasusData.getExtra().getIndexInResponse(), basePegasusData.getExtra().getCardStartTime(), jCurrentTimeMillis, null);
            basePegasusData.getExtra().setCardStartTime(0L);
        }
    }

    public void onExposeStart(int i7, @NotNull View view) {
        BasePegasusData basePegasusData = (BasePegasusData) getBindData();
        if (basePegasusData == null) {
            return;
        }
        if (((Boolean) com.bilibili.pegasus.common.o.f75657a.getValue()).booleanValue()) {
            com.bilibili.app.authorspace.ui.pages.V.a(basePegasusData.getExtra().getIndexInResponse(), "onExposeStart, pos = ", ", title = ", basePegasusData.getTitle(), "[NewPegasus]BaseHolder");
        }
        basePegasusData.getExtra().setCardStartTime(System.currentTimeMillis());
    }

    public void p0() {
        FragmentActivity fragmentActivityP3;
        Fragment fragment = getFragment();
        if (fragment == null || (fragmentActivityP3 = fragment.p3()) == null) {
            return;
        }
        final int i7 = 0;
        ScreenAdjustUtilsKt.collectWindowSize$default(fragmentActivityP3, false, new Function1(this, i7) { // from class: com.bilibili.pegasus.holders.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f77841a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f77842b;

            {
                this.f77841a = i7;
                this.f77842b = this;
            }

            public final Object invoke(Object obj) {
                switch (this.f77841a) {
                    case 0:
                        WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
                        float f7 = FontSizeStrategy.CARD_TITLE.get(windowSizeClass);
                        float f8 = FontSizeStrategy.CARD_SUBTITLE.get(windowSizeClass);
                        AbstractC5652d abstractC5652d = (AbstractC5652d) this.f77842b;
                        TextView textViewT0 = abstractC5652d.t0();
                        if (textViewT0 != null) {
                            textViewT0.setTextSize(2, f7);
                        }
                        TextView textViewQ0 = abstractC5652d.q0();
                        if (textViewQ0 != null) {
                            textViewQ0.setTextSize(2, f8);
                        }
                        TextView textViewR0 = abstractC5652d.r0();
                        if (textViewR0 != null) {
                            textViewR0.setTextSize(2, f8);
                        }
                        TextView textViewS0 = abstractC5652d.s0();
                        if (textViewS0 != null) {
                            textViewS0.setTextSize(2, f8);
                        }
                        break;
                    default:
                        DrawScope drawScope = (DrawScope) obj;
                        BiliColors biliColors = (BiliColors) this.f77842b;
                        DrawScope.m2898drawCircleVaOC9Bg$default(drawScope, biliColors.getBg3-0d7_KjU(), 0.0f, 0L, 0.0f, null, null, 0, SearchBangumiItem.TYPE_FULLNET_MOVIE, null);
                        DrawScope.m2898drawCircleVaOC9Bg$default(drawScope, biliColors.getStress_red-0d7_KjU(), drawScope.mo1270toPx0680j_4(Dp.m3880constructorimpl(3)), 0L, 0.0f, null, null, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 1, (Object) null);
    }

    @Nullable
    public TextView q0() {
        return null;
    }

    @Nullable
    public TextView r0() {
        return null;
    }

    @Nullable
    public TextView s0() {
        return null;
    }

    @Nullable
    public TextView t0() {
        return null;
    }

    @Override // 
    public void u0(@NotNull T t7) {
        p0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // 
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFirstExpose(@org.jetbrains.annotations.NotNull T r5, int r6) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super/*com.bilibili.pegasus.PegasusHolder*/.onFirstExpose(r1, r2)
            r0 = r4
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.pegasus.PegasusFragment
            if (r0 == 0) goto L1a
            r0 = r7
            com.bilibili.pegasus.PegasusFragment r0 = (com.bilibili.pegasus.PegasusFragment) r0
            r7 = r0
            goto L1c
        L1a:
            r0 = 0
            r7 = r0
        L1c:
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = r7
            java.lang.String r0 = r0.isShouping()
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L31
        L2e:
            java.lang.String r0 = ""
            r7 = r0
        L31:
            java.lang.String r0 = "is_shouping"
            r1 = r7
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r7 = r0
            r0 = r5
            r1 = r5
            com.bilibili.pegasus.HolderExtra r1 = r1.getExtra()
            int r1 = r1.getIndexInResponse()
            r2 = r7
            pp0.C8340D.j(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.AbstractC5652d.onFirstExpose(com.bilibili.pegasus.data.base.BasePegasusData, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // 
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRecoverFirstExpose(@org.jetbrains.annotations.NotNull T r5, int r6) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super/*com.bilibili.pegasus.PegasusHolder*/.onRecoverFirstExpose(r1, r2)
            r0 = r4
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.pegasus.PegasusFragment
            if (r0 == 0) goto L1a
            r0 = r7
            com.bilibili.pegasus.PegasusFragment r0 = (com.bilibili.pegasus.PegasusFragment) r0
            r7 = r0
            goto L1c
        L1a:
            r0 = 0
            r7 = r0
        L1c:
            r0 = r7
            if (r0 == 0) goto L2e
            r0 = r7
            java.lang.String r0 = r0.isShouping()
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L31
        L2e:
            java.lang.String r0 = ""
            r7 = r0
        L31:
            java.lang.String r0 = "is_shouping"
            r1 = r7
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r7 = r0
            r0 = r5
            r1 = r5
            com.bilibili.pegasus.HolderExtra r1 = r1.getExtra()
            int r1 = r1.getIndexInResponse()
            r2 = r7
            pp0.C8340D.l(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.holders.AbstractC5652d.onRecoverFirstExpose(com.bilibili.pegasus.data.base.BasePegasusData, int):void");
    }

    public void x0(@Nullable View view) {
        boolean z6;
        BasePegasusData basePegasusData = (BasePegasusData) getBindData();
        if (basePegasusData == null) {
            return;
        }
        String threePointV = basePegasusData.getThreePointV();
        if (threePointV != null && !StringsKt.isBlank(threePointV)) {
            z6 = true;
            break;
        }
        List<ThreePointItem> threePoint = basePegasusData.getThreePoint();
        if (threePoint != null) {
            List<ThreePointItem> list = threePoint;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (ThreePointItem threePointItem : list) {
                    String str = threePointItem != null ? threePointItem.title : null;
                    if (str != null && !StringsKt.isBlank(str)) {
                        z6 = true;
                        break;
                    }
                }
            }
        }
        z6 = false;
        if (view != null) {
            view.setVisibility(z6 ? 0 : 8);
        }
    }
}

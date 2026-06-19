package com.bilibili.ship.theseus.ogv.intro.livereserve;

import By0.C1481o0;
import Ey0.m;
import KS0.B;
import TB0.C2868b;
import TB0.C2891x;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.semantics.y;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.fasthybrid.uimodule.widget.text.InputWidgetLayout;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.z;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/c.class */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f93317b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f93316a = i7;
        this.f93317b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v147, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v16, types: [Yv0.b, android.content.Context, com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v96, types: [android.widget.PopupWindow, com.bilibili.studio.videoeditor.util.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [android.view.View] */
    public final Object invoke(Object obj) {
        C2891x c2891x;
        Object obj2 = this.f93317b;
        switch (this.f93316a) {
            case 0:
                PageReportService.i(((e) obj2).f93323e, "united.player-video-detail.reserve.0.show", (Map) obj, 4);
                return Unit.INSTANCE;
            case 1:
                m mVar = (m) obj;
                if (mVar != null) {
                    final ?? r02 = (BiliEditorMainActivity) obj2;
                    C1481o0 c1481o0 = r02.f106271K;
                    C2868b c2868b = (C2868b) ((Yv0.b) r02).C;
                    UpperLiveWindowExt upperLiveWindowExt = (c2868b == null || (c2891x = c2868b.f23744f) == null) ? null : c2891x.f24044g;
                    c1481o0.getClass();
                    if (upperLiveWindowExt != null) {
                        int measuredWidth = upperLiveWindowExt.getMeasuredWidth();
                        int measuredHeight = upperLiveWindowExt.getMeasuredHeight();
                        Set<String> set = Yw0.c.f29324a;
                        int iOptInteger = BiliGlobalPreferenceHelper.getInstance((Context) r02).optInteger("caption_double_click_guide_count", 0);
                        int i7 = iOptInteger >= 3 ? 3 : iOptInteger + 1;
                        BiliGlobalPreferenceHelper.getInstance((Context) r02).setInteger("caption_double_click_guide_count", i7);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        final String str = String.format("%s_%s", Arrays.copyOf(new Object[]{"caption_double_click", Integer.valueOf(i7)}, 2));
                        List<PointF> list = mVar.f4881b;
                        BLog.ifmt("EditorGuideUtil", "showCaptionGuideDialog...key = %s", new Object[]{str});
                        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull((Context) r02);
                        if ((activityFindActivityOrNull == null || (!activityFindActivityOrNull.isDestroyed() && !activityFindActivityOrNull.isFinishing())) && !BiliGlobalPreferenceHelper.getInstance((Context) r02).optBoolean(str, false) && list.size() == 4) {
                            PointF pointF = list.get(0);
                            PointF pointF2 = list.get(1);
                            PointF pointF3 = list.get(2);
                            PointF pointF4 = list.get(3);
                            float f7 = pointF4.x;
                            float f8 = pointF.x;
                            float f9 = pointF2.y;
                            float f10 = pointF.y;
                            float f11 = f9 - f10;
                            float f12 = (((f8 + pointF2.x) + pointF3.x) + f7) / 4.0f;
                            float f13 = (((f10 + f9) + pointF3.y) + pointF4.y) / 4.0f;
                            float f14 = measuredHeight;
                            boolean z6 = f13 < (f14 * 1.0f) / 2.0f;
                            int iDp2px = DensityUtil.dp2px(r02, 22.0f);
                            BLog.vfmt("EditorGuideUtil", "captionWidth = %s, captionHeight = %s, displayWidth = %s, displayHeight = %s", new Object[]{Float.valueOf(f7 - f8), Float.valueOf(f11), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)});
                            BLog.dfmt("EditorGuideUtil", "leftTop = %s, leftBottom = %s, rightBottom = %s, rightTop = %s", new Object[]{pointF, pointF2, pointF3, pointF4});
                            View viewInflate = LayoutInflater.from(r02).inflate(2131495206, (ViewGroup) null);
                            ?? popupWindow = new PopupWindow(viewInflate, -2, -2);
                            View viewFindViewById = viewInflate.findViewById(2131305588);
                            View viewFindViewById2 = viewInflate.findViewById(2131303602);
                            View viewFindViewById3 = viewInflate.findViewById(2131303593);
                            TextView textView = (TextView) viewInflate.findViewById(2131314658);
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(true);
                            viewFindViewById2.setVisibility(z6 ? 0 : 8);
                            viewFindViewById3.setVisibility(z6 ? 8 : 0);
                            View view = z6 ? viewFindViewById2 : viewFindViewById3;
                            textView.setText(2131842410);
                            viewFindViewById.measure(0, 0);
                            int measuredWidth2 = viewFindViewById.getMeasuredWidth();
                            int measuredHeight2 = viewFindViewById.getMeasuredHeight();
                            ViewGroup.LayoutParams layoutParams = z6 ? viewFindViewById2.getLayoutParams() : viewFindViewById3.getLayoutParams();
                            if (layoutParams instanceof LinearLayout.LayoutParams) {
                                int measuredWidth3 = view.getMeasuredWidth();
                                ((LinearLayout.LayoutParams) layoutParams).leftMargin = pointF.x < 0.0f ? iDp2px : pointF4.x > ((float) measuredWidth) ? (measuredWidth2 - measuredWidth3) - iDp2px : (measuredWidth2 / 2) - (measuredWidth3 / 2);
                            }
                            int i8 = (int) (f12 - ((measuredWidth2 * 1.0f) / 2.0f));
                            int i9 = (int) (z6 ? -((f14 - f13) - (f11 / 2.0f)) : -((f11 / 2.0f) + (f14 - f13) + measuredHeight2));
                            if (upperLiveWindowExt.getWindowToken() != null) {
                                try {
                                    popupWindow.showAsDropDown(upperLiveWindowExt, i8, i9);
                                } catch (Exception e7) {
                                    BLog.efmt("EditorGuideUtil", "showCaptionGuideDialog...e = %s", new Object[]{e7.fillInStackTrace()});
                                }
                            } else {
                                upperLiveWindowExt.addOnAttachStateChangeListener(new z(popupWindow, upperLiveWindowExt, i8, i9));
                            }
                            viewInflate.findViewById(2131303599).setOnClickListener(new B((Object) popupWindow, 2));
                            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(r02, str) { // from class: com.bilibili.studio.videoeditor.util.u

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final Context f110252a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final String f110253b;

                                {
                                    this.f110252a = r02;
                                    this.f110253b = str;
                                }

                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    Context context = this.f110252a;
                                    BiliGlobalPreferenceHelper.getInstance(context).setBoolean(this.f110253b, true);
                                }
                            });
                        }
                    }
                    break;
                } else {
                    int i10 = BiliEditorMainActivity.f106268Y;
                }
                return Unit.INSTANCE;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                String str2 = (String) obj2;
                if (str2 != null) {
                    y.h(semanticsPropertyReceiver, str2);
                }
                y.o(semanticsPropertyReceiver, Role.Companion.m3481getImageo7Vup1c());
                return Unit.INSTANCE;
            default:
                return InputWidgetLayout.d((InputWidgetLayout) obj2, (Pair) obj);
        }
    }
}

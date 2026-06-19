package com.bilibili.ship.theseus.ogv.activity.dialog;

import NQ.f;
import Uj0.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ogv.bdesign.tab.l;
import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDialogVo;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import j5.C7642d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/dialog/OgvActivityImageDialog.class */
@StabilityInferred(parameters = 0)
public final class OgvActivityImageDialog extends ComponentDialog {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91544e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvActivityDialogVo f91545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Drawable f91546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvActivityService f91547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f91548d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/dialog/OgvActivityImageDialog$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f91549a;

        static {
            int[] iArr = new int[ActivityDialogActionType.values().length];
            try {
                iArr[ActivityDialogActionType.CLOSE_BY_CLICK_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ActivityDialogActionType.OPEN_WITH_ROUTE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ActivityDialogActionType.EXEC.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f91549a = iArr;
        }
    }

    public OgvActivityImageDialog(@NotNull Context context, @NotNull OgvActivityDialogVo ogvActivityDialogVo, @Nullable Drawable drawable, @NotNull OgvActivityService ogvActivityService, @NotNull PageReportService pageReportService) {
        super(context, 0, 2, null);
        this.f91545a = ogvActivityDialogVo;
        this.f91546b = drawable;
        this.f91547c = ogvActivityService;
        this.f91548d = pageReportService;
        Window window = getWindow();
        if (window != null) {
            C7642d.a(window, 0);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.requestFeature(1);
        }
        ExposureEntry exposureEntry = new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new f(this, 3));
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(364908727, true, new l(2, this, exposureEntry)));
        setContentView(composeView);
        Window window3 = getWindow();
        WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
        if (attributes != null) {
            attributes.width = c.b(280, context);
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
        setCanceledOnTouchOutside(false);
    }
}

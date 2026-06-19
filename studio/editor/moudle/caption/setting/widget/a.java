package com.bilibili.studio.editor.moudle.caption.setting.widget;

import android.R;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.videoeditor.util.ScreenUtil;
import kotlin.Lazy;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/a.class */
public final class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC1188a f106003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f106004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f106005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f106006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Activity f106007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106008f;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.caption.setting.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/a$a.class */
    public final class ViewTreeObserverOnGlobalLayoutListenerC1188a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f106009a;

        public ViewTreeObserverOnGlobalLayoutListenerC1188a(a aVar) {
            this.f106009a = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = this.f106009a;
            if (aVar.f106005c != null) {
                Point screenRealSize = ScreenUtil.getScreenRealSize(aVar.f106007e);
                Rect rect = new Rect();
                aVar.f106005c.getWindowVisibleDisplayFrame(rect);
                int i7 = aVar.f106007e.getResources().getConfiguration().orientation;
                boolean zIsInMultiWindowMode = aVar.f106007e.isInMultiWindowMode();
                int i8 = screenRealSize.y - rect.bottom;
                BLog.ifmt("KeyboardHeightProvider", "keyboardHeight = %s, screenHeight = %s,  rect.bottom = %s,  isInMultiWindowMode = %s ", new Object[]{Integer.valueOf(i8), Integer.valueOf(screenRealSize.y), Integer.valueOf(rect.bottom), Boolean.valueOf(zIsInMultiWindowMode)});
                if (aVar.f106008f == -100) {
                    aVar.f106008f = i8;
                }
                BLog.ifmt("KeyboardHeightProvider", "handleOnGlobalLayout visibleNavigationBarHeight = %s", new Object[]{Integer.valueOf(aVar.f106008f)});
                if (i8 == 0) {
                    int i9 = screenRealSize.y;
                    b bVar = aVar.f106004b;
                    if (bVar != null) {
                        bVar.p2(0, i9);
                        return;
                    }
                    return;
                }
                if (i7 != 1) {
                    int i10 = screenRealSize.y;
                    b bVar2 = aVar.f106004b;
                    if (bVar2 != null) {
                        bVar2.p2(i8, i10);
                        return;
                    }
                    return;
                }
                if (zIsInMultiWindowMode) {
                    int i11 = rect.bottom;
                    b bVar3 = aVar.f106004b;
                    if (bVar3 != null) {
                        bVar3.p2(0, i11);
                        return;
                    }
                    return;
                }
                int i12 = screenRealSize.y;
                b bVar4 = aVar.f106004b;
                if (bVar4 != null) {
                    bVar4.p2(i8, i12);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/widget/a$b.class */
    public interface b {
        void p2(int i7, int i8);
    }

    public a(Activity activity) {
        super(activity);
        this.f106008f = -100;
        this.f106007e = activity;
        View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(2131495350, (ViewGroup) null, false);
        this.f106005c = viewInflate;
        setContentView(viewInflate);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f106006d = activity.findViewById(R.id.content);
        setWidth(0);
        setHeight(-1);
        this.f106003a = new ViewTreeObserverOnGlobalLayoutListenerC1188a(this);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(this.f106003a);
    }

    public final void a() {
        this.f106005c.getViewTreeObserver().removeOnGlobalLayoutListener(this.f106003a);
        this.f106003a = null;
        this.f106004b = null;
        dismiss();
    }

    public final boolean b(int i7) {
        Activity activity;
        Lazy lazy = UpperFawkesDeviceDecision.f105475a;
        if (!((Boolean) UpperFawkesDeviceDecision.f105474Z.getValue()).booleanValue() || (activity = this.f106007e) == null) {
            boolean z6 = true;
            if (i7 != 0) {
                z6 = i7 == this.f106008f;
            }
            return z6;
        }
        int screenHeight = (int) (ScreenUtil.getScreenHeight(activity) * 0.2f);
        boolean z7 = true;
        if (i7 != 0) {
            z7 = true;
            if (i7 != this.f106008f) {
                z7 = i7 < screenHeight;
            }
        }
        return z7;
    }

    public final void c() {
        if (isShowing() || this.f106006d.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.f106006d, 0, 0, 0);
    }
}

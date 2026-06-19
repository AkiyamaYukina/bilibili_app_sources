package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import Ne0.C2712E;
import Ne0.C2713F;
import Ne0.C2714G;
import Ne0.C2715H;
import Ne0.C2717J;
import Ne0.C2718K;
import Ne0.ViewOnClickListenerC2740t;
import Ne0.ViewOnClickListenerC2741u;
import Ne0.v;
import Ne0.z;
import Oe0.InterfaceC2755a;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bh.d;
import com.bilibili.app.comm.dynamicview.DynamicContext;
import com.bilibili.lib.fasthybrid.uimodule.imageviewer.ImagesViewerFragment;
import com.bilibili.lib.fasthybrid.uimodule.widget.loading.ListTextImageLoadingPage;
import com.bilibili.lib.projection.internal.api.model.PlayerUiBean;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.interf.ShowBubbleType;
import ge0.f;
import he0.C7435d;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.InterfaceC7755c;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiTvControlWidget.class */
public final class ProjectionNewUiTvControlWidget extends FrameLayout implements InterfaceC7755c, InterfaceC2755a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f64018m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextView f64019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f64020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f64021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextView f64022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f64023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final View f64024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final View f64025g;

    @Nullable
    public final View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f64026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f64027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f64028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64029l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiTvControlWidget$a.class */
    public interface a {
        void a(@Nullable ProjectionDeviceInternal projectionDeviceInternal);

        void b(boolean z6);

        void c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiTvControlWidget$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f64030a;

        static {
            int[] iArr = new int[ShowBubbleType.values().length];
            try {
                iArr[ShowBubbleType.Damaku.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ShowBubbleType.Speed.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ShowBubbleType.Quality.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f64030a = iArr;
        }
    }

    public ProjectionNewUiTvControlWidget(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionNewUiTvControlWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, 2131495228, this);
        this.f64022d = (TextView) findViewById(2131309502);
        this.f64023e = (TextView) findViewById(2131309506);
        this.f64019a = (TextView) findViewById(2131309501);
        this.f64020b = (TextView) findViewById(2131309514);
        this.f64021c = (TextView) findViewById(2131309511);
        View viewFindViewById = findViewById(2131309500);
        this.f64024f = viewFindViewById;
        View viewFindViewById2 = findViewById(2131309513);
        this.f64025g = viewFindViewById2;
        View viewFindViewById3 = findViewById(2131309510);
        this.h = viewFindViewById3;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC2740t(0, this, context));
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC2741u(0, this, context));
        }
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new v(this, 0));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setEnabled(false);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setEnabled(false);
        }
        if (viewFindViewById3 != null) {
            viewFindViewById3.setEnabled(false);
        }
    }

    public static final void j(final ProjectionNewUiTvControlWidget projectionNewUiTvControlWidget, boolean z6) {
        CharSequence text;
        String dmTag;
        TextView textView = projectionNewUiTvControlWidget.f64023e;
        if (textView != null) {
            CommonDialogUtilsKt.setVisibility(textView, z6);
        }
        if (z6) {
            TextView textView2 = projectionNewUiTvControlWidget.f64019a;
            if (textView2 != null) {
                textView2.setText(projectionNewUiTvControlWidget.getContext().getResources().getText(2131841709));
            }
            PlayerUiBean playerUiBean = C7435d.f120839d;
            if (playerUiBean == null || (dmTag = playerUiBean.getDmTag()) == null || dmTag.length() <= 0) {
                text = projectionNewUiTvControlWidget.getContext().getResources().getText(2131835966);
            } else {
                PlayerUiBean playerUiBean2 = C7435d.f120839d;
                text = playerUiBean2 != null ? playerUiBean2.getDmTag() : null;
            }
            TextView textView3 = projectionNewUiTvControlWidget.f64023e;
            if (textView3 != null) {
                textView3.setText(text);
            }
            TextView textView4 = projectionNewUiTvControlWidget.f64022d;
            if (textView4 != null) {
                final int i7 = 0;
                textView4.post(new Runnable(projectionNewUiTvControlWidget, i7) { // from class: Ne0.w

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f17184a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f17185b;

                    {
                        this.f17184a = i7;
                        this.f17185b = projectionNewUiTvControlWidget;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (this.f17184a) {
                            case 0:
                                ProjectionNewUiTvControlWidget projectionNewUiTvControlWidget2 = (ProjectionNewUiTvControlWidget) this.f17185b;
                                TextView textView5 = projectionNewUiTvControlWidget2.f64023e;
                                ViewGroup.LayoutParams layoutParams = textView5 != null ? textView5.getLayoutParams() : null;
                                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                                if (layoutParams2 != null) {
                                    TextView textView6 = projectionNewUiTvControlWidget2.f64022d;
                                    int right = textView6 != null ? textView6.getRight() : 0;
                                    TextView textView7 = projectionNewUiTvControlWidget2.f64022d;
                                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (right - (textView7 != null ? textView7.getLeft() : 0)) / 2;
                                    TextView textView8 = projectionNewUiTvControlWidget2.f64023e;
                                    if (textView8 != null) {
                                        textView8.setLayoutParams(layoutParams2);
                                    }
                                }
                                break;
                            case 1:
                                DynamicContext dynamicContext = (DynamicContext) this.f17185b;
                                List list = bh.d.a;
                                dynamicContext.c.getUseNewEngine();
                                BLog.d("DynamicView", "onDynamicViewVisible()");
                                Iterator it = ((ArrayList) bh.d.a).iterator();
                                while (it.hasNext()) {
                                    ((d.a) it.next()).getClass();
                                    List list2 = bh.d.a;
                                }
                                ((ArrayList) bh.d.a).clear();
                                break;
                            case 2:
                                com.bilibili.biligame.ui.gamelist.x xVar = (com.bilibili.biligame.ui.gamelist.x) this.f17185b;
                                SwipeRefreshLayout swipeRefreshLayout = xVar.a0;
                                if (swipeRefreshLayout == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("swipe_refresh");
                                    swipeRefreshLayout = null;
                                }
                                swipeRefreshLayout.setRefreshing(true);
                                xVar.v0 = SystemClock.elapsedRealtime();
                                break;
                            case 3:
                                ((ImagesViewerFragment) this.f17185b).l.setVisibility(4);
                                break;
                            default:
                                View view = (View) this.f17185b;
                                int i8 = ListTextImageLoadingPage.$stable;
                                t90.p.Q(view);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        CompositeDisposable compositeDisposable = this.f64027j;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.f64027j = null;
        this.f64028k = null;
    }

    @Override // Oe0.InterfaceC2755a
    @Nullable
    public final View g(@NotNull ShowBubbleType showBubbleType) {
        int i7 = b.f64030a[showBubbleType.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? null : this.h : this.f64025g : this.f64024f;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        io.reactivex.rxjava3.subjects.a aVarF;
        Observable observableSwitchMap;
        Disposable disposableSubscribe;
        CompositeDisposable compositeDisposable;
        io.reactivex.rxjava3.subjects.a aVarF2;
        Observable observableSwitchMap2;
        Disposable disposableSubscribe2;
        CompositeDisposable compositeDisposable2;
        com.bilibili.lib.projection.internal.device.a aVarS;
        ProjectionDeviceInternal device;
        Observable<f> observableA;
        Disposable disposableSubscribe3;
        CompositeDisposable compositeDisposable3;
        io.reactivex.rxjava3.subjects.a aVarMo11256getPlaySpeed;
        Disposable disposableSubscribe4;
        CompositeDisposable compositeDisposable4;
        com.bilibili.lib.projection.internal.device.a aVarS2;
        ProjectionDeviceInternal device2;
        Observable<IProjectionPlayableItem> observableJ;
        Disposable disposableSubscribe5;
        CompositeDisposable compositeDisposable5;
        this.f64029l = interfaceC7845m;
        CompositeDisposable compositeDisposable6 = new CompositeDisposable();
        this.f64027j = compositeDisposable6;
        InterfaceC7845m interfaceC7845m2 = this.f64029l;
        if (interfaceC7845m2 != null) {
            compositeDisposable6.add(interfaceC7845m2.f().distinctUntilChanged().subscribe(new z(this, interfaceC7845m2)));
        }
        InterfaceC7845m interfaceC7845m3 = this.f64029l;
        if (interfaceC7845m3 != null && (aVarS2 = interfaceC7845m3.s()) != null && (device2 = aVarS2.getDevice()) != null && (observableJ = device2.j()) != null && (disposableSubscribe5 = observableJ.subscribe(new C2713F(this))) != null && (compositeDisposable5 = this.f64027j) != null) {
            compositeDisposable5.add(disposableSubscribe5);
        }
        InterfaceC7845m interfaceC7845m4 = this.f64029l;
        if (interfaceC7845m4 != null && (aVarMo11256getPlaySpeed = interfaceC7845m4.mo11256getPlaySpeed()) != null && (disposableSubscribe4 = aVarMo11256getPlaySpeed.subscribe(new C2714G(this))) != null && (compositeDisposable4 = this.f64027j) != null) {
            compositeDisposable4.add(disposableSubscribe4);
        }
        InterfaceC7845m interfaceC7845m5 = this.f64029l;
        if (interfaceC7845m5 != null && (aVarS = interfaceC7845m5.s()) != null && (device = aVarS.getDevice()) != null && (observableA = device.A()) != null && (disposableSubscribe3 = observableA.subscribe(new C2715H(this))) != null && (compositeDisposable3 = this.f64027j) != null) {
            compositeDisposable3.add(disposableSubscribe3);
        }
        InterfaceC7845m interfaceC7845m6 = this.f64029l;
        if (interfaceC7845m6 != null && (aVarF2 = interfaceC7845m6.f()) != null && (observableSwitchMap2 = aVarF2.switchMap(new C2717J(this))) != null && (disposableSubscribe2 = observableSwitchMap2.subscribe(new C2718K(this))) != null && (compositeDisposable2 = this.f64027j) != null) {
            compositeDisposable2.add(disposableSubscribe2);
        }
        InterfaceC7845m interfaceC7845m7 = this.f64029l;
        if (interfaceC7845m7 == null || (aVarF = interfaceC7845m7.f()) == null || (observableSwitchMap = aVarF.switchMap(new C2712E(this))) == null || (disposableSubscribe = observableSwitchMap.subscribe()) == null || (compositeDisposable = this.f64027j) == null) {
            return;
        }
        compositeDisposable.add(disposableSubscribe);
    }

    public final void k(Float f7) {
        if (Intrinsics.areEqual(f7, 1.0f)) {
            TextView textView = this.f64020b;
            if (textView != null) {
                textView.setText("1.0X");
                return;
            }
            return;
        }
        TextView textView2 = this.f64020b;
        if (textView2 != null) {
            textView2.setText(f7 + "X");
        }
    }

    public final void setClickAction(@NotNull a aVar) {
        this.f64026i = aVar;
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}

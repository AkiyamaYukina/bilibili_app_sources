package com.bilibili.opd.app.bizcommon.mallcommon.arentrance.fragment;

import By0.C1473l1;
import Pm0.b;
import Qm0.c;
import Qm0.d;
import Qm0.g;
import Qm0.j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.app.PayTask;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.opd.app.bizcommon.mallcommon.arentrance.data.ARItemBean;
import com.bilibili.opd.app.bizcommon.mallcommon.arentrance.data.ARListBean;
import com.bilibili.opd.app.bizcommon.mallcommon.arentrance.qrcode.QrCodeScanHandler;
import com.bilibili.pvtracker.IPvTracker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/fragment/AREntranceFragment.class */
@StabilityInferred(parameters = 0)
public final class AREntranceFragment extends androidx_fragment_app_Fragment implements SurfaceHolder.Callback, IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public QrCodeScanHandler f73984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Handler f73985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SurfaceView f73986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f73987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ImageView f73988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TextView f73989g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RecyclerView f73990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ViewGroup f73991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f73992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ViewGroup f73993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public j f73994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f73995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f73996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f73997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f73998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f73999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public b f74000s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/fragment/AREntranceFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1473l1 f74001a;

        public a(C1473l1 c1473l1) {
            this.f74001a = c1473l1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f74001a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f74001a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static void m7837if(SurfaceView surfaceView, Point point) {
        int width = surfaceView.getWidth();
        float f7 = width / point.y;
        float height = surfaceView.getHeight() / point.x;
        float fMax = Math.max(f7, height);
        float f8 = 1;
        surfaceView.setScaleX((f8 / f7) * fMax);
        surfaceView.setScaleY((f8 / height) * fMax);
        surfaceView.invalidate();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return getString(2131830703);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    public final void hf() {
        BiliCall<GeneralResponse<ARListBean>> aRList;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (o.b()) {
            ViewGroup viewGroup = this.f73991j;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ViewGroup viewGroup2 = this.f73993l;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            b bVar = this.f74000s;
            if (bVar != null) {
                RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json"), JSON.toJSONString(new JSONObject()));
                Pm0.a aVar = bVar.f19036b;
                if (aVar == null || (aRList = aVar.getARList(requestBodyCreate)) == null) {
                    return;
                }
                aRList.enqueue(new Vz0.a(bVar, 2));
                return;
            }
            return;
        }
        ViewGroup viewGroup3 = this.f73991j;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
        ViewGroup viewGroup4 = this.f73993l;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(0);
        }
        ViewGroup viewGroup5 = this.f73993l;
        if (viewGroup5 != null) {
            viewGroup5.setBackgroundResource(2131237509);
        }
        TextView textView = this.f73992k;
        if (textView != null) {
            textView.setText(context.getString(2131829605));
        }
        Drawable drawable = ContextCompat.getDrawable(context, 2131237531);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            TextView textView2 = this.f73992k;
            if (textView2 != null) {
                textView2.setCompoundDrawables(null, null, drawable, null);
            }
        }
        TextView textView3 = this.f73992k;
        if (textView3 != null) {
            textView3.setTextColor(ContextCompat.getColor(context, 2131100271));
        }
        ViewGroup viewGroup6 = this.f73993l;
        if (viewGroup6 != null) {
            viewGroup6.setOnClickListener(new Qm0.b(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf(android.view.SurfaceHolder r5) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mallcommon.arentrance.fragment.AREntranceFragment.jf(android.view.SurfaceHolder):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 101) {
            QrCodeScanHandler qrCodeScanHandler = this.f73984b;
            if (qrCodeScanHandler != null) {
                qrCodeScanHandler.f74006e = false;
            }
            Handler handler = this.f73985c;
            if (handler != null) {
                handler.postDelayed(new d(this, 0), PayTask.f60018j);
            }
        }
        hf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Window window;
        Window window2;
        super.onCreate(bundle);
        this.f74000s = (b) new ViewModelProvider(this).get(b.class);
        this.f73985c = HandlerThreads.getHandler(2);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null) {
            return;
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null && (window2 = fragmentActivityP32.getWindow()) != null) {
            window2.addFlags(128);
        }
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.setStatusBarColor(0);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131498707, (ViewGroup) null);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f73997p = false;
        if (this.f73999r) {
            Sm0.d dVar = Sm0.d.f23019i;
            if (dVar != null) {
                dVar.d();
            }
            Sm0.d dVar2 = Sm0.d.f23019i;
            if (dVar2 != null) {
                try {
                    Camera camera = dVar2.f23024e;
                    if (camera != null) {
                        camera.release();
                        dVar2.f23024e = null;
                    }
                } catch (Exception e7) {
                    BLog.e(Sm0.d.h, "close camera error", e7);
                }
            }
        }
        QrCodeScanHandler qrCodeScanHandler = this.f73984b;
        if (qrCodeScanHandler != null) {
            qrCodeScanHandler.a();
            this.f73984b = null;
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        SurfaceHolder holder;
        super.onResume();
        this.f73999r = true;
        this.f73996o = true;
        SurfaceView surfaceView = this.f73986d;
        if (surfaceView == null || (holder = surfaceView.getHolder()) == null) {
            return;
        }
        jf(holder);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<List<ARItemBean>> mutableLiveData;
        SurfaceHolder holder;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(2131296818);
        this.f73987e = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new c(this, 0));
        }
        Toolbar toolbar = (Toolbar) view.findViewById(2131296819);
        ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
        layoutParams.height = StatusBarCompat.getStatusBarHeight(p3()) + layoutParams.height;
        toolbar.setLayoutParams(layoutParams);
        BiliImageView biliImageViewFindViewById = view.findViewById(2131313655);
        View viewFindViewById2 = view.findViewById(2131310804);
        FragmentActivity fragmentActivityP3 = p3();
        RelativeLayout.LayoutParams layoutParams2 = null;
        if (fragmentActivityP3 != null) {
            float f7 = (int) ((Resources.getSystem().getDisplayMetrics().heightPixels / fragmentActivityP3.getResources().getDisplayMetrics().density) + 0.5f);
            if (f7 < 720.0f) {
                float f8 = f7 / 720.0f;
                ViewGroup.LayoutParams layoutParams3 = biliImageViewFindViewById != null ? biliImageViewFindViewById.getLayoutParams() : null;
                RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.height = (int) (layoutParams4.height * f8);
                    layoutParams4.width = (int) (layoutParams4.width * f8);
                    biliImageViewFindViewById.setLayoutParams(layoutParams4);
                }
                ViewGroup.LayoutParams layoutParams5 = viewFindViewById2 != null ? viewFindViewById2.getLayoutParams() : null;
                RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.height = (int) (layoutParams6.height * f8);
                    layoutParams6.width = (int) (layoutParams6.width * f8);
                    int i7 = (int) (layoutParams6.bottomMargin * f8);
                    layoutParams6.bottomMargin = i7;
                    layoutParams6.topMargin = (int) (f8 * i7);
                    viewFindViewById2.setLayoutParams(layoutParams6);
                }
            }
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            BiliImageLoader.INSTANCE.with(fragmentActivityP32).url("https://i0.hdslb.com/bfs/kfptfe/floor/mall_ar_enter_tips.png").into(biliImageViewFindViewById);
        }
        Context context = getContext();
        if (context != null) {
            this.f73988f = (ImageView) view.findViewById(2131296826);
            this.f73989g = (TextView) view.findViewById(2131296831);
            this.h = view.findViewById(2131305141);
            this.f73991j = (ViewGroup) view.findViewById(2131296829);
            this.f73992k = (TextView) view.findViewById(2131296827);
            this.f73993l = (ViewGroup) view.findViewById(2131296828);
            this.f73990i = (RecyclerView) view.findViewById(2131296830);
            j jVar = new j(context, this);
            this.f73994m = jVar;
            RecyclerView recyclerView = this.f73990i;
            if (recyclerView != null) {
                recyclerView.setAdapter(jVar);
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(p3(), 3);
            RecyclerView recyclerView2 = this.f73990i;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(gridLayoutManager);
            }
            View viewFindViewById3 = view.findViewById(2131296817);
            float f9 = (int) ((Resources.getSystem().getDisplayMetrics().heightPixels / context.getResources().getDisplayMetrics().density) + 0.5f);
            if (f9 < 720.0f) {
                ViewGroup viewGroup = this.f73991j;
                ViewGroup.LayoutParams layoutParams7 = viewGroup != null ? viewGroup.getLayoutParams() : null;
                CoordinatorLayout.LayoutParams layoutParams8 = layoutParams7 instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams7 : null;
                CoordinatorLayout.Behavior behavior = layoutParams8 != null ? layoutParams8.getBehavior() : null;
                BottomSheetBehavior bottomSheetBehavior = behavior instanceof BottomSheetBehavior ? (BottomSheetBehavior) behavior : null;
                if (bottomSheetBehavior != null) {
                    FragmentActivity fragmentActivityP33 = p3();
                    bottomSheetBehavior.setPeekHeight(fragmentActivityP33 == null ? 0 : (int) (((200 - ((1 - (f9 / 720.0f)) * BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD)) * fragmentActivityP33.getResources().getDisplayMetrics().density) + 0.5f));
                }
                ViewGroup.LayoutParams layoutParams9 = viewFindViewById3 != null ? viewFindViewById3.getLayoutParams() : null;
                if (layoutParams9 instanceof RelativeLayout.LayoutParams) {
                    layoutParams2 = (RelativeLayout.LayoutParams) layoutParams9;
                }
                if (layoutParams2 != null) {
                    FragmentActivity fragmentActivityP34 = p3();
                    layoutParams2.bottomMargin = fragmentActivityP34 == null ? 0 : (int) (((230 - ((1 - (f9 / 720.0f)) * BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD)) * fragmentActivityP34.getResources().getDisplayMetrics().density) + 0.5f);
                }
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setLayoutParams(layoutParams2);
                }
            }
        }
        SurfaceView surfaceView = (SurfaceView) view.findViewById(2131309248);
        this.f73986d = surfaceView;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(this);
        }
        FragmentActivity fragmentActivityP35 = p3();
        if (Sm0.d.f23019i == null) {
            Sm0.d.f23019i = new Sm0.d(fragmentActivityP35);
        }
        if (PermissionsChecker.checkSelfPermissions(getContext(), PermissionsChecker.CAMERA_PERMISSION)) {
            this.f73995n = true;
        } else {
            FragmentActivity fragmentActivityP36 = p3();
            if (fragmentActivityP36 != null) {
                PermissionsChecker.grantCameraPermission(fragmentActivityP36, fragmentActivityP36.getLifecycle(), getString(2131829672)).continueWith(new g(this), Task.UI_THREAD_EXECUTOR);
            }
        }
        b bVar = this.f74000s;
        if (bVar != null && (mutableLiveData = bVar.f19037c) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new a(new C1473l1(this, 1)));
        }
        hf();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(@NotNull SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(@NotNull SurfaceHolder surfaceHolder) {
        this.f73998q = true;
        if (this.f73997p) {
            return;
        }
        jf(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(@NotNull SurfaceHolder surfaceHolder) {
        this.f73998q = false;
    }
}

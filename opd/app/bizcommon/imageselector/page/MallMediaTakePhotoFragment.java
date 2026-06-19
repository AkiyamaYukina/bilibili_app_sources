package com.bilibili.opd.app.bizcommon.imageselector.page;

import Jm0.q;
import Km0.C2457e;
import Mm0.DialogC2679a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import bolts.Task;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import com.bilibili.opd.app.bizcommon.imageselector.media.camera.MallMediaCameraSurfaceView;
import com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaParams;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaTakePhotoFragment.class */
@StabilityInferred(parameters = 0)
public class MallMediaTakePhotoFragment extends MallMediaBaseFragment implements q.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MallMediaCameraSurfaceView f73856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public StaticImageView2 f73857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f73858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageView f73859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ImageView f73860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ImageView f73861g;

    @Nullable
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public DialogC2679a f73862i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public File f73864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73865l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f73863j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public MallMediaParams f73866m = MallMediaParams.DEFAULT;

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public final void initToolbar(@Nullable View view) {
        setStatusBarMode(StatusBarMode.IMMERSIVE_FULL_TRANSPARENT);
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Window window;
        Intent intent;
        FragmentActivity fragmentActivityP3;
        Window window2;
        super.onCreate(bundle);
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 == null || (window = fragmentActivityP32.getWindow()) == null) {
            return;
        }
        window.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT);
        Context context = getContext();
        if (context != null && (fragmentActivityP3 = p3()) != null && (window2 = fragmentActivityP3.getWindow()) != null) {
            window2.setNavigationBarColor(ContextCompat.getColor(context, 2131102934));
        }
        setAutoGenerateToolbar(false);
        if (getArguments() == null) {
            FragmentActivity fragmentActivityP33 = p3();
            if (((fragmentActivityP33 == null || (intent = fragmentActivityP33.getIntent()) == null) ? null : intent.getExtras()) != null) {
                FragmentActivity fragmentActivityP34 = p3();
                Bundle extras = null;
                if (fragmentActivityP34 != null) {
                    Intent intent2 = fragmentActivityP34.getIntent();
                    extras = null;
                    if (intent2 != null) {
                        extras = intent2.getExtras();
                    }
                }
                setArguments(extras);
            }
        }
        MallMediaParams.a aVar = MallMediaParams.Companion;
        Bundle arguments = getArguments();
        aVar.getClass();
        this.f73866m = MallMediaParams.a.a(arguments);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        initToolbar(viewGroup);
        return LayoutInflater.from(getContext()).inflate(2131499025, viewGroup, false);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment, com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DialogC2679a dialogC2679a = this.f73862i;
        if (dialogC2679a != null) {
            dialogC2679a.dismiss();
        }
    }

    @Override // Jm0.q.a
    public final void onFinish(@Nullable Bundle bundle) {
        boolean zBooleanValue;
        FragmentActivity fragmentActivity;
        if (activityDie()) {
            return;
        }
        DialogC2679a dialogC2679a = this.f73862i;
        if (dialogC2679a != null) {
            dialogC2679a.dismiss();
        }
        if (bundle == null) {
            finishAttachedActivity();
            return;
        }
        Object obj = bundle.get("bundle_key_only_close_loading");
        if (obj instanceof Boolean) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else if (obj instanceof String) {
            try {
                zBooleanValue = Boolean.parseBoolean((String) obj);
            } catch (NumberFormatException e7) {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return;
        }
        WeakReference<FragmentActivity> weakReference = Jm0.q.f11566a;
        if (weakReference != null && (fragmentActivity = weakReference.get()) != null) {
            fragmentActivity.setResult(-1, new Intent().putExtras(bundle));
            fragmentActivity.finish();
        }
        finishAttachedActivity();
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment, com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C2457e mediaCameraManager;
        super.onPause();
        MallMediaCameraSurfaceView mallMediaCameraSurfaceView = this.f73856b;
        if (mallMediaCameraSurfaceView == null || (mediaCameraManager = mallMediaCameraSurfaceView.getMediaCameraManager()) == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        mediaCameraManager.f12974e.sendMessage(messageObtain);
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment, com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C2457e mediaCameraManager;
        super.onResume();
        MallMediaCameraSurfaceView mallMediaCameraSurfaceView = this.f73856b;
        if (mallMediaCameraSurfaceView == null || (mediaCameraManager = mallMediaCameraSurfaceView.getMediaCameraManager()) == null) {
            return;
        }
        mediaCameraManager.b(this.f73865l);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || fragmentActivityP3.getWindow() == null) {
            return;
        }
        this.f73856b = (MallMediaCameraSurfaceView) view.findViewById(2131298255);
        this.f73857c = view.findViewById(2131308855);
        this.f73860f = (ImageView) view.findViewById(2131298371);
        this.f73859e = (ImageView) view.findViewById(2131312774);
        this.f73858d = (ImageView) view.findViewById(2131298131);
        this.h = (TextView) view.findViewById(2131298146);
        this.f73861g = (ImageView) view.findViewById(2131298153);
        ImageView imageView = this.f73860f;
        if (imageView != null) {
            imageView.setOnClickListener(new F(new Ref.LongRef(), imageView, this));
        }
        ImageView imageView2 = this.f73859e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new E(new Ref.LongRef(), imageView2, this));
        }
        ImageView imageView3 = this.f73858d;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new G(new Ref.LongRef(), imageView3, this));
        }
        ImageView imageView4 = this.f73861g;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new H(new Ref.LongRef(), imageView4, this));
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setOnClickListener(new I(new Ref.LongRef(), textView, this));
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            Lifecycle lifecycle = fragmentActivityP32.getLifecycle();
            String hintMsg = this.f73866m.getHintMsg();
            PermissionsChecker.grantCameraPermission(fragmentActivityP32, lifecycle, (hintMsg == null || hintMsg.length() == 0) ? getString(2131829672) : this.f73866m.getHintMsg()).continueWith(new D(this), Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.imageselector.page.MallMediaBaseFragment
    public final boolean supportToolbar() {
        return false;
    }
}

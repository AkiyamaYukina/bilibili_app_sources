package com.bilibili.lib.projection.internal.search;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.projection.internal.search.ProjectionSearchFragment;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.StatusBarCompat;
import he0.C7435d;
import ie0.C7564c;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFullActivity.class */
public class ProjectionSearchFullActivity extends BaseAppCompatActivity implements J {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f63700G = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public Toolbar f63701B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63702C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f63703D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f63704E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f63705F;

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.ProjectionSearchFullActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFullActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ProjectionSearchFullActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.ProjectionSearchFullActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFullActivity$onCreate$1$1.class */
        public static final class C03541 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final ProjectionSearchFullActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03541(ProjectionSearchFullActivity projectionSearchFullActivity, Continuation<? super C03541> continuation) {
                super(2, continuation);
                this.this$0 = projectionSearchFullActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03541(this.this$0, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScreenAdjustUtilsKt.correctOrientation(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProjectionSearchFullActivity projectionSearchFullActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = projectionSearchFullActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0);
                C03541 c03541 = new C03541(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03541, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void P6() {
        if (this.f63701B == null) {
            View viewFindViewById = findViewById(2131304944);
            if (viewFindViewById == null) {
                this.f63701B = (Toolbar) getLayoutInflater().inflate(2131494540, (ViewGroup) findViewById(R.id.content)).findViewById(2131304944);
            } else {
                this.f63701B = (Toolbar) viewFindViewById;
            }
            this.f63701B.setTitle("");
            this.f63701B.setContentInsetsAbsolute(0, 0);
            setSupportActionBar(this.f63701B);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    @Nullable
    public final ActionBar getSupportActionBar() {
        P6();
        return super.getSupportActionBar();
    }

    @Override // com.bilibili.lib.projection.internal.search.J
    public final void k() {
        super.finish();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ScreenAdjustUtilsKt.correctOrientation(this);
        super.onCreate(bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        new WeakReference(this);
        setContentView(2131492941);
        P6();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final int i7 = 0;
        this.f63701B.setNavigationOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.lib.projection.internal.search.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f63536a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f63537b;

            {
                this.f63536a = i7;
                this.f63537b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0179  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x01dd  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r22) {
                /*
                    Method dump skipped, instruction units count: 634
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.H.onClick(android.view.View):void");
            }
        });
        this.f63705F = BundleUtil.getInteger(getIntent().getExtras(), "key_height", new Integer[]{0}).intValue();
        int iIntValue = BundleUtil.getInteger(getIntent().getExtras(), "key_client_id", new Integer[]{0}).intValue();
        this.f63703D = iIntValue;
        C7564c c7564c = C7564c.f121625a;
        this.f63702C = c7564c.h(iIntValue);
        InterfaceC7845m interfaceC7845mH = c7564c.h(this.f63703D);
        if (interfaceC7845mH != null) {
            interfaceC7845mH.getConfig();
        }
        this.f63704E = BundleUtil.getBoolean(getIntent().getExtras(), "key_switch", new boolean[]{false});
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        Toolbar toolbar = this.f63701B;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(null);
            this.f63701B = null;
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        View decorView;
        View decorView2;
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBar(this, ViewCompat.MEASURED_STATE_MASK);
        if (!NotchCompat.hasDisplayCutoutHardware(getWindow())) {
            Window window = getWindow();
            if (window != null && (decorView2 = window.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility());
            }
            Window window2 = getWindow();
            if (window2 != null && (decorView = window2.getDecorView()) != null) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-5));
            }
        }
        if (isFinishing() || isDestroyed()) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("ProjectionSearchFragment");
        Fragment fragmentA = fragmentFindFragmentByTag;
        if (fragmentFindFragmentByTag == null) {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new int[]{2130970030});
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            fragmentA = ProjectionSearchFragment.a.a(this.f63703D, this.f63704E, dimensionPixelSize, this.f63705F, true, false, C7435d.f120838c, false, 160);
        }
        if (fragmentA instanceof ProjectionSearchFragment) {
            ProjectionSearchFragment projectionSearchFragment = (ProjectionSearchFragment) fragmentA;
            projectionSearchFragment.f63611S1 = this;
            if (projectionSearchFragment.isAdded()) {
                return;
            }
            projectionSearchFragment.showNow(supportFragmentManager, "ProjectionSearchFragment");
        }
    }
}

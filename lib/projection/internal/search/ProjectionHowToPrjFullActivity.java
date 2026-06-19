package com.bilibili.lib.projection.internal.search;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.analytics.U;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionHowToPrjFullActivity.class */
public final class ProjectionHowToPrjFullActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f63570E = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public ViewGroup f63571B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public Toolbar f63572C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public TextView f63573D;

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.ProjectionHowToPrjFullActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionHowToPrjFullActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ProjectionHowToPrjFullActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.ProjectionHowToPrjFullActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionHowToPrjFullActivity$onCreate$1$1.class */
        public static final class C03521 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final ProjectionHowToPrjFullActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03521(ProjectionHowToPrjFullActivity projectionHowToPrjFullActivity, Continuation<? super C03521> continuation) {
                super(2, continuation);
                this.this$0 = projectionHowToPrjFullActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03521(this.this$0, continuation);
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
        public AnonymousClass1(ProjectionHowToPrjFullActivity projectionHowToPrjFullActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = projectionHowToPrjFullActivity;
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
                C03521 c03521 = new C03521(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03521, this) == coroutine_suspended) {
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

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ScreenAdjustUtilsKt.correctOrientation(this);
        super.onCreate(bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        setContentView(2131492944);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131309279);
        this.f63571B = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(2131309288);
        this.f63573D = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (this.f63572C == null) {
            View viewFindViewById = findViewById(2131304944);
            if (viewFindViewById == null) {
                this.f63572C = (Toolbar) getLayoutInflater().inflate(2131494540, (ViewGroup) findViewById(R.id.content)).findViewById(2131304944);
            } else {
                this.f63572C = (Toolbar) viewFindViewById;
            }
            Toolbar toolbar = this.f63572C;
            if (toolbar != null) {
            }
            this.f63572C.setTitle("");
            this.f63572C.setContentInsetsAbsolute(0, 0);
            setSupportActionBar(this.f63572C);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.f63572C.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.search.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionHowToPrjFullActivity f63727a;

            {
                this.f63727a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProjectionHowToPrjFullActivity projectionHowToPrjFullActivity = this.f63727a;
                int i7 = ProjectionHowToPrjFullActivity.f63570E;
                if (projectionHowToPrjFullActivity.isFragmentStateSaved()) {
                    return;
                }
                projectionHowToPrjFullActivity.onBackPressed();
            }
        });
        HandlerThreads.getHandler(0).postDelayed(new Runnable(this) { // from class: com.bilibili.lib.projection.internal.search.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionHowToPrjFullActivity f63726a;

            {
                this.f63726a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String string;
                TextView textView2;
                ProjectionHowToPrjFullActivity projectionHowToPrjFullActivity = this.f63726a;
                int i7 = ProjectionHowToPrjFullActivity.f63570E;
                if (projectionHowToPrjFullActivity.isFinishing()) {
                    return;
                }
                String strC = Ie0.j.c();
                if (strC == null || strC.length() == 0) {
                    TextView textView3 = projectionHowToPrjFullActivity.f63573D;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                        return;
                    }
                    return;
                }
                Resources resources = projectionHowToPrjFullActivity.getResources();
                if (resources != null && (string = resources.getString(2131833701)) != null && (textView2 = projectionHowToPrjFullActivity.f63573D) != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    U.a(new Object[]{strC}, 1, string, textView2);
                }
                TextView textView4 = projectionHowToPrjFullActivity.f63573D;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
            }
        }, 1000L);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        Toolbar toolbar = this.f63572C;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(null);
            this.f63572C = null;
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
    }
}

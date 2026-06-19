package com.bilibili.ogv.review.reviewpublish;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.pub.review.bean.ReviewShareData;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity.class */
@StabilityInferred(parameters = 0)
public final class ShortReviewPublishActivity extends BaseToolbarActivity implements IMiniPlayerContainer {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Garb f72483D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ShortReviewPublishFragment f72484E;

    /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ShortReviewPublishActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishActivity$onCreate$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity$onCreate$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShortReviewPublishActivity f72485a;

            public a(ShortReviewPublishActivity shortReviewPublishActivity) {
                this.f72485a = shortReviewPublishActivity;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f72485a.setTitle((String) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShortReviewPublishActivity shortReviewPublishActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = shortReviewPublishActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ShortReviewPublishFragment shortReviewPublishFragment = this.this$0.f72484E;
                ShortReviewPublishFragment shortReviewPublishFragment2 = shortReviewPublishFragment;
                if (shortReviewPublishFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragment");
                    shortReviewPublishFragment2 = null;
                }
                MutableSharedFlow<String> mutableSharedFlow = shortReviewPublishFragment2.f72509w;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishActivity$onCreate$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity$onCreate$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ShortReviewPublishActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishActivity$onCreate$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity$onCreate$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShortReviewPublishActivity f72486a;

            public a(ShortReviewPublishActivity shortReviewPublishActivity) {
                this.f72486a = shortReviewPublishActivity;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f72486a.finish();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShortReviewPublishActivity shortReviewPublishActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = shortReviewPublishActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ShortReviewPublishFragment shortReviewPublishFragment = this.this$0.f72484E;
                ShortReviewPublishFragment shortReviewPublishFragment2 = shortReviewPublishFragment;
                if (shortReviewPublishFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragment");
                    shortReviewPublishFragment2 = null;
                }
                MutableSharedFlow<Unit> mutableSharedFlow = shortReviewPublishFragment2.f72508v;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishActivity$onCreate$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity$onCreate$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ShortReviewPublishActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishActivity$onCreate$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishActivity$onCreate$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShortReviewPublishActivity f72487a;

            public a(ShortReviewPublishActivity shortReviewPublishActivity) {
                this.f72487a = shortReviewPublishActivity;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ReviewShareData reviewShareDataA = g.a((ReviewPublishInfo) obj);
                Bundle bundle = new Bundle();
                bundle.putParcelable("REVIEW_SHARE_DATA", reviewShareDataA);
                bundle.putBoolean("is_newly_published_review", true);
                RouteRequest.Builder builder = new RouteRequest.Builder("activity://bangumi/review/review-share");
                builder.getExtras().put("default_extra_bundle", bundle);
                Qj0.g.c(this.f72487a, builder.build());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ShortReviewPublishActivity shortReviewPublishActivity, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = shortReviewPublishActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ShortReviewPublishFragment shortReviewPublishFragment = this.this$0.f72484E;
                ShortReviewPublishFragment shortReviewPublishFragment2 = shortReviewPublishFragment;
                if (shortReviewPublishFragment == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragment");
                    shortReviewPublishFragment2 = null;
                }
                MutableSharedFlow<ReviewPublishInfo> mutableSharedFlow = shortReviewPublishFragment2.f72510x;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final String getMiniPlayerContainerKey() {
        return "ogv_review_page";
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ShortReviewPublishFragment shortReviewPublishFragment = this.f72484E;
        ShortReviewPublishFragment shortReviewPublishFragment2 = shortReviewPublishFragment;
        if (shortReviewPublishFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment");
            shortReviewPublishFragment2 = null;
        }
        if (shortReviewPublishFragment2.f72502p) {
            ReviewPublishInfo reviewPublishInfo = shortReviewPublishFragment2.f72497k;
            ReviewPublishInfo reviewPublishInfo2 = reviewPublishInfo;
            if (reviewPublishInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("review");
                reviewPublishInfo2 = null;
            }
            if (!reviewPublishInfo2.f71726d && !shortReviewPublishFragment2.f72496j) {
                AlertDialog alertDialog = shortReviewPublishFragment2.f72499m;
                if (alertDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    alertDialog = null;
                }
                alertDialog.show();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499790);
        if (bundle == null) {
            ShortReviewPublishFragment shortReviewPublishFragment = new ShortReviewPublishFragment();
            shortReviewPublishFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(2131298614, shortReviewPublishFragment).commit();
            this.f72484E = shortReviewPublishFragment;
        } else {
            this.f72484E = (ShortReviewPublishFragment) getSupportFragmentManager().findFragmentById(2131298614);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        this.f72483D = GarbManager.getCurGarb();
        ensureToolbar();
        showBackButton();
        int themeAttrColor = ThemeUtils.getThemeAttrColor(this, 2130968986);
        int color = ContextCompat.getColor(this, R$color.Ga10);
        Garb garb = this.f72483D;
        Garb garb2 = garb;
        if (garb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb2 = null;
        }
        if (!garb2.isPure()) {
            Garb garb3 = this.f72483D;
            Garb garb4 = garb3;
            if (garb3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb4 = null;
            }
            themeAttrColor = garb4.getSecondaryPageColor();
            Garb garb5 = this.f72483D;
            if (garb5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb5 = null;
            }
            color = garb5.getFontColor();
        }
        if (getToolbar() instanceof TintToolbar) {
            ((TintToolbar) getToolbar()).setIconTintColorWithGarb(color);
        }
        StatusBarCompat.tintStatusBar(this, themeAttrColor);
        getSupportActionBar().setElevation(0.0f);
        findViewById(2131297218).setElevation(0.0f);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void tintSystemBar() {
        StatusBarCompat.immersiveStatusBar(this);
        StatusBarCompat.setHeightAndPadding(this, getToolbar());
        StatusBarCompat.setStatusBarDarkMode(this);
    }
}

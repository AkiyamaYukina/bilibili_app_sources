package com.bilibili.playerbizcommonv2.widget.popup;

import Dr0.c;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.digital.widget.edit.J;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.widget.popup.FollowPopupUtil;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$showWithScene$1$1$2.class */
public final class FollowPopupUtil$showWithScene$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final ComponentActivity $activity;
    final FollowPopupUtil.Scene $scene;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$showWithScene$1$1$2$a.class */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentActivity f82623a;

        public a(ComponentActivity componentActivity) {
            this.f82623a = componentActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Lazy lazy = FollowPopupUtil.f82614a;
            Job job = FollowPopupUtil.f82615b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            FollowPopupUtil.f82615b = null;
            Log.i("FollowPopupUtil$showWithScene$1$1$2$invokeSuspend$$inlined$generateContentView$1-onClick", "[playerbizcommonv2-FollowPopupUtil$showWithScene$1$1$2$invokeSuspend$$inlined$generateContentView$1-onClick] dismiss, and route to push settings");
            BLRouter.routeTo(new RouteRequest.Builder("activity://main/preference").extras(new J(1)).build(), this.f82623a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPopupUtil$showWithScene$1$1$2(ComponentActivity componentActivity, FollowPopupUtil.Scene scene, Continuation<? super FollowPopupUtil$showWithScene$1$1$2> continuation) {
        super(1, continuation);
        this.$activity = componentActivity;
        this.$scene = scene;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FollowPopupUtil$showWithScene$1$1$2(this.$activity, this.$scene, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ViewGroup viewGroup = (ViewGroup) this.$activity.getWindow().getDecorView().findViewById(R.id.content);
            Lazy lazy = FollowPopupUtil.f82614a;
            ComponentActivity componentActivity = this.$activity;
            String string = ContextCompat.getString(componentActivity, 2131847281);
            String string2 = ContextCompat.getString(this.$activity, 2131845678);
            int iBgColor = this.$scene.bgColor();
            int iIconColor = this.$scene.iconColor();
            int iContentTextColor = this.$scene.contentTextColor();
            int i8 = R$color.Brand_pink;
            ComponentActivity componentActivity2 = this.$activity;
            c cVarInflate = c.inflate(LayoutInflater.from(componentActivity), viewGroup, false);
            if (cVarInflate.f3046c.getLayoutParams() != null) {
                ConstraintLayout constraintLayout = cVarInflate.f3046c;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = RangesKt.coerceAtMost(ScreenUtil.getScreenWidth(componentActivity), ScreenUtil.getScreenHeight(componentActivity)) - NewPlayerUtilsKt.toPx(24);
                constraintLayout.setLayoutParams(layoutParams);
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(componentActivity, iBgColor)));
            }
            Integer num = 2131238784;
            Drawable appCompatDrawable = KtxKt.getAppCompatDrawable(componentActivity, num.intValue());
            if (appCompatDrawable != null) {
                cVarInflate.f3049f.setImageDrawable(appCompatDrawable);
                cVarInflate.f3049f.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(componentActivity, iIconColor)));
                cVarInflate.f3049f.setVisibility(0);
            }
            cVarInflate.f3048e.setText(string);
            cVarInflate.f3048e.setTextColor(ContextCompat.getColor(componentActivity, iContentTextColor));
            cVarInflate.f3045b.setText(string2);
            cVarInflate.f3045b.setTextColor(ContextCompat.getColor(componentActivity, i8));
            cVarInflate.f3045b.setOnClickListener(new a(componentActivity2));
            FollowPopupUtil.a aVar = new FollowPopupUtil.a(cVarInflate.f3044a, viewGroup, this.$scene.yOffset());
            this.label = 1;
            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new FollowPopupUtil$popAndKeep$2(aVar, null), this);
            if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCoroutineScope = Unit.INSTANCE;
            }
            if (objCoroutineScope == coroutine_suspended) {
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

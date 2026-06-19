package com.bilibili.ogv.review.reviewpublish;

import OS0.J;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.captcha.h5.WebCaptchaInfo;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;
import com.bilibili.ogv.pub.review.bean.SimpleRating;
import com.bilibili.ogv.pub.review.bean.UserReview;
import com.bilibili.ogv.review.a;
import com.bilibili.ogv.review.data.BangumiReviewApiService;
import com.bilibili.ogv.review.widget.ReviewRatingBar;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.regex.Pattern;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;
import zl0.C9206e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment.class */
@StabilityInferred(parameters = 0)
public final class ShortReviewPublishFragment extends androidx_fragment_app_Fragment implements wl0.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final KProperty<Object>[] f72488A = {new PropertyReference1Impl(ShortReviewPublishFragment.class, "contentView", "getContentView()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f72489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f72490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f72491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BiliImageView f72492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f72493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CheckBox f72494g;
    public View h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f72496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ReviewPublishInfo f72497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.bilibili.ogv.review.a f72498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AlertDialog f72499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TintProgressDialog f72500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f72501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f72502p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public b f72504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ReviewRatingBar f72505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f72506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f72507u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public PinnedBottomScrollingBehavior f72512z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f72495i = 2131298661;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f72503q = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f72508v = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<String> f72509w = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<ReviewPublishInfo> f72510x = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final a f72511y = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$a.class */
    public static final class a extends FragmentManager.FragmentLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShortReviewPublishFragment f72513a;

        public a(ShortReviewPublishFragment shortReviewPublishFragment) {
            this.f72513a = shortReviewPublishFragment;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
            super.onFragmentDetached(fragmentManager, fragment);
            if (fragment instanceof ReviewShareDialogFragment) {
                KProperty<Object>[] kPropertyArr = ShortReviewPublishFragment.f72488A;
                this.f72513a.kf();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShortReviewPublishFragment f72514a;

        public b(ShortReviewPublishFragment shortReviewPublishFragment) {
            this.f72514a = shortReviewPublishFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$c.class */
    public static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f72515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ShortReviewPublishFragment f72516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f72517c;

        public c(View view, ShortReviewPublishFragment shortReviewPublishFragment, View view2) {
            this.f72515a = view;
            this.f72516b = shortReviewPublishFragment;
            this.f72517c = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f72515a.removeOnAttachStateChangeListener(this);
            this.f72516b.f72512z = Ll0.a.a(this.f72517c);
            ShortReviewPublishFragment shortReviewPublishFragment = this.f72516b;
            PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = shortReviewPublishFragment.f72512z;
            if (pinnedBottomScrollingBehavior != null) {
                View view2 = shortReviewPublishFragment.h;
                View view3 = view2;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomViews");
                    view3 = null;
                }
                pinnedBottomScrollingBehavior.addPinnedView(view3);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$d.class */
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShortReviewPublishFragment f72518a;

        public d(ShortReviewPublishFragment shortReviewPublishFragment) {
            this.f72518a = shortReviewPublishFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ShortReviewPublishFragment shortReviewPublishFragment = this.f72518a;
            KProperty<Object>[] kPropertyArr = ShortReviewPublishFragment.f72488A;
            shortReviewPublishFragment.m7685if();
            ReviewPublishInfo reviewPublishInfo = this.f72518a.f72497k;
            ReviewPublishInfo reviewPublishInfo2 = reviewPublishInfo;
            if (reviewPublishInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("review");
                reviewPublishInfo2 = null;
            }
            UserReview userReview = reviewPublishInfo2.f71724b.f71731d;
            String string = editable.toString();
            int length = string.length() - 1;
            int i7 = 0;
            boolean z6 = false;
            while (i7 <= length) {
                boolean z7 = Intrinsics.compare(string.charAt(!z6 ? i7 : length), 32) <= 0;
                if (z6) {
                    if (!z7) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z7) {
                    i7++;
                } else {
                    z6 = true;
                }
            }
            userReview.f71760c = string.subSequence(i7, length + 1).toString();
            this.f72518a.f72502p = true;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishFragment$onActivityResult$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$onActivityResult$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ShortReviewPublishFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShortReviewPublishFragment shortReviewPublishFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = shortReviewPublishFragment;
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
                String str = this.this$0.f72503q;
                this.label = 1;
                Object objEmit = com.bilibili.ogv.review.reviewpublish.c.f72526a.emit(str, this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                if (objEmit == coroutine_suspended) {
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

    public static ReviewPublishInfo jf(ReviewPublishInfo reviewPublishInfo) {
        ReviewPublishInfo reviewPublishInfo2 = reviewPublishInfo;
        if (reviewPublishInfo == null) {
            reviewPublishInfo2 = new ReviewPublishInfo();
        }
        if (reviewPublishInfo2.f71725c == null) {
            reviewPublishInfo2.f71725c = new UserReview();
        }
        UserReview userReview = reviewPublishInfo2.f71725c;
        if (userReview.f71762e == null) {
            userReview.f71762e = new SimpleRating(0, 1);
        }
        if (reviewPublishInfo2.f71724b == null) {
            reviewPublishInfo2.f71724b = new ReviewPublishInfo.PublishReview();
        }
        ReviewPublishInfo.PublishReview publishReview = reviewPublishInfo2.f71724b;
        if (publishReview.f71731d == null) {
            publishReview.f71731d = new UserReview();
        }
        ReviewPublishInfo.PublishReview publishReview2 = reviewPublishInfo2.f71724b;
        if (publishReview2.f71732e == null) {
            publishReview2.f71732e = new UserReview();
        }
        return reviewPublishInfo2;
    }

    @Override // wl0.b
    public final MutableSharedFlow A() {
        return this.f72509w;
    }

    public final void hf(float f7) {
        TextView textView = this.f72491d;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingHint");
            textView2 = null;
        }
        textView2.setText((CharSequence) ArraysKt.getOrNull(getResources().getStringArray(2130903124), MathKt.roundToInt(f7 / 2.0f)));
        ColorStateList colorStateList = AppCompatResources.getColorStateList(requireContext(), f7 > 0.0f ? R$color.Operate_orange : R$color.Text3);
        TextView textView3 = this.f72491d;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingHint");
            textView3 = null;
        }
        textView3.setTextColor(colorStateList);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX INFO: renamed from: if, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7685if() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.ogv.pub.review.bean.ReviewPublishInfo r0 = r0.f72497k
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L18
            java.lang.String r0 = "review"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r6 = r0
        L18:
            r0 = r6
            com.bilibili.ogv.pub.review.bean.ReviewPublishInfo$PublishReview r0 = r0.f71724b
            if (r0 == 0) goto L70
            r0 = r3
            com.bilibili.ogv.pub.review.bean.ReviewPublishInfo r0 = r0.f72497k
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L34
            java.lang.String r0 = "review"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r6 = r0
        L34:
            r0 = r6
            com.bilibili.ogv.pub.review.bean.ReviewPublishInfo$PublishReview r0 = r0.f71724b
            int r0 = r0.f71728a
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = 1
            r1 = r4
            if (r0 > r1) goto L70
            r0 = r4
            r1 = 11
            if (r0 >= r1) goto L70
            r0 = r3
            android.widget.EditText r0 = r0.f72506t
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            if (r0 != 0) goto L5e
            java.lang.String r0 = "inputContent"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r6 = r0
        L5e:
            r0 = r6
            android.text.Editable r0 = r0.getEditableText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r1 = 100
            if (r0 > r1) goto L70
            goto L72
        L70:
            r0 = 0
            r5 = r0
        L72:
            r0 = r3
            android.widget.TextView r0 = r0.f72507u
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L86
            java.lang.String r0 = "submit"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r7
            r6 = r0
            goto L86
        L86:
            r0 = r6
            r1 = r5
            r0.setEnabled(r1)
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishFragment.m7685if():boolean");
    }

    public final void kf() {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new ShortReviewPublishFragment$finish$1(this, null), 3, (Object) null);
    }

    public final void lf() {
        TintProgressDialog tintProgressDialog = this.f72500n;
        TintProgressDialog tintProgressDialog2 = tintProgressDialog;
        if (tintProgressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            tintProgressDialog2 = null;
        }
        if (tintProgressDialog2.isShowing()) {
            TintProgressDialog tintProgressDialog3 = this.f72500n;
            if (tintProgressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                tintProgressDialog3 = null;
            }
            tintProgressDialog3.dismiss();
        }
    }

    public final void mf(int i7) {
        if (i7 > 80) {
            TextView textView = this.f72489b;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("counting");
                textView2 = null;
            }
            textView2.setText(getString(2131857166, String.valueOf(100 - i7)));
            TextView textView3 = this.f72489b;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("counting");
                textView3 = null;
            }
            textView3.setTextColor(ThemeUtils.getColorById(requireContext(), 2131103284));
            return;
        }
        TextView textView4 = this.f72489b;
        TextView textView5 = textView4;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("counting");
            textView5 = null;
        }
        textView5.setText(getString(2131857167, String.valueOf(i7), "100"));
        TextView textView6 = this.f72489b;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("counting");
            textView6 = null;
        }
        textView6.setTextColor(ThemeUtils.getColorById(requireContext(), R$color.Ga4));
    }

    public final void nf() {
        ReviewPublishInfo reviewPublishInfo = this.f72497k;
        ReviewPublishInfo reviewPublishInfo2 = reviewPublishInfo;
        if (reviewPublishInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("review");
            reviewPublishInfo2 = null;
        }
        int i7 = reviewPublishInfo2.f71724b.f71728a;
        if (1 > i7 || i7 >= 11) {
            ReviewRatingBar reviewRatingBar = this.f72505s;
            ReviewRatingBar reviewRatingBar2 = reviewRatingBar;
            if (reviewRatingBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ratingBar");
                reviewRatingBar2 = null;
            }
            reviewRatingBar2.setRating(reviewRatingBar2.h * 0.0f);
        } else {
            ReviewRatingBar reviewRatingBar3 = this.f72505s;
            ReviewRatingBar reviewRatingBar4 = reviewRatingBar3;
            if (reviewRatingBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ratingBar");
                reviewRatingBar4 = null;
            }
            ReviewPublishInfo reviewPublishInfo3 = this.f72497k;
            ReviewPublishInfo reviewPublishInfo4 = reviewPublishInfo3;
            if (reviewPublishInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("review");
                reviewPublishInfo4 = null;
            }
            reviewRatingBar4.setRating(reviewPublishInfo4.f71724b.f71728a);
        }
        ReviewPublishInfo reviewPublishInfo5 = this.f72497k;
        ReviewPublishInfo reviewPublishInfo6 = reviewPublishInfo5;
        if (reviewPublishInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("review");
            reviewPublishInfo6 = null;
        }
        if (reviewPublishInfo6.f71724b.f71731d != null) {
            ReviewPublishInfo reviewPublishInfo7 = this.f72497k;
            ReviewPublishInfo reviewPublishInfo8 = reviewPublishInfo7;
            if (reviewPublishInfo7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("review");
                reviewPublishInfo8 = null;
            }
            UserReview userReview = reviewPublishInfo8.f71724b.f71731d;
            String str = userReview.f71760c;
            if (str == null || str.length() == 0) {
                return;
            }
            EditText editText = this.f72506t;
            EditText editText2 = editText;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputContent");
                editText2 = null;
            }
            editText2.setText(userReview.f71760c);
            EditText editText3 = this.f72506t;
            EditText editText4 = editText3;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputContent");
                editText4 = null;
            }
            if (editText4.getEditableText().toString().length() == 0) {
                String str2 = userReview.f71760c;
                userReview.f71760c = str2 != null ? str2.substring(0, 100) : null;
                EditText editText5 = this.f72506t;
                if (editText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputContent");
                    editText5 = null;
                }
                editText5.setText(userReview.f71760c);
            }
            this.f72502p = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void of(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishFragment.of(java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Deprecated in Java")
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 3333) {
            if (i8 == -1) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
            }
            kf();
        } else {
            if (i7 != 4444) {
                return;
            }
            WebCaptchaInfo webCaptchaInfo = intent != null ? (WebCaptchaInfo) intent.getParcelableExtra("captcha_info") : null;
            if (webCaptchaInfo != null && webCaptchaInfo.c) {
                of(webCaptchaInfo.a);
                return;
            }
            String stringExtra = null;
            if (intent != null) {
                stringExtra = intent.getStringExtra("close_way");
            }
            if (Intrinsics.areEqual(stringExtra, "2")) {
                ToastHelper.showToastShort(requireContext(), 2131857168);
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f72499m = new AlertDialog.Builder(requireContext(), 2131887322).setMessage(2131857147).setNegativeButton(2131857148, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.ogv.review.reviewpublish.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShortReviewPublishFragment f72549a;

            {
                this.f72549a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                ShortReviewPublishFragment shortReviewPublishFragment = this.f72549a;
                KProperty<Object>[] kPropertyArr = ShortReviewPublishFragment.f72488A;
                shortReviewPublishFragment.kf();
            }
        }).setPositiveButton(2131857144, new DialogInterface.OnClickListener(this) { // from class: com.bilibili.ogv.review.reviewpublish.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShortReviewPublishFragment f72550a;

            {
                this.f72550a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0100 A[Catch: all -> 0x00ed, Exception -> 0x00f5, TRY_ENTER, TryCatch #4 {Exception -> 0x00f5, all -> 0x00ed, blocks: (B:13:0x005e, B:15:0x0068, B:17:0x007e, B:22:0x0100), top: B:41:0x005e }] */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.content.DialogInterface r11, int r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 427
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.o.onClick(android.content.DialogInterface, int):void");
            }
        }).create();
        TintProgressDialog tintProgressDialog = new TintProgressDialog(requireContext());
        this.f72500n = tintProgressDialog;
        tintProgressDialog.setProgressStyle(0);
        this.f72504r = new b(this);
        getParentFragmentManager().registerFragmentLifecycleCallbacks(this.f72511y, true);
        if (bundle != null) {
            this.f72497k = jf((ReviewPublishInfo) bundle.getParcelable("REVIEW_PUBLISH_INFO"));
            this.f72496j = bundle.getBoolean("EDIT_MODE");
            this.f72502p = bundle.getBoolean("CONTENT_EDITED");
            this.f72503q = bundle.getString("MEDIA_ID", "");
            return;
        }
        Bundle bundle2 = requireArguments().getBundle("default_extra_bundle");
        Bundle bundleRequireArguments = bundle2;
        if (bundle2 == null) {
            bundleRequireArguments = requireArguments();
        }
        ReviewPublishInfo reviewPublishInfoJf = jf((ReviewPublishInfo) bundleRequireArguments.getParcelable("REVIEW_PUBLISH_INFO"));
        this.f72497k = reviewPublishInfoJf;
        this.f72496j = reviewPublishInfoJf.f71726d;
        String string = bundleRequireArguments.getString("MEDIA_ID", "");
        this.f72503q = string;
        if (string.length() == 0) {
            this.f72503q = bundleRequireArguments.getString("media_id", "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131499855, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        lf();
        super.onDestroy();
        com.bilibili.ogv.review.a aVar = this.f72498l;
        com.bilibili.ogv.review.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("draftHelper");
            aVar2 = null;
        }
        SQLiteDatabase sQLiteDatabase = aVar2.f72209b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        a.C0454a c0454a = aVar2.f72208a;
        if (c0454a != null) {
            c0454a.close();
        }
        getParentFragmentManager().unregisterFragmentLifecycleCallbacks(this.f72511y);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior = this.f72512z;
        if (pinnedBottomScrollingBehavior != null) {
            View view = this.h;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomViews");
                view2 = null;
            }
            pinnedBottomScrollingBehavior.removePinnedView(view2);
        }
        this.f72512z = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ReviewPublishInfo reviewPublishInfo = this.f72497k;
        ReviewPublishInfo reviewPublishInfo2 = reviewPublishInfo;
        if (reviewPublishInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("review");
            reviewPublishInfo2 = null;
        }
        bundle.putParcelable("REVIEW_PUBLISH_INFO", reviewPublishInfo2);
        bundle.putBoolean("EDIT_MODE", this.f72496j);
        bundle.putBoolean("CONTENT_EDITED", this.f72502p);
        bundle.putString("MEDIA_ID", this.f72503q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [android.text.InputFilter$LengthFilter, com.bilibili.ogv.review.reviewpublish.b] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.h = view.findViewById(2131297542);
        if (view.isAttachedToWindow()) {
            PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorA = Ll0.a.a(view);
            this.f72512z = pinnedBottomScrollingBehaviorA;
            if (pinnedBottomScrollingBehaviorA != null) {
                View view2 = this.h;
                View view3 = view2;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomViews");
                    view3 = null;
                }
                pinnedBottomScrollingBehaviorA.addPinnedView(view3);
            }
        } else {
            view.addOnAttachStateChangeListener(new c(view, this, view));
        }
        this.f72505s = (ReviewRatingBar) view.findViewById(2131309864);
        EditText editText = (EditText) view.findViewById(2131303711);
        this.f72506t = editText;
        EditText editText2 = editText;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContent");
            editText2 = null;
        }
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.bilibili.ogv.review.reviewpublish.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ShortReviewPublishFragment f72551a;

            {
                this.f72551a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view4, boolean z6) {
                ShortReviewPublishFragment shortReviewPublishFragment = this.f72551a;
                KProperty<Object>[] kPropertyArr = ShortReviewPublishFragment.f72488A;
                if (z6) {
                    return;
                }
                Context contextRequireContext = shortReviewPublishFragment.requireContext();
                EditText editText3 = shortReviewPublishFragment.f72506t;
                EditText editText4 = editText3;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputContent");
                    editText4 = null;
                }
                InputMethodManagerHelper.hideSoftInput(contextRequireContext, editText4, 0);
            }
        });
        int i7 = this.f72495i;
        KProperty<Object> kProperty = f72488A[0];
        Dj0.a.a(i7, this).setOnClickListener(new cT0.o(this, 1));
        this.f72489b = (TextView) view.findViewById(2131303719);
        this.f72507u = (TextView) view.findViewById(2131309746);
        this.f72490c = (TextView) view.findViewById(2131299964);
        this.f72491d = (TextView) view.findViewById(2131309872);
        this.f72492e = view.findViewById(2131296796);
        this.f72493f = (TextView) view.findViewById(2131315975);
        this.f72494g = (CheckBox) view.findViewById(2131311198);
        hf(0.0f);
        ReviewRatingBar reviewRatingBar = this.f72505s;
        ReviewRatingBar reviewRatingBar2 = reviewRatingBar;
        if (reviewRatingBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingBar");
            reviewRatingBar2 = null;
        }
        reviewRatingBar2.setOnRatingChangeListener(new q(this));
        this.f72498l = new com.bilibili.ogv.review.a(requireContext());
        mf(0);
        TextView textView = this.f72507u;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submit");
            textView2 = null;
        }
        textView2.setOnClickListener(new Ay0.f(this, 2));
        if (this.f72503q.length() == 0) {
            kf();
        }
        if (!this.f72501o) {
            TintProgressDialog tintProgressDialog = this.f72500n;
            TintProgressDialog tintProgressDialog2 = tintProgressDialog;
            if (tintProgressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                tintProgressDialog2 = null;
            }
            tintProgressDialog2.setMessage(getString(2131857155));
            TintProgressDialog tintProgressDialog3 = this.f72500n;
            TintProgressDialog tintProgressDialog4 = tintProgressDialog3;
            if (tintProgressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                tintProgressDialog4 = null;
            }
            tintProgressDialog4.setCancelable(false);
            TintProgressDialog tintProgressDialog5 = this.f72500n;
            TintProgressDialog tintProgressDialog6 = tintProgressDialog5;
            if (tintProgressDialog5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                tintProgressDialog6 = null;
            }
            tintProgressDialog6.setCanceledOnTouchOutside(false);
            TintProgressDialog tintProgressDialog7 = this.f72500n;
            TintProgressDialog tintProgressDialog8 = tintProgressDialog7;
            if (tintProgressDialog7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
                tintProgressDialog8 = null;
            }
            tintProgressDialog8.show();
            this.f72501o = true;
            BangumiReviewApiService bangumiReviewApiService = C9206e.f130331a;
            Single<ReviewPublishInfo> userReview = C9206e.f130331a.getUserReview(this.f72503q);
            Functions.v vVar = Functions.a;
            com.bilibili.okretro.call.rxjava.c.a(userReview.subscribe(new Consumer(this) { // from class: com.bilibili.ogv.review.reviewpublish.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ShortReviewPublishFragment f72547a;

                {
                    this.f72547a = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:78:0x029f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void accept(java.lang.Object r10) {
                    /*
                        Method dump skipped, instruction units count: 680
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.l.accept(java.lang.Object):void");
                }
            }, new JC0.a(this)), getLifecycle());
        }
        mf(0);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new ShortReviewPublishFragment$setTitle$1(this, getString(2131857120), null), 3, (Object) null);
        TextView textView3 = this.f72507u;
        TextView textView4 = textView3;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("submit");
            textView4 = null;
        }
        textView4.setEnabled(false);
        EditText editText3 = this.f72506t;
        EditText editText4 = editText3;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContent");
            editText4 = null;
        }
        r rVar = new r(this);
        ?? lengthFilter = new InputFilter.LengthFilter(100);
        lengthFilter.f72524c = Pattern.compile("[\\s\\n]");
        lengthFilter.f72525d = true;
        lengthFilter.f72522a = Pattern.compile("[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]|[\\u2600-\\u27ff]|\\n", 64);
        lengthFilter.f72523b = rVar;
        editText4.setFilters(new InputFilter[]{lengthFilter});
        EditText editText5 = this.f72506t;
        EditText editText6 = editText5;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContent");
            editText6 = null;
        }
        editText6.addTextChangedListener(new d(this));
        EditText editText7 = this.f72506t;
        EditText editText8 = editText7;
        if (editText7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContent");
            editText8 = null;
        }
        editText8.setHorizontallyScrolling(false);
        EditText editText9 = this.f72506t;
        EditText editText10 = editText9;
        if (editText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContent");
            editText10 = null;
        }
        editText10.setImeOptions(6);
        EditText editText11 = this.f72506t;
        EditText editText12 = editText11;
        if (editText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputContent");
            editText12 = null;
        }
        editText12.setMaxLines(10);
        TextView textView5 = this.f72490c;
        TextView textView6 = textView5;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delete");
            textView6 = null;
        }
        textView6.setOnClickListener(new J(this, 2));
        ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(this);
        BiliAccountInfo biliAccountInfo = com.bilibili.ogv.infra.account.a.f67851a;
        AccountInfo accountInfoFromCache = biliAccountInfo.getAccountInfoFromCache();
        ImageRequestBuilder imageRequestBuilderUrl = imageRequestBuilderWith.url(accountInfoFromCache != null ? accountInfoFromCache.getAvatar() : null);
        BiliImageView biliImageView = this.f72492e;
        BiliImageView biliImageView2 = biliImageView;
        if (biliImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("avatar");
            biliImageView2 = null;
        }
        imageRequestBuilderUrl.into(biliImageView2);
        TextView textView7 = this.f72493f;
        TextView textView8 = textView7;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameTextView");
            textView8 = null;
        }
        AccountInfo accountInfoFromCache2 = biliAccountInfo.getAccountInfoFromCache();
        String userName = null;
        if (accountInfoFromCache2 != null) {
            userName = accountInfoFromCache2.getUserName();
        }
        textView8.setText(userName);
    }

    @Override // wl0.b
    public final MutableSharedFlow s() {
        return this.f72508v;
    }

    @Override // wl0.b
    public final MutableSharedFlow s1() {
        return this.f72510x;
    }
}

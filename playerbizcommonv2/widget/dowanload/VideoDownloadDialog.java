package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.category.Z;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.r1;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.playerbizcommonv2.widget.dowanload.k;
import com.bilibili.playerbizcommonv2.widget.dowanload.q;
import com.bilibili.playerbizcommonv2.widget.dowanload.t;
import com.bilibili.playerbizcommonv2.widget.setting.channel.InterfaceC5833b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog.class */
@StabilityInferred(parameters = 0)
public final class VideoDownloadDialog extends ComponentDialog {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f82487n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f82488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<t.a> f82489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<k.a> f82490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<q.a> f82491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f82492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC5833b f82493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82494g;

    @NotNull
    public final Function0<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Dr0.h f82497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public WindowSizeClass f82498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f82499m;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final VideoDownloadDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(VideoDownloadDialog videoDownloadDialog, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = videoDownloadDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass10(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.this$0.f82491d.isEmpty()) {
                    VideoDownloadDialog videoDownloadDialog = this.this$0;
                    Dr0.h hVar = videoDownloadDialog.f82497k;
                    Dr0.h hVar2 = hVar;
                    if (hVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
                        hVar2 = null;
                    }
                    RecyclerView recyclerView = hVar2.f3078m;
                    Dr0.h hVar3 = this.this$0.f82497k;
                    if (hVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
                        hVar3 = null;
                    }
                    RecyclerView recyclerView2 = hVar3.f3075j;
                    StateFlow<Long> stateFlow = this.this$0.f82492e.f82546a;
                    this.label = 2;
                    if (VideoDownloadDialog.k(videoDownloadDialog, recyclerView, recyclerView2, stateFlow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    VideoDownloadDialog videoDownloadDialog2 = this.this$0;
                    Dr0.h hVar4 = videoDownloadDialog2.f82497k;
                    Dr0.h hVar5 = hVar4;
                    if (hVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
                        hVar5 = null;
                    }
                    RecyclerView recyclerView3 = hVar5.f3078m;
                    Dr0.h hVar6 = this.this$0.f82497k;
                    if (hVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
                        hVar6 = null;
                    }
                    RecyclerView recyclerView4 = hVar6.f3075j;
                    StateFlow<Long> stateFlow2 = this.this$0.f82492e.f82546a;
                    this.label = 1;
                    if (VideoDownloadDialog.j(videoDownloadDialog2, recyclerView3, recyclerView4, stateFlow2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$11, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$11.class */
    public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TextView $videoQuality;
        int label;
        final VideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$11$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$11$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final TextView $videoQuality;
            Object L$0;
            int label;
            final VideoDownloadDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VideoDownloadDialog videoDownloadDialog, TextView textView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = videoDownloadDialog;
                this.$videoQuality = textView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$videoQuality, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strA = G.p.a(this.this$0.getContext().getString(2131845640), " ");
                SpannableString spannableString = new SpannableString(strA);
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.this$0.getContext(), R$color.Text2)), 0, strA.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) str);
                this.$videoQuality.setText(spannableStringBuilder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(VideoDownloadDialog videoDownloadDialog, TextView textView, Continuation<? super AnonymousClass11> continuation) {
            super(2, continuation);
            this.this$0 = videoDownloadDialog;
            this.$videoQuality = textView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass11(this.this$0, this.$videoQuality, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                VideoDownloadDialog videoDownloadDialog = this.this$0;
                StateFlow<String> stateFlow = videoDownloadDialog.f82492e.f82547b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(videoDownloadDialog, this.$videoQuality, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$12, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$12.class */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ImageView $audioArrow;
        final TextView $audioType;
        int label;
        final VideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$12$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$12$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final ImageView $audioArrow;
            final TextView $audioType;
            Object L$0;
            int label;
            final VideoDownloadDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextView textView, ImageView imageView, VideoDownloadDialog videoDownloadDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$audioType = textView;
                this.$audioArrow = imageView;
                this.this$0 = videoDownloadDialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$audioType, this.$audioArrow, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                if (StringsKt.isBlank(str)) {
                    this.$audioType.setVisibility(8);
                    this.$audioArrow.setVisibility(8);
                    return Unit.INSTANCE;
                }
                this.$audioType.setVisibility(0);
                this.$audioArrow.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strA = G.p.a(this.this$0.getContext().getString(2131839119), " ");
                SpannableString spannableString = new SpannableString(strA);
                spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.this$0.getContext(), R$color.Text2)), 0, strA.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) str);
                this.$audioType.setText(spannableStringBuilder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(VideoDownloadDialog videoDownloadDialog, TextView textView, ImageView imageView, Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
            this.this$0 = videoDownloadDialog;
            this.$audioType = textView;
            this.$audioArrow = imageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass12(this.this$0, this.$audioType, this.$audioArrow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                VideoDownloadDialog videoDownloadDialog = this.this$0;
                StateFlow<String> stateFlow = videoDownloadDialog.f82492e.f82548c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$audioType, this.$audioArrow, videoDownloadDialog, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$13, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$13.class */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ImageView $downloadViewDot;
        int label;
        final VideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$13$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$13$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ImageView $downloadViewDot;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ImageView imageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$downloadViewDot = imageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$downloadViewDot, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$downloadViewDot.setVisibility(this.Z$0 ? 0 : 8);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(ImageView imageView, VideoDownloadDialog videoDownloadDialog, Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
            this.$downloadViewDot = imageView;
            this.this$0 = videoDownloadDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass13(this.$downloadViewDot, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.$downloadViewDot.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(this.this$0.getContext(), R$color.Stress_red), 0.0f, 4, 0));
                StateFlow<Boolean> stateFlow = this.this$0.f82492e.f82549d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$downloadViewDot, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$14, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$14.class */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TextView $storage;
        int label;
        final VideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$14$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$14$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Long>, Continuation<? super Unit>, Object> {
            final TextView $storage;
            Object L$0;
            int label;
            final VideoDownloadDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VideoDownloadDialog videoDownloadDialog, TextView textView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = videoDownloadDialog;
                this.$storage = textView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$storage, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Pair<Long, Long> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                long jLongValue = ((Number) pair.component1()).longValue();
                long jLongValue2 = ((Number) pair.component2()).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (jLongValue2 > 0) {
                    if (jLongValue == 0) {
                        String strA = com.bilibili.playerbizcommonv2.utils.n.a(jLongValue2);
                        String string = this.this$0.getContext().getString(2131845401, strA);
                        spannableStringBuilder.append((CharSequence) string);
                        spannableStringBuilder.setSpan(VideoDownloadDialog.l(this.this$0), StringsKt.A(string, strA, 0, false, 6), string.length(), 17);
                    } else {
                        String strA2 = com.bilibili.playerbizcommonv2.utils.n.a(jLongValue);
                        String strA3 = com.bilibili.playerbizcommonv2.utils.n.a(jLongValue2);
                        String string2 = this.this$0.getContext().getString(2131847495, strA2, strA3);
                        spannableStringBuilder.append((CharSequence) string2);
                        int iA = StringsKt.A(string2, strA2, 0, false, 6);
                        int iA2 = StringsKt.A(string2, strA3, 0, false, 6);
                        spannableStringBuilder.setSpan(VideoDownloadDialog.l(this.this$0), iA, strA2.length() + iA, 17);
                        spannableStringBuilder.setSpan(VideoDownloadDialog.l(this.this$0), iA2, strA3.length() + iA2, 17);
                    }
                }
                this.$storage.setText(spannableStringBuilder);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(VideoDownloadDialog videoDownloadDialog, TextView textView, Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
            this.this$0 = videoDownloadDialog;
            this.$storage = textView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass14(this.this$0, this.$storage, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                VideoDownloadDialog videoDownloadDialog = this.this$0;
                StateFlow<Pair<Long, Long>> stateFlow = videoDownloadDialog.f82492e.f82550e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(videoDownloadDialog, this.$storage, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $windowSize;
        int label;
        final VideoDownloadDialog this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$onCreate$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadDialog$onCreate$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<WindowSizeClass> $windowSize;
            Object L$0;
            int label;
            final VideoDownloadDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, VideoDownloadDialog videoDownloadDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$windowSize = objectRef;
                this.this$0 = videoDownloadDialog;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                if (!Intrinsics.areEqual(this.$windowSize.element, windowSizeClass)) {
                    this.$windowSize.element = windowSizeClass;
                    VideoDownloadDialog videoDownloadDialog = this.this$0;
                    int i7 = VideoDownloadDialog.f82487n;
                    videoDownloadDialog.m(windowSizeClass);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(VideoDownloadDialog videoDownloadDialog, Ref.ObjectRef<WindowSizeClass> objectRef, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = videoDownloadDialog;
            this.$windowSize = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, this.$windowSize, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f82488a);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$windowSize, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public VideoDownloadDialog(@NotNull ComponentActivity componentActivity, @NotNull List<t.a> list, @NotNull List<k.a> list2, @NotNull List<q.a> list3, @NotNull h hVar, @NotNull InterfaceC5833b interfaceC5833b, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04) {
        super(componentActivity, 2131889095);
        this.f82488a = componentActivity;
        this.f82489b = list;
        this.f82490c = list2;
        this.f82491d = list3;
        this.f82492e = hVar;
        this.f82493f = interfaceC5833b;
        this.f82494g = function0;
        this.h = function02;
        this.f82495i = function03;
        this.f82496j = function04;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView r10, kotlinx.coroutines.flow.StateFlow r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            r0 = r12
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$1
            if (r0 == 0) goto L34
            r0 = r12
            com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$1 r0 = (com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$1) r0
            r14 = r0
            r0 = r14
            int r0 = r0.label
            r13 = r0
            r0 = r13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L34
            r0 = r14
            r1 = r13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r14
            r12 = r0
            goto L40
        L34:
            com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$1 r0 = new com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$1
            r1 = r0
            r2 = r8
            r3 = r12
            r1.<init>(r2, r3)
            r12 = r0
        L40:
            r0 = r12
            java.lang.Object r0 = r0.result
            r15 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r12
            int r0 = r0.label
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L70
            r0 = r13
            r1 = 1
            if (r0 == r1) goto L68
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            goto L96
        L70:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$2 r0 = new com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineDownloadView$2
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r8
            r5 = r11
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r0
            r0 = r12
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r12
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r14
            if (r0 != r1) goto L96
            r0 = r14
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog.j(com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView, kotlinx.coroutines.flow.StateFlow, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView r10, kotlinx.coroutines.flow.StateFlow r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            r0 = r12
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$1
            if (r0 == 0) goto L34
            r0 = r12
            com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$1 r0 = (com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$1) r0
            r14 = r0
            r0 = r14
            int r0 = r0.label
            r13 = r0
            r0 = r13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L34
            r0 = r14
            r1 = r13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r14
            r12 = r0
            goto L40
        L34:
            com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$1 r0 = new com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$1
            r1 = r0
            r2 = r8
            r3 = r12
            r1.<init>(r2, r3)
            r12 = r0
        L40:
            r0 = r12
            java.lang.Object r0 = r0.result
            r15 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r12
            int r0 = r0.label
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L70
            r0 = r13
            r1 = 1
            if (r0 == r1) goto L68
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L68:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            goto L96
        L70:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2 r0 = new com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog$combineSeasonDownloadView$2
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r8
            r5 = r11
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r0
            r0 = r12
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r12
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r14
            if (r0 != r1) goto L96
            r0 = r14
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog.k(com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadDialog, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView, kotlinx.coroutines.flow.StateFlow, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final TextAppearanceSpan l(VideoDownloadDialog videoDownloadDialog) {
        videoDownloadDialog.getClass();
        return new TextAppearanceSpan(null, 0, DimenUtilsKt.dpToPx(10.0f), ColorStateList.valueOf(ThemeUtils.getColorById(videoDownloadDialog.getContext(), R$color.Text1)), null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void m(WindowSizeClass windowSizeClass) throws NoWhenBranchMatchedException {
        this.f82498l = windowSizeClass;
        InterfaceC5833b aVar = this.f82493f;
        int iDpToPx = 0;
        if (!KScreenAdjustUtilsKt.isNormal(windowSizeClass)) {
            int minHeightDp = windowSizeClass.getMinHeightDp();
            aVar = new InterfaceC5833b.a(RangesKt.coerceIn(RangesKt.coerceAtMost(MathKt.roundToInt(minHeightDp * 0.6f), 580) / RangesKt.coerceAtLeast(minHeightDp - DimenUtilsKt.pxToDp(this.f82499m), 1), 0.0f, 1.0f));
            iDpToPx = DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.functionPanelMaxWith$default(windowSizeClass, 0, 1, (Object) null));
        }
        Dr0.h hVar = this.f82497k;
        Dr0.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar2 = null;
        }
        View view = hVar2.f3079n;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (Intrinsics.areEqual(aVar, InterfaceC5833b.C0553b.f83223a)) {
            layoutParams2.dimensionRatio = "w,9:16";
            layoutParams2.matchConstraintPercentHeight = 1.0f;
        } else {
            if (!(aVar instanceof InterfaceC5833b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2.dimensionRatio = null;
            layoutParams2.matchConstraintPercentHeight = 1 - ((InterfaceC5833b.a) aVar).f83222a;
        }
        view.setLayoutParams(layoutParams2);
        Dr0.h hVar3 = this.f82497k;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar3 = null;
        }
        CoordinatorLayout coordinatorLayout = hVar3.f3071e;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = iDpToPx;
        coordinatorLayout.setLayoutParams(layoutParams3);
        StringBuilder sb = new StringBuilder("setContentHeightAndWidth, windowSize=");
        sb.append(windowSizeClass);
        sb.append(" maxWidth=");
        Z.b(iDpToPx, "VideoDownloadDialog", sb);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(@Nullable Bundle bundle) throws NoWhenBranchMatchedException {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
            setCanceledOnTouchOutside(true);
            WindowCompat.setDecorFitsSystemWindows(window, false);
            window.setNavigationBarColor(0);
            window.setStatusBarColor(0);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dr0.h hVarInflate = Dr0.h.inflate(getLayoutInflater());
        this.f82497k = hVarInflate;
        Dr0.h hVar = hVarInflate;
        if (hVarInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar = null;
        }
        ConstraintLayout constraintLayout = hVar.f3067a;
        InterfaceC5833b interfaceC5833b = this.f82493f;
        Dr0.h hVar2 = this.f82497k;
        Dr0.h hVar3 = hVar2;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar3 = null;
        }
        View view = hVar3.f3079n;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (Intrinsics.areEqual(interfaceC5833b, InterfaceC5833b.C0553b.f83223a)) {
            layoutParams2.dimensionRatio = "w,9:16";
            layoutParams2.matchConstraintPercentHeight = 1.0f;
        } else {
            if (!(interfaceC5833b instanceof InterfaceC5833b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2.matchConstraintPercentHeight = 1 - ((InterfaceC5833b.a) interfaceC5833b).f83222a;
        }
        view.setLayoutParams(layoutParams2);
        setContentView(constraintLayout);
        constraintLayout.setOnClickListener(new Gf1.d(this, 1));
        Dr0.h hVar4 = this.f82497k;
        Dr0.h hVar5 = hVar4;
        if (hVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar5 = null;
        }
        LinearLayout linearLayout = hVar5.f3072f;
        linearLayout.setBackground(com.bilibili.playerbizcommonv2.utils.p.o(ContextCompat.getColor(getContext(), R$color.Bg2), 12));
        linearLayout.setOnClickListener(new Object());
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        if (layoutParams3 instanceof CoordinatorLayout.LayoutParams) {
            BottomSheetBehavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams3).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                BottomSheetBehavior bottomSheetBehavior = behavior;
                bottomSheetBehavior.setSkipCollapsed(true);
                bottomSheetBehavior.setState(3);
                bottomSheetBehavior.addBottomSheetCallback(new g(this));
            }
        }
        Dr0.h hVar6 = this.f82497k;
        Dr0.h hVar7 = hVar6;
        if (hVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar7 = null;
        }
        TextView textView = hVar7.f3081p;
        Dr0.h hVar8 = this.f82497k;
        Dr0.h hVar9 = hVar8;
        if (hVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar9 = null;
        }
        ImageView imageView = hVar9.f3080o;
        textView.setOnClickListener(new ZH0.a(this, 1));
        imageView.setOnClickListener(new ZH0.b(this, 1));
        Dr0.h hVar10 = this.f82497k;
        Dr0.h hVar11 = hVar10;
        if (hVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar11 = null;
        }
        TextView textView2 = hVar11.f3069c;
        Dr0.h hVar12 = this.f82497k;
        Dr0.h hVar13 = hVar12;
        if (hVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar13 = null;
        }
        ImageView imageView2 = hVar13.f3068b;
        textView2.setOnClickListener(new Qt0.a(this, 1));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.playerbizcommonv2.widget.dowanload.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoDownloadDialog f82529a;

            {
                this.f82529a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f82529a.h.invoke();
            }
        });
        Dr0.h hVar14 = this.f82497k;
        Dr0.h hVar15 = hVar14;
        if (hVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar15 = null;
        }
        hVar15.f3073g.setOnClickListener(new r1(this, 1));
        Dr0.h hVar16 = this.f82497k;
        Dr0.h hVar17 = hVar16;
        if (hVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar17 = null;
        }
        hVar17.f3074i.setOnClickListener(new TQ0.d(this, 2));
        Dr0.h hVar18 = this.f82497k;
        Dr0.h hVar19 = hVar18;
        if (hVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar19 = null;
        }
        TextView textView3 = hVar19.f3077l;
        Dr0.h hVar20 = this.f82497k;
        Dr0.h hVar21 = hVar20;
        if (hVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar21 = null;
        }
        ImageView imageView3 = hVar21.h;
        Dr0.h hVar22 = this.f82497k;
        Dr0.h hVar23 = hVar22;
        if (hVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar23 = null;
        }
        final ConstraintLayout constraintLayout2 = hVar23.f3070d;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.f82488a);
        objectRef.element = windowSizeClassWindowSize;
        m(windowSizeClassWindowSize);
        Dr0.h hVar24 = this.f82497k;
        Dr0.h hVar25 = hVar24;
        if (hVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogBinding");
            hVar25 = null;
        }
        final ConstraintLayout constraintLayout3 = hVar25.f3067a;
        ViewCompat.setOnApplyWindowInsetsListener(constraintLayout3, new OnApplyWindowInsetsListener(this, constraintLayout3, constraintLayout2) { // from class: com.bilibili.playerbizcommonv2.widget.dowanload.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoDownloadDialog f82530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ConstraintLayout f82531b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ConstraintLayout f82532c;

            {
                this.f82530a = this;
                this.f82531b = constraintLayout3;
                this.f82532c = constraintLayout2;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) throws NoWhenBranchMatchedException {
                WindowSizeClass windowSizeClass;
                ConstraintLayout constraintLayout4 = this.f82532c;
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
                boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
                int i7 = insets.top;
                VideoDownloadDialog videoDownloadDialog = this.f82530a;
                boolean z6 = videoDownloadDialog.f82499m != i7;
                videoDownloadDialog.f82499m = i7;
                BLog.i("VideoDownloadDialog", "windowInsets - systemBars: " + insets + ", ime: " + insets2 + ", imeVisible: " + zIsVisible);
                ConstraintLayout constraintLayout5 = this.f82531b;
                constraintLayout5.setPadding(constraintLayout5.getPaddingLeft(), insets.top, constraintLayout5.getPaddingRight(), constraintLayout5.getPaddingBottom());
                constraintLayout4.setPadding(constraintLayout4.getPaddingLeft(), constraintLayout4.getPaddingTop(), constraintLayout4.getPaddingRight(), zIsVisible ? insets2.bottom : insets.bottom);
                if (z6 && (windowSizeClass = videoDownloadDialog.f82498l) != null) {
                    videoDownloadDialog.m(windowSizeClass);
                }
                return windowInsetsCompat;
            }
        });
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, objectRef, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass11(this, textView, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass12(this, textView2, imageView2, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass13(imageView3, this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass14(this, textView3, null), 3, (Object) null);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.5f);
            }
        }
    }
}

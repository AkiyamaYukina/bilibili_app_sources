package com.bilibili.ship.theseus.playlist.uicomponent;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.runtime.C4277b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.playlist.uicomponent.C6257f;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3.class */
final class PlaylistFloatingUIComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ConstraintLayout $root;
    final Pu0.b $titleLayout;
    private Object L$0;
    int label;
    final C6257f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.b $titleLayout;
        int label;
        final C6257f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$1$1.class */
        public static final class C08021 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final C6257f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08021(C6257f c6257f, Continuation<? super C08021> continuation) {
                super(2, continuation);
                this.this$0 = c6257f;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08021(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f96034b.invoke();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Pu0.b bVar, C6257f c6257f, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$titleLayout = bVar;
            this.this$0 = c6257f;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$titleLayout, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$titleLayout.f19303a);
                C08021 c08021 = new C08021(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c08021, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Pu0.b $titleLayout;
        int label;
        final C6257f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6257f.a.C0804a, Continuation<? super Unit>, Object> {
            final Pu0.b $titleLayout;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Pu0.b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$titleLayout = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$titleLayout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6257f.a.C0804a c0804a, Continuation<? super Unit> continuation) {
                return create(c0804a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6257f.a.C0804a c0804a = (C6257f.a.C0804a) this.L$0;
                this.$titleLayout.f19306d.setText(c0804a.f96038a);
                int i7 = 0;
                String str = c0804a.f96039b;
                if (str == null || str.length() == 0) {
                    this.$titleLayout.f19307e.setVisibility(8);
                } else {
                    this.$titleLayout.f19307e.setText(str);
                    this.$titleLayout.f19307e.setVisibility(0);
                }
                TintTextView tintTextView = this.$titleLayout.f19308f;
                if (!c0804a.f96042e) {
                    i7 = 8;
                }
                tintTextView.setVisibility(i7);
                this.$titleLayout.f19308f.setText(C4277b.a(c0804a.f96040c, "个视频", new StringBuilder()));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6257f c6257f, Pu0.b bVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c6257f;
            this.$titleLayout = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$titleLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<C6257f.a.C0804a> flow = this.this$0.f96033a.f96035a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$titleLayout, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        final Pu0.b $titleLayout;
        int label;
        final C6257f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            final Pu0.b $titleLayout;
            boolean Z$0;
            int label;
            final C6257f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6257f c6257f, ConstraintLayout constraintLayout, Pu0.b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c6257f;
                this.$root = constraintLayout;
                this.$titleLayout = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$root, this.$titleLayout, continuation);
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
                Object objA;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        C6257f c6257f = this.this$0;
                        ConstraintLayout constraintLayout = this.$root;
                        LottieAnimationView lottieAnimationView = this.$titleLayout.f19305c;
                        this.label = 1;
                        int i8 = C6257f.f96032c;
                        c6257f.getClass();
                        constraintLayout.setVisibility(0);
                        lottieAnimationView.playAnimation();
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, "translationY", NewPlayerUtilsKt.toFloatPx(92.0f), 0.0f);
                        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                        objectAnimatorOfFloat.setDuration(200L);
                        Object objA2 = Bj0.c.a(objectAnimatorOfFloat, true, this);
                        if (objA2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objA2 = Unit.INSTANCE;
                        }
                        if (objA2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        C6257f c6257f2 = this.this$0;
                        ConstraintLayout constraintLayout2 = this.$root;
                        LottieAnimationView lottieAnimationView2 = this.$titleLayout.f19305c;
                        this.label = 2;
                        int i9 = C6257f.f96032c;
                        c6257f2.getClass();
                        if (constraintLayout2.getVisibility() == 8) {
                            objA = Unit.INSTANCE;
                        } else {
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(constraintLayout2, "translationY", 0.0f, NewPlayerUtilsKt.toFloatPx(92.0f));
                            objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
                            objectAnimatorOfFloat2.setDuration(200L);
                            objectAnimatorOfFloat2.addListener(new C6259h(constraintLayout2, lottieAnimationView2));
                            objA = Bj0.c.a(objectAnimatorOfFloat2, true, this);
                            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objA = Unit.INSTANCE;
                            }
                        }
                        if (objA == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C6257f c6257f, ConstraintLayout constraintLayout, Pu0.b bVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c6257f;
            this.$root = constraintLayout;
            this.$titleLayout = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$root, this.$titleLayout, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6257f c6257f = this.this$0;
                Flow<Boolean> flow = c6257f.f96033a.f96036b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c6257f, this.$root, this.$titleLayout, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConstraintLayout constraintLayout, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$root = constraintLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(Ref.ObjectRef objectRef, ConstraintLayout constraintLayout, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            Integer num;
            Object obj = objectRef.element;
            if (obj != null && ((num = (Integer) obj) == null || i10 != num.intValue())) {
                constraintLayout.requestLayout();
            }
            objectRef.element = Integer.valueOf(i10);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$root, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ViewParent parent = this.$root.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final ConstraintLayout constraintLayout = this.$root;
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener(objectRef, constraintLayout) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef f96043a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ConstraintLayout f96044b;

                {
                    this.f96043a = objectRef;
                    this.f96044b = constraintLayout;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                    PlaylistFloatingUIComponent$bind$3.AnonymousClass4.invokeSuspend$lambda$0(this.f96043a, this.f96044b, view, i7, i8, i9, i10, i11, i12, i13, i14);
                }
            };
            if (viewGroup != null) {
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistFloatingUIComponent$bind$3$4$invokeSuspend$$inlined$awaitCancel$1(null, viewGroup, onLayoutChangeListener), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final C6257f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistFloatingUIComponent$bind$3$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistFloatingUIComponent$bind$3$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$root, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                if (i7 <= 0) {
                    return Unit.INSTANCE;
                }
                BLog.d("float collect container height: " + i7);
                ConstraintLayout constraintLayout = this.$root;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = i7;
                constraintLayout.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C6257f c6257f, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = c6257f;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = this.this$0.f96033a.f96037c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$root, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFloatingUIComponent$bind$3(Pu0.b bVar, C6257f c6257f, ConstraintLayout constraintLayout, Continuation<? super PlaylistFloatingUIComponent$bind$3> continuation) {
        super(2, continuation);
        this.$titleLayout = bVar;
        this.this$0 = c6257f;
        this.$root = constraintLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistFloatingUIComponent$bind$3 playlistFloatingUIComponent$bind$3 = new PlaylistFloatingUIComponent$bind$3(this.$titleLayout, this.this$0, this.$root, continuation);
        playlistFloatingUIComponent$bind$3.L$0 = obj;
        return playlistFloatingUIComponent$bind$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$titleLayout, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$titleLayout, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$root, this.$titleLayout, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$root, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$root, null), 3, (Object) null);
    }
}

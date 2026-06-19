package com.bilibili.ship.theseus.united.page.floatlayer.centersheet;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.utils.p;
import dv0.C6859d;
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
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/centersheet/TheseusCenterSheetComponent$bind$2.class */
final class TheseusCenterSheetComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6859d $binding;
    private Object L$0;
    int label;
    final b<Fragment> this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.centersheet.TheseusCenterSheetComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/centersheet/TheseusCenterSheetComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        int label;
        final b<Fragment> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b<Fragment> bVar, Fragment fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$fragment = fragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$fragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f99735a.beginTransaction().replace(2131318044, this.$fragment).addToBackStack("more_setting").commitAllowingStateLoss();
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                if (!this.this$0.f99735a.isStateSaved()) {
                    this.this$0.f99735a.popBackStack("more_setting", 1);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCenterSheetComponent$bind$2(C6859d c6859d, b<Fragment> bVar, Continuation<? super TheseusCenterSheetComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = c6859d;
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusCenterSheetComponent$bind$2 theseusCenterSheetComponent$bind$2 = new TheseusCenterSheetComponent$bind$2(this.$binding, this.this$0, continuation);
        theseusCenterSheetComponent$bind$2.L$0 = obj;
        return theseusCenterSheetComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Context context = this.$binding.f116934a.getContext();
        C6859d c6859d = this.$binding;
        ConstraintLayout constraintLayout = c6859d.f116937d;
        View view = c6859d.f116938e;
        FrameLayout frameLayout = c6859d.f116936c;
        ImageView imageView = c6859d.f116935b;
        Fragment fragmentInstantiate = this.this$0.f99735a.getFragmentFactory().instantiate(this.this$0.f99736b.getClassLoader(), this.this$0.f99736b.getName());
        Bundle bundle = new Bundle();
        bundle.putBoolean("dialog", true);
        fragmentInstantiate.setArguments(bundle);
        Animation animation = null;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, fragmentInstantiate, null), 3, (Object) null);
        frameLayout.setBackground(p.f(ContextCompat.getColor(context, R$color.Bg2), 0.0f, 12, 0));
        imageView.setBackground(p.f(p.c(context, R$color.Graph_icon, 0.3f), 0.0f, 18, 0));
        Animation animation2 = this.this$0.f99738d;
        if (animation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowAnimation");
        } else {
            animation = animation2;
        }
        view.startAnimation(animation);
        constraintLayout.setOnClickListener(new Object());
        return Unit.INSTANCE;
    }
}

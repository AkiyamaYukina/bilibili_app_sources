package com.bilibili.teenagersmode.osteen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comm.restrict.OSTeensTransPageType;
import com.bilibili.app.comm.restrict.utils.TeenagersModeKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/OSTeensParentControlRedirectActivity.class */
@StabilityInferred(parameters = 0)
public final class OSTeensParentControlRedirectActivity extends com.bilibili.lib.spy.generated.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f110578y = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final f f110579x = new ActivityResultContract();

    /* JADX INFO: renamed from: com.bilibili.teenagersmode.osteen.OSTeensParentControlRedirectActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/OSTeensParentControlRedirectActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final OSTeensTransPageType $pageType;
        int label;
        final OSTeensParentControlRedirectActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.teenagersmode.osteen.OSTeensParentControlRedirectActivity$onCreate$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/osteen/OSTeensParentControlRedirectActivity$onCreate$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f110580a;

            static {
                int[] iArr = new int[OSTeensTransPageType.values().length];
                try {
                    iArr[OSTeensTransPageType.INTERCEPT.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[OSTeensTransPageType.LOGOUT.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[OSTeensTransPageType.LOGIN.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[OSTeensTransPageType.CLOSE.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[OSTeensTransPageType.DEFAULT.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[OSTeensTransPageType.CHANGE_AGE.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                f110580a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OSTeensTransPageType oSTeensTransPageType, OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pageType = oSTeensTransPageType;
            this.this$0 = oSTeensParentControlRedirectActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$pageType, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = true;
                switch (a.f110580a[this.$pageType.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                    case 3:
                        OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity = this.this$0;
                        OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1 oSTeensParentControlRedirectActivity$onCreate$1$toFinish$1 = new OSTeensParentControlRedirectActivity$onCreate$1$toFinish$1(oSTeensParentControlRedirectActivity, null);
                        this.label = 1;
                        Object objQ6 = OSTeensParentControlRedirectActivity.Q6(oSTeensParentControlRedirectActivity, oSTeensParentControlRedirectActivity$onCreate$1$toFinish$1, this);
                        obj = objQ6;
                        if (objQ6 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        break;
                    case 4:
                        OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity2 = this.this$0;
                        OSTeensParentControlRedirectActivity$onCreate$1$toFinish$2 oSTeensParentControlRedirectActivity$onCreate$1$toFinish$2 = new OSTeensParentControlRedirectActivity$onCreate$1$toFinish$2(oSTeensParentControlRedirectActivity2, null);
                        this.label = 2;
                        Object objQ62 = OSTeensParentControlRedirectActivity.Q6(oSTeensParentControlRedirectActivity2, oSTeensParentControlRedirectActivity$onCreate$1$toFinish$2, this);
                        obj = objQ62;
                        if (objQ62 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        break;
                    case 5:
                    case 6:
                        OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity3 = this.this$0;
                        int i8 = OSTeensParentControlRedirectActivity.f110578y;
                        oSTeensParentControlRedirectActivity3.getClass();
                        Intent intent = new Intent("com.android.action.PARENTAL_CHILD_MANAGEMENT");
                        zBooleanValue = true;
                        if (oSTeensParentControlRedirectActivity3.getPackageManager().resolveActivity(intent, 0) != null) {
                            oSTeensParentControlRedirectActivity3.startActivity(intent);
                            zBooleanValue = true;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else if (i7 == 1) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            if (zBooleanValue) {
                this.this$0.finish();
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object Q6(OSTeensParentControlRedirectActivity oSTeensParentControlRedirectActivity, Function1 function1, Continuation continuation) {
        return oSTeensParentControlRedirectActivity.P6(new OSTeensParentControlRedirectActivity$authTo$2(oSTeensParentControlRedirectActivity, null), new OSTeensParentControlRedirectActivity$authTo$3(null), function1, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P6(kotlin.jvm.functions.Function2 r6, kotlin.jvm.functions.Function1 r7, kotlin.jvm.functions.Function1 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.osteen.OSTeensParentControlRedirectActivity.P6(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        OSTeensTransPageType.a aVar = OSTeensTransPageType.Companion;
        String stringExtra = getIntent().getStringExtra("page_type");
        Integer intOrNull = stringExtra != null ? StringsKt.toIntOrNull(stringExtra) : null;
        aVar.getClass();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(OSTeensTransPageType.a.a(intOrNull), this, null), 3, (Object) null);
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (TeenagersModeKt.d()) {
            return;
        }
        setResult(-1);
        finish();
    }
}

package com.bilibili.lib.router.compat;

import T40.j;
import com.bilibili.lib.brouter.api.BRouterComponent;
import com.bilibili.lib.brouter.api.FunctionWrapper;
import com.bilibili.lib.brouter.api.HandlerFactoryContext;
import com.bilibili.lib.brouter.api.RouteTarget;
import com.bilibili.lib.brouter.api.RouteTargetHandler;
import com.bilibili.lib.brouter.api.internal.base.TypedRouteHandlerFactory;
import com.bilibili.lib.gripper.api.InComponent;
import com.bilibili.lib.gripper.api.IsRaw;
import com.bilibili.lib.gripper.api.Producer;
import com.bilibili.lib.router.Action;
import com.bilibili.lib.router.RouteParams;
import df0.C6811b;
import javax.inject.Named;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClasses;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/compat/b.class */
public final class b implements TypedRouteHandlerFactory {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public final RouteTargetHandler<?> create(@NotNull HandlerFactoryContext handlerFactoryContext, @NotNull KType kType) throws NoWhenBranchMatchedException {
        Function1 actionLauncherKt$handleAction$f$1;
        boolean zAreEqual = Intrinsics.areEqual(kType, Reflection.typeOf(j.class));
        C6811b c6811b = null;
        if (zAreEqual) {
            RouteTarget.KClassTarget target = handlerFactoryContext.getRoute().getTarget();
            if (target instanceof RouteTarget.KClassTarget) {
                KClass kClassInvoke = target.invoke();
                c6811b = null;
                if (KClasses.isSubclassOf(kClassInvoke, Reflection.getOrCreateKotlinClass(Action.class))) {
                    actionLauncherKt$handleAction$f$1 = new ActionLauncherKt$handleAction$f$1((Action) JvmClassMappingKt.getJavaClass(kClassInvoke).newInstance());
                }
            } else {
                if (!(target instanceof RouteTarget.FunctionTarget)) {
                    throw new NoWhenBranchMatchedException();
                }
                FunctionWrapper functionWrapperInvoke = ((RouteTarget.FunctionTarget) target).invoke();
                KTypeProjection.Companion companion = KTypeProjection.Companion;
                Function1 function1AsFunction = functionWrapperInvoke.asFunction(Reflection.typeOf(Function1.class, companion.invariant(Reflection.typeOf(RouteParams.class)), companion.invariant(Reflection.nullableTypeOf(Object.class))));
                actionLauncherKt$handleAction$f$1 = function1AsFunction;
                c6811b = function1AsFunction == null ? null : new C6811b(actionLauncherKt$handleAction$f$1);
            }
        }
        return c6811b;
    }

    @NotNull
    public final String getRouteType() {
        return "action";
    }

    @Named("action")
    @IsRaw
    @NotNull
    @InComponent(BRouterComponent.class)
    @Producer
    public final TypedRouteHandlerFactory provide() {
        return this;
    }
}

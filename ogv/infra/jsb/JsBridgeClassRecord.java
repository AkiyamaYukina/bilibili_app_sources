package com.bilibili.ogv.infra.jsb;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;
import javax.inject.Named;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/jsb/JsBridgeClassRecord.class */
public final class JsBridgeClassRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Function2<Object, JSONObject, JsonElement>> f67869a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Function3<Object, JSONObject, Continuation<? super JsonElement>, Object>> f67870b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashSet<String> f67871c = new HashSet<>();

    public JsBridgeClassRecord(@NotNull Class<?> cls) {
        for (final Method method : cls.getMethods()) {
            if (!method.isSynthetic() && !Intrinsics.areEqual(method.getDeclaringClass(), Object.class)) {
                this.f67871c.add(method.getName());
                boolean zAreEqual = Intrinsics.areEqual(ArraysKt.lastOrNull(method.getParameterTypes()), Continuation.class);
                final int length = method.getParameterTypes().length - (zAreEqual ? 1 : 0);
                String name = method.getName();
                if (zAreEqual) {
                    this.f67870b.put(name, new JsBridgeClassRecord$1$1(method, length, null));
                } else {
                    this.f67869a.put(name, new Function2(length, method) { // from class: com.bilibili.ogv.infra.jsb.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Method f67872a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final int f67873b;

                        {
                            this.f67872a = method;
                            this.f67873b = length;
                        }

                        public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
                            Method method2 = this.f67872a;
                            Object[] objArrA = JsBridgeClassRecord.a(this.f67873b, method2, (JSONObject) obj2);
                            Object objInvoke = method2.invoke(obj, Arrays.copyOf(objArrA, objArrA.length));
                            return (objInvoke == null || Intrinsics.areEqual(objInvoke, Unit.INSTANCE) || (objInvoke instanceof JsonNull)) ? null : objInvoke instanceof JsonElement ? (JsonElement) objInvoke : JsonUtilKt.toJsonTree(objInvoke);
                        }
                    });
                }
            }
        }
    }

    public static final Object[] a(int i7, Method method, JSONObject jSONObject) {
        JsonObject jsonObject;
        Object[] objArr = new Object[i7];
        JsonObject jsonObjectA = a.a(jSONObject);
        JsonObject jsonObject2 = jsonObjectA instanceof JsonObject ? jsonObjectA : null;
        JsonObject jsonObject3 = jsonObject2;
        if (jsonObject2 == null) {
            jsonObject3 = new JsonObject();
        }
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (int i8 = 0; i8 < i7; i8++) {
            Type type = method.getGenericParameterTypes()[i8];
            Annotation[] annotationArr = parameterAnnotations[i8];
            Annotation[] annotationArr2 = annotationArr;
            if (annotationArr == null) {
                annotationArr2 = new Annotation[0];
            }
            int length = annotationArr2.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    for (Annotation annotation : annotationArr2) {
                        if (annotation instanceof Named) {
                            JsonObject jsonObject4 = jsonObject3.get(((Named) annotation).value());
                            jsonObject = jsonObject4;
                            if (jsonObject4 == null) {
                                jsonObject = JsonNull.INSTANCE;
                            }
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                if (annotationArr2[i9] instanceof BundledJsbParam) {
                    jsonObject = jsonObject3;
                    break;
                }
                i9++;
            }
            objArr[i8] = JsonUtilKt.parseJson((JsonElement) jsonObject, type);
        }
        return objArr;
    }
}
